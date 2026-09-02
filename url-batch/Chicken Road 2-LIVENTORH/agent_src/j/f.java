package j;

import android.view.MenuItem;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class f implements MenuItem.OnMenuItemClickListener {

    /* renamed from: c, reason: collision with root package name */
    public static final Class[] f1845c = {MenuItem.class};

    /* renamed from: a, reason: collision with root package name */
    public Object f1846a;

    /* renamed from: b, reason: collision with root package name */
    public Method f1847b;

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Object obj = this.f1846a;
        Method method = this.f1847b;
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
