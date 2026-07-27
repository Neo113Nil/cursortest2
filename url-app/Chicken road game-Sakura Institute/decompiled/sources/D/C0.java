package D;

import G.C0216p;
import Z.C0323u;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import l.AbstractC0779e;

/* loaded from: classes.dex */
public final class C0 extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0181x0 f1207d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f1208e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f1209i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function2 f1210j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0(C0181x0 c0181x0, boolean z4, boolean z5, Function2 function2) {
        super(2);
        this.f1207d = c0181x0;
        this.f1208e = z4;
        this.f1209i = z5;
        this.f1210j = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        C0216p c0216p = (C0216p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0216p.z()) {
            c0216p.N();
        } else {
            A0.L a4 = U1.a(F.o.f2452g, c0216p);
            boolean z4 = this.f1209i;
            C0181x0 c0181x0 = this.f1207d;
            E.a.a(((C0323u) k.L.a(!z4 ? c0181x0.f2098g : this.f1208e ? c0181x0.f2093b : c0181x0.f2096e, AbstractC0779e.j(100, 0, null, 6), c0216p).getValue()).f4549a, a4, this.f1210j, c0216p, 0);
        }
        return Unit.f7487a;
    }
}
