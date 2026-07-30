package com.facebook.login;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphRequestAsyncTask;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.gamingservices.internal.TournamentShareDialogURIBuilder;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.SmartLoginOption;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.facebook.login.DeviceAuthDialog;
import com.facebook.login.LoginClient;
import defpackage.ja0;
import defpackage.k3;
import defpackage.ka0;
import defpackage.kr0;
import defpackage.la0;
import defpackage.n1;
import defpackage.ta0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class DeviceAuthDialog extends ta0 {
    private static final int LOGIN_ERROR_SUBCODE_AUTHORIZATION_DECLINED = 1349173;
    private static final int LOGIN_ERROR_SUBCODE_CODE_EXPIRED = 1349152;
    private static final int LOGIN_ERROR_SUBCODE_EXCESSIVE_POLLING = 1349172;
    private static final String REQUEST_STATE_KEY = "request_state";
    private final AtomicBoolean completed = new AtomicBoolean();
    private TextView confirmationCode;
    private volatile GraphRequestAsyncTask currentGraphRequestPoll;
    private volatile RequestState currentRequestState;
    private DeviceAuthMethodHandler deviceAuthMethodHandler;
    private TextView instructions;
    private boolean isBeingDestroyed;
    private boolean isRetry;
    private View progressBar;
    private LoginClient.Request request;
    private volatile ScheduledFuture<?> scheduledPoll;
    public static final Companion Companion = new Companion(null);
    private static final String DEVICE_LOGIN_ENDPOINT = "device/login";
    private static final String DEVICE_LOGIN_STATUS_ENDPOINT = "device/login_status";
    private static final int LOGIN_ERROR_SUBCODE_AUTHORIZATION_PENDING = 1349174;

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class PermissionsLists {
        private List<String> declinedPermissions;
        private List<String> expiredPermissions;
        private List<String> grantedPermissions;

        public PermissionsLists(List<String> list, List<String> list2, List<String> list3) {
            list.getClass();
            list2.getClass();
            list3.getClass();
            this.grantedPermissions = list;
            this.declinedPermissions = list2;
            this.expiredPermissions = list3;
        }

        public final List<String> getDeclinedPermissions() {
            return this.declinedPermissions;
        }

        public final List<String> getExpiredPermissions() {
            return this.expiredPermissions;
        }

        public final List<String> getGrantedPermissions() {
            return this.grantedPermissions;
        }

        public final void setDeclinedPermissions(List<String> list) {
            list.getClass();
            this.declinedPermissions = list;
        }

        public final void setExpiredPermissions(List<String> list) {
            list.getClass();
            this.expiredPermissions = list;
        }

        public final void setGrantedPermissions(List<String> list) {
            list.getClass();
            this.grantedPermissions = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _get_pollRequest_$lambda$5(DeviceAuthDialog deviceAuthDialog, GraphResponse graphResponse) {
        FacebookException facebookException;
        deviceAuthDialog.getClass();
        graphResponse.getClass();
        if (deviceAuthDialog.completed.get()) {
            return;
        }
        FacebookRequestError error = graphResponse.getError();
        if (error == null) {
            try {
                JSONObject jSONObject = graphResponse.getJSONObject();
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                String string = jSONObject.getString("access_token");
                string.getClass();
                deviceAuthDialog.onSuccess(string, jSONObject.getLong(AccessToken.EXPIRES_IN_KEY), Long.valueOf(jSONObject.optLong(AccessToken.DATA_ACCESS_EXPIRATION_TIME)));
                return;
            } catch (JSONException e) {
                deviceAuthDialog.onError(new FacebookException(e));
                return;
            }
        }
        int subErrorCode = error.getSubErrorCode();
        if (subErrorCode == LOGIN_ERROR_SUBCODE_AUTHORIZATION_PENDING || subErrorCode == LOGIN_ERROR_SUBCODE_EXCESSIVE_POLLING) {
            deviceAuthDialog.schedulePoll();
            return;
        }
        if (subErrorCode == LOGIN_ERROR_SUBCODE_CODE_EXPIRED) {
            RequestState requestState = deviceAuthDialog.currentRequestState;
            if (requestState != null) {
                DeviceRequestsHelper.cleanUpAdvertisementService(requestState.getUserCode());
            }
            LoginClient.Request request = deviceAuthDialog.request;
            if (request != null) {
                deviceAuthDialog.startLogin(request);
                return;
            } else {
                deviceAuthDialog.onCancel();
                return;
            }
        }
        if (subErrorCode == LOGIN_ERROR_SUBCODE_AUTHORIZATION_DECLINED) {
            deviceAuthDialog.onCancel();
            return;
        }
        FacebookRequestError error2 = graphResponse.getError();
        if (error2 == null || (facebookException = error2.getException()) == null) {
            facebookException = new FacebookException();
        }
        deviceAuthDialog.onError(facebookException);
    }

    private final void completeLogin(String str, PermissionsLists permissionsLists, String str2, Date date, Date date2) {
        DeviceAuthMethodHandler deviceAuthMethodHandler = this.deviceAuthMethodHandler;
        if (deviceAuthMethodHandler != null) {
            deviceAuthMethodHandler.onSuccess(str2, FacebookSdk.getApplicationId(), str, permissionsLists.getGrantedPermissions(), permissionsLists.getDeclinedPermissions(), permissionsLists.getExpiredPermissions(), AccessTokenSource.DEVICE_AUTH, date, null, date2);
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    private final GraphRequest getPollRequest() {
        Bundle bundle = new Bundle();
        RequestState requestState = this.currentRequestState;
        bundle.putString("code", requestState != null ? requestState.getRequestCode() : null);
        bundle.putString("access_token", getApplicationAccessToken());
        return GraphRequest.Companion.newPostRequestWithBundle(null, DEVICE_LOGIN_STATUS_ENDPOINT, bundle, new la0(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initializeContentView$lambda$2(DeviceAuthDialog deviceAuthDialog, View view) {
        deviceAuthDialog.getClass();
        deviceAuthDialog.onCancel();
    }

    private final void onSuccess(String str, long j, Long l) {
        Date date;
        Bundle bundle = new Bundle();
        bundle.putString(GraphRequest.FIELDS_PARAM, "id,permissions,name");
        Date date2 = null;
        if (j != 0) {
            date = new Date((j * 1000) + new Date().getTime());
        } else {
            date = null;
        }
        if ((l == null || l.longValue() != 0) && l != null) {
            date2 = new Date(l.longValue() * 1000);
        }
        Date date3 = date2;
        Date date4 = date;
        GraphRequest newGraphPathRequest = GraphRequest.Companion.newGraphPathRequest(new AccessToken(str, FacebookSdk.getApplicationId(), AppEventsConstants.EVENT_PARAM_VALUE_NO, null, null, null, null, date4, null, date3, null, 1024, null), TournamentShareDialogURIBuilder.me, new n1(this, str, date4, date3, 2));
        newGraphPathRequest.setHttpMethod(HttpMethod.GET);
        newGraphPathRequest.setParameters(bundle);
        newGraphPathRequest.executeAsync();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSuccess$lambda$10(DeviceAuthDialog deviceAuthDialog, String str, Date date, Date date2, GraphResponse graphResponse) {
        DeviceAuthDialog deviceAuthDialog2;
        JSONException jSONException;
        EnumSet<SmartLoginOption> smartLoginOptions;
        deviceAuthDialog.getClass();
        str.getClass();
        graphResponse.getClass();
        if (deviceAuthDialog.completed.get()) {
            return;
        }
        FacebookRequestError error = graphResponse.getError();
        if (error != null) {
            FacebookException exception = error.getException();
            if (exception == null) {
                exception = new FacebookException();
            }
            deviceAuthDialog.onError(exception);
            return;
        }
        try {
            JSONObject jSONObject = graphResponse.getJSONObject();
            if (jSONObject == null) {
                try {
                    jSONObject = new JSONObject();
                } catch (JSONException e) {
                    jSONException = e;
                    deviceAuthDialog2 = deviceAuthDialog;
                    deviceAuthDialog2.onError(new FacebookException(jSONException));
                    return;
                }
            }
            String string = jSONObject.getString("id");
            string.getClass();
            PermissionsLists handlePermissionResponse = Companion.handlePermissionResponse(jSONObject);
            String string2 = jSONObject.getString("name");
            string2.getClass();
            RequestState requestState = deviceAuthDialog.currentRequestState;
            if (requestState != null) {
                DeviceRequestsHelper.cleanUpAdvertisementService(requestState.getUserCode());
            }
            FetchedAppSettings appSettingsWithoutQuery = FetchedAppSettingsManager.getAppSettingsWithoutQuery(FacebookSdk.getApplicationId());
            if (!Intrinsics.b((appSettingsWithoutQuery == null || (smartLoginOptions = appSettingsWithoutQuery.getSmartLoginOptions()) == null) ? null : Boolean.valueOf(smartLoginOptions.contains(SmartLoginOption.RequireConfirm)), Boolean.TRUE) || deviceAuthDialog.isRetry) {
                deviceAuthDialog.completeLogin(string, handlePermissionResponse, str, date, date2);
            } else {
                deviceAuthDialog.isRetry = true;
                deviceAuthDialog.presentConfirmation(string, handlePermissionResponse, str, string2, date, date2);
            }
        } catch (JSONException e2) {
            deviceAuthDialog2 = deviceAuthDialog;
            jSONException = e2;
        }
    }

    private final void poll() {
        RequestState requestState = this.currentRequestState;
        if (requestState != null) {
            requestState.setLastPoll(new Date().getTime());
        }
        this.currentGraphRequestPoll = getPollRequest().executeAsync();
    }

    private final void presentConfirmation(final String str, final PermissionsLists permissionsLists, final String str2, String str3, final Date date, final Date date2) {
        String string = getResources().getString(com.facebook.common.R.string.com_facebook_smart_login_confirmation_title);
        string.getClass();
        String string2 = getResources().getString(com.facebook.common.R.string.com_facebook_smart_login_confirmation_continue_as);
        string2.getClass();
        String string3 = getResources().getString(com.facebook.common.R.string.com_facebook_smart_login_confirmation_cancel);
        string3.getClass();
        String format = String.format(string2, Arrays.copyOf(new Object[]{str3}, 1));
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setMessage(string).setCancelable(true).setNegativeButton(format, new DialogInterface.OnClickListener() { // from class: com.facebook.login.a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                DeviceAuthDialog.presentConfirmation$lambda$6(DeviceAuthDialog.this, str, permissionsLists, str2, date, date2, dialogInterface, i);
            }
        }).setPositiveButton(string3, new ka0(0, this));
        builder.create().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void presentConfirmation$lambda$6(DeviceAuthDialog deviceAuthDialog, String str, PermissionsLists permissionsLists, String str2, Date date, Date date2, DialogInterface dialogInterface, int i) {
        deviceAuthDialog.getClass();
        str.getClass();
        permissionsLists.getClass();
        str2.getClass();
        deviceAuthDialog.completeLogin(str, permissionsLists, str2, date, date2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void presentConfirmation$lambda$8(DeviceAuthDialog deviceAuthDialog, DialogInterface dialogInterface, int i) {
        deviceAuthDialog.getClass();
        View initializeContentView = deviceAuthDialog.initializeContentView(false);
        Dialog dialog = deviceAuthDialog.getDialog();
        if (dialog != null) {
            dialog.setContentView(initializeContentView);
        }
        LoginClient.Request request = deviceAuthDialog.request;
        if (request != null) {
            deviceAuthDialog.startLogin(request);
        }
    }

    private final void schedulePoll() {
        RequestState requestState = this.currentRequestState;
        Long valueOf = requestState != null ? Long.valueOf(requestState.getInterval()) : null;
        if (valueOf != null) {
            this.scheduledPoll = DeviceAuthMethodHandler.Companion.getBackgroundExecutor().schedule(new k3(11, this), valueOf.longValue(), TimeUnit.SECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void schedulePoll$lambda$3(DeviceAuthDialog deviceAuthDialog) {
        deviceAuthDialog.getClass();
        deviceAuthDialog.poll();
    }

    private final void setCurrentRequestState(RequestState requestState) {
        this.currentRequestState = requestState;
        TextView textView = this.confirmationCode;
        if (textView == null) {
            Intrinsics.f("confirmationCode");
            throw null;
        }
        textView.setText(requestState.getUserCode());
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), DeviceRequestsHelper.generateQRCode(requestState.getAuthorizationUri()));
        TextView textView2 = this.instructions;
        if (textView2 == null) {
            Intrinsics.f("instructions");
            throw null;
        }
        textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, bitmapDrawable, (Drawable) null, (Drawable) null);
        TextView textView3 = this.confirmationCode;
        if (textView3 == null) {
            Intrinsics.f("confirmationCode");
            throw null;
        }
        textView3.setVisibility(0);
        View view = this.progressBar;
        if (view == null) {
            Intrinsics.f("progressBar");
            throw null;
        }
        view.setVisibility(8);
        if (!this.isRetry && DeviceRequestsHelper.startAdvertisementService(requestState.getUserCode())) {
            new InternalAppEventsLogger(getContext()).logEventImplicitly(AnalyticsEvents.EVENT_SMART_LOGIN_SERVICE);
        }
        if (requestState.withinLastRefreshWindow()) {
            schedulePoll();
        } else {
            poll();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startLogin$lambda$1(DeviceAuthDialog deviceAuthDialog, GraphResponse graphResponse) {
        FacebookException facebookException;
        deviceAuthDialog.getClass();
        graphResponse.getClass();
        if (deviceAuthDialog.isBeingDestroyed) {
            return;
        }
        if (graphResponse.getError() != null) {
            FacebookRequestError error = graphResponse.getError();
            if (error == null || (facebookException = error.getException()) == null) {
                facebookException = new FacebookException();
            }
            deviceAuthDialog.onError(facebookException);
            return;
        }
        JSONObject jSONObject = graphResponse.getJSONObject();
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        RequestState requestState = new RequestState();
        try {
            requestState.setUserCode(jSONObject.getString("user_code"));
            requestState.setRequestCode(jSONObject.getString("code"));
            requestState.setInterval(jSONObject.getLong("interval"));
            deviceAuthDialog.setCurrentRequestState(requestState);
        } catch (JSONException e) {
            deviceAuthDialog.onError(new FacebookException(e));
        }
    }

    public Map<String, String> additionalDeviceInfo() {
        return null;
    }

    public String getApplicationAccessToken() {
        return Validate.hasAppID() + '|' + Validate.hasClientToken();
    }

    public int getLayoutResId(boolean z) {
        return z ? com.facebook.common.R.layout.com_facebook_smart_device_dialog_fragment : com.facebook.common.R.layout.com_facebook_device_auth_dialog_fragment;
    }

    public View initializeContentView(boolean z) {
        LayoutInflater layoutInflater = requireActivity().getLayoutInflater();
        layoutInflater.getClass();
        View inflate = layoutInflater.inflate(getLayoutResId(z), (ViewGroup) null);
        inflate.getClass();
        View findViewById = inflate.findViewById(com.facebook.common.R.id.progress_bar);
        findViewById.getClass();
        this.progressBar = findViewById;
        View findViewById2 = inflate.findViewById(com.facebook.common.R.id.confirmation_code);
        findViewById2.getClass();
        this.confirmationCode = (TextView) findViewById2;
        View findViewById3 = inflate.findViewById(com.facebook.common.R.id.cancel_button);
        findViewById3.getClass();
        ((Button) findViewById3).setOnClickListener(new ja0(0, this));
        View findViewById4 = inflate.findViewById(com.facebook.common.R.id.com_facebook_device_auth_instructions);
        findViewById4.getClass();
        TextView textView = (TextView) findViewById4;
        this.instructions = textView;
        textView.setText(Html.fromHtml(getString(com.facebook.common.R.string.com_facebook_device_auth_instructions)));
        return inflate;
    }

    public boolean onBackButtonPressed() {
        return true;
    }

    public void onCancel() {
        if (this.completed.compareAndSet(false, true)) {
            RequestState requestState = this.currentRequestState;
            if (requestState != null) {
                DeviceRequestsHelper.cleanUpAdvertisementService(requestState.getUserCode());
            }
            DeviceAuthMethodHandler deviceAuthMethodHandler = this.deviceAuthMethodHandler;
            if (deviceAuthMethodHandler != null) {
                deviceAuthMethodHandler.onCancel();
            }
            Dialog dialog = getDialog();
            if (dialog != null) {
                dialog.dismiss();
            }
        }
    }

    @Override // defpackage.ta0
    public Dialog onCreateDialog(Bundle bundle) {
        final kr0 requireActivity = requireActivity();
        final int i = com.facebook.common.R.style.com_facebook_auth_dialog;
        Dialog dialog = new Dialog(requireActivity, i) { // from class: com.facebook.login.DeviceAuthDialog$onCreateDialog$dialog$1
            @Override // android.app.Dialog
            public void onBackPressed() {
                if (DeviceAuthDialog.this.onBackButtonPressed()) {
                    super.onBackPressed();
                }
            }
        };
        dialog.setContentView(initializeContentView(DeviceRequestsHelper.isAvailable() && !this.isRetry));
        return dialog;
    }

    @Override // defpackage.fr0
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RequestState requestState;
        LoginClient loginClient;
        layoutInflater.getClass();
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        kr0 requireActivity = requireActivity();
        requireActivity.getClass();
        LoginFragment loginFragment = (LoginFragment) ((FacebookActivity) requireActivity).getCurrentFragment();
        this.deviceAuthMethodHandler = (DeviceAuthMethodHandler) ((loginFragment == null || (loginClient = loginFragment.getLoginClient()) == null) ? null : loginClient.getCurrentHandler());
        if (bundle != null && (requestState = (RequestState) bundle.getParcelable(REQUEST_STATE_KEY)) != null) {
            setCurrentRequestState(requestState);
        }
        return onCreateView;
    }

    @Override // defpackage.ta0, defpackage.fr0
    public void onDestroyView() {
        this.isBeingDestroyed = true;
        this.completed.set(true);
        super.onDestroyView();
        GraphRequestAsyncTask graphRequestAsyncTask = this.currentGraphRequestPoll;
        if (graphRequestAsyncTask != null) {
            graphRequestAsyncTask.cancel(true);
        }
        ScheduledFuture<?> scheduledFuture = this.scheduledPoll;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    @Override // defpackage.ta0, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        super.onDismiss(dialogInterface);
        if (this.isBeingDestroyed) {
            return;
        }
        onCancel();
    }

    public void onError(FacebookException facebookException) {
        facebookException.getClass();
        if (this.completed.compareAndSet(false, true)) {
            RequestState requestState = this.currentRequestState;
            if (requestState != null) {
                DeviceRequestsHelper.cleanUpAdvertisementService(requestState.getUserCode());
            }
            DeviceAuthMethodHandler deviceAuthMethodHandler = this.deviceAuthMethodHandler;
            if (deviceAuthMethodHandler != null) {
                deviceAuthMethodHandler.onError(facebookException);
            }
            Dialog dialog = getDialog();
            if (dialog != null) {
                dialog.dismiss();
            }
        }
    }

    @Override // defpackage.ta0, defpackage.fr0
    public void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        if (this.currentRequestState != null) {
            bundle.putParcelable(REQUEST_STATE_KEY, this.currentRequestState);
        }
    }

    public void startLogin(LoginClient.Request request) {
        request.getClass();
        this.request = request;
        Bundle bundle = new Bundle();
        bundle.putString("scope", TextUtils.join(",", request.getPermissions()));
        Utility.putNonEmptyString(bundle, ServerProtocol.DIALOG_PARAM_REDIRECT_URI, request.getDeviceRedirectUriString());
        Utility.putNonEmptyString(bundle, DeviceRequestsHelper.DEVICE_TARGET_USER_ID, request.getDeviceAuthTargetUserId());
        bundle.putString("access_token", getApplicationAccessToken());
        Map<String, String> additionalDeviceInfo = additionalDeviceInfo();
        bundle.putString(DeviceRequestsHelper.DEVICE_INFO_PARAM, DeviceRequestsHelper.getDeviceInfo(additionalDeviceInfo != null ? new LinkedHashMap(additionalDeviceInfo) : null));
        GraphRequest.Companion.newPostRequestWithBundle(null, DEVICE_LOGIN_ENDPOINT, bundle, new la0(this, 1)).executeAsync();
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class RequestState implements Parcelable {
        private String authorizationUri;
        private long interval;
        private long lastPoll;
        private String requestCode;
        private String userCode;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<RequestState> CREATOR = new Parcelable.Creator<RequestState>() { // from class: com.facebook.login.DeviceAuthDialog$RequestState$Companion$CREATOR$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public DeviceAuthDialog.RequestState createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new DeviceAuthDialog.RequestState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public DeviceAuthDialog.RequestState[] newArray(int i) {
                return new DeviceAuthDialog.RequestState[i];
            }
        };

        public RequestState(Parcel parcel) {
            parcel.getClass();
            this.authorizationUri = parcel.readString();
            this.userCode = parcel.readString();
            this.requestCode = parcel.readString();
            this.interval = parcel.readLong();
            this.lastPoll = parcel.readLong();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String getAuthorizationUri() {
            return this.authorizationUri;
        }

        public final long getInterval() {
            return this.interval;
        }

        public final String getRequestCode() {
            return this.requestCode;
        }

        public final String getUserCode() {
            return this.userCode;
        }

        public final void setInterval(long j) {
            this.interval = j;
        }

        public final void setLastPoll(long j) {
            this.lastPoll = j;
        }

        public final void setRequestCode(String str) {
            this.requestCode = str;
        }

        public final void setUserCode(String str) {
            this.userCode = str;
            this.authorizationUri = String.format(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", Arrays.copyOf(new Object[]{str}, 1));
        }

        public final boolean withinLastRefreshWindow() {
            return this.lastPoll != 0 && (new Date().getTime() - this.lastPoll) - (this.interval * 1000) < 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.authorizationUri);
            parcel.writeString(this.userCode);
            parcel.writeString(this.requestCode);
            parcel.writeLong(this.interval);
            parcel.writeLong(this.lastPoll);
        }

        /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        public RequestState() {
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final PermissionsLists handlePermissionResponse(JSONObject jSONObject) {
            String optString;
            JSONArray jSONArray = jSONObject.getJSONObject("permissions").getJSONArray("data");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                String optString2 = optJSONObject.optString("permission");
                optString2.getClass();
                if (optString2.length() != 0 && !Intrinsics.b(optString2, "installed") && (optString = optJSONObject.optString(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS)) != null) {
                    int hashCode = optString.hashCode();
                    if (hashCode != -1309235419) {
                        if (hashCode != 280295099) {
                            if (hashCode == 568196142 && optString.equals("declined")) {
                                arrayList2.add(optString2);
                            }
                        } else if (optString.equals("granted")) {
                            arrayList.add(optString2);
                        }
                    } else if (optString.equals("expired")) {
                        arrayList3.add(optString2);
                    }
                }
            }
            return new PermissionsLists(arrayList, arrayList2, arrayList3);
        }

        public final String getDEVICE_LOGIN_ENDPOINT$facebook_common_release() {
            return DeviceAuthDialog.DEVICE_LOGIN_ENDPOINT;
        }

        public final String getDEVICE_LOGIN_STATUS_ENDPOINT$facebook_common_release() {
            return DeviceAuthDialog.DEVICE_LOGIN_STATUS_ENDPOINT;
        }

        public final int getLOGIN_ERROR_SUBCODE_AUTHORIZATION_PENDING$facebook_common_release() {
            return DeviceAuthDialog.LOGIN_ERROR_SUBCODE_AUTHORIZATION_PENDING;
        }

        private Companion() {
        }

        public static /* synthetic */ void getDEVICE_LOGIN_ENDPOINT$facebook_common_release$annotations() {
        }

        public static /* synthetic */ void getDEVICE_LOGIN_STATUS_ENDPOINT$facebook_common_release$annotations() {
        }

        public static /* synthetic */ void getLOGIN_ERROR_SUBCODE_AUTHORIZATION_PENDING$facebook_common_release$annotations() {
        }
    }
}
