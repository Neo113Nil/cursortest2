package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class bt2 implements hd {
    public final c43 a;
    public final k03 b;
    public Object c;
    public Object d;
    public sd e;
    public sd f;
    public final sd g;
    public long h;
    public sd i;

    public bt2(md mdVar, k03 k03Var, Object obj, Object obj2, sd sdVar) {
        this.a = mdVar.a(k03Var);
        this.b = k03Var;
        this.c = obj2;
        this.d = obj;
        this.e = (sd) k03Var.a.invoke(obj);
        Function1 function1 = k03Var.a;
        this.f = (sd) function1.invoke(obj2);
        this.g = sdVar != null ? yk3.A(sdVar) : ((sd) function1.invoke(obj)).c();
        this.h = -1L;
    }

    @Override // defpackage.hd
    public final boolean a() {
        return this.a.a();
    }

    @Override // defpackage.hd
    public final Object b(long j) {
        if (g(j)) {
            return this.c;
        }
        sd n = this.a.n(j, this.e, this.f, this.g);
        int b = n.b();
        for (int i = 0; i < b; i++) {
            if (Float.isNaN(n.a(i))) {
                w32.b("AnimationVector cannot contain a NaN. " + n + ". Animation: " + this + ", playTimeNanos: " + j);
            }
        }
        return this.b.b.invoke(n);
    }

    @Override // defpackage.hd
    public final long c() {
        if (this.h < 0) {
            this.h = this.a.e(this.e, this.f, this.g);
        }
        return this.h;
    }

    @Override // defpackage.hd
    public final k03 d() {
        return this.b;
    }

    @Override // defpackage.hd
    public final Object e() {
        return this.c;
    }

    @Override // defpackage.hd
    public final sd f(long j) {
        if (!g(j)) {
            return this.a.l(j, this.e, this.f, this.g);
        }
        sd sdVar = this.i;
        if (sdVar != null) {
            return sdVar;
        }
        sd o = this.a.o(this.e, this.f, this.g);
        this.i = o;
        return o;
    }

    public final void h(Object obj) {
        if (Intrinsics.b(obj, this.d)) {
            return;
        }
        this.d = obj;
        this.e = (sd) this.b.a.invoke(obj);
        this.i = null;
        this.h = -1L;
    }

    public final void i(Object obj) {
        if (Intrinsics.b(this.c, obj)) {
            return;
        }
        this.c = obj;
        this.f = (sd) this.b.a.invoke(obj);
        this.i = null;
        this.h = -1L;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.d + " -> " + this.c + ",initial velocity: " + this.g + ", duration: " + (c() / 1000000) + " ms,animationSpec: " + this.a;
    }
}
