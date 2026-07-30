package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import com.ice.fishing.grenza.R;
import java.util.Objects;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class rs2 implements View.OnApplyWindowInsetsListener {
    public final ns2 PxuCJdSBwIXG;
    public rt2 lS5Rgt96tfkO;

    public rs2(View view, ns2 ns2Var) {
        rt2 rt2Var;
        this.PxuCJdSBwIXG = ns2Var;
        int i = rq2.PxuCJdSBwIXG;
        rt2 PxuCJdSBwIXG = nq2.PxuCJdSBwIXG(view);
        if (PxuCJdSBwIXG != null) {
            int i2 = Build.VERSION.SDK_INT;
            rt2Var = (i2 >= 36 ? new et2(PxuCJdSBwIXG) : i2 >= 35 ? new dt2(PxuCJdSBwIXG) : i2 >= 34 ? new ct2(PxuCJdSBwIXG) : i2 >= 31 ? new bt2(PxuCJdSBwIXG) : i2 >= 30 ? new at2(PxuCJdSBwIXG) : i2 >= 29 ? new zs2(PxuCJdSBwIXG) : new ys2(PxuCJdSBwIXG)).lS5Rgt96tfkO();
        } else {
            rt2Var = null;
        }
        this.lS5Rgt96tfkO = rt2Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int[] iArr;
        boolean z;
        if (!view.isLaidOut()) {
            this.lS5Rgt96tfkO = rt2.TSizfFm2Yiuu(windowInsets, view);
            return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }
        rt2 TSizfFm2Yiuu = rt2.TSizfFm2Yiuu(windowInsets, view);
        ot2 ot2Var = TSizfFm2Yiuu.PxuCJdSBwIXG;
        if (this.lS5Rgt96tfkO == null) {
            int i = rq2.PxuCJdSBwIXG;
            this.lS5Rgt96tfkO = nq2.PxuCJdSBwIXG(view);
        }
        if (this.lS5Rgt96tfkO == null) {
            this.lS5Rgt96tfkO = TSizfFm2Yiuu;
            if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        } else {
            ns2 wdg6QnbFHrFF = ss2.wdg6QnbFHrFF(view);
            if (wdg6QnbFHrFF == null || !Objects.equals(wdg6QnbFHrFF.rtx2ld2ELZv4, TSizfFm2Yiuu)) {
                int[] iArr2 = new int[1];
                int[] iArr3 = new int[1];
                rt2 rt2Var = this.lS5Rgt96tfkO;
                int i2 = 1;
                while (i2 <= 512) {
                    wp0 rtx2ld2ELZv4 = ot2Var.rtx2ld2ELZv4(i2);
                    wp0 rtx2ld2ELZv42 = rt2Var.PxuCJdSBwIXG.rtx2ld2ELZv4(i2);
                    int i3 = rtx2ld2ELZv4.PxuCJdSBwIXG;
                    int i4 = rtx2ld2ELZv4.Y1f8riQaR6yg;
                    int i5 = rtx2ld2ELZv4.TSizfFm2Yiuu;
                    int i6 = rtx2ld2ELZv4.lS5Rgt96tfkO;
                    int i7 = rtx2ld2ELZv42.PxuCJdSBwIXG;
                    int i8 = rtx2ld2ELZv42.Y1f8riQaR6yg;
                    int[] iArr4 = iArr2;
                    int i9 = rtx2ld2ELZv42.TSizfFm2Yiuu;
                    int i10 = rtx2ld2ELZv42.lS5Rgt96tfkO;
                    if (i3 > i7 || i6 > i10 || i5 > i9 || i4 > i8) {
                        iArr = iArr3;
                        z = true;
                    } else {
                        iArr = iArr3;
                        z = false;
                    }
                    if (z != (i3 < i7 || i6 < i10 || i5 < i9 || i4 < i8)) {
                        if (z) {
                            iArr4[0] = iArr4[0] | i2;
                        } else {
                            iArr[0] = iArr[0] | i2;
                        }
                    }
                    i2 <<= 1;
                    iArr2 = iArr4;
                    iArr3 = iArr;
                }
                int i11 = iArr2[0];
                int i12 = iArr3[0];
                int i13 = i11 | i12;
                if (i13 == 0) {
                    this.lS5Rgt96tfkO = TSizfFm2Yiuu;
                    if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                } else {
                    rt2 rt2Var2 = this.lS5Rgt96tfkO;
                    xs2 xs2Var = new xs2(i13, (i11 & 8) != 0 ? ss2.e9gEMXR7LXtO : (i12 & 8) != 0 ? ss2.a92UlCVFR9N8 : (i11 & 519) != 0 ? ss2.RAsUl2FVSrh6 : (i12 & 519) != 0 ? ss2.rtx2ld2ELZv4 : null, (i13 & 8) != 0 ? 160L : 250L);
                    xs2Var.PxuCJdSBwIXG.e9gEMXR7LXtO(0.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(xs2Var.PxuCJdSBwIXG.lS5Rgt96tfkO());
                    wp0 rtx2ld2ELZv43 = ot2Var.rtx2ld2ELZv4(i13);
                    wp0 rtx2ld2ELZv44 = rt2Var2.PxuCJdSBwIXG.rtx2ld2ELZv4(i13);
                    int min = Math.min(rtx2ld2ELZv43.PxuCJdSBwIXG, rtx2ld2ELZv44.PxuCJdSBwIXG);
                    int i14 = rtx2ld2ELZv43.lS5Rgt96tfkO;
                    int i15 = rtx2ld2ELZv44.lS5Rgt96tfkO;
                    int min2 = Math.min(i14, i15);
                    int i16 = rtx2ld2ELZv43.TSizfFm2Yiuu;
                    int i17 = rtx2ld2ELZv44.TSizfFm2Yiuu;
                    int min3 = Math.min(i16, i17);
                    int i18 = rtx2ld2ELZv43.Y1f8riQaR6yg;
                    int i19 = rtx2ld2ELZv44.Y1f8riQaR6yg;
                    cr1 cr1Var = new cr1(11, wp0.TSizfFm2Yiuu(min, min2, min3, Math.min(i18, i19)), wp0.TSizfFm2Yiuu(Math.max(rtx2ld2ELZv43.PxuCJdSBwIXG, rtx2ld2ELZv44.PxuCJdSBwIXG), Math.max(i14, i15), Math.max(i16, i17), Math.max(i18, i19)));
                    ss2.RAsUl2FVSrh6(view, xs2Var, TSizfFm2Yiuu, false);
                    duration.addUpdateListener(new os2(xs2Var, TSizfFm2Yiuu, rt2Var2, i13, view));
                    duration.addListener(new ps2(xs2Var, view));
                    qs2 qs2Var = new qs2(view, xs2Var, cr1Var, duration);
                    if (view == null) {
                        throw new NullPointerException("view == null");
                    }
                    fg1 fg1Var = new fg1(view, qs2Var);
                    view.getViewTreeObserver().addOnPreDrawListener(fg1Var);
                    view.addOnAttachStateChangeListener(fg1Var);
                    this.lS5Rgt96tfkO = TSizfFm2Yiuu;
                    if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                }
            } else if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        }
        return windowInsets;
    }
}
