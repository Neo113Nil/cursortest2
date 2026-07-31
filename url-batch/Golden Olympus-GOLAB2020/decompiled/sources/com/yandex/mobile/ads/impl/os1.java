package com.yandex.mobile.ads.impl;

import android.os.Build;
import java.io.File;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class os1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final os1 f30189a = new os1();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String[] f30190b = {"/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su"};

    private os1() {
    }

    public static boolean a() {
        try {
            if (new File("/system/app/Superuser/Superuser.apk").exists()) {
                return true;
            }
        } catch (Throwable unused) {
        }
        try {
            String[] strArr = f30190b;
            boolean z4 = false;
            for (int i4 = 0; i4 < 8; i4++) {
                z4 = z4 || (Build.VERSION.SDK_INT < 31 && new File(strArr[i4]).exists());
            }
            if (z4) {
                return true;
            }
        } catch (Throwable unused2) {
        }
        return false;
    }
}
