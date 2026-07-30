package com.google.android.cameraview;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes3.dex */
public class CameraHelper {
    private static final String KEY_USE_CAMERA1 = "key_use_camera1";
    private static final String SP_NAME = "camera";
    private static CameraHelper sInstance;
    private SharedPreferences mSharedPreferences;

    private CameraHelper(Context context) {
        this.mSharedPreferences = context.getSharedPreferences("camera", 0);
    }

    public static CameraHelper getInstance(Context context) {
        if (sInstance == null) {
            sInstance = new CameraHelper(context);
        }
        return sInstance;
    }

    public void setUseCamera1InFuture() {
        SharedPreferences sharedPreferences = this.mSharedPreferences;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putBoolean(KEY_USE_CAMERA1, true).apply();
        }
    }

    public boolean shouldUseCamera1() {
        SharedPreferences sharedPreferences = this.mSharedPreferences;
        if (sharedPreferences != null) {
            return sharedPreferences.getBoolean(KEY_USE_CAMERA1, false);
        }
        return false;
    }
}
