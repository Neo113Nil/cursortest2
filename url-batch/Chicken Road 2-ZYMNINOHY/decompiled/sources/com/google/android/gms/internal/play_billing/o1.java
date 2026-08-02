package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class o1 extends AbstractC0353w0 {
    private static final o1 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private int zzh;
    private long zzi;
    private long zzj;
    private boolean zzk;
    private int zzl;
    private int zzm;
    private long zzn;

    static {
        o1 o1Var = new o1();
        zzb = o1Var;
        AbstractC0353w0.k(o1.class, o1Var);
    }

    public static /* synthetic */ void n(o1 o1Var, int i4) {
        o1Var.zzd |= 128;
        o1Var.zzl = i4;
    }

    public static /* synthetic */ void o(o1 o1Var, int i4) {
        o1Var.zzd |= 256;
        o1Var.zzm = i4;
    }

    public static /* synthetic */ void p(o1 o1Var, int i4) {
        o1Var.zzd |= 8;
        o1Var.zzh = i4;
    }

    public static /* synthetic */ void q(o1 o1Var, long j4) {
        o1Var.zzd |= 16;
        o1Var.zzi = j4;
    }

    public static /* synthetic */ void r(o1 o1Var, long j4) {
        o1Var.zzd |= 32;
        o1Var.zzj = j4;
    }

    public static /* synthetic */ void s(o1 o1Var) {
        o1Var.zzd |= 512;
        o1Var.zzn = 772604006L;
    }

    public static /* synthetic */ void t(o1 o1Var, String str) {
        str.getClass();
        o1Var.zzd |= 4;
        o1Var.zzg = str;
    }

    public static /* synthetic */ void u(o1 o1Var) {
        o1Var.zzd |= 64;
        o1Var.zzk = false;
    }

    public static /* synthetic */ void v(o1 o1Var) {
        o1Var.zzd |= 1;
        o1Var.zze = "8.0.0";
    }

    public static /* synthetic */ void w(o1 o1Var, String str) {
        o1Var.zzd |= 2;
        o1Var.zzf = str;
    }

    public static n1 x() {
        return (n1) zzb.f();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0353w0
    public final Object d(int i4) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new R0(zzb, "\u0004\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003င\u0003\u0004ဂ\u0004\u0005ဈ\u0001\u0006ဂ\u0005\u0007ဇ\u0006\bင\u0007\tင\b\nဂ\t", new Object[]{"zzd", "zze", "zzg", "zzh", "zzi", "zzf", "zzj", "zzk", "zzl", "zzm", "zzn"});
        }
        if (i5 == 3) {
            return new o1();
        }
        if (i5 == 4) {
            return new n1(zzb);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }
}
