package android.arch.lifecycle;

import android.arch.lifecycle.c;

/* loaded from: classes.dex */
class FullLifecycleObserverAdapter implements GenericLifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    private final FullLifecycleObserver f1339a;

    FullLifecycleObserverAdapter(FullLifecycleObserver fullLifecycleObserver) {
        this.f1339a = fullLifecycleObserver;
    }

    @Override // android.arch.lifecycle.GenericLifecycleObserver
    public void a(e eVar, c.a aVar) {
        switch (aVar) {
            case ON_CREATE:
                this.f1339a.a(eVar);
                return;
            case ON_START:
                this.f1339a.b(eVar);
                return;
            case ON_RESUME:
                this.f1339a.c(eVar);
                return;
            case ON_PAUSE:
                this.f1339a.d(eVar);
                return;
            case ON_STOP:
                this.f1339a.e(eVar);
                return;
            case ON_DESTROY:
                this.f1339a.f(eVar);
                return;
            case ON_ANY:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
            default:
                return;
        }
    }
}
