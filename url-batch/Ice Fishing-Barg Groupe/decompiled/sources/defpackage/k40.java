package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class k40 extends j40 {
    @Override // defpackage.i40, defpackage.g40, defpackage.l40
    public void lS5Rgt96tfkO(wc2 wc2Var, wc2 wc2Var2, Window window, View view, boolean z, boolean z2) {
        wc2Var.getClass();
        wc2Var2.getClass();
        window.getClass();
        view.getClass();
        ng0.rZjpSjn4zoMv(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        int PxuCJdSBwIXG = wc2Var.PxuCJdSBwIXG(z);
        int PxuCJdSBwIXG2 = wc2Var2.PxuCJdSBwIXG(z2);
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            int i = 0;
            while (true) {
                if (i < viewGroup.getChildCount()) {
                    int i2 = i + 1;
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt == null) {
                        throw new IndexOutOfBoundsException();
                    }
                    Object tag = childAt.getTag();
                    if (tag instanceof List) {
                        List list = (List) tag;
                        if (list.size() == 4 && (list.get(0) instanceof ol)) {
                            for (Object obj : (Iterable) tag) {
                                if ((obj instanceof ol ? (ol) obj : null) != null) {
                                    ol olVar = (ol) obj;
                                    int i3 = olVar.PxuCJdSBwIXG;
                                    ar1 ar1Var = olVar.lS5Rgt96tfkO;
                                    ColorDrawable colorDrawable = olVar.a92UlCVFR9N8;
                                    if (i3 == 1) {
                                        olVar.RAsUl2FVSrh6 = true;
                                        if (olVar.rtx2ld2ELZv4 != PxuCJdSBwIXG2) {
                                            olVar.rtx2ld2ELZv4 = PxuCJdSBwIXG2;
                                            colorDrawable.setColor(PxuCJdSBwIXG2);
                                            ar1Var.e9gEMXR7LXtO = colorDrawable;
                                            cr1 cr1Var = ar1Var.OPXfSBeufaJ8;
                                            if (cr1Var != null) {
                                                ((View) cr1Var.wdg6QnbFHrFF).setBackground(colorDrawable);
                                            }
                                        }
                                    } else if (i3 == 2) {
                                        olVar.RAsUl2FVSrh6 = true;
                                        if (olVar.rtx2ld2ELZv4 != PxuCJdSBwIXG) {
                                            olVar.rtx2ld2ELZv4 = PxuCJdSBwIXG;
                                            colorDrawable.setColor(PxuCJdSBwIXG);
                                            ar1Var.e9gEMXR7LXtO = colorDrawable;
                                            cr1 cr1Var2 = ar1Var.OPXfSBeufaJ8;
                                            if (cr1Var2 != null) {
                                                ((View) cr1Var2.wdg6QnbFHrFF).setBackground(colorDrawable);
                                            }
                                        }
                                    } else if (i3 == 4) {
                                        olVar.RAsUl2FVSrh6 = true;
                                        if (olVar.rtx2ld2ELZv4 != PxuCJdSBwIXG2) {
                                            olVar.rtx2ld2ELZv4 = PxuCJdSBwIXG2;
                                            colorDrawable.setColor(PxuCJdSBwIXG2);
                                            ar1Var.e9gEMXR7LXtO = colorDrawable;
                                            cr1 cr1Var3 = ar1Var.OPXfSBeufaJ8;
                                            if (cr1Var3 != null) {
                                                ((View) cr1Var3.wdg6QnbFHrFF).setBackground(colorDrawable);
                                            }
                                        }
                                    } else if (i3 == 8) {
                                        olVar.RAsUl2FVSrh6 = true;
                                        if (olVar.rtx2ld2ELZv4 != PxuCJdSBwIXG2) {
                                            olVar.rtx2ld2ELZv4 = PxuCJdSBwIXG2;
                                            colorDrawable.setColor(PxuCJdSBwIXG2);
                                            ar1Var.e9gEMXR7LXtO = colorDrawable;
                                            cr1 cr1Var4 = ar1Var.OPXfSBeufaJ8;
                                            if (cr1Var4 != null) {
                                                ((View) cr1Var4.wdg6QnbFHrFF).setBackground(colorDrawable);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    i = i2;
                } else if (PxuCJdSBwIXG != 0 || PxuCJdSBwIXG2 != 0) {
                    List D0aTLcX6Uhyo = fx1.D0aTLcX6Uhyo(new ol(2, PxuCJdSBwIXG), new ol(1, PxuCJdSBwIXG2), new ol(4, PxuCJdSBwIXG2), new ol(8, PxuCJdSBwIXG2));
                    dr1 dr1Var = new dr1(((ViewGroup) view).getContext(), D0aTLcX6Uhyo);
                    dr1Var.setTag(D0aTLcX6Uhyo);
                    viewGroup.addView(dr1Var);
                }
            }
        }
        window.setNavigationBarContrastEnforced(wc2Var2.TSizfFm2Yiuu == 0);
        int i4 = Build.VERSION.SDK_INT;
        th0 vt2Var = i4 >= 35 ? new vt2(window) : i4 >= 30 ? new ut2(window) : i4 >= 26 ? new tt2(window) : new st2(window);
        vt2Var.EpkonXwzFgDB(!z);
        vt2Var.J54yh1s3n4Aq(!z2);
    }
}
