package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kyq {
    public static final kyx a = new kyx(-1, null, null, 0);
    public static final int b = jav.n("kotlinx.coroutines.bufferedChannel.segmentSize", 32, Integer.MAX_VALUE);
    public static final int c = jav.n("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, Integer.MAX_VALUE);
    public static final ldb d = new ldb("BUFFERED");
    public static final ldb e = new ldb("SHOULD_BUFFER");
    public static final ldb f = new ldb("S_RESUMING_BY_RCV");
    public static final ldb g = new ldb("RESUMING_BY_EB");
    public static final ldb h = new ldb("POISONED");
    public static final ldb i = new ldb("DONE_RCV");
    public static final ldb j = new ldb("INTERRUPTED_SEND");
    public static final ldb k = new ldb("INTERRUPTED_RCV");
    public static final ldb l = new ldb("CHANNEL_CLOSED");
    public static final ldb m = new ldb("SUSPEND");
    public static final ldb n = new ldb("SUSPEND_NO_WAITER");
    public static final ldb o = new ldb("FAILED");
    public static final ldb p = new ldb("NO_RECEIVE_RESULT");
    public static final ldb q = new ldb("CLOSE_HANDLER_CLOSED");
    public static final ldb r = new ldb("CLOSE_HANDLER_INVOKED");
    public static final ldb s = new ldb("NO_CLOSE_CAUSE");

    public static final long a(long j2, int i2) {
        return (i2 << 60) + j2;
    }

    public static final boolean b(kuv kuvVar, Object obj) {
        Object i2 = kuvVar.i(obj, null);
        if (i2 == null) {
            return false;
        }
        kuvVar.a(i2);
        return true;
    }
}
