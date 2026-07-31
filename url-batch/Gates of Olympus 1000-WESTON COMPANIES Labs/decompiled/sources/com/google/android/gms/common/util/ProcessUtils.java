package com.google.android.gms.common.util;

import android.app.Application;
import android.os.Process;
import com.google.android.gms.internal.common.zzi;
import com.google.android.gms.internal.common.zzj;
import com.google.android.gms.internal.common.zzx;
import com.google.android.gms.internal.common.zzy;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes.dex */
public class ProcessUtils {

    @Nullable
    private static String zza;
    private static int zzb;

    @Nullable
    private static Boolean zzc;

    private ProcessUtils() {
    }

    public static boolean zza() {
        Boolean bool = zzc;
        if (bool == null) {
            if (PlatformVersion.isAtLeastP()) {
                bool = Boolean.valueOf(Process.isIsolated());
            } else {
                try {
                    Object zza2 = zzj.zza(Process.class, "isIsolated", new zzi[0]);
                    Object[] objArr = new Object[0];
                    if (zza2 == null) {
                        throw new zzy(zzx.zza("expected a non-null reference", objArr));
                    }
                    bool = (Boolean) zza2;
                } catch (ReflectiveOperationException unused) {
                    bool = false;
                }
            }
            zzc = bool;
        }
        return bool.booleanValue();
    }

    public static String getMyProcessName() {
        if (zza == null) {
            zza = Application.getProcessName();
        }
        return zza;
    }
}
