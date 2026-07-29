package b.a.b;

import b.ae;
import b.t;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: RouteSelector.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final b.a f1844a;

    /* renamed from: b, reason: collision with root package name */
    private final d f1845b;

    /* renamed from: c, reason: collision with root package name */
    private Proxy f1846c;

    /* renamed from: d, reason: collision with root package name */
    private InetSocketAddress f1847d;
    private int f;
    private int h;
    private List<Proxy> e = Collections.emptyList();
    private List<InetSocketAddress> g = Collections.emptyList();
    private final List<ae> i = new ArrayList();

    public f(b.a aVar, d dVar) {
        this.f1844a = aVar;
        this.f1845b = dVar;
        a(aVar.a(), aVar.h());
    }

    public boolean a() {
        return e() || c() || g();
    }

    public ae b() throws IOException {
        if (!e()) {
            if (!c()) {
                if (!g()) {
                    throw new NoSuchElementException();
                }
                return h();
            }
            this.f1846c = d();
        }
        this.f1847d = f();
        ae aeVar = new ae(this.f1844a, this.f1846c, this.f1847d);
        if (!this.f1845b.c(aeVar)) {
            return aeVar;
        }
        this.i.add(aeVar);
        return b();
    }

    public void a(ae aeVar, IOException iOException) {
        if (aeVar.b().type() != Proxy.Type.DIRECT && this.f1844a.g() != null) {
            this.f1844a.g().connectFailed(this.f1844a.a().a(), aeVar.b().address(), iOException);
        }
        this.f1845b.a(aeVar);
    }

    private void a(t tVar, Proxy proxy) {
        List<Proxy> a2;
        if (proxy != null) {
            this.e = Collections.singletonList(proxy);
        } else {
            List<Proxy> select = this.f1844a.g().select(tVar.a());
            if (select != null && !select.isEmpty()) {
                a2 = b.a.c.a(select);
            } else {
                a2 = b.a.c.a(Proxy.NO_PROXY);
            }
            this.e = a2;
        }
        this.f = 0;
    }

    private boolean c() {
        return this.f < this.e.size();
    }

    private Proxy d() throws IOException {
        if (!c()) {
            throw new SocketException("No route to " + this.f1844a.a().f() + "; exhausted proxy configurations: " + this.e);
        }
        List<Proxy> list = this.e;
        int i = this.f;
        this.f = i + 1;
        Proxy proxy = list.get(i);
        a(proxy);
        return proxy;
    }

    private void a(Proxy proxy) throws IOException {
        String f;
        int g;
        this.g = new ArrayList();
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            f = this.f1844a.a().f();
            g = this.f1844a.a().g();
        } else {
            SocketAddress address = proxy.address();
            if (!(address instanceof InetSocketAddress)) {
                throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + address.getClass());
            }
            InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
            f = a(inetSocketAddress);
            g = inetSocketAddress.getPort();
        }
        if (g < 1 || g > 65535) {
            throw new SocketException("No route to " + f + ":" + g + "; port is out of range");
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            this.g.add(InetSocketAddress.createUnresolved(f, g));
        } else {
            List<InetAddress> a2 = this.f1844a.b().a(f);
            int size = a2.size();
            for (int i = 0; i < size; i++) {
                this.g.add(new InetSocketAddress(a2.get(i), g));
            }
        }
        this.h = 0;
    }

    static String a(InetSocketAddress inetSocketAddress) {
        InetAddress address = inetSocketAddress.getAddress();
        if (address == null) {
            return inetSocketAddress.getHostName();
        }
        return address.getHostAddress();
    }

    private boolean e() {
        return this.h < this.g.size();
    }

    private InetSocketAddress f() throws IOException {
        if (!e()) {
            throw new SocketException("No route to " + this.f1844a.a().f() + "; exhausted inet socket addresses: " + this.g);
        }
        List<InetSocketAddress> list = this.g;
        int i = this.h;
        this.h = i + 1;
        return list.get(i);
    }

    private boolean g() {
        return !this.i.isEmpty();
    }

    private ae h() {
        return this.i.remove(0);
    }
}
