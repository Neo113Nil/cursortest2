package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgsk extends zzgwm implements zzgxx {
    private static final zzgsk zzb;
    private String zzd = "";

    static {
        zzgsk zzgskVar = new zzgsk();
        zzb = zzgskVar;
        zzgwm.zzaU(zzgsk.class, zzgskVar);
    }

    private zzgsk() {
    }

    public static zzgsj zza() {
        return (zzgsj) zzb.zzaA();
    }

    public static zzgsk zzd() {
        return zzb;
    }

    public static zzgsk zze(zzgve zzgveVar, zzgvy zzgvyVar) throws zzgwy {
        return (zzgsk) zzgwm.zzaG(zzb, zzgveVar, zzgvyVar);
    }

    static /* synthetic */ void zzg(zzgsk zzgskVar, String str) {
        str.getClass();
        zzgskVar.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzd"});
        }
        if (i2 == 3) {
            return new zzgsk();
        }
        zzgsi zzgsiVar = null;
        if (i2 == 4) {
            return new zzgsj(zzgsiVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final String zzf() {
        return this.zzd;
    }
}
