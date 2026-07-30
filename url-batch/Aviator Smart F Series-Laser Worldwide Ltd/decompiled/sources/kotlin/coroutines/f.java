package kotlin.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class f implements c, kotlin.coroutines.jvm.internal.c {
    private static final a Companion = new a(null);
    private static final AtomicReferenceFieldUpdater<f, Object> RESULT = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "result");
    private final c delegate;
    private volatile Object result;

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        private static /* synthetic */ void getRESULT$annotations() {
        }
    }

    public f(c delegate, Object obj) {
        s.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
        this.result = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.c
    public kotlin.coroutines.jvm.internal.c getCallerFrame() {
        c cVar = this.delegate;
        if (cVar instanceof kotlin.coroutines.jvm.internal.c) {
            return (kotlin.coroutines.jvm.internal.c) cVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.c
    public CoroutineContext getContext() {
        return this.delegate.getContext();
    }

    public final Object getOrThrow() {
        Object coroutine_suspended;
        Object coroutine_suspended2;
        Object coroutine_suspended3;
        Object obj = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.UNDECIDED;
        if (obj == coroutineSingletons) {
            AtomicReferenceFieldUpdater<f, Object> atomicReferenceFieldUpdater = RESULT;
            coroutine_suspended2 = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, coroutineSingletons, coroutine_suspended2)) {
                coroutine_suspended3 = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                return coroutine_suspended3;
            }
            obj = this.result;
        }
        if (obj == CoroutineSingletons.RESUMED) {
            coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            return coroutine_suspended;
        }
        if (obj instanceof Result.Failure) {
            throw ((Result.Failure) obj).exception;
        }
        return obj;
    }

    @Override // kotlin.coroutines.jvm.internal.c
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.c
    public void resumeWith(Object obj) {
        Object coroutine_suspended;
        Object coroutine_suspended2;
        while (true) {
            Object obj2 = this.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.UNDECIDED;
            if (obj2 != coroutineSingletons) {
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                if (obj2 != coroutine_suspended) {
                    throw new IllegalStateException("Already resumed");
                }
                AtomicReferenceFieldUpdater<f, Object> atomicReferenceFieldUpdater = RESULT;
                coroutine_suspended2 = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, coroutine_suspended2, CoroutineSingletons.RESUMED)) {
                    this.delegate.resumeWith(obj);
                    return;
                }
            } else if (androidx.concurrent.futures.a.a(RESULT, this, coroutineSingletons, obj)) {
                return;
            }
        }
    }

    public String toString() {
        return "SafeContinuation for " + this.delegate;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(c delegate) {
        this(delegate, CoroutineSingletons.UNDECIDED);
        s.checkNotNullParameter(delegate, "delegate");
    }
}
