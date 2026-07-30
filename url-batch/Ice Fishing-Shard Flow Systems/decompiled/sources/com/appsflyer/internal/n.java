package com.appsflyer.internal;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4340d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AFj1rSDK f4341e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Runnable f4342i;

    public /* synthetic */ n(AFj1rSDK aFj1rSDK, Runnable runnable, int i2) {
        this.f4340d = i2;
        this.f4341e = aFj1rSDK;
        this.f4342i = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4340d) {
            case 0:
                this.f4341e.getMediationNetwork(this.f4342i);
                break;
            case 1:
                this.f4341e.getCurrencyIso4217Code(this.f4342i);
                break;
            case 2:
                this.f4341e.getMonetizationNetwork(this.f4342i);
                break;
            default:
                this.f4341e.areAllFieldsValid(this.f4342i);
                break;
        }
    }
}
