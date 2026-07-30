package com.baidu.ar;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.CountDownLatch;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public abstract class ve extends i0 implements Runnable, te {

    /* renamed from: i, reason: collision with root package name */
    public URI f3473i;

    /* renamed from: j, reason: collision with root package name */
    public we f3474j;

    /* renamed from: k, reason: collision with root package name */
    public Socket f3475k;

    /* renamed from: l, reason: collision with root package name */
    public SocketFactory f3476l;

    /* renamed from: m, reason: collision with root package name */
    public OutputStream f3477m;

    /* renamed from: n, reason: collision with root package name */
    public Proxy f3478n;

    /* renamed from: o, reason: collision with root package name */
    public Thread f3479o;

    /* renamed from: p, reason: collision with root package name */
    public Thread f3480p;

    /* renamed from: q, reason: collision with root package name */
    public l3 f3481q;

    /* renamed from: r, reason: collision with root package name */
    public Map<String, String> f3482r;

    /* renamed from: s, reason: collision with root package name */
    public CountDownLatch f3483s;

    /* renamed from: t, reason: collision with root package name */
    public CountDownLatch f3484t;

    /* renamed from: u, reason: collision with root package name */
    public int f3485u;

    /* renamed from: v, reason: collision with root package name */
    public j3 f3486v;

    public class a implements j3 {
        public a(ve veVar) {
        }

        @Override // com.baidu.ar.j3
        public InetAddress a(URI uri) {
            return InetAddress.getByName(uri.getHost());
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final ve f3487a;

        public b(ve veVar) {
            this.f3487a = veVar;
        }

        public final void b() {
            try {
                if (ve.this.f3475k != null) {
                    ve.this.f3475k.close();
                }
            } catch (IOException e8) {
                ve.this.a((te) this.f3487a, (Exception) e8);
            }
        }

        public final void c() {
            while (!Thread.interrupted()) {
                try {
                    ByteBuffer take = ve.this.f3474j.f3636b.take();
                    ve.this.f3477m.write(take.array(), 0, take.limit());
                    ve.this.f3477m.flush();
                } catch (InterruptedException unused) {
                    for (ByteBuffer byteBuffer : ve.this.f3474j.f3636b) {
                        ve.this.f3477m.write(byteBuffer.array(), 0, byteBuffer.limit());
                        ve.this.f3477m.flush();
                    }
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Thread.currentThread().setName("WebSocketWriteThread-" + Thread.currentThread().getId());
            try {
                try {
                    c();
                } catch (IOException e8) {
                    ve.this.a(e8);
                }
            } finally {
                b();
                ve.this.f3479o = null;
            }
        }
    }

    public ve(URI uri) {
        this(uri, new m3());
    }

    public abstract void a(int i8, String str, boolean z7);

    public abstract void a(pb pbVar);

    public abstract void a(Exception exc);

    public abstract void a(String str);

    public abstract void a(SSLParameters sSLParameters);

    public void i() {
        if (this.f3479o != null) {
            this.f3474j.a(1000);
        }
    }

    public void j() {
        i();
        this.f3484t.await();
    }

    public void k() {
        if (this.f3480p != null) {
            throw new IllegalStateException("WebSocketClient objects are not reuseable");
        }
        Thread thread = new Thread(this);
        this.f3480p = thread;
        thread.setName("WebSocketConnectReadThread-" + this.f3480p.getId());
        this.f3480p.start();
    }

    public final int l() {
        int port = this.f3473i.getPort();
        if (port != -1) {
            return port;
        }
        String scheme = this.f3473i.getScheme();
        if ("wss".equals(scheme)) {
            return 443;
        }
        if ("ws".equals(scheme)) {
            return 80;
        }
        throw new IllegalArgumentException("unknown scheme: " + scheme);
    }

    public boolean m() {
        return this.f3474j.e();
    }

    public boolean n() {
        return this.f3474j.f();
    }

    public boolean o() {
        return this.f3474j.g();
    }

    public void p() {
        q();
        k();
    }

    public final void q() {
        Thread currentThread = Thread.currentThread();
        if (currentThread == this.f3479o || currentThread == this.f3480p) {
            throw new IllegalStateException("You cannot initialize a reconnect out of the websocket thread. Use reconnect in another thread to insure a successful cleanup.");
        }
        try {
            j();
            Thread thread = this.f3479o;
            if (thread != null) {
                thread.interrupt();
                this.f3479o = null;
            }
            Thread thread2 = this.f3480p;
            if (thread2 != null) {
                thread2.interrupt();
                this.f3480p = null;
            }
            this.f3481q.c();
            Socket socket = this.f3475k;
            if (socket != null) {
                socket.close();
                this.f3475k = null;
            }
            this.f3483s = new CountDownLatch(1);
            this.f3484t = new CountDownLatch(1);
            this.f3474j = new we(this, this.f3481q);
        } catch (Exception e8) {
            a(e8);
            this.f3474j.b(1006, e8.getMessage());
        }
    }

    public final void r() {
        String rawPath = this.f3473i.getRawPath();
        String rawQuery = this.f3473i.getRawQuery();
        if (rawPath == null || rawPath.length() == 0) {
            rawPath = "/";
        }
        if (rawQuery != null) {
            rawPath = rawPath + '?' + rawQuery;
        }
        int l8 = l();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3473i.getHost());
        sb.append((l8 == 80 || l8 == 443) ? "" : ":" + l8);
        String sb2 = sb.toString();
        a5 a5Var = new a5();
        a5Var.b(rawPath);
        a5Var.a("Host", sb2);
        Map<String, String> map = this.f3482r;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                a5Var.a(entry.getKey(), entry.getValue());
            }
        }
        this.f3474j.a((b2) a5Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0092 A[Catch: InternalError -> 0x000e, Exception -> 0x0011, TryCatch #4 {Exception -> 0x0011, InternalError -> 0x000e, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x002a, B:9:0x0044, B:13:0x0061, B:15:0x006d, B:16:0x008c, B:18:0x0092, B:19:0x009e, B:43:0x0014, B:45:0x0018, B:46:0x0023, B:48:0x00fd, B:49:0x0102), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0044 A[Catch: InternalError -> 0x000e, Exception -> 0x0011, TRY_LEAVE, TryCatch #4 {Exception -> 0x0011, InternalError -> 0x000e, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x002a, B:9:0x0044, B:13:0x0061, B:15:0x006d, B:16:0x008c, B:18:0x0092, B:19:0x009e, B:43:0x0014, B:45:0x0018, B:46:0x0023, B:48:0x00fd, B:49:0x0102), top: B:2:0x0001 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void run() {
        Exception e8;
        boolean z7;
        Socket socket;
        byte[] bArr;
        int read;
        try {
            SocketFactory socketFactory = this.f3476l;
            if (socketFactory != null) {
                this.f3475k = socketFactory.createSocket();
            } else {
                Socket socket2 = this.f3475k;
                if (socket2 == null) {
                    this.f3475k = new Socket(this.f3478n);
                    z7 = true;
                    this.f3475k.setTcpNoDelay(e());
                    this.f3475k.setReuseAddress(d());
                    if (!this.f3475k.isConnected()) {
                        this.f3475k.connect(new InetSocketAddress(this.f3486v.a(this.f3473i), l()), this.f3485u);
                    }
                    if (z7 && "wss".equals(this.f3473i.getScheme())) {
                        SSLContext sSLContext = SSLContext.getInstance("TLSv1.2");
                        sSLContext.init(null, null, null);
                        this.f3475k = sSLContext.getSocketFactory().createSocket(this.f3475k, this.f3473i.getHost(), l(), true);
                    }
                    socket = this.f3475k;
                    if (socket instanceof SSLSocket) {
                        SSLSocket sSLSocket = (SSLSocket) socket;
                        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
                        a(sSLParameters);
                        sSLSocket.setSSLParameters(sSLParameters);
                    }
                    InputStream inputStream = this.f3475k.getInputStream();
                    this.f3477m = this.f3475k.getOutputStream();
                    r();
                    Thread thread = new Thread(new b(this));
                    this.f3479o = thread;
                    thread.start();
                    bArr = new byte[16384];
                    while (!n() && !m() && (read = inputStream.read(bArr)) != -1) {
                        try {
                            this.f3474j.a(ByteBuffer.wrap(bArr, 0, read));
                        } catch (IOException e9) {
                            a(e9);
                        } catch (RuntimeException e10) {
                            a(e10);
                            this.f3474j.b(1006, e10.getMessage());
                        }
                    }
                    this.f3474j.a();
                    this.f3480p = null;
                }
                if (socket2.isClosed()) {
                    throw new IOException();
                }
            }
            z7 = false;
            this.f3475k.setTcpNoDelay(e());
            this.f3475k.setReuseAddress(d());
            if (!this.f3475k.isConnected()) {
            }
            if (z7) {
                SSLContext sSLContext2 = SSLContext.getInstance("TLSv1.2");
                sSLContext2.init(null, null, null);
                this.f3475k = sSLContext2.getSocketFactory().createSocket(this.f3475k, this.f3473i.getHost(), l(), true);
            }
            socket = this.f3475k;
            if (socket instanceof SSLSocket) {
            }
            InputStream inputStream2 = this.f3475k.getInputStream();
            this.f3477m = this.f3475k.getOutputStream();
            r();
            Thread thread2 = new Thread(new b(this));
            this.f3479o = thread2;
            thread2.start();
            bArr = new byte[16384];
            while (!n()) {
                this.f3474j.a(ByteBuffer.wrap(bArr, 0, read));
            }
            this.f3474j.a();
            this.f3480p = null;
        } catch (Exception e11) {
            e8 = e11;
            a(this.f3474j, e8);
            this.f3474j.b(-1, e8.getMessage());
        } catch (InternalError e12) {
            if (!(e12.getCause() instanceof InvocationTargetException) || !(e12.getCause().getCause() instanceof IOException)) {
                throw e12;
            }
            e8 = (IOException) e12.getCause().getCause();
            a(this.f3474j, e8);
            this.f3474j.b(-1, e8.getMessage());
        }
    }

    public ve(URI uri, l3 l3Var) {
        this(uri, l3Var, null, 0);
    }

    public void b(int i8, String str, boolean z7) {
    }

    @Override // com.baidu.ar.i0
    public Collection<te> c() {
        return Collections.singletonList(this.f3474j);
    }

    public ve(URI uri, l3 l3Var, Map<String, String> map, int i8) {
        this.f3473i = null;
        this.f3474j = null;
        this.f3475k = null;
        this.f3476l = null;
        this.f3478n = Proxy.NO_PROXY;
        this.f3483s = new CountDownLatch(1);
        this.f3484t = new CountDownLatch(1);
        this.f3485u = 0;
        this.f3486v = null;
        if (uri == null) {
            throw new IllegalArgumentException();
        }
        if (l3Var == null) {
            throw new IllegalArgumentException("null as draft is permitted for `WebSocketServer` only!");
        }
        this.f3473i = uri;
        this.f3481q = l3Var;
        this.f3486v = new a(this);
        if (map != null) {
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            this.f3482r = treeMap;
            treeMap.putAll(map);
        }
        this.f3485u = i8;
        b(false);
        a(false);
        this.f3474j = new we(this, l3Var);
    }

    public void a(int i8, String str) {
    }

    @Override // com.baidu.ar.xe
    public final void b(te teVar) {
    }

    @Override // com.baidu.ar.te
    public void a(q4 q4Var) {
        this.f3474j.a(q4Var);
    }

    @Override // com.baidu.ar.xe
    public final void b(te teVar, int i8, String str, boolean z7) {
        h();
        Thread thread = this.f3479o;
        if (thread != null) {
            thread.interrupt();
        }
        a(i8, str, z7);
        this.f3483s.countDown();
        this.f3484t.countDown();
    }

    @Override // com.baidu.ar.xe
    public void a(te teVar, int i8, String str) {
        a(i8, str);
    }

    public void b(String str) {
        this.f3474j.a(str);
    }

    @Override // com.baidu.ar.xe
    public void a(te teVar, int i8, String str, boolean z7) {
        b(i8, str, z7);
    }

    @Override // com.baidu.ar.xe
    public final void a(te teVar, d5 d5Var) {
        g();
        a((pb) d5Var);
        this.f3483s.countDown();
    }

    @Override // com.baidu.ar.xe
    public final void a(te teVar, Exception exc) {
        a(exc);
    }

    @Override // com.baidu.ar.xe
    public final void a(te teVar, String str) {
        a(str);
    }

    @Override // com.baidu.ar.xe
    public final void a(te teVar, ByteBuffer byteBuffer) {
        a(byteBuffer);
    }

    public final void a(IOException iOException) {
        if (iOException instanceof SSLException) {
            a((Exception) iOException);
        }
        this.f3474j.a();
    }

    public void a(ByteBuffer byteBuffer) {
    }

    public void a(byte[] bArr) {
        this.f3474j.a(bArr);
    }
}
