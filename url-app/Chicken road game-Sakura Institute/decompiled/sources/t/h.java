package t;

import M2.p;
import W2.B;
import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import m.C0842o;
import r0.a0;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class h extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f10628k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f10629l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a0 f10630m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p f10631n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0842o f10632o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(i iVar, a0 a0Var, Function0 function0, C0842o c0842o, C2.a aVar) {
        super(2, aVar);
        this.f10629l = iVar;
        this.f10630m = a0Var;
        this.f10631n = (p) function0;
        this.f10632o = c0842o;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((h) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [M2.p, kotlin.jvm.functions.Function0] */
    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        ?? r32 = this.f10631n;
        C0842o c0842o = this.f10632o;
        h hVar = new h(this.f10629l, this.f10630m, r32, c0842o, aVar);
        hVar.f10628k = obj;
        return hVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [M2.p, kotlin.jvm.functions.Function0] */
    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        AbstractC1343r.b(obj);
        InterfaceC0302y interfaceC0302y = (InterfaceC0302y) this.f10628k;
        a0 a0Var = this.f10630m;
        ?? r2 = this.f10631n;
        i iVar = this.f10629l;
        B.m(interfaceC0302y, null, null, new C1202f(iVar, a0Var, r2, null), 3);
        return B.m(interfaceC0302y, null, null, new g(iVar, this.f10632o, null), 3);
    }
}
