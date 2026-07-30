package com.facebook.gamingservices;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.GraphResponse;
import com.facebook.gamingservices.ContextChooseDialog;
import com.facebook.gamingservices.cloudgaming.CloudGameLoginHandler;
import com.facebook.gamingservices.cloudgaming.DaemonRequest;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKMessageEnum;
import com.facebook.gamingservices.model.ContextChooseContent;
import com.facebook.internal.AppCall;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.CustomTabUtils;
import com.facebook.internal.DialogPresenter;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.internal.FragmentWrapper;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.ServerProtocol;
import com.facebook.share.internal.ResultProcessor;
import com.facebook.share.internal.ShareInternalUtility;
import defpackage.ey;
import defpackage.fr0;
import defpackage.k4;
import defpackage.qv;
import defpackage.w20;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ContextChooseDialog extends FacebookDialogBase<ContextChooseContent, Result> {
    private static final String CONTEXT_CHOOSE_DIALOG = "context_choose";
    public static final Companion Companion = new Companion(null);
    private static final int DEFAULT_REQUEST_CODE = CallbackManagerImpl.RequestCodeOffset.GamingContextChoose.toRequestCode();
    private FacebookCallback<Result> callback;

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public final class ChromeCustomTabHandler extends FacebookDialogBase<ContextChooseContent, Result>.ModeHandler {
        public ChromeCustomTabHandler() {
            super();
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public boolean canShow(ContextChooseContent contextChooseContent, boolean z) {
            contextChooseContent.getClass();
            return CustomTabUtils.getChromePackage() != null;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public AppCall createAppCall(ContextChooseContent contextChooseContent) {
            String applicationId;
            contextChooseContent.getClass();
            AppCall createBaseAppCall = ContextChooseDialog.this.createBaseAppCall();
            AccessToken currentAccessToken = AccessToken.Companion.getCurrentAccessToken();
            Bundle bundle = new Bundle();
            Bundle bundle2 = new Bundle();
            Bundle bundle3 = new Bundle();
            if (currentAccessToken == null || (applicationId = currentAccessToken.getApplicationId()) == null) {
                applicationId = FacebookSdk.getApplicationId();
            }
            bundle.putString("app_id", applicationId);
            if (contextChooseContent.getMinSize() != null) {
                bundle3.putString("min_size", contextChooseContent.getMinSize().toString());
            }
            if (contextChooseContent.getMaxSize() != null) {
                bundle3.putString("max_size", contextChooseContent.getMaxSize().toString());
            }
            if (contextChooseContent.getFilters() != null) {
                bundle3.putString("filters", new JSONArray((Collection) contextChooseContent.getFilters()).toString());
            }
            bundle2.putString("filters", bundle3.toString());
            bundle.putString("payload", bundle2.toString());
            bundle.putString(ServerProtocol.DIALOG_PARAM_REDIRECT_URI, CustomTabUtils.getDefaultRedirectURI());
            DialogPresenter.setupAppCallForCustomTabDialog(createBaseAppCall, ContextChooseDialog.CONTEXT_CHOOSE_DIALOG, bundle);
            return createBaseAppCall;
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public final class FacebookAppHandler extends FacebookDialogBase<ContextChooseContent, Result>.ModeHandler {
        public FacebookAppHandler() {
            super();
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public boolean canShow(ContextChooseContent contextChooseContent, boolean z) {
            contextChooseContent.getClass();
            Activity activityContext = ContextChooseDialog.this.getActivityContext();
            PackageManager packageManager = activityContext != null ? activityContext.getPackageManager() : null;
            Intent intent = new Intent("com.facebook.games.gaming_services.DEEPLINK");
            intent.setType("text/plain");
            boolean z2 = (packageManager != null ? intent.resolveActivity(packageManager) : null) != null;
            AccessToken currentAccessToken = AccessToken.Companion.getCurrentAccessToken();
            return z2 && ((currentAccessToken != null ? currentAccessToken.getGraphDomain() : null) != null && FacebookSdk.GAMING.equals(currentAccessToken.getGraphDomain()));
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public AppCall createAppCall(ContextChooseContent contextChooseContent) {
            contextChooseContent.getClass();
            AppCall createBaseAppCall = ContextChooseDialog.this.createBaseAppCall();
            Intent intent = new Intent("com.facebook.games.gaming_services.DEEPLINK");
            intent.setType("text/plain");
            AccessToken currentAccessToken = AccessToken.Companion.getCurrentAccessToken();
            Bundle bundle = new Bundle();
            bundle.putString(SDKConstants.PARAM_TOURNAMENTS_DEEPLINK, "CONTEXT_CHOOSE");
            if (currentAccessToken != null) {
                bundle.putString("game_id", currentAccessToken.getApplicationId());
            } else {
                bundle.putString("game_id", FacebookSdk.getApplicationId());
            }
            if (contextChooseContent.getMinSize() != null) {
                bundle.putString("min_thread_size", contextChooseContent.getMinSize().toString());
            }
            if (contextChooseContent.getMaxSize() != null) {
                bundle.putString("max_thread_size", contextChooseContent.getMaxSize().toString());
            }
            if (contextChooseContent.getFilters() != null) {
                bundle.putString("filters", new JSONArray((Collection) contextChooseContent.getFilters()).toString());
            }
            NativeProtocol.setupProtocolRequestIntent(intent, createBaseAppCall.getCallId().toString(), com.google.firebase.encoders.json.BuildConfig.FLAVOR, NativeProtocol.getLatestKnownVersion(), bundle);
            createBaseAppCall.setRequestIntent(intent);
            return createBaseAppCall;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ContextChooseDialog(fr0 fr0Var) {
        this(new FragmentWrapper(fr0Var));
        fr0Var.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean registerCallbackImpl$lambda$4(ContextChooseDialog contextChooseDialog, ContextChooseDialog$registerCallbackImpl$resultProcessor$1 contextChooseDialog$registerCallbackImpl$resultProcessor$1, int i, Intent intent) {
        contextChooseDialog.getClass();
        contextChooseDialog$registerCallbackImpl$resultProcessor$1.getClass();
        return ShareInternalUtility.handleActivityResult(contextChooseDialog.getRequestCode(), i, intent, contextChooseDialog$registerCallbackImpl$resultProcessor$1);
    }

    private final void showForCloud(ContextChooseContent contextChooseContent) {
        AccessToken currentAccessToken = AccessToken.Companion.getCurrentAccessToken();
        if (currentAccessToken == null || currentAccessToken.isExpired()) {
            ey.i("Attempted to open ContextChooseContent with an invalid access token");
            return;
        }
        k4 k4Var = new k4(2, this);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("filters", contextChooseContent.getFilters());
            jSONObject.put(SDKConstants.PARAM_CONTEXT_MIN_SIZE, contextChooseContent.getMinSize());
            List<String> filters = contextChooseContent.getFilters();
            if (filters != null) {
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it = filters.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
                jSONObject.put("filters", jSONArray);
            }
            DaemonRequest.executeAsync(getActivityContext(), jSONObject, k4Var, SDKMessageEnum.CONTEXT_CHOOSE);
        } catch (JSONException unused) {
            FacebookCallback<Result> facebookCallback = this.callback;
            if (facebookCallback != null) {
                facebookCallback.onError(new FacebookException("Couldn't prepare Context Choose Dialog"));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showForCloud$lambda$2(ContextChooseDialog contextChooseDialog, GraphResponse graphResponse) {
        Unit unit;
        contextChooseDialog.getClass();
        FacebookCallback<Result> facebookCallback = contextChooseDialog.callback;
        if (facebookCallback != null) {
            FacebookRequestError error = graphResponse.getError();
            if (error != null) {
                facebookCallback.onError(new FacebookException(error.getErrorMessage()));
                unit = Unit.a;
            } else {
                unit = null;
            }
            if (unit == null) {
                facebookCallback.onSuccess(new Result(graphResponse));
            }
        }
    }

    @Override // com.facebook.internal.FacebookDialogBase, com.facebook.FacebookDialog
    public boolean canShow(ContextChooseContent contextChooseContent) {
        contextChooseContent.getClass();
        return CloudGameLoginHandler.isRunningInCloud() || new FacebookAppHandler().canShow(contextChooseContent, true) || new ChromeCustomTabHandler().canShow(contextChooseContent, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.internal.FacebookDialogBase
    public AppCall createBaseAppCall() {
        return new AppCall(getRequestCode(), null, 2, 0 == true ? 1 : 0);
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public List<FacebookDialogBase<ContextChooseContent, Result>.ModeHandler> getOrderedModeHandlers() {
        return qv.g(new FacebookAppHandler(), new ChromeCustomTabHandler());
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public void registerCallbackImpl(CallbackManagerImpl callbackManagerImpl, final FacebookCallback<Result> facebookCallback) {
        callbackManagerImpl.getClass();
        facebookCallback.getClass();
        this.callback = facebookCallback;
        callbackManagerImpl.registerCallback(getRequestCode(), new w20(0, this, new ResultProcessor(facebookCallback) { // from class: com.facebook.gamingservices.ContextChooseDialog$registerCallbackImpl$resultProcessor$1
            final /* synthetic */ FacebookCallback<ContextChooseDialog.Result> $callback;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(facebookCallback);
                this.$callback = facebookCallback;
            }

            @Override // com.facebook.share.internal.ResultProcessor
            public void onSuccess(AppCall appCall, Bundle bundle) {
                appCall.getClass();
                if (bundle == null) {
                    onCancel(appCall);
                    return;
                }
                if (bundle.getString("error_message") != null) {
                    this.$callback.onError(new FacebookException(bundle.getString("error_message")));
                    return;
                }
                String string = bundle.getString("id");
                if (string != null) {
                    GamingContext.Companion.setCurrentGamingContext(new GamingContext(string));
                    this.$callback.onSuccess(new ContextChooseDialog.Result(bundle));
                }
                this.$callback.onError(new FacebookException(bundle.getString("Invalid response received from server.")));
            }
        }));
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public void showImpl(ContextChooseContent contextChooseContent, Object obj) {
        contextChooseContent.getClass();
        obj.getClass();
        if (CloudGameLoginHandler.isRunningInCloud()) {
            showForCloud(contextChooseContent);
        } else {
            super.showImpl((ContextChooseDialog) contextChooseContent, obj);
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextChooseDialog(Activity activity) {
        super(activity, DEFAULT_REQUEST_CODE);
        activity.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ContextChooseDialog(Fragment fragment) {
        this(new FragmentWrapper(fragment));
        fragment.getClass();
    }

    private ContextChooseDialog(FragmentWrapper fragmentWrapper) {
        super(fragmentWrapper, DEFAULT_REQUEST_CODE);
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Result {
        private String contextID;

        public Result(GraphResponse graphResponse) {
            JSONObject optJSONObject;
            graphResponse.getClass();
            try {
                JSONObject jSONObject = graphResponse.getJSONObject();
                if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject("data")) == null) {
                    return;
                }
                this.contextID = optJSONObject.getString("id");
            } catch (JSONException unused) {
                this.contextID = null;
            }
        }

        public final String getContextID() {
            return this.contextID;
        }

        public final void setContextID(String str) {
            this.contextID = str;
        }

        public Result(Bundle bundle) {
            bundle.getClass();
            this.contextID = bundle.getString("id");
        }
    }
}
