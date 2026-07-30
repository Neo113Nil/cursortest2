package k5;

import h4.v;
import java.io.UncheckedIOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import m5.C0691a;

/* loaded from: classes.dex */
public abstract class l implements AutoCloseable {

    /* renamed from: d, reason: collision with root package name */
    public static final v f6094d;

    static {
        AtomicInteger atomicInteger = g.f6069n;
        f6094d = new v(1);
    }

    public final void B(C0602b c0602b, byte[] bArr) {
        if (bArr.length == 0) {
            return;
        }
        W(c0602b, bArr);
    }

    public final void E(C0602b c0602b, String str, g gVar) {
        if (str == null || str.isEmpty()) {
            return;
        }
        if (gVar.f6070a) {
            V(c0602b, str, gVar.e(), gVar);
        } else {
            W(c0602b, (byte[]) gVar.c(byte[].class));
        }
    }

    public abstract void F(C0602b c0602b, boolean z7);

    public abstract void G(C0602b c0602b, byte[] bArr);

    public abstract void H(C0602b c0602b, double d7);

    public abstract void I();

    public abstract void J();

    public abstract void K();

    public abstract void L(C0602b c0602b, C0601a c0601a);

    public abstract void M(C0602b c0602b, int i2);

    public abstract void N(C0602b c0602b, long j);

    public abstract void O(C0602b c0602b, long j);

    public abstract void P(byte[] bArr, String str);

    public abstract void Q(C0602b c0602b, String str);

    public void R(C0602b c0602b, String str, g gVar) {
        Q(c0602b, str);
    }

    public abstract void S(C0602b c0602b, int i2);

    public abstract void T(C0602b c0602b);

    public abstract void U(C0602b c0602b, int i2);

    public abstract void V(C0602b c0602b, String str, int i2, g gVar);

    public abstract void W(C0602b c0602b, byte[] bArr);

    public abstract void X(C0602b c0602b, String str);

    public void Y(C0602b c0602b, String str, g gVar) {
        X(c0602b, str);
    }

    public abstract void Z(C0602b c0602b, int i2);

    public final void a(C0602b c0602b, AbstractC0605e abstractC0605e) {
        S(c0602b, abstractC0605e.a());
        abstractC0605e.c(this);
        I();
    }

    public final void d(C0602b c0602b, C4.j jVar, g gVar) {
        C0691a c0691a = C0691a.f6542b;
        S(c0602b, gVar.e());
        c0691a.c(this, jVar, gVar);
        I();
    }

    public final void g(C0602b c0602b, Object obj, Object obj2, m mVar, g gVar) {
        S(c0602b, gVar.e());
        mVar.b(this, obj, obj2, gVar);
        I();
    }

    public abstract void h(C0602b c0602b, List list);

    public abstract void j(C0602b c0602b, AbstractC0605e[] abstractC0605eArr);

    public abstract void s(C0602b c0602b, List list, n nVar, g gVar);

    public final void t(C0602b c0602b, Map map, m mVar, g gVar, v vVar) {
        T(c0602b);
        if (!map.isEmpty()) {
            k kVar = (k) gVar.d(vVar, new G3.a(6));
            kVar.f6090a = c0602b;
            kVar.f6091b = this;
            kVar.f6092c = mVar;
            kVar.f6093d = gVar;
            try {
                map.forEach(kVar);
            } catch (UncheckedIOException e7) {
                throw e7.getCause();
            }
        }
        J();
    }
}
