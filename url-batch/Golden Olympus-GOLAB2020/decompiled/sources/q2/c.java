package q2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import o2.InterfaceC3343n;
import t2.G;
import t2.J;

/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private static final j f43454a = new j(-1, null, null, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final int f43455b;

    /* renamed from: c, reason: collision with root package name */
    private static final int f43456c;

    /* renamed from: d, reason: collision with root package name */
    public static final G f43457d;

    /* renamed from: e, reason: collision with root package name */
    private static final G f43458e;

    /* renamed from: f, reason: collision with root package name */
    private static final G f43459f;

    /* renamed from: g, reason: collision with root package name */
    private static final G f43460g;

    /* renamed from: h, reason: collision with root package name */
    private static final G f43461h;

    /* renamed from: i, reason: collision with root package name */
    private static final G f43462i;

    /* renamed from: j, reason: collision with root package name */
    private static final G f43463j;

    /* renamed from: k, reason: collision with root package name */
    private static final G f43464k;

    /* renamed from: l, reason: collision with root package name */
    private static final G f43465l;

    /* renamed from: m, reason: collision with root package name */
    private static final G f43466m;

    /* renamed from: n, reason: collision with root package name */
    private static final G f43467n;

    /* renamed from: o, reason: collision with root package name */
    private static final G f43468o;

    /* renamed from: p, reason: collision with root package name */
    private static final G f43469p;

    /* renamed from: q, reason: collision with root package name */
    private static final G f43470q;

    /* renamed from: r, reason: collision with root package name */
    private static final G f43471r;

    /* renamed from: s, reason: collision with root package name */
    private static final G f43472s;

    /* synthetic */ class a extends kotlin.jvm.internal.p implements Function2 {

        /* renamed from: b, reason: collision with root package name */
        public static final a f43473b = new a();

        a() {
            super(2, c.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
        }

        public final j a(long j4, j jVar) {
            return c.x(j4, jVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Number) obj).longValue(), (j) obj2);
        }
    }

    static {
        int e4;
        int e5;
        e4 = J.e("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, null);
        f43455b = e4;
        e5 = J.e("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, null);
        f43456c = e5;
        f43457d = new G("BUFFERED");
        f43458e = new G("SHOULD_BUFFER");
        f43459f = new G("S_RESUMING_BY_RCV");
        f43460g = new G("RESUMING_BY_EB");
        f43461h = new G("POISONED");
        f43462i = new G("DONE_RCV");
        f43463j = new G("INTERRUPTED_SEND");
        f43464k = new G("INTERRUPTED_RCV");
        f43465l = new G("CHANNEL_CLOSED");
        f43466m = new G("SUSPEND");
        f43467n = new G("SUSPEND_NO_WAITER");
        f43468o = new G("FAILED");
        f43469p = new G("NO_RECEIVE_RESULT");
        f43470q = new G("CLOSE_HANDLER_CLOSED");
        f43471r = new G("CLOSE_HANDLER_INVOKED");
        f43472s = new G("NO_CLOSE_CAUSE");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long A(int i4) {
        if (i4 == 0) {
            return 0L;
        }
        if (i4 != Integer.MAX_VALUE) {
            return i4;
        }
        return Long.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean B(InterfaceC3343n interfaceC3343n, Object obj, Function1 function1) {
        Object h4 = interfaceC3343n.h(obj, null, function1);
        if (h4 == null) {
            return false;
        }
        interfaceC3343n.u(h4);
        return true;
    }

    static /* synthetic */ boolean C(InterfaceC3343n interfaceC3343n, Object obj, Function1 function1, int i4, Object obj2) {
        if ((i4 & 2) != 0) {
            function1 = null;
        }
        return B(interfaceC3343n, obj, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long v(long j4, boolean z4) {
        return (z4 ? 4611686018427387904L : 0L) + j4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long w(long j4, int i4) {
        return (i4 << 60) + j4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j x(long j4, j jVar) {
        return new j(j4, jVar, jVar.y(), 0);
    }

    public static final m2.f y() {
        return a.f43473b;
    }

    public static final G z() {
        return f43465l;
    }
}
