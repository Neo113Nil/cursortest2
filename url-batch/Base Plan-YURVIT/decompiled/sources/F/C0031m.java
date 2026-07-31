package F;

import a.AbstractC0086a;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

/* renamed from: F.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0031m extends I0.g implements O0.l {

    /* renamed from: i, reason: collision with root package name */
    public Object f399i;

    /* renamed from: j, reason: collision with root package name */
    public Serializable f400j;

    /* renamed from: k, reason: collision with root package name */
    public Object f401k;

    /* renamed from: l, reason: collision with root package name */
    public Object f402l;

    /* renamed from: m, reason: collision with root package name */
    public Iterator f403m;

    /* renamed from: n, reason: collision with root package name */
    public int f404n;

    /* renamed from: o, reason: collision with root package name */
    public int f405o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ P f406p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0032n f407q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0031m(P p2, C0032n c0032n, G0.d dVar) {
        super(1, dVar);
        this.f406p = p2;
        this.f407q = c0032n;
    }

    @Override // O0.l
    public final Object j(Object obj) {
        return new C0031m(this.f406p, this.f407q, (G0.d) obj).m(D0.h.f206a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0102, code lost:
    
        if (r14 != r8) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00db  */
    @Override // I0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(Object obj) {
        e1.a dVar;
        P0.m mVar;
        P0.o oVar;
        P0.o oVar2;
        Iterator it;
        e1.a aVar;
        P0.m mVar2;
        P0.o oVar3;
        C0030l c0030l;
        e1.d dVar2;
        P0.o oVar4;
        P0.m mVar3;
        Object obj2;
        Object obj3;
        int hashCode;
        int i2 = this.f405o;
        C0032n c0032n = this.f407q;
        P p2 = this.f406p;
        H0.a aVar2 = H0.a.f511e;
        if (i2 == 0) {
            AbstractC0086a.I(obj);
            dVar = new e1.d();
            mVar = new P0.m();
            oVar = new P0.o();
            this.f399i = dVar;
            this.f400j = mVar;
            this.f401k = oVar;
            this.f402l = oVar;
            this.f405o = 1;
            obj = P.e(p2, true, this);
            if (obj != aVar2) {
                oVar2 = oVar;
            }
            return aVar2;
        }
        if (i2 == 1) {
            oVar = (P0.o) this.f402l;
            oVar2 = (P0.o) this.f401k;
            mVar = (P0.m) this.f400j;
            dVar = (e1.a) this.f399i;
            AbstractC0086a.I(obj);
        } else {
            if (i2 == 2) {
                it = this.f403m;
                c0030l = (C0030l) this.f402l;
                oVar3 = (P0.o) this.f401k;
                mVar2 = (P0.m) this.f400j;
                aVar = (e1.a) this.f399i;
                AbstractC0086a.I(obj);
                while (it.hasNext()) {
                    O0.p pVar = (O0.p) it.next();
                    this.f399i = aVar;
                    this.f400j = mVar2;
                    this.f401k = oVar3;
                    this.f402l = c0030l;
                    this.f403m = it;
                    this.f405o = 2;
                    if (pVar.i(c0030l, this) == aVar2) {
                        break;
                    }
                }
                oVar2 = oVar3;
                mVar = mVar2;
                dVar = aVar;
                c0032n.f411c = null;
                this.f399i = mVar;
                this.f400j = oVar2;
                this.f401k = dVar;
                this.f402l = null;
                this.f403m = null;
                this.f405o = 3;
                dVar2 = (e1.d) dVar;
                if (dVar2.c(this) != aVar2) {
                    oVar4 = oVar2;
                    mVar3 = mVar;
                    obj2 = dVar2;
                    mVar3.f805e = true;
                    ((e1.d) obj2).e(null);
                    obj3 = oVar4.f807e;
                    hashCode = obj3 == null ? obj3.hashCode() : 0;
                    k0 g2 = p2.g();
                    this.f399i = obj3;
                    this.f400j = null;
                    this.f401k = null;
                    this.f404n = hashCode;
                    this.f405o = 4;
                    obj = g2.a();
                }
                return aVar2;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hashCode = this.f404n;
                obj3 = this.f399i;
                AbstractC0086a.I(obj);
                return new C0022d(obj3, hashCode, ((Number) obj).intValue());
            }
            Object obj4 = (e1.a) this.f401k;
            oVar4 = (P0.o) this.f400j;
            mVar3 = (P0.m) this.f399i;
            AbstractC0086a.I(obj);
            obj2 = obj4;
            try {
                mVar3.f805e = true;
                ((e1.d) obj2).e(null);
                obj3 = oVar4.f807e;
                hashCode = obj3 == null ? obj3.hashCode() : 0;
                k0 g22 = p2.g();
                this.f399i = obj3;
                this.f400j = null;
                this.f401k = null;
                this.f404n = hashCode;
                this.f405o = 4;
                obj = g22.a();
            } catch (Throwable th) {
                ((e1.d) obj2).e(null);
                throw th;
            }
        }
        oVar.f807e = ((C0022d) obj).f342b;
        C0030l c0030l2 = new C0030l(dVar, mVar, oVar2, p2);
        List list = (List) c0032n.f411c;
        if (list != null) {
            it = list.iterator();
            aVar = dVar;
            mVar2 = mVar;
            oVar3 = oVar2;
            c0030l = c0030l2;
            while (it.hasNext()) {
            }
            oVar2 = oVar3;
            mVar = mVar2;
            dVar = aVar;
        }
        c0032n.f411c = null;
        this.f399i = mVar;
        this.f400j = oVar2;
        this.f401k = dVar;
        this.f402l = null;
        this.f403m = null;
        this.f405o = 3;
        dVar2 = (e1.d) dVar;
        if (dVar2.c(this) != aVar2) {
        }
        return aVar2;
    }
}
