package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class v44 implements v54 {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<u54> f13125a = new ArrayList<>(1);

    /* renamed from: b, reason: collision with root package name */
    private final HashSet<u54> f13126b = new HashSet<>(1);

    /* renamed from: c, reason: collision with root package name */
    private final c64 f13127c = new c64();

    /* renamed from: d, reason: collision with root package name */
    private final v24 f13128d = new v24();

    /* renamed from: e, reason: collision with root package name */
    private Looper f13129e;

    /* renamed from: f, reason: collision with root package name */
    private ei0 f13130f;

    @Override // com.google.android.gms.internal.ads.v54
    public final /* synthetic */ ei0 A() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.v54
    public final void a(u54 u54Var) {
        this.f13125a.remove(u54Var);
        if (!this.f13125a.isEmpty()) {
            k(u54Var);
            return;
        }
        this.f13129e = null;
        this.f13130f = null;
        this.f13126b.clear();
        u();
    }

    @Override // com.google.android.gms.internal.ads.v54
    public final void b(Handler handler, w24 w24Var) {
        Objects.requireNonNull(w24Var);
        this.f13128d.b(handler, w24Var);
    }

    @Override // com.google.android.gms.internal.ads.v54
    public final void c(Handler handler, d64 d64Var) {
        Objects.requireNonNull(d64Var);
        this.f13127c.b(handler, d64Var);
    }

    @Override // com.google.android.gms.internal.ads.v54
    public final void d(u54 u54Var) {
        Objects.requireNonNull(this.f13129e);
        boolean isEmpty = this.f13126b.isEmpty();
        this.f13126b.add(u54Var);
        if (isEmpty) {
            r();
        }
    }

    @Override // com.google.android.gms.internal.ads.v54
    public final void e(w24 w24Var) {
        this.f13128d.c(w24Var);
    }

    @Override // com.google.android.gms.internal.ads.v54
    public final void f(d64 d64Var) {
        this.f13127c.m(d64Var);
    }

    @Override // com.google.android.gms.internal.ads.v54
    public final void i(u54 u54Var, vt1 vt1Var) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f13129e;
        boolean z6 = true;
        if (looper != null && looper != myLooper) {
            z6 = false;
        }
        wu1.d(z6);
        ei0 ei0Var = this.f13130f;
        this.f13125a.add(u54Var);
        if (this.f13129e == null) {
            this.f13129e = myLooper;
            this.f13126b.add(u54Var);
            s(vt1Var);
        } else if (ei0Var != null) {
            d(u54Var);
            u54Var.a(this, ei0Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.v54
    public final void k(u54 u54Var) {
        boolean isEmpty = this.f13126b.isEmpty();
        this.f13126b.remove(u54Var);
        if ((!isEmpty) && this.f13126b.isEmpty()) {
            p();
        }
    }

    protected final v24 l(s54 s54Var) {
        return this.f13128d.a(0, s54Var);
    }

    protected final v24 m(int i7, s54 s54Var) {
        return this.f13128d.a(i7, s54Var);
    }

    protected final c64 n(s54 s54Var) {
        return this.f13127c.a(0, s54Var, 0L);
    }

    protected final c64 o(int i7, s54 s54Var, long j7) {
        return this.f13127c.a(i7, s54Var, 0L);
    }

    protected void p() {
    }

    @Override // com.google.android.gms.internal.ads.v54
    public final /* synthetic */ boolean q() {
        return true;
    }

    protected void r() {
    }

    protected abstract void s(vt1 vt1Var);

    protected final void t(ei0 ei0Var) {
        this.f13130f = ei0Var;
        ArrayList<u54> arrayList = this.f13125a;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            arrayList.get(i7).a(this, ei0Var);
        }
    }

    protected abstract void u();

    protected final boolean v() {
        return !this.f13126b.isEmpty();
    }
}
