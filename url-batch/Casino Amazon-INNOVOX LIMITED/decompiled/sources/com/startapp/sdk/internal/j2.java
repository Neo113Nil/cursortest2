package com.startapp.sdk.internal;

import android.os.Handler;
import android.os.Looper;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public abstract class j2 {

    /* renamed from: a, reason: collision with root package name */
    public final q2 f283a;
    public Handler b = null;
    public Long c = null;
    public boolean d = false;

    public j2(q2 q2Var) {
        this.f283a = q2Var;
    }

    public abstract boolean a();

    public abstract long b();

    public void c() {
        this.c = null;
        this.d = false;
        q2 q2Var = this.f283a;
        MetaData A = MetaData.A();
        if (A.Z() && q2Var.w < A.T()) {
            q2Var.w++;
            q2Var.a(null, null, true, false, null);
        } else {
            m mVar = q2Var.z;
            if (mVar != null) {
                mVar.a(q2Var);
            }
        }
    }

    public final void d() {
        if (this.d) {
            return;
        }
        if (this.c == null) {
            this.c = Long.valueOf(System.currentTimeMillis());
        }
        if (a()) {
            if (this.b == null) {
                Looper myLooper = Looper.myLooper();
                if (myLooper == null) {
                    myLooper = Looper.getMainLooper();
                }
                this.b = new Handler(myLooper);
            }
            long b = b();
            if (b >= 0) {
                this.d = true;
                this.b.postDelayed(new i2(this), b);
            }
        }
    }

    public final void e() {
        Handler handler = this.b;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.c = null;
        this.d = false;
    }
}
