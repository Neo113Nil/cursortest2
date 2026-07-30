package com.appsflyer.internal;

import android.app.Activity;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int m;
    public final /* synthetic */ AFb1kSDK n;
    public final /* synthetic */ Activity o;

    public /* synthetic */ e(AFb1kSDK aFb1kSDK, Activity activity, int i) {
        this.m = i;
        this.n = aFb1kSDK;
        this.o = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.m;
        Activity activity = this.o;
        AFb1kSDK aFb1kSDK = this.n;
        switch (i) {
            case 0:
                AFb1kSDK.AFKeystoreWrapper(aFb1kSDK, activity);
                break;
            case 1:
                AFb1kSDK.AFInAppEventParameterName(aFb1kSDK, activity);
                break;
            default:
                AFb1kSDK.values(aFb1kSDK, activity);
                break;
        }
    }
}
