package okhttp3.internal.connection;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.Route;
import okhttp3.internal.Util;

@Metadata
/* loaded from: classes3.dex */
public final class RouteSelector {

    /* renamed from: i, reason: collision with root package name */
    public static final Companion f42819i = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final Address f42820a;

    /* renamed from: b, reason: collision with root package name */
    private final RouteDatabase f42821b;

    /* renamed from: c, reason: collision with root package name */
    private final Call f42822c;

    /* renamed from: d, reason: collision with root package name */
    private final EventListener f42823d;

    /* renamed from: e, reason: collision with root package name */
    private List f42824e;

    /* renamed from: f, reason: collision with root package name */
    private int f42825f;

    /* renamed from: g, reason: collision with root package name */
    private List f42826g;

    /* renamed from: h, reason: collision with root package name */
    private final List f42827h;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(InetSocketAddress inetSocketAddress) {
            Intrinsics.checkNotNullParameter(inetSocketAddress, "<this>");
            InetAddress address = inetSocketAddress.getAddress();
            if (address == null) {
                String hostName = inetSocketAddress.getHostName();
                Intrinsics.checkNotNullExpressionValue(hostName, "hostName");
                return hostName;
            }
            String hostAddress = address.getHostAddress();
            Intrinsics.checkNotNullExpressionValue(hostAddress, "address.hostAddress");
            return hostAddress;
        }

        private Companion() {
        }
    }

    @Metadata
    public static final class Selection {

        /* renamed from: a, reason: collision with root package name */
        private final List f42828a;

        /* renamed from: b, reason: collision with root package name */
        private int f42829b;

        public Selection(List routes) {
            Intrinsics.checkNotNullParameter(routes, "routes");
            this.f42828a = routes;
        }

        public final List a() {
            return this.f42828a;
        }

        public final boolean b() {
            return this.f42829b < this.f42828a.size();
        }

        public final Route c() {
            if (!b()) {
                throw new NoSuchElementException();
            }
            List list = this.f42828a;
            int i4 = this.f42829b;
            this.f42829b = i4 + 1;
            return (Route) list.get(i4);
        }
    }

    public RouteSelector(Address address, RouteDatabase routeDatabase, Call call, EventListener eventListener) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(routeDatabase, "routeDatabase");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        this.f42820a = address;
        this.f42821b = routeDatabase;
        this.f42822c = call;
        this.f42823d = eventListener;
        this.f42824e = CollectionsKt.emptyList();
        this.f42826g = CollectionsKt.emptyList();
        this.f42827h = new ArrayList();
        f(address.l(), address.g());
    }

    private final boolean b() {
        return this.f42825f < this.f42824e.size();
    }

    private final Proxy d() {
        if (b()) {
            List list = this.f42824e;
            int i4 = this.f42825f;
            this.f42825f = i4 + 1;
            Proxy proxy = (Proxy) list.get(i4);
            e(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f42820a.l().h() + "; exhausted proxy configurations: " + this.f42824e);
    }

    private final void e(Proxy proxy) {
        String h4;
        int l4;
        List a4;
        ArrayList arrayList = new ArrayList();
        this.f42826g = arrayList;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            h4 = this.f42820a.l().h();
            l4 = this.f42820a.l().l();
        } else {
            SocketAddress proxyAddress = proxy.address();
            if (!(proxyAddress instanceof InetSocketAddress)) {
                throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + proxyAddress.getClass()).toString());
            }
            Companion companion = f42819i;
            Intrinsics.checkNotNullExpressionValue(proxyAddress, "proxyAddress");
            InetSocketAddress inetSocketAddress = (InetSocketAddress) proxyAddress;
            h4 = companion.a(inetSocketAddress);
            l4 = inetSocketAddress.getPort();
        }
        if (1 > l4 || l4 >= 65536) {
            throw new SocketException("No route to " + h4 + ':' + l4 + "; port is out of range");
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            arrayList.add(InetSocketAddress.createUnresolved(h4, l4));
            return;
        }
        if (Util.i(h4)) {
            a4 = CollectionsKt.listOf(InetAddress.getByName(h4));
        } else {
            this.f42823d.n(this.f42822c, h4);
            a4 = this.f42820a.c().a(h4);
            if (a4.isEmpty()) {
                throw new UnknownHostException(this.f42820a.c() + " returned no addresses for " + h4);
            }
            this.f42823d.m(this.f42822c, h4, a4);
        }
        Iterator it = a4.iterator();
        while (it.hasNext()) {
            arrayList.add(new InetSocketAddress((InetAddress) it.next(), l4));
        }
    }

    private final void f(HttpUrl httpUrl, Proxy proxy) {
        this.f42823d.p(this.f42822c, httpUrl);
        List g4 = g(proxy, httpUrl, this);
        this.f42824e = g4;
        this.f42825f = 0;
        this.f42823d.o(this.f42822c, httpUrl, g4);
    }

    private static final List g(Proxy proxy, HttpUrl httpUrl, RouteSelector routeSelector) {
        if (proxy != null) {
            return CollectionsKt.listOf(proxy);
        }
        URI q4 = httpUrl.q();
        if (q4.getHost() == null) {
            return Util.v(Proxy.NO_PROXY);
        }
        List<Proxy> proxiesOrNull = routeSelector.f42820a.i().select(q4);
        List<Proxy> list = proxiesOrNull;
        if (list == null || list.isEmpty()) {
            return Util.v(Proxy.NO_PROXY);
        }
        Intrinsics.checkNotNullExpressionValue(proxiesOrNull, "proxiesOrNull");
        return Util.U(proxiesOrNull);
    }

    public final boolean a() {
        return b() || !this.f42827h.isEmpty();
    }

    public final Selection c() {
        if (!a()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (b()) {
            Proxy d4 = d();
            Iterator it = this.f42826g.iterator();
            while (it.hasNext()) {
                Route route = new Route(this.f42820a, d4, (InetSocketAddress) it.next());
                if (this.f42821b.c(route)) {
                    this.f42827h.add(route);
                } else {
                    arrayList.add(route);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            CollectionsKt.addAll(arrayList, this.f42827h);
            this.f42827h.clear();
        }
        return new Selection(arrayList);
    }
}
