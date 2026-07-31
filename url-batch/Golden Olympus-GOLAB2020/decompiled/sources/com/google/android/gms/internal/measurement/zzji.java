package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.UserManager;
import android.util.Log;

/* loaded from: classes.dex */
public final class zzji {
    private static UserManager zza;
    private static volatile boolean zzb = !zzc();

    private zzji() {
    }

    public static boolean zza(Context context) {
        return zzc() && !zzd(context);
    }

    public static boolean zzb(Context context) {
        return !zzc() || zzd(context);
    }

    public static boolean zzc() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0039, code lost:
    
        if (r3.isUserRunning(android.os.Process.myUserHandle()) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003b, code lost:
    
        r5 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean zzd(Context context) {
        boolean z4;
        if (zzb) {
            return true;
        }
        synchronized (zzji.class) {
            try {
                if (zzb) {
                    return true;
                }
                int i4 = 1;
                while (true) {
                    z4 = false;
                    if (i4 > 2) {
                        break;
                    }
                    if (zza == null) {
                        zza = (UserManager) context.getSystemService(UserManager.class);
                    }
                    UserManager userManager = zza;
                    if (userManager == null) {
                        z4 = true;
                        break;
                    }
                    try {
                        if (userManager.isUserUnlocked()) {
                            break;
                        }
                    } catch (NullPointerException e4) {
                        Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e4);
                        zza = null;
                        i4++;
                    }
                }
                if (z4) {
                    zza = null;
                }
                if (z4) {
                    zzb = true;
                }
                return z4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
