package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Mj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2675Mj implements InterfaceC4063vN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26370a;

    /* renamed from: b, reason: collision with root package name */
    public final C3602mu f26371b;

    public /* synthetic */ C2675Mj(C3602mu c3602mu, int i) {
        this.f26370a = i;
        this.f26371b = c3602mu;
    }

    public Ut a() {
        Ut ut = (Ut) this.f26371b.f32775v;
        AbstractC3137eE.h(ut);
        return ut;
    }

    public C2953au b() {
        C2953au c2953au = (C2953au) this.f26371b.f32774u;
        AbstractC3137eE.h(c2953au);
        return c2953au;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final Object d() {
        switch (this.f26370a) {
            case 0:
                Ut ut = (Ut) this.f26371b.f32775v;
                AbstractC3137eE.h(ut);
                return ut;
            case 1:
                return (String) this.f26371b.f32776w;
            case 2:
                return this.f26371b.u();
            default:
                C2953au c2953au = (C2953au) this.f26371b.f32774u;
                AbstractC3137eE.h(c2953au);
                return c2953au;
        }
    }
}
