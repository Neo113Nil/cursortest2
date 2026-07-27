package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class U1 extends AbstractC0334g1 {
    private static final U1 zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private String zzf = "";
    private String zzh = "";

    static {
        U1 u12 = new U1();
        zzb = u12;
        AbstractC0334g1.k(U1.class, u12);
    }

    public static /* synthetic */ void n(U1 u12, String str) {
        u12.zzd |= 8;
        u12.zzh = str;
    }

    public static /* synthetic */ void o(U1 u12, String str) {
        str.getClass();
        u12.zzd |= 2;
        u12.zzf = str;
    }

    public static /* synthetic */ void p(U1 u12, int i2) {
        u12.zzd |= 1;
        u12.zze = i2;
    }

    public static /* synthetic */ void q(U1 u12, int i2) {
        u12.zzg = i2 - 1;
        u12.zzd |= 4;
    }

    public static T1 r() {
        return (T1) zzb.f();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0334g1
    public final Object d(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new C1(zzb, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", R0.f5093d, "zzh"});
        }
        if (i3 == 3) {
            return new U1();
        }
        if (i3 == 4) {
            return new T1(zzb);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
