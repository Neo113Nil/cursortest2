package com.my.lib;

import android.content.Context;
import android.provider.Settings;
import android.util.DisplayMetrics;

/* renamed from: com.my.lib.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0422n {
    public static String a(Context context) {
        kotlin.jvm.internal.s.checkNotNullParameter(context, "context");
        try {
            String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
            kotlin.jvm.internal.s.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        } catch (Exception e8) {
            e8.printStackTrace();
            return "";
        }
    }

    public static String b(Context context) {
        kotlin.jvm.internal.s.checkNotNullParameter(context, "context");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return displayMetrics.widthPixels + "*" + displayMetrics.heightPixels;
    }
}
