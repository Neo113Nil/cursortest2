package j$.util;

import java.io.Serializable;
import java.util.Comparator;
import java.util.function.Function;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Comparator, Serializable {
    public final /* synthetic */ Comparator a;
    public final /* synthetic */ Function b;

    public /* synthetic */ c(Function function, Comparator comparator) {
        this.a = comparator;
        this.b = function;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Function function = this.b;
        return this.a.compare(function.apply(obj), function.apply(obj2));
    }
}
