package androidx.lifecycle;

import android.os.Looper;
import c.C0018a;
import d.C0020a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class j extends f {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f491a;

    /* renamed from: b, reason: collision with root package name */
    public C0020a f492b;

    /* renamed from: c, reason: collision with root package name */
    public e f493c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakReference f494d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f495e;

    /* renamed from: f, reason: collision with root package name */
    public final n0.g f496f;

    public j(i iVar) {
        new AtomicReference();
        this.f491a = true;
        this.f492b = new C0020a();
        e eVar = e.f485c;
        this.f493c = eVar;
        new ArrayList();
        this.f494d = new WeakReference(iVar);
        this.f496f = new n0.g(eVar);
    }

    public final void a(d dVar) {
        e eVar;
        C0018a c0018a;
        e0.h.e(dVar, "event");
        if (this.f491a) {
            if (C0018a.f516h != null) {
                c0018a = C0018a.f516h;
            } else {
                synchronized (C0018a.class) {
                    try {
                        if (C0018a.f516h == null) {
                            C0018a.f516h = new C0018a(0);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                c0018a = C0018a.f516h;
            }
            ((C0018a) c0018a.f517g).getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException("Method handleLifecycleEvent must be called on the main thread");
            }
        }
        int i2 = c.f483a[dVar.ordinal()];
        e eVar2 = e.f484b;
        switch (i2) {
            case 1:
            case 2:
                eVar = e.f486d;
                break;
            case 3:
            case 4:
                eVar = e.f487e;
                break;
            case 5:
                eVar = e.f488f;
                break;
            case 6:
                eVar = eVar2;
                break;
            default:
                throw new IllegalArgumentException(dVar + " has no target state");
        }
        e eVar3 = this.f493c;
        if (eVar3 == eVar) {
            return;
        }
        e eVar4 = e.f485c;
        WeakReference weakReference = this.f494d;
        if (eVar3 == eVar4 && eVar == eVar2) {
            throw new IllegalStateException(("no event down from " + this.f493c + " in component " + weakReference.get()).toString());
        }
        this.f493c = eVar;
        if (this.f495e) {
            return;
        }
        this.f495e = true;
        if (((i) weakReference.get()) == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        this.f492b.getClass();
        this.f496f.c(this.f493c);
        this.f495e = false;
        if (this.f493c == eVar2) {
            this.f492b = new C0020a();
        }
    }
}
