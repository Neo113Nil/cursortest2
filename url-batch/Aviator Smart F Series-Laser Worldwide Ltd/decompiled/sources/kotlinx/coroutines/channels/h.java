package kotlinx.coroutines.channels;

import kotlin.jvm.internal.o;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.channels.e;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.l2;
import y5.w;

/* loaded from: classes5.dex */
public class h extends BufferedChannel {
    private final int capacity;
    private final BufferOverflow onBufferOverflow;

    public /* synthetic */ h(int i8, BufferOverflow bufferOverflow, f6.l lVar, int i9, o oVar) {
        this(i8, bufferOverflow, (i9 & 4) != 0 ? null : lVar);
    }

    static /* synthetic */ <E> Object send$suspendImpl(h hVar, E e8, kotlin.coroutines.c cVar) {
        UndeliveredElementException callUndeliveredElementCatchingException$default;
        Object m1258trySendImplMj0NB7M = hVar.m1258trySendImplMj0NB7M(e8, true);
        if (!(m1258trySendImplMj0NB7M instanceof e.a)) {
            return w.INSTANCE;
        }
        e.m1244exceptionOrNullimpl(m1258trySendImplMj0NB7M);
        f6.l lVar = hVar.onUndeliveredElement;
        if (lVar == null || (callUndeliveredElementCatchingException$default = OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(lVar, e8, null, 2, null)) == null) {
            throw hVar.getSendException();
        }
        y5.b.addSuppressed(callUndeliveredElementCatchingException$default, hVar.getSendException());
        throw callUndeliveredElementCatchingException$default;
    }

    static /* synthetic */ <E> Object sendBroadcast$suspendImpl(h hVar, E e8, kotlin.coroutines.c cVar) {
        Object m1258trySendImplMj0NB7M = hVar.m1258trySendImplMj0NB7M(e8, true);
        if (m1258trySendImplMj0NB7M instanceof e.c) {
            return kotlin.coroutines.jvm.internal.a.boxBoolean(false);
        }
        return kotlin.coroutines.jvm.internal.a.boxBoolean(true);
    }

    /* renamed from: trySendDropLatest-Mj0NB7M, reason: not valid java name */
    private final Object m1256trySendDropLatestMj0NB7M(Object obj, boolean z7) {
        f6.l lVar;
        UndeliveredElementException callUndeliveredElementCatchingException$default;
        Object mo1234trySendJP2dKIU = super.mo1234trySendJP2dKIU(obj);
        if (e.m1250isSuccessimpl(mo1234trySendJP2dKIU) || e.m1248isClosedimpl(mo1234trySendJP2dKIU)) {
            return mo1234trySendJP2dKIU;
        }
        if (!z7 || (lVar = this.onUndeliveredElement) == null || (callUndeliveredElementCatchingException$default = OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(lVar, obj, null, 2, null)) == null) {
            return e.Companion.m1255successJP2dKIU(w.INSTANCE);
        }
        throw callUndeliveredElementCatchingException$default;
    }

    /* renamed from: trySendDropOldest-JP2dKIU, reason: not valid java name */
    private final Object m1257trySendDropOldestJP2dKIU(Object obj) {
        f fVar;
        Object obj2 = BufferedChannelKt.BUFFERED;
        f fVar2 = (f) BufferedChannel.sendSegment$FU.get(this);
        while (true) {
            long andIncrement = BufferedChannel.sendersAndCloseStatus$FU.getAndIncrement(this);
            long j8 = andIncrement & 1152921504606846975L;
            boolean isClosedForSend0 = isClosedForSend0(andIncrement);
            int i8 = BufferedChannelKt.SEGMENT_SIZE;
            long j9 = j8 / i8;
            int i9 = (int) (j8 % i8);
            if (fVar2.id != j9) {
                f findSegmentSend = findSegmentSend(j9, fVar2);
                if (findSegmentSend != null) {
                    fVar = findSegmentSend;
                } else if (isClosedForSend0) {
                    return e.Companion.m1253closedJP2dKIU(getSendException());
                }
            } else {
                fVar = fVar2;
            }
            int updateCellSend = updateCellSend(fVar, i9, obj, j8, obj2, isClosedForSend0);
            if (updateCellSend == 0) {
                fVar.cleanPrev();
                return e.Companion.m1255successJP2dKIU(w.INSTANCE);
            }
            if (updateCellSend == 1) {
                return e.Companion.m1255successJP2dKIU(w.INSTANCE);
            }
            if (updateCellSend == 2) {
                if (isClosedForSend0) {
                    fVar.onSlotCleaned();
                    return e.Companion.m1253closedJP2dKIU(getSendException());
                }
                l2 l2Var = obj2 instanceof l2 ? (l2) obj2 : null;
                if (l2Var != null) {
                    prepareSenderForSuspension(l2Var, fVar, i9);
                }
                dropFirstElementUntilTheSpecifiedCellIsInTheBuffer((fVar.id * i8) + i9);
                return e.Companion.m1255successJP2dKIU(w.INSTANCE);
            }
            if (updateCellSend == 3) {
                throw new IllegalStateException("unexpected".toString());
            }
            if (updateCellSend == 4) {
                if (j8 < getReceiversCounter$kotlinx_coroutines_core()) {
                    fVar.cleanPrev();
                }
                return e.Companion.m1253closedJP2dKIU(getSendException());
            }
            if (updateCellSend == 5) {
                fVar.cleanPrev();
            }
            fVar2 = fVar;
        }
    }

    /* renamed from: trySendImpl-Mj0NB7M, reason: not valid java name */
    private final Object m1258trySendImplMj0NB7M(Object obj, boolean z7) {
        return this.onBufferOverflow == BufferOverflow.DROP_LATEST ? m1256trySendDropLatestMj0NB7M(obj, z7) : m1257trySendDropOldestJP2dKIU(obj);
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    protected boolean isConflatedDropOldest() {
        return this.onBufferOverflow == BufferOverflow.DROP_OLDEST;
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    protected void registerSelectForSend(kotlinx.coroutines.selects.j jVar, Object obj) {
        Object mo1234trySendJP2dKIU = mo1234trySendJP2dKIU(obj);
        if (!(mo1234trySendJP2dKIU instanceof e.c)) {
            jVar.selectInRegistrationPhase(w.INSTANCE);
        } else {
            if (!(mo1234trySendJP2dKIU instanceof e.a)) {
                throw new IllegalStateException("unreachable".toString());
            }
            e.m1244exceptionOrNullimpl(mo1234trySendJP2dKIU);
            jVar.selectInRegistrationPhase(BufferedChannelKt.getCHANNEL_CLOSED());
        }
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.b, kotlinx.coroutines.channels.l
    public Object send(Object obj, kotlin.coroutines.c cVar) {
        return send$suspendImpl(this, obj, cVar);
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public Object sendBroadcast$kotlinx_coroutines_core(Object obj, kotlin.coroutines.c cVar) {
        return sendBroadcast$suspendImpl(this, obj, cVar);
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public boolean shouldSendSuspend$kotlinx_coroutines_core() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.b, kotlinx.coroutines.channels.l
    /* renamed from: trySend-JP2dKIU */
    public Object mo1234trySendJP2dKIU(Object obj) {
        return m1258trySendImplMj0NB7M(obj, false);
    }

    public h(int i8, BufferOverflow bufferOverflow, f6.l lVar) {
        super(i8, lVar);
        this.capacity = i8;
        this.onBufferOverflow = bufferOverflow;
        if (bufferOverflow == BufferOverflow.SUSPEND) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + u.getOrCreateKotlinClass(BufferedChannel.class).getSimpleName() + " instead").toString());
        }
        if (i8 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i8 + " was specified").toString());
    }
}
