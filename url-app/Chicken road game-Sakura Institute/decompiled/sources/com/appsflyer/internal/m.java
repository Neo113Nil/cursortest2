package com.appsflyer.internal;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6003d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AFj1vSDK f6004e;

    public /* synthetic */ m(AFj1vSDK aFj1vSDK, int i2) {
        this.f6003d = i2;
        this.f6004e = aFj1vSDK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6003d) {
            case 0:
                this.f6004e.unregisterClient();
                break;
            case 1:
                this.f6004e.AFLogger();
                break;
            default:
                this.f6004e.e();
                break;
        }
    }
}
