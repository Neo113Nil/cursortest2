package G3;

import a.AbstractC0415a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import com.icefishing.icefishingliveapp.C5284R;
import i3.AbstractC4576a;
import m.Z;

/* loaded from: classes2.dex */
public final class a extends Z {
    public static int k(Context context, TypedArray typedArray, int... iArr) {
        int i = -1;
        for (int i4 = 0; i4 < iArr.length && i < 0; i4++) {
            int i9 = iArr[i4];
            TypedValue typedValue = new TypedValue();
            if (typedArray.getValue(i9, typedValue) && typedValue.type == 2) {
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
                obtainStyledAttributes.recycle();
                i = dimensionPixelSize;
            } else {
                i = typedArray.getDimensionPixelSize(i9, -1);
            }
        }
        return i;
    }

    @Override // m.Z, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (AbstractC0415a.A(context, C5284R.attr.textAppearanceLineHeightEnabled, true)) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(i, AbstractC4576a.f38307q);
            int k6 = k(getContext(), obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (k6 >= 0) {
                setLineHeight(k6);
            }
        }
    }
}
