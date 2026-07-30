package kotlinx.coroutines.android;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.annotation.VisibleForTesting;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.n;
import kotlinx.coroutines.o;
import kotlinx.coroutines.t0;
import y5.g;

/* loaded from: classes3.dex */
public abstract class f {
    private static final long MAX_DELAY = 4611686018427387903L;
    public static final d Main;
    private static volatile Choreographer choreographer;

    public static final class a implements Runnable {
        final /* synthetic */ n $cont$inlined;

        public a(n nVar) {
            this.$cont$inlined = nVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            f.updateChoreographerAndPostFrameCallback(this.$cont$inlined);
        }
    }

    static {
        Object m348constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            m348constructorimpl = Result.m348constructorimpl(new HandlerContext(asHandler(Looper.getMainLooper(), true), null, 2, null));
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            m348constructorimpl = Result.m348constructorimpl(g.createFailure(th));
        }
        Main = (d) (Result.m354isFailureimpl(m348constructorimpl) ? null : m348constructorimpl);
    }

    @VisibleForTesting
    public static final Handler asHandler(Looper looper, boolean z7) {
        if (!z7) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT < 28) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        s.checkNotNull(invoke, "null cannot be cast to non-null type android.os.Handler");
        return (Handler) invoke;
    }

    public static final Object awaitFrame(kotlin.coroutines.c cVar) {
        kotlin.coroutines.c intercepted;
        Object coroutine_suspended;
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            return awaitFrameSlowPath(cVar);
        }
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(cVar);
        o oVar = new o(intercepted, 1);
        oVar.initCancellability();
        postFrameCallback(choreographer2, oVar);
        Object result = oVar.getResult();
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        if (result == coroutine_suspended) {
            kotlin.coroutines.jvm.internal.f.probeCoroutineSuspended(cVar);
        }
        return result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object awaitFrameSlowPath(kotlin.coroutines.c cVar) {
        kotlin.coroutines.c intercepted;
        Object coroutine_suspended;
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(cVar);
        o oVar = new o(intercepted, 1);
        oVar.initCancellability();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            updateChoreographerAndPostFrameCallback(oVar);
        } else {
            t0.getMain().mo1293dispatch(oVar.getContext(), new a(oVar));
        }
        Object result = oVar.getResult();
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        if (result == coroutine_suspended) {
            kotlin.coroutines.jvm.internal.f.probeCoroutineSuspended(cVar);
        }
        return result;
    }

    public static final d from(Handler handler) {
        return from$default(handler, null, 1, null);
    }

    public static /* synthetic */ d from$default(Handler handler, String str, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = null;
        }
        return from(handler, str);
    }

    public static /* synthetic */ void getMain$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postFrameCallback(Choreographer choreographer2, final n nVar) {
        choreographer2.postFrameCallback(new Choreographer.FrameCallback() { // from class: kotlinx.coroutines.android.e
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j8) {
                f.postFrameCallback$lambda$6(n.this, j8);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postFrameCallback$lambda$6(n nVar, long j8) {
        nVar.resumeUndispatched(t0.getMain(), Long.valueOf(j8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateChoreographerAndPostFrameCallback(n nVar) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            choreographer2 = Choreographer.getInstance();
            s.checkNotNull(choreographer2);
            choreographer = choreographer2;
        }
        postFrameCallback(choreographer2, nVar);
    }

    public static final d from(Handler handler, String str) {
        return new HandlerContext(handler, str);
    }
}
