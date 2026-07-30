package com.baidu.lbsapi.auth;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes2.dex */
class h extends Thread {

    /* renamed from: a, reason: collision with root package name */
    Handler f4340a;

    /* renamed from: b, reason: collision with root package name */
    private Object f4341b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f4342c;

    h(String str) {
        super(str);
        this.f4340a = null;
        this.f4341b = new Object();
        this.f4342c = false;
    }

    public void b() {
        synchronized (this.f4341b) {
            this.f4342c = true;
            this.f4341b.notifyAll();
        }
    }

    public void c() {
        synchronized (this.f4341b) {
            try {
                if (!this.f4342c) {
                    this.f4341b.wait();
                }
            } catch (InterruptedException e8) {
                e8.printStackTrace();
            }
        }
    }

    public void d() {
        if (b.f4311a) {
            b.a("Looper thread quit()");
        }
        Handler handler = this.f4340a;
        if (handler == null || handler.getLooper() == null) {
            return;
        }
        this.f4340a.getLooper().quit();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Looper.prepare();
        this.f4340a = new Handler();
        if (b.f4311a) {
            b.a("new Handler() finish!!");
        }
        Looper.loop();
        if (b.f4311a) {
            b.a("LooperThread run() thread id:" + String.valueOf(Thread.currentThread().getId()));
        }
    }
}
