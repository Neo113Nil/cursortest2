package W0;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import j.C0166c;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f1266a = {R.attr.theme, com.fortunequest.neontrack.R.attr.theme};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f1267b = {com.fortunequest.neontrack.R.attr.materialThemeOverlay};

    public static Context a(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1267b, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        boolean z2 = (context instanceof C0166c) && ((C0166c) context).f3022a == resourceId;
        if (resourceId == 0 || z2) {
            return context;
        }
        C0166c c0166c = new C0166c(context, resourceId);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f1266a);
        int resourceId2 = obtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = obtainStyledAttributes2.getResourceId(1, 0);
        obtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            c0166c.getTheme().applyStyle(resourceId2, true);
        }
        return c0166c;
    }
}
