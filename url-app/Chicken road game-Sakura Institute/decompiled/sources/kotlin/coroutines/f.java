package kotlin.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class f {
    public static CoroutineContext.Element a(CoroutineContext.Element element, g key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (Intrinsics.a(element.getKey(), key)) {
            return element;
        }
        return null;
    }

    public static CoroutineContext b(CoroutineContext.Element element, g key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return Intrinsics.a(element.getKey(), key) ? i.f7498d : element;
    }

    public static CoroutineContext c(CoroutineContext context, CoroutineContext.Element element) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        return context == i.f7498d ? element : (CoroutineContext) context.i(element, h.f7497d);
    }
}
