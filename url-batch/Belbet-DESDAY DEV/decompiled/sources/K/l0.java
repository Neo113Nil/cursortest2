package K;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public abstract class l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Field f433a;

    /* renamed from: b, reason: collision with root package name */
    public static final Field f434b;

    /* renamed from: c, reason: collision with root package name */
    public static final Field f435c;
    public static final boolean d;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            f433a = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f434b = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f435c = declaredField3;
            declaredField3.setAccessible(true);
            d = true;
        } catch (ReflectiveOperationException e2) {
            Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e2.getMessage(), e2);
        }
    }
}
