package q2;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import j.c;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f3112a = {R.attr.theme, com.oriondriftchasers.arordrft.R.attr.theme};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f3113b = {com.oriondriftchasers.arordrft.R.attr.materialThemeOverlay};

    public static Context a(Context context, AttributeSet attributeSet, int i, int i4) {
        return b(context, attributeSet, i, i4, new int[0]);
    }

    public static Context b(Context context, AttributeSet attributeSet, int i, int i4, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3113b, i, i4);
        int[] iArr2 = {obtainStyledAttributes.getResourceId(0, 0)};
        obtainStyledAttributes.recycle();
        int i5 = iArr2[0];
        boolean z3 = (context instanceof c) && ((c) context).f1834a == i5;
        if (i5 == 0 || z3) {
            return context;
        }
        c cVar = new c(context, i5);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        if (iArr.length > 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, i4);
            for (int i6 = 0; i6 < iArr.length; i6++) {
                iArr3[i6] = obtainStyledAttributes2.getResourceId(i6, 0);
            }
            obtainStyledAttributes2.recycle();
        }
        for (int i7 = 0; i7 < length; i7++) {
            int i8 = iArr3[i7];
            if (i8 != 0) {
                cVar.getTheme().applyStyle(i8, true);
            }
        }
        TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f3112a);
        int resourceId = obtainStyledAttributes3.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes3.getResourceId(1, 0);
        obtainStyledAttributes3.recycle();
        if (resourceId == 0) {
            resourceId = resourceId2;
        }
        if (resourceId != 0) {
            cVar.getTheme().applyStyle(resourceId, true);
        }
        return cVar;
    }
}
