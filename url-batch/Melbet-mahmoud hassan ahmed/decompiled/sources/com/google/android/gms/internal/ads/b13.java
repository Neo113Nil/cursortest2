package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import r3.c;

/* loaded from: classes.dex */
final class b13 implements c.a, c.b {

    /* renamed from: a, reason: collision with root package name */
    protected final c23 f3154a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3155b;

    /* renamed from: c, reason: collision with root package name */
    private final String f3156c;

    /* renamed from: d, reason: collision with root package name */
    private final LinkedBlockingQueue<a9> f3157d;

    /* renamed from: e, reason: collision with root package name */
    private final HandlerThread f3158e;

    public b13(Context context, String str, String str2) {
        this.f3155b = str;
        this.f3156c = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.f3158e = handlerThread;
        handlerThread.start();
        c23 c23Var = new c23(context, handlerThread.getLooper(), this, this, 9200000);
        this.f3154a = c23Var;
        this.f3157d = new LinkedBlockingQueue<>();
        c23Var.q();
    }

    static a9 a() {
        j8 f02 = a9.f0();
        f02.r0(32768L);
        return f02.o();
    }

    @Override // r3.c.b
    public final void E(o3.b bVar) {
        try {
            this.f3157d.put(a());
        } catch (InterruptedException unused) {
        }
    }

    @Override // r3.c.a
    public final void O0(Bundle bundle) {
        h23 d7 = d();
        if (d7 != null) {
            try {
                try {
                    this.f3157d.put(d7.C3(new d23(this.f3155b, this.f3156c)).c());
                } catch (Throwable unused) {
                    this.f3157d.put(a());
                }
            } catch (InterruptedException unused2) {
            } catch (Throwable th) {
                c();
                this.f3158e.quit();
                throw th;
            }
            c();
            this.f3158e.quit();
        }
    }

    public final a9 b(int i7) {
        a9 a9Var;
        try {
            a9Var = this.f3157d.poll(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            a9Var = null;
        }
        return a9Var == null ? a() : a9Var;
    }

    public final void c() {
        c23 c23Var = this.f3154a;
        if (c23Var != null) {
            if (c23Var.a() || this.f3154a.k()) {
                this.f3154a.d();
            }
        }
    }

    protected final h23 d() {
        try {
            return this.f3154a.i0();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    @Override // r3.c.a
    public final void q0(int i7) {
        try {
            this.f3157d.put(a());
        } catch (InterruptedException unused) {
        }
    }
}
