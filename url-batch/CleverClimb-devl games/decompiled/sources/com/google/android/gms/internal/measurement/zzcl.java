package com.google.android.gms.internal.measurement;

import android.annotation.SuppressLint;
import android.util.Log;
import com.google.android.gms.analytics.Logger;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
@Deprecated
/* loaded from: classes2.dex */
public final class zzcl {
    private static volatile Logger zzaap = new zzbv();

    @VisibleForTesting
    public static Logger getLogger() {
        return zzaap;
    }

    private static boolean isLoggable(int i) {
        return zzaap != null && zzaap.getLogLevel() <= i;
    }

    @VisibleForTesting
    public static void setLogger(Logger logger) {
        zzaap = logger;
    }

    @SuppressLint({"LogTagMismatch"})
    public static void v(String str) {
        zzcm zzes = zzcm.zzes();
        if (zzes != null) {
            zzes.zzq(str);
        } else if (isLoggable(0)) {
            Log.v(zzcc.zzyh.get(), str);
        }
        Logger logger = zzaap;
        if (logger != null) {
            logger.verbose(str);
        }
    }

    @SuppressLint({"LogTagMismatch"})
    public static void zzab(String str) {
        zzcm zzes = zzcm.zzes();
        if (zzes != null) {
            zzes.zzt(str);
        } else if (isLoggable(2)) {
            Log.w(zzcc.zzyh.get(), str);
        }
        Logger logger = zzaap;
        if (logger != null) {
            logger.warn(str);
        }
    }

    @SuppressLint({"LogTagMismatch"})
    public static void zzf(String str, Object obj) {
        String str2;
        zzcm zzes = zzcm.zzes();
        if (zzes != null) {
            zzes.zze(str, obj);
        } else if (isLoggable(3)) {
            if (obj != null) {
                String valueOf = String.valueOf(obj);
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(valueOf).length());
                sb.append(str);
                sb.append(":");
                sb.append(valueOf);
                str2 = sb.toString();
            } else {
                str2 = str;
            }
            Log.e(zzcc.zzyh.get(), str2);
        }
        Logger logger = zzaap;
        if (logger != null) {
            logger.error(str);
        }
    }
}
