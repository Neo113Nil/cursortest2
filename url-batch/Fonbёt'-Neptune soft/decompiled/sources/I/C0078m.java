package I;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

/* renamed from: I.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0078m extends J0.g implements P0.l {

    /* renamed from: i, reason: collision with root package name */
    public Object f679i;

    /* renamed from: j, reason: collision with root package name */
    public Serializable f680j;

    /* renamed from: k, reason: collision with root package name */
    public Object f681k;

    /* renamed from: l, reason: collision with root package name */
    public Object f682l;

    /* renamed from: m, reason: collision with root package name */
    public Iterator f683m;

    /* renamed from: n, reason: collision with root package name */
    public int f684n;

    /* renamed from: o, reason: collision with root package name */
    public int f685o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ P f686p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0079n f687q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0078m(P p2, C0079n c0079n, H0.d dVar) {
        super(1, dVar);
        this.f686p = p2;
        this.f687q = c0079n;
    }

    @Override // P0.l
    public final Object i(Object obj) {
        return new C0078m(this.f686p, this.f687q, (H0.d) obj).l(F0.h.f469a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0100 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d9  */
    @Override // J0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(Object obj) {
        g1.a a2;
        Q0.m mVar;
        Q0.o oVar;
        Q0.o oVar2;
        Iterator it;
        g1.a aVar;
        Q0.m mVar2;
        Q0.o oVar3;
        C0077l c0077l;
        g1.d dVar;
        Q0.o oVar4;
        Q0.m mVar3;
        Object obj2;
        Object obj3;
        Integer a3;
        int i2;
        I0.a aVar2 = I0.a.f733e;
        int i3 = this.f685o;
        C0079n c0079n = this.f687q;
        P p2 = this.f686p;
        if (i3 == 0) {
            i1.a.G(obj);
            a2 = g1.e.a();
            mVar = new Q0.m();
            oVar = new Q0.o();
            this.f679i = a2;
            this.f680j = mVar;
            this.f681k = oVar;
            this.f682l = oVar;
            this.f685o = 1;
            obj = P.f(p2, true, this);
            if (obj == aVar2) {
                return aVar2;
            }
            oVar2 = oVar;
        } else if (i3 == 1) {
            oVar = (Q0.o) this.f682l;
            oVar2 = (Q0.o) this.f681k;
            mVar = (Q0.m) this.f680j;
            a2 = (g1.a) this.f679i;
            i1.a.G(obj);
        } else {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i2 = this.f684n;
                    obj3 = this.f679i;
                    i1.a.G(obj);
                    return new C0069d(obj3, i2, ((Number) obj).intValue());
                }
                Object obj4 = (g1.a) this.f681k;
                oVar4 = (Q0.o) this.f680j;
                mVar3 = (Q0.m) this.f679i;
                i1.a.G(obj);
                obj2 = obj4;
                try {
                    mVar3.f981e = true;
                    ((g1.d) obj2).e(null);
                    obj3 = oVar4.f983e;
                    int hashCode = obj3 == null ? obj3.hashCode() : 0;
                    j0 g2 = p2.g();
                    this.f679i = obj3;
                    this.f680j = null;
                    this.f681k = null;
                    this.f684n = hashCode;
                    this.f685o = 4;
                    a3 = g2.a();
                    if (a3 != aVar2) {
                        return aVar2;
                    }
                    i2 = hashCode;
                    obj = a3;
                    return new C0069d(obj3, i2, ((Number) obj).intValue());
                } catch (Throwable th) {
                    ((g1.d) obj2).e(null);
                    throw th;
                }
            }
            it = this.f683m;
            c0077l = (C0077l) this.f682l;
            oVar3 = (Q0.o) this.f681k;
            mVar2 = (Q0.m) this.f680j;
            aVar = (g1.a) this.f679i;
            i1.a.G(obj);
            while (it.hasNext()) {
                P0.p pVar = (P0.p) it.next();
                this.f679i = aVar;
                this.f680j = mVar2;
                this.f681k = oVar3;
                this.f682l = c0077l;
                this.f683m = it;
                this.f685o = 2;
                if (pVar.h(c0077l, this) == aVar2) {
                    return aVar2;
                }
            }
            oVar2 = oVar3;
            mVar = mVar2;
            a2 = aVar;
            c0079n.f691g = null;
            this.f679i = mVar;
            this.f680j = oVar2;
            this.f681k = a2;
            this.f682l = null;
            this.f683m = null;
            this.f685o = 3;
            dVar = (g1.d) a2;
            if (dVar.c(this) != aVar2) {
                return aVar2;
            }
            oVar4 = oVar2;
            mVar3 = mVar;
            obj2 = dVar;
            mVar3.f981e = true;
            ((g1.d) obj2).e(null);
            obj3 = oVar4.f983e;
            if (obj3 == null) {
            }
            j0 g22 = p2.g();
            this.f679i = obj3;
            this.f680j = null;
            this.f681k = null;
            this.f684n = hashCode;
            this.f685o = 4;
            a3 = g22.a();
            if (a3 != aVar2) {
            }
        }
        oVar.f983e = ((C0069d) obj).f623b;
        C0077l c0077l2 = new C0077l(a2, mVar, oVar2, p2);
        List list = (List) c0079n.f691g;
        if (list != null) {
            it = list.iterator();
            aVar = a2;
            mVar2 = mVar;
            oVar3 = oVar2;
            c0077l = c0077l2;
            while (it.hasNext()) {
            }
            oVar2 = oVar3;
            mVar = mVar2;
            a2 = aVar;
        }
        c0079n.f691g = null;
        this.f679i = mVar;
        this.f680j = oVar2;
        this.f681k = a2;
        this.f682l = null;
        this.f683m = null;
        this.f685o = 3;
        dVar = (g1.d) a2;
        if (dVar.c(this) != aVar2) {
        }
    }
}
