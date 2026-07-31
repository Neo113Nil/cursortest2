package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Looper;
import r3.c;

/* loaded from: classes.dex */
final class g13 implements c.a, c.b {

    /* renamed from: a, reason: collision with root package name */
    private final c23 f5410a;

    /* renamed from: b, reason: collision with root package name */
    private final w13 f5411b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f5412c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private boolean f5413d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f5414e = false;

    g13(Context context, Looper looper, w13 w13Var) {
        this.f5411b = w13Var;
        this.f5410a = new c23(context, looper, this, this, 12800000);
    }

    private final void b() {
        synchronized (this.f5412c) {
            if (this.f5410a.a() || this.f5410a.k()) {
                this.f5410a.d();
            }
            Binder.flushPendingCommands();
        }
    }

    @Override // r3.c.b
    public final void E(o3.b bVar) {
    }

    @Override // r3.c.a
    public final void O0(Bundle bundle) {
        synchronized (this.f5412c) {
            if (this.f5414e) {
                return;
            }
            this.f5414e = true;
            try {
                this.f5410a.i0().C5(new a23(this.f5411b.d()));
            } catch (Exception unused) {
            } catch (Throwable th) {
                b();
                throw th;
            }
            b();
        }
    }

    final void a() {
        synchronized (this.f5412c) {
            if (!this.f5413d) {
                this.f5413d = true;
                this.f5410a.q();
            }
        }
    }

    @Override // r3.c.a
    public final void q0(int i7) {
    }
}
