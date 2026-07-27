package p2;

import A.AbstractC0017m;
import B1.C0097d;
import E1.i;
import G1.j;
import android.net.SSLCertificateSocketFactory;
import android.net.SSLSessionCache;
import android.util.Base64;
import e2.C0560b;
import e2.q;
import e2.r;
import java.io.File;
import java.io.IOException;
import java.net.Socket;
import java.net.URI;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocket;
import l.AbstractC0784j;
import y.t;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: l, reason: collision with root package name */
    public static final AtomicInteger f9088l = new AtomicInteger(0);

    /* renamed from: m, reason: collision with root package name */
    public static final Charset f9089m = Charset.forName("UTF-8");

    /* renamed from: n, reason: collision with root package name */
    public static final ThreadFactory f9090n = Executors.defaultThreadFactory();

    /* renamed from: o, reason: collision with root package name */
    public static final i f9091o = new i(19);

    /* renamed from: a, reason: collision with root package name */
    public volatile int f9092a = 1;

    /* renamed from: b, reason: collision with root package name */
    public volatile Socket f9093b = null;

    /* renamed from: c, reason: collision with root package name */
    public t f9094c = null;

    /* renamed from: d, reason: collision with root package name */
    public final URI f9095d;

    /* renamed from: e, reason: collision with root package name */
    public final String f9096e;

    /* renamed from: f, reason: collision with root package name */
    public final g f9097f;

    /* renamed from: g, reason: collision with root package name */
    public final h f9098g;

    /* renamed from: h, reason: collision with root package name */
    public final C0097d f9099h;

    /* renamed from: i, reason: collision with root package name */
    public final C0097d f9100i;

    /* renamed from: j, reason: collision with root package name */
    public final int f9101j;

    /* renamed from: k, reason: collision with root package name */
    public final Thread f9102k;

    public e(C0560b c0560b, URI uri, HashMap hashMap) {
        int incrementAndGet = f9088l.incrementAndGet();
        this.f9101j = incrementAndGet;
        this.f9102k = f9090n.newThread(new j(6, this));
        this.f9095d = uri;
        this.f9096e = c0560b.f6176g;
        this.f9100i = new C0097d(c0560b.f6173d, "WebSocket", AbstractC0017m.g(incrementAndGet, "sk_"), 18);
        C0097d c0097d = new C0097d(20, false);
        c0097d.f988i = null;
        c0097d.f987e = uri;
        c0097d.f989j = hashMap;
        byte[] bArr = new byte[16];
        for (int i2 = 0; i2 < 16; i2++) {
            bArr[i2] = (byte) ((Math.random() * 255) + 0);
        }
        c0097d.f988i = Base64.encodeToString(bArr, 2);
        this.f9099h = c0097d;
        g gVar = new g();
        gVar.f9103a = null;
        gVar.f9104b = null;
        gVar.f9105c = null;
        gVar.f9106d = new byte[112];
        gVar.f9108f = false;
        gVar.f9104b = this;
        this.f9097f = gVar;
        this.f9098g = new h(this, this.f9101j);
    }

    public final synchronized void a() {
        int d4 = AbstractC0784j.d(this.f9092a);
        if (d4 == 0) {
            this.f9092a = 5;
            return;
        }
        if (d4 == 1) {
            b();
            return;
        }
        if (d4 != 2) {
            if (d4 != 3) {
                if (d4 != 4) {
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        try {
            this.f9092a = 4;
            this.f9098g.f9111c = true;
            this.f9098g.b((byte) 8, new byte[0]);
        } catch (IOException e4) {
            this.f9094c.r(new f("Failed to send close frame", e4));
        }
    }

    public final synchronized void b() {
        if (this.f9092a == 5) {
            return;
        }
        this.f9097f.f9108f = true;
        this.f9098g.f9111c = true;
        if (this.f9093b != null) {
            try {
                this.f9093b.close();
            } catch (Exception e4) {
                this.f9094c.r(new f("Failed to close", e4));
            }
        }
        this.f9092a = 5;
        t tVar = this.f9094c;
        ((r) tVar.f11495i).f6254i.execute(new q(tVar, 1));
    }

    public final synchronized void c() {
        if (this.f9092a != 1) {
            this.f9094c.r(new f("connect() already called"));
            a();
            return;
        }
        i iVar = f9091o;
        Thread thread = this.f9102k;
        String str = "TubeSockReader-" + this.f9101j;
        iVar.getClass();
        thread.setName(str);
        this.f9092a = 2;
        this.f9102k.start();
    }

    public final Socket d() {
        URI uri = this.f9095d;
        String scheme = uri.getScheme();
        String host = uri.getHost();
        int port = uri.getPort();
        if (scheme != null && scheme.equals("ws")) {
            if (port == -1) {
                port = 80;
            }
            try {
                return new Socket(host, port);
            } catch (UnknownHostException e4) {
                throw new f("unknown host: " + host, e4);
            } catch (IOException e5) {
                throw new f("error while creating socket to " + uri, e5);
            }
        }
        if (scheme == null || !scheme.equals("wss")) {
            throw new f("unsupported protocol: " + scheme);
        }
        if (port == -1) {
            port = 443;
        }
        SSLSessionCache sSLSessionCache = null;
        String str = this.f9096e;
        if (str != null) {
            try {
                sSLSessionCache = new SSLSessionCache(new File(str));
            } catch (IOException e6) {
                this.f9100i.d("Failed to initialize SSL session cache", e6, new Object[0]);
            }
        }
        try {
            SSLSocket sSLSocket = (SSLSocket) SSLCertificateSocketFactory.getDefault(60000, sSLSessionCache).createSocket(host, port);
            if (HttpsURLConnection.getDefaultHostnameVerifier().verify(host, sSLSocket.getSession())) {
                return sSLSocket;
            }
            throw new f("Error while verifying secure socket to " + uri);
        } catch (UnknownHostException e7) {
            throw new f("unknown host: " + host, e7);
        } catch (IOException e8) {
            throw new f("error while creating secure socket to " + uri, e8);
        }
    }

    public final synchronized void e(byte b4, byte[] bArr) {
        if (this.f9092a != 3) {
            this.f9094c.r(new f("error while sending data: not connected"));
        } else {
            try {
                this.f9098g.b(b4, bArr);
            } catch (IOException e4) {
                this.f9094c.r(new f("Failed to send frame", e4));
                a();
            }
        }
    }
}
