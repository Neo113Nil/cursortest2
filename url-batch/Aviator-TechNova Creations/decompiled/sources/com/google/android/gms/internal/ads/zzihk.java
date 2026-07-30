package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzihk extends zzibr implements zzidd {
    private static final zzihk zzl;
    private static volatile zzidk zzm;
    private int zza;
    private int zzb;
    private zzigl zzd;
    private zzigp zze;
    private int zzf;
    private int zzi;
    private byte zzk = 2;
    private String zzc = "";
    private zzibz zzg = zzbC();
    private String zzh = "";
    private zzicd zzj = zzibr.zzbM();

    static {
        zzihk zzihkVar = new zzihk();
        zzl = zzihkVar;
        zzibr.zzbu(zzihk.class, zzihkVar);
    }

    private zzihk() {
    }

    public static zzihj zze() {
        return (zzihj) zzl.zzbn();
    }

    public final String zzc() {
        return this.zzc;
    }

    public final int zzd() {
        return this.zzj.size();
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        byte[] bArr = null;
        switch (zzibqVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzk);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzk = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbv(zzl, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\b᠌\u0006\t\u001a", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", zzihh.zza, "zzj"});
            case NEW_MUTABLE_INSTANCE:
                return new zzihk();
            case NEW_BUILDER:
                return new zzihj(bArr);
            case GET_DEFAULT_INSTANCE:
                return zzl;
            case GET_PARSER:
                zzidk zzidkVar2 = zzm;
                if (zzidkVar2 != null) {
                    return zzidkVar2;
                }
                synchronized (zzihk.class) {
                    zzidkVar = zzm;
                    if (zzidkVar == null) {
                        zzidkVar = new zzibm(zzl);
                        zzm = zzidkVar;
                    }
                }
                return zzidkVar;
            default:
                throw null;
        }
    }

    final /* synthetic */ void zzg(int i) {
        this.zza |= 1;
        this.zzb = i;
    }

    final /* synthetic */ void zzh(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    final /* synthetic */ void zzi(zzigl zziglVar) {
        zziglVar.getClass();
        this.zzd = zziglVar;
        this.zza |= 4;
    }

    final /* synthetic */ void zzj(String str) {
        str.getClass();
        zzicd zzicdVar = this.zzj;
        if (!zzicdVar.zza()) {
            this.zzj = zzibr.zzbN(zzicdVar);
        }
        this.zzj.add(str);
    }

    final /* synthetic */ void zzl(int i) {
        this.zzi = i - 1;
        this.zza |= 64;
    }
}
