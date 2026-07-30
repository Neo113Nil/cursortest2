package com.appsflyer.internal;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int m;
    public final /* synthetic */ AFa1dSDK n;

    public /* synthetic */ b(AFa1dSDK aFa1dSDK, int i) {
        this.m = i;
        this.n = aFa1dSDK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.m;
        AFa1dSDK aFa1dSDK = this.n;
        switch (i) {
            case 0:
                aFa1dSDK.getLevel();
                break;
            default:
                aFa1dSDK.AFVersionDeclaration();
                break;
        }
    }
}
