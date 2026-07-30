package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import kotlin.ranges.d;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ee0 extends xy1 implements r82 {
    public final Drawable r;
    public final lz1 s;
    public final lz1 t;
    public final y91 u;

    public ee0(Drawable drawable) {
        drawable.getClass();
        this.r = drawable;
        this.s = ij2.j(0);
        y91 y91Var = fe0.a;
        this.t = ij2.j(new ql2((drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) ? 9205357640488583168L : ph2.a(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight())));
        this.u = ya1.b(new u(8, this));
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.r82
    public final void a() {
        Drawable.Callback callback = (Drawable.Callback) this.u.getValue();
        Drawable drawable = this.r;
        drawable.setCallback(callback);
        drawable.setVisible(true, true);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    @Override // defpackage.xy1
    public final boolean b(float f) {
        this.r.setAlpha(d.c(si1.b(f * 255.0f), 0, 255));
        return true;
    }

    @Override // defpackage.r82
    public final void c() {
        d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.r82
    public final void d() {
        Drawable drawable = this.r;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        drawable.setVisible(false, false);
        drawable.setCallback(null);
    }

    @Override // defpackage.xy1
    public final boolean e(mo moVar) {
        this.r.setColorFilter(moVar != null ? moVar.a : null);
        return true;
    }

    @Override // defpackage.xy1
    public final void f(u81 u81Var) {
        int i;
        u81Var.getClass();
        int ordinal = u81Var.ordinal();
        if (ordinal != 0) {
            i = 1;
            if (ordinal != 1) {
                a.b();
                return;
            }
        } else {
            i = 0;
        }
        this.r.setLayoutDirection(i);
    }

    @Override // defpackage.xy1
    public final long h() {
        return ((ql2) this.t.getValue()).a;
    }

    @Override // defpackage.xy1
    public final void i(yd0 yd0Var) {
        yd0Var.getClass();
        ls o = yd0Var.F().o();
        ((Number) this.s.getValue()).intValue();
        int b = si1.b(ql2.d(yd0Var.f()));
        int b2 = si1.b(ql2.b(yd0Var.f()));
        Drawable drawable = this.r;
        drawable.setBounds(0, 0, b, b2);
        try {
            o.m();
            Canvas canvas = z6.a;
            drawable.draw(((y6) o).a);
        } finally {
            o.j();
        }
    }
}
