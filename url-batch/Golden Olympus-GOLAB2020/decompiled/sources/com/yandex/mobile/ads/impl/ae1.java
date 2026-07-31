package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ae1 {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final Object f23250c = new Object();

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private static volatile ae1 f23251d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f23252e = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final je1 f23253a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f23254b;

    public static final class a {
        @NotNull
        public static ae1 a() {
            ae1 ae1Var;
            ae1 ae1Var2 = ae1.f23251d;
            if (ae1Var2 != null) {
                return ae1Var2;
            }
            synchronized (ae1.f23250c) {
                ae1Var = ae1.f23251d;
                if (ae1Var == null) {
                    ae1Var = new ae1();
                    ae1.f23251d = ae1Var;
                }
            }
            return ae1Var;
        }
    }

    /* synthetic */ ae1() {
        this(new je1());
    }

    public final void a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        synchronized (f23250c) {
            try {
                if (this.f23253a.a(context) && !this.f23254b) {
                    me1.a(context);
                    this.f23254b = true;
                }
                Unit unit = Unit.f41027a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private ae1(je1 je1Var) {
        this.f23253a = je1Var;
    }
}
