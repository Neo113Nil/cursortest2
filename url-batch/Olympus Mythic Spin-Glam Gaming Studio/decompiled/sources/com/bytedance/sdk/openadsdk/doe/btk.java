package com.bytedance.sdk.openadsdk.doe;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Base64;

/* loaded from: classes5.dex */
public class btk {
    protected static long btk = 15360;
    public static int bvs = 4;
    protected static int fb = 30;
    protected static String fs = null;
    public static int hhw = 0;
    public static int iv = 8;
    public static int klz = 32;
    public static int nps = 1;
    public static int rc = 16;
    public static int zg = 2;
    protected static String zmn = "images";
    protected static int zn = 1;

    protected static boolean zmn(Context context, String str) {
        return false;
    }

    protected static Bitmap zmn(String str) {
        byte[] decode = Base64.decode(str, 2);
        return BitmapFactory.decodeByteArray(decode, 0, decode.length);
    }

    public static boolean zmn(Context context, int i) {
        boolean zmn2;
        boolean zmn3;
        if (hhw == 0) {
            if (Build.VERSION.SDK_INT >= 33) {
                zmn2 = zmn(context, "android.permission.READ_MEDIA_IMAGES");
                zmn3 = true;
            } else {
                zmn2 = zmn(context, "android.permission.READ_EXTERNAL_STORAGE");
                zmn3 = zmn(context, "android.permission.WRITE_EXTERNAL_STORAGE");
            }
            boolean zmn4 = zmn(context, "android.permission.CAMERA");
            boolean zmn5 = zmn(context, "android.permission.RECORD_AUDIO");
            PackageManager packageManager = context.getPackageManager();
            if (zmn2 && zmn3) {
                hhw |= nps;
            }
            if (zmn4 && packageManager.hasSystemFeature("android.hardware.camera")) {
                hhw |= zg;
            }
            if (packageManager.hasSystemFeature("android.hardware.sensor.gyroscope")) {
                hhw |= bvs;
            }
            if (packageManager.hasSystemFeature("android.hardware.sensor.accelerometer")) {
                hhw |= iv;
            }
            if (packageManager.hasSystemFeature("android.hardware.sensor.compass")) {
                hhw |= rc;
            }
            if (zmn5 && packageManager.hasSystemFeature("android.hardware.microphone")) {
                hhw |= klz;
            }
        }
        return (hhw & i) != 0;
    }

    public static boolean zmn(Context context) {
        boolean z;
        boolean z2;
        if (Build.VERSION.SDK_INT >= 33) {
            z = context.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0;
        } else {
            z = context.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0;
            if (context.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                z2 = false;
                return !z2 && z;
            }
        }
        z2 = true;
        if (z2) {
        }
    }

    public static boolean fs(Context context, String str) {
        return context.checkSelfPermission(str) == 0;
    }

    public static float fs(Context context) {
        if (context == null) {
            return 0.0f;
        }
        return context.getResources().getDisplayMetrics().density;
    }
}
