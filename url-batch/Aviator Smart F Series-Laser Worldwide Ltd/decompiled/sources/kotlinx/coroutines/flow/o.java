package kotlinx.coroutines.flow;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.internal.g0;

/* loaded from: classes5.dex */
public abstract class o {
    public static final g0 NO_VALUE = new g0("NO_VALUE");

    public static final <T> i MutableSharedFlow(int i8, int i9, BufferOverflow bufferOverflow) {
        if (i8 < 0) {
            throw new IllegalArgumentException(("replay cannot be negative, but was " + i8).toString());
        }
        if (i9 < 0) {
            throw new IllegalArgumentException(("extraBufferCapacity cannot be negative, but was " + i9).toString());
        }
        if (i8 > 0 || i9 > 0 || bufferOverflow == BufferOverflow.SUSPEND) {
            int i10 = i9 + i8;
            if (i10 < 0) {
                i10 = Integer.MAX_VALUE;
            }
            return new SharedFlowImpl(i8, i10, bufferOverflow);
        }
        throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + bufferOverflow).toString());
    }

    public static /* synthetic */ i MutableSharedFlow$default(int i8, int i9, BufferOverflow bufferOverflow, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = 0;
        }
        if ((i10 & 2) != 0) {
            i9 = 0;
        }
        if ((i10 & 4) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        return MutableSharedFlow(i8, i9, bufferOverflow);
    }

    public static final <T> e fuseSharedFlow(n nVar, CoroutineContext coroutineContext, int i8, BufferOverflow bufferOverflow) {
        return ((i8 == 0 || i8 == -3) && bufferOverflow == BufferOverflow.SUSPEND) ? nVar : new kotlinx.coroutines.flow.internal.e(nVar, coroutineContext, i8, bufferOverflow);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getBufferAt(Object[] objArr, long j8) {
        return objArr[(objArr.length - 1) & ((int) j8)];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setBufferAt(Object[] objArr, long j8, Object obj) {
        objArr[(objArr.length - 1) & ((int) j8)] = obj;
    }
}
