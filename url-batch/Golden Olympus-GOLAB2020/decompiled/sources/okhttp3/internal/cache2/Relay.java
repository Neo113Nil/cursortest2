package okhttp3.internal.cache2;

import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;
import okio.B;
import okio.C;
import okio.C3372e;
import okio.h;

@Metadata
/* loaded from: classes3.dex */
public final class Relay {

    /* renamed from: k, reason: collision with root package name */
    public static final Companion f42687k = new Companion(null);

    /* renamed from: l, reason: collision with root package name */
    public static final h f42688l;

    /* renamed from: m, reason: collision with root package name */
    public static final h f42689m;

    /* renamed from: a, reason: collision with root package name */
    private RandomAccessFile f42690a;

    /* renamed from: b, reason: collision with root package name */
    private B f42691b;

    /* renamed from: c, reason: collision with root package name */
    private long f42692c;

    /* renamed from: d, reason: collision with root package name */
    private final h f42693d;

    /* renamed from: e, reason: collision with root package name */
    private final long f42694e;

    /* renamed from: f, reason: collision with root package name */
    private Thread f42695f;

    /* renamed from: g, reason: collision with root package name */
    private final C3372e f42696g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f42697h;

    /* renamed from: i, reason: collision with root package name */
    private final C3372e f42698i;

    /* renamed from: j, reason: collision with root package name */
    private int f42699j;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata
    public final class RelaySource implements B {

        /* renamed from: b, reason: collision with root package name */
        private final C f42700b;

        /* renamed from: c, reason: collision with root package name */
        private FileOperator f42701c;

        /* renamed from: d, reason: collision with root package name */
        private long f42702d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Relay f42703e;

        @Override // okio.B, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f42701c == null) {
                return;
            }
            RandomAccessFile randomAccessFile = null;
            this.f42701c = null;
            Relay relay = this.f42703e;
            synchronized (relay) {
                try {
                    relay.l(relay.f() - 1);
                    if (relay.f() == 0) {
                        RandomAccessFile e4 = relay.e();
                        relay.k(null);
                        randomAccessFile = e4;
                    }
                    Unit unit = Unit.f41027a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (randomAccessFile != null) {
                Util.l(randomAccessFile);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
        
            if (r0 != 2) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
        
            r6 = java.lang.Math.min(r21, r19.f42703e.i() - r19.f42702d);
            r2 = r19.f42701c;
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2);
            r2.a(r19.f42702d + 32, r20, r6);
            r19.f42702d += r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0075, code lost:
        
            return r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0077, code lost:
        
            r0 = r19.f42703e.g();
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0);
            r11 = r0.read(r19.f42703e.h(), r19.f42703e.c());
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0092, code lost:
        
            if (r11 != (-1)) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0094, code lost:
        
            r0 = r19.f42703e;
            r0.a(r0.i());
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x009d, code lost:
        
            r2 = r19.f42703e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x009f, code lost:
        
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00a0, code lost:
        
            r2.n(null);
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2, "null cannot be cast to non-null type java.lang.Object");
            r2.notifyAll();
            r0 = kotlin.Unit.f41027a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00ad, code lost:
        
            monitor-exit(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00ae, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00b5, code lost:
        
            r6 = java.lang.Math.min(r11, r21);
            r19.f42703e.h().J(r20, 0, r6);
            r19.f42702d += r6;
            r13 = r19.f42701c;
            kotlin.jvm.internal.Intrinsics.checkNotNull(r13);
            r13.b(r19.f42703e.i() + 32, r19.f42703e.h().clone(), r11);
            r4 = r19.f42703e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00eb, code lost:
        
            monitor-enter(r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00ec, code lost:
        
            r4.b().write(r4.h(), r11);
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0105, code lost:
        
            if (r4.b().l0() <= r4.c()) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0107, code lost:
        
            r4.b().H(r4.b().l0() - r4.c());
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x011e, code lost:
        
            r4.m(r4.i() + r11);
            r0 = kotlin.Unit.f41027a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0128, code lost:
        
            monitor-exit(r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0129, code lost:
        
            r2 = r19.f42703e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x012b, code lost:
        
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x012c, code lost:
        
            r2.n(null);
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2, "null cannot be cast to non-null type java.lang.Object");
            r2.notifyAll();
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x0137, code lost:
        
            monitor-exit(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x0138, code lost:
        
            return r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x011c, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x013d, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x00b2, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x013e, code lost:
        
            r2 = r19.f42703e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x0140, code lost:
        
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x0141, code lost:
        
            r2.n(null);
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2, "null cannot be cast to non-null type java.lang.Object");
            r2.notifyAll();
            r3 = kotlin.Unit.f41027a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x014f, code lost:
        
            throw r0;
         */
        @Override // okio.B
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public long read(C3372e sink, long j4) {
            char c4;
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (this.f42701c == null) {
                throw new IllegalStateException("Check failed.");
            }
            Relay relay = this.f42703e;
            synchronized (relay) {
                while (true) {
                    try {
                        if (this.f42702d != relay.i()) {
                            long i4 = relay.i() - relay.b().l0();
                            if (this.f42702d >= i4) {
                                long min = Math.min(j4, relay.i() - this.f42702d);
                                relay.b().J(sink, this.f42702d - i4, min);
                                this.f42702d += min;
                                return min;
                            }
                            c4 = 2;
                        } else if (!relay.d()) {
                            if (relay.j() == null) {
                                relay.n(Thread.currentThread());
                                c4 = 1;
                                break;
                            }
                            this.f42700b.waitUntilNotified(relay);
                        } else {
                            return -1L;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        @Override // okio.B
        public C timeout() {
            return this.f42700b;
        }
    }

    static {
        h.a aVar = h.f43270e;
        f42688l = aVar.d("OkHttp cache v1\n");
        f42689m = aVar.d("OkHttp DIRTY :(\n");
    }

    private final void o(h hVar, long j4, long j5) {
        C3372e c3372e = new C3372e();
        c3372e.M(hVar);
        c3372e.w0(j4);
        c3372e.w0(j5);
        if (c3372e.l0() != 32) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        RandomAccessFile randomAccessFile = this.f42690a;
        Intrinsics.checkNotNull(randomAccessFile);
        FileChannel channel = randomAccessFile.getChannel();
        Intrinsics.checkNotNullExpressionValue(channel, "file!!.channel");
        new FileOperator(channel).b(0L, c3372e, 32L);
    }

    private final void p(long j4) {
        C3372e c3372e = new C3372e();
        c3372e.M(this.f42693d);
        RandomAccessFile randomAccessFile = this.f42690a;
        Intrinsics.checkNotNull(randomAccessFile);
        FileChannel channel = randomAccessFile.getChannel();
        Intrinsics.checkNotNullExpressionValue(channel, "file!!.channel");
        new FileOperator(channel).b(32 + j4, c3372e, this.f42693d.v());
    }

    public final void a(long j4) {
        p(j4);
        RandomAccessFile randomAccessFile = this.f42690a;
        Intrinsics.checkNotNull(randomAccessFile);
        randomAccessFile.getChannel().force(false);
        o(f42688l, j4, this.f42693d.v());
        RandomAccessFile randomAccessFile2 = this.f42690a;
        Intrinsics.checkNotNull(randomAccessFile2);
        randomAccessFile2.getChannel().force(false);
        synchronized (this) {
            this.f42697h = true;
            Unit unit = Unit.f41027a;
        }
        B b4 = this.f42691b;
        if (b4 != null) {
            Util.l(b4);
        }
        this.f42691b = null;
    }

    public final C3372e b() {
        return this.f42698i;
    }

    public final long c() {
        return this.f42694e;
    }

    public final boolean d() {
        return this.f42697h;
    }

    public final RandomAccessFile e() {
        return this.f42690a;
    }

    public final int f() {
        return this.f42699j;
    }

    public final B g() {
        return this.f42691b;
    }

    public final C3372e h() {
        return this.f42696g;
    }

    public final long i() {
        return this.f42692c;
    }

    public final Thread j() {
        return this.f42695f;
    }

    public final void k(RandomAccessFile randomAccessFile) {
        this.f42690a = randomAccessFile;
    }

    public final void l(int i4) {
        this.f42699j = i4;
    }

    public final void m(long j4) {
        this.f42692c = j4;
    }

    public final void n(Thread thread) {
        this.f42695f = thread;
    }
}
