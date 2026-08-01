package com.bytedance.sdk.openadsdk.core.nativeexpress.pvs;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.view.Window;
import com.bytedance.sdk.openadsdk.utils.Pj;

/* compiled from: DynamicViewUtils.java */
/* loaded from: classes2.dex */
public class pvs {
    public static Pair<Float, Float> pvs(Window window, int i) {
        View decorView = window.getDecorView();
        float[] fArr = {decorView.getWidth() - (decorView.getPaddingLeft() * 2), decorView.getHeight() - (decorView.getPaddingTop() * 2)};
        fArr[0] = Pj.vG(window.getContext(), fArr[0]);
        float vG = Pj.vG(window.getContext(), fArr[1]);
        fArr[1] = vG;
        if (fArr[0] < 10.0f || vG < 10.0f) {
            fArr = pvs(window.getContext(), Pj.vG(window.getContext(), Pj.pvs()), i);
        }
        float max = Math.max(fArr[0], fArr[1]);
        float min = Math.min(fArr[0], fArr[1]);
        if (i == 1) {
            fArr[0] = min;
            fArr[1] = max;
        } else {
            fArr[0] = max;
            fArr[1] = min;
        }
        return new Pair<>(Float.valueOf(fArr[0]), Float.valueOf(fArr[1]));
    }

    private static float[] pvs(Context context, int i, int i2) {
        float pvs = pvs(context);
        float icD = icD(context);
        if ((i2 == 1) != (pvs > icD)) {
            float f = pvs + icD;
            icD = f - icD;
            pvs = f - icD;
        }
        if (i2 == 1) {
            pvs -= i;
        } else {
            icD -= i;
        }
        return new float[]{icD, pvs};
    }

    public static float pvs(Context context) {
        return Pj.vG(context, Pj.Mxy(context));
    }

    public static float icD(Context context) {
        return Pj.vG(context, Pj.Wyp(context));
    }
}
