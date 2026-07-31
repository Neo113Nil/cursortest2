package androidx.lifecycle;

import androidx.lifecycle.a;
import androidx.lifecycle.e;

/* loaded from: classes.dex */
class ReflectiveGenericLifecycleObserver implements g {

    /* renamed from: f, reason: collision with root package name */
    private final Object f877f;

    /* renamed from: g, reason: collision with root package name */
    private final a.C0015a f878g;

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f877f = obj;
        this.f878g = a.f880c.c(obj.getClass());
    }

    @Override // androidx.lifecycle.g
    public void d(i iVar, e.b bVar) {
        this.f878g.a(iVar, bVar, this.f877f);
    }
}
