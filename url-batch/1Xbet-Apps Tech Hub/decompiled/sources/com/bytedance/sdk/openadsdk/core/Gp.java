package com.bytedance.sdk.openadsdk.core;

import android.graphics.Rect;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import com.bytedance.sdk.openadsdk.utils.Pj;

/* compiled from: VisibilityChecker.java */
/* loaded from: classes2.dex */
public class Gp {
    private static boolean pvs(View view, int i) {
        float pvs = pvs(view);
        return pvs > 0.0f && pvs >= ((float) i) / 100.0f;
    }

    public static float pvs(View view) {
        if (view != null) {
            try {
                if (view.getVisibility() == 0 && view.getParent() != null) {
                    if (!view.getGlobalVisibleRect(new Rect())) {
                        return -1.0f;
                    }
                    long height = r1.height() * r1.width();
                    long height2 = view.getHeight() * view.getWidth();
                    if (height2 <= 0) {
                        return -1.0f;
                    }
                    return height / height2;
                }
            } catch (Throwable unused) {
            }
        }
        return -1.0f;
    }

    private static boolean icD(View view) {
        return view != null && view.isShown();
    }

    private static boolean icD(View view, int i) {
        return view.getWidth() >= vG(view, i) && view.getHeight() >= Jd(view, i);
    }

    private static int vG(View view, int i) {
        if (i == 3) {
            return (int) (Pj.vG(view.getContext().getApplicationContext()) * 0.7d);
        }
        return 20;
    }

    private static int Jd(View view, int i) {
        if (i == 3) {
            return Pj.Jd(view.getContext().getApplicationContext()) / 2;
        }
        return 20;
    }

    private static int icD(View view, int i, int i2) throws Throwable {
        if (view.getWindowVisibility() != 0) {
            return 4;
        }
        if (!icD(view)) {
            return 1;
        }
        if (icD(view, i2)) {
            return !pvs(view, i) ? 3 : 0;
        }
        return 6;
    }

    public static boolean pvs(View view, int i, int i2) {
        if (i2 == 1) {
            while (view != null) {
                try {
                    if (view.getVisibility() == 0) {
                        if ((view instanceof NativeExpressView) || (view instanceof BannerExpressView)) {
                            break;
                        }
                        view = (View) view.getParent();
                    } else {
                        return false;
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return icD(view, i, i2) == 0;
    }
}
