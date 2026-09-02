package n0;

import W.j;
import e0.n;
import java.util.ArrayList;
import k0.AbstractC0060t;
import k0.C0052k;
import k0.H;
import k0.I;
import m0.q;
import m0.r;
import p0.u;
import v.C0107j;

/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: b, reason: collision with root package name */
    public final W.i f1084b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1085c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1086d;

    /* renamed from: e, reason: collision with root package name */
    public final C0107j f1087e;

    /* renamed from: f, reason: collision with root package name */
    public final C0107j f1088f;

    public b(C0107j c0107j, W.i iVar, int i2, int i3) {
        this.f1084b = iVar;
        this.f1085c = i2;
        this.f1086d = i3;
        this.f1087e = c0107j;
        this.f1088f = c0107j;
    }

    @Override // n0.c
    public Object a(d dVar, W.d dVar2) {
        Object c0052k;
        Object C2;
        H h2;
        o0.c cVar = new o0.c(dVar, this, null);
        W.i iVar = ((Y.b) dVar2).f399c;
        e0.h.b(iVar);
        u uVar = new u(iVar, (Y.f) dVar2);
        try {
            n.a(2, cVar);
            c0052k = cVar.e(uVar, uVar);
        } catch (Throwable th) {
            c0052k = new C0052k(th, false);
        }
        X.a aVar = X.a.f395b;
        if (c0052k == aVar || (C2 = uVar.C(c0052k)) == AbstractC0060t.f887d) {
            C2 = aVar;
        } else {
            if (C2 instanceof C0052k) {
                throw ((C0052k) C2).f872a;
            }
            I i2 = C2 instanceof I ? (I) C2 : null;
            if (i2 != null && (h2 = i2.f832a) != null) {
                C2 = h2;
            }
        }
        return C2 == aVar ? C2 : U.g.f378a;
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
            int i3 = aVar.f1083h;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                aVar.f1083h = i3 - Integer.MIN_VALUE;
                Object obj = aVar.f1081f;
                X.a aVar2 = X.a.f395b;
                i2 = aVar.f1083h;
                U.g gVar = U.g.f378a;
                if (i2 != 0) {
                    a.a.B(obj);
                    aVar.f1080e = rVar;
                    aVar.f1083h = 1;
                    Object e2 = this.f1087e.e(rVar, aVar);
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
                    rVar = aVar.f1080e;
                    a.a.B(obj);
                }
                if (((q) rVar).f1032e.p()) {
                    throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
                }
                return gVar;
            }
        }
        aVar = new a(this, (Y.b) dVar);
        Object obj2 = aVar.f1081f;
        X.a aVar22 = X.a.f395b;
        i2 = aVar.f1083h;
        U.g gVar2 = U.g.f378a;
        if (i2 != 0) {
        }
        if (((q) rVar).f1032e.p()) {
        }
    }

    public final String c() {
        ArrayList arrayList = new ArrayList(4);
        j jVar = j.f394b;
        W.i iVar = this.f1084b;
        if (iVar != jVar) {
            arrayList.add("context=" + iVar);
        }
        int i2 = this.f1085c;
        if (i2 != -3) {
            arrayList.add("capacity=" + i2);
        }
        int i3 = this.f1086d;
        if (i3 != 1) {
            arrayList.add("onBufferOverflow=".concat(i3 != 1 ? i3 != 2 ? i3 != 3 ? "null" : "DROP_LATEST" : "DROP_OLDEST" : "SUSPEND"));
        }
        return getClass().getSimpleName() + '[' + V.e.G(arrayList, null, null, null, 62) + ']';
    }

    public final String toString() {
        return "block[" + this.f1087e + "] -> " + c();
    }
}
