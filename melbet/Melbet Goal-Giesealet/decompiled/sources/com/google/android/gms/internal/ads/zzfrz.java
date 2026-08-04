package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzfrz extends zzhih implements zzhjt {
    private static final zzfrz zzb;
    private static volatile zzhka zzc;
    private zzhjm zza = zzhjm.zza();

    static {
        zzfrz zzfrzVar = new zzfrz();
        zzb = zzfrzVar;
        zzhih.zzbu(zzfrz.class, zzfrzVar);
    }

    private zzfrz() {
    }

    public static zzfrz zzc(InputStream inputStream) throws IOException {
        return (zzfrz) zzhih.zzbW(zzb, inputStream);
    }

    public static zzfrz zzd() {
        return zzb;
    }

    public final int zza() {
        return this.zza.size();
    }

    public final Map zzb() {
        return Collections.unmodifiableMap(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhkaVar;
        int ordinal = zzhigVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"zza", zzfry.zza});
        }
        if (ordinal == 3) {
            return new zzfrz();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzfrx(bArr);
        }
        if (ordinal == 5) {
            return zzb;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzhka zzhkaVar2 = zzc;
        if (zzhkaVar2 != null) {
            return zzhkaVar2;
        }
        synchronized (zzfrz.class) {
            zzhkaVar = zzc;
            if (zzhkaVar == null) {
                zzhkaVar = new zzhic(zzb);
                zzc = zzhkaVar;
            }
        }
        return zzhkaVar;
    }

    final /* synthetic */ Map zze() {
        if (!this.zza.zze()) {
            this.zza = this.zza.zzc();
        }
        return this.zza;
    }
}
