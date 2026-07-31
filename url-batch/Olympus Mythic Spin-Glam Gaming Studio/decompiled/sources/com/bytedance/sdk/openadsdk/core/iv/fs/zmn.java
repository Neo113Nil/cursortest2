package com.bytedance.sdk.openadsdk.core.iv.fs;

import android.content.Context;
import android.os.Build;
import android.util.Pair;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.utils.jy;
import java.util.Arrays;

/* loaded from: classes15.dex */
public class zmn {
    @NonNull
    public static Pair<Float, Float> zmn(Window window, int i) {
        float[] fArr = new float[2];
        View decorView = window.getDecorView();
        int width = decorView.getWidth();
        int height = decorView.getHeight();
        int paddingLeft = decorView.getPaddingLeft();
        int paddingTop = decorView.getPaddingTop();
        if (Build.VERSION.SDK_INT >= 35) {
            fArr[0] = width - paddingLeft;
            fArr[1] = height - paddingTop;
        } else {
            fArr[0] = width - (paddingLeft * 2);
            fArr[1] = height - (paddingTop * 2);
        }
        Arrays.toString(fArr);
        fArr[0] = jy.zn(window.getContext(), fArr[0]);
        float zn = jy.zn(window.getContext(), fArr[1]);
        fArr[1] = zn;
        if (fArr[0] < 10.0f || zn < 10.0f) {
            fArr = zmn(window.getContext(), jy.zn(window.getContext(), jy.zmn()), i);
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

    private static float[] zmn(Context context, int i, int i2) {
        float zmn = zmn(context);
        float fs = fs(context);
        if ((i2 == 1) != (zmn > fs)) {
            float f = zmn + fs;
            fs = f - fs;
            zmn = f - fs;
        }
        if (i2 == 1) {
            zmn -= i;
        } else {
            fs -= i;
        }
        return new float[]{fs, zmn};
    }

    public static float zmn(Context context) {
        return jy.zn(context, jy.klz(context));
    }

    public static float fs(Context context) {
        return jy.zn(context, jy.mw(context));
    }
}
