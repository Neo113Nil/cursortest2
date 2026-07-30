package com.facebook.internal;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookDialog;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.LoggingBehavior;
import defpackage.ey;
import defpackage.i4;
import defpackage.in1;
import defpackage.lh;
import defpackage.m4;
import defpackage.w3;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class FacebookDialogBase<CONTENT, RESULT> implements FacebookDialog<CONTENT, RESULT> {
    private static final String TAG = "FacebookDialog";
    private final Activity activity;
    private CallbackManager callbackManager;
    private final FragmentWrapper fragmentWrapper;
    private List<? extends FacebookDialogBase<CONTENT, RESULT>.ModeHandler> modeHandlers;
    private int requestCodeField;
    public static final Companion Companion = new Companion(null);
    public static final Object BASE_AUTOMATIC_MODE = new Object();

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public abstract class ModeHandler {
        private Object mode = FacebookDialogBase.BASE_AUTOMATIC_MODE;

        public ModeHandler() {
        }

        public abstract boolean canShow(CONTENT content, boolean z);

        public abstract AppCall createAppCall(CONTENT content);

        public Object getMode() {
            return this.mode;
        }

        public void setMode(Object obj) {
            obj.getClass();
            this.mode = obj;
        }
    }

    public FacebookDialogBase(FragmentWrapper fragmentWrapper, int i) {
        fragmentWrapper.getClass();
        this.fragmentWrapper = fragmentWrapper;
        this.activity = null;
        this.requestCodeField = i;
        if (fragmentWrapper.getActivity() != null) {
            return;
        }
        lh.e("Cannot use a fragment that is not attached to an activity");
        throw null;
    }

    private final List<FacebookDialogBase<CONTENT, RESULT>.ModeHandler> cachedModeHandlers() {
        if (this.modeHandlers == null) {
            this.modeHandlers = getOrderedModeHandlers();
        }
        List<? extends FacebookDialogBase<CONTENT, RESULT>.ModeHandler> list = this.modeHandlers;
        list.getClass();
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppCall createAppCallForMode(CONTENT content, Object obj) {
        AppCall appCall;
        boolean z = obj == BASE_AUTOMATIC_MODE;
        Iterator<FacebookDialogBase<CONTENT, RESULT>.ModeHandler> it = cachedModeHandlers().iterator();
        while (true) {
            if (!it.hasNext()) {
                appCall = null;
                break;
            }
            FacebookDialogBase<CONTENT, RESULT>.ModeHandler next = it.next();
            if (z || Utility.areObjectsEqual(next.getMode(), obj)) {
                if (next.canShow(content, true)) {
                    try {
                        appCall = next.createAppCall(content);
                        break;
                    } catch (FacebookException e) {
                        AppCall createBaseAppCall = createBaseAppCall();
                        DialogPresenter.setupAppCallForValidationError(createBaseAppCall, e);
                        appCall = createBaseAppCall;
                    }
                }
            }
        }
        if (appCall != null) {
            return appCall;
        }
        AppCall createBaseAppCall2 = createBaseAppCall();
        DialogPresenter.setupAppCallForCannotShowError(createBaseAppCall2);
        return createBaseAppCall2;
    }

    private final void memorizeCallbackManager(CallbackManager callbackManager) {
        CallbackManager callbackManager2 = this.callbackManager;
        if (callbackManager2 == null) {
            this.callbackManager = callbackManager;
        } else if (callbackManager2 != callbackManager) {
            Log.w(TAG, "You're registering a callback on a Facebook dialog with two different callback managers. It's almost wrong and may cause unexpected results. Only the first callback manager will be used for handling activity result with androidx.");
        }
    }

    @Override // com.facebook.FacebookDialog
    public boolean canShow(CONTENT content) {
        return canShowImpl(content, BASE_AUTOMATIC_MODE);
    }

    public boolean canShowImpl(CONTENT content, Object obj) {
        obj.getClass();
        boolean z = obj == BASE_AUTOMATIC_MODE;
        for (FacebookDialogBase<CONTENT, RESULT>.ModeHandler modeHandler : cachedModeHandlers()) {
            if (z || Utility.areObjectsEqual(modeHandler.getMode(), obj)) {
                if (modeHandler.canShow(content, false)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final w3 createActivityResultContractForShowingDialog(final CallbackManager callbackManager, final Object obj) {
        obj.getClass();
        return new w3(this) { // from class: com.facebook.internal.FacebookDialogBase$createActivityResultContractForShowingDialog$1
            final /* synthetic */ FacebookDialogBase<CONTENT, RESULT> this$0;

            {
                this.this$0 = this;
            }

            @Override // defpackage.w3
            public Intent createIntent(Context context, CONTENT content) {
                AppCall createAppCallForMode;
                context.getClass();
                createAppCallForMode = this.this$0.createAppCallForMode(content, obj);
                Intent requestIntent = createAppCallForMode != null ? createAppCallForMode.getRequestIntent() : null;
                if (requestIntent != null) {
                    createAppCallForMode.setPending();
                    return requestIntent;
                }
                throw new FacebookException("Content " + content + " is not supported");
            }

            @Override // defpackage.w3
            public CallbackManager.ActivityResultParameters parseResult(int i, Intent intent) {
                CallbackManager callbackManager2 = callbackManager;
                if (callbackManager2 != null) {
                    callbackManager2.onActivityResult(this.this$0.getRequestCode(), i, intent);
                }
                return new CallbackManager.ActivityResultParameters(this.this$0.getRequestCode(), i, intent);
            }
        };
    }

    public abstract AppCall createBaseAppCall();

    public final Activity getActivityContext() {
        Activity activity = this.activity;
        if (activity != null) {
            return activity;
        }
        FragmentWrapper fragmentWrapper = this.fragmentWrapper;
        if (fragmentWrapper != null) {
            return fragmentWrapper.getActivity();
        }
        return null;
    }

    public final CallbackManager getCallbackManager$facebook_common_release() {
        return this.callbackManager;
    }

    public abstract List<FacebookDialogBase<CONTENT, RESULT>.ModeHandler> getOrderedModeHandlers();

    public final int getRequestCode() {
        return this.requestCodeField;
    }

    @Override // com.facebook.FacebookDialog
    public void registerCallback(CallbackManager callbackManager, FacebookCallback<RESULT> facebookCallback) {
        callbackManager.getClass();
        facebookCallback.getClass();
        if (!(callbackManager instanceof CallbackManagerImpl)) {
            ey.i("Unexpected CallbackManager, please use the provided Factory.");
        } else {
            memorizeCallbackManager(callbackManager);
            registerCallbackImpl((CallbackManagerImpl) callbackManager, facebookCallback);
        }
    }

    public abstract void registerCallbackImpl(CallbackManagerImpl callbackManagerImpl, FacebookCallback<RESULT> facebookCallback);

    public final void setCallbackManager(CallbackManager callbackManager) {
        this.callbackManager = callbackManager;
    }

    public final void setCallbackManager$facebook_common_release(CallbackManager callbackManager) {
        this.callbackManager = callbackManager;
    }

    public final void setRequestCode(int i) {
        if (FacebookSdk.isFacebookRequestCode(i)) {
            lh.c(in1.l(i, "Request code ", " cannot be within the range reserved by the Facebook SDK."));
        } else {
            this.requestCodeField = i;
        }
    }

    @Override // com.facebook.FacebookDialog
    public void show(CONTENT content) {
        showImpl(content, BASE_AUTOMATIC_MODE);
    }

    public void showImpl(CONTENT content, Object obj) {
        obj.getClass();
        AppCall createAppCallForMode = createAppCallForMode(content, obj);
        if (createAppCallForMode == null) {
            Log.e(TAG, "No code path should ever result in a null appCall");
            if (FacebookSdk.isDebugEnabled()) {
                lh.g("No code path should ever result in a null appCall");
                return;
            }
            return;
        }
        if (getActivityContext() instanceof m4) {
            ComponentCallbacks2 activityContext = getActivityContext();
            activityContext.getClass();
            i4 activityResultRegistry = ((m4) activityContext).getActivityResultRegistry();
            activityResultRegistry.getClass();
            DialogPresenter.present(createAppCallForMode, activityResultRegistry, this.callbackManager);
            createAppCallForMode.setPending();
            return;
        }
        FragmentWrapper fragmentWrapper = this.fragmentWrapper;
        if (fragmentWrapper != null) {
            DialogPresenter.present(createAppCallForMode, fragmentWrapper);
            return;
        }
        Activity activity = this.activity;
        if (activity != null) {
            DialogPresenter.present(createAppCallForMode, activity);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void startActivityForResult(Intent intent, int i) {
        String str;
        intent.getClass();
        Activity activityContext = getActivityContext();
        if (activityContext instanceof m4) {
            i4 activityResultRegistry = ((m4) activityContext).getActivityResultRegistry();
            activityResultRegistry.getClass();
            DialogPresenter.startActivityForResultWithAndroidX(activityResultRegistry, this.callbackManager, intent, i);
        } else if (activityContext != 0) {
            activityContext.startActivityForResult(intent, i);
        } else {
            FragmentWrapper fragmentWrapper = this.fragmentWrapper;
            if (fragmentWrapper == null) {
                str = "Failed to find Activity or Fragment to startActivityForResult ";
                if (str == null) {
                    Logger.Companion.log(LoggingBehavior.DEVELOPER_ERRORS, 6, getClass().getName(), str);
                    return;
                }
                return;
            }
            fragmentWrapper.startActivityForResult(intent, i);
        }
        str = null;
        if (str == null) {
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

    @Override // com.facebook.FacebookDialog
    public w3 createActivityResultContractForShowingDialog(CallbackManager callbackManager) {
        return createActivityResultContractForShowingDialog(callbackManager, BASE_AUTOMATIC_MODE);
    }

    @Override // com.facebook.FacebookDialog
    public void registerCallback(CallbackManager callbackManager, FacebookCallback<RESULT> facebookCallback, int i) {
        callbackManager.getClass();
        facebookCallback.getClass();
        memorizeCallbackManager(callbackManager);
        setRequestCode(i);
        registerCallback(callbackManager, facebookCallback);
    }

    public FacebookDialogBase(Activity activity, int i) {
        activity.getClass();
        this.activity = activity;
        this.fragmentWrapper = null;
        this.requestCodeField = i;
        this.callbackManager = null;
    }

    public FacebookDialogBase(int i) {
        this.requestCodeField = i;
        this.activity = null;
        this.fragmentWrapper = null;
    }
}
