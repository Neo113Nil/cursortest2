package com.appsflyer.internal;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4338d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AFj1mSDK f4339e;

    public /* synthetic */ m(AFj1mSDK aFj1mSDK, int i2) {
        this.f4338d = i2;
        this.f4339e = aFj1mSDK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4338d) {
            case 0:
                this.f4339e.component1();
                break;
            case 1:
                this.f4339e.component2();
                break;
            default:
                this.f4339e.component3();
                break;
        }
    }
}
