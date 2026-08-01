package com.appsflyer.internal;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2076d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2077e;

    public /* synthetic */ f(int i3, Object obj) {
        this.f2076d = i3;
        this.f2077e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2076d) {
            case 0:
                AFb1iSDK.getMediationNetwork((AFb1iSDK) this.f2077e);
                break;
            case 1:
                AFa1ySDK.getMediationNetwork((AFd1zSDK) this.f2077e);
                break;
            default:
                ((AFd1kSDK) this.f2077e).AFAdRevenueData();
                break;
        }
    }
}
