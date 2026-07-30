package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* loaded from: classes2.dex */
public final class YM extends AbstractC3199fL {
    private static final YM zzp;
    private static volatile GL zzu;
    private int zza;
    private String zzb = "";
    private String zzc = "";
    private int zzd = 4;
    private InterfaceC3630nL zze;
    private String zzf;
    private String zzg;
    private boolean zzh;
    private double zzi;
    private InterfaceC3630nL zzj;
    private int zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;

    static {
        YM ym = new YM();
        zzp = ym;
        AbstractC3199fL.u(YM.class, ym);
    }

    public YM() {
        JL jl = JL.f25761x;
        this.zze = jl;
        this.zzf = "";
        this.zzg = "";
        this.zzj = jl;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzp, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0002\u0003\u001a\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007က\u0006\b\u001b\tဈ\u0001\n᠌\u0007\u000bဇ\b\fဇ\t\rဇ\n\u000eဇ\u000b", new Object[]{"zza", "zzb", "zzd", C3793qM.f33703r, "zze", "zzf", "zzg", "zzh", "zzi", "zzj", XM.class, "zzc", "zzk", C3793qM.f33702q, "zzl", "zzm", "zzn", "zzo"});
        }
        if (d2 == 3) {
            return new YM();
        }
        if (d2 == 4) {
            return new UL(zzp);
        }
        if (d2 == 5) {
            return zzp;
        }
        if (d2 != 6) {
            throw null;
        }
        GL gl2 = zzu;
        if (gl2 != null) {
            return gl2;
        }
        synchronized (YM.class) {
            try {
                gl = zzu;
                if (gl == null) {
                    gl = new C3144eL(zzp);
                    zzu = gl;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gl;
    }
}
