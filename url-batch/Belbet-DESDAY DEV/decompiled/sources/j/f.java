package j;

import android.view.MenuItem;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class f implements MenuItem.OnMenuItemClickListener {

    /* renamed from: c, reason: collision with root package name */
    public static final Class[] f2558c = {MenuItem.class};

    /* renamed from: a, reason: collision with root package name */
    public Object f2559a;

    /* renamed from: b, reason: collision with root package name */
    public Method f2560b;

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Method method = this.f2560b;
        try {
            Class<?> returnType = method.getReturnType();
            Class<?> cls = Boolean.TYPE;
            Object obj = this.f2559a;
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
