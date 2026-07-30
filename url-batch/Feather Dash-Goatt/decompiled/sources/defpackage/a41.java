package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class a41 extends View {
    public static final int[] j = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] k = new int[0];
    public il1 d;
    public Boolean e;
    public Long g;
    public e4 h;
    public i6 i;

    private final void setRippleState(boolean z) {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.h;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.g;
        long longValue = currentAnimationTimeMillis - (l != null ? l.longValue() : 0L);
        if (z || longValue >= 5) {
            int[] iArr = z ? j : k;
            il1 il1Var = this.d;
            if (il1Var != null) {
                il1Var.setState(iArr);
            }
        } else {
            e4 e4Var = new e4(8, this);
            this.h = e4Var;
            postDelayed(e4Var, 50L);
        }
        this.g = Long.valueOf(currentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$1(a41 a41Var) {
        il1 il1Var = a41Var.d;
        if (il1Var != null) {
            il1Var.setState(k);
        }
        a41Var.h = null;
    }

    public final void b(zy0 zy0Var, boolean z, long j2, int i, long j3, i6 i6Var) {
        if (this.d == null || !Boolean.valueOf(z).equals(this.e)) {
            il1 il1Var = new il1(z);
            setBackground(il1Var);
            this.d = il1Var;
            this.e = Boolean.valueOf(z);
        }
        il1 il1Var2 = this.d;
        il1Var2.getClass();
        this.i = i6Var;
        e(i, j2, j3);
        if (z) {
            il1Var2.setHotspot(Float.intBitsToFloat((int) (zy0Var.a >> 32)), Float.intBitsToFloat((int) (zy0Var.a & 4294967295L)));
        } else {
            il1Var2.setHotspot(il1Var2.getBounds().centerX(), il1Var2.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c() {
        this.i = null;
        e4 e4Var = this.h;
        if (e4Var != null) {
            removeCallbacks(e4Var);
            e4 e4Var2 = this.h;
            e4Var2.getClass();
            e4Var2.run();
        } else {
            il1 il1Var = this.d;
            if (il1Var != null) {
                il1Var.setState(k);
            }
        }
        il1 il1Var2 = this.d;
        if (il1Var2 == null) {
            return;
        }
        il1Var2.setVisible(false, false);
        unscheduleDrawable(il1Var2);
    }

    public final void d() {
        setRippleState(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            c();
        }
    }

    public final void e(int i, long j2, long j3) {
        il1 il1Var = this.d;
        if (il1Var == null) {
            return;
        }
        Integer num = il1Var.g;
        if (num == null || num.intValue() != i) {
            il1Var.g = Integer.valueOf(i);
            il1Var.setRadius(i);
        }
        long b = hi.b(0.1f, j3);
        hi hiVar = il1Var.e;
        if (!(hiVar == null ? false : hi.c(hiVar.a, b))) {
            il1Var.e = new hi(b);
            il1Var.setColor(ColorStateList.valueOf(la0.W(b)));
        }
        Rect rect = new Rect(0, 0, pk0.a(Float.intBitsToFloat((int) (j2 >> 32))), pk0.a(Float.intBitsToFloat((int) (j2 & 4294967295L))));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        il1Var.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        i6 i6Var = this.i;
        if (i6Var != null) {
            i6Var.invoke();
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
