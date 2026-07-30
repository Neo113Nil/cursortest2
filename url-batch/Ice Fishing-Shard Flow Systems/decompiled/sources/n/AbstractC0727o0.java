package n;

import android.graphics.drawable.Drawable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: n.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0727o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f6853a;

    /* renamed from: b, reason: collision with root package name */
    public static final Method f6854b;

    /* renamed from: c, reason: collision with root package name */
    public static final Field f6855c;

    /* renamed from: d, reason: collision with root package name */
    public static final Field f6856d;

    /* renamed from: e, reason: collision with root package name */
    public static final Field f6857e;

    /* renamed from: f, reason: collision with root package name */
    public static final Field f6858f;

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    static {
        Method method;
        Field field;
        Field field2;
        Field field3;
        Field field4;
        boolean z7;
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
                        z7 = true;
                    } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused4) {
                        field4 = null;
                        z7 = false;
                        if (z7) {
                        }
                    }
                } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused5) {
                    field3 = null;
                }
            } catch (ClassNotFoundException unused6) {
                field2 = null;
                field3 = field2;
                field4 = null;
                z7 = false;
                if (z7) {
                }
            } catch (NoSuchFieldException unused7) {
                field2 = null;
                field3 = field2;
                field4 = null;
                z7 = false;
                if (z7) {
                }
            } catch (NoSuchMethodException unused8) {
                field2 = null;
                field3 = field2;
                field4 = null;
                z7 = false;
                if (z7) {
                }
            }
        } catch (ClassNotFoundException unused9) {
            field = null;
            field2 = field;
            field3 = field2;
            field4 = null;
            z7 = false;
            if (z7) {
            }
        } catch (NoSuchFieldException unused10) {
            field = null;
            field2 = field;
            field3 = field2;
            field4 = null;
            z7 = false;
            if (z7) {
            }
        } catch (NoSuchMethodException unused11) {
            field = null;
            field2 = field;
            field3 = field2;
            field4 = null;
            z7 = false;
            if (z7) {
            }
        }
        if (z7) {
            f6854b = null;
            f6855c = null;
            f6856d = null;
            f6857e = null;
            f6858f = null;
            f6853a = false;
            return;
        }
        f6854b = method;
        f6855c = field;
        f6856d = field2;
        f6857e = field3;
        f6858f = field4;
        f6853a = true;
    }
}
