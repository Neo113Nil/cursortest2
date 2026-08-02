package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
final class zzzm implements zzcm {
    public static final /* synthetic */ int zza = 0;

    static {
        zzfvo.zza(new zzfvk() { // from class: com.google.android.gms.internal.ads.zzzk
            @Override // com.google.android.gms.internal.ads.zzfvk
            public final Object zza() {
                int i = zzzm.zza;
                try {
                    Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                    Object invoke = cls.getMethod("build", null).invoke(cls.getConstructor(null).newInstance(null), null);
                    if (invoke != null) {
                        return (zzcm) invoke;
                    }
                    throw null;
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
            }
        });
    }

    private zzzm() {
        throw null;
    }

    /* synthetic */ zzzm(zzzl zzzlVar) {
    }
}
