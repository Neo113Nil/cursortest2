package g;

import android.view.MenuItem;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class b implements MenuItem.OnMenuItemClickListener {

    /* renamed from: c, reason: collision with root package name */
    public static final Class[] f1890c = {MenuItem.class};

    /* renamed from: a, reason: collision with root package name */
    public Object f1891a;

    /* renamed from: b, reason: collision with root package name */
    public Method f1892b;

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Object obj = this.f1891a;
        Method method = this.f1892b;
        try {
            if (method.getReturnType() == Boolean.TYPE) {
                return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
            }
            method.invoke(obj, menuItem);
            return true;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
