package com.facebook.ads.internal.p.b;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final Object f5327a;

    /* renamed from: b, reason: collision with root package name */
    private final ExecutorService f5328b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, g> f5329c;

    /* renamed from: d, reason: collision with root package name */
    private final ServerSocket f5330d;
    private final int e;
    private final Thread f;
    private final com.facebook.ads.internal.p.b.c g;
    private boolean h;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private File f5331a;

        /* renamed from: c, reason: collision with root package name */
        private com.facebook.ads.internal.p.b.a.a f5333c = new com.facebook.ads.internal.p.b.a.g(67108864);

        /* renamed from: b, reason: collision with root package name */
        private com.facebook.ads.internal.p.b.a.c f5332b = new com.facebook.ads.internal.p.b.a.f();

        public a(Context context) {
            this.f5331a = o.a(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public com.facebook.ads.internal.p.b.c a() {
            return new com.facebook.ads.internal.p.b.c(this.f5331a, this.f5332b, this.f5333c);
        }
    }

    private class b implements Callable<Boolean> {
        private b() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() {
            return Boolean.valueOf(f.this.c());
        }
    }

    private class c implements Callable<Boolean> {

        /* renamed from: b, reason: collision with root package name */
        private final String f5336b;

        public c(String str) {
            this.f5336b = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() {
            return Boolean.valueOf(f.this.c(this.f5336b));
        }
    }

    private final class d implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final Socket f5338b;

        public d(Socket socket) {
            this.f5338b = socket;
        }

        @Override // java.lang.Runnable
        public void run() {
            f.this.a(this.f5338b);
        }
    }

    private final class e implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final CountDownLatch f5340b;

        public e(CountDownLatch countDownLatch) {
            this.f5340b = countDownLatch;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5340b.countDown();
            f.this.e();
        }
    }

    public f(Context context) {
        this(new a(context).a());
    }

    private f(com.facebook.ads.internal.p.b.c cVar) {
        this.f5327a = new Object();
        this.f5328b = Executors.newFixedThreadPool(8);
        this.f5329c = new ConcurrentHashMap();
        this.g = (com.facebook.ads.internal.p.b.c) j.a(cVar);
        try {
            this.f5330d = new ServerSocket(0, 8, InetAddress.getByName("127.0.0.1"));
            this.e = this.f5330d.getLocalPort();
            CountDownLatch countDownLatch = new CountDownLatch(1);
            this.f = new Thread(new e(countDownLatch));
            this.f.start();
            countDownLatch.await();
            Log.i("ProxyCache", "Proxy cache server started. Ping it...");
            b();
        } catch (IOException | InterruptedException e2) {
            this.f5328b.shutdown();
            throw new IllegalStateException("Error starting local proxy server", e2);
        }
    }

    private void a(Throwable th) {
        Log.e("ProxyCache", "HttpProxyCacheServer error", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Socket socket) {
        String str;
        StringBuilder sb;
        try {
            try {
                try {
                    com.facebook.ads.internal.p.b.d a2 = com.facebook.ads.internal.p.b.d.a(socket.getInputStream());
                    Log.i("ProxyCache", "Request to cache proxy:" + a2);
                    String c2 = m.c(a2.f5321a);
                    if ("ping".equals(c2)) {
                        b(socket);
                    } else {
                        e(c2).a(a2, socket);
                    }
                    c(socket);
                    str = "ProxyCache";
                    sb = new StringBuilder();
                } catch (l | IOException e2) {
                    a(new l("Error processing request", e2));
                    c(socket);
                    str = "ProxyCache";
                    sb = new StringBuilder();
                }
            } catch (SocketException unused) {
                Log.d("ProxyCache", "Closing socket... Socket is closed by client.");
                c(socket);
                str = "ProxyCache";
                sb = new StringBuilder();
            }
            sb.append("Opened connections: ");
            sb.append(f());
            Log.d(str, sb.toString());
        } catch (Throwable th) {
            c(socket);
            Log.d("ProxyCache", "Opened connections: " + f());
            throw th;
        }
    }

    private void b() {
        long j;
        int i = 300;
        int i2 = 0;
        while (i2 < 3) {
            try {
                j = i;
                this.h = ((Boolean) this.f5328b.submit(new b()).get(j, TimeUnit.MILLISECONDS)).booleanValue();
            } catch (InterruptedException | ExecutionException | TimeoutException e2) {
                Log.e("ProxyCache", "Error pinging server [attempt: " + i2 + ", timeout: " + i + "]. ", e2);
            }
            if (this.h) {
                return;
            }
            SystemClock.sleep(j);
            i2++;
            i *= 2;
        }
        Log.e("ProxyCache", "Shutdown server... Error pinging server [attempts: " + i2 + ", max timeout: " + (i / 2) + "].");
        a();
    }

    private void b(Socket socket) {
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("HTTP/1.1 200 OK\n\n".getBytes());
        outputStream.write("ping ok".getBytes());
    }

    private void c(Socket socket) {
        d(socket);
        e(socket);
        f(socket);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c() {
        h hVar = new h(d("ping"));
        try {
            byte[] bytes = "ping ok".getBytes();
            hVar.a(0);
            byte[] bArr = new byte[bytes.length];
            hVar.a(bArr);
            boolean equals = Arrays.equals(bytes, bArr);
            Log.d("ProxyCache", "Ping response: `" + new String(bArr) + "`, pinged? " + equals);
            return equals;
        } catch (l e2) {
            Log.e("ProxyCache", "Error reading ping response", e2);
            return false;
        } finally {
            hVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(String str) {
        h hVar = new h(d(str));
        try {
            try {
                hVar.a(0);
                do {
                } while (hVar.a(new byte[8192]) != -1);
                hVar.b();
                return true;
            } catch (l e2) {
                Log.e("ProxyCache", "Error reading url", e2);
                hVar.b();
                return false;
            }
        } catch (Throwable th) {
            hVar.b();
            throw th;
        }
    }

    private String d(String str) {
        return String.format("http://%s:%d/%s", "127.0.0.1", Integer.valueOf(this.e), m.b(str));
    }

    private void d() {
        synchronized (this.f5327a) {
            Iterator<g> it = this.f5329c.values().iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            this.f5329c.clear();
        }
    }

    private void d(Socket socket) {
        try {
            if (socket.isInputShutdown()) {
                return;
            }
            socket.shutdownInput();
        } catch (SocketException unused) {
            Log.d("ProxyCache", "Releasing input stream... Socket is closed by client.");
        } catch (IOException e2) {
            a(new l("Error closing socket input stream", e2));
        }
    }

    private g e(String str) {
        g gVar;
        synchronized (this.f5327a) {
            gVar = this.f5329c.get(str);
            if (gVar == null) {
                gVar = new g(str, this.g);
                this.f5329c.put(str, gVar);
            }
        }
        return gVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                Socket accept = this.f5330d.accept();
                Log.d("ProxyCache", "Accept new socket " + accept);
                this.f5328b.submit(new d(accept));
            } catch (IOException e2) {
                a(new l("Error during waiting connection", e2));
                return;
            }
        }
    }

    private void e(Socket socket) {
        try {
            if (socket.isOutputShutdown()) {
                socket.shutdownOutput();
            }
        } catch (IOException e2) {
            a(new l("Error closing socket output stream", e2));
        }
    }

    private int f() {
        int i;
        synchronized (this.f5327a) {
            i = 0;
            Iterator<g> it = this.f5329c.values().iterator();
            while (it.hasNext()) {
                i += it.next().b();
            }
        }
        return i;
    }

    private void f(Socket socket) {
        try {
            if (socket.isClosed()) {
                return;
            }
            socket.close();
        } catch (IOException e2) {
            a(new l("Error closing socket", e2));
        }
    }

    public void a() {
        Log.i("ProxyCache", "Shutdown proxy server");
        d();
        this.f.interrupt();
        try {
            if (this.f5330d.isClosed()) {
                return;
            }
            this.f5330d.close();
        } catch (IOException e2) {
            a(new l("Error shutting down proxy server", e2));
        }
    }

    public void a(String str) {
        int i = 300;
        int i2 = 0;
        while (i2 < 3) {
            try {
            } catch (InterruptedException | ExecutionException e2) {
                Log.e("ProxyCache", "Error precaching url [attempt: " + i2 + ", url: " + str + "]. ", e2);
            }
            if (((Boolean) this.f5328b.submit(new c(str)).get()).booleanValue()) {
                return;
            }
            SystemClock.sleep(i);
            i2++;
            i *= 2;
        }
        Log.e("ProxyCache", "Shutdown server... Error precaching url [attempts: " + i2 + ", url: " + str + "].");
        a();
    }

    public String b(String str) {
        if (!this.h) {
            Log.e("ProxyCache", "Proxy server isn't pinged. Caching doesn't work.");
        }
        return this.h ? d(str) : str;
    }
}
