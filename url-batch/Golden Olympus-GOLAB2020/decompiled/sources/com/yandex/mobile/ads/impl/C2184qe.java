package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.qe, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2184qe implements InterfaceC2367ye {

    /* renamed from: g, reason: collision with root package name */
    private static final long f30748g = TimeUnit.SECONDS.toMillis(30);

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2161pe f30749a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC2020je f30750b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Handler f30751c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C2092me f30752d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f30753e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final Object f30754f;

    /* renamed from: com.yandex.mobile.ads.impl.qe$a */
    static final class a extends kotlin.jvm.internal.s implements Function0<Unit> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            C2184qe.this.b();
            C2184qe.this.f30752d.getClass();
            C2092me.a();
            C2184qe.b(C2184qe.this);
            return Unit.f41027a;
        }
    }

    public C2184qe(@NotNull C2161pe appMetricaIdentifiersChangedObservable, @NotNull InterfaceC2020je appMetricaAdapter) {
        Intrinsics.checkNotNullParameter(appMetricaIdentifiersChangedObservable, "appMetricaIdentifiersChangedObservable");
        Intrinsics.checkNotNullParameter(appMetricaAdapter, "appMetricaAdapter");
        this.f30749a = appMetricaIdentifiersChangedObservable;
        this.f30750b = appMetricaAdapter;
        this.f30751c = new Handler(Looper.getMainLooper());
        this.f30752d = new C2092me();
        this.f30754f = new Object();
    }

    public static final void b(C2184qe c2184qe) {
        c2184qe.getClass();
        ap0.b(new Object[0]);
        c2184qe.f30749a.a();
    }

    public final void a(@NotNull Context context, @NotNull gi0 observer) {
        boolean z4;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.f30749a.a(observer);
        try {
            synchronized (this.f30754f) {
                try {
                    if (this.f30753e) {
                        z4 = false;
                    } else {
                        z4 = true;
                        this.f30753e = true;
                    }
                    Unit unit = Unit.f41027a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z4) {
                ap0.a(new Object[0]);
                a();
                this.f30750b.a(context, this);
            }
        } catch (Throwable unused) {
            b();
            ap0.c(new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        synchronized (this.f30754f) {
            this.f30751c.removeCallbacksAndMessages(null);
            this.f30753e = false;
            Unit unit = Unit.f41027a;
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2367ye
    public final void a(@NotNull EnumC2344xe error) {
        Intrinsics.checkNotNullParameter(error, "error");
        b();
        this.f30752d.a(error);
        ap0.b(new Object[0]);
        this.f30749a.a();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2367ye
    public final void a(@NotNull C2321we params) {
        Intrinsics.checkNotNullParameter(params, "params");
        ap0.d(params);
        b();
        C2161pe c2161pe = this.f30749a;
        String c4 = params.c();
        c2161pe.a(new C2138oe(params.b(), params.a(), c4));
    }

    private final void a() {
        final a aVar = new a();
        this.f30751c.postDelayed(new Runnable() { // from class: com.yandex.mobile.ads.impl.Gc
            @Override // java.lang.Runnable
            public final void run() {
                C2184qe.a(Function0.this);
            }
        }, f30748g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Function0 tmp0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke();
    }
}
