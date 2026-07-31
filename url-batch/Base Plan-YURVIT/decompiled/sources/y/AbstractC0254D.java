package y;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* renamed from: y.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0254D {

    /* renamed from: a, reason: collision with root package name */
    public static final Field f3102a;

    /* renamed from: b, reason: collision with root package name */
    public static final Field f3103b;

    /* renamed from: c, reason: collision with root package name */
    public static final Field f3104c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f3105d;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            f3102a = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f3103b = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f3104c = declaredField3;
            declaredField3.setAccessible(true);
            f3105d = true;
        } catch (ReflectiveOperationException e2) {
            Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e2.getMessage(), e2);
        }
    }
}
