package androidx.lifecycle;

import android.os.Looper;
import c.C0020a;
import d.C0022a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class j extends f {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f435a;

    /* renamed from: b, reason: collision with root package name */
    public C0022a f436b;

    /* renamed from: c, reason: collision with root package name */
    public e f437c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakReference f438d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f439e;

    /* renamed from: f, reason: collision with root package name */
    public final n0.g f440f;

    public j(i iVar) {
        new AtomicReference();
        this.f435a = true;
        this.f436b = new C0022a();
        e eVar = e.f429c;
        this.f437c = eVar;
        new ArrayList();
        this.f438d = new WeakReference(iVar);
        this.f440f = new n0.g(eVar);
    }

    public final void a(d dVar) {
        e eVar;
        C0020a c0020a;
        e0.h.e(dVar, "event");
        if (this.f435a) {
            if (C0020a.f460f != null) {
                c0020a = C0020a.f460f;
            } else {
                synchronized (C0020a.class) {
                    try {
                        if (C0020a.f460f == null) {
                            C0020a.f460f = new C0020a(0);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                c0020a = C0020a.f460f;
            }
            ((C0020a) c0020a.f461e).getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException("Method handleLifecycleEvent must be called on the main thread");
            }
        }
        int i2 = c.f427a[dVar.ordinal()];
        e eVar2 = e.f428b;
        switch (i2) {
            case 1:
            case 2:
                eVar = e.f430d;
                break;
            case 3:
            case 4:
                eVar = e.f431e;
                break;
            case 5:
                eVar = e.f432f;
                break;
            case 6:
                eVar = eVar2;
                break;
            default:
                throw new IllegalArgumentException(dVar + " has no target state");
        }
        e eVar3 = this.f437c;
        if (eVar3 == eVar) {
            return;
        }
        e eVar4 = e.f429c;
        WeakReference weakReference = this.f438d;
        if (eVar3 == eVar4 && eVar == eVar2) {
            throw new IllegalStateException(("no event down from " + this.f437c + " in component " + weakReference.get()).toString());
        }
        this.f437c = eVar;
        if (this.f439e) {
            return;
        }
        this.f439e = true;
        if (((i) weakReference.get()) == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        this.f436b.getClass();
        this.f440f.c(this.f437c);
        this.f439e = false;
        if (this.f437c == eVar2) {
            this.f436b = new C0022a();
        }
    }
}
