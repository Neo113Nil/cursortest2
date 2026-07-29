package com.aiming.mdt.utils;

import android.content.Context;
import android.os.Build;

/* renamed from: com.aiming.mdt.utils.ʻʼʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0276 {
    /* renamed from: ʻ, reason: contains not printable characters */
    public static boolean m940(Context context, String... strArr) {
        for (String str : strArr) {
            if (!m941(context, str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static boolean m941(Context context, String str) {
        return Build.VERSION.SDK_INT < 23 || context.checkSelfPermission(str) == 0;
    }
}
