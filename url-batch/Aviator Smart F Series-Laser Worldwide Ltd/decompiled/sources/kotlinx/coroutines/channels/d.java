package kotlinx.coroutines.channels;

import kotlinx.coroutines.channels.e;

/* loaded from: classes5.dex */
public abstract class d {
    public static final <E> b Channel(int i8, BufferOverflow bufferOverflow, f6.l lVar) {
        b bufferedChannel;
        if (i8 == -2) {
            bufferedChannel = bufferOverflow == BufferOverflow.SUSPEND ? new BufferedChannel(b.Factory.getCHANNEL_DEFAULT_CAPACITY$kotlinx_coroutines_core(), lVar) : new h(1, bufferOverflow, lVar);
        } else {
            if (i8 == -1) {
                if (bufferOverflow == BufferOverflow.SUSPEND) {
                    return new h(1, BufferOverflow.DROP_OLDEST, lVar);
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
            }
            if (i8 != 0) {
                return i8 != Integer.MAX_VALUE ? bufferOverflow == BufferOverflow.SUSPEND ? new BufferedChannel(i8, lVar) : new h(i8, bufferOverflow, lVar) : new BufferedChannel(Integer.MAX_VALUE, lVar);
            }
            bufferedChannel = bufferOverflow == BufferOverflow.SUSPEND ? new BufferedChannel(0, lVar) : new h(1, bufferOverflow, lVar);
        }
        return bufferedChannel;
    }

    public static /* synthetic */ b Channel$default(int i8, BufferOverflow bufferOverflow, f6.l lVar, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = 0;
        }
        if ((i9 & 2) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        if ((i9 & 4) != 0) {
            lVar = null;
        }
        return Channel(i8, bufferOverflow, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getOrElse-WpGqRn0, reason: not valid java name */
    public static final <T> T m1236getOrElseWpGqRn0(Object obj, f6.l lVar) {
        return obj instanceof e.c ? (T) lVar.invoke(e.m1244exceptionOrNullimpl(obj)) : obj;
    }

    /* renamed from: onClosed-WpGqRn0, reason: not valid java name */
    public static final <T> Object m1237onClosedWpGqRn0(Object obj, f6.l lVar) {
        if (obj instanceof e.a) {
            lVar.invoke(e.m1244exceptionOrNullimpl(obj));
        }
        return obj;
    }

    /* renamed from: onFailure-WpGqRn0, reason: not valid java name */
    public static final <T> Object m1238onFailureWpGqRn0(Object obj, f6.l lVar) {
        if (obj instanceof e.c) {
            lVar.invoke(e.m1244exceptionOrNullimpl(obj));
        }
        return obj;
    }

    /* renamed from: onSuccess-WpGqRn0, reason: not valid java name */
    public static final <T> Object m1239onSuccessWpGqRn0(Object obj, f6.l lVar) {
        if (!(obj instanceof e.c)) {
            lVar.invoke(obj);
        }
        return obj;
    }

    public static /* synthetic */ b Channel$default(int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = 0;
        }
        return Channel(i8);
    }

    public static final /* synthetic */ b Channel(int i8) {
        return Channel$default(i8, null, null, 6, null);
    }
}
