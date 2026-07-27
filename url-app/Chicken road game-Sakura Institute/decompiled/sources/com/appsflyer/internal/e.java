package com.appsflyer.internal;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5987d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AFd1iSDK f5988e;

    public /* synthetic */ e(AFd1iSDK aFd1iSDK, int i2) {
        this.f5987d = i2;
        this.f5988e = aFd1iSDK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5987d) {
            case 0:
                AFd1iSDK.values(this.f5988e);
                break;
            case 1:
                AFd1iSDK.valueOf(this.f5988e);
                break;
            default:
                AFd1iSDK.AFInAppEventType(this.f5988e);
                break;
        }
    }
}
