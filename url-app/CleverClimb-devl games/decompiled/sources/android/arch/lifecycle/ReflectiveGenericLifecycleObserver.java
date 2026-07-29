package android.arch.lifecycle;

import android.arch.lifecycle.a;
import android.arch.lifecycle.c;

/* loaded from: classes.dex */
class ReflectiveGenericLifecycleObserver implements GenericLifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    private final Object f1347a;

    /* renamed from: b, reason: collision with root package name */
    private final a.C0001a f1348b;

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f1347a = obj;
        this.f1348b = a.f1351a.b(this.f1347a.getClass());
    }

    @Override // android.arch.lifecycle.GenericLifecycleObserver
    public void a(e eVar, c.a aVar) {
        this.f1348b.a(eVar, aVar, this.f1347a);
    }
}
