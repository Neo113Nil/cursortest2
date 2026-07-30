package l;

import android.view.MenuItem;
import java.lang.reflect.Method;

/* renamed from: l.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC0652h implements MenuItem.OnMenuItemClickListener {

    /* renamed from: c, reason: collision with root package name */
    public static final Class[] f6218c = {MenuItem.class};

    /* renamed from: a, reason: collision with root package name */
    public Object f6219a;

    /* renamed from: b, reason: collision with root package name */
    public Method f6220b;

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Object obj = this.f6219a;
        Method method = this.f6220b;
        try {
            if (method.getReturnType() == Boolean.TYPE) {
                return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
            }
            method.invoke(obj, menuItem);
            return true;
        } catch (Exception e7) {
            throw new RuntimeException(e7);
        }
    }
}
