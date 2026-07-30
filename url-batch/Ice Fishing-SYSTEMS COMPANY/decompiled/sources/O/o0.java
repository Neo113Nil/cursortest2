package O;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public abstract class o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Field f2301a;

    /* renamed from: b, reason: collision with root package name */
    public static final Field f2302b;

    /* renamed from: c, reason: collision with root package name */
    public static final Field f2303c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f2304d;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            f2301a = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f2302b = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f2303c = declaredField3;
            declaredField3.setAccessible(true);
            f2304d = true;
        } catch (ReflectiveOperationException e6) {
            Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e6.getMessage(), e6);
        }
    }
}
