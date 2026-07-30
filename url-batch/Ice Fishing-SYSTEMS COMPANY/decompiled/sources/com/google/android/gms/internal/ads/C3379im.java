package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.im, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3379im implements InterfaceC4063vN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31996a;

    /* renamed from: b, reason: collision with root package name */
    public final C3913si f31997b;

    public /* synthetic */ C3379im(C3913si c3913si, int i) {
        this.f31996a = i;
        this.f31997b = c3913si;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final Object d() {
        switch (this.f31996a) {
            case 0:
                return new BinderC3326hm(this.f31997b.a());
            default:
                return new C4296zn(this.f31997b.a());
        }
    }
}
