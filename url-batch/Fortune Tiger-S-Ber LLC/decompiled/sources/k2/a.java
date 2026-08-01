package k2;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import com.gglhk.bofio.fortunetiger.R;
import k.z0;
import k3.d;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class a extends z0 {
    public static int g(Context context, TypedArray typedArray, int... iArr) {
        int i4 = -1;
        for (int i5 = 0; i5 < iArr.length && i4 < 0; i5++) {
            int i6 = iArr[i5];
            TypedValue typedValue = new TypedValue();
            if (typedArray.getValue(i6, typedValue) && typedValue.type == 2) {
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
                obtainStyledAttributes.recycle();
                i4 = dimensionPixelSize;
            } else {
                i4 = typedArray.getDimensionPixelSize(i6, -1);
            }
        }
        return i4;
    }

    @Override // k.z0, android.widget.TextView
    public final void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        if (d.Y(context.getTheme(), R.attr.textAppearanceLineHeightEnabled, true)) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(i4, l1.a.f2876v);
            int g = g(getContext(), obtainStyledAttributes, 2, 4);
            obtainStyledAttributes.recycle();
            if (g >= 0) {
                setLineHeight(g);
            }
        }
    }
}
