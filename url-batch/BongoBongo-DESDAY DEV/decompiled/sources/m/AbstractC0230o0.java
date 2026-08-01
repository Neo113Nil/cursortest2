package m;

import android.graphics.drawable.Drawable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: m.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0230o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f3153a;

    /* renamed from: b, reason: collision with root package name */
    public static final Method f3154b;

    /* renamed from: c, reason: collision with root package name */
    public static final Field f3155c;
    public static final Field d;

    /* renamed from: e, reason: collision with root package name */
    public static final Field f3156e;

    /* renamed from: f, reason: collision with root package name */
    public static final Field f3157f;

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    static {
        Method method;
        Field field;
        Field field2;
        Field field3;
        Field field4;
        boolean z2;
        Class<?> cls;
        try {
            cls = Class.forName("android.graphics.Insets");
            method = Drawable.class.getMethod("getOpticalInsets", null);
        } catch (ClassNotFoundException unused) {
            method = null;
            field = null;
        } catch (NoSuchFieldException unused2) {
            method = null;
            field = null;
        } catch (NoSuchMethodException unused3) {
            method = null;
            field = null;
        }
        try {
            field = cls.getField("left");
            try {
                field2 = cls.getField("top");
                try {
                    field3 = cls.getField("right");
                    try {
                        field4 = cls.getField("bottom");
                        z2 = true;
                    } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused4) {
                        field4 = null;
                        z2 = false;
                        if (z2) {
                        }
                    }
                } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused5) {
                    field3 = null;
                }
            } catch (ClassNotFoundException unused6) {
                field2 = null;
                field3 = field2;
                field4 = null;
                z2 = false;
                if (z2) {
                }
            } catch (NoSuchFieldException unused7) {
                field2 = null;
                field3 = field2;
                field4 = null;
                z2 = false;
                if (z2) {
                }
            } catch (NoSuchMethodException unused8) {
                field2 = null;
                field3 = field2;
                field4 = null;
                z2 = false;
                if (z2) {
                }
            }
        } catch (ClassNotFoundException unused9) {
            field = null;
            field2 = field;
            field3 = field2;
            field4 = null;
            z2 = false;
            if (z2) {
            }
        } catch (NoSuchFieldException unused10) {
            field = null;
            field2 = field;
            field3 = field2;
            field4 = null;
            z2 = false;
            if (z2) {
            }
        } catch (NoSuchMethodException unused11) {
            field = null;
            field2 = field;
            field3 = field2;
            field4 = null;
            z2 = false;
            if (z2) {
            }
        }
        if (z2) {
            f3154b = null;
            f3155c = null;
            d = null;
            f3156e = null;
            f3157f = null;
            f3153a = false;
            return;
        }
        f3154b = method;
        f3155c = field;
        d = field2;
        f3156e = field3;
        f3157f = field4;
        f3153a = true;
    }
}
