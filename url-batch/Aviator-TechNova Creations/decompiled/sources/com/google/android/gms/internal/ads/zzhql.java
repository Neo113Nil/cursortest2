package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzhql extends zzibr implements zzidd {
    private static final zzhql zzc;
    private static volatile zzidk zzd;
    private int zza;
    private zzicd zzb = zzbM();

    static {
        zzhql zzhqlVar = new zzhql();
        zzc = zzhqlVar;
        zzibr.zzbu(zzhql.class, zzhqlVar);
    }

    private zzhql() {
    }

    public static zzhql zze(byte[] bArr, zzibb zzibbVar) throws zzicg {
        return (zzhql) zzibr.zzbV(zzc, bArr, zzibbVar);
    }

    public static zzhql zzg(InputStream inputStream, zzibb zzibbVar) throws IOException {
        return (zzhql) zzibr.zzbX(zzc, inputStream, zzibbVar);
    }

    public static zzhqi zzh() {
        return (zzhqi) zzc.zzbn();
    }

    public final int zza() {
        return this.zza;
    }

    public final List zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zzb.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzhqk zzd(int i) {
        return (zzhqk) this.zzb.get(i);
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zza", "zzb", zzhqk.class});
        }
        if (ordinal == 3) {
            return new zzhql();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhqi(bArr);
        }
        if (ordinal == 5) {
            return zzc;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar2 = zzd;
        if (zzidkVar2 != null) {
            return zzidkVar2;
        }
        synchronized (zzhql.class) {
            zzidkVar = zzd;
            if (zzidkVar == null) {
                zzidkVar = new zzibm(zzc);
                zzd = zzidkVar;
            }
        }
        return zzidkVar;
    }

    final /* synthetic */ void zzi(int i) {
        this.zza = i;
    }

    final /* synthetic */ void zzj(zzhqk zzhqkVar) {
        zzhqkVar.getClass();
        zzicd zzicdVar = this.zzb;
        if (!zzicdVar.zza()) {
            this.zzb = zzibr.zzbN(zzicdVar);
        }
        this.zzb.add(zzhqkVar);
    }
}
