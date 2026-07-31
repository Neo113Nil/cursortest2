package okhttp3.internal.connection;

import W1.AbstractC1233c;
import com.ironsource.C1463f4;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.CertificatePinner;
import okhttp3.Dispatcher;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheInterceptor;
import okhttp3.internal.http.BridgeInterceptor;
import okhttp3.internal.http.CallServerInterceptor;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http.RetryAndFollowUpInterceptor;
import okhttp3.internal.platform.Platform;
import okio.C3370c;

@Metadata
/* loaded from: classes3.dex */
public final class RealCall implements Call {

    /* renamed from: b, reason: collision with root package name */
    private final OkHttpClient f42762b;

    /* renamed from: c, reason: collision with root package name */
    private final Request f42763c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f42764d;

    /* renamed from: e, reason: collision with root package name */
    private final RealConnectionPool f42765e;

    /* renamed from: f, reason: collision with root package name */
    private final EventListener f42766f;

    /* renamed from: g, reason: collision with root package name */
    private final RealCall$timeout$1 f42767g;

    /* renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f42768h;

    /* renamed from: i, reason: collision with root package name */
    private Object f42769i;

    /* renamed from: j, reason: collision with root package name */
    private ExchangeFinder f42770j;

    /* renamed from: k, reason: collision with root package name */
    private RealConnection f42771k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f42772l;

    /* renamed from: m, reason: collision with root package name */
    private Exchange f42773m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f42774n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f42775o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f42776p;

    /* renamed from: q, reason: collision with root package name */
    private volatile boolean f42777q;

    /* renamed from: r, reason: collision with root package name */
    private volatile Exchange f42778r;

    /* renamed from: s, reason: collision with root package name */
    private volatile RealConnection f42779s;

    @Metadata
    public final class AsyncCall implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final Callback f42780b;

        /* renamed from: c, reason: collision with root package name */
        private volatile AtomicInteger f42781c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ RealCall f42782d;

        public final void a(ExecutorService executorService) {
            Intrinsics.checkNotNullParameter(executorService, "executorService");
            Dispatcher q4 = this.f42782d.l().q();
            if (Util.f42596h && Thread.holdsLock(q4)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + q4);
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e4) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e4);
                    this.f42782d.t(interruptedIOException);
                    this.f42780b.b(this.f42782d, interruptedIOException);
                    this.f42782d.l().q().d(this);
                }
            } catch (Throwable th) {
                this.f42782d.l().q().d(this);
                throw th;
            }
        }

        public final AtomicInteger b() {
            return this.f42781c;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z4;
            Throwable th;
            IOException e4;
            Dispatcher q4;
            String str = "OkHttp " + this.f42782d.u();
            RealCall realCall = this.f42782d;
            Thread currentThread = Thread.currentThread();
            String name = currentThread.getName();
            currentThread.setName(str);
            try {
                realCall.f42767g.enter();
                try {
                    try {
                        z4 = true;
                        try {
                            this.f42780b.a(realCall, realCall.p());
                            q4 = realCall.l().q();
                        } catch (IOException e5) {
                            e4 = e5;
                            if (z4) {
                                Platform.f43120a.g().k("Callback failure for " + realCall.A(), 4, e4);
                            } else {
                                this.f42780b.b(realCall, e4);
                            }
                            q4 = realCall.l().q();
                            q4.d(this);
                        } catch (Throwable th2) {
                            th = th2;
                            realCall.cancel();
                            if (!z4) {
                                IOException iOException = new IOException("canceled due to " + th);
                                AbstractC1233c.a(iOException, th);
                                this.f42780b.b(realCall, iOException);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        realCall.l().q().d(this);
                        throw th3;
                    }
                } catch (IOException e6) {
                    z4 = false;
                    e4 = e6;
                } catch (Throwable th4) {
                    z4 = false;
                    th = th4;
                }
                q4.d(this);
            } finally {
                currentThread.setName(name);
            }
        }
    }

    @Metadata
    public static final class CallReference extends WeakReference<RealCall> {

        /* renamed from: a, reason: collision with root package name */
        private final Object f42783a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CallReference(RealCall referent, Object obj) {
            super(referent);
            Intrinsics.checkNotNullParameter(referent, "referent");
            this.f42783a = obj;
        }

        public final Object a() {
            return this.f42783a;
        }
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [okhttp3.internal.connection.RealCall$timeout$1, okio.C] */
    public RealCall(OkHttpClient client, Request originalRequest, boolean z4) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        this.f42762b = client;
        this.f42763c = originalRequest;
        this.f42764d = z4;
        this.f42765e = client.n().a();
        this.f42766f = client.s().a(this);
        ?? r4 = new C3370c() { // from class: okhttp3.internal.connection.RealCall$timeout$1
            @Override // okio.C3370c
            protected void timedOut() {
                RealCall.this.cancel();
            }
        };
        r4.timeout(client.k(), TimeUnit.MILLISECONDS);
        this.f42767g = r4;
        this.f42768h = new AtomicBoolean();
        this.f42776p = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String A() {
        StringBuilder sb = new StringBuilder();
        sb.append(r() ? "canceled " : "");
        sb.append(this.f42764d ? "web socket" : "call");
        sb.append(" to ");
        sb.append(u());
        return sb.toString();
    }

    private final IOException d(IOException iOException) {
        Socket v4;
        boolean z4 = Util.f42596h;
        if (z4 && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        RealConnection realConnection = this.f42771k;
        if (realConnection != null) {
            if (z4 && Thread.holdsLock(realConnection)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + realConnection);
            }
            synchronized (realConnection) {
                v4 = v();
            }
            if (this.f42771k == null) {
                if (v4 != null) {
                    Util.m(v4);
                }
                this.f42766f.l(this, realConnection);
            } else if (v4 != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        IOException z5 = z(iOException);
        if (iOException == null) {
            this.f42766f.d(this);
            return z5;
        }
        EventListener eventListener = this.f42766f;
        Intrinsics.checkNotNull(z5);
        eventListener.e(this, z5);
        return z5;
    }

    private final void e() {
        this.f42769i = Platform.f43120a.g().i("response.body().close()");
        this.f42766f.f(this);
    }

    private final Address i(HttpUrl httpUrl) {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        CertificatePinner certificatePinner;
        if (httpUrl.i()) {
            sSLSocketFactory = this.f42762b.H();
            hostnameVerifier = this.f42762b.w();
            certificatePinner = this.f42762b.l();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            certificatePinner = null;
        }
        return new Address(httpUrl.h(), httpUrl.l(), this.f42762b.r(), this.f42762b.G(), sSLSocketFactory, hostnameVerifier, certificatePinner, this.f42762b.C(), this.f42762b.B(), this.f42762b.A(), this.f42762b.o(), this.f42762b.D());
    }

    private final IOException z(IOException iOException) {
        if (this.f42772l || !exit()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException(C1463f4.f16211f);
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final void c(RealConnection connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (!Util.f42596h || Thread.holdsLock(connection)) {
            if (this.f42771k != null) {
                throw new IllegalStateException("Check failed.");
            }
            this.f42771k = connection;
            connection.n().add(new CallReference(this, this.f42769i));
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
    }

    @Override // okhttp3.Call
    public void cancel() {
        if (this.f42777q) {
            return;
        }
        this.f42777q = true;
        Exchange exchange = this.f42778r;
        if (exchange != null) {
            exchange.b();
        }
        RealConnection realConnection = this.f42779s;
        if (realConnection != null) {
            realConnection.d();
        }
        this.f42766f.g(this);
    }

    @Override // okhttp3.Call
    public Response execute() {
        if (!this.f42768h.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        enter();
        e();
        try {
            this.f42762b.q().a(this);
            return p();
        } finally {
            this.f42762b.q().e(this);
        }
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public RealCall clone() {
        return new RealCall(this.f42762b, this.f42763c, this.f42764d);
    }

    public final void j(Request request, boolean z4) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (this.f42773m != null) {
            throw new IllegalStateException("Check failed.");
        }
        synchronized (this) {
            if (this.f42775o) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
            }
            if (this.f42774n) {
                throw new IllegalStateException("Check failed.");
            }
            Unit unit = Unit.f41027a;
        }
        if (z4) {
            this.f42770j = new ExchangeFinder(this.f42765e, i(request.j()), this, this.f42766f);
        }
    }

    public final void k(boolean z4) {
        Exchange exchange;
        synchronized (this) {
            if (!this.f42776p) {
                throw new IllegalStateException("released");
            }
            Unit unit = Unit.f41027a;
        }
        if (z4 && (exchange = this.f42778r) != null) {
            exchange.d();
        }
        this.f42773m = null;
    }

    public final OkHttpClient l() {
        return this.f42762b;
    }

    public final RealConnection m() {
        return this.f42771k;
    }

    public final EventListener n() {
        return this.f42766f;
    }

    public final Exchange o() {
        return this.f42773m;
    }

    public final Response p() {
        ArrayList arrayList = new ArrayList();
        CollectionsKt.addAll(arrayList, this.f42762b.x());
        arrayList.add(new RetryAndFollowUpInterceptor(this.f42762b));
        arrayList.add(new BridgeInterceptor(this.f42762b.p()));
        arrayList.add(new CacheInterceptor(this.f42762b.j()));
        arrayList.add(ConnectInterceptor.f42729a);
        if (!this.f42764d) {
            CollectionsKt.addAll(arrayList, this.f42762b.y());
        }
        arrayList.add(new CallServerInterceptor(this.f42764d));
        boolean z4 = false;
        try {
            try {
                Response a4 = new RealInterceptorChain(this, arrayList, 0, null, this.f42763c, this.f42762b.m(), this.f42762b.E(), this.f42762b.J()).a(this.f42763c);
                if (r()) {
                    Util.l(a4);
                    throw new IOException("Canceled");
                }
                t(null);
                return a4;
            } catch (IOException e4) {
                z4 = true;
                IOException t4 = t(e4);
                Intrinsics.checkNotNull(t4, "null cannot be cast to non-null type kotlin.Throwable");
                throw t4;
            }
        } catch (Throwable th) {
            if (!z4) {
                t(null);
            }
            throw th;
        }
    }

    public final Exchange q(RealInterceptorChain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        synchronized (this) {
            if (!this.f42776p) {
                throw new IllegalStateException("released");
            }
            if (this.f42775o) {
                throw new IllegalStateException("Check failed.");
            }
            if (this.f42774n) {
                throw new IllegalStateException("Check failed.");
            }
            Unit unit = Unit.f41027a;
        }
        ExchangeFinder exchangeFinder = this.f42770j;
        Intrinsics.checkNotNull(exchangeFinder);
        Exchange exchange = new Exchange(this, this.f42766f, exchangeFinder, exchangeFinder.a(this.f42762b, chain));
        this.f42773m = exchange;
        this.f42778r = exchange;
        synchronized (this) {
            this.f42774n = true;
            this.f42775o = true;
        }
        if (this.f42777q) {
            throw new IOException("Canceled");
        }
        return exchange;
    }

    public boolean r() {
        return this.f42777q;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:42:0x0012, B:10:0x0021, B:12:0x0025, B:13:0x0027, B:15:0x002c, B:19:0x0035, B:21:0x0039, B:25:0x0042, B:7:0x001b), top: B:41:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0025 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:42:0x0012, B:10:0x0021, B:12:0x0025, B:13:0x0027, B:15:0x002c, B:19:0x0035, B:21:0x0039, B:25:0x0042, B:7:0x001b), top: B:41:0x0012 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final IOException s(Exchange exchange, boolean z4, boolean z5, IOException iOException) {
        boolean z6;
        boolean z7;
        boolean z8;
        Intrinsics.checkNotNullParameter(exchange, "exchange");
        if (Intrinsics.areEqual(exchange, this.f42778r)) {
            synchronized (this) {
                z6 = false;
                if (z4) {
                    try {
                        if (!this.f42774n) {
                        }
                        if (z4) {
                            this.f42774n = false;
                        }
                        if (z5) {
                            this.f42775o = false;
                        }
                        z8 = this.f42774n;
                        boolean z9 = z8 && !this.f42775o;
                        if (!z8 && !this.f42775o && !this.f42776p) {
                            z6 = true;
                        }
                        z7 = z6;
                        z6 = z9;
                        Unit unit = Unit.f41027a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (!z5 || !this.f42775o) {
                    z7 = false;
                    Unit unit2 = Unit.f41027a;
                }
                if (z4) {
                }
                if (z5) {
                }
                z8 = this.f42774n;
                if (z8) {
                }
                if (!z8) {
                    z6 = true;
                }
                z7 = z6;
                z6 = z9;
                Unit unit22 = Unit.f41027a;
            }
            if (z6) {
                this.f42778r = null;
                RealConnection realConnection = this.f42771k;
                if (realConnection != null) {
                    realConnection.s();
                }
            }
            if (z7) {
                return d(iOException);
            }
        }
        return iOException;
    }

    public final IOException t(IOException iOException) {
        boolean z4;
        synchronized (this) {
            try {
                z4 = false;
                if (this.f42776p) {
                    this.f42776p = false;
                    if (!this.f42774n && !this.f42775o) {
                        z4 = true;
                    }
                }
                Unit unit = Unit.f41027a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z4 ? d(iOException) : iOException;
    }

    public final String u() {
        return this.f42763c.j().n();
    }

    public final Socket v() {
        RealConnection realConnection = this.f42771k;
        Intrinsics.checkNotNull(realConnection);
        if (Util.f42596h && !Thread.holdsLock(realConnection)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + realConnection);
        }
        List n4 = realConnection.n();
        Iterator it = n4.iterator();
        int i4 = 0;
        while (true) {
            if (!it.hasNext()) {
                i4 = -1;
                break;
            }
            if (Intrinsics.areEqual(((Reference) it.next()).get(), this)) {
                break;
            }
            i4++;
        }
        if (i4 == -1) {
            throw new IllegalStateException("Check failed.");
        }
        n4.remove(i4);
        this.f42771k = null;
        if (n4.isEmpty()) {
            realConnection.C(System.nanoTime());
            if (this.f42765e.c(realConnection)) {
                return realConnection.E();
            }
        }
        return null;
    }

    public final boolean w() {
        ExchangeFinder exchangeFinder = this.f42770j;
        Intrinsics.checkNotNull(exchangeFinder);
        return exchangeFinder.e();
    }

    public final void x(RealConnection realConnection) {
        this.f42779s = realConnection;
    }

    public final void y() {
        if (this.f42772l) {
            throw new IllegalStateException("Check failed.");
        }
        this.f42772l = true;
        exit();
    }
}
