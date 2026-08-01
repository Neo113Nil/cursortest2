package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzfks extends zzgwm implements zzgxx {
    private static final zzfks zzb;
    private zzgwv zzd = zzaN();

    static {
        zzfks zzfksVar = new zzfks();
        zzb = zzfksVar;
        zzgwm.zzaU(zzfks.class, zzfksVar);
    }

    private zzfks() {
    }

    public static zzfkp zzc() {
        return (zzfkp) zzb.zzaA();
    }

    static /* synthetic */ void zzf(zzfks zzfksVar, zzfkr zzfkrVar) {
        zzfkrVar.getClass();
        zzgwv zzgwvVar = zzfksVar.zzd;
        if (!zzgwvVar.zzc()) {
            zzfksVar.zzd = zzgwm.zzaO(zzgwvVar);
        }
        zzfksVar.zzd.add(zzfkrVar);
    }

    public final int zza() {
        return this.zzd.size();
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzfkr.class});
        }
        if (i2 == 3) {
            return new zzfks();
        }
        zzfko zzfkoVar = null;
        if (i2 == 4) {
            return new zzfkp(zzfkoVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
