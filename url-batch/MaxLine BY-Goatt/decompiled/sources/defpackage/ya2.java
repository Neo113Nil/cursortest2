package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ya2 extends View {
    public static final int[] r = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] s = new int[0];
    public k23 m;
    public Boolean n;
    public Long o;
    public k3 p;
    public Function0 q;

    private final void setRippleState(boolean z) {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.p;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.o;
        long longValue = currentAnimationTimeMillis - (l != null ? l.longValue() : 0L);
        if (z || longValue >= 5) {
            int[] iArr = z ? r : s;
            k23 k23Var = this.m;
            if (k23Var != null) {
                k23Var.setState(iArr);
            }
        } else {
            k3 k3Var = new k3(21, this);
            this.p = k3Var;
            postDelayed(k3Var, 50L);
        }
        this.o = Long.valueOf(currentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$2(ya2 ya2Var) {
        k23 k23Var = ya2Var.m;
        if (k23Var != null) {
            k23Var.setState(s);
        }
        ya2Var.p = null;
    }

    public final void b(u42 u42Var, boolean z, long j, int i, long j2, float f, Function0 function0) {
        if (this.m == null || !Boolean.valueOf(z).equals(this.n)) {
            k23 k23Var = new k23(z);
            setBackground(k23Var);
            this.m = k23Var;
            this.n = Boolean.valueOf(z);
        }
        k23 k23Var2 = this.m;
        k23Var2.getClass();
        this.q = function0;
        Integer num = k23Var2.o;
        if (num == null || num.intValue() != i) {
            k23Var2.o = Integer.valueOf(i);
            j23.a.a(k23Var2, i);
        }
        e(f, j, j2);
        if (z) {
            k23Var2.setHotspot(au1.d(u42Var.a), au1.e(u42Var.a));
        } else {
            k23Var2.setHotspot(k23Var2.getBounds().centerX(), k23Var2.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c() {
        this.q = null;
        k3 k3Var = this.p;
        if (k3Var != null) {
            removeCallbacks(k3Var);
            k3 k3Var2 = this.p;
            k3Var2.getClass();
            k3Var2.run();
        } else {
            k23 k23Var = this.m;
            if (k23Var != null) {
                k23Var.setState(s);
            }
        }
        k23 k23Var2 = this.m;
        if (k23Var2 == null) {
            return;
        }
        k23Var2.setVisible(false, false);
        unscheduleDrawable(k23Var2);
    }

    public final void d() {
        setRippleState(false);
    }

    public final void e(float f, long j, long j2) {
        k23 k23Var = this.m;
        if (k23Var == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28) {
            f *= 2.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        long b = aw.b(j2, f);
        aw awVar = k23Var.n;
        if (!(awVar == null ? false : aw.c(awVar.a, b))) {
            k23Var.n = new aw(b);
            k23Var.setColor(ColorStateList.valueOf(ap.H(b)));
        }
        Rect rect = new Rect(0, 0, si1.b(ql2.d(j)), si1.b(ql2.b(j)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        k23Var.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Function0 function0 = this.q;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
