package r7;

import android.os.Bundle;
import android.os.SystemClock;
import c7.c0;
import d6.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import s.e;
import s7.b3;
import s7.i2;
import s7.m4;
import s7.o1;
import s7.p4;
import s7.q1;
import s7.q2;
import s7.v0;
import s7.y2;
import s7.z;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: a, reason: collision with root package name */
    public final q1 f8208a;

    /* renamed from: b, reason: collision with root package name */
    public final q2 f8209b;

    public a(q1 q1Var) {
        c0.g(q1Var);
        this.f8208a = q1Var;
        q2 q2Var = q1Var.A;
        q1.k(q2Var);
        this.f8209b = q2Var;
    }

    @Override // s7.r2
    public final void a(String str, String str2, Bundle bundle) {
        this.f8209b.w(str, str2, bundle);
    }

    @Override // s7.r2
    public final long b() {
        p4 p4Var = this.f8208a.f8940w;
        q1.j(p4Var);
        return p4Var.q0();
    }

    @Override // s7.r2
    public final String c() {
        b3 b3Var = ((q1) this.f8209b.f1478d).f8943z;
        q1.k(b3Var);
        y2 y2Var = b3Var.f8522i;
        if (y2Var != null) {
            return y2Var.f9126a;
        }
        return null;
    }

    @Override // s7.r2
    public final void d(String str, String str2, Bundle bundle) {
        q2 q2Var = this.f8208a.A;
        q1.k(q2Var);
        q2Var.G(str, str2, bundle);
    }

    @Override // s7.r2
    public final String e() {
        b3 b3Var = ((q1) this.f8209b.f1478d).f8943z;
        q1.k(b3Var);
        y2 y2Var = b3Var.f8522i;
        if (y2Var != null) {
            return y2Var.f9127b;
        }
        return null;
    }

    @Override // s7.r2
    public final List f(String str, String str2) {
        q2 q2Var = this.f8209b;
        q1 q1Var = (q1) q2Var.f1478d;
        o1 o1Var = q1Var.f8938u;
        v0 v0Var = q1Var.f8937t;
        q1.l(o1Var);
        if (o1Var.y()) {
            q1.l(v0Var);
            v0Var.f9050t.a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        if (k5.c.l()) {
            q1.l(v0Var);
            v0Var.f9050t.a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        o1 o1Var2 = q1Var.f8938u;
        q1.l(o1Var2);
        o1Var2.C(atomicReference, 5000L, "get conditional user properties", new t(q2Var, atomicReference, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return p4.m0(list);
        }
        q1.l(v0Var);
        v0Var.f9050t.b(null, "Timed out waiting for get conditional user properties");
        return new ArrayList();
    }

    @Override // s7.r2
    public final void g(Bundle bundle) {
        q2 q2Var = this.f8209b;
        ((q1) q2Var.f1478d).f8942y.getClass();
        q2Var.F(bundle, System.currentTimeMillis());
    }

    @Override // s7.r2
    public final int h(String str) {
        q2 q2Var = this.f8209b;
        q2Var.getClass();
        c0.d(str);
        ((q1) q2Var.f1478d).getClass();
        return 25;
    }

    @Override // s7.r2
    public final String i() {
        return (String) this.f8209b.f8948u.get();
    }

    @Override // s7.r2
    public final void j(String str) {
        q1 q1Var = this.f8208a;
        z zVar = q1Var.B;
        q1.i(zVar);
        q1Var.f8942y.getClass();
        zVar.u(str, SystemClock.elapsedRealtime());
    }

    @Override // s7.r2
    public final String k() {
        return this.f8209b.H();
    }

    @Override // s7.r2
    public final Map l(String str, String str2, boolean z10) {
        q2 q2Var = this.f8209b;
        q1 q1Var = (q1) q2Var.f1478d;
        o1 o1Var = q1Var.f8938u;
        v0 v0Var = q1Var.f8937t;
        q1.l(o1Var);
        if (o1Var.y()) {
            q1.l(v0Var);
            v0Var.f9050t.a("Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        if (k5.c.l()) {
            q1.l(v0Var);
            v0Var.f9050t.a("Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        o1 o1Var2 = q1Var.f8938u;
        q1.l(o1Var2);
        o1Var2.C(atomicReference, 5000L, "get user properties", new i2(q2Var, atomicReference, str, str2, z10));
        List<m4> list = (List) atomicReference.get();
        if (list == null) {
            q1.l(v0Var);
            v0Var.f9050t.b(Boolean.valueOf(z10), "Timed out waiting for handle get user properties, includeInternal");
            return Collections.EMPTY_MAP;
        }
        e eVar = new e(list.size());
        for (m4 m4Var : list) {
            Object b10 = m4Var.b();
            if (b10 != null) {
                eVar.put(m4Var.f8852e, b10);
            }
        }
        return eVar;
    }

    @Override // s7.r2
    public final void m(String str) {
        q1 q1Var = this.f8208a;
        z zVar = q1Var.B;
        q1.i(zVar);
        q1Var.f8942y.getClass();
        zVar.t(str, SystemClock.elapsedRealtime());
    }
}
