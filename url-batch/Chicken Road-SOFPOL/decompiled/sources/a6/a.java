package a6;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f237a = {R.attr.theme, com.snovikpovik.vuevnxsj.R.attr.theme};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f238b = {com.snovikpovik.vuevnxsj.R.attr.materialThemeOverlay};

    public static Context a(Context context, AttributeSet attributeSet, int i, int i8) {
        return b(context, attributeSet, i, i8, new int[0]);
    }

    public static Context b(Context context, AttributeSet attributeSet, int i, int i8, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f238b, i, i8);
        int[] iArr2 = {obtainStyledAttributes.getResourceId(0, 0)};
        obtainStyledAttributes.recycle();
        int i9 = iArr2[0];
        boolean z3 = (context instanceof j.a) && ((j.a) context).f3485a == i9;
        if (i9 == 0 || z3) {
            return context;
        }
        j.a aVar = new j.a(context);
        aVar.f3485a = i9;
        int length = iArr.length;
        int[] iArr3 = new int[length];
        if (iArr.length > 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, i8);
            for (int i10 = 0; i10 < iArr.length; i10++) {
                iArr3[i10] = obtainStyledAttributes2.getResourceId(i10, 0);
            }
            obtainStyledAttributes2.recycle();
        }
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = iArr3[i11];
            if (i12 != 0) {
                aVar.getTheme().applyStyle(i12, true);
            }
        }
        TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f237a);
        int resourceId = obtainStyledAttributes3.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes3.getResourceId(1, 0);
        obtainStyledAttributes3.recycle();
        if (resourceId == 0) {
            resourceId = resourceId2;
        }
        if (resourceId != 0) {
            aVar.getTheme().applyStyle(resourceId, true);
        }
        return aVar;
    }
}
