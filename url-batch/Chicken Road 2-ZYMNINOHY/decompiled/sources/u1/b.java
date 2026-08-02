package u1;

import android.app.Activity;
import java.lang.reflect.Proxy;
import kotlin.jvm.internal.i;
import v1.c;
import v1.d;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ClassLoader f15506a;

    public d a(Object obj, kotlin.jvm.internal.d dVar, Activity activity, A1.b bVar) {
        c cVar = new c(dVar, bVar);
        Object newProxyInstance = Proxy.newProxyInstance(this.f15506a, new Class[]{b()}, cVar);
        i.d(newProxyInstance, "newProxyInstance(loader,…onsumerClass()), handler)");
        obj.getClass().getMethod("addWindowLayoutInfoListener", Activity.class, b()).invoke(obj, activity, newProxyInstance);
        return new d(obj.getClass().getMethod("removeWindowLayoutInfoListener", b()), obj, newProxyInstance);
    }

    public Class b() {
        Class<?> loadClass = this.f15506a.loadClass("java.util.function.Consumer");
        i.d(loadClass, "loader.loadClass(\"java.util.function.Consumer\")");
        return loadClass;
    }
}
