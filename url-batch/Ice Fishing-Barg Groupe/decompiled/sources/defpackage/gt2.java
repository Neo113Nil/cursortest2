package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class gt2 extends ot2 {
    public static Field BRwzKIf41E4i = null;
    public static Class QrzZRwfaDlRX = null;
    public static boolean cpQdD2nAriOS = false;
    public static Field gPXPFXrUH4XX;
    public static Method r3s1LDPKFs1S;
    public int OPXfSBeufaJ8;
    public wp0 RAsUl2FVSrh6;
    public final WindowInsets TSizfFm2Yiuu;
    public wp0[] Y1f8riQaR6yg;
    public rt2 a92UlCVFR9N8;
    public Rect[][] dgRBjINgWbAK;
    public wp0 e9gEMXR7LXtO;
    public int rtx2ld2ELZv4;
    public int wdg6QnbFHrFF;
    public Rect[][] x50lh2ztY7Y5;

    public gt2(rt2 rt2Var, WindowInsets windowInsets) {
        super(rt2Var);
        this.e9gEMXR7LXtO = null;
        this.dgRBjINgWbAK = new Rect[10][];
        this.x50lh2ztY7Y5 = new Rect[10][];
        this.TSizfFm2Yiuu = windowInsets;
    }

    private static void EpkonXwzFgDB() {
        try {
            r3s1LDPKFs1S = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            QrzZRwfaDlRX = cls;
            gPXPFXrUH4XX = cls.getDeclaredField("mVisibleInsets");
            BRwzKIf41E4i = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            gPXPFXrUH4XX.setAccessible(true);
            BRwzKIf41E4i.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        cpQdD2nAriOS = true;
    }

    private static List<Rect> aF05bpZJlKEP(Rect[][] rectArr, int i) {
        Rect[] rectArr2;
        Rect[] rectArr3 = null;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && (rectArr2 = rectArr[jh0.VhhvGxCb8gfr(i2)]) != null) {
                if (rectArr3 == null) {
                    rectArr3 = rectArr2;
                } else {
                    Rect[] rectArr4 = new Rect[rectArr3.length + rectArr2.length];
                    System.arraycopy(rectArr3, 0, rectArr4, 0, rectArr3.length);
                    System.arraycopy(rectArr2, 0, rectArr4, rectArr3.length, rectArr2.length);
                    rectArr3 = rectArr4;
                }
            }
        }
        return rectArr3 == null ? Collections.EMPTY_LIST : Arrays.asList(rectArr3);
    }

    private n00 jyegZNwi31qc(View view) {
        Display display;
        if (view == null || (display = view.getDisplay()) == null) {
            return null;
        }
        Point point = new Point();
        display.getRealSize(point);
        if (this.PxuCJdSBwIXG.PxuCJdSBwIXG.RfyTYNmI9Srp()) {
            return n00.PxuCJdSBwIXG(point.x, point.y, true, 0, 0, 0, 0);
        }
        nx1 S2OOm9zPNm0h = f2.S2OOm9zPNm0h(display, 0);
        nx1 S2OOm9zPNm0h2 = f2.S2OOm9zPNm0h(display, 1);
        nx1 S2OOm9zPNm0h3 = f2.S2OOm9zPNm0h(display, 2);
        nx1 S2OOm9zPNm0h4 = f2.S2OOm9zPNm0h(display, 3);
        return n00.PxuCJdSBwIXG(point.x, point.y, false, S2OOm9zPNm0h != null ? S2OOm9zPNm0h.lS5Rgt96tfkO : 0, S2OOm9zPNm0h2 != null ? S2OOm9zPNm0h2.lS5Rgt96tfkO : 0, S2OOm9zPNm0h3 != null ? S2OOm9zPNm0h3.lS5Rgt96tfkO : 0, S2OOm9zPNm0h4 != null ? S2OOm9zPNm0h4.lS5Rgt96tfkO : 0);
    }

    private Rect[] kpCQ9veP6n3I(wp0 wp0Var) {
        ArrayList arrayList = new ArrayList();
        int i = wp0Var.PxuCJdSBwIXG;
        int i2 = wp0Var.Y1f8riQaR6yg;
        int i3 = wp0Var.TSizfFm2Yiuu;
        int i4 = wp0Var.lS5Rgt96tfkO;
        if (i != 0) {
            arrayList.add(new Rect(0, 0, wp0Var.PxuCJdSBwIXG, this.OPXfSBeufaJ8));
        }
        if (i4 != 0) {
            arrayList.add(new Rect(0, 0, this.wdg6QnbFHrFF, i4));
        }
        if (i3 != 0) {
            int i5 = this.wdg6QnbFHrFF;
            arrayList.add(new Rect(i5 - i3, 0, i5, this.OPXfSBeufaJ8));
        }
        if (i2 != 0) {
            int i6 = this.OPXfSBeufaJ8;
            arrayList.add(new Rect(0, i6 - i2, this.wdg6QnbFHrFF, i6));
        }
        return (Rect[]) arrayList.toArray(new Rect[arrayList.size()]);
    }

    public static boolean nLZGh9p8gVSu(int i, int i2) {
        return (i & 6) == (i2 & 6);
    }

    private wp0 ozEBbv0hFTAB() {
        rt2 rt2Var = this.a92UlCVFR9N8;
        return rt2Var != null ? rt2Var.PxuCJdSBwIXG.dgRBjINgWbAK() : wp0.e9gEMXR7LXtO;
    }

    private wp0 rZjpSjn4zoMv(int i, boolean z) {
        wp0 wp0Var = wp0.e9gEMXR7LXtO;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                wp0Var = wp0.PxuCJdSBwIXG(wp0Var, BjEWd04qc7Mw(i2, z));
            }
        }
        return wp0Var;
    }

    private wp0 tmVwIGCQF4zR(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!cpQdD2nAriOS) {
            EpkonXwzFgDB();
        }
        Method method = r3s1LDPKFs1S;
        if (method != null && QrzZRwfaDlRX != null && gPXPFXrUH4XX != null) {
            try {
                Object invoke = method.invoke(view, null);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) gPXPFXrUH4XX.get(BRwzKIf41E4i.get(invoke));
                if (rect != null) {
                    return wp0.TSizfFm2Yiuu(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
        }
        return null;
    }

    @Override // defpackage.ot2
    public rt2 BRwzKIf41E4i(int i, int i2, int i3, int i4) {
        rt2 TSizfFm2Yiuu = rt2.TSizfFm2Yiuu(this.TSizfFm2Yiuu, null);
        int i5 = Build.VERSION.SDK_INT;
        ft2 et2Var = i5 >= 36 ? new et2(TSizfFm2Yiuu) : i5 >= 35 ? new dt2(TSizfFm2Yiuu) : i5 >= 34 ? new ct2(TSizfFm2Yiuu) : i5 >= 31 ? new bt2(TSizfFm2Yiuu) : i5 >= 30 ? new at2(TSizfFm2Yiuu) : i5 >= 29 ? new zs2(TSizfFm2Yiuu) : new ys2(TSizfFm2Yiuu);
        et2Var.rtx2ld2ELZv4(rt2.PxuCJdSBwIXG(cpQdD2nAriOS(), i, i2, i3, i4));
        et2Var.a92UlCVFR9N8(rt2.PxuCJdSBwIXG(dgRBjINgWbAK(), i, i2, i3, i4));
        return et2Var.lS5Rgt96tfkO();
    }

    public wp0 BjEWd04qc7Mw(int i, boolean z) {
        wp0 dgRBjINgWbAK;
        int i2;
        wp0 wp0Var = wp0.e9gEMXR7LXtO;
        if (i != 1) {
            if (i != 2) {
                if (i == 8) {
                    wp0[] wp0VarArr = this.Y1f8riQaR6yg;
                    dgRBjINgWbAK = wp0VarArr != null ? wp0VarArr[jh0.VhhvGxCb8gfr(8)] : null;
                    if (dgRBjINgWbAK != null) {
                        return dgRBjINgWbAK;
                    }
                    wp0 cpQdD2nAriOS2 = cpQdD2nAriOS();
                    wp0 ozEBbv0hFTAB = ozEBbv0hFTAB();
                    int i3 = cpQdD2nAriOS2.Y1f8riQaR6yg;
                    if (i3 > ozEBbv0hFTAB.Y1f8riQaR6yg) {
                        return wp0.TSizfFm2Yiuu(0, 0, 0, i3);
                    }
                    wp0 wp0Var2 = this.RAsUl2FVSrh6;
                    if (wp0Var2 != null && !wp0Var2.equals(wp0Var) && (i2 = this.RAsUl2FVSrh6.Y1f8riQaR6yg) > ozEBbv0hFTAB.Y1f8riQaR6yg) {
                        return wp0.TSizfFm2Yiuu(0, 0, 0, i2);
                    }
                } else {
                    if (i == 16) {
                        return x50lh2ztY7Y5();
                    }
                    if (i == 32) {
                        return wdg6QnbFHrFF();
                    }
                    if (i == 64) {
                        return r3s1LDPKFs1S();
                    }
                    if (i == 128) {
                        rt2 rt2Var = this.a92UlCVFR9N8;
                        l00 RAsUl2FVSrh6 = rt2Var != null ? rt2Var.PxuCJdSBwIXG.RAsUl2FVSrh6() : RAsUl2FVSrh6();
                        if (RAsUl2FVSrh6 != null) {
                            int i4 = Build.VERSION.SDK_INT;
                            return wp0.TSizfFm2Yiuu(i4 >= 28 ? k00.a92UlCVFR9N8(RAsUl2FVSrh6.PxuCJdSBwIXG) : 0, i4 >= 28 ? k00.rtx2ld2ELZv4(RAsUl2FVSrh6.PxuCJdSBwIXG) : 0, i4 >= 28 ? k00.RAsUl2FVSrh6(RAsUl2FVSrh6.PxuCJdSBwIXG) : 0, i4 >= 28 ? k00.e9gEMXR7LXtO(RAsUl2FVSrh6.PxuCJdSBwIXG) : 0);
                        }
                    }
                }
            } else {
                if (z) {
                    wp0 ozEBbv0hFTAB2 = ozEBbv0hFTAB();
                    wp0 dgRBjINgWbAK2 = dgRBjINgWbAK();
                    return wp0.TSizfFm2Yiuu(Math.max(ozEBbv0hFTAB2.PxuCJdSBwIXG, dgRBjINgWbAK2.PxuCJdSBwIXG), 0, Math.max(ozEBbv0hFTAB2.TSizfFm2Yiuu, dgRBjINgWbAK2.TSizfFm2Yiuu), Math.max(ozEBbv0hFTAB2.Y1f8riQaR6yg, dgRBjINgWbAK2.Y1f8riQaR6yg));
                }
                if ((this.rtx2ld2ELZv4 & 2) == 0) {
                    wp0 cpQdD2nAriOS3 = cpQdD2nAriOS();
                    rt2 rt2Var2 = this.a92UlCVFR9N8;
                    dgRBjINgWbAK = rt2Var2 != null ? rt2Var2.PxuCJdSBwIXG.dgRBjINgWbAK() : null;
                    int i5 = cpQdD2nAriOS3.Y1f8riQaR6yg;
                    if (dgRBjINgWbAK != null) {
                        i5 = Math.min(i5, dgRBjINgWbAK.Y1f8riQaR6yg);
                    }
                    return wp0.TSizfFm2Yiuu(cpQdD2nAriOS3.PxuCJdSBwIXG, 0, cpQdD2nAriOS3.TSizfFm2Yiuu, i5);
                }
            }
        } else {
            if (z) {
                return wp0.TSizfFm2Yiuu(0, Math.max(ozEBbv0hFTAB().lS5Rgt96tfkO, cpQdD2nAriOS().lS5Rgt96tfkO), 0, 0);
            }
            if ((this.rtx2ld2ELZv4 & 4) == 0) {
                return wp0.TSizfFm2Yiuu(0, cpQdD2nAriOS().lS5Rgt96tfkO, 0, 0);
            }
        }
        return wp0Var;
    }

    @Override // defpackage.ot2
    public boolean EcgxDIVH5in8(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && !J54yh1s3n4Aq(i2)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.ot2
    public void IAToe7bXGz4N(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.dgRBjINgWbAK = (Rect[][]) rectArr.clone();
    }

    public boolean J54yh1s3n4Aq(int i) {
        if (i != 1 && i != 2) {
            if (i == 4) {
                return false;
            }
            if (i != 8 && i != 128) {
                return true;
            }
        }
        return !BjEWd04qc7Mw(i, false).equals(wp0.e9gEMXR7LXtO);
    }

    @Override // defpackage.ot2
    public wp0 OPXfSBeufaJ8(int i) {
        return rZjpSjn4zoMv(i, true);
    }

    @Override // defpackage.ot2
    public void QrzZRwfaDlRX(View view) {
        jyegZNwi31qc(view);
    }

    @Override // defpackage.ot2
    public boolean RfyTYNmI9Srp() {
        return this.TSizfFm2Yiuu.isRound();
    }

    @Override // defpackage.ot2
    public void S2OOm9zPNm0h(rt2 rt2Var) {
        this.a92UlCVFR9N8 = rt2Var;
    }

    @Override // defpackage.ot2
    public void VhhvGxCb8gfr(wp0[] wp0VarArr) {
        this.Y1f8riQaR6yg = wp0VarArr;
    }

    @Override // defpackage.ot2
    public void Y1f8riQaR6yg(View view) {
        this.wdg6QnbFHrFF = view.getWidth();
        this.OPXfSBeufaJ8 = view.getHeight();
        wp0 tmVwIGCQF4zR = tmVwIGCQF4zR(view);
        if (tmVwIGCQF4zR == null) {
            tmVwIGCQF4zR = wp0.e9gEMXR7LXtO;
        }
        xfACYKDMU6Dj(tmVwIGCQF4zR);
    }

    @Override // defpackage.ot2
    public List<Rect> a92UlCVFR9N8(int i) {
        return aF05bpZJlKEP(this.x50lh2ztY7Y5, i);
    }

    @Override // defpackage.ot2
    public final wp0 cpQdD2nAriOS() {
        if (this.e9gEMXR7LXtO == null) {
            WindowInsets windowInsets = this.TSizfFm2Yiuu;
            this.e9gEMXR7LXtO = wp0.TSizfFm2Yiuu(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.e9gEMXR7LXtO;
    }

    @Override // defpackage.ot2
    public void e6tOsSdd2EFb(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.x50lh2ztY7Y5 = (Rect[][]) rectArr.clone();
    }

    @Override // defpackage.ot2
    public List<Rect> e9gEMXR7LXtO(int i) {
        return aF05bpZJlKEP(this.dgRBjINgWbAK, i);
    }

    @Override // defpackage.ot2
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        gt2 gt2Var = (gt2) obj;
        return Objects.equals(this.RAsUl2FVSrh6, gt2Var.RAsUl2FVSrh6) && nLZGh9p8gVSu(this.rtx2ld2ELZv4, gt2Var.rtx2ld2ELZv4);
    }

    @Override // defpackage.ot2
    public void gPXPFXrUH4XX() {
        for (int i = 1; i <= 512; i <<= 1) {
            int VhhvGxCb8gfr = jh0.VhhvGxCb8gfr(i);
            this.dgRBjINgWbAK[VhhvGxCb8gfr] = kpCQ9veP6n3I(rtx2ld2ELZv4(i));
            if (i != 8) {
                this.x50lh2ztY7Y5[VhhvGxCb8gfr] = kpCQ9veP6n3I(OPXfSBeufaJ8(i));
            }
        }
    }

    @Override // defpackage.ot2
    public void pnx5pC0XzaCw(int i) {
        this.rtx2ld2ELZv4 = i;
    }

    @Override // defpackage.ot2
    public wp0 rtx2ld2ELZv4(int i) {
        return rZjpSjn4zoMv(i, false);
    }

    public void xfACYKDMU6Dj(wp0 wp0Var) {
        this.RAsUl2FVSrh6 = wp0Var;
    }

    @Override // defpackage.ot2
    public void S9EYkSpbGuxq(n00 n00Var) {
    }
}
