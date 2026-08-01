package com.appsflyer.internal;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2090d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AFj1pSDK f2091e;

    public /* synthetic */ p(AFj1pSDK aFj1pSDK, int i3) {
        this.f2090d = i3;
        this.f2091e = aFj1pSDK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2090d) {
            case 0:
                this.f2091e.component4();
                break;
            case 1:
                this.f2091e.component2();
                break;
            default:
                this.f2091e.component1();
                break;
        }
    }
}
