package kotlinx.coroutines.internal;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.ThreadContextElement;

/* loaded from: classes9.dex */
public final class ThreadState {
    public final CoroutineContext context;
    public final ThreadContextElement[] elements;
    public int i;
    public final Object[] values;

    public ThreadState(int i, CoroutineContext coroutineContext) {
        this.context = coroutineContext;
        this.values = new Object[i];
        this.elements = new ThreadContextElement[i];
    }

    public final void append(ThreadContextElement threadContextElement, Object obj) {
        int i = this.i;
        this.values[i] = obj;
        this.i = i + 1;
        threadContextElement.getClass();
        this.elements[i] = threadContextElement;
    }

    public final void restore(CoroutineContext coroutineContext) {
        ThreadContextElement[] threadContextElementArr = this.elements;
        int length = threadContextElementArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            ThreadContextElement threadContextElement = threadContextElementArr[length];
            threadContextElement.getClass();
            threadContextElement.restoreThreadContext(this.values[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }
}
