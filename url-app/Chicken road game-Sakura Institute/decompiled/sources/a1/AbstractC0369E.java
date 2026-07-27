package a1;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* renamed from: a1.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0369E {

    /* renamed from: a, reason: collision with root package name */
    public static final Field f4840a;

    /* renamed from: b, reason: collision with root package name */
    public static final Field f4841b;

    /* renamed from: c, reason: collision with root package name */
    public static final Field f4842c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f4843d;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            f4840a = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f4841b = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f4842c = declaredField3;
            declaredField3.setAccessible(true);
            f4843d = true;
        } catch (ReflectiveOperationException e4) {
            Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e4.getMessage(), e4);
        }
    }
}
