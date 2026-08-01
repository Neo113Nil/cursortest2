package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzazk extends zzgwm implements zzgxx {
    private static final zzazk zzb;
    private zzgwv zzd = zzaN();

    static {
        zzazk zzazkVar = new zzazk();
        zzb = zzazkVar;
        zzgwm.zzaU(zzazk.class, zzazkVar);
    }

    private zzazk() {
    }

    public static zzaze zza() {
        return (zzaze) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzazk zzazkVar, zzazd zzazdVar) {
        zzazdVar.getClass();
        zzgwv zzgwvVar = zzazkVar.zzd;
        if (!zzgwvVar.zzc()) {
            zzazkVar.zzd = zzgwm.zzaO(zzgwvVar);
        }
        zzazkVar.zzd.add(zzazdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzazd.class});
        }
        if (i2 == 3) {
            return new zzazk();
        }
        zzayw zzaywVar = null;
        if (i2 == 4) {
            return new zzaze(zzaywVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
