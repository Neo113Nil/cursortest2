package a1;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public abstract class E {

    /* renamed from: a, reason: collision with root package name */
    public static final Field f3512a;

    /* renamed from: b, reason: collision with root package name */
    public static final Field f3513b;

    /* renamed from: c, reason: collision with root package name */
    public static final Field f3514c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f3515d;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            f3512a = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f3513b = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f3514c = declaredField3;
            declaredField3.setAccessible(true);
            f3515d = true;
        } catch (ReflectiveOperationException e3) {
            Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e3.getMessage(), e3);
        }
    }
}
