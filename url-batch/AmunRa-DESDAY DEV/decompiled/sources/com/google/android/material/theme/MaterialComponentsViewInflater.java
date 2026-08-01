package com.google.android.material.theme;

import C0.n;
import E0.a;
import L0.x;
import Q.b;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import com.visualfortune.eyerest.R;
import g.C0118D;
import l.C0189E;
import l.C0210d0;
import l.C0233p;
import l.C0237r;
import l.C0239s;
import o0.AbstractC0275a;
import s1.d;
import s1.l;
import w0.c;

/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends C0118D {
    @Override // g.C0118D
    public final C0233p a(Context context, AttributeSet attributeSet) {
        return new x(context, attributeSet);
    }

    @Override // g.C0118D
    public final C0237r b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // g.C0118D
    public final C0239s c(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // g.C0118D
    public final C0189E d(Context context, AttributeSet attributeSet) {
        a aVar = new a(N0.a.a(context, attributeSet, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = aVar.getContext();
        TypedArray f2 = n.f(context2, attributeSet, AbstractC0275a.f3350o, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (f2.hasValue(0)) {
            b.c(aVar, d.w(context2, f2, 0));
        }
        aVar.f165f = f2.getBoolean(1, false);
        f2.recycle();
        return aVar;
    }

    @Override // g.C0118D
    public final C0210d0 e(Context context, AttributeSet attributeSet) {
        M0.a aVar = new M0.a(N0.a.a(context, attributeSet, android.R.attr.textViewStyle, 0), attributeSet, android.R.attr.textViewStyle);
        Context context2 = aVar.getContext();
        if (l.T(context2, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = AbstractC0275a.f3353r;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
            int h = M0.a.h(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (h == -1) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, AbstractC0275a.f3352q);
                    int h2 = M0.a.h(aVar.getContext(), obtainStyledAttributes3, 1, 2);
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
