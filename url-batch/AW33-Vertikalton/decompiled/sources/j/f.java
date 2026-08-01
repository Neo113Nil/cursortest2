package j;

import android.view.MenuItem;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class f implements MenuItem.OnMenuItemClickListener {

    /* renamed from: c, reason: collision with root package name */
    public static final Class[] f2553c = {MenuItem.class};

    /* renamed from: a, reason: collision with root package name */
    public Object f2554a;

    /* renamed from: b, reason: collision with root package name */
    public Method f2555b;

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Method method = this.f2555b;
        try {
            Class<?> returnType = method.getReturnType();
            Class<?> cls = Boolean.TYPE;
            Object obj = this.f2554a;
            if (returnType == cls) {
                return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
            }
            method.invoke(obj, menuItem);
            return true;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
