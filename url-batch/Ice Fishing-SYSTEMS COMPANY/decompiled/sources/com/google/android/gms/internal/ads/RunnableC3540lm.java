package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.lm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3540lm implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f32586n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C3648nm f32587u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ AbstractBinderC3186f8 f32588v;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ RunnableC3540lm(C3648nm c3648nm, InterfaceViewOnClickListenerC2678Mm interfaceViewOnClickListenerC2678Mm, int i) {
        this.f32586n = i;
        switch (i) {
            case 1:
                this.f32587u = c3648nm;
                this.f32588v = (AbstractBinderC3186f8) interfaceViewOnClickListenerC2678Mm;
                break;
            default:
                this.f32587u = c3648nm;
                this.f32588v = (AbstractBinderC3186f8) interfaceViewOnClickListenerC2678Mm;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.Mm, com.google.android.gms.internal.ads.f8] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.gms.internal.ads.Mm, com.google.android.gms.internal.ads.f8] */
    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f32586n) {
            case 0:
                this.f32587u.g(this.f32588v);
                break;
            default:
                this.f32587u.h(this.f32588v);
                break;
        }
    }
}
