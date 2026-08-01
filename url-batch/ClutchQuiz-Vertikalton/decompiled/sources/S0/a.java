package S0;

import A.c;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import com.clutchquizarena.app.R;
import l.C0204b0;
import u0.AbstractC0361a;

/* loaded from: classes.dex */
public final class a extends C0204b0 {
    public static int h(Context context, TypedArray typedArray, int... iArr) {
        int i = -1;
        for (int i2 = 0; i2 < iArr.length && i < 0; i2++) {
            int i3 = iArr[i2];
            TypedValue typedValue = new TypedValue();
            if (typedArray.getValue(i3, typedValue) && typedValue.type == 2) {
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
                obtainStyledAttributes.recycle();
                i = dimensionPixelSize;
            } else {
                i = typedArray.getDimensionPixelSize(i3, -1);
            }
        }
        return i;
    }

    @Override // l.C0204b0, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (c.v0(context, R.attr.textAppearanceLineHeightEnabled, true)) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(i, AbstractC0361a.f3741q);
            int h = h(getContext(), obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (h >= 0) {
                setLineHeight(h);
            }
        }
    }
}
