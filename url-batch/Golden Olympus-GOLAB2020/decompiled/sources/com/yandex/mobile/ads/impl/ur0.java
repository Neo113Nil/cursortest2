package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ur0 {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final Object f33230d = new Object();

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private static volatile ur0 f33231e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f33232f = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final t31 f33233a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ArrayList f33234b;

    /* renamed from: c, reason: collision with root package name */
    private int f33235c;

    public static final class a {
        @NotNull
        public static ur0 a() {
            ur0 ur0Var;
            ur0 ur0Var2 = ur0.f33231e;
            if (ur0Var2 != null) {
                return ur0Var2;
            }
            synchronized (ur0.f33230d) {
                ur0Var = ur0.f33231e;
                if (ur0Var == null) {
                    ur0Var = new ur0();
                    ur0.f33231e = ur0Var;
                }
            }
            return ur0Var;
        }
    }

    /* synthetic */ ur0() {
        this(new t31(t31.f32143c));
    }

    @NotNull
    public final Executor c() {
        Executor executor;
        synchronized (f33230d) {
            try {
                if (this.f33234b.size() < 4) {
                    executor = Executors.newSingleThreadExecutor(this.f33233a);
                    Intrinsics.checkNotNullExpressionValue(executor, "newSingleThreadExecutor(...)");
                    this.f33234b.add(executor);
                } else {
                    ArrayList arrayList = this.f33234b;
                    int i4 = this.f33235c;
                    this.f33235c = i4 + 1;
                    executor = (Executor) arrayList.get(i4);
                    if (this.f33235c == 4) {
                        this.f33235c = 0;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return executor;
    }

    private ur0(t31 t31Var) {
        this.f33233a = t31Var;
        this.f33234b = new ArrayList();
    }
}
