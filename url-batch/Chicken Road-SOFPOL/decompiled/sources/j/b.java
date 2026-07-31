package j;

import android.view.MenuItem;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b implements MenuItem.OnMenuItemClickListener {

    /* renamed from: c, reason: collision with root package name */
    public static final Class[] f3489c = {MenuItem.class};

    /* renamed from: a, reason: collision with root package name */
    public Object f3490a;

    /* renamed from: b, reason: collision with root package name */
    public Method f3491b;

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Object obj = this.f3490a;
        Method method = this.f3491b;
        try {
            if (method.getReturnType() == Boolean.TYPE) {
                return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
            }
            method.invoke(obj, menuItem);
            return true;
        } catch (Exception e8) {
            throw new RuntimeException(e8);
        }
    }
}
