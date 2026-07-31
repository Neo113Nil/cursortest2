package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class xn0 implements so {

    /* renamed from: b, reason: collision with root package name */
    private final a3.t1 f14261b;

    /* renamed from: d, reason: collision with root package name */
    final un0 f14263d;

    /* renamed from: a, reason: collision with root package name */
    private final Object f14260a = new Object();

    /* renamed from: e, reason: collision with root package name */
    final HashSet<nn0> f14264e = new HashSet<>();

    /* renamed from: f, reason: collision with root package name */
    final HashSet<wn0> f14265f = new HashSet<>();

    /* renamed from: g, reason: collision with root package name */
    private boolean f14266g = false;

    /* renamed from: c, reason: collision with root package name */
    private final vn0 f14262c = new vn0();

    public xn0(String str, a3.t1 t1Var) {
        this.f14263d = new un0(str, t1Var);
        this.f14261b = t1Var;
    }

    public final nn0 a(v3.d dVar, String str) {
        return new nn0(dVar, this, this.f14262c.a(), str);
    }

    public final void b(nn0 nn0Var) {
        synchronized (this.f14260a) {
            this.f14264e.add(nn0Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.so
    public final void c(boolean z6) {
        un0 un0Var;
        int a7;
        long b7 = y2.t.a().b();
        if (!z6) {
            this.f14261b.S(b7);
            this.f14261b.e0(this.f14263d.f12864d);
            return;
        }
        if (b7 - this.f14261b.c() > ((Long) sw.c().b(m10.H0)).longValue()) {
            un0Var = this.f14263d;
            a7 = -1;
        } else {
            un0Var = this.f14263d;
            a7 = this.f14261b.a();
        }
        un0Var.f12864d = a7;
        this.f14266g = true;
    }

    public final void d() {
        synchronized (this.f14260a) {
            this.f14263d.b();
        }
    }

    public final void e() {
        synchronized (this.f14260a) {
            this.f14263d.c();
        }
    }

    public final void f() {
        synchronized (this.f14260a) {
            this.f14263d.d();
        }
    }

    public final void g() {
        synchronized (this.f14260a) {
            this.f14263d.e();
        }
    }

    public final void h(kv kvVar, long j7) {
        synchronized (this.f14260a) {
            this.f14263d.f(kvVar, j7);
        }
    }

    public final void i(HashSet<nn0> hashSet) {
        synchronized (this.f14260a) {
            this.f14264e.addAll(hashSet);
        }
    }

    public final boolean j() {
        return this.f14266g;
    }

    public final Bundle k(Context context, jt2 jt2Var) {
        HashSet<nn0> hashSet = new HashSet<>();
        synchronized (this.f14260a) {
            hashSet.addAll(this.f14264e);
            this.f14264e.clear();
        }
        Bundle bundle = new Bundle();
        bundle.putBundle("app", this.f14263d.a(context, this.f14262c.b()));
        Bundle bundle2 = new Bundle();
        Iterator<wn0> it = this.f14265f.iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        }
        bundle.putBundle("slots", bundle2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator<nn0> it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().a());
        }
        bundle.putParcelableArrayList("ads", arrayList);
        jt2Var.b(hashSet);
        return bundle;
    }
}
