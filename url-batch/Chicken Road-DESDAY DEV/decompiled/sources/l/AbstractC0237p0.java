package l;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* renamed from: l.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0237p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f2975a;

    /* renamed from: b, reason: collision with root package name */
    public static final Method f2976b;

    /* renamed from: c, reason: collision with root package name */
    public static final Method f2977c;
    public static final boolean d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            Class cls3 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
            f2975a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f2976b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f2977c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            d = true;
        } catch (NoSuchMethodException e2) {
            e2.printStackTrace();
        }
    }
}
