package com.google.android.material.theme;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import c2.a;
import com.google.android.material.button.MaterialButton;
import f.e0;
import j2.x;
import k.b0;
import k.o;
import k.p;
import k.q;
import k.z0;
import k3.d;
import t1.c;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends e0 {
    @Override // f.e0
    public final o a(Context context, AttributeSet attributeSet) {
        return new x(context, attributeSet);
    }

    @Override // f.e0
    public final p b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // f.e0
    public final q c(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // f.e0
    public final b0 d(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }

    @Override // f.e0
    public final z0 e(Context context, AttributeSet attributeSet) {
        k2.a aVar = new k2.a(l2.a.b(context, attributeSet, R.attr.textViewStyle, 0), attributeSet, R.attr.textViewStyle);
        Context context2 = aVar.getContext();
        if (d.Y(context2.getTheme(), com.gglhk.bofio.fortunetiger.R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = l1.a.f2877w;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
            int g = k2.a.g(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (g == -1) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, l1.a.f2876v);
                    int g4 = k2.a.g(aVar.getContext(), obtainStyledAttributes3, 2, 4);
                    obtainStyledAttributes3.recycle();
                    if (g4 >= 0) {
                        aVar.setLineHeight(g4);
                    }
                }
            }
        }
        return aVar;
    }
}
