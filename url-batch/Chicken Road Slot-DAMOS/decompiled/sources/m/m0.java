package m;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class m0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f6133a;

    /* renamed from: b, reason: collision with root package name */
    public static final Method f6134b;

    /* renamed from: c, reason: collision with root package name */
    public static final Method f6135c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f6136d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            Class cls3 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
            f6133a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f6134b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f6135c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f6136d = true;
        } catch (NoSuchMethodException e2) {
            e2.printStackTrace();
        }
    }
}
