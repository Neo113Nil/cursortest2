package kotlinx.coroutines.channels;

import kotlinx.coroutines.internal.f0;

/* loaded from: classes5.dex */
public interface l {

    public static final class a {
        public static /* synthetic */ boolean close$default(l lVar, Throwable th, int i8, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
            }
            if ((i8 & 1) != 0) {
                th = null;
            }
            return lVar.close(th);
        }

        public static /* synthetic */ void isClosedForSend$annotations() {
        }

        public static <E> boolean offer(l lVar, E e8) {
            Object mo1234trySendJP2dKIU = lVar.mo1234trySendJP2dKIU(e8);
            if (e.m1250isSuccessimpl(mo1234trySendJP2dKIU)) {
                return true;
            }
            Throwable m1244exceptionOrNullimpl = e.m1244exceptionOrNullimpl(mo1234trySendJP2dKIU);
            if (m1244exceptionOrNullimpl == null) {
                return false;
            }
            throw f0.recoverStackTrace(m1244exceptionOrNullimpl);
        }
    }

    boolean close(Throwable th);

    kotlinx.coroutines.selects.g getOnSend();

    void invokeOnClose(f6.l lVar);

    boolean isClosedForSend();

    boolean offer(Object obj);

    Object send(Object obj, kotlin.coroutines.c cVar);

    /* renamed from: trySend-JP2dKIU */
    Object mo1234trySendJP2dKIU(Object obj);
}
