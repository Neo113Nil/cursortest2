package A1;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import z1.AbstractC1366J;
import z2.C1403G;

/* loaded from: classes.dex */
public final /* synthetic */ class E implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f448d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function1 f449e;

    public /* synthetic */ E(int i2, Function1 function1) {
        this.f448d = i2;
        this.f449e = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        r.g LazyColumn = (r.g) obj;
        switch (this.f448d) {
            case 0:
                Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                Q.v vVar = AbstractC1366J.f11816b;
                LazyColumn.b(vVar.size(), new C0055f0(vVar, 0), new O.a(-632812321, true, new C0057g0(vVar, this.f449e, 0)));
                break;
            case 1:
                Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                Q.v vVar2 = AbstractC1366J.f11816b;
                LazyColumn.b(vVar2.size(), new C0055f0(vVar2, 2), new O.a(-632812321, true, new C0057g0(vVar2, this.f449e, 1)));
                break;
            default:
                Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                List D3 = C1403G.D(AbstractC1366J.f11818d, new C0062j(6));
                LazyColumn.b(D3.size(), new W(2, D3), new O.a(-632812321, true, new X(D3, this.f449e, 1)));
                break;
        }
        return Unit.f7487a;
    }
}
