package Z2;

import a3.AbstractC0424b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;
import y2.C1338m;

/* loaded from: classes.dex */
public final class w extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f4733k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f4734l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0330f f4735m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AbstractC0424b f4736n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f4737o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public w(InterfaceC0330f interfaceC0330f, y yVar, Object obj, C2.a aVar) {
        super(2, aVar);
        this.f4735m = interfaceC0330f;
        this.f4736n = (AbstractC0424b) yVar;
        this.f4737o = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((w) j((C2.a) obj2, (J) obj)).l(Unit.f7487a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Z2.y, a3.b] */
    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        w wVar = new w(this.f4735m, this.f4736n, this.f4737o, aVar);
        wVar.f4734l = obj;
        return wVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [Z2.g, Z2.y, a3.b] */
    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f4733k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            int ordinal = ((J) this.f4734l).ordinal();
            ?? r12 = this.f4736n;
            if (ordinal == 0) {
                this.f4733k = 1;
                if (this.f4735m.e(r12, this) == aVar) {
                    return aVar;
                }
            } else if (ordinal != 1) {
                if (ordinal != 2) {
                    throw new C1338m();
                }
                b3.t tVar = H.f4632a;
                Object obj2 = this.f4737o;
                if (obj2 == tVar) {
                    r12.a();
                } else {
                    r12.b(obj2);
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1343r.b(obj);
        }
        return Unit.f7487a;
    }
}
