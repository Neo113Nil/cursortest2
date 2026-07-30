package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ci, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2504Ci implements InterfaceC4063vN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24245a;

    /* renamed from: b, reason: collision with root package name */
    public final C2826Vh f24246b;

    public /* synthetic */ C2504Ci(C2826Vh c2826Vh, int i) {
        this.f24245a = i;
        this.f24246b = c2826Vh;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final /* bridge */ /* synthetic */ Object d() {
        switch (this.f24245a) {
            case 0:
                return new C2487Bi(this.f24246b.b(), 0);
            case 1:
                return new C2487Bi(this.f24246b.b(), 1);
            case 2:
                return new C2487Bi(this.f24246b.b(), 2);
            default:
                return new C2487Bi(this.f24246b.b(), 3);
        }
    }
}
