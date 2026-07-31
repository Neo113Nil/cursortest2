package F2;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import y2.InterfaceC3526a;
import y2.InterfaceC3527b;
import y2.InterfaceC3535j;

/* loaded from: classes3.dex */
public abstract class b {
    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ InterfaceC3527b c(b bVar, m2.c cVar, List list, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContextual");
        }
        if ((i4 & 2) != 0) {
            list = CollectionsKt.emptyList();
        }
        return bVar.b(cVar, list);
    }

    public abstract void a(d dVar);

    public abstract InterfaceC3527b b(m2.c cVar, List list);

    public abstract InterfaceC3526a d(m2.c cVar, String str);

    public abstract InterfaceC3535j e(m2.c cVar, Object obj);

    private b() {
    }
}
