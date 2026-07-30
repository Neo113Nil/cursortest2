package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final /* synthetic */ class zzaen implements zzaeo {
    static final /* synthetic */ zzaen zza = new zzaen();

    private /* synthetic */ zzaen() {
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final /* synthetic */ Constructor zza() {
        int i = zzaeq.zza;
        if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
            return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(zzaeu.class).getConstructor(Integer.TYPE);
        }
        return null;
    }
}
