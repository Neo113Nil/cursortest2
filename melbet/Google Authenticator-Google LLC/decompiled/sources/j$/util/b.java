package j$.util;

import java.io.Serializable;
import java.util.Comparator;
import java.util.function.ToLongFunction;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Comparator, Serializable {
    public final /* synthetic */ ToLongFunction a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        ToLongFunction toLongFunction = this.a;
        return Long.compare(toLongFunction.applyAsLong(obj), toLongFunction.applyAsLong(obj2));
    }
}
