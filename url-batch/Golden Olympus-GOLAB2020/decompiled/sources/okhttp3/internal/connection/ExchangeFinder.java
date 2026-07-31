package okhttp3.internal.connection;

import com.ironsource.jn;
import java.io.IOException;
import java.net.Socket;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Address;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RouteSelector;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;

@Metadata
/* loaded from: classes3.dex */
public final class ExchangeFinder {

    /* renamed from: a, reason: collision with root package name */
    private final RealConnectionPool f42752a;

    /* renamed from: b, reason: collision with root package name */
    private final Address f42753b;

    /* renamed from: c, reason: collision with root package name */
    private final RealCall f42754c;

    /* renamed from: d, reason: collision with root package name */
    private final EventListener f42755d;

    /* renamed from: e, reason: collision with root package name */
    private RouteSelector.Selection f42756e;

    /* renamed from: f, reason: collision with root package name */
    private RouteSelector f42757f;

    /* renamed from: g, reason: collision with root package name */
    private int f42758g;

    /* renamed from: h, reason: collision with root package name */
    private int f42759h;

    /* renamed from: i, reason: collision with root package name */
    private int f42760i;

    /* renamed from: j, reason: collision with root package name */
    private Route f42761j;

    public ExchangeFinder(RealConnectionPool connectionPool, Address address, RealCall call, EventListener eventListener) {
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        this.f42752a = connectionPool;
        this.f42753b = address;
        this.f42754c = call;
        this.f42755d = eventListener;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final RealConnection b(int i4, int i5, int i6, int i7, boolean z4) {
        List a4;
        Socket v4;
        if (this.f42754c.r()) {
            throw new IOException("Canceled");
        }
        RealConnection m4 = this.f42754c.m();
        if (m4 != null) {
            synchronized (m4) {
                try {
                    if (!m4.p() && g(m4.A().a().l())) {
                        v4 = null;
                        Unit unit = Unit.f41027a;
                    }
                    v4 = this.f42754c.v();
                    Unit unit2 = Unit.f41027a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f42754c.m() != null) {
                if (v4 == null) {
                    return m4;
                }
                throw new IllegalStateException("Check failed.");
            }
            if (v4 != null) {
                Util.m(v4);
            }
            this.f42755d.l(this.f42754c, m4);
        }
        this.f42758g = 0;
        this.f42759h = 0;
        this.f42760i = 0;
        if (this.f42752a.a(this.f42753b, this.f42754c, null, false)) {
            RealConnection m5 = this.f42754c.m();
            Intrinsics.checkNotNull(m5);
            this.f42755d.k(this.f42754c, m5);
            return m5;
        }
        Route route = this.f42761j;
        try {
            if (route == null) {
                RouteSelector.Selection selection = this.f42756e;
                if (selection != null) {
                    Intrinsics.checkNotNull(selection);
                    if (selection.b()) {
                        RouteSelector.Selection selection2 = this.f42756e;
                        Intrinsics.checkNotNull(selection2);
                        route = selection2.c();
                    }
                }
                RouteSelector routeSelector = this.f42757f;
                if (routeSelector == null) {
                    routeSelector = new RouteSelector(this.f42753b, this.f42754c.l().v(), this.f42754c, this.f42755d);
                    this.f42757f = routeSelector;
                }
                RouteSelector.Selection c4 = routeSelector.c();
                this.f42756e = c4;
                a4 = c4.a();
                if (this.f42754c.r()) {
                    throw new IOException("Canceled");
                }
                if (this.f42752a.a(this.f42753b, this.f42754c, a4, false)) {
                    RealConnection m6 = this.f42754c.m();
                    Intrinsics.checkNotNull(m6);
                    this.f42755d.k(this.f42754c, m6);
                    return m6;
                }
                route = c4.c();
                RealConnection realConnection = new RealConnection(this.f42752a, route);
                this.f42754c.x(realConnection);
                realConnection.f(i4, i5, i6, i7, z4, this.f42754c, this.f42755d);
                this.f42754c.x(null);
                this.f42754c.l().v().a(realConnection.A());
                if (this.f42752a.a(this.f42753b, this.f42754c, a4, true)) {
                    synchronized (realConnection) {
                        this.f42752a.e(realConnection);
                        this.f42754c.c(realConnection);
                        Unit unit3 = Unit.f41027a;
                    }
                    this.f42755d.k(this.f42754c, realConnection);
                    return realConnection;
                }
                RealConnection m7 = this.f42754c.m();
                Intrinsics.checkNotNull(m7);
                this.f42761j = route;
                Util.m(realConnection.E());
                this.f42755d.k(this.f42754c, m7);
                return m7;
            }
            Intrinsics.checkNotNull(route);
            this.f42761j = null;
            realConnection.f(i4, i5, i6, i7, z4, this.f42754c, this.f42755d);
            this.f42754c.x(null);
            this.f42754c.l().v().a(realConnection.A());
            if (this.f42752a.a(this.f42753b, this.f42754c, a4, true)) {
            }
        } catch (Throwable th2) {
            this.f42754c.x(null);
            throw th2;
        }
        a4 = null;
        RealConnection realConnection2 = new RealConnection(this.f42752a, route);
        this.f42754c.x(realConnection2);
    }

    private final RealConnection c(int i4, int i5, int i6, int i7, boolean z4, boolean z5) {
        while (true) {
            RealConnection b4 = b(i4, i5, i6, i7, z4);
            boolean z6 = z4;
            int i8 = i7;
            int i9 = i6;
            int i10 = i5;
            int i11 = i4;
            if (b4.u(z5)) {
                return b4;
            }
            b4.z();
            if (this.f42761j == null) {
                RouteSelector.Selection selection = this.f42756e;
                if (selection != null ? selection.b() : true) {
                    continue;
                } else {
                    RouteSelector routeSelector = this.f42757f;
                    if (!(routeSelector != null ? routeSelector.a() : true)) {
                        throw new IOException("exhausted all routes");
                    }
                }
            }
            i4 = i11;
            i5 = i10;
            i6 = i9;
            i7 = i8;
            z4 = z6;
        }
    }

    private final Route f() {
        RealConnection m4;
        if (this.f42758g > 1 || this.f42759h > 1 || this.f42760i > 0 || (m4 = this.f42754c.m()) == null) {
            return null;
        }
        synchronized (m4) {
            if (m4.q() != 0) {
                return null;
            }
            if (Util.j(m4.A().a().l(), this.f42753b.l())) {
                return m4.A();
            }
            return null;
        }
    }

    public final ExchangeCodec a(OkHttpClient client, RealInterceptorChain chain) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(chain, "chain");
        try {
        } catch (IOException e4) {
            e = e4;
        } catch (RouteException e5) {
            e = e5;
        }
        try {
            return c(chain.f(), chain.h(), chain.j(), client.z(), client.F(), !Intrinsics.areEqual(chain.i().h(), jn.f16864a)).w(client, chain);
        } catch (IOException e6) {
            e = e6;
            IOException iOException = e;
            h(iOException);
            throw new RouteException(iOException);
        } catch (RouteException e7) {
            e = e7;
            RouteException routeException = e;
            h(routeException.d());
            throw routeException;
        }
    }

    public final Address d() {
        return this.f42753b;
    }

    public final boolean e() {
        RouteSelector routeSelector;
        if (this.f42758g == 0 && this.f42759h == 0 && this.f42760i == 0) {
            return false;
        }
        if (this.f42761j != null) {
            return true;
        }
        Route f4 = f();
        if (f4 != null) {
            this.f42761j = f4;
            return true;
        }
        RouteSelector.Selection selection = this.f42756e;
        if ((selection == null || !selection.b()) && (routeSelector = this.f42757f) != null) {
            return routeSelector.a();
        }
        return true;
    }

    public final boolean g(HttpUrl url) {
        Intrinsics.checkNotNullParameter(url, "url");
        HttpUrl l4 = this.f42753b.l();
        return url.l() == l4.l() && Intrinsics.areEqual(url.h(), l4.h());
    }

    public final void h(IOException e4) {
        Intrinsics.checkNotNullParameter(e4, "e");
        this.f42761j = null;
        if ((e4 instanceof StreamResetException) && ((StreamResetException) e4).f43086b == ErrorCode.REFUSED_STREAM) {
            this.f42758g++;
        } else if (e4 instanceof ConnectionShutdownException) {
            this.f42759h++;
        } else {
            this.f42760i++;
        }
    }
}
