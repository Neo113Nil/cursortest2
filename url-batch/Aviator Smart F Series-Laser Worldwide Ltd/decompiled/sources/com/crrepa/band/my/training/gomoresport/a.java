package com.crrepa.band.my.training.gomoresport;

import android.view.View;
import com.moyoung.dafit.module.common.utils.o;

/* loaded from: classes3.dex */
public class a {
    public static void updateTargetViewPosition(float f8, float f9, View view, View view2) {
        int[] iArr = new int[2];
        view2.getLocationOnScreen(iArr);
        int i8 = iArr[0];
        int width = view2.getWidth() + i8;
        float width2 = ((f8 + f9) / 2.0f) - (view.getWidth() / 2.0f);
        int dp2px = o.dp2px(10.0f);
        view.setX(Math.max(i8 + dp2px, Math.min(width2, (width - view.getWidth()) - dp2px)) - i8);
    }
}
