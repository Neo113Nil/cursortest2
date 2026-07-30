package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;
import android.util.Log;
import androidx.annotation.GuardedBy;

/* loaded from: classes3.dex */
public final class zzcc {

    @GuardedBy("DirectBootUtils.class")
    private static UserManager zza;
    private static volatile boolean zzb = !zzb();

    private zzcc() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x003f, code lost:
    
        if (r4.isUserRunning(android.os.Process.myUserHandle()) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0041, code lost:
    
        r8 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean zza(Context context) {
        int i8;
        boolean z7;
        boolean isUserUnlocked;
        Object systemService;
        if (zzb() && !zzb) {
            synchronized (zzcc.class) {
                try {
                    if (!zzb) {
                        i8 = 1;
                        while (true) {
                            if (i8 <= 2) {
                                if (zza == null) {
                                    systemService = context.getSystemService((Class<Object>) UserManager.class);
                                    zza = (UserManager) systemService;
                                }
                                UserManager userManager = zza;
                                if (userManager != null) {
                                    isUserUnlocked = userManager.isUserUnlocked();
                                    if (isUserUnlocked) {
                                        break;
                                    }
                                } else {
                                    z7 = true;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        z7 = false;
                        if (z7) {
                            zza = null;
                        }
                        if (z7) {
                            zzb = true;
                        }
                        if (!z7) {
                            return true;
                        }
                    }
                } catch (NullPointerException e8) {
                    Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e8);
                    zza = null;
                    i8++;
                } finally {
                }
            }
        }
        return false;
    }

    public static boolean zzb() {
        return Build.VERSION.SDK_INT >= 24;
    }
}
