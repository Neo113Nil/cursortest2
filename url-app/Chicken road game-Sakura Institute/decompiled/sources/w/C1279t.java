package w;

import G.C0205j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p0.InterfaceC0980p;
import s0.C1160o0;
import s0.V0;
import s0.W0;

/* renamed from: w.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1279t extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ P f11340d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f11341e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ V0 f11342i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ A.a0 f11343j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ G0.y f11344k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ G0.s f11345l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1279t(P p4, boolean z4, V0 v02, A.a0 a0Var, G0.y yVar, G0.s sVar) {
        super(1);
        this.f11340d = p4;
        this.f11341e = z4;
        this.f11342i = v02;
        this.f11343j = a0Var;
        this.f11344k = yVar;
        this.f11345l = sVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        G0.E e4;
        InterfaceC0980p interfaceC0980p;
        InterfaceC0980p interfaceC0980p2;
        InterfaceC0980p interfaceC0980p3 = (InterfaceC0980p) obj;
        P p4 = this.f11340d;
        p4.f11061h = interfaceC0980p3;
        o0 d4 = p4.d();
        if (d4 != null) {
            d4.f11291b = interfaceC0980p3;
        }
        if (this.f11341e) {
            EnumC1257F a4 = p4.a();
            EnumC1257F enumC1257F = EnumC1257F.f11024e;
            G0.y yVar = this.f11344k;
            A.a0 a0Var = this.f11343j;
            C0205j0 c0205j0 = p4.f11068o;
            if (a4 == enumC1257F) {
                if (((Boolean) p4.f11065l.getValue()).booleanValue() && ((W0) this.f11342i).a()) {
                    a0Var.o();
                } else {
                    a0Var.k();
                }
                p4.f11066m.setValue(Boolean.valueOf(j0.c.D(a0Var, true)));
                p4.f11067n.setValue(Boolean.valueOf(j0.c.D(a0Var, false)));
                c0205j0.setValue(Boolean.valueOf(A0.K.b(yVar.f3094b)));
            } else if (p4.a() == EnumC1257F.f11025i) {
                c0205j0.setValue(Boolean.valueOf(j0.c.D(a0Var, true)));
            }
            G0.s sVar = this.f11345l;
            M.q(p4, yVar, sVar);
            o0 d5 = p4.d();
            if (d5 != null && (e4 = p4.f11058e) != null && p4.b() && (interfaceC0980p = d5.f11291b) != null && interfaceC0980p.p() && (interfaceC0980p2 = d5.f11292c) != null) {
                C1160o0 c1160o0 = new C1160o0(8, interfaceC0980p);
                Y.d Y3 = M1.a.Y(interfaceC0980p);
                Y.d n2 = interfaceC0980p.n(interfaceC0980p2, false);
                if (Intrinsics.a((G0.E) e4.f3025a.f3097b.get(), e4)) {
                    e4.f3026b.f(yVar, sVar, d5.f11290a, c1160o0, Y3, n2);
                }
            }
        }
        return Unit.f7487a;
    }
}
