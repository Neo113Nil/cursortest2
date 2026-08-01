package com.google.android.gms.internal.ads;

import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbt {
    private static final HashSet zza = new HashSet();
    private static String zzb = "media3.common";

    public static synchronized String zza() {
        String str;
        synchronized (zzbt.class) {
            str = zzb;
        }
        return str;
    }

    public static synchronized void zzb(String str) {
        synchronized (zzbt.class) {
            if (zza.add(str)) {
                zzb = zzb + ", " + str;
            }
        }
    }
}
