package defpackage;

import android.graphics.drawable.Drawable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jk {
    public static final boolean a;
    public static final Method b;
    public static final Field c;
    public static final Field d;
    public static final Field e;
    public static final Field f;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    static {
        Method method;
        Field field;
        Field field2;
        Field field3;
        boolean z;
        Field field4;
        try {
            Class<?> cls = Class.forName("android.graphics.Insets");
            method = Drawable.class.getMethod("getOpticalInsets", null);
            try {
                field = cls.getField("left");
                try {
                    field2 = cls.getField("top");
                    try {
                        field3 = cls.getField("right");
                        try {
                            field4 = cls.getField("bottom");
                            z = true;
                        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused) {
                            z = false;
                            field4 = null;
                            if (z) {
                            }
                        }
                    } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused2) {
                        field3 = null;
                    }
                } catch (ClassNotFoundException unused3) {
                    field2 = null;
                    field3 = field2;
                    z = false;
                    field4 = null;
                    if (z) {
                    }
                } catch (NoSuchFieldException unused4) {
                    field2 = null;
                    field3 = field2;
                    z = false;
                    field4 = null;
                    if (z) {
                    }
                } catch (NoSuchMethodException unused5) {
                    field2 = null;
                    field3 = field2;
                    z = false;
                    field4 = null;
                    if (z) {
                    }
                }
            } catch (ClassNotFoundException unused6) {
                field = null;
                field2 = field;
                field3 = field2;
                z = false;
                field4 = null;
                if (z) {
                }
            } catch (NoSuchFieldException unused7) {
                field = null;
                field2 = field;
                field3 = field2;
                z = false;
                field4 = null;
                if (z) {
                }
            } catch (NoSuchMethodException unused8) {
                field = null;
                field2 = field;
                field3 = field2;
                z = false;
                field4 = null;
                if (z) {
                }
            }
        } catch (ClassNotFoundException unused9) {
            method = null;
            field = null;
        } catch (NoSuchFieldException unused10) {
            method = null;
            field = null;
        } catch (NoSuchMethodException unused11) {
            method = null;
            field = null;
        }
        if (z) {
            b = null;
            c = null;
            d = null;
            e = null;
            f = null;
            a = false;
            return;
        }
        b = method;
        c = field;
        d = field2;
        e = field3;
        f = field4;
        a = true;
    }
}
