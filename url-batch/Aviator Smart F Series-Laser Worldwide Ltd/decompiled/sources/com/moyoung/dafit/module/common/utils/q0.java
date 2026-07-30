package com.moyoung.dafit.module.common.utils;

import android.graphics.LinearGradient;
import android.graphics.PointF;
import android.graphics.Shader;
import android.view.View;
import android.widget.TextView;

/* loaded from: classes4.dex */
public class q0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setGradientColor$0(PointF pointF, PointF pointF2, int[] iArr, float[] fArr, Shader.TileMode tileMode, TextView textView, View view, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
        textView.getPaint().setShader(new LinearGradient(pointF != null ? pointF.x : 0.0f, pointF != null ? pointF.y : 0.0f, pointF2 != null ? pointF2.x : i10 - i8, pointF2 != null ? pointF2.y : i11 - i9, iArr, fArr, tileMode != null ? tileMode : Shader.TileMode.CLAMP));
        textView.invalidate();
    }

    public static void setGradientColor(final TextView textView, final int[] iArr, final float[] fArr, final PointF pointF, final PointF pointF2, final Shader.TileMode tileMode) {
        textView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.moyoung.dafit.module.common.utils.p0
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
                q0.lambda$setGradientColor$0(pointF, pointF2, iArr, fArr, tileMode, textView, view, i8, i9, i10, i11, i12, i13, i14, i15);
            }
        });
    }

    public static void setGradientColor(TextView textView, int[] iArr) {
        setGradientColor(textView, iArr, null, null, null, null);
    }
}
