package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class frh extends AppCompatTextView {
    public frh(Context context, AttributeSet attributeSet) {
        super(frj.a(context, attributeSet, R.attr.textViewStyle, 0), attributeSet, R.attr.textViewStyle);
        Context context2 = getContext();
        if (fny.m(context2, com.google.android.apps.authenticator2.R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = fri.b;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
            int a = a(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (a != -1) {
                return;
            }
            TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
            int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
            obtainStyledAttributes2.recycle();
            if (resourceId != -1) {
                b(theme, resourceId);
            }
        }
    }

    private static int a(Context context, TypedArray typedArray, int... iArr) {
        int i = -1;
        for (int i2 = 0; i2 < 2 && i < 0; i2++) {
            i = fny.c(context, typedArray, iArr[i2], -1);
        }
        return i;
    }

    private final void b(Resources.Theme theme, int i) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i, fri.a);
        int a = a(getContext(), obtainStyledAttributes, 2, 4);
        obtainStyledAttributes.recycle();
        if (a >= 0) {
            zy.b(this, a);
        }
    }

    @Override // android.support.v7.widget.AppCompatTextView, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (fny.m(context, com.google.android.apps.authenticator2.R.attr.textAppearanceLineHeightEnabled, true)) {
            b(context.getTheme(), i);
        }
    }
}
