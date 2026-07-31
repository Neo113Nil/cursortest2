package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
public final class pu3 extends aq3<pu3, qt3> implements lr3 {
    private static final pu3 zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private tt3 zzk;
    private gu3 zzn;
    private boolean zzo;
    private boolean zzr;
    private boolean zzs;
    private ou3 zzu;
    private byte zzx = 2;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private jq3<mu3> zzl = aq3.r();
    private String zzm = "";
    private jq3<String> zzp = aq3.r();
    private String zzq = "";
    private uo3 zzt = uo3.f12885g;
    private jq3<String> zzv = aq3.r();
    private jq3<String> zzw = aq3.r();

    static {
        pu3 pu3Var = new pu3();
        zzb = pu3Var;
        aq3.v(pu3.class, pu3Var);
    }

    private pu3() {
    }

    public static qt3 F() {
        return zzb.x();
    }

    static /* synthetic */ void K(pu3 pu3Var, String str) {
        str.getClass();
        pu3Var.zze |= 4;
        pu3Var.zzh = str;
    }

    static /* synthetic */ void L(pu3 pu3Var, String str) {
        str.getClass();
        pu3Var.zze |= 8;
        pu3Var.zzi = str;
    }

    static /* synthetic */ void M(pu3 pu3Var, tt3 tt3Var) {
        tt3Var.getClass();
        pu3Var.zzk = tt3Var;
        pu3Var.zze |= 32;
    }

    static /* synthetic */ void N(pu3 pu3Var, mu3 mu3Var) {
        mu3Var.getClass();
        jq3<mu3> jq3Var = pu3Var.zzl;
        if (!jq3Var.c()) {
            pu3Var.zzl = aq3.s(jq3Var);
        }
        pu3Var.zzl.add(mu3Var);
    }

    static /* synthetic */ void O(pu3 pu3Var, String str) {
        pu3Var.zze |= 64;
        pu3Var.zzm = str;
    }

    static /* synthetic */ void P(pu3 pu3Var) {
        pu3Var.zze &= -65;
        pu3Var.zzm = zzb.zzm;
    }

    static /* synthetic */ void Q(pu3 pu3Var, gu3 gu3Var) {
        gu3Var.getClass();
        pu3Var.zzn = gu3Var;
        pu3Var.zze |= 128;
    }

    static /* synthetic */ void R(pu3 pu3Var, ou3 ou3Var) {
        ou3Var.getClass();
        pu3Var.zzu = ou3Var;
        pu3Var.zze |= 8192;
    }

    static /* synthetic */ void S(pu3 pu3Var, Iterable iterable) {
        jq3<String> jq3Var = pu3Var.zzv;
        if (!jq3Var.c()) {
            pu3Var.zzv = aq3.s(jq3Var);
        }
        bo3.k(iterable, pu3Var.zzv);
    }

    static /* synthetic */ void T(pu3 pu3Var, Iterable iterable) {
        jq3<String> jq3Var = pu3Var.zzw;
        if (!jq3Var.c()) {
            pu3Var.zzw = aq3.s(jq3Var);
        }
        bo3.k(iterable, pu3Var.zzw);
    }

    static /* synthetic */ void U(pu3 pu3Var, int i7) {
        pu3Var.zzf = i7 - 1;
        pu3Var.zze |= 1;
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return Byte.valueOf(this.zzx);
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0001\u0012\u0000\u0001\u0001\u0015\u0012\u0000\u0004\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\nဌ\u0000\u000bဌ\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0011ဉ\r\u0014\u001a\u0015\u001a", new Object[]{"zze", "zzh", "zzi", "zzj", "zzl", mu3.class, "zzo", "zzp", "zzq", "zzr", "zzs", "zzf", hu3.f6426a, "zzg", pt3.f10373a, "zzk", "zzm", "zzn", "zzt", "zzu", "zzv", "zzw"});
        }
        if (i8 == 3) {
            return new pu3();
        }
        ot3 ot3Var = null;
        if (i8 == 4) {
            return new qt3(ot3Var);
        }
        if (i8 == 5) {
            return zzb;
        }
        this.zzx = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final String H() {
        return this.zzm;
    }

    public final String I() {
        return this.zzh;
    }

    public final List<mu3> J() {
        return this.zzl;
    }
}
