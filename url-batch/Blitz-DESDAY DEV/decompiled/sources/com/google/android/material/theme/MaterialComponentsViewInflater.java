package com.google.android.material.theme;

import F0.m;
import H0.a;
import O0.x;
import S.b;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import com.winfour.neondrop.R;
import g.D;
import l.C0182d0;
import l.C0203o;
import l.C0207q;
import l.r;
import q0.AbstractC0257a;
import z0.c;
import z1.d;
import z1.l;

/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends D {
    @Override // g.D
    public final C0203o a(Context context, AttributeSet attributeSet) {
        return new x(context, attributeSet);
    }

    @Override // g.D
    public final C0207q b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // g.D
    public final r c(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // g.D
    public final l.D d(Context context, AttributeSet attributeSet) {
        a aVar = new a(Q0.a.a(context, attributeSet, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = aVar.getContext();
        TypedArray f2 = m.f(context2, attributeSet, AbstractC0257a.f3393q, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (f2.hasValue(0)) {
            b.c(aVar, d.v(context2, f2, 0));
        }
        aVar.f327f = f2.getBoolean(1, false);
        f2.recycle();
        return aVar;
    }

    @Override // g.D
    public final C0182d0 e(Context context, AttributeSet attributeSet) {
        P0.a aVar = new P0.a(Q0.a.a(context, attributeSet, android.R.attr.textViewStyle, 0), attributeSet, android.R.attr.textViewStyle);
        Context context2 = aVar.getContext();
        if (l.l0(context2, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = AbstractC0257a.f3396t;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
            int h = P0.a.h(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (h == -1) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, AbstractC0257a.f3395s);
                    int h2 = P0.a.h(aVar.getContext(), obtainStyledAttributes3, 1, 2);
                    obtainStyledAttributes3.recycle();
                    if (h2 >= 0) {
                        aVar.setLineHeight(h2);
                    }
                }
            }
        }
        return aVar;
    }
}
