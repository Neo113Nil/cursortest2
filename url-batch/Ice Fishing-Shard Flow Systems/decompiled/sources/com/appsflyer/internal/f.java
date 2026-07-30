package com.appsflyer.internal;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4324d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4325e;

    public /* synthetic */ f(int i2, Object obj) {
        this.f4324d = i2;
        this.f4325e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4324d) {
            case 0:
                AFb1lSDK.getCurrencyIso4217Code((AFb1lSDK) this.f4325e);
                break;
            case 1:
                AFa1tSDK.getMediationNetwork((AFd1zSDK) this.f4325e);
                break;
            default:
                ((AFd1nSDK) this.f4325e).getMediationNetwork();
                break;
        }
    }
}
