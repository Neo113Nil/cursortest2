package com.yandex.mobile.ads.impl;

import android.content.Context;
import b2.AbstractC1372b;
import com.yandex.mobile.ads.impl.gv1;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class s01 {

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final Object f31504f = new Object();

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    private static volatile s01 f31505g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f31506h = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final n01 f31507a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final r01 f31508b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final iv1 f31509c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final vu1 f31510d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private b f31511e;

    public static final class a {
        @NotNull
        public static s01 a(@NotNull vu1 sdkEnvironmentModule) {
            Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
            if (s01.f31505g == null) {
                synchronized (s01.f31504f) {
                    try {
                        if (s01.f31505g == null) {
                            s01.f31505g = new s01(new n01(new o01()), new r01(), new iv1(), sdkEnvironmentModule);
                        }
                        Unit unit = Unit.f41027a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            s01 s01Var = s01.f31505g;
            if (s01Var != null) {
                return s01Var;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final b f31512b;

        /* renamed from: c, reason: collision with root package name */
        public static final b f31513c;

        /* renamed from: d, reason: collision with root package name */
        public static final b f31514d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ b[] f31515e;

        static {
            b bVar = new b(0, "INITIALIZATION_NOT_STARTED");
            f31512b = bVar;
            b bVar2 = new b(1, "INITIALIZING");
            f31513c = bVar2;
            b bVar3 = new b(2, "INITIALIZED");
            f31514d = bVar3;
            b[] bVarArr = {bVar, bVar2, bVar3};
            f31515e = bVarArr;
            AbstractC1372b.a(bVarArr);
        }

        private b(int i4, String str) {
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f31515e.clone();
        }
    }

    /* synthetic */ s01(n01 n01Var, r01 r01Var, iv1 iv1Var, vu1 vu1Var) {
        this(n01Var, r01Var, iv1Var, vu1Var, b.f31512b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(s01 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f31508b.a();
    }

    public final void a(@NotNull gv1 result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (result instanceof gv1.b) {
            synchronized (f31504f) {
                this.f31511e = b.f31514d;
                Unit unit = Unit.f41027a;
            }
        } else if (result instanceof gv1.a) {
            synchronized (f31504f) {
                this.f31511e = b.f31512b;
                Unit unit2 = Unit.f41027a;
            }
        }
        this.f31507a.b(new Runnable() { // from class: com.yandex.mobile.ads.impl.Ad
            @Override // java.lang.Runnable
            public final void run() {
                s01.b(s01.this);
            }
        });
    }

    private s01(n01 n01Var, r01 r01Var, iv1 iv1Var, vu1 vu1Var, b bVar) {
        this.f31507a = n01Var;
        this.f31508b = r01Var;
        this.f31509c = iv1Var;
        this.f31510d = vu1Var;
        this.f31511e = bVar;
    }

    private final void b(Context context, final ps psVar) {
        boolean z4;
        boolean z5;
        synchronized (f31504f) {
            try {
                pk0 pk0Var = new pk0(this.f31507a, psVar);
                z4 = false;
                if (this.f31511e == b.f31514d) {
                    z5 = false;
                    z4 = true;
                } else {
                    this.f31508b.a(pk0Var);
                    if (this.f31511e == b.f31512b) {
                        this.f31511e = b.f31513c;
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                }
                Unit unit = Unit.f41027a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z4) {
            this.f31507a.b(new Runnable() { // from class: com.yandex.mobile.ads.impl.Cd
                @Override // java.lang.Runnable
                public final void run() {
                    s01.a(ps.this);
                }
            });
        }
        if (z5) {
            iv1 iv1Var = this.f31509c;
            vu1 sdkEnvironmentModule = this.f31510d;
            iv1Var.getClass();
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
            this.f31507a.a(new hv1(context, sdkEnvironmentModule, o2.K.a(o2.R0.b(null, 1, null).plus(o2.Z.b()).plus(new eu(sdkEnvironmentModule.c()))), a.a(sdkEnvironmentModule)));
        }
    }

    public final void a(@NotNull final Context context, @NotNull final ps initializationListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initializationListener, "initializationListener");
        C2054l0.a(context);
        this.f31507a.a(new Runnable() { // from class: com.yandex.mobile.ads.impl.Bd
            @Override // java.lang.Runnable
            public final void run() {
                s01.a(s01.this, context, initializationListener);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(s01 this$0, Context context, ps initializationListener) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(initializationListener, "$initializationListener");
        this$0.b(context, initializationListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ps initializationListener) {
        Intrinsics.checkNotNullParameter(initializationListener, "$initializationListener");
        initializationListener.onInitializationCompleted();
    }
}
