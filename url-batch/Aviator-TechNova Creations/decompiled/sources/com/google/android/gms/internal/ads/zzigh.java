package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzigh extends zzibr implements zzidd {
    private static final zzigh zze;
    private static volatile zzidk zzf;
    private int zza;
    private zzian zzb;
    private zzian zzc;
    private byte zzd = 2;

    static {
        zzigh zzighVar = new zzigh();
        zze = zzighVar;
        zzibr.zzbu(zzigh.class, zzighVar);
    }

    private zzigh() {
        zzian zzianVar = zzian.zza;
        this.zzb = zzianVar;
        this.zzc = zzianVar;
    }

    public static zzigg zzc() {
        return (zzigg) zze.zzbn();
    }

    final /* synthetic */ void zzd(zzian zzianVar) {
        this.zza |= 1;
        this.zzb = zzianVar;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        byte[] bArr = null;
        switch (zzibqVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzd);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzd = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbv(zze, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zza", "zzb", "zzc"});
            case NEW_MUTABLE_INSTANCE:
                return new zzigh();
            case NEW_BUILDER:
                return new zzigg(bArr);
            case GET_DEFAULT_INSTANCE:
                return zze;
            case GET_PARSER:
                zzidk zzidkVar2 = zzf;
                if (zzidkVar2 != null) {
                    return zzidkVar2;
                }
                synchronized (zzigh.class) {
                    zzidkVar = zzf;
                    if (zzidkVar == null) {
                        zzidkVar = new zzibm(zze);
                        zzf = zzidkVar;
                    }
                }
                return zzidkVar;
            default:
                throw null;
        }
    }

    final /* synthetic */ void zze(zzian zzianVar) {
        this.zza |= 2;
        this.zzc = zzianVar;
    }
}
