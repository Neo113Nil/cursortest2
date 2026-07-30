package androidx.lifecycle;

import android.os.Looper;
import i.C0174a;
import j.C0175a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class j extends f {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1522a;

    /* renamed from: b, reason: collision with root package name */
    public C0175a f1523b;

    /* renamed from: c, reason: collision with root package name */
    public e f1524c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakReference f1525d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1526e;

    /* renamed from: f, reason: collision with root package name */
    public final P0.q f1527f;

    public j(i iVar) {
        new AtomicReference();
        this.f1522a = true;
        this.f1523b = new C0175a();
        e eVar = e.f1516f;
        this.f1524c = eVar;
        new ArrayList();
        this.f1525d = new WeakReference(iVar);
        this.f1527f = new P0.q(eVar);
    }

    public final void a(d dVar) {
        e eVar;
        C0174a c0174a;
        F0.i.e(dVar, "event");
        if (this.f1522a) {
            if (C0174a.f2344j != null) {
                c0174a = C0174a.f2344j;
            } else {
                synchronized (C0174a.class) {
                    try {
                        if (C0174a.f2344j == null) {
                            C0174a.f2344j = new C0174a(0);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                c0174a = C0174a.f2344j;
            }
            ((C0174a) c0174a.f2345i).getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException("Method handleLifecycleEvent must be called on the main thread");
            }
        }
        int i2 = c.f1514a[dVar.ordinal()];
        e eVar2 = e.f1515e;
        switch (i2) {
            case 1:
            case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                eVar = e.f1517g;
                break;
            case F.k.INTEGER_FIELD_NUMBER /* 3 */:
            case F.k.LONG_FIELD_NUMBER /* 4 */:
                eVar = e.f1518h;
                break;
            case F.k.STRING_FIELD_NUMBER /* 5 */:
                eVar = e.f1519i;
                break;
            case F.k.STRING_SET_FIELD_NUMBER /* 6 */:
                eVar = eVar2;
                break;
            default:
                throw new IllegalArgumentException(dVar + " has no target state");
        }
        e eVar3 = this.f1524c;
        if (eVar3 == eVar) {
            return;
        }
        e eVar4 = e.f1516f;
        WeakReference weakReference = this.f1525d;
        if (eVar3 == eVar4 && eVar == eVar2) {
            throw new IllegalStateException(("no event down from " + this.f1524c + " in component " + weakReference.get()).toString());
        }
        this.f1524c = eVar;
        if (this.f1526e) {
            return;
        }
        this.f1526e = true;
        if (((i) weakReference.get()) == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        this.f1523b.getClass();
        Object obj = this.f1524c;
        P0.q qVar = this.f1527f;
        qVar.getClass();
        if (obj == null) {
            obj = Q0.l.f852a;
        }
        qVar.b(null, obj);
        this.f1526e = false;
        if (this.f1524c == eVar2) {
            this.f1523b = new C0175a();
        }
    }
}
