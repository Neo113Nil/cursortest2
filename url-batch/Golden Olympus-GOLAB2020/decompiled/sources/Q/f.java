package Q;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o2.InterfaceC3316J;
import o2.K;
import o2.R0;
import o2.Z;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f9076a = new f();

    private f() {
    }

    public static /* synthetic */ e b(f fVar, j jVar, R.b bVar, List list, InterfaceC3316J interfaceC3316J, Function0 function0, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            bVar = null;
        }
        if ((i4 & 4) != 0) {
            list = CollectionsKt.emptyList();
        }
        if ((i4 & 8) != 0) {
            interfaceC3316J = K.a(Z.b().plus(R0.b(null, 1, null)));
        }
        return fVar.a(jVar, bVar, list, interfaceC3316J, function0);
    }

    public final e a(j serializer, R.b bVar, List migrations, InterfaceC3316J scope, Function0 produceFile) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        return new l(produceFile, serializer, CollectionsKt.listOf(d.f9059a.b(migrations)), new R.a(), scope);
    }
}
