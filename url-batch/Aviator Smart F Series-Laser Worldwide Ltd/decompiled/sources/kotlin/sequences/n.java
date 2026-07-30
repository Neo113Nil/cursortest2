package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;

/* loaded from: classes4.dex */
final class n extends o implements Iterator, kotlin.coroutines.c, g6.a {
    private Iterator<Object> nextIterator;
    private kotlin.coroutines.c nextStep;
    private Object nextValue;
    private int state;

    private final Throwable exceptionalState() {
        int i8 = this.state;
        if (i8 == 4) {
            return new NoSuchElementException();
        }
        if (i8 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.state);
    }

    private final Object nextNotReady() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    @Override // kotlin.coroutines.c
    public CoroutineContext getContext() {
        return EmptyCoroutineContext.INSTANCE;
    }

    public final kotlin.coroutines.c getNextStep() {
        return this.nextStep;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        while (true) {
            int i8 = this.state;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2 || i8 == 3) {
                        return true;
                    }
                    if (i8 == 4) {
                        return false;
                    }
                    throw exceptionalState();
                }
                Iterator<Object> it = this.nextIterator;
                kotlin.jvm.internal.s.checkNotNull(it);
                if (it.hasNext()) {
                    this.state = 2;
                    return true;
                }
                this.nextIterator = null;
            }
            this.state = 5;
            kotlin.coroutines.c cVar = this.nextStep;
            kotlin.jvm.internal.s.checkNotNull(cVar);
            this.nextStep = null;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m348constructorimpl(y5.w.INSTANCE));
        }
    }

    @Override // java.util.Iterator
    public Object next() {
        int i8 = this.state;
        if (i8 == 0 || i8 == 1) {
            return nextNotReady();
        }
        if (i8 == 2) {
            this.state = 1;
            Iterator<Object> it = this.nextIterator;
            kotlin.jvm.internal.s.checkNotNull(it);
            return it.next();
        }
        if (i8 != 3) {
            throw exceptionalState();
        }
        this.state = 0;
        Object obj = this.nextValue;
        this.nextValue = null;
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // kotlin.coroutines.c
    public void resumeWith(Object obj) {
        y5.g.throwOnFailure(obj);
        this.state = 4;
    }

    public final void setNextStep(kotlin.coroutines.c cVar) {
        this.nextStep = cVar;
    }

    @Override // kotlin.sequences.o
    public Object yield(Object obj, kotlin.coroutines.c cVar) {
        Object coroutine_suspended;
        Object coroutine_suspended2;
        Object coroutine_suspended3;
        this.nextValue = obj;
        this.state = 3;
        this.nextStep = cVar;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        coroutine_suspended2 = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        if (coroutine_suspended == coroutine_suspended2) {
            kotlin.coroutines.jvm.internal.f.probeCoroutineSuspended(cVar);
        }
        coroutine_suspended3 = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        return coroutine_suspended == coroutine_suspended3 ? coroutine_suspended : y5.w.INSTANCE;
    }

    @Override // kotlin.sequences.o
    public Object yieldAll(Iterator<Object> it, kotlin.coroutines.c cVar) {
        Object coroutine_suspended;
        Object coroutine_suspended2;
        Object coroutine_suspended3;
        if (!it.hasNext()) {
            return y5.w.INSTANCE;
        }
        this.nextIterator = it;
        this.state = 2;
        this.nextStep = cVar;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        coroutine_suspended2 = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        if (coroutine_suspended == coroutine_suspended2) {
            kotlin.coroutines.jvm.internal.f.probeCoroutineSuspended(cVar);
        }
        coroutine_suspended3 = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        return coroutine_suspended == coroutine_suspended3 ? coroutine_suspended : y5.w.INSTANCE;
    }
}
