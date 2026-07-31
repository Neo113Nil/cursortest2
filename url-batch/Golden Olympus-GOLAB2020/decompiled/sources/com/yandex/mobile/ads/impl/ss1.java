package com.yandex.mobile.ads.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
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
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ss1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2202ra f31935a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final qs1 f31936b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final wm f31937c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final m50 f31938d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private List<? extends Proxy> f31939e;

    /* renamed from: f, reason: collision with root package name */
    private int f31940f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private List<? extends InetSocketAddress> f31941g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final ArrayList f31942h;

    public static final class a {
        @NotNull
        public static String a(@NotNull InetSocketAddress inetSocketAddress) {
            Intrinsics.checkNotNullParameter(inetSocketAddress, "<this>");
            InetAddress address = inetSocketAddress.getAddress();
            if (address == null) {
                String hostName = inetSocketAddress.getHostName();
                Intrinsics.checkNotNullExpressionValue(hostName, "getHostName(...)");
                return hostName;
            }
            String hostAddress = address.getHostAddress();
            Intrinsics.checkNotNullExpressionValue(hostAddress, "getHostAddress(...)");
            return hostAddress;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final List<ps1> f31943a;

        /* renamed from: b, reason: collision with root package name */
        private int f31944b;

        public b(@NotNull ArrayList routes) {
            Intrinsics.checkNotNullParameter(routes, "routes");
            this.f31943a = routes;
        }

        @NotNull
        public final List<ps1> a() {
            return this.f31943a;
        }

        public final boolean b() {
            return this.f31944b < this.f31943a.size();
        }

        @NotNull
        public final ps1 c() {
            if (!b()) {
                throw new NoSuchElementException();
            }
            List<ps1> list = this.f31943a;
            int i4 = this.f31944b;
            this.f31944b = i4 + 1;
            return list.get(i4);
        }
    }

    public ss1(@NotNull C2202ra address, @NotNull qs1 routeDatabase, @NotNull tn1 call, @NotNull m50 eventListener) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(routeDatabase, "routeDatabase");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        this.f31935a = address;
        this.f31936b = routeDatabase;
        this.f31937c = call;
        this.f31938d = eventListener;
        this.f31939e = CollectionsKt.emptyList();
        this.f31941g = CollectionsKt.emptyList();
        this.f31942h = new ArrayList();
        a(address.k(), address.f());
    }

    private final Proxy c() {
        if (this.f31940f < this.f31939e.size()) {
            List<? extends Proxy> list = this.f31939e;
            int i4 = this.f31940f;
            this.f31940f = i4 + 1;
            Proxy proxy = list.get(i4);
            a(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f31935a.k().g() + "; exhausted proxy configurations: " + this.f31939e);
    }

    public final boolean a() {
        return this.f31940f < this.f31939e.size() || !this.f31942h.isEmpty();
    }

    @NotNull
    public final b b() {
        if (!a()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (this.f31940f < this.f31939e.size()) {
            Proxy c4 = c();
            Iterator<? extends InetSocketAddress> it = this.f31941g.iterator();
            while (it.hasNext()) {
                ps1 ps1Var = new ps1(this.f31935a, c4, it.next());
                if (this.f31936b.c(ps1Var)) {
                    this.f31942h.add(ps1Var);
                } else {
                    arrayList.add(ps1Var);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            CollectionsKt.addAll(arrayList, this.f31942h);
            this.f31942h.clear();
        }
        return new b(arrayList);
    }

    private final void a(Proxy proxy) {
        String g4;
        int i4;
        ArrayList arrayList = new ArrayList();
        this.f31941g = arrayList;
        if (proxy.type() != Proxy.Type.DIRECT && proxy.type() != Proxy.Type.SOCKS) {
            SocketAddress address = proxy.address();
            if (address instanceof InetSocketAddress) {
                Intrinsics.checkNotNull(address);
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                g4 = a.a(inetSocketAddress);
                i4 = inetSocketAddress.getPort();
            } else {
                throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + address.getClass()).toString());
            }
        } else {
            g4 = this.f31935a.k().g();
            i4 = this.f31935a.k().i();
        }
        if (1 <= i4 && i4 < 65536) {
            if (proxy.type() == Proxy.Type.SOCKS) {
                arrayList.add(InetSocketAddress.createUnresolved(g4, i4));
                return;
            }
            m50 m50Var = this.f31938d;
            wm wmVar = this.f31937c;
            m50Var.getClass();
            m50.a(wmVar, g4);
            List<InetAddress> a4 = this.f31935a.c().a(g4);
            if (!a4.isEmpty()) {
                m50 m50Var2 = this.f31938d;
                wm wmVar2 = this.f31937c;
                m50Var2.getClass();
                m50.a(wmVar2, g4, a4);
                Iterator<InetAddress> it = a4.iterator();
                while (it.hasNext()) {
                    arrayList.add(new InetSocketAddress(it.next(), i4));
                }
                return;
            }
            throw new UnknownHostException(this.f31935a.c() + " returned no addresses for " + g4);
        }
        throw new SocketException("No route to " + g4 + StringUtils.PROCESS_POSTFIX_DELIMITER + i4 + "; port is out of range");
    }

    private final void a(mh0 url, Proxy proxy) {
        List<? extends Proxy> proxies;
        m50 m50Var = this.f31938d;
        wm call = this.f31937c;
        m50Var.getClass();
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(url, "url");
        if (proxy != null) {
            proxies = CollectionsKt.listOf(proxy);
        } else {
            URI l4 = url.l();
            if (l4.getHost() == null) {
                proxies = v82.a(Proxy.NO_PROXY);
            } else {
                List<Proxy> select = this.f31935a.h().select(l4);
                if (select != null && !select.isEmpty()) {
                    Intrinsics.checkNotNull(select);
                    proxies = v82.b(select);
                } else {
                    proxies = v82.a(Proxy.NO_PROXY);
                }
            }
        }
        this.f31939e = proxies;
        this.f31940f = 0;
        m50 m50Var2 = this.f31938d;
        wm call2 = this.f31937c;
        m50Var2.getClass();
        Intrinsics.checkNotNullParameter(call2, "call");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(proxies, "proxies");
    }
}
