package c1;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public abstract class G {

    /* renamed from: a, reason: collision with root package name */
    public static final Field f5558a;

    /* renamed from: b, reason: collision with root package name */
    public static final Field f5559b;

    /* renamed from: c, reason: collision with root package name */
    public static final Field f5560c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f5561d;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            f5558a = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f5559b = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f5560c = declaredField3;
            declaredField3.setAccessible(true);
            f5561d = true;
        } catch (ReflectiveOperationException e3) {
            Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e3.getMessage(), e3);
        }
    }
}
