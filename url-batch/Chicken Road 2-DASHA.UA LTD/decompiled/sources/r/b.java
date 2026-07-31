package r;

import android.app.Activity;
import e0.e;
import e0.h;
import java.lang.reflect.Proxy;
import s.C0095c;
import s.C0096d;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ClassLoader f1234a;

    public C0096d a(Object obj, e eVar, Activity activity, x.b bVar) {
        C0095c c0095c = new C0095c(eVar, bVar);
        Object newProxyInstance = Proxy.newProxyInstance(this.f1234a, new Class[]{b()}, c0095c);
        h.d(newProxyInstance, "newProxyInstance(loader,…onsumerClass()), handler)");
        obj.getClass().getMethod("addWindowLayoutInfoListener", Activity.class, b()).invoke(obj, activity, newProxyInstance);
        return new C0096d(obj.getClass().getMethod("removeWindowLayoutInfoListener", b()), obj, newProxyInstance);
    }

    public Class b() {
        Class<?> loadClass = this.f1234a.loadClass("java.util.function.Consumer");
        h.d(loadClass, "loader.loadClass(\"java.util.function.Consumer\")");
        return loadClass;
    }
}
