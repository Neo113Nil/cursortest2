package kotlin.coroutines;

import f6.p;
import java.io.Serializable;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class EmptyCoroutineContext implements CoroutineContext, Serializable {
    public static final EmptyCoroutineContext INSTANCE = new EmptyCoroutineContext();
    private static final long serialVersionUID = 0;

    private EmptyCoroutineContext() {
    }

    private final Object readResolve() {
        return INSTANCE;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R fold(R r8, p operation) {
        s.checkNotNullParameter(operation, "operation");
        return r8;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.a> E get(CoroutineContext.b key) {
        s.checkNotNullParameter(key, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.b key) {
        s.checkNotNullParameter(key, "key");
        return this;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext context) {
        s.checkNotNullParameter(context, "context");
        return context;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
