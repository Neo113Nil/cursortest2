package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzifl extends zzibr implements zzidd {
    private static final zzifl zzb;
    private static volatile zzidk zzc;
    private zzicd zza = zzbM();

    static {
        zzifl zziflVar = new zzifl();
        zzb = zziflVar;
        zzibr.zzbu(zzifl.class, zziflVar);
    }

    private zzifl() {
    }

    public static zzifk zzc() {
        return (zzifk) zzb.zzbn();
    }

    final /* synthetic */ void zzd(zzifj zzifjVar) {
        zzifjVar.getClass();
        zzicd zzicdVar = this.zza;
        if (!zzicdVar.zza()) {
            this.zza = zzibr.zzbN(zzicdVar);
        }
        this.zza.add(zzifjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", zzifj.class});
        }
        if (ordinal == 3) {
            return new zzifl();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzifk(bArr);
        }
        if (ordinal == 5) {
            return zzb;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar2 = zzc;
        if (zzidkVar2 != null) {
            return zzidkVar2;
        }
        synchronized (zzifl.class) {
            zzidkVar = zzc;
            if (zzidkVar == null) {
                zzidkVar = new zzibm(zzb);
                zzc = zzidkVar;
            }
        }
        return zzidkVar;
    }
}
