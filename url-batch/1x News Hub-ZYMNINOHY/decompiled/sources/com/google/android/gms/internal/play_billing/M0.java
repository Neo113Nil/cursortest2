package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class M0 extends AbstractC0225g1 {
    private static final M0 zzb;
    private int zzd;
    private Q0 zze;
    private Q0 zzf;
    private int zzg;

    static {
        M0 m02 = new M0();
        zzb = m02;
        AbstractC0225g1.k(M0.class, m02);
    }

    public static L0 n() {
        return (L0) zzb.f();
    }

    public static /* synthetic */ void o(M0 m02, Q0 q02) {
        m02.zze = q02;
        m02.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0225g1
    public final Object d(int i3) {
        int i4 = i3 - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new C1(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", "zzf", "zzg", R0.f2777b});
        }
        if (i4 == 3) {
            return new M0();
        }
        if (i4 == 4) {
            return new L0(zzb);
        }
        if (i4 != 5) {
            return null;
        }
        return zzb;
    }
}
