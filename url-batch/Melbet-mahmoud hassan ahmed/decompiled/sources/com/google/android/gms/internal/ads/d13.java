package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import r3.c;

/* loaded from: classes.dex */
final class d13 implements c.a, c.b {

    /* renamed from: a, reason: collision with root package name */
    protected final c23 f4036a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4037b;

    /* renamed from: c, reason: collision with root package name */
    private final String f4038c;

    /* renamed from: d, reason: collision with root package name */
    private final LinkedBlockingQueue<p23> f4039d;

    /* renamed from: e, reason: collision with root package name */
    private final HandlerThread f4040e;

    /* renamed from: f, reason: collision with root package name */
    private final u03 f4041f;

    /* renamed from: g, reason: collision with root package name */
    private final long f4042g;

    /* renamed from: h, reason: collision with root package name */
    private final int f4043h;

    public d13(Context context, int i7, int i8, String str, String str2, String str3, u03 u03Var) {
        this.f4037b = str;
        this.f4043h = i8;
        this.f4038c = str2;
        this.f4041f = u03Var;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.f4040e = handlerThread;
        handlerThread.start();
        this.f4042g = System.currentTimeMillis();
        c23 c23Var = new c23(context, handlerThread.getLooper(), this, this, 19621000);
        this.f4036a = c23Var;
        this.f4039d = new LinkedBlockingQueue<>();
        c23Var.q();
    }

    static p23 a() {
        return new p23(null, 1);
    }

    private final void e(int i7, long j7, Exception exc) {
        this.f4041f.c(i7, System.currentTimeMillis() - j7, exc);
    }

    @Override // r3.c.b
    public final void E(o3.b bVar) {
        try {
            e(4012, this.f4042g, null);
            this.f4039d.put(a());
        } catch (InterruptedException unused) {
        }
    }

    @Override // r3.c.a
    public final void O0(Bundle bundle) {
        h23 d7 = d();
        if (d7 != null) {
            try {
                p23 o42 = d7.o4(new m23(1, this.f4043h, this.f4037b, this.f4038c));
                e(5011, this.f4042g, null);
                this.f4039d.put(o42);
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    public final p23 b(int i7) {
        p23 p23Var;
        try {
            p23Var = this.f4039d.poll(50000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e7) {
            e(2009, this.f4042g, e7);
            p23Var = null;
        }
        e(3004, this.f4042g, null);
        if (p23Var != null) {
            u03.g(p23Var.f10036h == 7 ? 3 : 2);
        }
        return p23Var == null ? a() : p23Var;
    }

    public final void c() {
        c23 c23Var = this.f4036a;
        if (c23Var != null) {
            if (c23Var.a() || this.f4036a.k()) {
                this.f4036a.d();
            }
        }
    }

    protected final h23 d() {
        try {
            return this.f4036a.i0();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    @Override // r3.c.a
    public final void q0(int i7) {
        try {
            e(4011, this.f4042g, null);
            this.f4039d.put(a());
        } catch (InterruptedException unused) {
        }
    }
}
