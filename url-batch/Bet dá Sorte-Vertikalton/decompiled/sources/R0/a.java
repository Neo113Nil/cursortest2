package R0;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import j.C0139c;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f733a = {R.attr.theme, com.glasspulse.glasspulse.R.attr.theme};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f734b = {com.glasspulse.glasspulse.R.attr.materialThemeOverlay};

    public static Context a(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f734b, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        boolean z2 = (context instanceof C0139c) && ((C0139c) context).f2515a == resourceId;
        if (resourceId == 0 || z2) {
            return context;
        }
        C0139c c0139c = new C0139c(context, resourceId);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f733a);
        int resourceId2 = obtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = obtainStyledAttributes2.getResourceId(1, 0);
        obtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            c0139c.getTheme().applyStyle(resourceId2, true);
        }
        return c0139c;
    }
}
