package p2;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import com.oriondriftchasers.arordrft.R;
import l.c1;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class a extends c1 {
    public static int g(Context context, TypedArray typedArray, int... iArr) {
        int i = -1;
        for (int i4 = 0; i4 < iArr.length && i < 0; i4++) {
            int i5 = iArr[i4];
            TypedValue typedValue = new TypedValue();
            if (typedArray.getValue(i5, typedValue) && typedValue.type == 2) {
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
                obtainStyledAttributes.recycle();
                i = dimensionPixelSize;
            } else {
                i = typedArray.getDimensionPixelSize(i5, -1);
            }
        }
        return i;
    }

    @Override // l.c1, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (h.a.b0(context, R.attr.textAppearanceLineHeightEnabled, true)) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(i, n1.a.f2830w);
            int g4 = g(getContext(), obtainStyledAttributes, 2, 4);
            obtainStyledAttributes.recycle();
            if (g4 >= 0) {
                setLineHeight(g4);
            }
        }
    }
}
