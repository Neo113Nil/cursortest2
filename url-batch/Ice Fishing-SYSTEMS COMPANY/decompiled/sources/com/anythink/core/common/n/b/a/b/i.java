package com.anythink.core.common.n.b.a.b;

import com.anythink.core.common.n.b.C0545a;
import com.anythink.core.common.n.b.ah;
import com.anythink.core.common.n.b.r;
import com.anythink.core.common.n.b.v;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class i {

    /* renamed from: a, reason: collision with root package name */
    private final C0545a f15167a;

    /* renamed from: b, reason: collision with root package name */
    private final g f15168b;

    /* renamed from: c, reason: collision with root package name */
    private final com.anythink.core.common.n.b.e f15169c;

    /* renamed from: d, reason: collision with root package name */
    private final r f15170d;

    /* renamed from: e, reason: collision with root package name */
    private List<Proxy> f15171e;

    /* renamed from: f, reason: collision with root package name */
    private int f15172f;

    /* renamed from: g, reason: collision with root package name */
    private List<InetSocketAddress> f15173g;

    /* renamed from: h, reason: collision with root package name */
    private final List<ah> f15174h;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List<ah> f15175a;

        /* renamed from: b, reason: collision with root package name */
        private int f15176b = 0;

        public a(List<ah> list) {
            this.f15175a = list;
        }

        public final boolean a() {
            return this.f15176b < this.f15175a.size();
        }

        public final ah b() {
            if (!a()) {
                throw new NoSuchElementException();
            }
            List<ah> list = this.f15175a;
            int i = this.f15176b;
            this.f15176b = i + 1;
            return list.get(i);
        }

        public final List<ah> c() {
            return new ArrayList(this.f15175a);
        }
    }

    public i(C0545a c0545a, g gVar, com.anythink.core.common.n.b.e eVar, r rVar) {
        List<Proxy> a9;
        List list = Collections.EMPTY_LIST;
        this.f15171e = list;
        this.f15173g = list;
        this.f15174h = new ArrayList();
        this.f15167a = c0545a;
        this.f15168b = gVar;
        this.f15169c = eVar;
        this.f15170d = rVar;
        v a10 = c0545a.a();
        Proxy h9 = c0545a.h();
        if (h9 != null) {
            a9 = Collections.singletonList(h9);
        } else {
            List<Proxy> select = c0545a.g().select(a10.a());
            a9 = (select == null || select.isEmpty()) ? com.anythink.core.common.n.b.a.c.a(Proxy.NO_PROXY) : com.anythink.core.common.n.b.a.c.a(select);
        }
        this.f15171e = a9;
        this.f15172f = 0;
    }

    private boolean c() {
        return this.f15172f < this.f15171e.size();
    }

    private Proxy d() {
        if (!c()) {
            throw new SocketException("No route to " + this.f15167a.a().f() + "; exhausted proxy configurations: " + this.f15171e);
        }
        List<Proxy> list = this.f15171e;
        int i = this.f15172f;
        this.f15172f = i + 1;
        Proxy proxy = list.get(i);
        a(proxy);
        return proxy;
    }

    public final boolean a() {
        return c() || !this.f15174h.isEmpty();
    }

    public final a b() {
        if (!a()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (c()) {
            if (!c()) {
                throw new SocketException("No route to " + this.f15167a.a().f() + "; exhausted proxy configurations: " + this.f15171e);
            }
            List<Proxy> list = this.f15171e;
            int i = this.f15172f;
            this.f15172f = i + 1;
            Proxy proxy = list.get(i);
            a(proxy);
            int size = this.f15173g.size();
            for (int i4 = 0; i4 < size; i4++) {
                ah ahVar = new ah(this.f15167a, proxy, this.f15173g.get(i4));
                if (this.f15168b.c(ahVar)) {
                    this.f15174h.add(ahVar);
                } else {
                    arrayList.add(ahVar);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.addAll(this.f15174h);
            this.f15174h.clear();
        }
        return new a(arrayList);
    }

    private void a(v vVar, Proxy proxy) {
        List<Proxy> a9;
        if (proxy != null) {
            a9 = Collections.singletonList(proxy);
        } else {
            List<Proxy> select = this.f15167a.g().select(vVar.a());
            a9 = (select == null || select.isEmpty()) ? com.anythink.core.common.n.b.a.c.a(Proxy.NO_PROXY) : com.anythink.core.common.n.b.a.c.a(select);
        }
        this.f15171e = a9;
        this.f15172f = 0;
    }

    private void a(Proxy proxy) {
        String f6;
        int g9;
        this.f15173g = new ArrayList();
        if (proxy.type() != Proxy.Type.DIRECT && proxy.type() != Proxy.Type.SOCKS) {
            SocketAddress address = proxy.address();
            if (address instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                InetAddress address2 = inetSocketAddress.getAddress();
                if (address2 == null) {
                    f6 = inetSocketAddress.getHostName();
                } else {
                    f6 = address2.getHostAddress();
                }
                g9 = inetSocketAddress.getPort();
            } else {
                throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + address.getClass());
            }
        } else {
            f6 = this.f15167a.a().f();
            g9 = this.f15167a.a().g();
        }
        if (g9 > 0 && g9 <= 65535) {
            if (proxy.type() == Proxy.Type.SOCKS) {
                this.f15173g.add(InetSocketAddress.createUnresolved(f6, g9));
                return;
            }
            List<InetAddress> lookup = this.f15167a.b().lookup(f6);
            if (!lookup.isEmpty()) {
                int size = lookup.size();
                for (int i = 0; i < size; i++) {
                    this.f15173g.add(new InetSocketAddress(lookup.get(i), g9));
                }
                return;
            }
            throw new UnknownHostException(this.f15167a.b() + " returned no addresses for " + f6);
        }
        throw new SocketException("No route to " + f6 + ":" + g9 + "; port is out of range");
    }

    private static String a(InetSocketAddress inetSocketAddress) {
        InetAddress address = inetSocketAddress.getAddress();
        if (address == null) {
            return inetSocketAddress.getHostName();
        }
        return address.getHostAddress();
    }
}
