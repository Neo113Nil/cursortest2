package com.google.android.material.theme;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import b4.d;
import com.google.android.material.button.MaterialButton;
import g.d0;
import k2.a;
import l.a0;
import l.n;
import l.o;
import l.p;
import l.z0;
import s2.u;
import z1.c;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends d0 {
    @Override // g.d0
    public final n a(Context context, AttributeSet attributeSet) {
        return new u(context, attributeSet);
    }

    @Override // g.d0
    public final o b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // g.d0
    public final p c(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // g.d0
    public final a0 d(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }

    @Override // g.d0
    public final z0 e(Context context, AttributeSet attributeSet) {
        t2.a aVar = new t2.a(u2.a.b(context, attributeSet, R.attr.textViewStyle, 0), attributeSet, R.attr.textViewStyle);
        Context context2 = aVar.getContext();
        if (d.P(context2.getTheme(), com.gdmhkmf.belbet.R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = q1.a.B;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
            int g3 = t2.a.g(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (g3 == -1) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, q1.a.A);
                    int g5 = t2.a.g(aVar.getContext(), obtainStyledAttributes3, 2, 4);
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
