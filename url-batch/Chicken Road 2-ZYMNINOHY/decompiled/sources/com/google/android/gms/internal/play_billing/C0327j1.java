package com.google.android.gms.internal.play_billing;

import E.AbstractC0005f;

/* renamed from: com.google.android.gms.internal.play_billing.j1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0327j1 extends AbstractC0353w0 {
    private static final C0327j1 zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private int zzi;
    private String zzf = "";
    private String zzh = "";

    static {
        C0327j1 c0327j1 = new C0327j1();
        zzb = c0327j1;
        AbstractC0353w0.k(C0327j1.class, c0327j1);
    }

    public static /* synthetic */ void n(C0327j1 c0327j1, String str) {
        c0327j1.zzd |= 8;
        c0327j1.zzh = str;
    }

    public static /* synthetic */ void o(C0327j1 c0327j1, String str) {
        str.getClass();
        c0327j1.zzd |= 2;
        c0327j1.zzf = str;
    }

    public static /* synthetic */ void p(C0327j1 c0327j1, int i4) {
        c0327j1.zzd |= 16;
        c0327j1.zzi = i4;
    }

    public static void q(C0327j1 c0327j1, int i4) {
        c0327j1.zzg = AbstractC0005f.c(i4);
        c0327j1.zzd |= 4;
    }

    public static /* synthetic */ void r(C0327j1 c0327j1, int i4) {
        c0327j1.zzd |= 1;
        c0327j1.zze = i4;
    }

    public static C0324i1 s() {
        return (C0324i1) zzb.f();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0353w0
    public final Object d(int i4) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new R0(zzb, "\u0004\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003\u0007င\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", C0317g0.f5948d, "zzh", "zzi"});
        }
        if (i5 == 3) {
            return new C0327j1();
        }
        if (i5 == 4) {
            return new C0324i1(zzb);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }
}
