package F0;

import F.C0047j0;
import android.graphics.Typeface;
import h1.C0438i;
import java.util.HashMap;
import java.util.LinkedHashSet;
import k2.AbstractC0552y;
import k2.n0;

/* loaded from: classes.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    public final a f1444a;

    /* renamed from: b, reason: collision with root package name */
    public final q f1445b;

    /* renamed from: c, reason: collision with root package name */
    public final C2.c f1446c;

    /* renamed from: d, reason: collision with root package name */
    public final i f1447d;

    /* renamed from: e, reason: collision with root package name */
    public final A2.g f1448e;

    public f(a aVar, b bVar) {
        C2.c cVar = g.f1449a;
        C2.c cVar2 = g.f1449a;
        P1.j jVar = P1.j.f3073d;
        i iVar = new i();
        l2.d dVar = I0.h.f2451a;
        h hVar = i.f1450a;
        hVar.getClass();
        AbstractC0552y.a(I2.l.M(hVar, dVar).o(jVar).o(new n0(null)));
        A2.g gVar = new A2.g(7);
        this.f1444a = aVar;
        this.f1445b = bVar;
        this.f1446c = cVar;
        this.f1447d = iVar;
        this.f1448e = gVar;
        new C0047j0(3, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ab A[Catch: Exception -> 0x00b3, TRY_ENTER, TryCatch #2 {Exception -> 0x00b3, blocks: (B:25:0x0049, B:28:0x005b, B:30:0x0065, B:31:0x0067, B:32:0x006a, B:33:0x0080, B:47:0x00ab, B:48:0x00b2, B:50:0x0070, B:51:0x0076, B:53:0x007a, B:55:0x0059), top: B:24:0x0049 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final t a(s sVar) {
        t tVar;
        Typeface i3;
        Object remove;
        C2.c cVar = this.f1446c;
        synchronized (((a) cVar.f484e)) {
            try {
                tVar = (t) ((E0.b) cVar.f485f).a(sVar);
                if (tVar != null) {
                    if (!tVar.f1469e) {
                        E0.b bVar = (E0.b) cVar.f485f;
                        synchronized (((a) bVar.f728e)) {
                            remove = ((HashMap) bVar.f729f).remove(sVar);
                            ((LinkedHashSet) bVar.f730g).remove(sVar);
                            if (remove != null) {
                                bVar.f725b = bVar.e() - 1;
                            }
                        }
                    }
                }
                try {
                    this.f1447d.getClass();
                    A2.g gVar = this.f1448e;
                    gVar.getClass();
                    r rVar = sVar.f1463a;
                    boolean z3 = rVar == null ? true : rVar instanceof c;
                    a aVar = (a) gVar.f83b;
                    int i4 = sVar.f1465c;
                    l lVar = sVar.f1464b;
                    if (z3) {
                        switch (aVar.f1442d) {
                            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                                i3 = a.g(null, lVar, i4);
                                break;
                            default:
                                i3 = a.h(null, lVar, i4);
                                break;
                        }
                    } else if (rVar instanceof n) {
                        i3 = aVar.i((n) rVar, lVar, i4);
                    } else {
                        tVar = null;
                        if (tVar != null) {
                            throw new IllegalStateException("Could not load font");
                        }
                        synchronized (((a) cVar.f484e)) {
                            if (((E0.b) cVar.f485f).a(sVar) == null && tVar.f1469e) {
                                ((E0.b) cVar.f485f).b(sVar, tVar);
                            }
                        }
                    }
                    tVar = new t(i3);
                    if (tVar != null) {
                    }
                } catch (Exception e3) {
                    throw new IllegalStateException("Could not load font", e3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return tVar;
    }

    public final t b(r rVar, l lVar, int i3, int i4) {
        q qVar = this.f1445b;
        qVar.getClass();
        l a3 = qVar.a(lVar);
        this.f1444a.getClass();
        return a(new s(rVar, a3, i3, i4, null));
    }
}
