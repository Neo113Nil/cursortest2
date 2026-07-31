package com.yandex.mobile.ads.impl;

import java.util.Set;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class in0 {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final Object f27293e = new Object();

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private static volatile in0 f27294f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f27295g = 0;

    /* renamed from: a, reason: collision with root package name */
    private boolean f27296a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f27297b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f27298c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private Set<String> f27299d;

    public static final class a {
        @NotNull
        public static in0 a() {
            if (in0.f27294f == null) {
                synchronized (in0.f27293e) {
                    try {
                        if (in0.f27294f == null) {
                            in0.f27294f = new in0(0);
                        }
                        Unit unit = Unit.f41027a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            in0 in0Var = in0.f27294f;
            if (in0Var != null) {
                return in0Var;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    private in0() {
        this.f27296a = true;
        this.f27297b = true;
        this.f27298c = true;
        this.f27299d = kotlin.collections.T.e();
    }

    public final void b(boolean z4) {
        this.f27296a = z4;
    }

    @NotNull
    public final Set<String> c() {
        return this.f27299d;
    }

    public final boolean d() {
        return this.f27298c;
    }

    public final boolean e() {
        return this.f27296a;
    }

    public final boolean f() {
        return this.f27297b;
    }

    public final void a(boolean z4) {
        this.f27298c = z4;
    }

    public final void c(boolean z4) {
        this.f27297b = z4;
    }

    public /* synthetic */ in0(int i4) {
        this();
    }
}
