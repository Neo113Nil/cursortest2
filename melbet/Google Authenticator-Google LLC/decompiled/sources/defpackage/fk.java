package defpackage;

import android.view.InflateException;
import android.view.MenuItem;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class fk implements MenuItem.OnMenuItemClickListener {
    private static final Class[] a = {MenuItem.class};
    private final Object b;
    private Method c;

    public fk(Object obj, String str) {
        this.b = obj;
        Class<?> cls = obj.getClass();
        try {
            this.c = cls.getMethod(str, a);
        } catch (Exception e) {
            InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
            inflateException.initCause(e);
            throw inflateException;
        }
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        try {
            Class<?> returnType = this.c.getReturnType();
            Class<?> cls = Boolean.TYPE;
            Method method = this.c;
            if (returnType == cls) {
                return ((Boolean) method.invoke(this.b, menuItem)).booleanValue();
            }
            method.invoke(this.b, menuItem);
            return true;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
