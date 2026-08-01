package M0;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import j.d;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f668a = {R.attr.theme, com.fortuneink.neonpad.R.attr.theme};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f669b = {com.fortuneink.neonpad.R.attr.materialThemeOverlay};

    public static Context a(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f669b, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        boolean z2 = (context instanceof d) && ((d) context).f2810a == resourceId;
        if (resourceId == 0 || z2) {
            return context;
        }
        d dVar = new d(context, resourceId);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f668a);
        int resourceId2 = obtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = obtainStyledAttributes2.getResourceId(1, 0);
        obtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            dVar.getTheme().applyStyle(resourceId2, true);
        }
        return dVar;
    }
}
