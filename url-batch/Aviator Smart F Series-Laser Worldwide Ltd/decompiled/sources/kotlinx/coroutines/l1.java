package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes3.dex */
public interface l1 extends CoroutineContext.a {
    public static final b Key = b.$$INSTANCE;

    public static final class a {
        public static /* synthetic */ void cancel$default(l1 l1Var, CancellationException cancellationException, int i8, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i8 & 1) != 0) {
                cancellationException = null;
            }
            l1Var.cancel(cancellationException);
        }

        public static <R> R fold(l1 l1Var, R r8, f6.p pVar) {
            return (R) CoroutineContext.a.C0363a.fold(l1Var, r8, pVar);
        }

        public static <E extends CoroutineContext.a> E get(l1 l1Var, CoroutineContext.b bVar) {
            return (E) CoroutineContext.a.C0363a.get(l1Var, bVar);
        }

        public static /* synthetic */ void getParent$annotations() {
        }

        public static /* synthetic */ u0 invokeOnCompletion$default(l1 l1Var, boolean z7, boolean z8, f6.l lVar, int i8, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
            }
            if ((i8 & 1) != 0) {
                z7 = false;
            }
            if ((i8 & 2) != 0) {
                z8 = true;
            }
            return l1Var.invokeOnCompletion(z7, z8, lVar);
        }

        public static CoroutineContext minusKey(l1 l1Var, CoroutineContext.b bVar) {
            return CoroutineContext.a.C0363a.minusKey(l1Var, bVar);
        }

        public static l1 plus(l1 l1Var, l1 l1Var2) {
            return l1Var2;
        }

        public static /* synthetic */ boolean cancel$default(l1 l1Var, Throwable th, int i8, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i8 & 1) != 0) {
                th = null;
            }
            return l1Var.cancel(th);
        }

        public static CoroutineContext plus(l1 l1Var, CoroutineContext coroutineContext) {
            return CoroutineContext.a.C0363a.plus(l1Var, coroutineContext);
        }
    }

    public static final class b implements CoroutineContext.b {
        static final /* synthetic */ b $$INSTANCE = new b();

        private b() {
        }
    }

    t attachChild(v vVar);

    /* synthetic */ void cancel();

    void cancel(CancellationException cancellationException);

    /* synthetic */ boolean cancel(Throwable th);

    @Override // kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    /* synthetic */ Object fold(Object obj, f6.p pVar);

    @Override // kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    /* synthetic */ CoroutineContext.a get(CoroutineContext.b bVar);

    CancellationException getCancellationException();

    kotlin.sequences.m getChildren();

    @Override // kotlin.coroutines.CoroutineContext.a
    /* synthetic */ CoroutineContext.b getKey();

    kotlinx.coroutines.selects.c getOnJoin();

    l1 getParent();

    u0 invokeOnCompletion(f6.l lVar);

    u0 invokeOnCompletion(boolean z7, boolean z8, f6.l lVar);

    boolean isActive();

    boolean isCancelled();

    boolean isCompleted();

    Object join(kotlin.coroutines.c cVar);

    @Override // kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    /* synthetic */ CoroutineContext minusKey(CoroutineContext.b bVar);

    @Override // kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    /* synthetic */ CoroutineContext plus(CoroutineContext coroutineContext);

    l1 plus(l1 l1Var);

    boolean start();
}
