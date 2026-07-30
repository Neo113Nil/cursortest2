package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.m9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3564m9 extends AbstractC3199fL {
    private static final C3564m9 zzB;
    private static volatile GL zzC = null;
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    public static final int zzg = 7;
    public static final int zzh = 8;
    public static final int zzi = 9;
    public static final int zzj = 10;
    public static final int zzk = 11;
    private C3618n9 zzA;
    private int zzl;
    private int zzm = 1000;
    private int zzn = 1000;
    private int zzo;
    private int zzp;
    private int zzu;
    private int zzv;
    private int zzw;
    private int zzx;
    private int zzy;
    private int zzz;

    static {
        C3564m9 c3564m9 = new C3564m9();
        zzB = c3564m9;
        AbstractC3199fL.u(C3564m9.class, c3564m9);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            C3293h6 c3293h6 = C3293h6.f31172x;
            return new KL(zzB, "\u0004\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\u000bဉ\n", new Object[]{"zzl", "zzm", c3293h6, "zzn", c3293h6, "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA"});
        }
        if (d2 == 3) {
            return new C3564m9();
        }
        if (d2 == 4) {
            return new C3453k6(zzB);
        }
        if (d2 == 5) {
            return zzB;
        }
        if (d2 != 6) {
            throw null;
        }
        GL gl2 = zzC;
        if (gl2 != null) {
            return gl2;
        }
        synchronized (C3564m9.class) {
            try {
                gl = zzC;
                if (gl == null) {
                    gl = new C3144eL(zzB);
                    zzC = gl;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gl;
    }
}
