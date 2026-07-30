package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzhpn extends zzibr implements zzidd {
    private static final zzhpn zzb;
    private static volatile zzidk zzc;
    private int zza;

    static {
        zzhpn zzhpnVar = new zzhpn();
        zzb = zzhpnVar;
        zzibr.zzbu(zzhpn.class, zzhpnVar);
    }

    private zzhpn() {
    }

    public static zzhpn zzb(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhpn) zzibr.zzbT(zzb, zzianVar, zzibbVar);
    }

    public static zzhpn zzc() {
        return zzb;
    }

    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zza"});
        }
        if (ordinal == 3) {
            return new zzhpn();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhpm(bArr);
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
        synchronized (zzhpn.class) {
            zzidkVar = zzc;
            if (zzidkVar == null) {
                zzidkVar = new zzibm(zzb);
                zzc = zzidkVar;
            }
        }
        return zzidkVar;
    }
}
