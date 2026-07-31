package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class ux3 {

    /* renamed from: a, reason: collision with root package name */
    private final tx3 f13008a;

    /* renamed from: b, reason: collision with root package name */
    private final sx3 f13009b;

    /* renamed from: c, reason: collision with root package name */
    private final xv1 f13010c;

    /* renamed from: d, reason: collision with root package name */
    private final ei0 f13011d;

    /* renamed from: e, reason: collision with root package name */
    private int f13012e;

    /* renamed from: f, reason: collision with root package name */
    private Object f13013f;

    /* renamed from: g, reason: collision with root package name */
    private final Looper f13014g;

    /* renamed from: h, reason: collision with root package name */
    private final int f13015h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f13016i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f13017j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f13018k;

    public ux3(sx3 sx3Var, tx3 tx3Var, ei0 ei0Var, int i7, xv1 xv1Var, Looper looper) {
        this.f13009b = sx3Var;
        this.f13008a = tx3Var;
        this.f13011d = ei0Var;
        this.f13014g = looper;
        this.f13010c = xv1Var;
        this.f13015h = i7;
    }

    public final int a() {
        return this.f13012e;
    }

    public final Looper b() {
        return this.f13014g;
    }

    public final tx3 c() {
        return this.f13008a;
    }

    public final ux3 d() {
        wu1.f(!this.f13016i);
        this.f13016i = true;
        this.f13009b.b(this);
        return this;
    }

    public final ux3 e(Object obj) {
        wu1.f(!this.f13016i);
        this.f13013f = obj;
        return this;
    }

    public final ux3 f(int i7) {
        wu1.f(!this.f13016i);
        this.f13012e = i7;
        return this;
    }

    public final Object g() {
        return this.f13013f;
    }

    public final synchronized void h(boolean z6) {
        this.f13017j = z6 | this.f13017j;
        this.f13018k = true;
        notifyAll();
    }

    public final synchronized boolean i(long j7) {
        wu1.f(this.f13016i);
        wu1.f(this.f13014g.getThread() != Thread.currentThread());
        long j8 = 2000;
        long elapsedRealtime = SystemClock.elapsedRealtime() + 2000;
        while (!this.f13018k) {
            if (j8 <= 0) {
                throw new TimeoutException("Message delivery timed out.");
            }
            wait(j8);
            j8 = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        return this.f13017j;
    }

    public final synchronized boolean j() {
        return false;
    }
}
