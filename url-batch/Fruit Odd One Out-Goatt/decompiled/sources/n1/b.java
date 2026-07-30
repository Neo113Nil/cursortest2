package n1;

import d1.n;
import f0.l;
import java.util.ArrayList;
import k1.h0;
import k1.j;
import m1.q;
import p1.t;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final v0.h f943a;

    /* renamed from: b, reason: collision with root package name */
    public final int f944b;

    /* renamed from: c, reason: collision with root package name */
    public final int f945c;

    /* renamed from: d, reason: collision with root package name */
    public final o1.a f946d;

    /* renamed from: e, reason: collision with root package name */
    public final o1.a f947e;

    public b(o1.a aVar, v0.h hVar, int i2, int i3) {
        this.f943a = hVar;
        this.f944b = i2;
        this.f945c = i3;
        this.f946d = aVar;
        this.f947e = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // n1.c
    public Object a(d dVar, v0.d dVar2) {
        Object jVar;
        Object C;
        Object obj;
        o1.a aVar = new o1.a(dVar, this, 0 == true ? 1 : 0, 0);
        v0.h hVar = ((x0.b) dVar2).f1231c;
        hVar.getClass();
        t tVar = new t(hVar, (x0.f) dVar2);
        try {
            n.a(2, aVar);
            jVar = aVar.g(tVar, tVar);
        } catch (Throwable th) {
            jVar = new j(th, false);
        }
        Object obj2 = w0.a.f1227b;
        if (jVar == obj2 || (C = tVar.C(jVar)) == k1.t.f720d) {
            C = obj2;
        } else {
            if (C instanceof j) {
                throw ((j) C).f689a;
            }
            h0 h0Var = C instanceof h0 ? (h0) C : null;
            if (h0Var != null && (obj = h0Var.f681a) != null) {
                C = obj;
            }
        }
        return C == obj2 ? C : t0.g.f1178a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(q qVar, v0.d dVar) {
        a aVar;
        int i2;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i3 = aVar.f942h;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                aVar.f942h = i3 - Integer.MIN_VALUE;
                Object obj = aVar.f940f;
                i2 = aVar.f942h;
                t0.g gVar = t0.g.f1178a;
                if (i2 != 0) {
                    a.a.C(obj);
                    aVar.f939e = qVar;
                    aVar.f942h = 1;
                    Object g2 = this.f946d.g(qVar, aVar);
                    w0.a aVar2 = w0.a.f1227b;
                    if (g2 != aVar2) {
                        g2 = gVar;
                    }
                    if (g2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        l.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qVar = aVar.f939e;
                    a.a.C(obj);
                }
                if (!qVar.f884e.p()) {
                    return gVar;
                }
                l.b("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
                return null;
            }
        }
        aVar = new a(this, (x0.b) dVar);
        Object obj2 = aVar.f940f;
        i2 = aVar.f942h;
        t0.g gVar2 = t0.g.f1178a;
        if (i2 != 0) {
        }
        if (!qVar.f884e.p()) {
        }
    }

    public final String c() {
        ArrayList arrayList = new ArrayList(4);
        v0.i iVar = v0.i.f1196b;
        v0.h hVar = this.f943a;
        if (hVar != iVar) {
            arrayList.add("context=" + hVar);
        }
        int i2 = this.f944b;
        if (i2 != -3) {
            arrayList.add("capacity=" + i2);
        }
        int i3 = this.f945c;
        if (i3 != 1) {
            arrayList.add("onBufferOverflow=".concat(i3 != 1 ? i3 != 2 ? i3 != 3 ? "null" : "DROP_LATEST" : "DROP_OLDEST" : "SUSPEND"));
        }
        return getClass().getSimpleName() + '[' + u0.d.G(arrayList, 62) + ']';
    }

    public final String toString() {
        return "block[" + this.f946d + "] -> " + c();
    }
}
