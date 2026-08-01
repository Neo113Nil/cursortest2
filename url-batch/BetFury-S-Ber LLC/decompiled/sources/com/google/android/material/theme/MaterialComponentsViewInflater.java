package com.google.android.material.theme;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import defpackage.c10;
import defpackage.c70;
import defpackage.j5;
import defpackage.j6;
import defpackage.k10;
import defpackage.mv;
import defpackage.n9;
import defpackage.r6;
import defpackage.v3;
import defpackage.w3;
import defpackage.xz;
import defpackage.y00;
import defpackage.y3;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends r6 {
    @Override // defpackage.r6
    public final v3 a(Context context, AttributeSet attributeSet) {
        return new xz(context, attributeSet);
    }

    @Override // defpackage.r6
    public final w3 b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // defpackage.r6
    public final y3 c(Context context, AttributeSet attributeSet) {
        return new y00(context, attributeSet);
    }

    @Override // defpackage.r6
    public final j5 d(Context context, AttributeSet attributeSet) {
        return new c10(context, attributeSet);
    }

    @Override // defpackage.r6
    public final j6 e(Context context, AttributeSet attributeSet) {
        k10 k10Var = new k10(mv.V(context, attributeSet, R.attr.textViewStyle, 0), attributeSet, R.attr.textViewStyle);
        Context context2 = k10Var.getContext();
        if (n9.K(context2.getTheme(), com.trembin.nirefon.betfury.R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = c70.C;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
            int g = k10.g(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (g == -1) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, c70.B);
                    int g2 = k10.g(k10Var.getContext(), obtainStyledAttributes3, 2, 4);
                    obtainStyledAttributes3.recycle();
                    if (g2 >= 0) {
                        k10Var.setLineHeight(g2);
                    }
                }
            }
        }
        return k10Var;
    }
}
