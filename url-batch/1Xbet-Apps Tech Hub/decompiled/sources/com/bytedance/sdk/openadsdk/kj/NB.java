package com.bytedance.sdk.openadsdk.kj;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Base64;

/* compiled from: PlayableHub.java */
/* loaded from: classes2.dex */
public class NB {
    protected static int Jd = 30;
    public static int Mxy = 4;
    protected static long NB = 15360;
    public static int Wyp = 8;
    protected static String icD = null;
    public static int kj = 32;
    protected static String pvs = "images";
    public static int qh = 16;
    public static int sUS = 0;
    public static int so = 2;
    protected static int vG = 1;
    public static int yiw = 1;

    protected static boolean pvs(Context context, String str) {
        return false;
    }

    protected static Bitmap pvs(String str) {
        byte[] decode = Base64.decode(str, 2);
        return BitmapFactory.decodeByteArray(decode, 0, decode.length);
    }

    public static boolean pvs(Context context, int i) {
        boolean pvs2;
        boolean pvs3;
        if (sUS == 0) {
            if (Build.VERSION.SDK_INT >= 33) {
                pvs2 = pvs(context, "android.permission.READ_MEDIA_IMAGES");
                pvs3 = true;
            } else {
                pvs2 = pvs(context, "android.permission.READ_EXTERNAL_STORAGE");
                pvs3 = pvs(context, "android.permission.WRITE_EXTERNAL_STORAGE");
            }
            boolean pvs4 = pvs(context, "android.permission.CAMERA");
            boolean pvs5 = pvs(context, "android.permission.RECORD_AUDIO");
            PackageManager packageManager = context.getPackageManager();
            if (pvs2 && pvs3) {
                sUS |= yiw;
            }
            if (pvs4 && packageManager.hasSystemFeature("android.hardware.camera")) {
                sUS |= so;
            }
            if (packageManager.hasSystemFeature("android.hardware.sensor.gyroscope")) {
                sUS |= Mxy;
            }
            if (packageManager.hasSystemFeature("android.hardware.sensor.accelerometer")) {
                sUS |= Wyp;
            }
            if (packageManager.hasSystemFeature("android.hardware.sensor.compass")) {
                sUS |= qh;
            }
            if (pvs5 && packageManager.hasSystemFeature("android.hardware.microphone")) {
                sUS |= kj;
            }
        }
        return (sUS & i) != 0;
    }

    public static boolean pvs(Context context) {
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

    public static boolean icD(Context context, String str) {
        return context.checkSelfPermission(str) == 0;
    }
}
