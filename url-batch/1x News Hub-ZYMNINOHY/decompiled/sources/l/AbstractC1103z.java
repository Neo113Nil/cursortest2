package l;

import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Field;
import y.InterfaceC1250a;

/* renamed from: l.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1103z {

    /* renamed from: a, reason: collision with root package name */
    public static final Rect f9932a = new Rect();

    /* renamed from: b, reason: collision with root package name */
    public static final Class f9933b;

    static {
        try {
            f9933b = Class.forName("android.graphics.Insets");
        } catch (ClassNotFoundException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean a(Drawable drawable) {
        if (!(drawable instanceof DrawableContainer)) {
            if (drawable instanceof InterfaceC1250a) {
                ((y.b) ((InterfaceC1250a) drawable)).getClass();
                return a(null);
            }
            if (drawable instanceof A) {
                return a(((A) drawable).f9694a);
            }
            if (drawable instanceof ScaleDrawable) {
                return a(((ScaleDrawable) drawable).getDrawable());
            }
            return true;
        }
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (!(constantState instanceof DrawableContainer.DrawableContainerState)) {
            return true;
        }
        for (Drawable drawable2 : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
            if (!a(drawable2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Rect b(Drawable drawable) {
        char c3;
        Insets opticalInsets;
        int i3;
        int i4;
        int i5;
        int i6;
        if (Build.VERSION.SDK_INT >= 29) {
            opticalInsets = drawable.getOpticalInsets();
            Rect rect = new Rect();
            i3 = opticalInsets.left;
            rect.left = i3;
            i4 = opticalInsets.right;
            rect.right = i4;
            i5 = opticalInsets.top;
            rect.top = i5;
            i6 = opticalInsets.bottom;
            rect.bottom = i6;
            return rect;
        }
        Class cls = f9933b;
        if (cls != null) {
            try {
                boolean z = drawable instanceof InterfaceC1250a;
                Object obj = drawable;
                if (z) {
                    ((y.b) ((InterfaceC1250a) drawable)).getClass();
                    obj = null;
                }
                Object invoke = obj.getClass().getMethod("getOpticalInsets", new Class[0]).invoke(obj, new Object[0]);
                if (invoke != null) {
                    Rect rect2 = new Rect();
                    for (Field field : cls.getFields()) {
                        String name = field.getName();
                        switch (name.hashCode()) {
                            case -1383228885:
                                if (name.equals("bottom")) {
                                    c3 = 3;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 115029:
                                if (name.equals("top")) {
                                    c3 = 1;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 3317767:
                                if (name.equals("left")) {
                                    c3 = 0;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 108511772:
                                if (name.equals("right")) {
                                    c3 = 2;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            default:
                                c3 = 65535;
                                break;
                        }
                        if (c3 == 0) {
                            rect2.left = field.getInt(invoke);
                        } else if (c3 == 1) {
                            rect2.top = field.getInt(invoke);
                        } else if (c3 == 2) {
                            rect2.right = field.getInt(invoke);
                        } else if (c3 == 3) {
                            rect2.bottom = field.getInt(invoke);
                        }
                    }
                    return rect2;
                }
            } catch (Exception unused) {
                Log.e("DrawableUtils", "Couldn't obtain the optical insets. Ignoring.");
            }
        }
        return f9932a;
    }

    public static PorterDuff.Mode c(int i3, PorterDuff.Mode mode) {
        if (i3 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i3 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i3 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i3) {
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
