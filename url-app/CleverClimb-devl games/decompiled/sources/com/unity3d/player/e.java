package com.unity3d.player;

import android.util.Log;

/* loaded from: classes2.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    protected static boolean f9358a;

    protected static void Log(int i, String str) {
        if (f9358a) {
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
