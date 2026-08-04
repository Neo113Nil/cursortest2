package com.google.android.gms.internal.ads;

import android.os.StrictMode;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzbck {
    public static Object zza(zzght zzghtVar) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            return zzghtVar.zza();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
