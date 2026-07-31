package Z1;

import java.util.Comparator;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class d implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function1 f9746b;

    public d(Function1 function1) {
        this.f9746b = function1;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Function1 function1 = this.f9746b;
        return e.d((Comparable) function1.invoke(obj2), (Comparable) function1.invoke(obj));
    }
}
