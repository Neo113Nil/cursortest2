package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.internal.f0;

/* loaded from: classes5.dex */
public interface ReceiveChannel {

    public static final class DefaultImpls {
        public static /* synthetic */ void cancel$default(ReceiveChannel receiveChannel, CancellationException cancellationException, int i8, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i8 & 1) != 0) {
                cancellationException = null;
            }
            receiveChannel.cancel(cancellationException);
        }

        public static <E> kotlinx.coroutines.selects.e getOnReceiveOrNull(ReceiveChannel receiveChannel) {
            s.checkNotNull(receiveChannel, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel<E of kotlinx.coroutines.channels.ReceiveChannel>");
            return ((BufferedChannel) receiveChannel).getOnReceiveOrNull();
        }

        public static /* synthetic */ void getOnReceiveOrNull$annotations() {
        }

        public static /* synthetic */ void isClosedForReceive$annotations() {
        }

        public static /* synthetic */ void isEmpty$annotations() {
        }

        public static <E> E poll(ReceiveChannel receiveChannel) {
            Object mo1233tryReceivePtdJZtk = receiveChannel.mo1233tryReceivePtdJZtk();
            if (e.m1250isSuccessimpl(mo1233tryReceivePtdJZtk)) {
                return (E) e.m1246getOrThrowimpl(mo1233tryReceivePtdJZtk);
            }
            Throwable m1244exceptionOrNullimpl = e.m1244exceptionOrNullimpl(mo1233tryReceivePtdJZtk);
            if (m1244exceptionOrNullimpl == null) {
                return null;
            }
            throw f0.recoverStackTrace(m1244exceptionOrNullimpl);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static <E> Object receiveOrNull(ReceiveChannel receiveChannel, kotlin.coroutines.c cVar) {
            ReceiveChannel$receiveOrNull$1 receiveChannel$receiveOrNull$1;
            Object coroutine_suspended;
            int i8;
            Object mo1232receiveCatchingJP2dKIU;
            if (cVar instanceof ReceiveChannel$receiveOrNull$1) {
                receiveChannel$receiveOrNull$1 = (ReceiveChannel$receiveOrNull$1) cVar;
                int i9 = receiveChannel$receiveOrNull$1.label;
                if ((i9 & Integer.MIN_VALUE) != 0) {
                    receiveChannel$receiveOrNull$1.label = i9 - Integer.MIN_VALUE;
                    Object obj = receiveChannel$receiveOrNull$1.result;
                    coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                    i8 = receiveChannel$receiveOrNull$1.label;
                    if (i8 != 0) {
                        y5.g.throwOnFailure(obj);
                        receiveChannel$receiveOrNull$1.label = 1;
                        mo1232receiveCatchingJP2dKIU = receiveChannel.mo1232receiveCatchingJP2dKIU(receiveChannel$receiveOrNull$1);
                        if (mo1232receiveCatchingJP2dKIU == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i8 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        y5.g.throwOnFailure(obj);
                        mo1232receiveCatchingJP2dKIU = ((e) obj).m1252unboximpl();
                    }
                    return e.m1245getOrNullimpl(mo1232receiveCatchingJP2dKIU);
                }
            }
            receiveChannel$receiveOrNull$1 = new ReceiveChannel$receiveOrNull$1(cVar);
            Object obj2 = receiveChannel$receiveOrNull$1.result;
            coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            i8 = receiveChannel$receiveOrNull$1.label;
            if (i8 != 0) {
            }
            return e.m1245getOrNullimpl(mo1232receiveCatchingJP2dKIU);
        }

        public static /* synthetic */ boolean cancel$default(ReceiveChannel receiveChannel, Throwable th, int i8, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i8 & 1) != 0) {
                th = null;
            }
            return receiveChannel.cancel(th);
        }
    }

    /* synthetic */ void cancel();

    void cancel(CancellationException cancellationException);

    /* synthetic */ boolean cancel(Throwable th);

    kotlinx.coroutines.selects.e getOnReceive();

    kotlinx.coroutines.selects.e getOnReceiveCatching();

    kotlinx.coroutines.selects.e getOnReceiveOrNull();

    boolean isClosedForReceive();

    boolean isEmpty();

    ChannelIterator iterator();

    Object poll();

    Object receive(kotlin.coroutines.c cVar);

    /* renamed from: receiveCatching-JP2dKIU */
    Object mo1232receiveCatchingJP2dKIU(kotlin.coroutines.c cVar);

    Object receiveOrNull(kotlin.coroutines.c cVar);

    /* renamed from: tryReceive-PtdJZtk */
    Object mo1233tryReceivePtdJZtk();
}
