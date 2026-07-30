package u5;

import a0.m;
import android.net.SSLCertificateSocketFactory;
import android.net.SSLSessionCache;
import android.util.Base64;
import androidx.room.o;
import j5.q;
import j5.r;
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
import l.h;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: l, reason: collision with root package name */
    public static final AtomicInteger f9060l = new AtomicInteger(0);

    /* renamed from: m, reason: collision with root package name */
    public static final Charset f9061m = Charset.forName("UTF-8");

    /* renamed from: n, reason: collision with root package name */
    public static final ThreadFactory f9062n = Executors.defaultThreadFactory();

    /* renamed from: o, reason: collision with root package name */
    public static final m4.f f9063o = new m4.f();

    /* renamed from: a, reason: collision with root package name */
    public volatile int f9064a = 1;

    /* renamed from: b, reason: collision with root package name */
    public volatile Socket f9065b = null;

    /* renamed from: c, reason: collision with root package name */
    public androidx.room.c f9066c = null;

    /* renamed from: d, reason: collision with root package name */
    public final URI f9067d;

    /* renamed from: e, reason: collision with root package name */
    public final String f9068e;

    /* renamed from: f, reason: collision with root package name */
    public final f f9069f;

    /* renamed from: g, reason: collision with root package name */
    public final g f9070g;

    /* renamed from: h, reason: collision with root package name */
    public final b1.b f9071h;

    /* renamed from: i, reason: collision with root package name */
    public final b1.b f9072i;

    /* renamed from: j, reason: collision with root package name */
    public final int f9073j;

    /* renamed from: k, reason: collision with root package name */
    public final Thread f9074k;

    public d(j5.b bVar, URI uri, HashMap hashMap) {
        int incrementAndGet = f9060l.incrementAndGet();
        this.f9073j = incrementAndGet;
        this.f9074k = f9062n.newThread(new o(8, this));
        this.f9067d = uri;
        this.f9068e = bVar.f5045g;
        this.f9072i = new b1.b(bVar.f5042d, "WebSocket", m.i("sk_", incrementAndGet), 22);
        b1.b bVar2 = new b1.b(24, false);
        bVar2.f1231h = null;
        bVar2.f1230g = uri;
        bVar2.f1232i = hashMap;
        byte[] bArr = new byte[16];
        for (int i7 = 0; i7 < 16; i7++) {
            bArr[i7] = (byte) ((Math.random() * 255) + 0);
        }
        bVar2.f1231h = Base64.encodeToString(bArr, 2);
        this.f9071h = bVar2;
        f fVar = new f();
        fVar.f9075a = null;
        fVar.f9076b = null;
        fVar.f9077c = null;
        fVar.f9078d = new byte[112];
        fVar.f9080f = false;
        fVar.f9076b = this;
        this.f9069f = fVar;
        this.f9070g = new g(this, this.f9073j);
    }

    public final synchronized void a() {
        int d8 = h.d(this.f9064a);
        if (d8 == 0) {
            this.f9064a = 5;
            return;
        }
        if (d8 == 1) {
            b();
            return;
        }
        if (d8 != 2) {
            if (d8 != 3) {
                if (d8 != 4) {
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        try {
            this.f9064a = 4;
            this.f9070g.f9083c = true;
            this.f9070g.b((byte) 8, new byte[0]);
        } catch (IOException e9) {
            this.f9066c.w(new e("Failed to send close frame", e9));
        }
    }

    public final synchronized void b() {
        if (this.f9064a == 5) {
            return;
        }
        this.f9069f.f9080f = true;
        this.f9070g.f9083c = true;
        if (this.f9065b != null) {
            try {
                this.f9065b.close();
            } catch (Exception e9) {
                this.f9066c.w(new e("Failed to close", e9));
            }
        }
        this.f9064a = 5;
        androidx.room.c cVar = this.f9066c;
        ((r) cVar.f1070h).f5118i.execute(new q(cVar, 1));
    }

    public final synchronized void c() {
        if (this.f9064a != 1) {
            this.f9066c.w(new e("connect() already called"));
            a();
            return;
        }
        m4.f fVar = f9063o;
        Thread thread = this.f9074k;
        String str = "TubeSockReader-" + this.f9073j;
        fVar.getClass();
        thread.setName(str);
        this.f9064a = 2;
        this.f9074k.start();
    }

    public final Socket d() {
        URI uri = this.f9067d;
        String scheme = uri.getScheme();
        String host = uri.getHost();
        int port = uri.getPort();
        if (scheme != null && scheme.equals("ws")) {
            if (port == -1) {
                port = 80;
            }
            try {
                return new Socket(host, port);
            } catch (UnknownHostException e9) {
                throw new e("unknown host: " + host, e9);
            } catch (IOException e10) {
                throw new e("error while creating socket to " + uri, e10);
            }
        }
        if (scheme == null || !scheme.equals("wss")) {
            throw new e("unsupported protocol: " + scheme);
        }
        if (port == -1) {
            port = 443;
        }
        String str = this.f9068e;
        SSLSessionCache sSLSessionCache = null;
        if (str != null) {
            try {
                sSLSessionCache = new SSLSessionCache(new File(str));
            } catch (IOException e11) {
                this.f9072i.d("Failed to initialize SSL session cache", e11, new Object[0]);
            }
        }
        try {
            SSLSocket sSLSocket = (SSLSocket) SSLCertificateSocketFactory.getDefault(60000, sSLSessionCache).createSocket(host, port);
            if (HttpsURLConnection.getDefaultHostnameVerifier().verify(host, sSLSocket.getSession())) {
                return sSLSocket;
            }
            throw new e("Error while verifying secure socket to " + uri);
        } catch (UnknownHostException e12) {
            throw new e("unknown host: " + host, e12);
        } catch (IOException e13) {
            throw new e("error while creating secure socket to " + uri, e13);
        }
    }

    public final synchronized void e(byte b9, byte[] bArr) {
        if (this.f9064a != 3) {
            this.f9066c.w(new e("error while sending data: not connected"));
        } else {
            try {
                this.f9070g.b(b9, bArr);
            } catch (IOException e9) {
                this.f9066c.w(new e("Failed to send frame", e9));
                a();
            }
        }
    }
}
