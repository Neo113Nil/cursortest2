package M;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public abstract class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Field f756a;

    /* renamed from: b, reason: collision with root package name */
    public static final Field f757b;

    /* renamed from: c, reason: collision with root package name */
    public static final Field f758c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f759d;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            f756a = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f757b = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f758c = declaredField3;
            declaredField3.setAccessible(true);
            f759d = true;
        } catch (ReflectiveOperationException e) {
            Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e.getMessage(), e);
        }
    }
}
