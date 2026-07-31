package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class t60 {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final Object f32225c = new Object();

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private static volatile t60 f32226d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f32227e = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final s60 f32228a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private by1 f32229b;

    public static final class a {
        @NotNull
        public static t60 a() {
            t60 t60Var;
            t60 t60Var2 = t60.f32226d;
            if (t60Var2 != null) {
                return t60Var2;
            }
            synchronized (t60.f32225c) {
                t60Var = t60.f32226d;
                if (t60Var == null) {
                    t60Var = new t60(0);
                    t60.f32226d = t60Var;
                }
            }
            return t60Var;
        }
    }

    private t60() {
        this.f32228a = new s60();
    }

    @NotNull
    public final InterfaceC1837bm a(@NotNull Context context) {
        by1 by1Var;
        Intrinsics.checkNotNullParameter(context, "context");
        synchronized (f32225c) {
            by1Var = this.f32229b;
            if (by1Var == null) {
                by1Var = this.f32228a.a(context);
                this.f32229b = by1Var;
            }
        }
        return by1Var;
    }

    public /* synthetic */ t60(int i4) {
        this();
    }
}
