package i;

import android.view.MenuItem;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class f implements MenuItem.OnMenuItemClickListener {
    public static final Class[] c = {MenuItem.class};

    /* renamed from: a, reason: collision with root package name */
    public Object f2041a;

    /* renamed from: b, reason: collision with root package name */
    public Method f2042b;

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Object obj = this.f2041a;
        Method method = this.f2042b;
        try {
            if (method.getReturnType() == Boolean.TYPE) {
                return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
            }
            method.invoke(obj, menuItem);
            return true;
        } catch (Exception e4) {
            throw new RuntimeException(e4);
        }
    }
}
