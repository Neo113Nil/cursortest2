package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes3.dex */
public final class zzhc extends zzha {
    public final int zzc;

    public zzhc(int i, String str, IOException iOException, Map map, zzgo zzgoVar, byte[] bArr) {
        super("Response code: " + i, iOException, zzgoVar, AdError.INTERNAL_ERROR_2004, 1);
        this.zzc = i;
    }
}
