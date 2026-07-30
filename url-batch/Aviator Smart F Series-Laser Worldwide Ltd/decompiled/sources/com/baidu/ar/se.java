package com.baidu.ar;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.net.URI;
import java.util.Locale;

/* loaded from: classes.dex */
public class se implements g7 {

    /* renamed from: a, reason: collision with root package name */
    public volatile q f3220a;

    /* renamed from: b, reason: collision with root package name */
    public h7 f3221b;

    /* renamed from: c, reason: collision with root package name */
    public HandlerThread f3222c;

    /* renamed from: d, reason: collision with root package name */
    public Handler f3223d;

    /* renamed from: e, reason: collision with root package name */
    public Runnable f3224e = new a();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            se.this.e();
            se.this.f3223d.postDelayed(se.this.f3224e, 5000L);
        }
    }

    public class b implements h7 {
        public b() {
        }

        @Override // com.baidu.ar.h7
        public void a(int i8, String str, boolean z7) {
            if (se.this.f3221b != null) {
                se.this.f3221b.a(i8, str, z7);
            }
        }

        @Override // com.baidu.ar.h7
        public void onError(int i8, String str) {
            if (se.this.f3221b != null) {
                se.this.f3221b.onError(i8, str);
            }
        }

        @Override // com.baidu.ar.h7
        public void onOpen() {
            if (se.this.f3221b != null) {
                se.this.f3221b.onOpen();
            }
            se.this.f();
        }

        @Override // com.baidu.ar.h7
        public void a(String str) {
            h.a("WebSocket", "resp: " + str);
            if (se.this.f3221b != null) {
                se.this.f3221b.a(str);
            }
        }
    }

    public class c implements Handler.Callback {
        public c() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
        
            if (r3.f3227a.f3221b != null) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0090, code lost:
        
            if (r3.f3227a.f3221b != null) goto L39;
         */
        @Override // android.os.Handler.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean handleMessage(Message message) {
            if (se.this.f3220a == null) {
                return true;
            }
            int i8 = message.what;
            try {
            } catch (Exception e8) {
                e8.printStackTrace();
            }
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 != 3) {
                        if (i8 != 4) {
                            if (i8 == 5) {
                                if (se.this.f3220a.m()) {
                                    se.this.f3220a.p();
                                } else {
                                    se.this.g();
                                }
                            }
                        } else if (message.obj instanceof byte[]) {
                            if (se.this.f3220a.o()) {
                                se.this.f3220a.a((byte[]) message.obj);
                            }
                        }
                    } else if (message.obj instanceof String) {
                        if (se.this.f3220a.o()) {
                            se.this.f3220a.b((String) message.obj);
                        }
                    }
                    se.this.f3221b.onError(1002, "websocket not open");
                } else if (se.this.f3220a != null) {
                    se.this.f3220a.i();
                }
                return true;
            }
            se.this.f3220a.k();
            return true;
        }
    }

    @Override // com.baidu.ar.g7
    public void a() {
        f();
    }

    public final void e() {
        Message.obtain(this.f3223d, 5).sendToTarget();
    }

    public final void g() {
        a(String.format(Locale.CHINA, "{\"requestId\":\"heart%d\",\"action\":\"HEART_BEAT\"}", Long.valueOf(System.currentTimeMillis())));
    }

    @Override // com.baidu.ar.g7
    public void release() {
        d();
        this.f3222c.quit();
        if (this.f3220a != null) {
            this.f3220a.s();
            this.f3220a = null;
        }
    }

    @Override // com.baidu.ar.g7
    public void a(h7 h7Var) {
        this.f3221b = h7Var;
    }

    @Override // com.baidu.ar.g7
    public void b() {
        this.f3223d.removeCallbacks(this.f3224e);
    }

    @Override // com.baidu.ar.g7
    public void c() {
        Message.obtain(this.f3223d, 1).sendToTarget();
    }

    public void d() {
        Message.obtain(this.f3223d, 2).sendToTarget();
    }

    public final void f() {
        HandlerThread handlerThread = this.f3222c;
        if (handlerThread == null || !handlerThread.isAlive()) {
            return;
        }
        this.f3223d.removeCallbacks(this.f3224e);
        this.f3223d.post(this.f3224e);
    }

    @Override // com.baidu.ar.g7
    public void b(String str) {
        this.f3220a = new q(URI.create(str));
        this.f3220a.a(new b());
        HandlerThread handlerThread = new HandlerThread("WebSocketManager");
        this.f3222c = handlerThread;
        handlerThread.start();
        this.f3223d = new Handler(this.f3222c.getLooper(), new c());
    }

    @Override // com.baidu.ar.g7
    public void a(String str) {
        h.a("WebSocket", "req: " + str);
        Message.obtain(this.f3223d, 3, str).sendToTarget();
    }

    @Override // com.baidu.ar.g7
    public void a(byte[] bArr) {
        if (bArr != null) {
            h.a("WebSocket", "req: byte " + bArr.length);
            Message.obtain(this.f3223d, 4, bArr).sendToTarget();
        }
    }
}
