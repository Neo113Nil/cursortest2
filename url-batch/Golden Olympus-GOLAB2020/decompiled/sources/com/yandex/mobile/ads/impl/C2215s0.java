package com.yandex.mobile.ads.impl;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.s0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2215s0 {
    @Nullable
    public static String a() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread", false, d11.class.getClassLoader());
            Intrinsics.checkNotNullExpressionValue(cls, "forName(...)");
            Method declaredMethod = cls.getDeclaredMethod("currentActivityThread", null);
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = cls.getDeclaredMethod("getProcessName", null);
            declaredMethod2.setAccessible(true);
            Object invoke = declaredMethod2.invoke(declaredMethod.invoke(null, null), null);
            Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type kotlin.String");
            return (String) invoke;
        } catch (Throwable unused) {
            ap0.c(new Object[0]);
            return null;
        }
    }

    @Nullable
    public static String b() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread", false, d11.class.getClassLoader());
            Intrinsics.checkNotNullExpressionValue(cls, "forName(...)");
            Method declaredMethod = cls.getDeclaredMethod("currentProcessName", null);
            declaredMethod.setAccessible(true);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, null);
            Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type kotlin.String");
            return (String) invoke;
        } catch (Throwable unused) {
            ap0.c(new Object[0]);
            return null;
        }
    }
}
