package defpackage;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ys2 extends ft2 {
    public static Constructor OPXfSBeufaJ8 = null;
    public static Field RAsUl2FVSrh6 = null;
    public static boolean rtx2ld2ELZv4 = false;
    public static boolean wdg6QnbFHrFF = false;
    public wp0 a92UlCVFR9N8;
    public WindowInsets e9gEMXR7LXtO;

    public ys2() {
        this.e9gEMXR7LXtO = wdg6QnbFHrFF();
    }

    private static WindowInsets wdg6QnbFHrFF() {
        if (!rtx2ld2ELZv4) {
            try {
                RAsUl2FVSrh6 = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e);
            }
            rtx2ld2ELZv4 = true;
        }
        Field field = RAsUl2FVSrh6;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e2);
            }
        }
        if (!wdg6QnbFHrFF) {
            try {
                OPXfSBeufaJ8 = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e3);
            }
            wdg6QnbFHrFF = true;
        }
        Constructor constructor = OPXfSBeufaJ8;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e4);
            }
        }
        return null;
    }

    @Override // defpackage.ft2
    public void a92UlCVFR9N8(wp0 wp0Var) {
        this.a92UlCVFR9N8 = wp0Var;
    }

    @Override // defpackage.ft2
    public rt2 lS5Rgt96tfkO() {
        PxuCJdSBwIXG();
        rt2 TSizfFm2Yiuu = rt2.TSizfFm2Yiuu(this.e9gEMXR7LXtO, null);
        wp0[] wp0VarArr = this.lS5Rgt96tfkO;
        ot2 ot2Var = TSizfFm2Yiuu.PxuCJdSBwIXG;
        ot2Var.VhhvGxCb8gfr(wp0VarArr);
        ot2Var.ZbWwgt3aGe7A(this.a92UlCVFR9N8);
        ot2Var.S9EYkSpbGuxq(null);
        ot2Var.IAToe7bXGz4N(this.TSizfFm2Yiuu);
        ot2Var.e6tOsSdd2EFb(this.Y1f8riQaR6yg);
        return TSizfFm2Yiuu;
    }

    @Override // defpackage.ft2
    public void rtx2ld2ELZv4(wp0 wp0Var) {
        WindowInsets windowInsets = this.e9gEMXR7LXtO;
        if (windowInsets != null) {
            this.e9gEMXR7LXtO = windowInsets.replaceSystemWindowInsets(wp0Var.PxuCJdSBwIXG, wp0Var.lS5Rgt96tfkO, wp0Var.TSizfFm2Yiuu, wp0Var.Y1f8riQaR6yg);
        }
    }

    public ys2(rt2 rt2Var) {
        super(rt2Var);
        this.e9gEMXR7LXtO = rt2Var.lS5Rgt96tfkO();
    }
}
