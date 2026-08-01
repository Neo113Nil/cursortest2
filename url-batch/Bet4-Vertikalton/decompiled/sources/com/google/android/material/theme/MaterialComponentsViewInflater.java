package com.google.android.material.theme;

import D0.n;
import F0.a;
import M0.x;
import Q.b;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import com.playbag.tripgear.R;
import g.C0093D;
import l.C0180C;
import l.C0201c0;
import l.C0224o;
import l.C0226p;
import l.C0228q;
import p0.AbstractC0282a;
import w1.d;
import w1.l;
import x0.c;

/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends C0093D {
    @Override // g.C0093D
    public final C0224o a(Context context, AttributeSet attributeSet) {
        return new x(context, attributeSet);
    }

    @Override // g.C0093D
    public final C0226p b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // g.C0093D
    public final C0228q c(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // g.C0093D
    public final C0180C d(Context context, AttributeSet attributeSet) {
        a aVar = new a(O0.a.a(context, attributeSet, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = aVar.getContext();
        TypedArray f2 = n.f(context2, attributeSet, AbstractC0282a.f3441o, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (f2.hasValue(0)) {
            b.c(aVar, l.v(context2, f2, 0));
        }
        aVar.f226f = f2.getBoolean(1, false);
        f2.recycle();
        return aVar;
    }

    @Override // g.C0093D
    public final C0201c0 e(Context context, AttributeSet attributeSet) {
        N0.a aVar = new N0.a(O0.a.a(context, attributeSet, android.R.attr.textViewStyle, 0), attributeSet, android.R.attr.textViewStyle);
        Context context2 = aVar.getContext();
        if (d.f0(context2, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = AbstractC0282a.f3444r;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
            int h = N0.a.h(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (h == -1) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, AbstractC0282a.f3443q);
                    int h2 = N0.a.h(aVar.getContext(), obtainStyledAttributes3, 1, 2);
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
