package Q;

import F0.e;
import F0.i;
import R.c;
import R.d;
import W.b;
import android.app.Activity;
import java.lang.reflect.Proxy;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final ClassLoader f830a;

    public /* synthetic */ a(ClassLoader classLoader) {
        this.f830a = classLoader;
    }

    public d a(Object obj, e eVar, Activity activity, b bVar) {
        c cVar = new c(eVar, bVar);
        Object newProxyInstance = Proxy.newProxyInstance(this.f830a, new Class[]{b()}, cVar);
        i.d(newProxyInstance, "newProxyInstance(loader,…onsumerClass()), handler)");
        obj.getClass().getMethod("addWindowLayoutInfoListener", Activity.class, b()).invoke(obj, activity, newProxyInstance);
        return new d(obj.getClass().getMethod("removeWindowLayoutInfoListener", b()), obj, newProxyInstance);
    }

    public Class b() {
        Class<?> loadClass = this.f830a.loadClass("java.util.function.Consumer");
        i.d(loadClass, "loader.loadClass(\"java.util.function.Consumer\")");
        return loadClass;
    }
}
