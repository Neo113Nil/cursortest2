package n;

import e2.InterfaceC0426e;
import q2.AbstractC0837y;
import q2.InterfaceC0835w;

/* renamed from: n.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0678d extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public boolean f7111h;

    /* renamed from: i, reason: collision with root package name */
    public int f7112i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f7113j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p.T f7114k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f7115l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ q.k f7116m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0698y f7117n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0678d(p.T t3, long j3, q.k kVar, C0698y c0698y, V1.d dVar) {
        super(2, dVar);
        this.f7114k = t3;
        this.f7115l = j3;
        this.f7116m = kVar;
        this.f7117n = c0698y;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C0678d) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        C0678d c0678d = new C0678d(this.f7114k, this.f7115l, this.f7116m, this.f7117n, dVar);
        c0678d.f7113j = obj;
        return c0678d;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008a  */
    @Override // X1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        q2.X r3;
        Object c2;
        boolean z3;
        q.n nVar;
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f7112i;
        C0698y c0698y = this.f7117n;
        q.k kVar = this.f7116m;
        if (i3 == 0) {
            R1.a.e(obj);
            r3 = AbstractC0837y.r((InterfaceC0835w) this.f7113j, null, null, new C0677c(this.f7117n, this.f7115l, this.f7116m, null), 3);
            this.f7113j = r3;
            this.f7112i = 1;
            c2 = this.f7114k.c(this);
            if (c2 == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4 && i3 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        R1.a.e(obj);
                        c0698y.C = null;
                        return R1.y.f4171a;
                    }
                    nVar = (q.n) this.f7113j;
                    R1.a.e(obj);
                    this.f7113j = null;
                    this.f7112i = 4;
                    if (kVar.b(nVar, this) == aVar) {
                        return aVar;
                    }
                    c0698y.C = null;
                    return R1.y.f4171a;
                }
                z3 = this.f7111h;
                R1.a.e(obj);
                if (z3) {
                    q.m mVar = new q.m(this.f7115l);
                    q.n nVar2 = new q.n(mVar);
                    this.f7113j = nVar2;
                    this.f7112i = 3;
                    if (kVar.b(mVar, this) == aVar) {
                        return aVar;
                    }
                    nVar = nVar2;
                    this.f7113j = null;
                    this.f7112i = 4;
                    if (kVar.b(nVar, this) == aVar) {
                    }
                }
                c0698y.C = null;
                return R1.y.f4171a;
            }
            r3 = (q2.X) this.f7113j;
            R1.a.e(obj);
            c2 = obj;
        }
        boolean booleanValue = ((Boolean) c2).booleanValue();
        if (r3.b()) {
            this.f7113j = null;
            this.f7111h = booleanValue;
            this.f7112i = 2;
            if (AbstractC0837y.d(r3, this) == aVar) {
                return aVar;
            }
            z3 = booleanValue;
            if (z3) {
            }
            c0698y.C = null;
            return R1.y.f4171a;
        }
        q.m mVar2 = c0698y.C;
        if (mVar2 != null) {
            q.i nVar3 = booleanValue ? new q.n(mVar2) : new q.l(mVar2);
            this.f7113j = null;
            this.f7112i = 5;
            if (kVar.b(nVar3, this) == aVar) {
                return aVar;
            }
        }
        c0698y.C = null;
        return R1.y.f4171a;
    }
}
