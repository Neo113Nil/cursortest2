package E;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;
import b0.AbstractC0259J;
import b0.C0288u;
import e2.AbstractC0381e;

/* loaded from: classes.dex */
public final class v extends View {

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f699i = {R.attr.state_pressed, R.attr.state_enabled};

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f700j = new int[0];

    /* renamed from: d, reason: collision with root package name */
    public I f701d;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f702e;

    /* renamed from: f, reason: collision with root package name */
    public Long f703f;

    /* renamed from: g, reason: collision with root package name */
    public u f704g;

    /* renamed from: h, reason: collision with root package name */
    public Z1.j f705h;

    private final void setRippleState(boolean z3) {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f704g;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l3 = this.f703f;
        long longValue = currentAnimationTimeMillis - (l3 != null ? l3.longValue() : 0L);
        if (z3 || longValue >= 5) {
            int[] iArr = z3 ? f699i : f700j;
            I i3 = this.f701d;
            if (i3 != null) {
                i3.setState(iArr);
            }
        } else {
            u uVar = new u(0, this);
            this.f704g = uVar;
            postDelayed(uVar, 50L);
        }
        this.f703f = Long.valueOf(currentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$2(v vVar) {
        I i3 = vVar.f701d;
        if (i3 != null) {
            i3.setState(f700j);
        }
        vVar.f704g = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(q.l lVar, boolean z3, long j3, int i3, long j4, float f3, Y1.a aVar) {
        if (this.f701d == null || !Boolean.valueOf(z3).equals(this.f702e)) {
            I i4 = new I(z3);
            setBackground(i4);
            this.f701d = i4;
            this.f702e = Boolean.valueOf(z3);
        }
        I i5 = this.f701d;
        Z1.i.c(i5);
        this.f705h = (Z1.j) aVar;
        Integer num = i5.f629f;
        if (num == null || num.intValue() != i3) {
            i5.f629f = Integer.valueOf(i3);
            H.f626a.a(i5, i3);
        }
        e(j3, j4, f3);
        if (z3) {
            i5.setHotspot(a0.c.d(lVar.f6819a), a0.c.e(lVar.f6819a));
        } else {
            i5.setHotspot(i5.getBounds().centerX(), i5.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c() {
        this.f705h = null;
        u uVar = this.f704g;
        if (uVar != null) {
            removeCallbacks(uVar);
            u uVar2 = this.f704g;
            Z1.i.c(uVar2);
            uVar2.run();
        } else {
            I i3 = this.f701d;
            if (i3 != null) {
                i3.setState(f700j);
            }
        }
        I i4 = this.f701d;
        if (i4 == null) {
            return;
        }
        i4.setVisible(false, false);
        unscheduleDrawable(i4);
    }

    public final void d() {
        setRippleState(false);
    }

    public final void e(long j3, long j4, float f3) {
        I i3 = this.f701d;
        if (i3 == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28) {
            f3 *= 2;
        }
        long b2 = C0288u.b(j4, AbstractC0381e.o(f3, 1.0f));
        C0288u c0288u = i3.f628e;
        if (!(c0288u == null ? false : C0288u.c(c0288u.f4298a, b2))) {
            i3.f628e = new C0288u(b2);
            i3.setColor(ColorStateList.valueOf(AbstractC0259J.E(b2)));
        }
        Rect rect = new Rect(0, 0, M1.B.M(a0.f.d(j3)), M1.B.M(a0.f.b(j3)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        i3.setBounds(rect);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Y1.a, Z1.j] */
    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        ?? r12 = this.f705h;
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
