package q;

import android.app.Activity;
import e0.e;
import e0.h;
import java.lang.reflect.Proxy;
import r.c;
import r.d;
import w.C0096b;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ClassLoader f1189a;

    public d a(Object obj, e eVar, Activity activity, C0096b c0096b) {
        c cVar = new c(eVar, c0096b);
        Object newProxyInstance = Proxy.newProxyInstance(this.f1189a, new Class[]{b()}, cVar);
        h.d(newProxyInstance, "newProxyInstance(loader,…onsumerClass()), handler)");
        obj.getClass().getMethod("addWindowLayoutInfoListener", Activity.class, b()).invoke(obj, activity, newProxyInstance);
        return new d(obj.getClass().getMethod("removeWindowLayoutInfoListener", b()), obj, newProxyInstance);
    }

    public Class b() {
        Class<?> loadClass = this.f1189a.loadClass("java.util.function.Consumer");
        h.d(loadClass, "loader.loadClass(\"java.util.function.Consumer\")");
        return loadClass;
    }
}
