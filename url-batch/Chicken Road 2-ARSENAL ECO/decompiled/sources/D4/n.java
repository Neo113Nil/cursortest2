package D4;

import D3.A;
import java.io.UncheckedIOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class n implements AutoCloseable {

    /* renamed from: f, reason: collision with root package name */
    public static final A f556f;

    static {
        AtomicInteger atomicInteger = i.f530n;
        f556f = new A(1, false);
    }

    public abstract void F(b bVar, boolean z5);

    public abstract void G(b bVar, byte[] bArr);

    public abstract void H(b bVar, double d7);

    public abstract void I();

    public abstract void J();

    public abstract void K();

    public abstract void L(b bVar, a aVar);

    public abstract void M(b bVar, int i7);

    public abstract void N(b bVar, long j4);

    public abstract void O(b bVar, long j4);

    public abstract void P(byte[] bArr, String str);

    public abstract void Q(b bVar, String str);

    public void R(b bVar, String str, i iVar) {
        Q(bVar, str);
    }

    public abstract void S(b bVar, int i7);

    public abstract void T(b bVar);

    public abstract void U(b bVar, int i7);

    public abstract void V(b bVar, String str, int i7, i iVar);

    public abstract void W(b bVar, byte[] bArr);

    public abstract void X(b bVar, String str);

    public void Y(b bVar, String str, i iVar) {
        X(bVar, str);
    }

    public abstract void Z(b bVar, int i7);

    public final void a(b bVar, f fVar) {
        S(bVar, fVar.a());
        fVar.c(this);
        I();
    }

    public final void d(b bVar, V3.g gVar, i iVar) {
        F4.a aVar = F4.a.f742b;
        S(bVar, iVar.e());
        aVar.b(this, gVar, iVar);
        I();
    }

    public final void e(b bVar, Object obj, Object obj2, o oVar, i iVar) {
        S(bVar, iVar.e());
        oVar.a(this, obj, obj2, iVar);
        I();
    }

    public abstract void g(b bVar, List list);

    public abstract void h(b bVar, f[] fVarArr);

    public abstract void m(b bVar, List list, p pVar, i iVar);

    public final void n(b bVar, Map map, o oVar, i iVar, A a7) {
        T(bVar);
        if (!map.isEmpty()) {
            m mVar = (m) iVar.d(a7, new C4.d(4));
            mVar.f552a = bVar;
            mVar.f553b = this;
            mVar.f554c = oVar;
            mVar.f555d = iVar;
            try {
                map.forEach(mVar);
            } catch (UncheckedIOException e4) {
                throw e4.getCause();
            }
        }
        J();
    }

    public final void v(b bVar, byte[] bArr) {
        if (bArr.length == 0) {
            return;
        }
        W(bVar, bArr);
    }

    public final void y(b bVar, String str, i iVar) {
        if (str == null || str.isEmpty()) {
            return;
        }
        if (iVar.f531a) {
            V(bVar, str, iVar.e(), iVar);
        } else {
            W(bVar, (byte[]) iVar.c(byte[].class));
        }
    }
}
