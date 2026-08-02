package defpackage;

import android.net.TrafficStats;
import android.os.Trace;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.CronetException;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.InlineExecutionProhibitedException;
import org.chromium.net.ThreadStatsUid;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ljq extends ExperimentalUrlRequest {
    public static final String a = "ljq";
    public final ljo b;
    public final Executor c;
    public final String d;
    public final boolean h;
    public final String i;
    public final lkb j;
    public final Executor k;
    public String m;
    public ReadableByteChannel n;
    public ljy o;
    public String p;
    public HttpURLConnection q;
    public final ljf r;
    public final int s;
    public final liz t;
    public final long u;
    public int v;
    public int w;
    public boolean x;
    public ljj y;
    public final Map e = new TreeMap(String.CASE_INSENSITIVE_ORDER);
    public final List f = new ArrayList();
    public final AtomicInteger g = new AtomicInteger(0);
    private final AtomicBoolean z = new AtomicBoolean(false);
    public volatile int l = -1;

    public ljq(ljf ljfVar, UrlRequest.Callback callback, final Executor executor, Executor executor2, String str, String str2, boolean z, boolean z2, int i, final boolean z3, final int i2, long j, String str3, ArrayList arrayList, UploadDataProvider uploadDataProvider, Executor executor3) {
        lkb lkbVar = null;
        new cyi("Cronet JavaUrlRequest#JavaUrlRequest", 2, null);
        try {
            this.h = z;
            this.b = new ljo(this, callback, executor2);
            final int threadStatsTag = !z2 ? TrafficStats.getThreadStatsTag() : i;
            this.c = new ljp(new Executor() { // from class: ljk
                @Override // java.util.concurrent.Executor
                public final void execute(final Runnable runnable) {
                    String str4 = ljq.a;
                    final int i3 = threadStatsTag;
                    final boolean z4 = z3;
                    final int i4 = i2;
                    executor.execute(new Runnable() { // from class: ljl
                        @Override // java.lang.Runnable
                        public final void run() {
                            String str5 = ljq.a;
                            int threadStatsTag2 = TrafficStats.getThreadStatsTag();
                            TrafficStats.setThreadStatsTag(i3);
                            Runnable runnable2 = runnable;
                            boolean z5 = z4;
                            if (z5) {
                                ThreadStatsUid.set(i4);
                            }
                            try {
                                runnable2.run();
                                if (z5) {
                                    ThreadStatsUid.clear();
                                }
                                TrafficStats.setThreadStatsTag(threadStatsTag2);
                            } catch (Throwable th) {
                                if (z5) {
                                    ThreadStatsUid.clear();
                                }
                                TrafficStats.setThreadStatsTag(threadStatsTag2);
                                throw th;
                            }
                        }
                    });
                }
            });
            this.r = ljfVar;
            this.s = ljfVar.a;
            this.t = ljfVar.b;
            this.m = str;
            this.d = str2;
            this.u = j;
            if (!"OPTIONS".equalsIgnoreCase(str3) && !"GET".equalsIgnoreCase(str3) && !"HEAD".equalsIgnoreCase(str3) && !"POST".equalsIgnoreCase(str3) && !"PUT".equalsIgnoreCase(str3) && !"DELETE".equalsIgnoreCase(str3) && !"TRACE".equalsIgnoreCase(str3) && !"PATCH".equalsIgnoreCase(str3)) {
                throw new IllegalArgumentException("Invalid http method ".concat(str3));
            }
            this.i = str3;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                Map.Entry entry = (Map.Entry) arrayList.get(i3);
                String str4 = (String) entry.getKey();
                int i4 = 0;
                while (true) {
                    if (i4 < str4.length()) {
                        char charAt = str4.charAt(i4);
                        if (charAt != ',' && charAt != '/' && charAt != '{' && charAt != '}') {
                            switch (charAt) {
                                case '\'':
                                case '(':
                                case ')':
                                    break;
                                default:
                                    switch (charAt) {
                                        case ':':
                                        case ';':
                                        case '<':
                                        case '=':
                                        case '>':
                                        case '?':
                                        case '@':
                                            break;
                                        default:
                                            switch (charAt) {
                                                case '[':
                                                case '\\':
                                                case ']':
                                                    break;
                                                default:
                                                    i4 = (Character.isISOControl(charAt) || Character.isWhitespace(charAt)) ? i4 : i4 + 1;
                                                    break;
                                            }
                                    }
                            }
                        }
                    } else if (!((String) entry.getValue()).contains("\r\n")) {
                        this.e.put((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                throw new IllegalArgumentException("Invalid header with headername: ".concat(String.valueOf((String) entry.getKey())));
            }
            if (uploadDataProvider != null) {
                if (!this.e.containsKey("Content-Type")) {
                    throw new IllegalArgumentException("Requests with upload data must have a Content-Type.");
                }
                lkbVar = new lkb(uploadDataProvider);
            }
            this.j = lkbVar;
            this.k = (executor3 == null || this.h) ? executor3 : new pl(executor3, 5);
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public final void a() {
        d(new kkh(this, 12, null), "closeResponseChannel");
    }

    public final void b(CronetException cronetException) {
        AtomicInteger atomicInteger;
        int i;
        int i2;
        do {
            atomicInteger = this.g;
            i = atomicInteger.get();
            if (i == 0) {
                throw new IllegalStateException("Can't enter error state before start");
            }
            if (i == 6) {
                return;
            }
            i2 = 7;
            if (i == 7 || i == 8) {
                return;
            }
        } while (!atomicInteger.compareAndSet(i, 6));
        f();
        e();
        ljo ljoVar = this.b;
        ljy ljyVar = this.o;
        ljoVar.d.a();
        kfu kfuVar = new kfu(ljoVar, (UrlResponseInfo) ljyVar, cronetException, i2);
        try {
            ljoVar.b(kfuVar, "onFailed");
        } catch (InlineExecutionProhibitedException unused) {
            Executor executor = ljoVar.c;
            if (executor != null) {
                new cyi("Cronet JavaUrlRequest.AsyncUrlRequestCallback#executeOnFallbackExecutor onFailed", 2, null);
                try {
                    executor.execute(new kyf(kfuVar, 11));
                    Trace.endSection();
                } catch (Throwable th) {
                    try {
                        Trace.endSection();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }
    }

    public final void c(Throwable th) {
        b(new lio("Exception received from UploadDataProvider", th));
    }

    @Override // org.chromium.net.UrlRequest
    public final void cancel() {
        int andSet = this.g.getAndSet(8);
        if (andSet == 1 || andSet == 2 || andSet == 3 || andSet == 4 || andSet == 5) {
            f();
            e();
            ljo ljoVar = this.b;
            ljy ljyVar = this.o;
            ljoVar.d.a();
            ljoVar.b(new kyf(ljoVar, ljyVar, 13, null), "onCanceled");
        }
    }

    public final void d(Runnable runnable, String str) {
        byte[] bArr = null;
        new cyi("Cronet JavaUrlRequest#executeOnExecutor ".concat(str), 2, null);
        try {
            this.c.execute(new kyf(str, runnable, 8, bArr));
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void e() {
        lkb lkbVar = this.j;
        if (lkbVar == null || !this.z.compareAndSet(false, true)) {
            return;
        }
        try {
            this.k.execute(new kyf(this, new ljh(lkbVar, 2), 6));
        } catch (RejectedExecutionException e) {
            jav.c(a, "Exception when closing uploadDataProvider", e);
        }
    }

    public final void f() {
        d(new kkh(this, 10, null), "fireDisconnect");
    }

    @Override // org.chromium.net.UrlRequest
    public final void followRedirect() {
        j(3, 1, new kkh(this, 14));
    }

    public final void g() {
        this.l = 13;
        d(new kyf(this, new ljh(this, 4), 5), "fireGetHeaders");
    }

    @Override // org.chromium.net.UrlRequest
    public final void getStatus(UrlRequest.StatusListener statusListener) {
        int i = this.g.get();
        int i2 = this.l;
        int i3 = 14;
        switch (i) {
            case 0:
            case 6:
            case 7:
            case 8:
                i2 = -1;
                break;
            case 1:
                break;
            case 2:
            case 3:
            case 4:
                i2 = 0;
                break;
            case 5:
                i2 = 14;
                break;
            default:
                throw new IllegalStateException(a.Y(i, "Switch is exhaustive: "));
        }
        this.b.b(new vz(new lkd(statusListener), i2, i3), "sendStatus");
    }

    public final void h() {
        d(new kyf(this, new ljh(this, 3), 5), "fireOpenConnection");
    }

    public final void i(String str, Exception exc) {
        jav.c(a, a.Z(str, "Exception in ", " method"), exc);
        this.x = true;
    }

    @Override // org.chromium.net.UrlRequest
    public final boolean isDone() {
        int i = this.g.get();
        return i == 7 || i == 6 || i == 8;
    }

    public final void j(int i, int i2, Runnable runnable) {
        AtomicInteger atomicInteger = this.g;
        if (!atomicInteger.compareAndSet(i, i2)) {
            int i3 = atomicInteger.get();
            if (i3 == 8 || i3 == 6) {
                return;
            }
            throw new IllegalStateException("Invalid state transition - expected " + jax.a(i) + " but was " + jax.a(i3));
        }
        new cyi("Cronet JavaUrlRequest#transitionStates " + jax.a(i) + " -> " + jax.a(i2), 2, null);
        try {
            runnable.run();
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // org.chromium.net.UrlRequest
    public final void read(final ByteBuffer byteBuffer) {
        jay.h(byteBuffer);
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("ByteBuffer is already full.");
        }
        j(4, 5, new kyf(this, new ljr() { // from class: ljm
            @Override // defpackage.ljr
            public final void a() {
                int i;
                ljq ljqVar = ljq.this;
                ReadableByteChannel readableByteChannel = ljqVar.n;
                ByteBuffer byteBuffer2 = byteBuffer;
                int i2 = 1;
                if (readableByteChannel != null) {
                    ljqVar.v++;
                    i = readableByteChannel.read(byteBuffer2);
                } else {
                    i = -1;
                }
                if (i != -1) {
                    ljo ljoVar = ljqVar.b;
                    ljoVar.a(new ljn(ljoVar, ljqVar.o, byteBuffer2, i2), "onReadCompleted");
                    return;
                }
                ReadableByteChannel readableByteChannel2 = ljqVar.n;
                if (readableByteChannel2 != null) {
                    readableByteChannel2.close();
                }
                if (ljqVar.g.compareAndSet(5, 7)) {
                    ljqVar.f();
                    ljo ljoVar2 = ljqVar.b;
                    ljoVar2.b(new kyf(ljoVar2, ljqVar.o, 10, null), "onSucceeded");
                }
            }
        }, 9));
    }

    @Override // org.chromium.net.UrlRequest
    public final void start() {
        this.l = 10;
        this.r.c.incrementAndGet();
        j(0, 1, new kkh(this, 11, null));
    }
}
