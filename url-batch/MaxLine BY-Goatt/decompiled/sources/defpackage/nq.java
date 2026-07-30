package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class nq {
    public static final tt a = new tt(-1, null, null, 0);
    public static final int b = mh2.q("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 12);
    public static final int c = mh2.q("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 12);
    public static final ng0 d = new ng0("BUFFERED", 1);
    public static final ng0 e = new ng0("SHOULD_BUFFER", 1);
    public static final ng0 f = new ng0("S_RESUMING_BY_RCV", 1);
    public static final ng0 g = new ng0("RESUMING_BY_EB", 1);
    public static final ng0 h = new ng0("POISONED", 1);
    public static final ng0 i = new ng0("DONE_RCV", 1);
    public static final ng0 j = new ng0("INTERRUPTED_SEND", 1);
    public static final ng0 k = new ng0("INTERRUPTED_RCV", 1);
    public static final ng0 l = new ng0("CHANNEL_CLOSED", 1);
    public static final ng0 m = new ng0("SUSPEND", 1);
    public static final ng0 n = new ng0("SUSPEND_NO_WAITER", 1);
    public static final ng0 o = new ng0("FAILED", 1);
    public static final ng0 p = new ng0("NO_RECEIVE_RESULT", 1);
    public static final ng0 q = new ng0("CLOSE_HANDLER_CLOSED", 1);
    public static final ng0 r = new ng0("CLOSE_HANDLER_INVOKED", 1);
    public static final ng0 s = new ng0("NO_CLOSE_CAUSE", 1);

    public static final boolean a(ds dsVar, Object obj, xt0 xt0Var) {
        ng0 e2 = dsVar.e(obj, xt0Var);
        if (e2 == null) {
            return false;
        }
        dsVar.l(e2);
        return true;
    }
}
