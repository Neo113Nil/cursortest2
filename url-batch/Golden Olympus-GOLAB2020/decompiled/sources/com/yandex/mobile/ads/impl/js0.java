package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class js0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f27816a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final do1 f27817b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Context f27818c;

    public /* synthetic */ js0(Context context, String str) {
        this(context, str, new do1());
    }

    @Nullable
    public final wd0 a() {
        Class<?> cls;
        do1 do1Var = this.f27817b;
        String className = this.f27816a;
        do1Var.getClass();
        Intrinsics.checkNotNullParameter(className, "className");
        try {
            cls = Class.forName(className);
        } catch (Throwable unused) {
            ap0.c(className);
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        do1 do1Var2 = this.f27817b;
        Object[] objArr = {this.f27818c};
        do1Var2.getClass();
        Object a4 = do1.a(cls, "getFusedLocationProviderClient", objArr);
        if (a4 != null) {
            return new wd0(a4);
        }
        return null;
    }

    public js0(@NotNull Context context, @NotNull String locationServicesClassName, @NotNull do1 reflectHelper) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(locationServicesClassName, "locationServicesClassName");
        Intrinsics.checkNotNullParameter(reflectHelper, "reflectHelper");
        this.f27816a = locationServicesClassName;
        this.f27817b = reflectHelper;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f27818c = applicationContext;
    }
}
