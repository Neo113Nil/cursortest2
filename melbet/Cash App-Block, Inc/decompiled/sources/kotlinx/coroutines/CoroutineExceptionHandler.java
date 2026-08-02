package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes3.dex */
public interface CoroutineExceptionHandler extends CoroutineContext.Element {

    public final class Key implements CoroutineContext.Key {
        public static final /* synthetic */ Key $$INSTANCE = new Key();
    }

    void handleException(CoroutineContext coroutineContext, Throwable th);
}
