package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import com.moontiko.really.admiralcasino.R;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class hw extends b6 {
    public static int g(Context context, TypedArray typedArray, int... iArr) {
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

    @Override // defpackage.b6, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (b9.L(context.getTheme(), R.attr.textAppearanceLineHeightEnabled, true)) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(i, y00.C);
            int g = g(getContext(), obtainStyledAttributes, 2, 4);
            obtainStyledAttributes.recycle();
            if (g >= 0) {
                setLineHeight(g);
            }
        }
    }
}
