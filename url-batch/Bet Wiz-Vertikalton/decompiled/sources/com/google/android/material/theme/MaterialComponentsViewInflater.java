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
import com.neonpulse.gridlogic.R;
import g.C0119D;
import l.C0190D;
import l.C0210c0;
import l.C0233o;
import l.C0237q;
import l.C0239r;
import o0.AbstractC0277a;
import w0.C0332c;
import x1.d;
import x1.l;

/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends C0119D {
    @Override // g.C0119D
    public final C0233o a(Context context, AttributeSet attributeSet) {
        return new x(context, attributeSet);
    }

    @Override // g.C0119D
    public final C0237q b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // g.C0119D
    public final C0239r c(Context context, AttributeSet attributeSet) {
        return new C0332c(context, attributeSet);
    }

    @Override // g.C0119D
    public final C0190D d(Context context, AttributeSet attributeSet) {
        a aVar = new a(N0.a.a(context, attributeSet, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = aVar.getContext();
        TypedArray f2 = n.f(context2, attributeSet, AbstractC0277a.f3251o, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (f2.hasValue(0)) {
            b.c(aVar, l.x(context2, f2, 0));
        }
        aVar.f222f = f2.getBoolean(1, false);
        f2.recycle();
        return aVar;
    }

    @Override // g.C0119D
    public final C0210c0 e(Context context, AttributeSet attributeSet) {
        M0.a aVar = new M0.a(N0.a.a(context, attributeSet, android.R.attr.textViewStyle, 0), attributeSet, android.R.attr.textViewStyle);
        Context context2 = aVar.getContext();
        if (d.Y(context2, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = AbstractC0277a.f3254r;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
            int h = M0.a.h(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (h == -1) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, AbstractC0277a.f3253q);
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
