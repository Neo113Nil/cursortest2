package com.squareup.picasso;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import d1.InterfaceC2402a;

/* loaded from: classes2.dex */
class x {

    /* renamed from: a, reason: collision with root package name */
    final HandlerThread f21860a;

    /* renamed from: b, reason: collision with root package name */
    final InterfaceC2402a f21861b;

    /* renamed from: c, reason: collision with root package name */
    final Handler f21862c;

    /* renamed from: d, reason: collision with root package name */
    long f21863d;

    /* renamed from: e, reason: collision with root package name */
    long f21864e;

    /* renamed from: f, reason: collision with root package name */
    long f21865f;

    /* renamed from: g, reason: collision with root package name */
    long f21866g;

    /* renamed from: h, reason: collision with root package name */
    long f21867h;

    /* renamed from: i, reason: collision with root package name */
    long f21868i;

    /* renamed from: j, reason: collision with root package name */
    long f21869j;

    /* renamed from: k, reason: collision with root package name */
    long f21870k;

    /* renamed from: l, reason: collision with root package name */
    int f21871l;

    /* renamed from: m, reason: collision with root package name */
    int f21872m;

    /* renamed from: n, reason: collision with root package name */
    int f21873n;

    private static class a extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private final x f21874a;

        /* renamed from: com.squareup.picasso.x$a$a, reason: collision with other inner class name */
        class RunnableC0178a implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Message f21875b;

            RunnableC0178a(Message message) {
                this.f21875b = message;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new AssertionError("Unhandled stats message." + this.f21875b.what);
            }
        }

        a(Looper looper, x xVar) {
            super(looper);
            this.f21874a = xVar;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i4 = message.what;
            if (i4 == 0) {
                this.f21874a.j();
                return;
            }
            if (i4 == 1) {
                this.f21874a.k();
                return;
            }
            if (i4 == 2) {
                this.f21874a.h(message.arg1);
                return;
            }
            if (i4 == 3) {
                this.f21874a.i(message.arg1);
            } else if (i4 != 4) {
                q.f21756o.post(new RunnableC0178a(message));
            } else {
                this.f21874a.l((Long) message.obj);
            }
        }
    }

    x(InterfaceC2402a interfaceC2402a) {
        this.f21861b = interfaceC2402a;
        HandlerThread handlerThread = new HandlerThread("Picasso-Stats", 10);
        this.f21860a = handlerThread;
        handlerThread.start();
        y.h(handlerThread.getLooper());
        this.f21862c = new a(handlerThread.getLooper(), this);
    }

    private static long g(int i4, long j4) {
        return j4 / i4;
    }

    private void m(Bitmap bitmap, int i4) {
        int i5 = y.i(bitmap);
        Handler handler = this.f21862c;
        handler.sendMessage(handler.obtainMessage(i4, i5, 0));
    }

    d1.d a() {
        return new d1.d(this.f21861b.a(), this.f21861b.size(), this.f21863d, this.f21864e, this.f21865f, this.f21866g, this.f21867h, this.f21868i, this.f21869j, this.f21870k, this.f21871l, this.f21872m, this.f21873n, System.currentTimeMillis());
    }

    void b(Bitmap bitmap) {
        m(bitmap, 2);
    }

    void c(Bitmap bitmap) {
        m(bitmap, 3);
    }

    void d() {
        this.f21862c.sendEmptyMessage(0);
    }

    void e() {
        this.f21862c.sendEmptyMessage(1);
    }

    void f(long j4) {
        Handler handler = this.f21862c;
        handler.sendMessage(handler.obtainMessage(4, Long.valueOf(j4)));
    }

    void h(long j4) {
        int i4 = this.f21872m + 1;
        this.f21872m = i4;
        long j5 = this.f21866g + j4;
        this.f21866g = j5;
        this.f21869j = g(i4, j5);
    }

    void i(long j4) {
        this.f21873n++;
        long j5 = this.f21867h + j4;
        this.f21867h = j5;
        this.f21870k = g(this.f21872m, j5);
    }

    void j() {
        this.f21863d++;
    }

    void k() {
        this.f21864e++;
    }

    void l(Long l4) {
        this.f21871l++;
        long longValue = this.f21865f + l4.longValue();
        this.f21865f = longValue;
        this.f21868i = g(this.f21871l, longValue);
    }
}
