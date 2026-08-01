package t2;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import b4.d;
import com.gdmhkmf.belbet.R;
import l.z0;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class a extends z0 {
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

    @Override // l.z0, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (d.P(context.getTheme(), R.attr.textAppearanceLineHeightEnabled, true)) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(i, q1.a.A);
            int g3 = g(getContext(), obtainStyledAttributes, 2, 4);
            obtainStyledAttributes.recycle();
            if (g3 >= 0) {
                setLineHeight(g3);
            }
        }
    }
}
