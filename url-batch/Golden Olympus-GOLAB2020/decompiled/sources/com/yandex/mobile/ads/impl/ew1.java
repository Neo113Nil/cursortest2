package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.yq;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ew1 {

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private static final Object f25474j = new Object();

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    private static volatile ew1 f25475k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f25476l = 0;

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private volatile du1 f25477a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private Boolean f25478b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private Boolean f25479c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f25480d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f25481e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f25482f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f25483g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    private Integer f25484h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f25485i;

    public static final class a {
        @NotNull
        public static ew1 a() {
            ew1 ew1Var;
            ew1 ew1Var2 = ew1.f25475k;
            if (ew1Var2 != null) {
                return ew1Var2;
            }
            synchronized (ew1.f25474j) {
                ew1Var = ew1.f25475k;
                if (ew1Var == null) {
                    ew1Var = new ew1(0);
                    ew1.f25475k = ew1Var;
                }
            }
            return ew1Var;
        }
    }

    private ew1() {
        this.f25482f = true;
        this.f25483g = true;
    }

    public final boolean c() {
        boolean z4;
        synchronized (f25474j) {
            z4 = this.f25485i;
        }
        return z4;
    }

    @Nullable
    public final Integer d() {
        Integer num;
        synchronized (f25474j) {
            num = this.f25484h;
        }
        return num;
    }

    @Nullable
    public final Boolean e() {
        Boolean bool;
        synchronized (f25474j) {
            bool = this.f25479c;
        }
        return bool;
    }

    public final boolean f() {
        boolean z4;
        synchronized (f25474j) {
            z4 = this.f25483g;
        }
        return z4;
    }

    public final boolean g() {
        boolean z4;
        synchronized (f25474j) {
            z4 = this.f25480d;
        }
        return z4;
    }

    public final boolean h() {
        boolean z4;
        synchronized (f25474j) {
            z4 = this.f25481e;
        }
        return z4;
    }

    @Nullable
    public final Boolean i() {
        Boolean bool;
        synchronized (f25474j) {
            bool = this.f25478b;
        }
        return bool;
    }

    public final boolean j() {
        boolean z4;
        synchronized (f25474j) {
            z4 = this.f25482f;
        }
        return z4;
    }

    @Nullable
    public final du1 a(@NotNull Context context) {
        du1 du1Var;
        Intrinsics.checkNotNullParameter(context, "context");
        du1 du1Var2 = this.f25477a;
        if (du1Var2 != null) {
            return du1Var2;
        }
        synchronized (f25474j) {
            du1Var = this.f25477a;
            if (du1Var == null) {
                yq.f35288a.getClass();
                du1Var = yq.a.a(context).a();
                this.f25477a = du1Var;
            }
        }
        return du1Var;
    }

    public final void b(boolean z4) {
        synchronized (f25474j) {
            this.f25480d = z4;
            this.f25481e = z4;
            this.f25482f = z4;
            Unit unit = Unit.f41027a;
        }
    }

    public final void c(boolean z4) {
        synchronized (f25474j) {
            this.f25479c = Boolean.valueOf(z4);
            Unit unit = Unit.f41027a;
        }
    }

    public final void d(boolean z4) {
        synchronized (f25474j) {
            this.f25483g = z4;
            Unit unit = Unit.f41027a;
        }
    }

    public final void e(boolean z4) {
        synchronized (f25474j) {
            this.f25485i = z4;
            Unit unit = Unit.f41027a;
        }
    }

    public final void f(boolean z4) {
        synchronized (f25474j) {
            this.f25478b = Boolean.valueOf(z4);
            Unit unit = Unit.f41027a;
        }
    }

    public /* synthetic */ ew1(int i4) {
        this();
    }

    public final void a(@NotNull Context context, @NotNull du1 sdkConfiguration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkConfiguration, "sdkConfiguration");
        synchronized (f25474j) {
            this.f25477a = sdkConfiguration;
            yq.f35288a.getClass();
            yq.a.a(context).a(sdkConfiguration);
            Unit unit = Unit.f41027a;
        }
    }

    public final void a(@Nullable Integer num) {
        synchronized (f25474j) {
            this.f25484h = num;
            Unit unit = Unit.f41027a;
        }
    }

    public final void a(boolean z4) {
        synchronized (f25474j) {
            this.f25480d = z4;
            this.f25482f = z4;
            Unit unit = Unit.f41027a;
        }
    }
}
