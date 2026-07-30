package n;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* renamed from: n.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0734s0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f6882a;

    /* renamed from: b, reason: collision with root package name */
    public static final Method f6883b;

    /* renamed from: c, reason: collision with root package name */
    public static final Method f6884c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f6885d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            Class cls3 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
            f6882a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f6883b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f6884c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f6885d = true;
        } catch (NoSuchMethodException e7) {
            e7.printStackTrace();
        }
    }
}
