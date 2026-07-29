package com.facebook.ads.internal.q.e;

import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f5470a = "a";

    public static boolean a(Context context) {
        return b(context) && b.b(context);
    }

    public static boolean b(Context context) {
        if (context == null) {
            Log.v(f5470a, "Invalid context in screen interactive check, assuming interactive.");
            return true;
        }
        try {
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            return Build.VERSION.SDK_INT >= 20 ? powerManager.isInteractive() : powerManager.isScreenOn();
        } catch (Exception e) {
            Log.e(f5470a, "Exception in screen interactive check, assuming interactive.", e);
            com.facebook.ads.internal.q.d.a.a(e, context);
            return true;
        }
    }
}
