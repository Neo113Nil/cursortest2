package Z2;

import W2.InterfaceC0302y;
import a3.AbstractC0424b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class x extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f4738k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ O f4739l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0330f f4740m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AbstractC0424b f4741n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f4742o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x(O o4, InterfaceC0330f interfaceC0330f, y yVar, Object obj, C2.a aVar) {
        super(2, aVar);
        this.f4739l = o4;
        this.f4740m = interfaceC0330f;
        this.f4741n = (AbstractC0424b) yVar;
        this.f4742o = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((x) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [Z2.y, a3.b] */
    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new x(this.f4739l, this.f4740m, this.f4741n, this.f4742o, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005b A[RETURN] */
    /* JADX WARN: Type inference failed for: r5v0, types: [Z2.g, Z2.y, a3.b] */
    @Override // E2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f4738k;
        InterfaceC0330f interfaceC0330f = this.f4740m;
        ?? r5 = this.f4741n;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    AbstractC1343r.b(obj);
                    this.f4738k = 3;
                    if (interfaceC0330f.e(r5, this) == aVar) {
                        return aVar;
                    }
                    return Unit.f7487a;
                }
                if (i2 != 3 && i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            AbstractC1343r.b(obj);
            return Unit.f7487a;
        }
        AbstractC1343r.b(obj);
        L l4 = K.f4641a;
        O o4 = this.f4739l;
        if (o4 == l4) {
            this.f4738k = 1;
            if (interfaceC0330f.e(r5, this) == aVar) {
                return aVar;
            }
        } else if (o4 == K.f4642b) {
            a3.z j4 = r5.j();
            v vVar = new v(2, null);
            this.f4738k = 2;
            if (H.k(j4, vVar, this) == aVar) {
                return aVar;
            }
            this.f4738k = 3;
            if (interfaceC0330f.e(r5, this) == aVar) {
            }
        } else {
            a3.z j5 = r5.j();
            M m4 = new M(o4, null);
            int i4 = AbstractC0341q.f4715a;
            kotlin.coroutines.i iVar = kotlin.coroutines.i.f7498d;
            Y2.a aVar2 = Y2.a.f4398d;
            InterfaceC0330f h4 = H.h(H.h(new E.e(new a3.o(m4, j5, iVar, -2, aVar2), 2, new N(2, null))));
            w wVar = new w(interfaceC0330f, r5, this.f4742o, null);
            this.f4738k = 4;
            Object e4 = H.f(new a3.o(new C0340p(wVar, null), h4, iVar, -2, aVar2), 0).e(a3.s.f4985d, this);
            if (e4 != aVar) {
                e4 = Unit.f7487a;
            }
            if (e4 != aVar) {
                e4 = Unit.f7487a;
            }
            if (e4 == aVar) {
                return aVar;
            }
        }
        return Unit.f7487a;
    }
}
