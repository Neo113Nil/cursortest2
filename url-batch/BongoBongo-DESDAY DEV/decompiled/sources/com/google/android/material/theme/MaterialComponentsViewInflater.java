package com.google.android.material.theme;

import A1.d;
import A1.m;
import E0.n;
import G0.a;
import N0.x;
import R.b;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import com.winfour.winrandom.R;
import g.D;
import m.C0186D;
import m.C0208d0;
import m.C0229o;
import m.C0233q;
import m.C0235r;
import q0.AbstractC0285a;
import y0.c;

/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends D {
    @Override // g.D
    public final C0229o a(Context context, AttributeSet attributeSet) {
        return new x(context, attributeSet);
    }

    @Override // g.D
    public final C0233q b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // g.D
    public final C0235r c(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // g.D
    public final C0186D d(Context context, AttributeSet attributeSet) {
        a aVar = new a(P0.a.a(context, attributeSet, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = aVar.getContext();
        TypedArray f2 = n.f(context2, attributeSet, AbstractC0285a.f3512o, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (f2.hasValue(0)) {
            b.c(aVar, d.D(context2, f2, 0));
        }
        aVar.f285f = f2.getBoolean(1, false);
        f2.recycle();
        return aVar;
    }

    @Override // g.D
    public final C0208d0 e(Context context, AttributeSet attributeSet) {
        O0.a aVar = new O0.a(P0.a.a(context, attributeSet, android.R.attr.textViewStyle, 0), attributeSet, android.R.attr.textViewStyle);
        Context context2 = aVar.getContext();
        if (m.Y(context2, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = AbstractC0285a.f3515r;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
            int h2 = O0.a.h(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (h2 == -1) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, AbstractC0285a.f3514q);
                    int h3 = O0.a.h(aVar.getContext(), obtainStyledAttributes3, 1, 2);
                    obtainStyledAttributes3.recycle();
                    if (h3 >= 0) {
                        aVar.setLineHeight(h3);
                    }
                }
            }
        }
        return aVar;
    }
}
