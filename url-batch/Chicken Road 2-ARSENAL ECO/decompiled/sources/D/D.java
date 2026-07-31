package D;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Field;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class D {

    /* renamed from: a, reason: collision with root package name */
    public static Field f240a = null;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f241b = false;

    static {
        new WeakHashMap();
    }

    public static void a(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i7) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC0112z.d(view, context, iArr, attributeSet, typedArray, i7, 0);
        }
    }
}
