package A1;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import y2.InterfaceC1332g;
import z1.C1391q;

/* loaded from: classes.dex */
public final /* synthetic */ class I implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f474d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ArrayList f475e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f476i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1332g f477j;

    public /* synthetic */ I(ArrayList arrayList, Object obj, InterfaceC1332g interfaceC1332g, int i2) {
        this.f474d = i2;
        this.f475e = arrayList;
        this.f476i = obj;
        this.f477j = interfaceC1332g;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        r.g LazyColumn = (r.g) obj;
        switch (this.f474d) {
            case 0:
                Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                ArrayList arrayList = this.f475e;
                LazyColumn.b(arrayList.size(), new A.S(2, arrayList), new O.a(-632812321, true, new M(arrayList, (Function1) this.f476i, (Function1) this.f477j, 1)));
                break;
            default:
                Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                ArrayList arrayList2 = this.f475e;
                LazyColumn.b(arrayList2.size(), new A.S(1, arrayList2), new O.a(-632812321, true, new M(arrayList2, (C1391q) this.f476i, (Function0) this.f477j, 0)));
                break;
        }
        return Unit.f7487a;
    }
}
