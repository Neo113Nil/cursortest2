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
import com.playgen.securelock.R;
import g.C0120D;
import l.C0191D;
import l.C0213d0;
import l.C0234o;
import l.C0238q;
import l.C0240r;
import o0.AbstractC0278a;
import u1.d;
import u1.l;
import w0.c;

/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends C0120D {
    @Override // g.C0120D
    public final C0234o a(Context context, AttributeSet attributeSet) {
        return new x(context, attributeSet);
    }

    @Override // g.C0120D
    public final C0238q b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // g.C0120D
    public final C0240r c(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // g.C0120D
    public final C0191D d(Context context, AttributeSet attributeSet) {
        a aVar = new a(N0.a.a(context, attributeSet, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = aVar.getContext();
        TypedArray f2 = n.f(context2, attributeSet, AbstractC0278a.f3345o, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (f2.hasValue(0)) {
            b.c(aVar, d.D(context2, f2, 0));
        }
        aVar.f169f = f2.getBoolean(1, false);
        f2.recycle();
        return aVar;
    }

    @Override // g.C0120D
    public final C0213d0 e(Context context, AttributeSet attributeSet) {
        M0.a aVar = new M0.a(N0.a.a(context, attributeSet, android.R.attr.textViewStyle, 0), attributeSet, android.R.attr.textViewStyle);
        Context context2 = aVar.getContext();
        if (l.T(context2, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = AbstractC0278a.f3348r;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
            int h = M0.a.h(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (h == -1) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, AbstractC0278a.f3347q);
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
