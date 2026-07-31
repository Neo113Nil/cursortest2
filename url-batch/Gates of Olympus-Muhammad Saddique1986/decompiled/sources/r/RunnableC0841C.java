package r;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import c1.InterfaceC0382f;

/* renamed from: r.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0841C implements Runnable, InterfaceC0382f, View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public WindowInsets f7953d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7954e;

    /* renamed from: f, reason: collision with root package name */
    public final Y f7955f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7956g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f7957h;

    /* renamed from: i, reason: collision with root package name */
    public c1.U f7958i;

    public RunnableC0841C(Y y3) {
        this.f7954e = !y3.f8020r ? 1 : 0;
        this.f7955f = y3;
    }

    public final c1.U a(View view, c1.U u3) {
        this.f7958i = u3;
        Y y3 = this.f7955f;
        y3.getClass();
        c1.Q q3 = u3.f5589a;
        y3.f8018p.f(AbstractC0856c.e(q3.f(8)));
        if (this.f7956g) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.f7957h) {
            y3.f8019q.f(AbstractC0856c.e(q3.f(8)));
            Y.a(y3, u3);
        }
        return y3.f8020r ? c1.U.f5588b : u3;
    }

    public final void b(c1.F f3) {
        this.f7956g = false;
        this.f7957h = false;
        c1.U u3 = this.f7958i;
        if (f3.f5557a.a() != 0 && u3 != null) {
            Y y3 = this.f7955f;
            y3.getClass();
            c1.Q q3 = u3.f5589a;
            y3.f8019q.f(AbstractC0856c.e(q3.f(8)));
            y3.f8018p.f(AbstractC0856c.e(q3.f(8)));
            Y.a(y3, u3);
        }
        this.f7958i = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f7956g) {
            this.f7956g = false;
            this.f7957h = false;
            c1.U u3 = this.f7958i;
            if (u3 != null) {
                Y y3 = this.f7955f;
                y3.getClass();
                y3.f8019q.f(AbstractC0856c.e(u3.f5589a.f(8)));
                Y.a(y3, u3);
                this.f7958i = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
