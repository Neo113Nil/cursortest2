package com.google.android.material.theme;

import B0.d;
import H0.m;
import J0.a;
import Q0.x;
import S.b;
import a.AbstractC0058a;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import com.winpower.neonfit.R;
import h.D;
import n.C0248D;
import n.C0267c0;
import n.C0292p;
import n.C0296r;
import n.C0298s;
import t0.AbstractC0383a;

/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends D {
    @Override // h.D
    public final C0292p a(Context context, AttributeSet attributeSet) {
        return new x(context, attributeSet);
    }

    @Override // h.D
    public final C0296r b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // h.D
    public final C0298s c(Context context, AttributeSet attributeSet) {
        return new d(context, attributeSet);
    }

    @Override // h.D
    public final C0248D d(Context context, AttributeSet attributeSet) {
        a aVar = new a(S0.a.a(context, attributeSet, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = aVar.getContext();
        TypedArray f2 = m.f(context2, attributeSet, AbstractC0383a.f4158o, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (f2.hasValue(0)) {
            b.c(aVar, H1.d.C(context2, f2, 0));
        }
        aVar.f651f = f2.getBoolean(1, false);
        f2.recycle();
        return aVar;
    }

    @Override // h.D
    public final C0267c0 e(Context context, AttributeSet attributeSet) {
        R0.a aVar = new R0.a(S0.a.a(context, attributeSet, android.R.attr.textViewStyle, 0), attributeSet, android.R.attr.textViewStyle);
        Context context2 = aVar.getContext();
        if (AbstractC0058a.W(context2, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = AbstractC0383a.f4161r;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
            int h2 = R0.a.h(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (h2 == -1) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, AbstractC0383a.f4160q);
                    int h3 = R0.a.h(aVar.getContext(), obtainStyledAttributes3, 1, 2);
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
