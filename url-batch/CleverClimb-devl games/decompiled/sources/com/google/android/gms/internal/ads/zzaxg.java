package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbbo;

/* loaded from: classes2.dex */
public final class zzaxg extends zzbbo<zzaxg, zza> implements zzbcw {
    private static volatile zzbdf<zzaxg> zzakh;
    private static final zzaxg zzdkr = new zzaxg();
    private int zzdkp;
    private int zzdkq;

    public static final class zza extends zzbbo.zza<zzaxg, zza> implements zzbcw {
        private zza() {
            super(zzaxg.zzdkr);
        }

        /* synthetic */ zza(zzaxh zzaxhVar) {
            this();
        }
    }

    static {
        zzbbo.zza((Class<zzaxg>) zzaxg.class, zzdkr);
    }

    private zzaxg() {
    }

    public static zzaxg zzyu() {
        return zzdkr;
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.zzbbo$zzb, com.google.android.gms.internal.ads.zzbdf<com.google.android.gms.internal.ads.zzaxg>] */
    @Override // com.google.android.gms.internal.ads.zzbbo
    protected final Object zza(int i, Object obj, Object obj2) {
        zzbdf<zzaxg> zzbdfVar;
        zzaxh zzaxhVar = null;
        switch (zzaxh.zzakf[i - 1]) {
            case 1:
                return new zzaxg();
            case 2:
                return new zza(zzaxhVar);
            case 3:
                return zza(zzdkr, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0003\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzdkp", "zzdkq"});
            case 4:
                return zzdkr;
            case 5:
                zzbdf<zzaxg> zzbdfVar2 = zzakh;
                zzbdf<zzaxg> zzbdfVar3 = zzbdfVar2;
                if (zzbdfVar2 == null) {
                    synchronized (zzaxg.class) {
                        zzbdf<zzaxg> zzbdfVar4 = zzakh;
                        zzbdfVar = zzbdfVar4;
                        if (zzbdfVar4 == null) {
                            ?? zzbVar = new zzbbo.zzb(zzdkr);
                            zzakh = zzbVar;
                            zzbdfVar = zzbVar;
                        }
                    }
                    zzbdfVar3 = zzbdfVar;
                }
                return zzbdfVar3;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final zzaxa zzys() {
        zzaxa zzau = zzaxa.zzau(this.zzdkp);
        return zzau == null ? zzaxa.UNRECOGNIZED : zzau;
    }

    public final int zzyt() {
        return this.zzdkq;
    }
}
