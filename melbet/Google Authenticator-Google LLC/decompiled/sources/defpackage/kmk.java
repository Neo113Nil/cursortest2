package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum kmk {
    SUBCHANNEL_SHUTDOWN("subchannel shutdown"),
    CONNECTION_RESET("connection reset"),
    CONNECTION_TIMED_OUT("connection timed out"),
    CONNECTION_ABORTED("connection aborted"),
    SOCKET_ERROR("socket error"),
    UNKNOWN("unknown");

    public final String g;

    kmk(String str) {
        this.g = str;
    }
}
