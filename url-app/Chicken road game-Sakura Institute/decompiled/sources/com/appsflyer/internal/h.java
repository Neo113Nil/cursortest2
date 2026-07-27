package com.appsflyer.internal;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5992d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AFd1ySDK f5993e;

    public /* synthetic */ h(AFd1ySDK aFd1ySDK, int i2) {
        this.f5992d = i2;
        this.f5993e = aFd1ySDK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5992d) {
            case 0:
                AFd1ySDK.AFInAppEventType(this.f5993e);
                break;
            default:
                AFd1ySDK.values(this.f5993e);
                break;
        }
    }
}
