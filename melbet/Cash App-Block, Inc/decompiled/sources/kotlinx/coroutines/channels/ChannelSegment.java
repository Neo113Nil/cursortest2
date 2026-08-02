package kotlinx.coroutines.channels;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.Segment;

/* loaded from: classes3.dex */
public final class ChannelSegment extends Segment {
    public final BufferedChannel _channel;
    public final /* synthetic */ AtomicReferenceArray data;

    public ChannelSegment(long j, ChannelSegment channelSegment, BufferedChannel bufferedChannel, int i) {
        super(j, channelSegment, i);
        this._channel = bufferedChannel;
        this.data = new AtomicReferenceArray(BufferedChannelKt.SEGMENT_SIZE * 2);
    }

    public final boolean casState$kotlinx_coroutines_core(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.data;
            if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj);
        return false;
    }

    @Override // kotlinx.coroutines.internal.Segment
    public final int getNumberOfSlots() {
        return BufferedChannelKt.SEGMENT_SIZE;
    }

    public final Object getState$kotlinx_coroutines_core(int i) {
        return this.data.get((i * 2) + 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x004d, code lost:
    
        setElementLazy(r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0050, code lost:
    
        if (r1 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0052, code lost:
    
        r4.getClass();
        r6 = r4.onUndeliveredElement;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0057, code lost:
    
        if (r6 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0059, code lost:
    
        kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElement(r6, r0, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x005c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:?, code lost:
    
        return;
     */
    @Override // kotlinx.coroutines.internal.Segment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCancellation(int i, CoroutineContext coroutineContext) {
        String obj;
        int i2 = BufferedChannelKt.SEGMENT_SIZE;
        boolean z = i >= i2;
        if (z) {
            i -= i2;
        }
        Object obj2 = this.data.get(i * 2);
        while (true) {
            Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core(i);
            boolean z2 = state$kotlinx_coroutines_core instanceof Waiter;
            BufferedChannel bufferedChannel = this._channel;
            if (z2 || (state$kotlinx_coroutines_core instanceof WaiterEB)) {
                if (casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, z ? BufferedChannelKt.INTERRUPTED_SEND : BufferedChannelKt.INTERRUPTED_RCV)) {
                    setElementLazy(i, null);
                    onCancelledRequest(i, !z);
                    if (z) {
                        bufferedChannel.getClass();
                        Function1 function1 = bufferedChannel.onUndeliveredElement;
                        if (function1 != null) {
                            OnUndeliveredElementKt.callUndeliveredElement(function1, obj2, coroutineContext);
                            return;
                        }
                        return;
                    }
                    return;
                }
            } else {
                if (state$kotlinx_coroutines_core == BufferedChannelKt.INTERRUPTED_SEND || state$kotlinx_coroutines_core == BufferedChannelKt.INTERRUPTED_RCV) {
                    break;
                }
                if (state$kotlinx_coroutines_core != BufferedChannelKt.RESUMING_BY_EB && state$kotlinx_coroutines_core != BufferedChannelKt.RESUMING_BY_RCV) {
                    if (state$kotlinx_coroutines_core == BufferedChannelKt.DONE_RCV || state$kotlinx_coroutines_core == BufferedChannelKt.BUFFERED || state$kotlinx_coroutines_core == BufferedChannelKt.CHANNEL_CLOSED) {
                        return;
                    }
                    obj = ("unexpected state: " + state$kotlinx_coroutines_core).toString();
                    a$$ExternalSyntheticBUOutline0.m$1(obj);
                    return;
                }
            }
        }
    }

    public final void onCancelledRequest(int i, boolean z) {
        if (z) {
            BufferedChannel bufferedChannel = this._channel;
            bufferedChannel.getClass();
            bufferedChannel.waitExpandBufferCompletion$kotlinx_coroutines_core((this.id * BufferedChannelKt.SEGMENT_SIZE) + i);
        }
        onSlotCleaned();
    }

    public final void setElementLazy(int i, Object obj) {
        this.data.set(i * 2, obj);
    }

    public final void setState$kotlinx_coroutines_core(int i, Object obj) {
        this.data.set((i * 2) + 1, obj);
    }
}
