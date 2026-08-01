package com.google.android.material.theme;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import com.oriondriftchasers.arordrft.R;
import e2.o;
import g.f0;
import h2.a;
import l.c1;
import l.d0;
import l.p;
import l.q;
import l.r;
import o2.u;
import y1.c;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends f0 {
    @Override // g.f0
    public final p a(Context context, AttributeSet attributeSet) {
        return new u(context, attributeSet);
    }

    @Override // g.f0
    public final q b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // g.f0
    public final r c(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // g.f0
    public final d0 d(Context context, AttributeSet attributeSet) {
        a aVar = new a(q2.a.a(context, attributeSet, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = aVar.getContext();
        TypedArray f2 = o.f(context2, attributeSet, n1.a.f2827t, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (f2.hasValue(0)) {
            aVar.setButtonTintList(h.a.t(context2, f2, 0));
        }
        aVar.f1806k = f2.getBoolean(1, false);
        f2.recycle();
        return aVar;
    }

    @Override // g.f0
    public final c1 e(Context context, AttributeSet attributeSet) {
        p2.a aVar = new p2.a(q2.a.a(context, attributeSet, android.R.attr.textViewStyle, 0), attributeSet, android.R.attr.textViewStyle);
        Context context2 = aVar.getContext();
        if (h.a.b0(context2, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = n1.a.f2831x;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
            int g4 = p2.a.g(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (g4 == -1) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, n1.a.f2830w);
                    int g5 = p2.a.g(aVar.getContext(), obtainStyledAttributes3, 2, 4);
                    obtainStyledAttributes3.recycle();
                    if (g5 >= 0) {
                        aVar.setLineHeight(g5);
                    }
                }
            }
        }
        return aVar;
    }
}
