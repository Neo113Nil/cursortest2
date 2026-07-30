package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class rw1 extends View {
    public static final qw1 Companion = new qw1();
    public static final int[] cpQdD2nAriOS = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] r3s1LDPKFs1S = new int[0];
    public Boolean OPXfSBeufaJ8;
    public BRwzKIf41E4i dgRBjINgWbAK;
    public to2 rtx2ld2ELZv4;
    public Long wdg6QnbFHrFF;
    public o5 x50lh2ztY7Y5;

    private final void setRippleState(boolean z) {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.dgRBjINgWbAK;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.wdg6QnbFHrFF;
        long longValue = currentAnimationTimeMillis - (l != null ? l.longValue() : 0L);
        if (z || longValue >= 5) {
            int[] iArr = z ? cpQdD2nAriOS : r3s1LDPKFs1S;
            to2 to2Var = this.rtx2ld2ELZv4;
            if (to2Var != null) {
                to2Var.setState(iArr);
            }
        } else {
            BRwzKIf41E4i bRwzKIf41E4i = new BRwzKIf41E4i(9, this);
            this.dgRBjINgWbAK = bRwzKIf41E4i;
            postDelayed(bRwzKIf41E4i, 50L);
        }
        this.wdg6QnbFHrFF = Long.valueOf(currentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$1(rw1 rw1Var) {
        to2 to2Var = rw1Var.rtx2ld2ELZv4;
        if (to2Var != null) {
            to2Var.setState(r3s1LDPKFs1S);
        }
        rw1Var.dgRBjINgWbAK = null;
    }

    public final void TSizfFm2Yiuu() {
        this.x50lh2ztY7Y5 = null;
        BRwzKIf41E4i bRwzKIf41E4i = this.dgRBjINgWbAK;
        if (bRwzKIf41E4i != null) {
            removeCallbacks(bRwzKIf41E4i);
            BRwzKIf41E4i bRwzKIf41E4i2 = this.dgRBjINgWbAK;
            bRwzKIf41E4i2.getClass();
            bRwzKIf41E4i2.run();
        } else {
            to2 to2Var = this.rtx2ld2ELZv4;
            if (to2Var != null) {
                to2Var.setState(r3s1LDPKFs1S);
            }
        }
        to2 to2Var2 = this.rtx2ld2ELZv4;
        if (to2Var2 == null) {
            return;
        }
        to2Var2.setVisible(false, false);
        unscheduleDrawable(to2Var2);
    }

    public final void Y1f8riQaR6yg() {
        setRippleState(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            TSizfFm2Yiuu();
        }
    }

    public final void e9gEMXR7LXtO(int i, long j, long j2) {
        to2 to2Var = this.rtx2ld2ELZv4;
        if (to2Var == null) {
            return;
        }
        if (to2Var.getRadius() != i) {
            to2Var.setRadius(i);
        }
        float f = Build.VERSION.SDK_INT < 28 ? 0.2f : 0.1f;
        if (f > 1.0f) {
            f = 1.0f;
        }
        long lS5Rgt96tfkO = hl.lS5Rgt96tfkO(j2, f);
        hl hlVar = to2Var.OPXfSBeufaJ8;
        if (!(hlVar == null ? false : hl.TSizfFm2Yiuu(hlVar.PxuCJdSBwIXG, lS5Rgt96tfkO))) {
            to2Var.OPXfSBeufaJ8 = new hl(lS5Rgt96tfkO);
            to2Var.setColor(ColorStateList.valueOf(mm2.ngxnMNrpiKat(lS5Rgt96tfkO)));
        }
        Rect rect = new Rect(0, 0, b51.IXK6ba3ucyzm(Float.intBitsToFloat((int) (j >> 32))), b51.IXK6ba3ucyzm(Float.intBitsToFloat((int) (j & 4294967295L))));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        to2Var.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        o5 o5Var = this.x50lh2ztY7Y5;
        if (o5Var != null) {
            o5Var.PxuCJdSBwIXG();
        }
    }

    public final void lS5Rgt96tfkO(wp1 wp1Var, boolean z, long j, int i, long j2, o5 o5Var) {
        if (this.rtx2ld2ELZv4 == null || !Boolean.valueOf(z).equals(this.OPXfSBeufaJ8)) {
            to2 to2Var = new to2(z);
            setBackground(to2Var);
            this.rtx2ld2ELZv4 = to2Var;
            this.OPXfSBeufaJ8 = Boolean.valueOf(z);
        }
        to2 to2Var2 = this.rtx2ld2ELZv4;
        to2Var2.getClass();
        this.x50lh2ztY7Y5 = o5Var;
        e9gEMXR7LXtO(i, j, j2);
        if (z) {
            to2Var2.setHotspot(Float.intBitsToFloat((int) (wp1Var.PxuCJdSBwIXG >> 32)), Float.intBitsToFloat((int) (wp1Var.PxuCJdSBwIXG & 4294967295L)));
        } else {
            to2Var2.setHotspot(to2Var2.getBounds().centerX(), to2Var2.getBounds().centerY());
        }
        setRippleState(true);
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
