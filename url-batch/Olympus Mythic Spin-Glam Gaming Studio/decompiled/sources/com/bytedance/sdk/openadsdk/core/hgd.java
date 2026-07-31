package com.bytedance.sdk.openadsdk.core;

import android.graphics.Rect;
import android.view.View;
import com.bytedance.sdk.openadsdk.utils.jy;

/* loaded from: classes4.dex */
public class hgd {
    private static boolean zmn(View view, int i) {
        float zmn = zmn(view);
        return zmn > 0.0f && zmn >= ((float) i) / 100.0f;
    }

    public static float zmn(View view) {
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

    private static boolean fs(View view) {
        return view != null && view.isShown();
    }

    private static boolean zmn(View view, int i, boolean z) {
        return (i == 1 && z) ? view.getWidth() > 0 && view.getHeight() > 0 : view.getWidth() >= fs(view, i) && view.getHeight() >= zn(view, i);
    }

    private static int fs(View view, int i) {
        if (i == 3) {
            return (int) (jy.zn(view.getContext().getApplicationContext()) * 0.7d);
        }
        return 20;
    }

    private static int zn(View view, int i) {
        if (i == 3) {
            return jy.btk(view.getContext().getApplicationContext()) / 2;
        }
        return 20;
    }

    private static int fs(View view, int i, int i2, boolean z) throws Throwable {
        if (view.getWindowVisibility() != 0) {
            return 4;
        }
        if (!fs(view)) {
            return 1;
        }
        if (zmn(view, i2, z)) {
            return !zmn(view, i) ? 3 : 0;
        }
        return 6;
    }

    public static boolean zmn(View view, int i, int i2, boolean z) {
        if (i2 == 1) {
            while (view != null) {
                try {
                    if (view.getVisibility() == 0) {
                        if ((view instanceof com.bytedance.sdk.openadsdk.core.iv.phc) || (view instanceof com.bytedance.sdk.openadsdk.core.fb.fb)) {
                            break;
                        }
                        view = (View) view.getParent();
                    } else {
                        return false;
                    }
                } catch (Throwable unused) {
                }
            }
            if (z) {
                i = 0;
            }
        }
        return fs(view, i, i2, z) == 0;
    }
}
