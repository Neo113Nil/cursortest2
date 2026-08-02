package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class kxb implements kwu {
    private final kuk a;
    public final kuk e;

    public kxb(boolean z) {
        kwe kweVar = z ? kxc.h : kxc.g;
        kul kulVar = kul.a;
        this.e = new kuk(kweVar, kulVar);
        this.a = new kuk(null, kulVar);
    }

    public static final kvb P(lcs lcsVar) {
        while (lcsVar.bT()) {
            lcsVar = lcsVar.h();
        }
        while (true) {
            lcsVar = lcsVar.g();
            if (!lcsVar.bT()) {
                if (lcsVar instanceof kvb) {
                    return (kvb) lcsVar;
                }
                if (lcsVar instanceof kxg) {
                    return null;
                }
            }
        }
    }

    private final void R(kwx kwxVar) {
        kxg kxgVar = new kxg();
        kxgVar.f.b(kwxVar);
        kxgVar.e.b(kwxVar);
        while (true) {
            if (kwxVar.f() != kwxVar) {
                break;
            } else if (kwxVar.e.d(kwxVar, kxgVar)) {
                kxgVar.k(kwxVar);
                break;
            }
        }
        this.e.d(kwxVar, kwxVar.g());
    }

    private final boolean S(Throwable th) {
        if (o()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        kva E = E();
        return (E == null || E == kxi.a) ? z : E.d(th) || z;
    }

    private static final String T(Object obj) {
        if (!(obj instanceof kxa)) {
            return obj instanceof kwq ? ((kwq) obj).bR() ? "Active" : "New" : obj instanceof kve ? "Cancelled" : "Completed";
        }
        kxa kxaVar = (kxa) obj;
        return kxaVar.g() ? "Cancelling" : kxaVar.h() ? "Completing" : "Active";
    }

    private final int d(Object obj) {
        if (obj instanceof kwe) {
            if (((kwe) obj).a) {
                return 0;
            }
            if (!this.e.d(obj, kxc.h)) {
                return -1;
            }
            I();
            return 1;
        }
        if (!(obj instanceof kwp)) {
            return 0;
        }
        if (!this.e.d(obj, ((kwp) obj).a)) {
            return -1;
        }
        I();
        return 1;
    }

    private final Object f(Object obj, Object obj2) {
        if (!(obj instanceof kwq)) {
            return kxc.b;
        }
        if (((obj instanceof kwe) || (obj instanceof kwx)) && !(obj instanceof kvb) && !(obj2 instanceof kve)) {
            kwq kwqVar = (kwq) obj;
            boolean z = kvo.a;
            if (!this.e.d(kwqVar, kxc.a(obj2))) {
                return kxc.d;
            }
            l(obj2);
            j(kwqVar, obj2);
            return obj2;
        }
        kwq kwqVar2 = (kwq) obj;
        kxg h = h(kwqVar2);
        if (h == null) {
            return kxc.d;
        }
        Throwable th = null;
        kxa kxaVar = kwqVar2 instanceof kxa ? (kxa) kwqVar2 : null;
        if (kxaVar == null) {
            kxaVar = new kxa(h, null);
        }
        ksw kswVar = new ksw();
        synchronized (kxaVar) {
            if (kxaVar.h()) {
                return kxc.b;
            }
            kxaVar.b.c();
            if (kxaVar != kwqVar2 && !this.e.d(kwqVar2, kxaVar)) {
                return kxc.d;
            }
            boolean z2 = kvo.a;
            boolean g = kxaVar.g();
            kve kveVar = obj2 instanceof kve ? (kve) obj2 : null;
            if (kveVar != null) {
                kxaVar.e(kveVar.b);
            }
            Throwable d = kxaVar.d();
            boolean z3 = !g;
            Boolean.valueOf(z3).getClass();
            if (true == z3) {
                th = d;
            }
            kswVar.a = th;
            Throwable th2 = (Throwable) kswVar.a;
            if (th2 != null) {
                k(h, th2);
            }
            kvb P = P(h);
            if (P != null && O(kxaVar, P, obj2)) {
                return kxc.c;
            }
            h.j(2);
            kvb P2 = P(h);
            return (P2 == null || !O(kxaVar, P2, obj2)) ? z(kxaVar, obj2) : kxc.c;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Throwable] */
    private final Throwable g(Object obj) {
        CancellationException cancellationException;
        if (obj == null || (obj instanceof Throwable)) {
            Throwable th = (Throwable) obj;
            return th != null ? th : new kwv(a(), null, this);
        }
        kxb kxbVar = (kxb) obj;
        Object B = kxbVar.B();
        if (B instanceof kxa) {
            cancellationException = ((kxa) B).d();
        } else if (B instanceof kve) {
            cancellationException = ((kve) B).b;
        } else {
            if (B instanceof kwq) {
                Objects.toString(B);
                throw new IllegalStateException("Cannot be cancelling child in this state: ".concat(String.valueOf(B)));
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        return cancellationException2 == null ? new kwv("Parent job is ".concat(T(B)), cancellationException, kxbVar) : cancellationException2;
    }

    private final kxg h(kwq kwqVar) {
        kxg bP = kwqVar.bP();
        if (bP != null) {
            return bP;
        }
        if (kwqVar instanceof kwe) {
            return new kxg();
        }
        if (kwqVar instanceof kwx) {
            R((kwx) kwqVar);
            return null;
        }
        Objects.toString(kwqVar);
        throw new IllegalStateException("State should have list: ".concat(String.valueOf(kwqVar)));
    }

    private final void j(kwq kwqVar, Object obj) {
        kva E = E();
        if (E != null) {
            E.bQ();
            J(kxi.a);
        }
        kvf kvfVar = null;
        kve kveVar = obj instanceof kve ? (kve) obj : null;
        Throwable th = kveVar != null ? kveVar.b : null;
        if (kwqVar instanceof kwx) {
            try {
                ((kwx) kwqVar).a(th);
                return;
            } catch (Throwable th2) {
                bY(new kvf(a.ae(this, kwqVar, "Exception in completion handler ", " for "), th2));
                return;
            }
        }
        kxg bP = kwqVar.bP();
        if (bP != null) {
            bP.j(1);
            Object f = bP.f();
            f.getClass();
            for (lcs lcsVar = (lcs) f; !ksp.b(lcsVar, bP); lcsVar = lcsVar.g()) {
                if ((lcsVar instanceof kwx) && !lcsVar.bT()) {
                    try {
                        ((kwx) lcsVar).a(th);
                    } catch (Throwable th3) {
                        if (kvfVar != null) {
                            koc.b(kvfVar, th3);
                        } else {
                            kvfVar = new kvf(a.ae(this, lcsVar, "Exception in completion handler ", " for "), th3);
                        }
                    }
                }
            }
            if (kvfVar != null) {
                bY(kvfVar);
            }
        }
    }

    private final void k(kxg kxgVar, Throwable th) {
        kxgVar.j(4);
        Object f = kxgVar.f();
        f.getClass();
        kvf kvfVar = null;
        for (lcs lcsVar = (lcs) f; !ksp.b(lcsVar, kxgVar); lcsVar = lcsVar.g()) {
            if ((lcsVar instanceof kwx) && !lcsVar.bT()) {
                kwx kwxVar = (kwx) lcsVar;
                if (kwxVar.b()) {
                    try {
                        kwxVar.a(th);
                    } catch (Throwable th2) {
                        if (kvfVar != null) {
                            koc.b(kvfVar, th2);
                        } else {
                            kvfVar = new kvf(a.ae(this, lcsVar, "Exception in completion handler ", " for "), th2);
                        }
                    }
                }
            }
        }
        if (kvfVar != null) {
            bY(kvfVar);
        }
        S(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kwp] */
    private final void m(kwe kweVar) {
        kxg kxgVar = new kxg();
        if (!kweVar.a) {
            kxgVar = new kwp(kxgVar);
        }
        this.e.d(kweVar, kxgVar);
    }

    public final Object B() {
        return this.e.a;
    }

    public final Object C(Object obj) {
        Object f;
        do {
            f = f(B(), obj);
            if (f == kxc.b) {
                String ae = a.ae(obj, this, "Job ", " is already complete or completing, but is being completed with ");
                kve kveVar = obj instanceof kve ? (kve) obj : null;
                throw new IllegalStateException(ae, kveVar != null ? kveVar.b : null);
            }
        } while (f == kxc.d);
        return f;
    }

    protected final CancellationException D(Throwable th, String str) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            if (str == null) {
                str = a();
            }
            cancellationException = new kwv(str, th, this);
        }
        return cancellationException;
    }

    public final kva E() {
        return (kva) this.a.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
    
        return r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kwc F(boolean z, kwx kwxVar) {
        boolean l;
        kwxVar.d = this;
        while (true) {
            Object B = B();
            if (B instanceof kwe) {
                kwe kweVar = (kwe) B;
                if (!kweVar.a) {
                    m(kweVar);
                } else if (this.e.d(B, kwxVar)) {
                    break;
                }
            } else {
                if (B instanceof kwq) {
                    kwq kwqVar = (kwq) B;
                    kxg bP = kwqVar.bP();
                    if (bP == null) {
                        B.getClass();
                        R((kwx) B);
                    } else {
                        if (kwxVar.b()) {
                            kxa kxaVar = kwqVar instanceof kxa ? (kxa) kwqVar : null;
                            Throwable d = kxaVar != null ? kxaVar.d() : null;
                            if (d == null) {
                                l = bP.l(kwxVar, 5);
                            } else if (z) {
                                kwxVar.a(d);
                            }
                        } else {
                            l = bP.l(kwxVar, 1);
                        }
                        if (l) {
                            break;
                        }
                    }
                } else if (z) {
                    Object B2 = B();
                    kve kveVar = B2 instanceof kve ? (kve) B2 : null;
                    kwxVar.a(kveVar != null ? kveVar.b : null);
                }
            }
        }
        return kxi.a;
    }

    public void G(Throwable th) {
        K(th);
    }

    protected final void H(kwu kwuVar) {
        boolean z = kvo.a;
        if (kwuVar == null) {
            J(kxi.a);
            return;
        }
        kwuVar.x();
        kva v = kwuVar.v(this);
        J(v);
        if (N()) {
            v.bQ();
            J(kxi.a);
        }
    }

    public final void J(kva kvaVar) {
        this.a.c(kvaVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d9, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0062, code lost:
    
        if (r4 == null) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean K(Object obj) {
        Object obj2;
        ldb ldbVar;
        boolean bO = bO();
        ldb ldbVar2 = kxc.b;
        if (bO) {
            do {
                Object B = B();
                if (!(B instanceof kwq) || ((B instanceof kxa) && ((kxa) B).h())) {
                    obj2 = ldbVar2;
                    break;
                }
                obj2 = f(B, new kve(g(obj), false));
            } while (obj2 == kxc.d);
            if (obj2 == kxc.c) {
                return true;
            }
        } else {
            obj2 = ldbVar2;
        }
        if (obj2 == ldbVar2) {
            Throwable th = null;
            while (true) {
                Object B2 = B();
                if (!(B2 instanceof kxa)) {
                    if (!(B2 instanceof kwq)) {
                        ldbVar = kxc.e;
                        break;
                    }
                    if (th == null) {
                        th = g(obj);
                    }
                    kwq kwqVar = (kwq) B2;
                    if (kwqVar.bR()) {
                        boolean z = kvo.a;
                        kxg h = h(kwqVar);
                        if (h != null) {
                            if (this.e.d(kwqVar, new kxa(h, th))) {
                                k(h, th);
                                ldbVar = kxc.b;
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        Object f = f(B2, new kve(th, false));
                        if (f == ldbVar2) {
                            Objects.toString(B2);
                            throw new IllegalStateException("Cannot happen in ".concat(String.valueOf(B2)));
                        }
                        if (f != kxc.d) {
                            obj2 = f;
                            break;
                        }
                    }
                } else {
                    synchronized (B2) {
                        kxa kxaVar = (kxa) B2;
                        if (kxaVar.c() == kxc.f) {
                            ldbVar = kxc.e;
                        } else {
                            boolean g = kxaVar.g();
                            if (obj == null) {
                                if (!g) {
                                    if (th == null) {
                                        th = g(obj);
                                    }
                                    kxaVar.e(th);
                                }
                            }
                            Throwable d = true != g ? kxaVar.d() : null;
                            if (d != null) {
                                k(((kxa) B2).a, d);
                            }
                            ldbVar = kxc.b;
                        }
                    }
                }
            }
        }
        if (obj2 == kxc.b || obj2 == kxc.c) {
            return true;
        }
        if (obj2 == kxc.e) {
            return false;
        }
        n(obj2);
        return true;
    }

    public boolean L(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return K(th) && bN();
    }

    protected boolean M(Throwable th) {
        return false;
    }

    public final boolean N() {
        return !(B() instanceof kwq);
    }

    public final boolean O(kxa kxaVar, kvb kvbVar, Object obj) {
        while (ixi.g(kvbVar.a, false, new kwz(this, kxaVar, kvbVar, obj)) == kxi.a) {
            kvbVar = P(kvbVar);
            if (kvbVar == null) {
                return false;
            }
        }
        return true;
    }

    public final void Q(Object obj) {
        Object f;
        do {
            f = f(B(), obj);
            if (f == kxc.b || f == kxc.c) {
                return;
            }
        } while (f == kxc.d);
        n(f);
    }

    protected String a() {
        return "Job was cancelled";
    }

    public boolean bN() {
        return true;
    }

    public boolean bO() {
        return false;
    }

    public String c() {
        return kvp.a(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object cb(kqj kqjVar) {
        Object B;
        do {
            B = B();
            if (!(B instanceof kwq)) {
                if (!(B instanceof kve)) {
                    return kxc.b(B);
                }
                Throwable th = ((kve) B).b;
                if (kvo.b) {
                    throw lda.a(th, kqjVar);
                }
                throw th;
            }
        } while (d(B) < 0);
        kwy kwyVar = new kwy(ixe.d(kqjVar), this);
        kwyVar.y();
        ixg.d(kwyVar, ixi.g(this, true, new kxn(kwyVar)));
        return kwyVar.l();
    }

    public final Object cc() {
        Object B = B();
        if (B instanceof kwq) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (B instanceof kve) {
            throw ((kve) B).b;
        }
        return kxc.b(B);
    }

    @Override // defpackage.kwu
    public final kwu cd() {
        kva E = E();
        if (E != null) {
            return E.c();
        }
        return null;
    }

    @Override // defpackage.kwu
    public final boolean ce() {
        Object B = B();
        if (B instanceof kve) {
            return true;
        }
        return (B instanceof kxa) && ((kxa) B).g();
    }

    @Override // defpackage.kqn
    public final Object fold(Object obj, krx krxVar) {
        return ixe.e(this, obj, krxVar);
    }

    @Override // defpackage.kql, defpackage.kqn
    public final kql get(kqm kqmVar) {
        return ixe.f(this, kqmVar);
    }

    @Override // defpackage.kql
    public final kqm getKey() {
        return kwu.d;
    }

    @Override // defpackage.kqn
    public final kqn minusKey(kqm kqmVar) {
        return ixe.g(this, kqmVar);
    }

    protected boolean o() {
        return false;
    }

    @Override // defpackage.kwu
    public final CancellationException p() {
        Object B = B();
        if (!(B instanceof kxa)) {
            if (!(B instanceof kwq)) {
                return B instanceof kve ? D(((kve) B).b, null) : new kwv(String.valueOf(kvp.a(this)).concat(" has completed normally"), null, this);
            }
            toString();
            throw new IllegalStateException("Job is still new or active: ".concat(toString()));
        }
        Throwable d = ((kxa) B).d();
        if (d != null) {
            return D(d, String.valueOf(kvp.a(this)).concat(" is cancelling"));
        }
        toString();
        throw new IllegalStateException("Job is still new or active: ".concat(toString()));
    }

    @Override // defpackage.kqn
    public final kqn plus(kqn kqnVar) {
        return ixe.h(this, kqnVar);
    }

    @Override // defpackage.kwu
    public final kwc q(boolean z, boolean z2, krt krtVar) {
        return F(z2, z ? new kws(krtVar) : new kwt(krtVar));
    }

    @Override // defpackage.kwu
    public void s(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new kwv(a(), null, this);
        }
        G(cancellationException);
    }

    @Override // defpackage.kwu
    public final boolean t() {
        Object B = B();
        return (B instanceof kwq) && ((kwq) B).bR();
    }

    public final String toString() {
        return (c() + "{" + T(B()) + "}") + "@" + kvp.b(this);
    }

    @Override // defpackage.kwu
    public final kva v(kxb kxbVar) {
        kvb kvbVar = new kvb(kxbVar);
        kvbVar.d = this;
        while (true) {
            Object B = B();
            if (B instanceof kwe) {
                kwe kweVar = (kwe) B;
                if (!kweVar.a) {
                    m(kweVar);
                } else if (this.e.d(B, kvbVar)) {
                    break;
                }
            } else {
                if (!(B instanceof kwq)) {
                    Object B2 = B();
                    kve kveVar = B2 instanceof kve ? (kve) B2 : null;
                    kvbVar.a(kveVar != null ? kveVar.b : null);
                    return kxi.a;
                }
                kxg bP = ((kwq) B).bP();
                if (bP == null) {
                    B.getClass();
                    R((kwx) B);
                } else if (!bP.l(kvbVar, 7)) {
                    boolean l = bP.l(kvbVar, 3);
                    Object B3 = B();
                    if (B3 instanceof kxa) {
                        r2 = ((kxa) B3).d();
                    } else {
                        boolean z = kvo.a;
                        kve kveVar2 = B3 instanceof kve ? (kve) B3 : null;
                        if (kveVar2 != null) {
                            r2 = kveVar2.b;
                        }
                    }
                    kvbVar.a(r2);
                    if (!l) {
                        return kxi.a;
                    }
                    boolean z2 = kvo.a;
                    return kvbVar;
                }
            }
        }
        return kvbVar;
    }

    @Override // defpackage.kwu
    public final void w(krt krtVar) {
        F(true, new kwt(krtVar));
    }

    @Override // defpackage.kwu
    public final void x() {
        int d;
        do {
            d = d(B());
            if (d == 0) {
                return;
            }
        } while (d != 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f0, code lost:
    
        if (r7 == r6) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f4, code lost:
    
        if ((r7 instanceof java.util.concurrent.CancellationException) != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00fa, code lost:
    
        if (r3.add(r7) == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00fc, code lost:
    
        defpackage.koc.b(r1, r7);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00dd A[Catch: all -> 0x0144, TryCatch #0 {, blocks: (B:8:0x0013, B:10:0x001d, B:11:0x0037, B:13:0x003e, B:15:0x0043, B:17:0x0049, B:18:0x004c, B:20:0x0057, B:22:0x005d, B:25:0x00ad, B:28:0x00b5, B:32:0x00d3, B:33:0x00d7, B:35:0x00dd, B:42:0x00f2, B:45:0x00f6, B:48:0x00fc, B:55:0x00e6, B:57:0x00ea, B:59:0x00c9, B:61:0x00cf, B:75:0x0068, B:76:0x006c, B:78:0x0072, B:82:0x007f, B:84:0x0083, B:86:0x008d, B:87:0x0091, B:89:0x0097, B:92:0x00a0, B:96:0x00a5, B:107:0x0023, B:109:0x0027, B:110:0x0031, B:112:0x0035, B:113:0x0131, B:114:0x0143), top: B:7:0x0013 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object z(kxa kxaVar, Object obj) {
        ArrayList<Throwable> arrayList;
        Object obj2;
        Throwable th;
        boolean z;
        Throwable c;
        boolean z2 = kvo.a;
        Throwable th2 = null;
        kve kveVar = obj instanceof kve ? (kve) obj : null;
        Throwable th3 = kveVar != null ? kveVar.b : null;
        synchronized (kxaVar) {
            kxaVar.g();
            Object c2 = kxaVar.c();
            if (c2 == null) {
                arrayList = new ArrayList(4);
            } else if (c2 instanceof Throwable) {
                ArrayList arrayList2 = new ArrayList(4);
                arrayList2.add(c2);
                arrayList = arrayList2;
            } else {
                if (!(c2 instanceof ArrayList)) {
                    Objects.toString(c2);
                    throw new IllegalStateException("State is ".concat(c2.toString()));
                }
                arrayList = (ArrayList) c2;
            }
            Throwable d = kxaVar.d();
            if (d != null) {
                arrayList.add(0, d);
            }
            if (th3 != null && !ksp.b(th3, d)) {
                arrayList.add(th3);
            }
            kxaVar.f(kxc.f);
            if (arrayList.isEmpty()) {
                if (kxaVar.g()) {
                    th = new kwv(a(), null, this);
                    th2 = th;
                }
                if (th2 != null && arrayList.size() > 1) {
                    Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayList.size()));
                    boolean z3 = lbp.a;
                    z = lbp.a;
                    if (!z && kvo.b) {
                        c = lda.c(th2);
                        for (Throwable th4 : arrayList) {
                            if (!z && kvo.b) {
                                th4 = lda.c(th4);
                            }
                        }
                    }
                    c = th2;
                    while (r2.hasNext()) {
                    }
                }
            } else {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (!(((Throwable) obj2) instanceof CancellationException)) {
                        break;
                    }
                }
                Throwable th5 = (Throwable) obj2;
                if (th5 == null) {
                    th = (Throwable) arrayList.get(0);
                    if (th instanceof kxw) {
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            Object next = it2.next();
                            Throwable th6 = (Throwable) next;
                            if (th6 != th && (th6 instanceof kxw)) {
                                th2 = next;
                                break;
                            }
                        }
                        th2 = th2;
                        if (th2 == null) {
                        }
                    }
                    th2 = th;
                } else {
                    th2 = th5;
                }
                if (th2 != null) {
                    Set newSetFromMap2 = Collections.newSetFromMap(new IdentityHashMap(arrayList.size()));
                    boolean z32 = lbp.a;
                    z = lbp.a;
                    if (!z) {
                        c = lda.c(th2);
                        while (r2.hasNext()) {
                        }
                    }
                    c = th2;
                    while (r2.hasNext()) {
                    }
                }
            }
        }
        if (th2 != null && th2 != th3) {
            obj = new kve(th2, false);
        }
        if (th2 != null && (S(th2) || M(th2))) {
            obj.getClass();
            ((kve) obj).a();
        }
        l(obj);
        this.e.d(kxaVar, kxc.a(obj));
        j(kxaVar, obj);
        return obj;
    }

    protected void I() {
    }

    public void bY(Throwable th) {
        throw th;
    }

    protected void l(Object obj) {
    }

    protected void n(Object obj) {
    }
}
