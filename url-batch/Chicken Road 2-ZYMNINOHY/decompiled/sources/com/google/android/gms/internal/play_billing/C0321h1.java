package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.h1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0321h1 extends AbstractC0353w0 {
    private static final C0321h1 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private int zzh;

    static {
        C0321h1 c0321h1 = new C0321h1();
        zzb = c0321h1;
        AbstractC0353w0.k(C0321h1.class, c0321h1);
    }

    public static void o(C0321h1 c0321h1, l1 l1Var) {
        c0321h1.zzh = l1Var.f5976a;
        c0321h1.zzd |= 2;
    }

    public static /* synthetic */ void p(C0321h1 c0321h1, r1 r1Var) {
        c0321h1.zzf = r1Var;
        c0321h1.zze = 2;
    }

    public static /* synthetic */ void q(C0321h1 c0321h1, v1 v1Var) {
        c0321h1.zzf = v1Var;
        c0321h1.zze = 4;
    }

    public static /* synthetic */ void r(C0321h1 c0321h1, D1 d12) {
        c0321h1.zzf = d12;
        c0321h1.zze = 3;
    }

    public static /* synthetic */ void s(C0321h1 c0321h1, int i4) {
        c0321h1.zzg = i4 - 1;
        c0321h1.zzd |= 1;
    }

    public static C0318g1 t() {
        return (C0318g1) zzb.f();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0353w0
    public final Object d(int i4) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new R0(zzb, "\u0004\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005᠌\u0001", new Object[]{"zzf", "zze", "zzd", "zzg", C0317g0.f5947c, r1.class, D1.class, v1.class, "zzh", C0317g0.f5949e});
        }
        if (i5 == 3) {
            return new C0321h1();
        }
        if (i5 == 4) {
            return new C0318g1(zzb);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }

    public final v1 n() {
        return this.zze == 4 ? (v1) this.zzf : v1.o();
    }
}
