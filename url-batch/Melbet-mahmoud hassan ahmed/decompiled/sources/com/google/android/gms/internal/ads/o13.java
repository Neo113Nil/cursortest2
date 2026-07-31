package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Base64;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import v2.a;

/* loaded from: classes.dex */
public final class o13 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f9438a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f9439b;

    /* renamed from: c, reason: collision with root package name */
    private final u03 f9440c;

    /* renamed from: d, reason: collision with root package name */
    private final w03 f9441d;

    /* renamed from: e, reason: collision with root package name */
    private final m13 f9442e;

    /* renamed from: f, reason: collision with root package name */
    private final m13 f9443f;

    /* renamed from: g, reason: collision with root package name */
    private j4.h<a9> f9444g;

    /* renamed from: h, reason: collision with root package name */
    private j4.h<a9> f9445h;

    o13(Context context, Executor executor, u03 u03Var, w03 w03Var, k13 k13Var, l13 l13Var) {
        this.f9438a = context;
        this.f9439b = executor;
        this.f9440c = u03Var;
        this.f9441d = w03Var;
        this.f9442e = k13Var;
        this.f9443f = l13Var;
    }

    public static o13 e(Context context, Executor executor, u03 u03Var, w03 w03Var) {
        final o13 o13Var = new o13(context, executor, u03Var, w03Var, new k13(), new l13());
        o13Var.f9444g = o13Var.f9441d.d() ? o13Var.h(new Callable() { // from class: com.google.android.gms.internal.ads.i13
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return o13.this.c();
            }
        }) : j4.k.c(o13Var.f9442e.zza());
        o13Var.f9445h = o13Var.h(new Callable() { // from class: com.google.android.gms.internal.ads.j13
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return o13.this.d();
            }
        });
        return o13Var;
    }

    private static a9 g(j4.h<a9> hVar, a9 a9Var) {
        return !hVar.m() ? a9Var : hVar.j();
    }

    private final j4.h<a9> h(Callable<a9> callable) {
        return j4.k.a(this.f9439b, callable).d(this.f9439b, new j4.e() { // from class: com.google.android.gms.internal.ads.h13
            @Override // j4.e
            public final void d(Exception exc) {
                o13.this.f(exc);
            }
        });
    }

    public final a9 a() {
        return g(this.f9444g, this.f9442e.zza());
    }

    public final a9 b() {
        return g(this.f9445h, this.f9443f.zza());
    }

    final /* synthetic */ a9 c() {
        Context context = this.f9438a;
        j8 f02 = a9.f0();
        a.C0146a b7 = v2.a.b(context);
        String a7 = b7.a();
        if (a7 != null && a7.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            UUID fromString = UUID.fromString(a7);
            byte[] bArr = new byte[16];
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            wrap.putLong(fromString.getMostSignificantBits());
            wrap.putLong(fromString.getLeastSignificantBits());
            a7 = Base64.encodeToString(bArr, 11);
        }
        if (a7 != null) {
            f02.i0(a7);
            f02.h0(b7.b());
            f02.N(6);
        }
        return f02.o();
    }

    final /* synthetic */ a9 d() {
        Context context = this.f9438a;
        return c13.a(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
    }

    final /* synthetic */ void f(Exception exc) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        this.f9440c.c(2025, -1L, exc);
    }
}
