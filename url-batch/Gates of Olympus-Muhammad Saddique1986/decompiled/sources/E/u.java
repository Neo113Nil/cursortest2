package E;

import a0.C0238c;
import a0.C0241f;
import android.R;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;
import b0.C0352v;
import b0.M;
import e2.InterfaceC0422a;
import h2.AbstractC0508a;

/* loaded from: classes.dex */
public final class u extends View {

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f999i = {R.attr.state_pressed, R.attr.state_enabled};

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f1000j = new int[0];

    /* renamed from: d, reason: collision with root package name */
    public H f1001d;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f1002e;

    /* renamed from: f, reason: collision with root package name */
    public Long f1003f;

    /* renamed from: g, reason: collision with root package name */
    public t f1004g;

    /* renamed from: h, reason: collision with root package name */
    public f2.k f1005h;

    private final void setRippleState(boolean z3) {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f1004g;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l3 = this.f1003f;
        long longValue = currentAnimationTimeMillis - (l3 != null ? l3.longValue() : 0L);
        if (z3 || longValue >= 5) {
            int[] iArr = z3 ? f999i : f1000j;
            H h3 = this.f1001d;
            if (h3 != null) {
                h3.setState(iArr);
            }
        } else {
            t tVar = new t(0, this);
            this.f1004g = tVar;
            postDelayed(tVar, 50L);
        }
        this.f1003f = Long.valueOf(currentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$2(u uVar) {
        H h3 = uVar.f1001d;
        if (h3 != null) {
            h3.setState(f1000j);
        }
        uVar.f1004g = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(q.m mVar, boolean z3, long j3, int i3, long j4, float f3, InterfaceC0422a interfaceC0422a) {
        if (this.f1001d == null || !Boolean.valueOf(z3).equals(this.f1002e)) {
            H h3 = new H(z3);
            setBackground(h3);
            this.f1001d = h3;
            this.f1002e = Boolean.valueOf(z3);
        }
        H h4 = this.f1001d;
        f2.j.c(h4);
        this.f1005h = (f2.k) interfaceC0422a;
        Integer num = h4.f930f;
        if (num == null || num.intValue() != i3) {
            h4.f930f = Integer.valueOf(i3);
            G.f927a.a(h4, i3);
        }
        e(j3, j4, f3);
        if (z3) {
            h4.setHotspot(C0238c.d(mVar.f7845a), C0238c.e(mVar.f7845a));
        } else {
            h4.setHotspot(h4.getBounds().centerX(), h4.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c() {
        this.f1005h = null;
        t tVar = this.f1004g;
        if (tVar != null) {
            removeCallbacks(tVar);
            t tVar2 = this.f1004g;
            f2.j.c(tVar2);
            tVar2.run();
        } else {
            H h3 = this.f1001d;
            if (h3 != null) {
                h3.setState(f1000j);
            }
        }
        H h4 = this.f1001d;
        if (h4 == null) {
            return;
        }
        h4.setVisible(false, false);
        unscheduleDrawable(h4);
    }

    public final void d() {
        setRippleState(false);
    }

    public final void e(long j3, long j4, float f3) {
        H h3 = this.f1001d;
        if (h3 == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28) {
            f3 *= 2;
        }
        long b3 = C0352v.b(j4, O2.d.v(f3, 1.0f));
        C0352v c0352v = h3.f929e;
        if (!(c0352v == null ? false : C0352v.c(c0352v.f5441a, b3))) {
            h3.f929e = new C0352v(b3);
            h3.setColor(ColorStateList.valueOf(M.D(b3)));
        }
        Rect rect = new Rect(0, 0, AbstractC0508a.Q(C0241f.d(j3)), AbstractC0508a.Q(C0241f.b(j3)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        h3.setBounds(rect);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [e2.a, f2.k] */
    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        ?? r12 = this.f1005h;
        if (r12 != 0) {
            r12.b();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i4) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
    }
}
