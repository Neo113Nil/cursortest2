package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class w01 {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f33856e = new a(0);

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private static volatile w01 f33857f;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Object f33858a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private volatile boolean f33859b = true;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C1888e1 f33860c = new C1888e1();

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final mg1 f33861d = new mg1();

    public static final class a {
        private a() {
        }

        @NotNull
        public final w01 a() {
            w01 w01Var;
            w01 w01Var2 = w01.f33857f;
            if (w01Var2 != null) {
                return w01Var2;
            }
            synchronized (this) {
                w01Var = w01.f33857f;
                if (w01Var == null) {
                    w01Var = new w01();
                    w01.f33857f = w01Var;
                }
            }
            return w01Var;
        }

        public /* synthetic */ a(int i4) {
            this();
        }
    }

    public final void a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.f33859b) {
            synchronized (this.f33858a) {
                try {
                    if (this.f33859b) {
                        if (C2385z9.a(context)) {
                            this.f33860c.a(context);
                            this.f33861d.getClass();
                            mg1.a(context);
                        }
                        this.f33859b = false;
                    }
                    Unit unit = Unit.f41027a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
