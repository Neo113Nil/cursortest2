package com.google.android.material.theme;

import F0.d;
import H1.l;
import L0.k;
import N0.a;
import Q.b;
import U0.w;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.fortunequest.neontrack.R;
import com.google.android.material.button.MaterialButton;
import g.C0115D;
import l.C0206C;
import l.C0223a0;
import l.C0250o;
import l.C0254q;
import l.C0256r;
import x0.AbstractC0393a;

/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends C0115D {
    @Override // g.C0115D
    public final C0250o a(Context context, AttributeSet attributeSet) {
        return new w(context, attributeSet);
    }

    @Override // g.C0115D
    public final C0254q b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // g.C0115D
    public final C0256r c(Context context, AttributeSet attributeSet) {
        return new d(context, attributeSet);
    }

    @Override // g.C0115D
    public final C0206C d(Context context, AttributeSet attributeSet) {
        a aVar = new a(W0.a.a(context, attributeSet, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = aVar.getContext();
        TypedArray f2 = k.f(context2, attributeSet, AbstractC0393a.f4554o, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (f2.hasValue(0)) {
            b.c(aVar, l.B(context2, f2, 0));
        }
        aVar.f837f = f2.getBoolean(1, false);
        f2.recycle();
        return aVar;
    }

    @Override // g.C0115D
    public final C0223a0 e(Context context, AttributeSet attributeSet) {
        V0.a aVar = new V0.a(W0.a.a(context, attributeSet, android.R.attr.textViewStyle, 0), attributeSet, android.R.attr.textViewStyle);
        Context context2 = aVar.getContext();
        if (H1.d.e0(context2, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = AbstractC0393a.f4557r;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
            int h = V0.a.h(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (h == -1) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, AbstractC0393a.f4556q);
                    int h2 = V0.a.h(aVar.getContext(), obtainStyledAttributes3, 1, 2);
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
