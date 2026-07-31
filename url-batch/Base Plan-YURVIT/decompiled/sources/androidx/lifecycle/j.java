package androidx.lifecycle;

import android.os.Looper;
import j.C0179a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import k.C0182a;

/* loaded from: classes.dex */
public final class j extends f {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1612a;

    /* renamed from: b, reason: collision with root package name */
    public C0182a f1613b;

    /* renamed from: c, reason: collision with root package name */
    public e f1614c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakReference f1615d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1616e;

    /* renamed from: f, reason: collision with root package name */
    public final Z0.p f1617f;

    public j(i iVar) {
        new AtomicReference();
        this.f1612a = true;
        this.f1613b = new C0182a();
        e eVar = e.f1606f;
        this.f1614c = eVar;
        new ArrayList();
        this.f1615d = new WeakReference(iVar);
        this.f1617f = new Z0.p(eVar);
    }

    public final void a(d dVar) {
        e eVar;
        C0179a c0179a;
        e eVar2 = e.f1605e;
        P0.h.e(dVar, "event");
        if (this.f1612a) {
            if (C0179a.f2640f != null) {
                c0179a = C0179a.f2640f;
            } else {
                synchronized (C0179a.class) {
                    try {
                        if (C0179a.f2640f == null) {
                            C0179a.f2640f = new C0179a(0);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                c0179a = C0179a.f2640f;
            }
            ((C0179a) c0179a.f2641e).getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException("Method handleLifecycleEvent must be called on the main thread");
            }
        }
        switch (c.f1604a[dVar.ordinal()]) {
            case 1:
            case H.k.FLOAT_FIELD_NUMBER /* 2 */:
                eVar = e.f1607g;
                break;
            case H.k.INTEGER_FIELD_NUMBER /* 3 */:
            case H.k.LONG_FIELD_NUMBER /* 4 */:
                eVar = e.f1608h;
                break;
            case H.k.STRING_FIELD_NUMBER /* 5 */:
                eVar = e.f1609i;
                break;
            case H.k.STRING_SET_FIELD_NUMBER /* 6 */:
                eVar = eVar2;
                break;
            default:
                throw new IllegalArgumentException(dVar + " has no target state");
        }
        WeakReference weakReference = this.f1615d;
        e eVar3 = this.f1614c;
        if (eVar3 == eVar) {
            return;
        }
        if (eVar3 == e.f1606f && eVar == eVar2) {
            throw new IllegalStateException(("no event down from " + this.f1614c + " in component " + weakReference.get()).toString());
        }
        this.f1614c = eVar;
        if (this.f1616e) {
            return;
        }
        this.f1616e = true;
        if (((i) weakReference.get()) == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        this.f1613b.getClass();
        Z0.p pVar = this.f1617f;
        Object obj = this.f1614c;
        pVar.getClass();
        if (obj == null) {
            obj = a1.l.f1161a;
        }
        pVar.b(null, obj);
        this.f1616e = false;
        if (this.f1614c == eVar2) {
            this.f1613b = new C0182a();
        }
    }
}
