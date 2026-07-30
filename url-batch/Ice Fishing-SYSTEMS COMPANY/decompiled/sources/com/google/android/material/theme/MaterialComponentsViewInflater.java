package com.google.android.material.theme;

import F3.y;
import H3.a;
import U.b;
import a.AbstractC0415a;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.bumptech.glide.d;
import com.google.android.material.button.MaterialButton;
import com.icefishing.icefishingliveapp.C5284R;
import h.C4538E;
import i3.AbstractC4576a;
import m.C4715B;
import m.C4751o;
import m.C4753p;
import m.C4755q;
import m.Z;
import q3.c;
import w3.k;
import y3.C5251a;

/* loaded from: classes2.dex */
public class MaterialComponentsViewInflater extends C4538E {
    @Override // h.C4538E
    public final C4751o a(Context context, AttributeSet attributeSet) {
        return new y(context, attributeSet);
    }

    @Override // h.C4538E
    public final C4753p b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // h.C4538E
    public final C4755q c(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // h.C4538E
    public final C4715B d(Context context, AttributeSet attributeSet) {
        C5251a c5251a = new C5251a(a.a(context, attributeSet, C5284R.attr.radioButtonStyle, C5284R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = c5251a.getContext();
        TypedArray f6 = k.f(context2, attributeSet, AbstractC4576a.f38305o, C5284R.attr.radioButtonStyle, C5284R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (f6.hasValue(0)) {
            b.c(c5251a, d.o(context2, f6, 0));
        }
        c5251a.f41883y = f6.getBoolean(1, false);
        f6.recycle();
        return c5251a;
    }

    @Override // h.C4538E
    public final Z e(Context context, AttributeSet attributeSet) {
        G3.a aVar = new G3.a(a.a(context, attributeSet, R.attr.textViewStyle, 0), attributeSet, R.attr.textViewStyle);
        Context context2 = aVar.getContext();
        if (AbstractC0415a.A(context2, C5284R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = AbstractC4576a.f38308r;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
            int k6 = G3.a.k(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (k6 == -1) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, AbstractC4576a.f38307q);
                    int k9 = G3.a.k(aVar.getContext(), obtainStyledAttributes3, 1, 2);
                    obtainStyledAttributes3.recycle();
                    if (k9 >= 0) {
                        aVar.setLineHeight(k9);
                    }
                }
            }
        }
        return aVar;
    }
}
