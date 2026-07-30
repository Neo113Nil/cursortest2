package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final /* synthetic */ class Bz implements CD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24111a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ez f24112b;

    public /* synthetic */ Bz(Ez ez, int i) {
        this.f24111a = i;
        this.f24112b = ez;
    }

    @Override // com.google.android.gms.internal.ads.CD
    public final /* synthetic */ J3.a b(Object obj) {
        switch (this.f24111a) {
            case 0:
                Ez ez = this.f24112b;
                ez.getClass();
                if (((Boolean) obj).booleanValue()) {
                    return ez.b(0);
                }
                ez.f24874d.b(1003);
                return C3686oN.c(Dz.f24613u);
            default:
                Jy jy = (Jy) obj;
                Ez ez2 = this.f24112b;
                ez2.getClass();
                int H6 = jy.H();
                InterfaceC2970bA interfaceC2970bA = ez2.f24873c;
                if (H6 == 2) {
                    return interfaceC2970bA.b(jy.A(), jy.B().a());
                }
                if (jy.H() == 3) {
                    return interfaceC2970bA.e(jy.A(), jy.C().a(), jy.B().a());
                }
                throw new AssertionError("Unreachable");
        }
    }
}
