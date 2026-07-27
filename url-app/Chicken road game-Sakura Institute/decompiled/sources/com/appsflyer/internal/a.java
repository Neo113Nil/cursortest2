package com.appsflyer.internal;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5978d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5979e;

    public /* synthetic */ a(int i2, Object obj) {
        this.f5978d = i2;
        this.f5979e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5978d) {
            case 0:
                ((AFe1wSDK) this.f5979e).AFKeystoreWrapper();
                break;
            case 1:
                ((AFb1vSDK) this.f5979e).AFLogger();
                break;
            default:
                AFb1vSDK.valueOf((AFd1kSDK) this.f5979e);
                break;
        }
    }
}
