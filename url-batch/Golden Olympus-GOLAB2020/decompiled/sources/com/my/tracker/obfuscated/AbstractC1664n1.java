package com.my.tracker.obfuscated;

import android.content.Context;
import android.os.Build;

/* renamed from: com.my.tracker.obfuscated.n1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1664n1 {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f21456a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f21457b;

    static {
        int i4 = Build.VERSION.SDK_INT;
        boolean z4 = false;
        f21456a = i4 <= 30;
        if (i4 <= 30 && !Build.MODEL.equals("Pixel 5")) {
            z4 = true;
        }
        f21457b = z4;
    }

    public static boolean a() {
        return false;
    }

    public static boolean a(String str, Context context) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }
}
