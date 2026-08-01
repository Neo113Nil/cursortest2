package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.IOException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzfqy {
    private static zzfqy zza;
    private final String zzb;
    private final SharedPreferences zzc;

    private zzfqy(Context context) {
        this.zzb = context.getPackageName();
        this.zzc = context.getSharedPreferences("paid_storage_sp", 0);
    }

    static zzfqy zzb(Context context) {
        if (zza == null) {
            zza = new zzfqy(context);
        }
        return zza;
    }

    final long zza(String str, long j) {
        return this.zzc.getLong(str, -1L);
    }

    @Nullable
    final String zzc(String str, String str2) {
        return this.zzc.getString(str, null);
    }

    final void zzd(String str, Object obj) throws IOException {
        boolean commit;
        if (obj instanceof String) {
            commit = this.zzc.edit().putString(str, (String) obj).commit();
        } else if (obj instanceof Long) {
            commit = this.zzc.edit().putLong(str, ((Long) obj).longValue()).commit();
        } else {
            if (!(obj instanceof Boolean)) {
                String str2 = "Unexpected object class " + String.valueOf(obj.getClass()) + " for app " + this.zzb;
                Log.e("PaidLifecycleSPHandler", str2);
                throw new IllegalArgumentException(str2);
            }
            commit = this.zzc.edit().putBoolean(str, ((Boolean) obj).booleanValue()).commit();
        }
        if (commit) {
            return;
        }
        String str3 = "Failed to store " + str + " for app " + this.zzb;
        Log.e("PaidLifecycleSPHandler", str3);
        throw new IOException(str3);
    }

    final void zze(String str) throws IOException {
        if (this.zzc.edit().remove(str).commit()) {
            return;
        }
        String str2 = "Failed to remove " + str + " for app " + this.zzb;
        Log.e("PaidLifecycleSPHandler", str2);
        throw new IOException(str2);
    }

    final boolean zzf(String str, boolean z) {
        return this.zzc.getBoolean(str, true);
    }

    final boolean zzg(String str) {
        return this.zzc.contains(str);
    }
}
