package com.appsflyer.internal;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2082d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AFd1wSDK f2083e;

    public /* synthetic */ k(AFd1wSDK aFd1wSDK, int i3) {
        this.f2082d = i3;
        this.f2083e = aFd1wSDK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2082d) {
            case 0:
                AFd1wSDK.getMonetizationNetwork(this.f2083e);
                break;
            case 1:
                AFd1wSDK.getMediationNetwork(this.f2083e);
                break;
            default:
                AFd1wSDK.getRevenue(this.f2083e);
                break;
        }
    }
}
