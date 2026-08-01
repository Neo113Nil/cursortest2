package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzhl extends zzhj {
    public final int zzd;
    public final String zze;
    public final Map zzf;
    public final byte[] zzg;

    public zzhl(int i, String str, IOException iOException, Map map, zzgv zzgvVar, byte[] bArr) {
        super("Response code: " + i, iOException, zzgvVar, AdError.INTERNAL_ERROR_2004, 1);
        this.zzd = i;
        this.zze = str;
        this.zzf = map;
        this.zzg = bArr;
    }
}
