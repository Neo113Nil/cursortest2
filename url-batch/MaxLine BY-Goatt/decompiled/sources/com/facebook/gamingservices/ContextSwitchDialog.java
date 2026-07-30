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
import com.facebook.gamingservices.ContextSwitchDialog;
import com.facebook.gamingservices.cloudgaming.CloudGameLoginHandler;
import com.facebook.gamingservices.cloudgaming.DaemonRequest;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKMessageEnum;
import com.facebook.gamingservices.model.ContextSwitchContent;
import com.facebook.internal.AppCall;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.DialogPresenter;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.internal.FragmentWrapper;
import com.facebook.internal.NativeProtocol;
import com.facebook.share.internal.ResultProcessor;
import com.facebook.share.internal.ShareInternalUtility;
import defpackage.ey;
import defpackage.fr0;
import defpackage.k4;
import defpackage.qv;
import defpackage.w20;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ContextSwitchDialog extends FacebookDialogBase<ContextSwitchContent, Result> {
    public static final Companion Companion = new Companion(null);
    private static final int DEFAULT_REQUEST_CODE = CallbackManagerImpl.RequestCodeOffset.GamingContextSwitch.toRequestCode();
    private FacebookCallback<Result> callback;

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public final class FacebookAppHandler extends FacebookDialogBase<ContextSwitchContent, Result>.ModeHandler {
        public FacebookAppHandler() {
            super();
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public boolean canShow(ContextSwitchContent contextSwitchContent, boolean z) {
            contextSwitchContent.getClass();
            Activity activityContext = ContextSwitchDialog.this.getActivityContext();
            PackageManager packageManager = activityContext != null ? activityContext.getPackageManager() : null;
            Intent intent = new Intent("com.facebook.games.gaming_services.DEEPLINK");
            intent.setType("text/plain");
            boolean z2 = (packageManager != null ? intent.resolveActivity(packageManager) : null) != null;
            AccessToken currentAccessToken = AccessToken.Companion.getCurrentAccessToken();
            return z2 && ((currentAccessToken != null ? currentAccessToken.getGraphDomain() : null) != null && FacebookSdk.GAMING.equals(currentAccessToken.getGraphDomain()));
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public AppCall createAppCall(ContextSwitchContent contextSwitchContent) {
            contextSwitchContent.getClass();
            AppCall createBaseAppCall = ContextSwitchDialog.this.createBaseAppCall();
            Intent intent = new Intent("com.facebook.games.gaming_services.DEEPLINK");
            intent.setType("text/plain");
            AccessToken currentAccessToken = AccessToken.Companion.getCurrentAccessToken();
            Bundle bundle = new Bundle();
            bundle.putString(SDKConstants.PARAM_TOURNAMENTS_DEEPLINK, "CONTEXT_SWITCH");
            if (currentAccessToken != null) {
                bundle.putString("game_id", currentAccessToken.getApplicationId());
            } else {
                bundle.putString("game_id", FacebookSdk.getApplicationId());
            }
            if (contextSwitchContent.getContextID() != null) {
                bundle.putString("context_token_id", contextSwitchContent.getContextID());
            }
            NativeProtocol.setupProtocolRequestIntent(intent, createBaseAppCall.getCallId().toString(), com.google.firebase.encoders.json.BuildConfig.FLAVOR, NativeProtocol.getLatestKnownVersion(), bundle);
            createBaseAppCall.setRequestIntent(intent);
            return createBaseAppCall;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ContextSwitchDialog(fr0 fr0Var) {
        this(new FragmentWrapper(fr0Var));
        fr0Var.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean registerCallbackImpl$lambda$3(ContextSwitchDialog contextSwitchDialog, ResultProcessor resultProcessor, int i, Intent intent) {
        contextSwitchDialog.getClass();
        resultProcessor.getClass();
        return ShareInternalUtility.handleActivityResult(contextSwitchDialog.getRequestCode(), i, intent, resultProcessor);
    }

    private final void showForCloud(ContextSwitchContent contextSwitchContent) {
        AccessToken currentAccessToken = AccessToken.Companion.getCurrentAccessToken();
        if (currentAccessToken == null || currentAccessToken.isExpired()) {
            ey.i("Attempted to open ContextSwitchContent with an invalid access token");
            return;
        }
        k4 k4Var = new k4(4, this);
        String contextID = contextSwitchContent.getContextID();
        if (contextID == null) {
            FacebookCallback<Result> facebookCallback = this.callback;
            if (facebookCallback != null) {
                facebookCallback.onError(new FacebookException("Required string contextID not provided."));
                return;
            }
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", contextID);
            DaemonRequest.executeAsync(getActivityContext(), jSONObject, k4Var, SDKMessageEnum.CONTEXT_SWITCH);
        } catch (JSONException unused) {
            FacebookCallback<Result> facebookCallback2 = this.callback;
            if (facebookCallback2 != null) {
                facebookCallback2.onError(new FacebookException("Couldn't prepare Context Switch Dialog"));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showForCloud$lambda$2(ContextSwitchDialog contextSwitchDialog, GraphResponse graphResponse) {
        Unit unit;
        contextSwitchDialog.getClass();
        FacebookCallback<Result> facebookCallback = contextSwitchDialog.callback;
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
    public boolean canShow(ContextSwitchContent contextSwitchContent) {
        contextSwitchContent.getClass();
        return CloudGameLoginHandler.isRunningInCloud() || new FacebookAppHandler().canShow(contextSwitchContent, true) || new WebHandler().canShow(contextSwitchContent, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.internal.FacebookDialogBase
    public AppCall createBaseAppCall() {
        return new AppCall(getRequestCode(), null, 2, 0 == true ? 1 : 0);
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public List<FacebookDialogBase<ContextSwitchContent, Result>.ModeHandler> getOrderedModeHandlers() {
        return qv.g(new FacebookAppHandler(), new WebHandler());
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public void registerCallbackImpl(CallbackManagerImpl callbackManagerImpl, final FacebookCallback<Result> facebookCallback) {
        callbackManagerImpl.getClass();
        facebookCallback.getClass();
        this.callback = facebookCallback;
        callbackManagerImpl.registerCallback(getRequestCode(), new w20(2, this, new ResultProcessor(facebookCallback) { // from class: com.facebook.gamingservices.ContextSwitchDialog$registerCallbackImpl$resultProcessor$1
            final /* synthetic */ FacebookCallback<ContextSwitchDialog.Result> $callback;

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
                String string2 = bundle.getString(SDKConstants.PARAM_CONTEXT_CONTEXT_ID);
                if (string != null) {
                    GamingContext.Companion.setCurrentGamingContext(new GamingContext(string));
                    this.$callback.onSuccess(new ContextSwitchDialog.Result(string));
                } else if (string2 != null) {
                    GamingContext.Companion.setCurrentGamingContext(new GamingContext(string2));
                    this.$callback.onSuccess(new ContextSwitchDialog.Result(string2));
                }
                this.$callback.onError(new FacebookException(bundle.getString("Invalid response received from server.")));
            }
        }));
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public void showImpl(ContextSwitchContent contextSwitchContent, Object obj) {
        contextSwitchContent.getClass();
        obj.getClass();
        if (CloudGameLoginHandler.isRunningInCloud()) {
            showForCloud(contextSwitchContent);
        } else {
            super.showImpl((ContextSwitchDialog) contextSwitchContent, obj);
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

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public final class WebHandler extends FacebookDialogBase<ContextSwitchContent, Result>.ModeHandler {
        public WebHandler() {
            super();
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public AppCall createAppCall(ContextSwitchContent contextSwitchContent) {
            contextSwitchContent.getClass();
            AppCall createBaseAppCall = ContextSwitchDialog.this.createBaseAppCall();
            Bundle bundle = new Bundle();
            bundle.putString(SDKConstants.PARAM_CONTEXT_CONTEXT_ID, contextSwitchContent.getContextID());
            AccessToken currentAccessToken = AccessToken.Companion.getCurrentAccessToken();
            if (currentAccessToken != null) {
                bundle.putString("dialog_access_token", currentAccessToken.getToken());
            }
            DialogPresenter.setupAppCallForWebDialog(createBaseAppCall, "context", bundle);
            return createBaseAppCall;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public boolean canShow(ContextSwitchContent contextSwitchContent, boolean z) {
            contextSwitchContent.getClass();
            return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextSwitchDialog(Activity activity) {
        super(activity, DEFAULT_REQUEST_CODE);
        activity.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ContextSwitchDialog(Fragment fragment) {
        this(new FragmentWrapper(fragment));
        fragment.getClass();
    }

    private ContextSwitchDialog(FragmentWrapper fragmentWrapper) {
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

        public Result(String str) {
            str.getClass();
            this.contextID = str;
        }
    }
}
