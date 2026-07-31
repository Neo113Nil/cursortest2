package H0;

import B.Y;
import android.graphics.Typeface;
import h2.AbstractC0508a;
import java.util.HashMap;
import java.util.LinkedHashSet;
import q2.AbstractC0837y;
import q2.n0;
import z.C1256t;

/* loaded from: classes.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    public final A1.i f2587a;

    /* renamed from: b, reason: collision with root package name */
    public final p f2588b;

    /* renamed from: c, reason: collision with root package name */
    public final C1256t f2589c;

    /* renamed from: d, reason: collision with root package name */
    public final h f2590d;

    /* renamed from: e, reason: collision with root package name */
    public final Y f2591e;

    public e(A1.i iVar, a aVar) {
        C1256t c1256t = f.f2592a;
        C1256t c1256t2 = f.f2592a;
        V1.j jVar = V1.j.f4558d;
        h hVar = new h();
        r2.d dVar = K0.g.f3252a;
        g gVar = h.f2593a;
        gVar.getClass();
        AbstractC0837y.a(AbstractC0508a.L(gVar, dVar).d(jVar).d(new n0(null)));
        Y y3 = new Y(4);
        this.f2587a = iVar;
        this.f2588b = aVar;
        this.f2589c = c1256t;
        this.f2590d = hVar;
        this.f2591e = y3;
        new A0.l(5, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ab A[Catch: Exception -> 0x00b3, TRY_ENTER, TryCatch #2 {Exception -> 0x00b3, blocks: (B:25:0x0049, B:28:0x005b, B:30:0x0065, B:31:0x0067, B:32:0x006a, B:33:0x0080, B:47:0x00ab, B:48:0x00b2, B:50:0x0070, B:51:0x0076, B:53:0x007a, B:55:0x0059), top: B:24:0x0049 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final s a(r rVar) {
        s sVar;
        Typeface i3;
        Object remove;
        C1256t c1256t = this.f2589c;
        synchronized (((A1.i) c1256t.f10466e)) {
            try {
                sVar = (s) ((G0.b) c1256t.f10467f).a(rVar);
                if (sVar != null) {
                    if (!sVar.f2612e) {
                        G0.b bVar = (G0.b) c1256t.f10467f;
                        synchronized (((A1.i) bVar.f2078e)) {
                            remove = ((HashMap) bVar.f2079f).remove(rVar);
                            ((LinkedHashSet) bVar.f2080g).remove(rVar);
                            if (remove != null) {
                                bVar.f2075b = bVar.e() - 1;
                            }
                        }
                    }
                }
                try {
                    this.f2590d.getClass();
                    Y y3 = this.f2591e;
                    y3.getClass();
                    q qVar = rVar.f2606a;
                    boolean z3 = qVar == null ? true : qVar instanceof b;
                    A1.i iVar = (A1.i) y3.f334d;
                    int i4 = rVar.f2608c;
                    k kVar = rVar.f2607b;
                    if (z3) {
                        switch (iVar.f220d) {
                            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                                i3 = A1.i.g(null, kVar, i4);
                                break;
                            default:
                                i3 = A1.i.h(null, kVar, i4);
                                break;
                        }
                    } else if (qVar instanceof m) {
                        i3 = iVar.i((m) qVar, kVar, i4);
                    } else {
                        sVar = null;
                        if (sVar != null) {
                            throw new IllegalStateException("Could not load font");
                        }
                        synchronized (((A1.i) c1256t.f10466e)) {
                            if (((G0.b) c1256t.f10467f).a(rVar) == null && sVar.f2612e) {
                                ((G0.b) c1256t.f10467f).b(rVar, sVar);
                            }
                        }
                    }
                    sVar = new s(i3);
                    if (sVar != null) {
                    }
                } catch (Exception e3) {
                    throw new IllegalStateException("Could not load font", e3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sVar;
    }

    public final s b(q qVar, k kVar, int i3, int i4) {
        p pVar = this.f2588b;
        pVar.getClass();
        k a3 = pVar.a(kVar);
        this.f2587a.getClass();
        return a(new r(qVar, a3, i3, i4, null));
    }
}
