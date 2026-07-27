package J2;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
final class p extends M2.p implements Function1<String, Unit> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f3417d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(ArrayList arrayList) {
        super(1);
        this.f3417d = arrayList;
    }

    public final void a(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.f3417d.add(it);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((String) obj);
        return Unit.f7487a;
    }
}
