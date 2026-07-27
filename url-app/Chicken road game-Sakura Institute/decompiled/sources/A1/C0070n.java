package A1;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import z1.C1374S;
import z1.C1379e;
import z2.C1405I;

/* renamed from: A1.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0070n implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f632d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f633e;

    public /* synthetic */ C0070n(int i2, Object obj) {
        this.f632d = i2;
        this.f633e = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f632d) {
            case 0:
                C1379e it = (C1379e) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(Intrinsics.a(it.f11858a, ((C1379e) this.f633e).f11858a));
            case 1:
                r.g LazyColumn = (r.g) obj;
                Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                ArrayList arrayList = (ArrayList) this.f633e;
                LazyColumn.b(arrayList.size(), new A.S(3, arrayList), new O.a(-632812321, true, new A0(0, arrayList)));
                return Unit.f7487a;
            case 2:
                r.g LazyColumn2 = (r.g) obj;
                Intrinsics.checkNotNullParameter(LazyColumn2, "$this$LazyColumn");
                List list = (List) this.f633e;
                LazyColumn2.b(list.size(), new W(5, list), new O.a(-632812321, true, new C0067l0(2, list)));
                return Unit.f7487a;
            case 3:
                C1374S it2 = (C1374S) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return Boolean.valueOf(Intrinsics.a(it2.f11843a, ((C1374S) this.f633e).f11843a));
            case 4:
                int intValue = ((Integer) obj).intValue();
                StringBuilder sb = new StringBuilder();
                g3.f fVar = (g3.f) this.f633e;
                sb.append(fVar.f6798f[intValue]);
                sb.append(": ");
                sb.append(fVar.f6799g[intValue].d());
                return sb.toString();
            case 5:
                g3.a buildSerialDescriptor = (g3.a) obj;
                Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
                C1405I c1405i = ((i3.L) this.f633e).f7025b;
                buildSerialDescriptor.getClass();
                Intrinsics.checkNotNullParameter(c1405i, "<set-?>");
                buildSerialDescriptor.f6777b = c1405i;
                return Unit.f7487a;
            default:
                int intValue2 = ((Integer) obj).intValue();
                StringBuilder sb2 = new StringBuilder();
                i3.O o4 = (i3.O) this.f633e;
                sb2.append(o4.f7035e[intValue2]);
                sb2.append(": ");
                sb2.append(o4.h(intValue2).d());
                return sb2.toString();
        }
    }
}
