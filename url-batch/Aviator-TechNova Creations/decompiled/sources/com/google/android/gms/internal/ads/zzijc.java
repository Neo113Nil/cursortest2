package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzijc extends zzibr implements zzidd {
    private static final zzijc zzl;
    private static volatile zzidk zzm;
    private int zza;
    private long zzd;
    private zzije zzi;
    private zzijg zzj;
    private zzhyi zzk;
    private zzian zzb = zzian.zza;
    private zzibz zzc = zzbC();
    private zzibz zze = zzbC();
    private zzicd zzf = zzibr.zzbM();
    private String zzg = "";
    private zzicd zzh = zzbM();

    static {
        zzijc zzijcVar = new zzijc();
        zzl = zzijcVar;
        zzibr.zzbu(zzijc.class, zzijcVar);
    }

    private zzijc() {
    }

    public static zzijc zzc(byte[] bArr, zzibb zzibbVar) throws zzicg {
        return (zzijc) zzibr.zzbV(zzl, bArr, zzibbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzl, "\u0001\n\u0000\u0001\u0001\u000f\n\u0000\u0004\u0000\u0001'\u0002ဂ\u0001\u0003'\u0004\u001b\u0005ဉ\u0003\u0007ဈ\u0002\tဉ\u0004\n\u001a\rည\u0000\u000fဉ\u0005", new Object[]{"zza", "zzc", "zzd", "zze", "zzh", zziir.class, "zzi", "zzg", "zzj", "zzf", "zzb", "zzk"});
        }
        if (ordinal == 3) {
            return new zzijc();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzijb(bArr);
        }
        if (ordinal == 5) {
            return zzl;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar2 = zzm;
        if (zzidkVar2 != null) {
            return zzidkVar2;
        }
        synchronized (zzijc.class) {
            zzidkVar = zzm;
            if (zzidkVar == null) {
                zzidkVar = new zzibm(zzl);
                zzm = zzidkVar;
            }
        }
        return zzidkVar;
    }
}
