package com.google.android.material.theme;

import B0.o;
import D0.a;
import K0.x;
import Q.b;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.fortuneink.neonpad.R;
import com.google.android.material.button.MaterialButton;
import g.C0144F;
import l.C0235F;
import l.C0257e0;
import l.C0278p;
import l.C0282r;
import l.C0284s;
import n0.AbstractC0303a;
import q1.d;
import q1.l;
import v0.c;

/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends C0144F {
    @Override // g.C0144F
    public final C0278p a(Context context, AttributeSet attributeSet) {
        return new x(context, attributeSet);
    }

    @Override // g.C0144F
    public final C0282r b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // g.C0144F
    public final C0284s c(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // g.C0144F
    public final C0235F d(Context context, AttributeSet attributeSet) {
        a aVar = new a(M0.a.a(context, attributeSet, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = aVar.getContext();
        TypedArray f2 = o.f(context2, attributeSet, AbstractC0303a.f3642o, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (f2.hasValue(0)) {
            b.c(aVar, d.y(context2, f2, 0));
        }
        aVar.f179f = f2.getBoolean(1, false);
        f2.recycle();
        return aVar;
    }

    @Override // g.C0144F
    public final C0257e0 e(Context context, AttributeSet attributeSet) {
        L0.a aVar = new L0.a(M0.a.a(context, attributeSet, android.R.attr.textViewStyle, 0), attributeSet, android.R.attr.textViewStyle);
        Context context2 = aVar.getContext();
        if (l.e0(context2, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = AbstractC0303a.f3645r;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
            int h = L0.a.h(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (h == -1) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, AbstractC0303a.f3644q);
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
