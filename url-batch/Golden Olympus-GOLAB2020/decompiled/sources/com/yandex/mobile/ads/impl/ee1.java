package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.InterfaceC3247m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ee1 {

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    public static final a f25268g = new a(0);

    /* renamed from: h, reason: collision with root package name */
    private static final long f25269h = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    private static volatile ee1 f25270i;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Object f25271a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Handler f25272b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final de1 f25273c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final be1 f25274d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f25275e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f25276f;

    public static final class a {
        private a() {
        }

        @NotNull
        public final ee1 a(@NotNull Context context) {
            ee1 ee1Var;
            Intrinsics.checkNotNullParameter(context, "context");
            ee1 ee1Var2 = ee1.f25270i;
            if (ee1Var2 != null) {
                return ee1Var2;
            }
            synchronized (this) {
                ee1Var = ee1.f25270i;
                if (ee1Var == null) {
                    ee1Var = new ee1(context, 0);
                    ee1.f25270i = ee1Var;
                }
            }
            return ee1Var;
        }

        public /* synthetic */ a(int i4) {
            this();
        }
    }

    /* synthetic */ class b implements ra2, InterfaceC3247m {
        b() {
        }

        @Override // com.yandex.mobile.ads.impl.ra2
        public final void a() {
            ee1.a(ee1.this);
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof ra2) && (obj instanceof InterfaceC3247m)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((InterfaceC3247m) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC3247m
        @NotNull
        public final W1.e getFunctionDelegate() {
            return new kotlin.jvm.internal.p(0, ee1.this, ee1.class, "onOmSdkJsControllerLoaded", "onOmSdkJsControllerLoaded()V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    private ee1(Context context) {
        this.f25271a = new Object();
        this.f25272b = new Handler(Looper.getMainLooper());
        this.f25273c = new de1(context);
        this.f25274d = new be1();
    }

    public static final void a(ee1 ee1Var) {
        synchronized (ee1Var.f25271a) {
            ee1Var.f25276f = true;
            Unit unit = Unit.f41027a;
        }
        ee1Var.d();
        ee1Var.f25274d.b();
    }

    private final void c() {
        this.f25272b.postDelayed(new Runnable() { // from class: com.yandex.mobile.ads.impl.Q1
            @Override // java.lang.Runnable
            public final void run() {
                ee1.c(ee1.this);
            }
        }, f25269h);
    }

    private final void b() {
        boolean z4;
        synchronized (this.f25271a) {
            try {
                if (this.f25275e) {
                    z4 = false;
                } else {
                    z4 = true;
                    this.f25275e = true;
                }
                Unit unit = Unit.f41027a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z4) {
            c();
            this.f25273c.a(new b());
        }
    }

    private final void d() {
        synchronized (this.f25271a) {
            this.f25272b.removeCallbacksAndMessages(null);
            this.f25275e = false;
            Unit unit = Unit.f41027a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(ee1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f25273c.a();
        synchronized (this$0.f25271a) {
            this$0.f25276f = true;
            Unit unit = Unit.f41027a;
        }
        this$0.d();
        this$0.f25274d.b();
    }

    public /* synthetic */ ee1(Context context, int i4) {
        this(context);
    }

    public final void a(@NotNull ra2 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.f25271a) {
            try {
                this.f25274d.b(listener);
                if (!this.f25274d.a()) {
                    this.f25273c.a();
                }
                Unit unit = Unit.f41027a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(@NotNull ra2 listener) {
        boolean z4;
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.f25271a) {
            try {
                z4 = this.f25276f;
                if (!z4) {
                    this.f25274d.a(listener);
                }
                Unit unit = Unit.f41027a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z4) {
            b();
        } else {
            listener.a();
        }
    }
}
