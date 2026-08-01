package n;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* renamed from: n.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0297r0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f3701a;

    /* renamed from: b, reason: collision with root package name */
    public static final Method f3702b;

    /* renamed from: c, reason: collision with root package name */
    public static final Method f3703c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f3704d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            Class cls3 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
            f3701a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f3702b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f3703c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f3704d = true;
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
