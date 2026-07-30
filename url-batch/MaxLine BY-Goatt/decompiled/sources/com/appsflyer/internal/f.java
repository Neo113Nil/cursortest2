package com.appsflyer.internal;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int m;
    public final /* synthetic */ AFc1wSDK n;

    public /* synthetic */ f(AFc1wSDK aFc1wSDK, int i) {
        this.m = i;
        this.n = aFc1wSDK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.m;
        AFc1wSDK aFc1wSDK = this.n;
        switch (i) {
            case 0:
                AFc1wSDK.valueOf(aFc1wSDK);
                break;
            case 1:
                AFc1wSDK.AFInAppEventParameterName(aFc1wSDK);
                break;
            default:
                AFc1wSDK.values(aFc1wSDK);
                break;
        }
    }
}
