package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.internal.AppCall;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class ResultProcessor {
    private final FacebookCallback<?> appCallback;

    public ResultProcessor(FacebookCallback<?> facebookCallback) {
        this.appCallback = facebookCallback;
    }

    public void onCancel(AppCall appCall) {
        appCall.getClass();
        FacebookCallback<?> facebookCallback = this.appCallback;
        if (facebookCallback != null) {
            facebookCallback.onCancel();
        }
    }

    public void onError(AppCall appCall, FacebookException facebookException) {
        appCall.getClass();
        facebookException.getClass();
        FacebookCallback<?> facebookCallback = this.appCallback;
        if (facebookCallback != null) {
            facebookCallback.onError(facebookException);
        }
    }

    public abstract void onSuccess(AppCall appCall, Bundle bundle);
}
