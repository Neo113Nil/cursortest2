package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsetsAnimation;
import java.util.List;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class g90 extends so1 implements Runnable, br0, View.OnAttachStateChangeListener {
    public final kp1 e;
    public boolean g;
    public boolean h;
    public ip1 i;

    public g90(kp1 kp1Var) {
        super(!kp1Var.t ? 1 : 0);
        this.e = kp1Var;
    }

    @Override // defpackage.so1
    public final void a(uo1 uo1Var) {
        this.g = false;
        this.h = false;
        ip1 ip1Var = this.i;
        if (((WindowInsetsAnimation) uo1Var.a.e).getDurationMillis() > 0 && ip1Var != null) {
            fp1 fp1Var = ip1Var.a;
            kp1 kp1Var = this.e;
            kp1Var.s.f(ca0.w(fp1Var.g(8)));
            kp1Var.r.f(ca0.w(fp1Var.g(8)));
            kp1.b(kp1Var, ip1Var);
        }
        this.i = null;
    }

    @Override // defpackage.br0
    public final ip1 b(View view, ip1 ip1Var) {
        this.i = ip1Var;
        kp1 kp1Var = this.e;
        hm1 hm1Var = kp1Var.r;
        fp1 fp1Var = ip1Var.a;
        hm1Var.f(ca0.w(fp1Var.g(8)));
        if (this.g) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.h) {
            kp1Var.s.f(ca0.w(fp1Var.g(8)));
            kp1.b(kp1Var, ip1Var);
        }
        return kp1Var.t ? ip1.b : ip1Var;
    }

    @Override // defpackage.so1
    public final void c() {
        this.g = true;
        this.h = true;
    }

    @Override // defpackage.so1
    public final ip1 d(ip1 ip1Var, List list) {
        kp1 kp1Var = this.e;
        kp1.b(kp1Var, ip1Var);
        return kp1Var.t ? ip1.b : ip1Var;
    }

    @Override // defpackage.so1
    public final c51 e(uo1 uo1Var, c51 c51Var) {
        this.g = false;
        return c51Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.g) {
            this.g = false;
            this.h = false;
            ip1 ip1Var = this.i;
            if (ip1Var != null) {
                kp1 kp1Var = this.e;
                kp1Var.s.f(ca0.w(ip1Var.a.g(8)));
                kp1.b(kp1Var, ip1Var);
                this.i = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
