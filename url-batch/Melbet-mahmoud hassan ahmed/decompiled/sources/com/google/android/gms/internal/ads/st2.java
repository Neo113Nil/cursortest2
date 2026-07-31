package com.google.android.gms.internal.ads;

import java.util.LinkedList;

/* loaded from: classes.dex */
final class st2 {

    /* renamed from: b, reason: collision with root package name */
    private final int f11966b;

    /* renamed from: c, reason: collision with root package name */
    private final int f11967c;

    /* renamed from: a, reason: collision with root package name */
    private final LinkedList<cu2<?, ?>> f11965a = new LinkedList<>();

    /* renamed from: d, reason: collision with root package name */
    private final su2 f11968d = new su2();

    public st2(int i7, int i8) {
        this.f11966b = i7;
        this.f11967c = i8;
    }

    private final void i() {
        while (!this.f11965a.isEmpty()) {
            if (y2.t.a().b() - this.f11965a.getFirst().f3953d < this.f11967c) {
                return;
            }
            this.f11968d.g();
            this.f11965a.remove();
        }
    }

    public final int a() {
        return this.f11968d.a();
    }

    public final int b() {
        i();
        return this.f11965a.size();
    }

    public final long c() {
        return this.f11968d.b();
    }

    public final long d() {
        return this.f11968d.c();
    }

    public final cu2<?, ?> e() {
        this.f11968d.f();
        i();
        if (this.f11965a.isEmpty()) {
            return null;
        }
        cu2<?, ?> remove = this.f11965a.remove();
        if (remove != null) {
            this.f11968d.h();
        }
        return remove;
    }

    public final ru2 f() {
        return this.f11968d.d();
    }

    public final String g() {
        return this.f11968d.e();
    }

    public final boolean h(cu2<?, ?> cu2Var) {
        this.f11968d.f();
        i();
        if (this.f11965a.size() == this.f11966b) {
            return false;
        }
        this.f11965a.add(cu2Var);
        return true;
    }
}
