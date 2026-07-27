package D;

import A.AbstractC0017m;
import G.C0192d;
import G.C0216p;
import G.InterfaceC0213n0;
import Z.C0323u;
import androidx.compose.ui.semantics.ClearAndSetSemanticsElement;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l.AbstractC0779e;
import p0.InterfaceC0945F;
import q.AbstractC1035n;
import r0.C1067h;
import r0.C1068i;
import r0.C1069j;
import r0.InterfaceC1070k;

/* loaded from: classes.dex */
public final class B0 extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0181x0 f1189d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f1190e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f1191i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function2 f1192j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f1193k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ O.a f1194l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B0(C0181x0 c0181x0, boolean z4, boolean z5, Function2 function2, boolean z6, O.a aVar) {
        super(2);
        this.f1189d = c0181x0;
        this.f1190e = z4;
        this.f1191i = z5;
        this.f1192j = function2;
        this.f1193k = z6;
        this.f1194l = aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        S.o oVar;
        C0216p c0216p = (C0216p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0216p.z()) {
            c0216p.N();
        } else {
            boolean z4 = this.f1191i;
            boolean z5 = this.f1190e;
            C0181x0 c0181x0 = this.f1189d;
            G.X0 a4 = k.L.a(!z4 ? c0181x0.f2097f : z5 ? c0181x0.f2092a : c0181x0.f2095d, AbstractC0779e.j(100, 0, null, 6), c0216p);
            if (this.f1192j == null || !(this.f1193k || z5)) {
                oVar = S.l.f3977a;
            } else {
                AtomicInteger atomicInteger = y0.k.f11579a;
                oVar = new ClearAndSetSemanticsElement();
            }
            InterfaceC0945F e4 = AbstractC1035n.e(S.b.f3952d, false);
            int i2 = c0216p.f2861P;
            InterfaceC0213n0 m4 = c0216p.m();
            S.o d4 = S.a.d(c0216p, oVar);
            InterfaceC1070k.f9822h.getClass();
            C1068i c1068i = C1069j.f9816b;
            c0216p.W();
            if (c0216p.f2860O) {
                c0216p.l(c1068i);
            } else {
                c0216p.f0();
            }
            C0192d.R(c0216p, e4, C1069j.f9820f);
            C0192d.R(c0216p, m4, C1069j.f9819e);
            C1067h c1067h = C1069j.f9821g;
            if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i2))) {
                AbstractC0017m.r(i2, c0216p, i2, c1067h);
            }
            C0192d.R(c0216p, d4, C1069j.f9818d);
            C0192d.a(S.f1616a.a(new C0323u(((C0323u) a4.getValue()).f4549a)), this.f1194l, c0216p, 8);
            c0216p.q(true);
        }
        return Unit.f7487a;
    }
}
