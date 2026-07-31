package S;

import P0.e;
import P0.h;
import T.c;
import T.d;
import Y.b;
import android.app.Activity;
import java.lang.reflect.Proxy;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final ClassLoader f822a;

    public /* synthetic */ a(ClassLoader classLoader) {
        this.f822a = classLoader;
    }

    public d a(Object obj, e eVar, Activity activity, b bVar) {
        c cVar = new c(eVar, bVar);
        Object newProxyInstance = Proxy.newProxyInstance(this.f822a, new Class[]{b()}, cVar);
        h.d(newProxyInstance, "newProxyInstance(loader,…onsumerClass()), handler)");
        obj.getClass().getMethod("addWindowLayoutInfoListener", Activity.class, b()).invoke(obj, activity, newProxyInstance);
        return new d(obj.getClass().getMethod("removeWindowLayoutInfoListener", b()), obj, newProxyInstance);
    }

    public Class b() {
        Class<?> loadClass = this.f822a.loadClass("java.util.function.Consumer");
        h.d(loadClass, "loader.loadClass(\"java.util.function.Consumer\")");
        return loadClass;
    }
}
