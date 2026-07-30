package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class j extends f {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f31a;

    /* renamed from: b, reason: collision with root package name */
    public d.a f32b;

    /* renamed from: c, reason: collision with root package name */
    public e f33c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakReference f34d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f35e;

    /* renamed from: f, reason: collision with root package name */
    public final n1.g f36f;

    public j(i iVar) {
        new AtomicReference();
        this.f31a = true;
        this.f32b = new d.a();
        e eVar = e.f25c;
        this.f33c = eVar;
        new ArrayList();
        this.f34d = new WeakReference(iVar);
        this.f36f = new n1.g(eVar);
    }

    public final void a(d dVar) {
        e eVar;
        c.a aVar;
        e eVar2 = e.f24b;
        dVar.getClass();
        if (this.f31a) {
            if (c.a.f59g != null) {
                aVar = c.a.f59g;
            } else {
                synchronized (c.a.class) {
                    try {
                        if (c.a.f59g == null) {
                            c.a.f59g = new c.a(0);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                aVar = c.a.f59g;
            }
            ((c.a) aVar.f60f).getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                f0.l.b("Method handleLifecycleEvent must be called on the main thread");
                return;
            }
        }
        switch (c.f23a[dVar.ordinal()]) {
            case 1:
            case 2:
                eVar = e.f26d;
                break;
            case 3:
            case 4:
                eVar = e.f27e;
                break;
            case 5:
                eVar = e.f28f;
                break;
            case 6:
                eVar = eVar2;
                break;
            default:
                throw new IllegalArgumentException(dVar + " has no target state");
        }
        WeakReference weakReference = this.f34d;
        e eVar3 = this.f33c;
        if (eVar3 == eVar) {
            return;
        }
        if (eVar3 == e.f25c && eVar == eVar2) {
            StringBuilder sb = new StringBuilder("no event down from ");
            sb.append(this.f33c);
            Object obj = weakReference.get();
            sb.append(" in component ");
            sb.append(obj);
            throw new IllegalStateException(sb.toString().toString());
        }
        this.f33c = eVar;
        if (this.f35e) {
            return;
        }
        this.f35e = true;
        if (((i) weakReference.get()) == null) {
            f0.l.b("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
            return;
        }
        this.f32b.getClass();
        this.f36f.c(this.f33c);
        this.f35e = false;
        if (this.f33c == eVar2) {
            this.f32b = new d.a();
        }
    }
}
