package u2;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import j.c;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f3577a = {R.attr.theme, com.gdmhkmf.belbet.R.attr.theme};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f3578b = {com.gdmhkmf.belbet.R.attr.materialThemeOverlay};

    public static Context a(int i, int i4, Context context, AttributeSet attributeSet, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3578b, i, i4);
        int[] iArr2 = {obtainStyledAttributes.getResourceId(0, 0)};
        obtainStyledAttributes.recycle();
        int i5 = iArr2[0];
        boolean z4 = (context instanceof c) && ((c) context).f2079a == i5;
        if (i5 == 0 || z4) {
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
        TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f3577a);
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

    public static Context b(Context context, AttributeSet attributeSet, int i, int i4) {
        return a(i, i4, context, attributeSet, new int[0]);
    }
}
