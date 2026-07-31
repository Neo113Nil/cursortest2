package b0;

import android.app.Activity;
import c0.C0270c;
import c0.C0271d;
import java.lang.reflect.Proxy;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;

/* renamed from: b0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0263b {

    /* renamed from: a, reason: collision with root package name */
    public final ClassLoader f3605a;

    public C0271d a(Object obj, d dVar, Activity activity, h0.b bVar) {
        C0270c c0270c = new C0270c(dVar, bVar);
        Object newProxyInstance = Proxy.newProxyInstance(this.f3605a, new Class[]{b()}, c0270c);
        i.d(newProxyInstance, "newProxyInstance(loader,…onsumerClass()), handler)");
        obj.getClass().getMethod("addWindowLayoutInfoListener", Activity.class, b()).invoke(obj, activity, newProxyInstance);
        return new C0271d(obj.getClass().getMethod("removeWindowLayoutInfoListener", b()), obj, newProxyInstance);
    }

    public Class b() {
        Class<?> loadClass = this.f3605a.loadClass("java.util.function.Consumer");
        i.d(loadClass, "loader.loadClass(\"java.util.function.Consumer\")");
        return loadClass;
    }
}
