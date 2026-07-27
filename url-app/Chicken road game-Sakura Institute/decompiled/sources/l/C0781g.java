package l;

import G.InterfaceC0191c0;
import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* renamed from: l.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0781g extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public Y2.c f7755k;

    /* renamed from: l, reason: collision with root package name */
    public int f7756l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f7757m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y2.i f7758n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0778d f7759o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0191c0 f7760p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0191c0 f7761q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0781g(Y2.i iVar, C0778d c0778d, InterfaceC0191c0 interfaceC0191c0, InterfaceC0191c0 interfaceC0191c02, C2.a aVar) {
        super(2, aVar);
        this.f7758n = iVar;
        this.f7759o = c0778d;
        this.f7760p = interfaceC0191c0;
        this.f7761q = interfaceC0191c02;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C0781g) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        C0781g c0781g = new C0781g(this.f7758n, this.f7759o, this.f7760p, this.f7761q, aVar);
        c0781g.f7757m = obj;
        return c0781g;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0033 -> B:5:0x0036). Please report as a decompilation issue!!! */
    @Override // E2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(Object obj) {
        Y2.c it;
        InterfaceC0302y interfaceC0302y;
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f7756l;
        Y2.i iVar = this.f7758n;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            InterfaceC0302y interfaceC0302y2 = (InterfaceC0302y) this.f7757m;
            it = iVar.iterator();
            interfaceC0302y = interfaceC0302y2;
            this.f7757m = interfaceC0302y;
            this.f7755k = it;
            this.f7756l = 1;
            obj = it.b(this);
            if (obj == aVar) {
            }
            if (((Boolean) obj).booleanValue()) {
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f7755k;
            interfaceC0302y = (InterfaceC0302y) this.f7757m;
            AbstractC1343r.b(obj);
            if (((Boolean) obj).booleanValue()) {
                Object c4 = it.c();
                Object m4 = iVar.m();
                if (m4 instanceof Y2.k) {
                    m4 = null;
                }
                W2.B.m(interfaceC0302y, null, null, new C0780f(m4 == null ? c4 : m4, this.f7759o, this.f7760p, this.f7761q, null), 3);
                this.f7757m = interfaceC0302y;
                this.f7755k = it;
                this.f7756l = 1;
                obj = it.b(this);
                if (obj == aVar) {
                    return aVar;
                }
                if (((Boolean) obj).booleanValue()) {
                    return Unit.f7487a;
                }
            }
        }
    }
}
