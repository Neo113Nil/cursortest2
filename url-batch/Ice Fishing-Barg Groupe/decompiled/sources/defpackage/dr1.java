package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ice.fishing.grenza.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class dr1 extends FrameLayout {
    public static final Object wdg6QnbFHrFF = new Object();
    public br1 OPXfSBeufaJ8;
    public final ArrayList rtx2ld2ELZv4;

    public dr1(Context context, List list) {
        super(context);
        this.rtx2ld2ELZv4 = new ArrayList();
        setProtections(list);
    }

    private uc2 getOrInstallSystemBarStateMonitor() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof uc2) {
            return (uc2) tag;
        }
        uc2 uc2Var = new uc2(viewGroup);
        viewGroup.setTag(R.id.tag_system_bar_state_monitor, uc2Var);
        return uc2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b1 A[LOOP:0: B:7:0x0028->B:21:0x00b1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ba A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void PxuCJdSBwIXG() {
        int i;
        int i2;
        int i3;
        ArrayList arrayList = this.rtx2ld2ELZv4;
        if (arrayList.isEmpty()) {
            lS5Rgt96tfkO();
            return;
        }
        uc2 orInstallSystemBarStateMonitor = getOrInstallSystemBarStateMonitor();
        lS5Rgt96tfkO();
        this.OPXfSBeufaJ8 = new br1(orInstallSystemBarStateMonitor, arrayList);
        int childCount = getChildCount();
        int size = this.OPXfSBeufaJ8.PxuCJdSBwIXG.size();
        for (int i4 = 0; i4 < size; i4++) {
            ol olVar = (ol) this.OPXfSBeufaJ8.PxuCJdSBwIXG.get(i4);
            Context context = getContext();
            int i5 = i4 + childCount;
            ar1 ar1Var = olVar.lS5Rgt96tfkO;
            int i6 = olVar.PxuCJdSBwIXG;
            int i7 = -1;
            if (i6 != 1) {
                if (i6 == 2) {
                    i3 = ar1Var.lS5Rgt96tfkO;
                    i2 = 48;
                } else if (i6 == 4) {
                    i = ar1Var.PxuCJdSBwIXG;
                    i2 = 5;
                } else if (i6 != 8) {
                    u9.XL4ISE6Oc65B(o0.wdg6QnbFHrFF("Unexpected side: ", i6));
                    return;
                } else {
                    i3 = ar1Var.lS5Rgt96tfkO;
                    i2 = 80;
                }
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i7, i3, i2);
                wp0 wp0Var = ar1Var.TSizfFm2Yiuu;
                layoutParams.leftMargin = wp0Var.PxuCJdSBwIXG;
                layoutParams.topMargin = wp0Var.lS5Rgt96tfkO;
                layoutParams.rightMargin = wp0Var.TSizfFm2Yiuu;
                layoutParams.bottomMargin = wp0Var.Y1f8riQaR6yg;
                View view = new View(context);
                view.setTag(wdg6QnbFHrFF);
                view.setTranslationX(ar1Var.a92UlCVFR9N8);
                view.setTranslationY(ar1Var.RAsUl2FVSrh6);
                view.setAlpha(ar1Var.rtx2ld2ELZv4);
                view.setVisibility(ar1Var.Y1f8riQaR6yg ? 0 : 8);
                view.setBackground(ar1Var.e9gEMXR7LXtO);
                cr1 cr1Var = new cr1(0, layoutParams, view);
                if (ar1Var.OPXfSBeufaJ8 == null) {
                    u9.rtx2ld2ELZv4("Trying to overwrite the existing callback. Did you send one protection to multiple ProtectionLayouts?");
                    return;
                } else {
                    ar1Var.OPXfSBeufaJ8 = cr1Var;
                    addView(view, i5, layoutParams);
                }
            } else {
                i = ar1Var.PxuCJdSBwIXG;
                i2 = 3;
            }
            i7 = i;
            i3 = -1;
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i7, i3, i2);
            wp0 wp0Var2 = ar1Var.TSizfFm2Yiuu;
            layoutParams2.leftMargin = wp0Var2.PxuCJdSBwIXG;
            layoutParams2.topMargin = wp0Var2.lS5Rgt96tfkO;
            layoutParams2.rightMargin = wp0Var2.TSizfFm2Yiuu;
            layoutParams2.bottomMargin = wp0Var2.Y1f8riQaR6yg;
            View view2 = new View(context);
            view2.setTag(wdg6QnbFHrFF);
            view2.setTranslationX(ar1Var.a92UlCVFR9N8);
            view2.setTranslationY(ar1Var.RAsUl2FVSrh6);
            view2.setAlpha(ar1Var.rtx2ld2ELZv4);
            view2.setVisibility(ar1Var.Y1f8riQaR6yg ? 0 : 8);
            view2.setBackground(ar1Var.e9gEMXR7LXtO);
            cr1 cr1Var2 = new cr1(0, layoutParams2, view2);
            if (ar1Var.OPXfSBeufaJ8 == null) {
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view != null && view.getTag() != wdg6QnbFHrFF) {
            br1 br1Var = this.OPXfSBeufaJ8;
            int childCount = getChildCount() - (br1Var != null ? br1Var.PxuCJdSBwIXG.size() : 0);
            if (i > childCount || i < 0) {
                i = childCount;
            }
        }
        super.addView(view, i, layoutParams);
    }

    public final void lS5Rgt96tfkO() {
        br1 br1Var;
        if (this.OPXfSBeufaJ8 != null) {
            removeViews(getChildCount() - this.OPXfSBeufaJ8.PxuCJdSBwIXG.size(), this.OPXfSBeufaJ8.PxuCJdSBwIXG.size());
            int size = this.OPXfSBeufaJ8.PxuCJdSBwIXG.size();
            int i = 0;
            while (true) {
                br1Var = this.OPXfSBeufaJ8;
                if (i >= size) {
                    break;
                }
                ((ol) br1Var.PxuCJdSBwIXG.get(i)).lS5Rgt96tfkO.OPXfSBeufaJ8 = null;
                i++;
            }
            ArrayList arrayList = br1Var.PxuCJdSBwIXG;
            if (!br1Var.a92UlCVFR9N8) {
                br1Var.a92UlCVFR9N8 = true;
                br1Var.lS5Rgt96tfkO.lS5Rgt96tfkO.remove(br1Var);
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    ((ol) arrayList.get(size2)).e9gEMXR7LXtO = null;
                }
                arrayList.clear();
            }
            this.OPXfSBeufaJ8 = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        PxuCJdSBwIXG();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        lS5Rgt96tfkO();
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof uc2) {
            uc2 uc2Var = (uc2) tag;
            if (uc2Var.lS5Rgt96tfkO.isEmpty()) {
                uc2Var.PxuCJdSBwIXG.post(new BRwzKIf41E4i(11, uc2Var));
                viewGroup.setTag(R.id.tag_system_bar_state_monitor, null);
            }
        }
    }

    public void setProtections(List<ol> list) {
        ArrayList arrayList = this.rtx2ld2ELZv4;
        arrayList.clear();
        arrayList.addAll(list);
        if (isAttachedToWindow()) {
            PxuCJdSBwIXG();
            requestApplyInsets();
        }
    }
}
