package n;

import android.graphics.drawable.Drawable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: n.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0289n0 {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f3678a;

    /* renamed from: b, reason: collision with root package name */
    public static final Method f3679b;

    /* renamed from: c, reason: collision with root package name */
    public static final Field f3680c;

    /* renamed from: d, reason: collision with root package name */
    public static final Field f3681d;
    public static final Field e;

    /* renamed from: f, reason: collision with root package name */
    public static final Field f3682f;

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
            f3679b = null;
            f3680c = null;
            f3681d = null;
            e = null;
            f3682f = null;
            f3678a = false;
            return;
        }
        f3679b = method;
        f3680c = field;
        f3681d = field2;
        e = field3;
        f3682f = field4;
        f3678a = true;
    }
}
