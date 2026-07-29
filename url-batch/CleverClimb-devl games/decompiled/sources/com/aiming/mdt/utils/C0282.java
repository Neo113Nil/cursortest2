package com.aiming.mdt.utils;

import android.content.Context;
import android.util.Log;
import java.io.File;

/* renamed from: com.aiming.mdt.utils.ʻʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0282 {

    /* renamed from: ʼ, reason: contains not printable characters */
    private static boolean f823;

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public static void m968(Context context, boolean z) {
        f823 = z || (context != null && new File(context.getFilesDir(), "log.txt").exists());
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public static void m969(String str) {
        if (f823) {
            Log.e("AdtDeveloper", str);
        }
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public static void m970(String str, Throwable th) {
        if (f823) {
            Log.e("AdtDeveloper", str, th);
        }
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    public static void m971(String str) {
        if (f823) {
            Log.d("AdtDeveloper", str);
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static void m972(String str, Throwable th) {
        if (f823) {
            Log.d("AdtDeveloper", str, th);
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static void m973(String str, String str2) {
        if (f823) {
            StringBuilder sb = new StringBuilder("AdtDeveloper:");
            sb.append(str);
            Log.d(sb.toString(), str2);
        }
    }
}
