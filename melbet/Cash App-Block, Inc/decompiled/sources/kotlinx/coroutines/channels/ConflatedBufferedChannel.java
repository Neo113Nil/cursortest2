package kotlinx.coroutines.channels;

import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.internal.UndeliveredElementException;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class ConflatedBufferedChannel extends BufferedChannel {
    public final BufferOverflow onBufferOverflow;

    public ConflatedBufferedChannel(int i, BufferOverflow bufferOverflow, Function1 function1) {
        super(i, function1);
        this.onBufferOverflow = bufferOverflow;
        if (bufferOverflow == BufferOverflow.SUSPEND) {
            a$$ExternalSyntheticBUOutline0.m("This implementation does not support suspension for senders, use ", Reflection.factory.getOrCreateKotlinClass(BufferedChannel.class).getSimpleName(), " instead");
            throw null;
        }
        if (i >= 1) {
            return;
        }
        Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Buffered channel capacity must be at least 1, but ", " was specified"));
        throw null;
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public final boolean isConflatedDropOldest() {
        return this.onBufferOverflow == BufferOverflow.DROP_OLDEST;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000d, code lost:
    
        r1 = kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElementCatchingException(r2, r1, null);
     */
    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object send(Object obj, Continuation continuation) {
        UndeliveredElementException callUndeliveredElementCatchingException;
        if (!(m4194trySendImplMj0NB7M(obj, true) instanceof ChannelResult.Closed)) {
            return Unit.INSTANCE;
        }
        Function1 function1 = this.onUndeliveredElement;
        if (function1 == null || callUndeliveredElementCatchingException == null) {
            throw getSendException();
        }
        ExceptionsKt__ExceptionsKt.addSuppressed(callUndeliveredElementCatchingException, getSendException());
        throw callUndeliveredElementCatchingException;
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    /* renamed from: trySend-JP2dKIU */
    public final Object mo1159trySendJP2dKIU(Object obj) {
        return m4194trySendImplMj0NB7M(obj, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
    
        r13 = kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElementCatchingException(r13, r14, null);
     */
    /* renamed from: trySendImpl-Mj0NB7M, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4194trySendImplMj0NB7M(Object obj, boolean z) {
        ChannelSegment channelSegment;
        ConflatedBufferedChannel conflatedBufferedChannel;
        Object obj2;
        UndeliveredElementException callUndeliveredElementCatchingException;
        if (this.onBufferOverflow == BufferOverflow.DROP_LATEST) {
            Object mo1159trySendJP2dKIU = super.mo1159trySendJP2dKIU(obj);
            if (!(mo1159trySendJP2dKIU instanceof ChannelResult.Failed) || (mo1159trySendJP2dKIU instanceof ChannelResult.Closed)) {
                return mo1159trySendJP2dKIU;
            }
            if (!z || (r13 = this.onUndeliveredElement) == null || callUndeliveredElementCatchingException == null) {
                return Unit.INSTANCE;
            }
            throw callUndeliveredElementCatchingException;
        }
        Object obj3 = BufferedChannelKt.BUFFERED;
        ChannelSegment channelSegment2 = (ChannelSegment) BufferedChannel.sendSegment$volatile$FU.get(this);
        while (true) {
            long andIncrement = BufferedChannel.sendersAndCloseStatus$volatile$FU.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean isClosed = this.isClosed(andIncrement, false);
            int i = BufferedChannelKt.SEGMENT_SIZE;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            if (channelSegment2.id != j3) {
                ChannelSegment findSegmentSend = this.findSegmentSend(j3, channelSegment2);
                if (findSegmentSend != null) {
                    channelSegment = findSegmentSend;
                    obj2 = obj;
                    conflatedBufferedChannel = this;
                } else if (isClosed) {
                    return new ChannelResult.Closed(this.getSendException());
                }
            } else {
                channelSegment = channelSegment2;
                conflatedBufferedChannel = this;
                obj2 = obj;
            }
            int access$updateCellSend = BufferedChannel.access$updateCellSend(conflatedBufferedChannel, channelSegment, i2, obj2, j, obj3, isClosed);
            channelSegment2 = channelSegment;
            if (access$updateCellSend == 0) {
                channelSegment2.cleanPrev();
                return Unit.INSTANCE;
            }
            if (access$updateCellSend == 1) {
                return Unit.INSTANCE;
            }
            if (access$updateCellSend == 2) {
                if (isClosed) {
                    channelSegment2.onSlotCleaned();
                    return new ChannelResult.Closed(conflatedBufferedChannel.getSendException());
                }
                Waiter waiter = obj3 instanceof Waiter ? (Waiter) obj3 : null;
                if (waiter != null) {
                    waiter.invokeOnCancellation(channelSegment2, i2 + i);
                }
                conflatedBufferedChannel.dropFirstElementUntilTheSpecifiedCellIsInTheBuffer((channelSegment2.id * j2) + i2);
                return Unit.INSTANCE;
            }
            if (access$updateCellSend == 3) {
                a$$ExternalSyntheticBUOutline0.m$1("unexpected");
                return null;
            }
            if (access$updateCellSend == 4) {
                if (j < BufferedChannel.receivers$volatile$FU.get(conflatedBufferedChannel)) {
                    channelSegment2.cleanPrev();
                }
                return new ChannelResult.Closed(conflatedBufferedChannel.getSendException());
            }
            if (access$updateCellSend == 5) {
                channelSegment2.cleanPrev();
            }
            this = conflatedBufferedChannel;
            obj = obj2;
        }
    }
}
