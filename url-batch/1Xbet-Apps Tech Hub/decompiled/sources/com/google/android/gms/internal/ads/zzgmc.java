package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgmc extends RuntimeException {
    public zzgmc(String str) {
        super(str);
    }

    public static Object zza(zzgmb zzgmbVar) {
        try {
            return zzgmbVar.zza();
        } catch (Exception e) {
            throw new zzgmc(e);
        }
    }

    public zzgmc(String str, Throwable th) {
        super(str, th);
    }

    public zzgmc(Throwable th) {
        super(th);
    }
}
