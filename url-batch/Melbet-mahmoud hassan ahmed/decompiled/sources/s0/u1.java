package s0;

import android.media.metrics.LogSessionId;

/* loaded from: classes.dex */
public final class u1 {

    /* renamed from: b, reason: collision with root package name */
    public static final u1 f21583b;

    /* renamed from: a, reason: collision with root package name */
    private final a f21584a;

    private static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f21585b = new a(LogSessionId.LOG_SESSION_ID_NONE);

        /* renamed from: a, reason: collision with root package name */
        public final LogSessionId f21586a;

        public a(LogSessionId logSessionId) {
            this.f21586a = logSessionId;
        }
    }

    static {
        f21583b = o2.m0.f19752a < 31 ? new u1() : new u1(a.f21585b);
    }

    public u1() {
        this((a) null);
        o2.a.f(o2.m0.f19752a < 31);
    }

    public u1(LogSessionId logSessionId) {
        this(new a(logSessionId));
    }

    private u1(a aVar) {
        this.f21584a = aVar;
    }

    public LogSessionId a() {
        return ((a) o2.a.e(this.f21584a)).f21586a;
    }
}
