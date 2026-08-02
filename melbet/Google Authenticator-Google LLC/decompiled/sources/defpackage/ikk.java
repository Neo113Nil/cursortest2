package defpackage;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ikk {
    public final Object a;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    public ikk(Set set) {
        this.a = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ikj ikjVar = (ikj) it.next();
            this.a.put(ikjVar.a, ikjVar.b);
        }
    }

    public static int v(iwq iwqVar, Object obj, Object obj2) {
        return jkf.a((jmr) iwqVar.d, 1, obj) + jkf.a((jmr) iwqVar.b, 2, obj2);
    }

    public static void w(jjz jjzVar, iwq iwqVar, Object obj, Object obj2) {
        jkf.f(jjzVar, (jmr) iwqVar.d, 1, obj);
        jkf.f(jjzVar, (jmr) iwqVar.b, 2, obj2);
    }

    public final String a() {
        return ((jev) ((ikk) this.a).a).b;
    }

    public final void b(Object obj, jsb jsbVar) {
        obj.getClass();
        jsbVar.getClass();
        ((LinkedHashMap) this.a).put(obj, jsbVar);
    }

    public final void c(int i, boolean z) {
        ((jjz) this.a).f(i, z);
    }

    public final void d(int i, jjq jjqVar) {
        ((jjz) this.a).g(i, jjqVar);
    }

    public final void e(int i, double d) {
        ((jjz) this.a).U(i, d);
    }

    public final void f(int i, int i2) {
        ((jjz) this.a).m(i, i2);
    }

    public final void g(int i, int i2) {
        ((jjz) this.a).i(i, i2);
    }

    public final void h(int i, long j) {
        ((jjz) this.a).k(i, j);
    }

    public final void i(int i, float f) {
        ((jjz) this.a).W(i, f);
    }

    public final void j(int i, Object obj, jlz jlzVar) {
        jjz jjzVar = (jjz) this.a;
        jjzVar.t(i, 3);
        jlzVar.m((jja) obj, this);
        jjzVar.t(i, 4);
    }

    public final void k(int i, int i2) {
        ((jjz) this.a).m(i, i2);
    }

    public final void l(int i, long j) {
        ((jjz) this.a).w(i, j);
    }

    public final void m(int i, Object obj, jlz jlzVar) {
        jja jjaVar = (jja) obj;
        jjz jjzVar = (jjz) this.a;
        jjzVar.t(i, 2);
        jjzVar.v(jjaVar.c(jlzVar));
        jlzVar.m(jjaVar, this);
    }

    public final void n(int i, Object obj) {
        boolean z = obj instanceof jjq;
        Object obj2 = this.a;
        if (z) {
            ((jjz) obj2).q(i, (jjq) obj);
        } else {
            ((jjz) obj2).p(i, (jll) obj);
        }
    }

    public final void o(int i, int i2) {
        ((jjz) this.a).i(i, i2);
    }

    public final void p(int i, long j) {
        ((jjz) this.a).k(i, j);
    }

    public final void q(int i, int i2) {
        ((jjz) this.a).u(i, (i2 >> 31) ^ (i2 + i2));
    }

    public final void r(int i, long j) {
        ((jjz) this.a).w(i, (j >> 63) ^ (j + j));
    }

    public final void s(int i, String str) {
        ((jjz) this.a).r(i, str);
    }

    public final void t(int i, int i2) {
        ((jjz) this.a).u(i, i2);
    }

    public final void u(int i, long j) {
        ((jjz) this.a).w(i, j);
    }

    public final int x() {
        return ((ByteBuffer) this.a).position();
    }

    public final int y() {
        return ((ByteBuffer) this.a).remaining();
    }

    public final void z(byte[] bArr, int i, int i2) {
        ((ByteBuffer) this.a).put(bArr, i, i2);
    }

    public ikk(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public ikk(jjz jjzVar) {
        this.a = jjzVar;
        jjzVar.a = this;
    }

    public ikk(jmr jmrVar, Object obj, jmr jmrVar2, Object obj2) {
        this.a = new iwq(jmrVar, obj, jmrVar2, obj2);
    }

    public ikk(int i) {
        this.a = iwj.b(i);
    }

    public ikk(Object obj) {
        this.a = obj;
    }

    public ikk(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        this.a = byteBuffer;
    }

    public ikk() {
        this.a = new HashMap();
    }
}
