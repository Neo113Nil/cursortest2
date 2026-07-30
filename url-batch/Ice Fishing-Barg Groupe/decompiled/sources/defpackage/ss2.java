package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.ice.fishing.grenza.R;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ss2 extends ws2 {
    public static final PathInterpolator e9gEMXR7LXtO = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final r70 a92UlCVFR9N8 = new r70();
    public static final DecelerateInterpolator RAsUl2FVSrh6 = new DecelerateInterpolator(1.5f);
    public static final AccelerateInterpolator rtx2ld2ELZv4 = new AccelerateInterpolator(1.5f);

    public static void OPXfSBeufaJ8(View view, xs2 xs2Var, cr1 cr1Var) {
        ns2 wdg6QnbFHrFF = wdg6QnbFHrFF(view);
        if (wdg6QnbFHrFF != null) {
            wdg6QnbFHrFF.e9gEMXR7LXtO(xs2Var, cr1Var);
            if (wdg6QnbFHrFF.OPXfSBeufaJ8 == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                OPXfSBeufaJ8(viewGroup.getChildAt(i), xs2Var, cr1Var);
            }
        }
    }

    public static void RAsUl2FVSrh6(View view, xs2 xs2Var, rt2 rt2Var, boolean z) {
        ns2 wdg6QnbFHrFF = wdg6QnbFHrFF(view);
        if (wdg6QnbFHrFF != null) {
            wdg6QnbFHrFF.rtx2ld2ELZv4 = rt2Var;
            if (!z) {
                wdg6QnbFHrFF.TSizfFm2Yiuu(xs2Var);
                z = wdg6QnbFHrFF.OPXfSBeufaJ8 == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                RAsUl2FVSrh6(viewGroup.getChildAt(i), xs2Var, rt2Var, z);
            }
        }
    }

    public static void a92UlCVFR9N8(xs2 xs2Var, View view) {
        ns2 wdg6QnbFHrFF = wdg6QnbFHrFF(view);
        if (wdg6QnbFHrFF != null) {
            wdg6QnbFHrFF.lS5Rgt96tfkO(xs2Var);
            if (wdg6QnbFHrFF.OPXfSBeufaJ8 == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                a92UlCVFR9N8(xs2Var, viewGroup.getChildAt(i));
            }
        }
    }

    public static void rtx2ld2ELZv4(View view, rt2 rt2Var, List list) {
        ns2 wdg6QnbFHrFF = wdg6QnbFHrFF(view);
        if (wdg6QnbFHrFF != null) {
            rt2Var = wdg6QnbFHrFF.Y1f8riQaR6yg(rt2Var, list);
            if (wdg6QnbFHrFF.OPXfSBeufaJ8 == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                rtx2ld2ELZv4(viewGroup.getChildAt(i), rt2Var, list);
            }
        }
    }

    public static ns2 wdg6QnbFHrFF(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof rs2) {
            return ((rs2) tag).PxuCJdSBwIXG;
        }
        return null;
    }
}
