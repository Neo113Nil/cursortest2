package com.aiming.mdt.utils;

import android.content.Context;
import android.util.Log;

/* loaded from: classes.dex */
public class AdLog {
    private static final String TAG = "Adt";
    private boolean isDebug;

    /* renamed from: com.aiming.mdt.utils.AdLog$ʻʽ, reason: contains not printable characters */
    static class C0264 {

        /* renamed from: ʻʽ, reason: contains not printable characters */
        private static final AdLog f801 = new AdLog();
    }

    private AdLog() {
        this.isDebug = false;
    }

    public static AdLog getSingleton() {
        return C0264.f801;
    }

    public void LogD(String str) {
        if (this.isDebug) {
            Log.d(TAG, str);
        }
    }

    public void LogD(String str, String str2) {
        if (this.isDebug) {
            StringBuilder sb = new StringBuilder("Adt:");
            sb.append(str);
            Log.d(sb.toString(), str2);
        }
    }

    public void LogD(String str, Throwable th) {
        if (this.isDebug) {
            Log.d(TAG, str, th);
        }
    }

    public void LogE(String str) {
        Log.e(TAG, str);
    }

    public void LogE(String str, Throwable th) {
        Log.e(TAG, str, th);
    }

    public void init(Context context) {
        if (this.isDebug) {
            return;
        }
        this.isDebug = (context == null || (context.getApplicationInfo().flags & 2) == 0) ? false : true;
    }

    public void isDebug(boolean z) {
        this.isDebug = z;
    }
}
