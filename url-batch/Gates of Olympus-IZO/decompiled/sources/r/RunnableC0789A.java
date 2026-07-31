package r;

import a1.C0162D;
import a1.InterfaceC0168f;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* renamed from: r.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0789A implements Runnable, InterfaceC0168f, View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public WindowInsets f6982d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6983e;

    /* renamed from: f, reason: collision with root package name */
    public final V f6984f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6985g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f6986h;

    /* renamed from: i, reason: collision with root package name */
    public a1.Q f6987i;

    public RunnableC0789A(V v3) {
        this.f6983e = !v3.f7045r ? 1 : 0;
        this.f6984f = v3;
    }

    public final a1.Q a(View view, a1.Q q2) {
        this.f6987i = q2;
        V v3 = this.f6984f;
        v3.getClass();
        a1.O o3 = q2.f3542a;
        v3.p.f(g2.i.Y(o3.f(8)));
        if (this.f6985g) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.f6986h) {
            v3.f7044q.f(g2.i.Y(o3.f(8)));
            V.a(v3, q2);
        }
        return v3.f7045r ? a1.Q.f3541b : q2;
    }

    public final void b(C0162D c0162d) {
        this.f6985g = false;
        this.f6986h = false;
        a1.Q q2 = this.f6987i;
        if (c0162d.f3511a.a() != 0 && q2 != null) {
            V v3 = this.f6984f;
            v3.getClass();
            a1.O o3 = q2.f3542a;
            v3.f7044q.f(g2.i.Y(o3.f(8)));
            v3.p.f(g2.i.Y(o3.f(8)));
            V.a(v3, q2);
        }
        this.f6987i = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f6985g) {
            this.f6985g = false;
            this.f6986h = false;
            a1.Q q2 = this.f6987i;
            if (q2 != null) {
                V v3 = this.f6984f;
                v3.getClass();
                v3.f7044q.f(g2.i.Y(q2.f3542a.f(8)));
                V.a(v3, q2);
                this.f6987i = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
