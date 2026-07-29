package android.arch.lifecycle;

import android.arch.lifecycle.c;

/* loaded from: classes.dex */
public class SingleGeneratedAdapterObserver implements GenericLifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    private final b f1350a;

    SingleGeneratedAdapterObserver(b bVar) {
        this.f1350a = bVar;
    }

    @Override // android.arch.lifecycle.GenericLifecycleObserver
    public void a(e eVar, c.a aVar) {
        this.f1350a.a(eVar, aVar, false, null);
        this.f1350a.a(eVar, aVar, true, null);
    }
}
