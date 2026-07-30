package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzhlm extends RuntimeException {
    public zzhlm(String str) {
        super(str);
    }

    public static Object zza(zzhll zzhllVar) {
        try {
            return zzhllVar.zza();
        } catch (Exception e) {
            throw new zzhlm(e);
        }
    }

    public zzhlm(String str, Throwable th) {
        super(str, th);
    }

    public zzhlm(Throwable th) {
        super(th);
    }
}
