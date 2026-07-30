package com.appsflyer.internal;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4330d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AFd1wSDK f4331e;

    public /* synthetic */ j(AFd1wSDK aFd1wSDK, int i2) {
        this.f4330d = i2;
        this.f4331e = aFd1wSDK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4330d) {
            case 0:
                AFd1wSDK.getCurrencyIso4217Code(this.f4331e);
                break;
            case 1:
                AFd1wSDK.AFAdRevenueData(this.f4331e);
                break;
            default:
                AFd1wSDK.getMediationNetwork(this.f4331e);
                break;
        }
    }
}
