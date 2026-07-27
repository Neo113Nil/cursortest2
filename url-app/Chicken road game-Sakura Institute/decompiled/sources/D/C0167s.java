package D;

import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import l.C0778d;
import p.C0928d;
import p.C0931g;
import p.C0937m;
import p.InterfaceC0933i;
import y2.AbstractC1343r;

/* renamed from: D.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0167s extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f2003k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0778d f2004l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f2005m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f2006n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0170t f2007o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0933i f2008p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0167s(C0778d c0778d, float f4, boolean z4, C0170t c0170t, InterfaceC0933i interfaceC0933i, C2.a aVar) {
        super(2, aVar);
        this.f2004l = c0778d;
        this.f2005m = f4;
        this.f2006n = z4;
        this.f2007o = c0170t;
        this.f2008p = interfaceC0933i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C0167s) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new C0167s(this.f2004l, this.f2005m, this.f2006n, this.f2007o, this.f2008p, aVar);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f2003k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            C0778d c0778d = this.f2004l;
            float f4 = ((M0.e) c0778d.f7702e.getValue()).f3545d;
            float f5 = this.f2005m;
            if (!M0.e.a(f4, f5)) {
                if (this.f2006n) {
                    float f6 = ((M0.e) c0778d.f7702e.getValue()).f3545d;
                    C0170t c0170t = this.f2007o;
                    InterfaceC0933i c0937m = M0.e.a(f6, c0170t.f2021b) ? new C0937m(0L) : M0.e.a(f6, c0170t.f2023d) ? new C0931g() : M0.e.a(f6, c0170t.f2022c) ? new C0928d() : null;
                    this.f2003k = 2;
                    if (E.b.a(c0778d, f5, c0937m, this.f2008p, this) == aVar) {
                        return aVar;
                    }
                } else {
                    M0.e eVar = new M0.e(f5);
                    this.f2003k = 1;
                    if (c0778d.e(this, eVar) == aVar) {
                        return aVar;
                    }
                }
            }
        } else {
            if (i2 != 1 && i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1343r.b(obj);
        }
        return Unit.f7487a;
    }
}
