package com.google.android.material.theme;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import defpackage.d3;
import defpackage.e3;
import defpackage.e70;
import defpackage.g3;
import defpackage.gt;
import defpackage.r4;
import defpackage.r5;
import defpackage.rr;
import defpackage.us;
import defpackage.vx;
import defpackage.ys;
import defpackage.z5;
import defpackage.zo;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends z5 {
    @Override // defpackage.z5
    public final d3 a(Context context, AttributeSet attributeSet) {
        return new rr(context, attributeSet);
    }

    @Override // defpackage.z5
    public final e3 b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // defpackage.z5
    public final g3 c(Context context, AttributeSet attributeSet) {
        return new us(context, attributeSet);
    }

    @Override // defpackage.z5
    public final r4 d(Context context, AttributeSet attributeSet) {
        return new ys(context, attributeSet);
    }

    @Override // defpackage.z5
    public final r5 e(Context context, AttributeSet attributeSet) {
        gt gtVar = new gt(e70.W(context, attributeSet, R.attr.textViewStyle, 0), attributeSet, R.attr.textViewStyle);
        Context context2 = gtVar.getContext();
        if (zo.J(context2.getTheme(), com.derinko.gbini.n1casino.R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = vx.A;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
            int g = gt.g(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (g == -1) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, vx.z);
                    int g2 = gt.g(gtVar.getContext(), obtainStyledAttributes3, 2, 4);
                    obtainStyledAttributes3.recycle();
                    if (g2 >= 0) {
                        gtVar.setLineHeight(g2);
                    }
                }
            }
        }
        return gtVar;
    }
}
