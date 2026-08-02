package x;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: x.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1520i extends C1519h {
    @Override // x.C1519h
    public final Typeface K(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f15971h, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.n.invoke(null, newInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    @Override // x.C1519h
    public final Method N(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, String.class, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
