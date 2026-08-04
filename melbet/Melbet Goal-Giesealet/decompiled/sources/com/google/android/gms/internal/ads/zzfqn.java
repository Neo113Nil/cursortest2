package com.google.android.gms.internal.ads;

import java.io.File;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public interface zzfqn {
    static String zzb(File file, String str, zzfqr zzfqrVar) {
        return new File(file, str).getPath();
    }

    default String zza(File file, String str) {
        return zzb(file, str, zzfqr.zza);
    }
}
