package defpackage;

import android.content.Intent;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class evv implements htr {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ evv(etd etdVar, hvi hviVar, evm evmVar, String str, int i) {
        this.e = i;
        this.c = etdVar;
        this.d = hviVar;
        this.b = evmVar;
        this.a = str;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [hvi, java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v12, types: [guq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [fth, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v19, types: [hvi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v32, types: [hvi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object, java.util.concurrent.Future] */
    @Override // defpackage.htr
    public final hvi a(Object obj) {
        int i = this.e;
        if (i == 0) {
            Object obj2 = this.a;
            if (!((String) obj).equals(obj2)) {
                return hve.a;
            }
            kee keeVar = evw.a;
            if (keeVar == null || !keeVar.p(((evm) this.b).a, (String) obj2)) {
                return ((etd) this.c).b().a(((ewd) this.d).c);
            }
            return hve.a;
        }
        if (i == 1) {
            ewd ewdVar = (ewd) hnu.aR(this.d);
            if (ewdVar.c.isEmpty()) {
                return hve.a;
            }
            Object obj3 = this.a;
            Object obj4 = this.b;
            Object obj5 = this.c;
            etd etdVar = (etd) obj5;
            return hti.g(hvc.v(hti.f(hvc.v(evo.b(etdVar).d()), new euy(((evm) obj4).a, 4), etdVar.d())), new evv(obj3, obj4, obj5, ewdVar, 0), etdVar.d());
        }
        if (i != 2) {
            if (i == 3) {
                Object obj6 = this.d;
                return ((fto) this.a).c((frv) this.b, (Intent) this.c, (frx) obj6);
            }
            TimeoutException timeoutException = (TimeoutException) obj;
            ?? r0 = this.b;
            int i2 = gwd.a;
            if (!r0.isDone()) {
                ?? r1 = this.c;
                if (r1 != 0) {
                    timeoutException.setStackTrace(gwd.l(r1, null));
                    gwd.i(r1, timeoutException);
                    gwd.g(r1, timeoutException);
                }
                hnu.aU(this.a, r0);
            }
            return this.d;
        }
        fuf fufVar = (fuf) obj;
        boolean contains = ((fto) this.a).a.contains(fufVar.b.k);
        ?? r4 = this.d;
        Object obj7 = this.c;
        if (!contains) {
            hoq.I(fufVar.c != 3, "Can't auto-select disabled accounts.");
        }
        Object obj8 = this.b;
        frx frxVar = (frx) obj8;
        hoq.I(frxVar.a.compareAndSet(false, true), "AccountOperationContext is already in the mutable state. This may be caused by concurrent access to the object, which is forbidden.");
        fdg fdgVar = new fdg(frxVar, 2);
        try {
            hvi b = r4.b((frv) obj7);
            fdgVar.close();
            return hti.f(b, gvx.a(new bso(obj7, obj8, 9)), huf.a);
        } finally {
        }
    }

    public /* synthetic */ evv(fto ftoVar, frx frxVar, fth fthVar, frv frvVar, int i) {
        this.e = i;
        this.a = ftoVar;
        this.b = frxVar;
        this.d = fthVar;
        this.c = frvVar;
    }

    public /* synthetic */ evv(hvi hviVar, hvi hviVar2, guq guqVar, hvi hviVar3, int i) {
        this.e = i;
        this.b = hviVar;
        this.d = hviVar2;
        this.c = guqVar;
        this.a = hviVar3;
    }

    public /* synthetic */ evv(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.e = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }
}
