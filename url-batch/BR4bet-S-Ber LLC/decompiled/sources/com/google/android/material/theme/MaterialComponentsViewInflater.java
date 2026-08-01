package com.google.android.material.theme;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import defpackage.b5;
import defpackage.b6;
import defpackage.b9;
import defpackage.hw;
import defpackage.j6;
import defpackage.la0;
import defpackage.n3;
import defpackage.o3;
import defpackage.q3;
import defpackage.su;
import defpackage.vv;
import defpackage.y00;
import defpackage.zv;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends j6 {
    @Override // defpackage.j6
    public final n3 a(Context context, AttributeSet attributeSet) {
        return new su(context, attributeSet);
    }

    @Override // defpackage.j6
    public final o3 b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // defpackage.j6
    public final q3 c(Context context, AttributeSet attributeSet) {
        return new vv(context, attributeSet);
    }

    @Override // defpackage.j6
    public final b5 d(Context context, AttributeSet attributeSet) {
        return new zv(context, attributeSet);
    }

    @Override // defpackage.j6
    public final b6 e(Context context, AttributeSet attributeSet) {
        hw hwVar = new hw(la0.j0(context, attributeSet, R.attr.textViewStyle, 0), attributeSet, R.attr.textViewStyle);
        Context context2 = hwVar.getContext();
        if (b9.L(context2.getTheme(), com.moontiko.really.admiralcasino.R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = y00.D;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
            int g = hw.g(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (g == -1) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, y00.C);
                    int g2 = hw.g(hwVar.getContext(), obtainStyledAttributes3, 2, 4);
                    obtainStyledAttributes3.recycle();
                    if (g2 >= 0) {
                        hwVar.setLineHeight(g2);
                    }
                }
            }
        }
        return hwVar;
    }
}
