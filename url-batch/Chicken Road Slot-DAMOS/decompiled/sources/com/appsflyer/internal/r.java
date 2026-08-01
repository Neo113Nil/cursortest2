package com.appsflyer.internal;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2093d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AFj1sSDK f2094e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Runnable f2095i;

    public /* synthetic */ r(AFj1sSDK aFj1sSDK, Runnable runnable, int i3) {
        this.f2093d = i3;
        this.f2094e = aFj1sSDK;
        this.f2095i = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2093d) {
            case 0:
                this.f2094e.areAllFieldsValid(this.f2095i);
                break;
            case 1:
                this.f2094e.getMonetizationNetwork(this.f2095i);
                break;
            case 2:
                this.f2094e.AFAdRevenueData(this.f2095i);
                break;
            default:
                this.f2094e.getRevenue(this.f2095i);
                break;
        }
    }
}
