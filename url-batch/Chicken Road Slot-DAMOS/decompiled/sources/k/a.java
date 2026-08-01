package k;

import android.view.MenuItem;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a implements MenuItem.OnMenuItemClickListener {

    /* renamed from: c, reason: collision with root package name */
    public static final Class[] f5259c = {MenuItem.class};

    /* renamed from: a, reason: collision with root package name */
    public Object f5260a;

    /* renamed from: b, reason: collision with root package name */
    public Method f5261b;

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Object obj = this.f5260a;
        Method method = this.f5261b;
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
