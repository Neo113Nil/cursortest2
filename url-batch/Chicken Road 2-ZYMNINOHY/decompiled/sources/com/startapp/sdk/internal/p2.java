package com.startapp.sdk.internal;

import android.os.Handler;
import android.os.Looper;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;

/* loaded from: classes.dex */
public abstract class p2 {

    /* renamed from: a, reason: collision with root package name */
    public final w2 f7430a;

    /* renamed from: b, reason: collision with root package name */
    public Handler f7431b = null;

    /* renamed from: c, reason: collision with root package name */
    public Long f7432c = null;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7433d = false;

    public p2(w2 w2Var) {
        this.f7430a = w2Var;
    }

    public abstract boolean a();

    public abstract long b();

    public void c() {
        this.f7432c = null;
        this.f7433d = false;
        w2 w2Var = this.f7430a;
        w2Var.getClass();
        MetaData E4 = MetaData.E();
        if (E4.f0() && w2Var.f7810w < E4.Y()) {
            w2Var.f7810w++;
            w2Var.a(null, null, true, false, null);
        } else {
            C0372m c0372m = w2Var.z;
            if (c0372m != null) {
                c0372m.a(w2Var);
            }
        }
    }

    public final void d() {
        if (this.f7433d) {
            return;
        }
        if (this.f7432c == null) {
            this.f7432c = Long.valueOf(System.currentTimeMillis());
        }
        if (a()) {
            if (this.f7431b == null) {
                Looper myLooper = Looper.myLooper();
                if (myLooper == null) {
                    myLooper = Looper.getMainLooper();
                }
                this.f7431b = new Handler(myLooper);
            }
            long b4 = b();
            if (b4 >= 0) {
                this.f7433d = true;
                this.f7431b.postDelayed(new o2(this), b4);
            }
        }
    }

    public final void e() {
        Handler handler = this.f7431b;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.f7432c = null;
        this.f7433d = false;
    }
}
