package H3;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.icefishing.icefishingliveapp.C5284R;
import k.C4616d;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f1214a = {R.attr.theme, C5284R.attr.theme};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f1215b = {C5284R.attr.materialThemeOverlay};

    public static Context a(Context context, AttributeSet attributeSet, int i, int i4) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1215b, i, i4);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        boolean z8 = (context instanceof C4616d) && ((C4616d) context).f38608a == resourceId;
        if (resourceId == 0 || z8) {
            return context;
        }
        C4616d c4616d = new C4616d(context, resourceId);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f1214a);
        int resourceId2 = obtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = obtainStyledAttributes2.getResourceId(1, 0);
        obtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            c4616d.getTheme().applyStyle(resourceId2, true);
        }
        return c4616d;
    }
}
