package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class u03 {

    /* renamed from: e, reason: collision with root package name */
    private static volatile int f12539e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f12540f = 0;

    /* renamed from: a, reason: collision with root package name */
    private final Context f12541a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f12542b;

    /* renamed from: c, reason: collision with root package name */
    private final j4.h<y23> f12543c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f12544d;

    u03(Context context, Executor executor, j4.h<y23> hVar, boolean z6) {
        this.f12541a = context;
        this.f12542b = executor;
        this.f12543c = hVar;
        this.f12544d = z6;
    }

    public static u03 a(final Context context, Executor executor, boolean z6) {
        final j4.i iVar = new j4.i();
        executor.execute(z6 ? new Runnable() { // from class: com.google.android.gms.internal.ads.s03
            @Override // java.lang.Runnable
            public final void run() {
                iVar.c(y23.b(context, "GLAS", null));
            }
        } : new Runnable() { // from class: com.google.android.gms.internal.ads.t03
            @Override // java.lang.Runnable
            public final void run() {
                j4.i.this.c(y23.c());
            }
        });
        return new u03(context, executor, iVar.a(), z6);
    }

    static void g(int i7) {
        f12539e = i7;
    }

    private final j4.h<Boolean> h(final int i7, long j7, Exception exc, String str, Map<String, String> map, String str2) {
        if (!this.f12544d) {
            return this.f12543c.f(this.f12542b, new j4.a() { // from class: com.google.android.gms.internal.ads.r03
                @Override // j4.a
                public final Object a(j4.h hVar) {
                    return Boolean.valueOf(hVar.m());
                }
            });
        }
        final v7 F = z7.F();
        F.r(this.f12541a.getPackageName());
        F.v(j7);
        F.x(f12539e);
        if (exc != null) {
            F.w(d53.a(exc));
            F.u(exc.getClass().getName());
        }
        if (str2 != null) {
            F.s(str2);
        }
        if (str != null) {
            F.t(str);
        }
        return this.f12543c.f(this.f12542b, new j4.a() { // from class: com.google.android.gms.internal.ads.q03
            @Override // j4.a
            public final Object a(j4.h hVar) {
                v7 v7Var = v7.this;
                int i8 = i7;
                int i9 = u03.f12540f;
                if (!hVar.m()) {
                    return Boolean.FALSE;
                }
                x23 a7 = ((y23) hVar.j()).a(v7Var.o().d());
                a7.a(i8);
                a7.c();
                return Boolean.TRUE;
            }
        });
    }

    public final j4.h<Boolean> b(int i7, String str) {
        return h(i7, 0L, null, null, null, str);
    }

    public final j4.h<Boolean> c(int i7, long j7, Exception exc) {
        return h(i7, j7, exc, null, null, null);
    }

    public final j4.h<Boolean> d(int i7, long j7) {
        return h(i7, j7, null, null, null, null);
    }

    public final j4.h<Boolean> e(int i7, long j7, String str) {
        return h(i7, j7, null, null, null, str);
    }

    public final j4.h<Boolean> f(int i7, long j7, String str, Map<String, String> map) {
        return h(i7, j7, null, str, null, null);
    }
}
