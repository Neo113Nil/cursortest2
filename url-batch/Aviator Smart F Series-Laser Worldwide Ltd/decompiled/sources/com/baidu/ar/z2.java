package com.baidu.ar;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public class z2 {

    /* renamed from: a, reason: collision with root package name */
    public int f3791a;

    /* renamed from: b, reason: collision with root package name */
    public a f3792b;

    /* renamed from: c, reason: collision with root package name */
    public Handler f3793c;

    /* renamed from: d, reason: collision with root package name */
    public b f3794d;

    public interface a {
        void onTick();
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public int f3795a;

        /* renamed from: b, reason: collision with root package name */
        public a f3796b;

        /* renamed from: c, reason: collision with root package name */
        public Handler f3797c;

        public b(Handler handler, int i8, a aVar) {
            this.f3795a = i8;
            this.f3797c = handler;
            this.f3796b = aVar;
        }

        public void b() {
            this.f3797c.removeCallbacksAndMessages(null);
            this.f3797c = null;
            this.f3796b = null;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f3797c != null) {
                if (this.f3796b != null && z2.this.f3791a > 0) {
                    this.f3796b.onTick();
                }
                this.f3797c.postDelayed(this, this.f3795a);
            }
        }
    }

    public z2(int i8) {
        this.f3791a = i8;
    }

    public void b() {
        Handler handler = new Handler(Looper.myLooper());
        this.f3793c = handler;
        b bVar = new b(handler, this.f3791a, this.f3792b);
        this.f3794d = bVar;
        this.f3793c.post(bVar);
    }

    public void a() {
        Handler handler = this.f3793c;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f3793c.removeCallbacks(this.f3794d);
            b bVar = this.f3794d;
            if (bVar != null) {
                bVar.b();
                this.f3794d = null;
            }
            this.f3793c = null;
            this.f3791a = 0;
            this.f3792b = null;
        }
    }

    public void a(a aVar) {
        this.f3792b = aVar;
    }
}
