package kotlinx.coroutines.android;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import coil3.network.NetworkFetcher$doFetch$2;
import com.google.android.gms.stats.zza;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* loaded from: classes3.dex */
public abstract class HandlerDispatcherKt {
    public static final /* synthetic */ int $r8$clinit = 0;
    private static volatile Choreographer choreographer;

    static {
        Object failure;
        try {
            Result.Companion companion = Result.Companion;
            failure = new HandlerContext(asHandler(Looper.getMainLooper()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
    }

    public static final void access$updateChoreographerAndPostFrameCallback(CancellableContinuationImpl cancellableContinuationImpl) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            choreographer2 = Choreographer.getInstance();
            choreographer2.getClass();
            choreographer = choreographer2;
        }
        choreographer2.postFrameCallback(new HandlerDispatcherKt$$ExternalSyntheticLambda0(cancellableContinuationImpl, 0));
    }

    public static final Handler asHandler(Looper looper) {
        Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        invoke.getClass();
        return (Handler) invoke;
    }

    public static final Object awaitFrame(NetworkFetcher$doFetch$2 networkFetcher$doFetch$2) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 != null) {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(networkFetcher$doFetch$2));
            cancellableContinuationImpl.initCancellability();
            choreographer2.postFrameCallback(new HandlerDispatcherKt$$ExternalSyntheticLambda0(cancellableContinuationImpl, 0));
            Object result = cancellableContinuationImpl.getResult();
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            return result;
        }
        CancellableContinuationImpl cancellableContinuationImpl2 = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(networkFetcher$doFetch$2));
        cancellableContinuationImpl2.initCancellability();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            access$updateChoreographerAndPostFrameCallback(cancellableContinuationImpl2);
        } else {
            DefaultScheduler defaultScheduler = Dispatchers.Default;
            MainDispatcherLoader.dispatcher.dispatch(cancellableContinuationImpl2.context, new zza(cancellableContinuationImpl2, 19));
        }
        Object result2 = cancellableContinuationImpl2.getResult();
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        return result2;
    }
}
