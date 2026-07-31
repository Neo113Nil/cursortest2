package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class la2 implements y2.f {

    /* renamed from: a, reason: collision with root package name */
    private final ta1 f7892a;

    /* renamed from: b, reason: collision with root package name */
    private final ob1 f7893b;

    /* renamed from: c, reason: collision with root package name */
    private final ri1 f7894c;

    /* renamed from: d, reason: collision with root package name */
    private final ji1 f7895d;

    /* renamed from: e, reason: collision with root package name */
    private final b31 f7896e;

    /* renamed from: f, reason: collision with root package name */
    final AtomicBoolean f7897f = new AtomicBoolean(false);

    la2(ta1 ta1Var, ob1 ob1Var, ri1 ri1Var, ji1 ji1Var, b31 b31Var) {
        this.f7892a = ta1Var;
        this.f7893b = ob1Var;
        this.f7894c = ri1Var;
        this.f7895d = ji1Var;
        this.f7896e = b31Var;
    }

    @Override // y2.f
    public final void a() {
        if (this.f7897f.get()) {
            this.f7892a.M();
        }
    }

    @Override // y2.f
    public final synchronized void b(View view) {
        if (this.f7897f.compareAndSet(false, true)) {
            this.f7896e.k();
            this.f7895d.S0(view);
        }
    }

    @Override // y2.f
    public final void c() {
        if (this.f7897f.get()) {
            this.f7893b.zza();
            this.f7894c.zza();
        }
    }
}
