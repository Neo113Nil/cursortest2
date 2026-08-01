package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzzv implements zzdp {
    private static final zzfuo zza = zzfur.zza(new zzfuo() { // from class: com.google.android.gms.internal.ads.zzzt
        @Override // com.google.android.gms.internal.ads.zzfuo
        public final Object zza() {
            try {
                Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                Object invoke = cls.getMethod("build", new Class[0]).invoke(cls.getConstructor(new Class[0]).newInstance(new Object[0]), new Object[0]);
                invoke.getClass();
                return (zzdp) invoke;
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }
    });

    private zzzv() {
    }

    /* synthetic */ zzzv(zzzu zzzuVar) {
    }
}
