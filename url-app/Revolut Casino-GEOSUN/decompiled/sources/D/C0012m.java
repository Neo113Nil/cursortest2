package D;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import u0.C0247g;

/* renamed from: D.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0012m extends y0.f implements E0.l {

    /* renamed from: i, reason: collision with root package name */
    public Object f234i;

    /* renamed from: j, reason: collision with root package name */
    public Serializable f235j;

    /* renamed from: k, reason: collision with root package name */
    public Object f236k;

    /* renamed from: l, reason: collision with root package name */
    public Object f237l;

    /* renamed from: m, reason: collision with root package name */
    public Iterator f238m;

    /* renamed from: n, reason: collision with root package name */
    public int f239n;

    /* renamed from: o, reason: collision with root package name */
    public int f240o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ S f241p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0013n f242q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0012m(S s2, C0013n c0013n, w0.d dVar) {
        super(1, dVar);
        this.f241p = s2;
        this.f242q = c0013n;
    }

    @Override // E0.l
    public final Object i(Object obj) {
        return new C0012m(this.f241p, this.f242q, (w0.d) obj).l(C0247g.f3005a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0100 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d9  */
    @Override // y0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(Object obj) {
        U0.a a2;
        F0.n nVar;
        F0.p pVar;
        F0.p pVar2;
        Iterator it;
        U0.a aVar;
        F0.n nVar2;
        F0.p pVar3;
        C0011l c0011l;
        U0.d dVar;
        F0.p pVar4;
        F0.n nVar3;
        Object obj2;
        Object obj3;
        Integer a3;
        int i2;
        x0.a aVar2 = x0.a.f3094e;
        int i3 = this.f240o;
        C0013n c0013n = this.f242q;
        S s2 = this.f241p;
        if (i3 == 0) {
            o.g.z(obj);
            a2 = U0.e.a();
            nVar = new F0.n();
            pVar = new F0.p();
            this.f234i = a2;
            this.f235j = nVar;
            this.f236k = pVar;
            this.f237l = pVar;
            this.f240o = 1;
            obj = S.f(s2, true, this);
            if (obj == aVar2) {
                return aVar2;
            }
            pVar2 = pVar;
        } else if (i3 == 1) {
            pVar = (F0.p) this.f237l;
            pVar2 = (F0.p) this.f236k;
            nVar = (F0.n) this.f235j;
            a2 = (U0.a) this.f234i;
            o.g.z(obj);
        } else {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i2 = this.f239n;
                    obj3 = this.f234i;
                    o.g.z(obj);
                    return new C0003d(obj3, i2, ((Number) obj).intValue());
                }
                Object obj4 = (U0.a) this.f236k;
                pVar4 = (F0.p) this.f235j;
                nVar3 = (F0.n) this.f234i;
                o.g.z(obj);
                obj2 = obj4;
                try {
                    nVar3.f322e = true;
                    ((U0.d) obj2).e(null);
                    obj3 = pVar4.f324e;
                    int hashCode = obj3 == null ? obj3.hashCode() : 0;
                    l0 g2 = s2.g();
                    this.f234i = obj3;
                    this.f235j = null;
                    this.f236k = null;
                    this.f239n = hashCode;
                    this.f240o = 4;
                    a3 = g2.a();
                    if (a3 != aVar2) {
                        return aVar2;
                    }
                    i2 = hashCode;
                    obj = a3;
                    return new C0003d(obj3, i2, ((Number) obj).intValue());
                } catch (Throwable th) {
                    ((U0.d) obj2).e(null);
                    throw th;
                }
            }
            it = this.f238m;
            c0011l = (C0011l) this.f237l;
            pVar3 = (F0.p) this.f236k;
            nVar2 = (F0.n) this.f235j;
            aVar = (U0.a) this.f234i;
            o.g.z(obj);
            while (it.hasNext()) {
                E0.p pVar5 = (E0.p) it.next();
                this.f234i = aVar;
                this.f235j = nVar2;
                this.f236k = pVar3;
                this.f237l = c0011l;
                this.f238m = it;
                this.f240o = 2;
                if (pVar5.f(c0011l, this) == aVar2) {
                    return aVar2;
                }
            }
            pVar2 = pVar3;
            nVar = nVar2;
            a2 = aVar;
            c0013n.f246c = null;
            this.f234i = nVar;
            this.f235j = pVar2;
            this.f236k = a2;
            this.f237l = null;
            this.f238m = null;
            this.f240o = 3;
            dVar = (U0.d) a2;
            if (dVar.c(this) != aVar2) {
                return aVar2;
            }
            pVar4 = pVar2;
            nVar3 = nVar;
            obj2 = dVar;
            nVar3.f322e = true;
            ((U0.d) obj2).e(null);
            obj3 = pVar4.f324e;
            if (obj3 == null) {
            }
            l0 g22 = s2.g();
            this.f234i = obj3;
            this.f235j = null;
            this.f236k = null;
            this.f239n = hashCode;
            this.f240o = 4;
            a3 = g22.a();
            if (a3 != aVar2) {
            }
        }
        pVar.f324e = ((C0003d) obj).f175b;
        C0011l c0011l2 = new C0011l(a2, nVar, pVar2, s2);
        List list = (List) c0013n.f246c;
        if (list != null) {
            it = list.iterator();
            aVar = a2;
            nVar2 = nVar;
            pVar3 = pVar2;
            c0011l = c0011l2;
            while (it.hasNext()) {
            }
            pVar2 = pVar3;
            nVar = nVar2;
            a2 = aVar;
        }
        c0013n.f246c = null;
        this.f234i = nVar;
        this.f235j = pVar2;
        this.f236k = a2;
        this.f237l = null;
        this.f238m = null;
        this.f240o = 3;
        dVar = (U0.d) a2;
        if (dVar.c(this) != aVar2) {
        }
    }
}
