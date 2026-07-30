package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzaxx extends zzibr implements zzidd {
    private static final zzaxx zzf;
    private static volatile zzidk zzg;
    private int zza;
    private zzicd zzb = zzbM();
    private zzian zzc = zzian.zza;
    private int zzd = 1;
    private int zze = 1;

    static {
        zzaxx zzaxxVar = new zzaxx();
        zzf = zzaxxVar;
        zzibr.zzbu(zzaxx.class, zzaxxVar);
    }

    private zzaxx() {
    }

    public static zzaxw zza() {
        return (zzaxw) zzf.zzbn();
    }

    final /* synthetic */ void zzb(zzian zzianVar) {
        zzicd zzicdVar = this.zzb;
        if (!zzicdVar.zza()) {
            this.zzb = zzibr.zzbN(zzicdVar);
        }
        this.zzb.add(zzianVar);
    }

    final /* synthetic */ void zzc(zzian zzianVar) {
        this.zza |= 1;
        this.zzc = zzianVar;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003᠌\u0001\u0004᠌\u0002", new Object[]{"zza", "zzb", "zzc", "zzd", zzaxr.zza, "zze", zzaxn.zza});
        }
        if (ordinal == 3) {
            return new zzaxx();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzaxw(bArr);
        }
        if (ordinal == 5) {
            return zzf;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar2 = zzg;
        if (zzidkVar2 != null) {
            return zzidkVar2;
        }
        synchronized (zzaxx.class) {
            zzidkVar = zzg;
            if (zzidkVar == null) {
                zzidkVar = new zzibm(zzf);
                zzg = zzidkVar;
            }
        }
        return zzidkVar;
    }

    final /* synthetic */ void zze(int i) {
        this.zzd = 4;
        this.zza |= 2;
    }

    final /* synthetic */ void zzg(int i) {
        this.zze = i - 1;
        this.zza |= 4;
    }
}
