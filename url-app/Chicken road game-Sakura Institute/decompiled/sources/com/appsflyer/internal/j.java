package com.appsflyer.internal;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5996d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AFi1aSDK f5997e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Runnable f5998i;

    public /* synthetic */ j(AFi1aSDK aFi1aSDK, Runnable runnable, int i2) {
        this.f5996d = i2;
        this.f5997e = aFi1aSDK;
        this.f5998i = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5996d) {
            case 0:
                this.f5997e.AFKeystoreWrapper(this.f5998i);
                break;
            case 1:
                this.f5997e.AFInAppEventType(this.f5998i);
                break;
            default:
                this.f5997e.values(this.f5998i);
                break;
        }
    }
}
