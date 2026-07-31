package kotlin.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class b implements CoroutineContext.b {

    /* renamed from: b, reason: collision with root package name */
    private final Function1 f41106b;

    /* renamed from: c, reason: collision with root package name */
    private final CoroutineContext.b f41107c;

    public b(CoroutineContext.b baseKey, Function1 safeCast) {
        Intrinsics.checkNotNullParameter(baseKey, "baseKey");
        Intrinsics.checkNotNullParameter(safeCast, "safeCast");
        this.f41106b = safeCast;
        this.f41107c = baseKey instanceof b ? ((b) baseKey).f41107c : baseKey;
    }

    public final boolean a(CoroutineContext.b key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return key == this || this.f41107c == key;
    }

    public final CoroutineContext.Element b(CoroutineContext.Element element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return (CoroutineContext.Element) this.f41106b.invoke(element);
    }
}
