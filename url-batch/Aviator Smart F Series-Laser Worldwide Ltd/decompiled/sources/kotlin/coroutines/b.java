package kotlin.coroutines;

import f6.l;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public abstract class b implements CoroutineContext.b {
    private final l safeCast;
    private final CoroutineContext.b topmostKey;

    public b(CoroutineContext.b baseKey, l safeCast) {
        s.checkNotNullParameter(baseKey, "baseKey");
        s.checkNotNullParameter(safeCast, "safeCast");
        this.safeCast = safeCast;
        this.topmostKey = baseKey instanceof b ? ((b) baseKey).topmostKey : baseKey;
    }

    public final boolean isSubKey$kotlin_stdlib(CoroutineContext.b key) {
        s.checkNotNullParameter(key, "key");
        return key == this || this.topmostKey == key;
    }

    public final Object tryCast$kotlin_stdlib(CoroutineContext.a element) {
        s.checkNotNullParameter(element, "element");
        return (CoroutineContext.a) this.safeCast.invoke(element);
    }
}
