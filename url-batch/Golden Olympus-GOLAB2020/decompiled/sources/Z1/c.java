package Z1;

import java.util.Comparator;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class c implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function1 f9745b;

    public c(Function1 function1) {
        this.f9745b = function1;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Function1 function1 = this.f9745b;
        return e.d((Comparable) function1.invoke(obj), (Comparable) function1.invoke(obj2));
    }
}
