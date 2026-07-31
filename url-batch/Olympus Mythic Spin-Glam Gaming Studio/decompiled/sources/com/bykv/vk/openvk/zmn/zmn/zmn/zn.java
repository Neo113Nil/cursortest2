package com.bykv.vk.openvk.zmn.zmn.zmn;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.fs.zmn.rc;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class zn {
    private static int btk = 1;
    private static rc fb;
    private static Context fs;
    public static boolean zmn;
    private static String zn;

    public static Context zmn() {
        return fs;
    }

    public static String fs() {
        if (TextUtils.isEmpty(zn)) {
            try {
                File file = new File(zmn().getFilesDir(), "ttad_dir");
                if (!file.exists()) {
                    file.mkdirs();
                }
                zn = file.getAbsolutePath();
            } catch (Throwable unused) {
            }
        }
        return zn;
    }

    public static void zmn(Context context, String str) {
        fs = context;
        zn = str;
    }

    public static rc zn() {
        if (fb == null) {
            rc.zmn zmnVar = new rc.zmn("v_config");
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            fb = zmnVar.zmn(10000L, timeUnit).fs(10000L, timeUnit).zn(10000L, timeUnit).zmn();
        }
        return fb;
    }

    public static void zmn(rc rcVar) {
        fb = rcVar;
    }

    public static boolean fb() {
        return zmn;
    }

    public static void zmn(int i) {
        btk = i;
    }

    public static int btk() {
        return btk;
    }
}
