package com.facebook.gamingservices;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.gamingservices.TournamentJoinDialog;
import com.facebook.gamingservices.cloudgaming.CloudGameLoginHandler;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.gamingservices.internal.TournamentJoinDialogURIBuilder;
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
import defpackage.qv;
import defpackage.w20;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class TournamentJoinDialog extends FacebookDialogBase<String, Result> {
    public static final Companion Companion = new Companion(null);
    private static final int DEFAULT_REQUEST_CODE = CallbackManagerImpl.RequestCodeOffset.TournamentJoinDialog.toRequestCode();
    private static final String JOIN_TOURNAMENT_ACCESS_TOKEN_KEY = "access_token";
    private static final String JOIN_TOURNAMENT_ACTION = "com.facebook.games.gaming_services.DEEPLINK";
    private static final String JOIN_TOURNAMENT_CONTENT_TYPE = "text/plain";
    private static final String JOIN_TOURNAMENT_DIALOG = "join_tournament";
    private static final String JOIN_TOURNAMENT_ERROR_MESSAGE_KEY = "error_message";
    private String payload;
    private Number requestID;
    private String tournamentID;

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public final class ChromeCustomTabHandler extends FacebookDialogBase<String, Result>.ModeHandler {
        public ChromeCustomTabHandler() {
            super();
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public boolean canShow(String str, boolean z) {
            return CustomTabUtils.getChromePackage() != null;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public AppCall createAppCall(String str) {
            String applicationId;
            AppCall createBaseAppCall = TournamentJoinDialog.this.createBaseAppCall();
            AccessToken currentAccessToken = AccessToken.Companion.getCurrentAccessToken();
            Bundle bundle = new Bundle();
            Bundle bundle2 = new Bundle();
            if (currentAccessToken == null || (applicationId = currentAccessToken.getApplicationId()) == null) {
                applicationId = FacebookSdk.getApplicationId();
            }
            bundle.putString("app_id", applicationId);
            bundle.putString("payload", bundle2.toString());
            if (currentAccessToken != null) {
                currentAccessToken.getToken();
            }
            bundle.putString("access_token", currentAccessToken != null ? currentAccessToken.getToken() : null);
            bundle.putString(ServerProtocol.DIALOG_PARAM_REDIRECT_URI, CustomTabUtils.getDefaultRedirectURI());
            DialogPresenter.setupAppCallForCustomTabDialog(createBaseAppCall, TournamentJoinDialog.JOIN_TOURNAMENT_DIALOG, bundle);
            return createBaseAppCall;
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public final class FacebookAppHandler extends FacebookDialogBase<String, Result>.ModeHandler {
        public FacebookAppHandler() {
            super();
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public boolean canShow(String str, boolean z) {
            PackageManager packageManager = FacebookSdk.getApplicationContext().getPackageManager();
            packageManager.getClass();
            Intent intent = new Intent(TournamentJoinDialog.JOIN_TOURNAMENT_ACTION);
            intent.setType(TournamentJoinDialog.JOIN_TOURNAMENT_CONTENT_TYPE);
            return intent.resolveActivity(packageManager) != null;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public AppCall createAppCall(String str) {
            AccessToken currentAccessToken = AccessToken.Companion.getCurrentAccessToken();
            AppCall createBaseAppCall = TournamentJoinDialog.this.createBaseAppCall();
            Intent intent = new Intent(TournamentJoinDialog.JOIN_TOURNAMENT_ACTION);
            intent.setType(TournamentJoinDialog.JOIN_TOURNAMENT_CONTENT_TYPE);
            if (currentAccessToken == null || currentAccessToken.isExpired()) {
                ey.i("Attempted to present TournamentJoinDialog with an invalid access token");
                return null;
            }
            if (currentAccessToken.getGraphDomain() != null && !FacebookSdk.GAMING.equals(currentAccessToken.getGraphDomain())) {
                ey.i("Attempted to present TournamentJoinDialog while user is not gaming logged in");
                return null;
            }
            NativeProtocol.setupProtocolRequestIntent(intent, createBaseAppCall.getCallId().toString(), com.google.firebase.encoders.json.BuildConfig.FLAVOR, NativeProtocol.PROTOCOL_VERSION_20210906, TournamentJoinDialogURIBuilder.INSTANCE.bundle$facebook_gamingservices_release(currentAccessToken.getApplicationId(), TournamentJoinDialog.this.tournamentID, TournamentJoinDialog.this.payload));
            createBaseAppCall.setRequestIntent(intent);
            return createBaseAppCall;
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Result {
        private String payload;
        private String requestID;
        private String tournamentID;

        public Result(Bundle bundle) {
            bundle.getClass();
            if (bundle.getString("request") != null) {
                this.requestID = bundle.getString("request");
            }
            this.tournamentID = bundle.getString(SDKConstants.PARAM_TOURNAMENTS_ID);
            this.payload = bundle.getString("payload");
        }

        public final String getPayload() {
            return this.payload;
        }

        public final String getRequestID() {
            return this.requestID;
        }

        public final String getTournamentID() {
            return this.tournamentID;
        }

        public final void setPayload(String str) {
            this.payload = str;
        }

        public final void setRequestID(String str) {
            this.requestID = str;
        }

        public final void setTournamentID(String str) {
            this.tournamentID = str;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TournamentJoinDialog(fr0 fr0Var) {
        this(new FragmentWrapper(fr0Var));
        fr0Var.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean registerCallbackImpl$lambda$0(TournamentJoinDialog tournamentJoinDialog, ResultProcessor resultProcessor, int i, Intent intent) {
        tournamentJoinDialog.getClass();
        resultProcessor.getClass();
        return ShareInternalUtility.handleActivityResult(tournamentJoinDialog.getRequestCode(), i, intent, resultProcessor);
    }

    @Override // com.facebook.internal.FacebookDialogBase, com.facebook.FacebookDialog
    public boolean canShow(String str) {
        if (CloudGameLoginHandler.isRunningInCloud()) {
            return false;
        }
        if (new FacebookAppHandler().canShow(str, true)) {
            return true;
        }
        return new ChromeCustomTabHandler().canShow(str, true);
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public AppCall createBaseAppCall() {
        return new AppCall(getRequestCode(), null, 2, null);
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public List<FacebookDialogBase<String, Result>.ModeHandler> getOrderedModeHandlers() {
        return qv.g(new FacebookAppHandler(), new ChromeCustomTabHandler());
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public void registerCallbackImpl(CallbackManagerImpl callbackManagerImpl, final FacebookCallback<Result> facebookCallback) {
        callbackManagerImpl.getClass();
        facebookCallback.getClass();
        callbackManagerImpl.registerCallback(getRequestCode(), new w20(4, this, new ResultProcessor(facebookCallback) { // from class: com.facebook.gamingservices.TournamentJoinDialog$registerCallbackImpl$resultProcessor$1
            final /* synthetic */ FacebookCallback<TournamentJoinDialog.Result> $callback;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(facebookCallback);
                this.$callback = facebookCallback;
            }

            @Override // com.facebook.share.internal.ResultProcessor
            public void onSuccess(AppCall appCall, Bundle bundle) {
                appCall.getClass();
                if (bundle != null) {
                    if (bundle.getString("error_message") != null) {
                        this.$callback.onError(new FacebookException(bundle.getString("error_message")));
                        return;
                    } else if (bundle.getString("payload") != null) {
                        this.$callback.onSuccess(new TournamentJoinDialog.Result(bundle));
                        return;
                    }
                }
                onCancel(appCall);
            }
        }));
    }

    public final void show(String str, String str2) {
        this.tournamentID = str;
        this.payload = str2;
        super.showImpl((TournamentJoinDialog) str, FacebookDialogBase.BASE_AUTOMATIC_MODE);
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public void showImpl(String str, Object obj) {
        obj.getClass();
        if (CloudGameLoginHandler.isRunningInCloud()) {
            return;
        }
        super.showImpl((TournamentJoinDialog) str, obj);
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
    public TournamentJoinDialog(Activity activity) {
        super(activity, DEFAULT_REQUEST_CODE);
        activity.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TournamentJoinDialog(Fragment fragment) {
        this(new FragmentWrapper(fragment));
        fragment.getClass();
    }

    private TournamentJoinDialog(FragmentWrapper fragmentWrapper) {
        super(fragmentWrapper, DEFAULT_REQUEST_CODE);
    }
}
