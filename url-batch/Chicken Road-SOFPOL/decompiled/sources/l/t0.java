package l;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class t0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f4413a;

    /* renamed from: b, reason: collision with root package name */
    public static final Method f4414b;

    /* renamed from: c, reason: collision with root package name */
    public static final Method f4415c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f4416d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            Class cls3 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
            f4413a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f4414b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f4415c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f4416d = true;
        } catch (NoSuchMethodException e8) {
            e8.printStackTrace();
        }
    }
}
