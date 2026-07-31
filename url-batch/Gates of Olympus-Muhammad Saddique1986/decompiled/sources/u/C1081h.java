package u;

import R1.y;
import e2.InterfaceC0422a;
import e2.InterfaceC0426e;
import f2.k;
import q2.AbstractC0837y;
import q2.InterfaceC0835w;
import t0.b0;

/* renamed from: u.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1081h extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f9106h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1082i f9107i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b0 f9108j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ k f9109k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ K2.i f9110l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1081h(C1082i c1082i, b0 b0Var, InterfaceC0422a interfaceC0422a, K2.i iVar, V1.d dVar) {
        super(2, dVar);
        this.f9107i = c1082i;
        this.f9108j = b0Var;
        this.f9109k = (k) interfaceC0422a;
        this.f9110l = iVar;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C1081h) o((V1.d) obj2, (InterfaceC0835w) obj)).q(y.f4171a);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [e2.a, f2.k] */
    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        ?? r3 = this.f9109k;
        K2.i iVar = this.f9110l;
        C1081h c1081h = new C1081h(this.f9107i, this.f9108j, r3, iVar, dVar);
        c1081h.f9106h = obj;
        return c1081h;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [e2.a, f2.k] */
    @Override // X1.a
    public final Object q(Object obj) {
        R1.a.e(obj);
        InterfaceC0835w interfaceC0835w = (InterfaceC0835w) this.f9106h;
        b0 b0Var = this.f9108j;
        ?? r22 = this.f9109k;
        C1082i c1082i = this.f9107i;
        AbstractC0837y.r(interfaceC0835w, null, null, new C1079f(c1082i, b0Var, r22, null), 3);
        return AbstractC0837y.r(interfaceC0835w, null, null, new C1080g(c1082i, this.f9110l, null), 3);
    }
}
