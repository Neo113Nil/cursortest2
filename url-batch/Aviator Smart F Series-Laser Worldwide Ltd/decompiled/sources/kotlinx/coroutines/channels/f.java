package kotlinx.coroutines.channels;

import com.google.common.util.concurrent.s;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.d0;
import kotlinx.coroutines.internal.g0;
import kotlinx.coroutines.l2;

/* loaded from: classes5.dex */
public final class f extends d0 {
    private final BufferedChannel _channel;
    private final AtomicReferenceArray data;

    public f(long j8, f fVar, BufferedChannel bufferedChannel, int i8) {
        super(j8, fVar, i8);
        this._channel = bufferedChannel;
        this.data = new AtomicReferenceArray(BufferedChannelKt.SEGMENT_SIZE * 2);
    }

    private final void setElementLazy(int i8, Object obj) {
        this.data.lazySet(i8 * 2, obj);
    }

    public final boolean casState$kotlinx_coroutines_core(int i8, Object obj, Object obj2) {
        return s.a(this.data, (i8 * 2) + 1, obj, obj2);
    }

    public final void cleanElement$kotlinx_coroutines_core(int i8) {
        setElementLazy(i8, null);
    }

    public final Object getAndSetState$kotlinx_coroutines_core(int i8, Object obj) {
        return this.data.getAndSet((i8 * 2) + 1, obj);
    }

    public final BufferedChannel getChannel() {
        BufferedChannel bufferedChannel = this._channel;
        kotlin.jvm.internal.s.checkNotNull(bufferedChannel);
        return bufferedChannel;
    }

    public final Object getElement$kotlinx_coroutines_core(int i8) {
        return this.data.get(i8 * 2);
    }

    @Override // kotlinx.coroutines.internal.d0
    public int getNumberOfSlots() {
        return BufferedChannelKt.SEGMENT_SIZE;
    }

    public final Object getState$kotlinx_coroutines_core(int i8) {
        return this.data.get((i8 * 2) + 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0063, code lost:
    
        cleanElement$kotlinx_coroutines_core(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0066, code lost:
    
        if (r0 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0068, code lost:
    
        r4 = getChannel().onUndeliveredElement;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x006e, code lost:
    
        if (r4 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0070, code lost:
    
        kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElement(r4, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0073, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:?, code lost:
    
        return;
     */
    @Override // kotlinx.coroutines.internal.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCancellation(int i8, Throwable th, CoroutineContext coroutineContext) {
        f6.l lVar;
        g0 g0Var;
        g0 g0Var2;
        g0 g0Var3;
        g0 g0Var4;
        g0 g0Var5;
        int i9 = BufferedChannelKt.SEGMENT_SIZE;
        boolean z7 = i8 >= i9;
        if (z7) {
            i8 -= i9;
        }
        Object element$kotlinx_coroutines_core = getElement$kotlinx_coroutines_core(i8);
        while (true) {
            Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core(i8);
            if (!(state$kotlinx_coroutines_core instanceof l2) && !(state$kotlinx_coroutines_core instanceof m)) {
                g0Var = BufferedChannelKt.INTERRUPTED_SEND;
                if (state$kotlinx_coroutines_core == g0Var) {
                    break;
                }
                g0Var2 = BufferedChannelKt.INTERRUPTED_RCV;
                if (state$kotlinx_coroutines_core == g0Var2) {
                    break;
                }
                g0Var3 = BufferedChannelKt.RESUMING_BY_EB;
                if (state$kotlinx_coroutines_core != g0Var3) {
                    g0Var4 = BufferedChannelKt.RESUMING_BY_RCV;
                    if (state$kotlinx_coroutines_core != g0Var4) {
                        g0Var5 = BufferedChannelKt.DONE_RCV;
                        if (state$kotlinx_coroutines_core == g0Var5 || state$kotlinx_coroutines_core == BufferedChannelKt.BUFFERED || state$kotlinx_coroutines_core == BufferedChannelKt.getCHANNEL_CLOSED()) {
                            return;
                        }
                        throw new IllegalStateException(("unexpected state: " + state$kotlinx_coroutines_core).toString());
                    }
                } else {
                    continue;
                }
            } else {
                if (casState$kotlinx_coroutines_core(i8, state$kotlinx_coroutines_core, z7 ? BufferedChannelKt.INTERRUPTED_SEND : BufferedChannelKt.INTERRUPTED_RCV)) {
                    cleanElement$kotlinx_coroutines_core(i8);
                    onCancelledRequest(i8, !z7);
                    if (!z7 || (lVar = getChannel().onUndeliveredElement) == null) {
                        return;
                    }
                    OnUndeliveredElementKt.callUndeliveredElement(lVar, element$kotlinx_coroutines_core, coroutineContext);
                    return;
                }
            }
        }
    }

    public final void onCancelledRequest(int i8, boolean z7) {
        if (z7) {
            getChannel().waitExpandBufferCompletion$kotlinx_coroutines_core((this.id * BufferedChannelKt.SEGMENT_SIZE) + i8);
        }
        onSlotCleaned();
    }

    public final Object retrieveElement$kotlinx_coroutines_core(int i8) {
        Object element$kotlinx_coroutines_core = getElement$kotlinx_coroutines_core(i8);
        cleanElement$kotlinx_coroutines_core(i8);
        return element$kotlinx_coroutines_core;
    }

    public final void setState$kotlinx_coroutines_core(int i8, Object obj) {
        this.data.set((i8 * 2) + 1, obj);
    }

    public final void storeElement$kotlinx_coroutines_core(int i8, Object obj) {
        setElementLazy(i8, obj);
    }
}
