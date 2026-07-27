package f1;

import D.C0127e0;
import Z2.InterfaceC0331g;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* renamed from: f1.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0629x extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public C0610d f6630k;

    /* renamed from: l, reason: collision with root package name */
    public int f6631l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f6632m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ N f6633n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0629x(N n2, C2.a aVar) {
        super(2, aVar);
        this.f6633n = n2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C0629x) j((C2.a) obj2, (InterfaceC0331g) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        C0629x c0629x = new C0629x(this.f6633n, aVar);
        c0629x.f6632m = obj;
        return c0629x;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c5  */
    @Override // E2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(Object obj) {
        InterfaceC0331g interfaceC0331g;
        Y y4;
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f6631l;
        N n2 = this.f6633n;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            InterfaceC0331g interfaceC0331g2 = (InterfaceC0331g) this.f6632m;
            this.f6632m = interfaceC0331g2;
            this.f6631l = 1;
            Object q2 = W2.B.q(n2.f6521i.q(), new C0605F(n2, null), this);
            if (q2 == aVar) {
                return aVar;
            }
            interfaceC0331g = interfaceC0331g2;
            obj = q2;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1343r.b(obj);
                    return Unit.f7487a;
                }
                y4 = this.f6630k;
                interfaceC0331g = (InterfaceC0331g) this.f6632m;
                AbstractC1343r.b(obj);
                E.e eVar = new E.e((Z2.S) n2.f6525m.f6561e, 3, new C0626u(2, null));
                C0627v c0627v = new C0627v(y4, null);
                this.f6632m = null;
                this.f6630k = null;
                this.f6631l = 3;
                if (!(interfaceC0331g instanceof Z2.U)) {
                    throw ((Z2.U) interfaceC0331g).f4662d;
                }
                Object e4 = eVar.e(new C0127e0(new M2.A(), new Z2.r(2, interfaceC0331g), c0627v), this);
                if (e4 != aVar) {
                    e4 = Unit.f7487a;
                }
                if (e4 != aVar) {
                    e4 = Unit.f7487a;
                }
                if (e4 != aVar) {
                    e4 = Unit.f7487a;
                }
                if (e4 == aVar) {
                    return aVar;
                }
                return Unit.f7487a;
            }
            InterfaceC0331g interfaceC0331g3 = (InterfaceC0331g) this.f6632m;
            AbstractC1343r.b(obj);
            interfaceC0331g = interfaceC0331g3;
        }
        y4 = (Y) obj;
        if (y4 instanceof C0610d) {
            Object obj2 = ((C0610d) y4).f6566b;
            this.f6632m = interfaceC0331g;
            this.f6630k = (C0610d) y4;
            this.f6631l = 2;
            if (interfaceC0331g.d(obj2, this) == aVar) {
                return aVar;
            }
        } else {
            if (y4 instanceof a0) {
                throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
            }
            if (y4 instanceof Q) {
                throw ((Q) y4).f6535b;
            }
            if (y4 instanceof O) {
                return Unit.f7487a;
            }
        }
        E.e eVar2 = new E.e((Z2.S) n2.f6525m.f6561e, 3, new C0626u(2, null));
        C0627v c0627v2 = new C0627v(y4, null);
        this.f6632m = null;
        this.f6630k = null;
        this.f6631l = 3;
        if (!(interfaceC0331g instanceof Z2.U)) {
        }
    }
}
