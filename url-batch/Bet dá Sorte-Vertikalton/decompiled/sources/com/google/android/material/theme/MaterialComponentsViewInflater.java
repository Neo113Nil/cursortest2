package com.google.android.material.theme;

import A0.d;
import G0.m;
import I0.a;
import P0.w;
import Q.b;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import com.glasspulse.glasspulse.R;
import com.google.android.material.button.MaterialButton;
import g.C0115D;
import l.C0183C;
import l.C0202b0;
import l.C0227o;
import l.C0231q;
import s0.AbstractC0283a;
import u1.l;

/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends C0115D {
    @Override // g.C0115D
    public final C0227o a(Context context, AttributeSet attributeSet) {
        return new w(context, attributeSet);
    }

    @Override // g.C0115D
    public final AppCompatButton b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // g.C0115D
    public final C0231q c(Context context, AttributeSet attributeSet) {
        return new d(context, attributeSet);
    }

    @Override // g.C0115D
    public final C0183C d(Context context, AttributeSet attributeSet) {
        a aVar = new a(R0.a.a(context, attributeSet, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = aVar.getContext();
        TypedArray f2 = m.f(context2, attributeSet, AbstractC0283a.f3754o, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (f2.hasValue(0)) {
            b.c(aVar, u1.d.C(context2, f2, 0));
        }
        aVar.f318f = f2.getBoolean(1, false);
        f2.recycle();
        return aVar;
    }

    @Override // g.C0115D
    public final C0202b0 e(Context context, AttributeSet attributeSet) {
        Q0.a aVar = new Q0.a(R0.a.a(context, attributeSet, android.R.attr.textViewStyle, 0), attributeSet, android.R.attr.textViewStyle);
        Context context2 = aVar.getContext();
        if (l.e0(context2, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = AbstractC0283a.f3757r;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
            int h = Q0.a.h(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (h == -1) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, AbstractC0283a.f3756q);
                    int h2 = Q0.a.h(aVar.getContext(), obtainStyledAttributes3, 1, 2);
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
