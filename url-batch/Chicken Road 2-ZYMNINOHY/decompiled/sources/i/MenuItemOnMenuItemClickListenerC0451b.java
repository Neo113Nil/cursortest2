package i;

import android.view.MenuItem;
import java.lang.reflect.Method;

/* renamed from: i.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC0451b implements MenuItem.OnMenuItemClickListener {

    /* renamed from: c, reason: collision with root package name */
    public static final Class[] f9243c = {MenuItem.class};

    /* renamed from: a, reason: collision with root package name */
    public Object f9244a;

    /* renamed from: b, reason: collision with root package name */
    public Method f9245b;

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Object obj = this.f9244a;
        Method method = this.f9245b;
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
