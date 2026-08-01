package com.google.android.material.theme;

import B0.o;
import D0.a;
import K0.x;
import Q.b;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import com.pairspot.fortunetiles.R;
import g.C0112D;
import l.C0208E;
import l.C0229d0;
import l.C0252p;
import l.C0256r;
import l.C0258s;
import n0.AbstractC0278a;
import q1.d;
import q1.l;
import v0.c;

/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends C0112D {
    @Override // g.C0112D
    public final C0252p a(Context context, AttributeSet attributeSet) {
        return new x(context, attributeSet);
    }

    @Override // g.C0112D
    public final C0256r b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // g.C0112D
    public final C0258s c(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // g.C0112D
    public final C0208E d(Context context, AttributeSet attributeSet) {
        a aVar = new a(M0.a.a(context, attributeSet, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = aVar.getContext();
        TypedArray f2 = o.f(context2, attributeSet, AbstractC0278a.f3271o, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (f2.hasValue(0)) {
            b.c(aVar, d.A(context2, f2, 0));
        }
        aVar.f167f = f2.getBoolean(1, false);
        f2.recycle();
        return aVar;
    }

    @Override // g.C0112D
    public final C0229d0 e(Context context, AttributeSet attributeSet) {
        L0.a aVar = new L0.a(M0.a.a(context, attributeSet, android.R.attr.textViewStyle, 0), attributeSet, android.R.attr.textViewStyle);
        Context context2 = aVar.getContext();
        if (l.P(context2, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = AbstractC0278a.f3274r;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
            int h = L0.a.h(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (h == -1) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, AbstractC0278a.f3273q);
                    int h2 = L0.a.h(aVar.getContext(), obtainStyledAttributes3, 1, 2);
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
