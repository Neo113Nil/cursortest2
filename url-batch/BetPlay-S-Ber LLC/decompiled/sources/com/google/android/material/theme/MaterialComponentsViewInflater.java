package com.google.android.material.theme;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import defpackage.es;
import defpackage.i5;
import defpackage.i6;
import defpackage.jt;
import defpackage.l70;
import defpackage.ly;
import defpackage.nt;
import defpackage.op;
import defpackage.q6;
import defpackage.s3;
import defpackage.u3;
import defpackage.vt;
import defpackage.w3;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends q6 {
    @Override // defpackage.q6
    public final s3 a(Context context, AttributeSet attributeSet) {
        return new es(context, attributeSet);
    }

    @Override // defpackage.q6
    public final u3 b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // defpackage.q6
    public final w3 c(Context context, AttributeSet attributeSet) {
        return new jt(context, attributeSet);
    }

    @Override // defpackage.q6
    public final i5 d(Context context, AttributeSet attributeSet) {
        return new nt(context, attributeSet);
    }

    @Override // defpackage.q6
    public final i6 e(Context context, AttributeSet attributeSet) {
        vt vtVar = new vt(op.Z(context, attributeSet, R.attr.textViewStyle, 0), attributeSet, R.attr.textViewStyle);
        Context context2 = vtVar.getContext();
        if (l70.Q(context2.getTheme(), com.awerser.monnit.betplay.R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = ly.B;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
            int g = vt.g(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (g == -1) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, ly.A);
                    int g2 = vt.g(vtVar.getContext(), obtainStyledAttributes3, 2, 4);
                    obtainStyledAttributes3.recycle();
                    if (g2 >= 0) {
                        vtVar.setLineHeight(g2);
                    }
                }
            }
        }
        return vtVar;
    }
}
