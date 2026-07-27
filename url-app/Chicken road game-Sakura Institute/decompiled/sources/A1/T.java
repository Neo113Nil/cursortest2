package A1;

import G.InterfaceC0191c0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import z1.AbstractC1366J;
import z1.C1393s;
import z2.C1403G;

/* loaded from: classes.dex */
public final /* synthetic */ class T implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f540d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f541e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f542i;

    public /* synthetic */ T(Object obj, int i2, Object obj2) {
        this.f540d = i2;
        this.f541e = obj;
        this.f542i = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f540d) {
            case 0:
                r.g LazyColumn = (r.g) obj;
                Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                Q.v vVar = (Q.v) this.f541e;
                LazyColumn.b(vVar.size(), new W(0, vVar), new O.a(-632812321, true, new X(vVar, (C1393s) this.f542i, 0)));
                break;
            case 1:
                r.g LazyColumn2 = (r.g) obj;
                Intrinsics.checkNotNullParameter(LazyColumn2, "$this$LazyColumn");
                InterfaceC0191c0 interfaceC0191c0 = (InterfaceC0191c0) this.f542i;
                InterfaceC0191c0 interfaceC0191c02 = (InterfaceC0191c0) this.f541e;
                r.g.a(LazyColumn2, new O.a(1800646419, true, new C0065k0(interfaceC0191c02, 2, interfaceC0191c0)));
                List D3 = C1403G.D(AbstractC1366J.f11818d, new C0062j(7));
                LazyColumn2.b(D3.size(), new W(4, D3), new O.a(-632812321, true, new M(D3, interfaceC0191c02, interfaceC0191c0, 2)));
                break;
            case 2:
                ((X2.d) this.f541e).f4361i.removeCallbacks((G1.n) this.f542i);
                break;
            default:
                ((e3.c) this.f541e).e(((e3.b) this.f542i).f6257e);
                break;
        }
        return Unit.f7487a;
    }
}
