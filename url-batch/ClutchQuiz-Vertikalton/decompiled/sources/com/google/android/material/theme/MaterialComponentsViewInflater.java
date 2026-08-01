package com.google.android.material.theme;

import C0.d;
import I0.k;
import K0.a;
import Q.c;
import R0.w;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import com.clutchquizarena.app.R;
import com.google.android.material.button.MaterialButton;
import g.C0122C;
import l.C0184C;
import l.C0204b0;
import l.C0229o;
import l.C0233q;
import u0.AbstractC0361a;

/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends C0122C {
    @Override // g.C0122C
    public final C0229o a(Context context, AttributeSet attributeSet) {
        return new w(context, attributeSet);
    }

    @Override // g.C0122C
    public final AppCompatButton b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // g.C0122C
    public final C0233q c(Context context, AttributeSet attributeSet) {
        return new d(context, attributeSet);
    }

    @Override // g.C0122C
    public final C0184C d(Context context, AttributeSet attributeSet) {
        a aVar = new a(T0.a.a(context, attributeSet, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = aVar.getContext();
        TypedArray f2 = k.f(context2, attributeSet, AbstractC0361a.f3739o, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (f2.hasValue(0)) {
            c.c(aVar, A.c.H(context2, f2, 0));
        }
        aVar.f462f = f2.getBoolean(1, false);
        f2.recycle();
        return aVar;
    }

    @Override // g.C0122C
    public final C0204b0 e(Context context, AttributeSet attributeSet) {
        S0.a aVar = new S0.a(T0.a.a(context, attributeSet, android.R.attr.textViewStyle, 0), attributeSet, android.R.attr.textViewStyle);
        Context context2 = aVar.getContext();
        if (A.c.v0(context2, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = AbstractC0361a.f3742r;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
            int h = S0.a.h(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (h == -1) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, AbstractC0361a.f3741q);
                    int h2 = S0.a.h(aVar.getContext(), obtainStyledAttributes3, 1, 2);
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
