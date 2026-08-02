package W;

import Q0.e;
import Q0.h;
import X.c;
import X.d;
import android.app.Activity;
import c0.C0167b;
import java.lang.reflect.Proxy;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final ClassLoader f1113a;

    public /* synthetic */ a(ClassLoader classLoader) {
        this.f1113a = classLoader;
    }

    public d a(Object obj, e eVar, Activity activity, C0167b c0167b) {
        Object newProxyInstance = Proxy.newProxyInstance(this.f1113a, new Class[]{b()}, new c(eVar, c0167b));
        h.d(newProxyInstance, "newProxyInstance(loader,…onsumerClass()), handler)");
        obj.getClass().getMethod("addWindowLayoutInfoListener", Activity.class, b()).invoke(obj, activity, newProxyInstance);
        return new d(obj.getClass().getMethod("removeWindowLayoutInfoListener", b()), obj, newProxyInstance);
    }

    public Class b() {
        Class<?> loadClass = this.f1113a.loadClass("java.util.function.Consumer");
        h.d(loadClass, "loader.loadClass(\"java.util.function.Consumer\")");
        return loadClass;
    }
}
