package b3;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Field f1326a;

    /* renamed from: b, reason: collision with root package name */
    public static final Field f1327b;

    /* renamed from: c, reason: collision with root package name */
    public static final Field f1328c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f1329d;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            f1326a = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f1327b = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f1328c = declaredField3;
            declaredField3.setAccessible(true);
            f1329d = true;
        } catch (ReflectiveOperationException e9) {
            Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e9.getMessage(), e9);
        }
    }
}
