package kotlin.coroutines;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
public final class i implements CoroutineContext, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final i f7498d = new i();

    public final int hashCode() {
        return 0;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object i(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return obj;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element k(g key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return null;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext s(CoroutineContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext w(g key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this;
    }
}
