package kotlin.sequences;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.markers.KMappedMarker;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class SequenceBuilderIterator extends SequenceScope implements Iterator, Continuation, KMappedMarker {
    public Iterator nextIterator;
    public Continuation nextStep;
    public Object nextValue;
    public int state;

    public final RuntimeException exceptionalState() {
        int i = this.state;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.state);
    }

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return EmptyCoroutineContext.INSTANCE;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.state;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw exceptionalState();
                }
                Iterator it = this.nextIterator;
                it.getClass();
                if (it.hasNext()) {
                    this.state = 2;
                    return true;
                }
                this.nextIterator = null;
            }
            this.state = 5;
            Continuation continuation = this.nextStep;
            continuation.getClass();
            this.nextStep = null;
            Unit unit = Unit.INSTANCE;
            Result.Companion companion = Result.Companion;
            continuation.resumeWith(unit);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.state;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            a$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        if (i == 2) {
            this.state = 1;
            Iterator it = this.nextIterator;
            it.getClass();
            return it.next();
        }
        if (i != 3) {
            throw exceptionalState();
        }
        this.state = 0;
        Object obj = this.nextValue;
        this.nextValue = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        SafeTrace.throwOnFailure(obj);
        this.state = 4;
    }

    @Override // kotlin.sequences.SequenceScope
    public final void yield(Object obj, Continuation continuation) {
        this.nextValue = obj;
        this.state = 3;
        this.nextStep = continuation;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        continuation.getClass();
    }

    @Override // kotlin.sequences.SequenceScope
    public final Object yieldAll(Iterator it, RestrictedSuspendLambda restrictedSuspendLambda) {
        if (!it.hasNext()) {
            return Unit.INSTANCE;
        }
        this.nextIterator = it;
        this.state = 2;
        this.nextStep = restrictedSuspendLambda;
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }
}
