package com.facebook.gamingservices;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import com.facebook.FacebookCallback;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.internal.AppCall;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.internal.FragmentWrapper;
import defpackage.fr0;
import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class GamingGroupIntegration extends FacebookDialogBase<Void, Result> {
    private static final int DEFAULT_REQUEST_CODE = CallbackManagerImpl.RequestCodeOffset.GamingGroupIntegration.toRequestCode();
    private static final String ERROR_KEY = "error";

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static class Result {
    }

    @Deprecated
    public GamingGroupIntegration(Fragment fragment) {
        super(new FragmentWrapper(fragment), DEFAULT_REQUEST_CODE);
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public AppCall createBaseAppCall() {
        return null;
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public List<FacebookDialogBase<Void, Result>.ModeHandler> getOrderedModeHandlers() {
        return null;
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public void registerCallbackImpl(CallbackManagerImpl callbackManagerImpl, final FacebookCallback<Result> facebookCallback) {
        callbackManagerImpl.registerCallback(getRequestCode(), new CallbackManagerImpl.Callback() { // from class: com.facebook.gamingservices.GamingGroupIntegration.1
            @Override // com.facebook.internal.CallbackManagerImpl.Callback
            public boolean onActivityResult(int i, Intent intent) {
                if (intent == null || !intent.hasExtra("error")) {
                    facebookCallback.onSuccess(new Result());
                    return true;
                }
                facebookCallback.onError(((FacebookRequestError) intent.getParcelableExtra("error")).getException());
                return true;
            }
        });
    }

    public void showImpl() {
        startActivityForResult(new Intent("android.intent.action.VIEW", Uri.parse("https://fb.gg/me/community/" + FacebookSdk.getApplicationId())), getRequestCode());
    }

    public void show() {
        showImpl();
    }

    @Override // com.facebook.internal.FacebookDialogBase, com.facebook.FacebookDialog
    public void show(Void r1) {
        showImpl();
    }

    public GamingGroupIntegration(Activity activity) {
        super(activity, DEFAULT_REQUEST_CODE);
    }

    public GamingGroupIntegration(fr0 fr0Var) {
        super(new FragmentWrapper(fr0Var), DEFAULT_REQUEST_CODE);
    }
}
