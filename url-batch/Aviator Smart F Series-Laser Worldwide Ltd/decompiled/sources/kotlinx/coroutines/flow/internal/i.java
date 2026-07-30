package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;

/* loaded from: classes5.dex */
public interface i extends kotlinx.coroutines.flow.e {

    public static final class a {
        public static /* synthetic */ kotlinx.coroutines.flow.e fuse$default(i iVar, CoroutineContext coroutineContext, int i8, BufferOverflow bufferOverflow, int i9, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
            }
            if ((i9 & 1) != 0) {
                coroutineContext = EmptyCoroutineContext.INSTANCE;
            }
            if ((i9 & 2) != 0) {
                i8 = -3;
            }
            if ((i9 & 4) != 0) {
                bufferOverflow = BufferOverflow.SUSPEND;
            }
            return iVar.fuse(coroutineContext, i8, bufferOverflow);
        }
    }

    @Override // kotlinx.coroutines.flow.e, kotlinx.coroutines.flow.a
    /* synthetic */ Object collect(kotlinx.coroutines.flow.f fVar, kotlin.coroutines.c cVar);

    kotlinx.coroutines.flow.e fuse(CoroutineContext coroutineContext, int i8, BufferOverflow bufferOverflow);
}
