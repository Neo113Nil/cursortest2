package androidx.appcompat.widget;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class F {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f10651a = {R.attr.state_checked};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f10652b = new int[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Rect f10653c = new Rect();

    static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final boolean f10654a;

        /* renamed from: b, reason: collision with root package name */
        private static final Method f10655b;

        /* renamed from: c, reason: collision with root package name */
        private static final Field f10656c;

        /* renamed from: d, reason: collision with root package name */
        private static final Field f10657d;

        /* renamed from: e, reason: collision with root package name */
        private static final Field f10658e;

        /* renamed from: f, reason: collision with root package name */
        private static final Field f10659f;

        /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
        static {
            Method method;
            Field field;
            Field field2;
            Field field3;
            Field field4;
            boolean z4;
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
                            z4 = true;
                        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused4) {
                            field4 = null;
                            z4 = false;
                            if (z4) {
                            }
                        }
                    } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused5) {
                        field3 = null;
                    }
                } catch (ClassNotFoundException unused6) {
                    field2 = null;
                    field3 = field2;
                    field4 = null;
                    z4 = false;
                    if (z4) {
                    }
                } catch (NoSuchFieldException unused7) {
                    field2 = null;
                    field3 = field2;
                    field4 = null;
                    z4 = false;
                    if (z4) {
                    }
                } catch (NoSuchMethodException unused8) {
                    field2 = null;
                    field3 = field2;
                    field4 = null;
                    z4 = false;
                    if (z4) {
                    }
                }
            } catch (ClassNotFoundException unused9) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z4 = false;
                if (z4) {
                }
            } catch (NoSuchFieldException unused10) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z4 = false;
                if (z4) {
                }
            } catch (NoSuchMethodException unused11) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z4 = false;
                if (z4) {
                }
            }
            if (z4) {
                f10655b = null;
                f10656c = null;
                f10657d = null;
                f10658e = null;
                f10659f = null;
                f10654a = false;
                return;
            }
            f10655b = method;
            f10656c = field;
            f10657d = field2;
            f10658e = field3;
            f10659f = field4;
            f10654a = true;
        }

        static Rect a(Drawable drawable) {
            if (Build.VERSION.SDK_INT < 29 && f10654a) {
                try {
                    Object invoke = f10655b.invoke(drawable, null);
                    if (invoke != null) {
                        return new Rect(f10656c.getInt(invoke), f10657d.getInt(invoke), f10658e.getInt(invoke), f10659f.getInt(invoke));
                    }
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
            return F.f10653c;
        }
    }

    static class b {
        static Insets a(Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }

    public static boolean a(Drawable drawable) {
        return true;
    }

    static void b(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 29 || i4 >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        c(drawable);
    }

    private static void c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f10651a);
        } else {
            drawable.setState(f10652b);
        }
        drawable.setState(state);
    }

    public static Rect d(Drawable drawable) {
        int i4;
        int i5;
        int i6;
        int i7;
        if (Build.VERSION.SDK_INT < 29) {
            return a.a(androidx.core.graphics.drawable.a.k(drawable));
        }
        Insets a4 = b.a(drawable);
        i4 = a4.left;
        i5 = a4.top;
        i6 = a4.right;
        i7 = a4.bottom;
        return new Rect(i4, i5, i6, i7);
    }

    public static PorterDuff.Mode e(int i4, PorterDuff.Mode mode) {
        if (i4 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i4 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i4 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i4) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
