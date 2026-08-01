package n0;

import a.AbstractC0016a;
import e0.n;
import java.util.ArrayList;
import k0.AbstractC0058t;
import k0.C0050k;
import k0.H;
import k0.I;
import m0.q;
import m0.r;
import p0.u;
import u.j;

/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: b, reason: collision with root package name */
    public final W.i f1086b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1087c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1088d;

    /* renamed from: e, reason: collision with root package name */
    public final j f1089e;

    /* renamed from: f, reason: collision with root package name */
    public final j f1090f;

    public b(j jVar, W.i iVar, int i2, int i3) {
        this.f1086b = iVar;
        this.f1087c = i2;
        this.f1088d = i3;
        this.f1089e = jVar;
        this.f1090f = jVar;
    }

    @Override // n0.c
    public Object a(d dVar, W.d dVar2) {
        Object c0050k;
        Object C2;
        H h2;
        o0.c cVar = new o0.c(dVar, this, null);
        W.i iVar = ((Y.b) dVar2).f454c;
        e0.h.b(iVar);
        u uVar = new u(iVar, (Y.f) dVar2);
        try {
            n.a(2, cVar);
            c0050k = cVar.e(uVar, uVar);
        } catch (Throwable th) {
            c0050k = new C0050k(th, false);
        }
        X.a aVar = X.a.f450b;
        if (c0050k == aVar || (C2 = uVar.C(c0050k)) == AbstractC0058t.f940d) {
            C2 = aVar;
        } else {
            if (C2 instanceof C0050k) {
                throw ((C0050k) C2).f925a;
            }
            I i2 = C2 instanceof I ? (I) C2 : null;
            if (i2 != null && (h2 = i2.f885a) != null) {
                C2 = h2;
            }
        }
        return C2 == aVar ? C2 : U.g.f433a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(r rVar, W.d dVar) {
        a aVar;
        int i2;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i3 = aVar.f1085h;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                aVar.f1085h = i3 - Integer.MIN_VALUE;
                Object obj = aVar.f1083f;
                X.a aVar2 = X.a.f450b;
                i2 = aVar.f1085h;
                U.g gVar = U.g.f433a;
                if (i2 != 0) {
                    AbstractC0016a.D(obj);
                    aVar.f1082e = rVar;
                    aVar.f1085h = 1;
                    Object e2 = this.f1089e.e(rVar, aVar);
                    if (e2 != aVar2) {
                        e2 = gVar;
                    }
                    if (e2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    rVar = aVar.f1082e;
                    AbstractC0016a.D(obj);
                }
                if (((q) rVar).f1075e.p()) {
                    throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
                }
                return gVar;
            }
        }
        aVar = new a(this, (Y.b) dVar);
        Object obj2 = aVar.f1083f;
        X.a aVar22 = X.a.f450b;
        i2 = aVar.f1085h;
        U.g gVar2 = U.g.f433a;
        if (i2 != 0) {
        }
        if (((q) rVar).f1075e.p()) {
        }
    }

    public final String c() {
        ArrayList arrayList = new ArrayList(4);
        W.j jVar = W.j.f449b;
        W.i iVar = this.f1086b;
        if (iVar != jVar) {
            arrayList.add("context=" + iVar);
        }
        int i2 = this.f1087c;
        if (i2 != -3) {
            arrayList.add("capacity=" + i2);
        }
        int i3 = this.f1088d;
        if (i3 != 1) {
            arrayList.add("onBufferOverflow=".concat(i3 != 1 ? i3 != 2 ? i3 != 3 ? "null" : "DROP_LATEST" : "DROP_OLDEST" : "SUSPEND"));
        }
        return getClass().getSimpleName() + '[' + V.e.I(arrayList, null, null, null, 62) + ']';
    }

    public final String toString() {
        return "block[" + this.f1089e + "] -> " + c();
    }
}
