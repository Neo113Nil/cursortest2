package com.unity3d.player.a;

import android.util.Log;

/* loaded from: classes.dex */
public abstract class t {
    public static boolean a = false;

    public static void Log(int i, String str) {
        if (a) {
            return;
        }
        if (i == 6) {
            Log.e("Unity", str);
        }
        if (i == 5) {
            Log.w("Unity", str);
        }
    }
}
