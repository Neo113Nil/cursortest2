package kotlinx.coroutines.android;

import android.os.Handler;
import android.os.Looper;
import f6.l;
import j6.v;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.n;
import kotlinx.coroutines.o1;
import kotlinx.coroutines.t0;
import kotlinx.coroutines.u0;
import kotlinx.coroutines.x1;
import y5.w;

/* loaded from: classes3.dex */
public final class HandlerContext extends d {
    private volatile HandlerContext _immediate;
    private final Handler handler;
    private final HandlerContext immediate;
    private final boolean invokeImmediately;
    private final String name;

    public static final class a implements Runnable {
        final /* synthetic */ n $continuation$inlined;
        final /* synthetic */ HandlerContext this$0;

        public a(n nVar, HandlerContext handlerContext) {
            this.$continuation$inlined = nVar;
            this.this$0 = handlerContext;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.$continuation$inlined.resumeUndispatched(this.this$0, w.INSTANCE);
        }
    }

    private HandlerContext(Handler handler, String str, boolean z7) {
        super(null);
        this.handler = handler;
        this.name = str;
        this.invokeImmediately = z7;
        this._immediate = z7 ? this : null;
        HandlerContext handlerContext = this._immediate;
        if (handlerContext == null) {
            handlerContext = new HandlerContext(handler, str, true);
            this._immediate = handlerContext;
        }
        this.immediate = handlerContext;
    }

    private final void cancelOnRejection(CoroutineContext coroutineContext, Runnable runnable) {
        o1.cancel(coroutineContext, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        t0.getIO().mo1293dispatch(coroutineContext, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeOnTimeout$lambda$3(HandlerContext handlerContext, Runnable runnable) {
        handlerContext.handler.removeCallbacks(runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: dispatch */
    public void mo1293dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        if (this.handler.post(runnable)) {
            return;
        }
        cancelOnRejection(coroutineContext, runnable);
    }

    public boolean equals(Object obj) {
        return (obj instanceof HandlerContext) && ((HandlerContext) obj).handler == this.handler;
    }

    @Override // kotlinx.coroutines.v1
    public HandlerContext getImmediate() {
        return this.immediate;
    }

    public int hashCode() {
        return System.identityHashCode(this.handler);
    }

    @Override // kotlinx.coroutines.android.d, kotlinx.coroutines.p0
    public u0 invokeOnTimeout(long j8, final Runnable runnable, CoroutineContext coroutineContext) {
        long coerceAtMost;
        Handler handler = this.handler;
        coerceAtMost = v.coerceAtMost(j8, k6.c.MAX_MILLIS);
        if (handler.postDelayed(runnable, coerceAtMost)) {
            return new u0() { // from class: kotlinx.coroutines.android.c
                @Override // kotlinx.coroutines.u0
                public final void dispose() {
                    HandlerContext.invokeOnTimeout$lambda$3(HandlerContext.this, runnable);
                }
            };
        }
        cancelOnRejection(coroutineContext, runnable);
        return x1.INSTANCE;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public boolean isDispatchNeeded(CoroutineContext coroutineContext) {
        return (this.invokeImmediately && s.areEqual(Looper.myLooper(), this.handler.getLooper())) ? false : true;
    }

    @Override // kotlinx.coroutines.android.d, kotlinx.coroutines.p0
    /* renamed from: scheduleResumeAfterDelay */
    public void mo1294scheduleResumeAfterDelay(long j8, n nVar) {
        long coerceAtMost;
        final a aVar = new a(nVar, this);
        Handler handler = this.handler;
        coerceAtMost = v.coerceAtMost(j8, k6.c.MAX_MILLIS);
        if (handler.postDelayed(aVar, coerceAtMost)) {
            nVar.invokeOnCancellation(new l() { // from class: kotlinx.coroutines.android.HandlerContext$scheduleResumeAfterDelay$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // f6.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return w.INSTANCE;
                }

                public final void invoke(Throwable th) {
                    Handler handler2;
                    handler2 = HandlerContext.this.handler;
                    handler2.removeCallbacks(aVar);
                }
            });
        } else {
            cancelOnRejection(nVar.getContext(), aVar);
        }
    }

    @Override // kotlinx.coroutines.v1, kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        String stringInternalImpl = toStringInternalImpl();
        if (stringInternalImpl != null) {
            return stringInternalImpl;
        }
        String str = this.name;
        if (str == null) {
            str = this.handler.toString();
        }
        if (!this.invokeImmediately) {
            return str;
        }
        return str + ".immediate";
    }

    public /* synthetic */ HandlerContext(Handler handler, String str, int i8, o oVar) {
        this(handler, (i8 & 2) != 0 ? null : str);
    }

    public HandlerContext(Handler handler, String str) {
        this(handler, str, false);
    }
}
