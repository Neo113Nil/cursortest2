package Z2;

import kotlin.Unit;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class M extends E2.j implements L2.c {

    /* renamed from: k, reason: collision with root package name */
    public int f4644k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ InterfaceC0331g f4645l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ int f4646m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ O f4647n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(O o4, C2.a aVar) {
        super(3, aVar);
        this.f4647n = o4;
    }

    @Override // L2.c
    public final Object g(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj2).intValue();
        M m4 = new M(this.f4647n, (C2.a) obj3);
        m4.f4645l = (InterfaceC0331g) obj;
        m4.f4646m = intValue;
        return m4.l(Unit.f7487a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    @Override // E2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(Object obj) {
        InterfaceC0331g interfaceC0331g;
        long j4;
        J j5;
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f4644k;
        O o4 = this.f4647n;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            interfaceC0331g = this.f4645l;
            if (this.f4646m > 0) {
                J j6 = J.f4637d;
                this.f4644k = 1;
                if (interfaceC0331g.d(j6, this) == aVar) {
                    return aVar;
                }
                return Unit.f7487a;
            }
            long j7 = o4.f4649a;
            this.f4645l = interfaceC0331g;
            this.f4644k = 2;
            if (W2.F.a(j7, this) == aVar) {
                return aVar;
            }
            if (o4.f4650b > 0) {
            }
            j5 = J.f4639i;
            this.f4645l = null;
            this.f4644k = 5;
            if (interfaceC0331g.d(j5, this) == aVar) {
            }
            return Unit.f7487a;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                interfaceC0331g = this.f4645l;
                AbstractC1343r.b(obj);
                if (o4.f4650b > 0) {
                    J j8 = J.f4638e;
                    this.f4645l = interfaceC0331g;
                    this.f4644k = 3;
                    if (interfaceC0331g.d(j8, this) == aVar) {
                        return aVar;
                    }
                    j4 = o4.f4650b;
                    this.f4645l = interfaceC0331g;
                    this.f4644k = 4;
                    if (W2.F.a(j4, this) == aVar) {
                    }
                }
                j5 = J.f4639i;
                this.f4645l = null;
                this.f4644k = 5;
                if (interfaceC0331g.d(j5, this) == aVar) {
                }
                return Unit.f7487a;
            }
            if (i2 == 3) {
                interfaceC0331g = this.f4645l;
                AbstractC1343r.b(obj);
                j4 = o4.f4650b;
                this.f4645l = interfaceC0331g;
                this.f4644k = 4;
                if (W2.F.a(j4, this) == aVar) {
                    return aVar;
                }
                j5 = J.f4639i;
                this.f4645l = null;
                this.f4644k = 5;
                if (interfaceC0331g.d(j5, this) == aVar) {
                }
                return Unit.f7487a;
            }
            if (i2 == 4) {
                interfaceC0331g = this.f4645l;
                AbstractC1343r.b(obj);
                j5 = J.f4639i;
                this.f4645l = null;
                this.f4644k = 5;
                if (interfaceC0331g.d(j5, this) == aVar) {
                    return aVar;
                }
                return Unit.f7487a;
            }
            if (i2 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
        AbstractC1343r.b(obj);
        return Unit.f7487a;
    }
}
