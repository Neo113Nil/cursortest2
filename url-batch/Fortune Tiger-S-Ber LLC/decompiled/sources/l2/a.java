package l2;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import i.c;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f2881a = {R.attr.theme, com.gglhk.bofio.fortunetiger.R.attr.theme};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f2882b = {com.gglhk.bofio.fortunetiger.R.attr.materialThemeOverlay};

    public static Context a(int i4, int i5, Context context, AttributeSet attributeSet, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2882b, i4, i5);
        int[] iArr2 = {obtainStyledAttributes.getResourceId(0, 0)};
        obtainStyledAttributes.recycle();
        int i6 = iArr2[0];
        boolean z3 = (context instanceof c) && ((c) context).f2030a == i6;
        if (i6 == 0 || z3) {
            return context;
        }
        c cVar = new c(context, i6);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        if (iArr.length > 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i4, i5);
            for (int i7 = 0; i7 < iArr.length; i7++) {
                iArr3[i7] = obtainStyledAttributes2.getResourceId(i7, 0);
            }
            obtainStyledAttributes2.recycle();
        }
        for (int i8 = 0; i8 < length; i8++) {
            int i9 = iArr3[i8];
            if (i9 != 0) {
                cVar.getTheme().applyStyle(i9, true);
            }
        }
        TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f2881a);
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

    public static Context b(Context context, AttributeSet attributeSet, int i4, int i5) {
        return a(i4, i5, context, attributeSet, new int[0]);
    }
}
