package D;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public abstract class J {

    /* renamed from: a, reason: collision with root package name */
    public static final Field f243a;

    /* renamed from: b, reason: collision with root package name */
    public static final Field f244b;

    /* renamed from: c, reason: collision with root package name */
    public static final Field f245c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f246d;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            f243a = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f244b = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f245c = declaredField3;
            declaredField3.setAccessible(true);
            f246d = true;
        } catch (ReflectiveOperationException e4) {
            Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e4.getMessage(), e4);
        }
    }
}
