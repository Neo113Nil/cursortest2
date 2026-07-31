package com.yandex.mobile.ads.impl;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class kp {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final Method f28295a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final Method f28296b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final Method f28297c;

    public static final class a {
        @NotNull
        public static kp a() {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                Method method4 = cls.getMethod("get", null);
                method2 = cls.getMethod("open", String.class);
                method = cls.getMethod("warnIfOpen", null);
                method3 = method4;
            } catch (Exception unused) {
                method = null;
                method2 = null;
            }
            return new kp(method3, method2, method);
        }
    }

    public kp(@Nullable Method method, @Nullable Method method2, @Nullable Method method3) {
        this.f28295a = method;
        this.f28296b = method2;
        this.f28297c = method3;
    }

    @Nullable
    public final Object a() {
        Intrinsics.checkNotNullParameter("response.body().close()", "closer");
        Method method = this.f28295a;
        if (method != null) {
            try {
                Object invoke = method.invoke(null, null);
                Method method2 = this.f28296b;
                Intrinsics.checkNotNull(method2);
                method2.invoke(invoke, "response.body().close()");
                return invoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final boolean a(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            Method method = this.f28297c;
            Intrinsics.checkNotNull(method);
            method.invoke(obj, null);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
