package android.arch.lifecycle;

import android.arch.lifecycle.c;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: LifecycleRegistry.java */
/* loaded from: classes.dex */
public class f extends c {

    /* renamed from: c, reason: collision with root package name */
    private final WeakReference<e> f1364c;

    /* renamed from: a, reason: collision with root package name */
    private android.arch.a.b.a<d, a> f1362a = new android.arch.a.b.a<>();

    /* renamed from: d, reason: collision with root package name */
    private int f1365d = 0;
    private boolean e = false;
    private boolean f = false;
    private ArrayList<c.b> g = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private c.b f1363b = c.b.INITIALIZED;

    public f(e eVar) {
        this.f1364c = new WeakReference<>(eVar);
    }

    public void a(c.b bVar) {
        b(bVar);
    }

    public void a(c.a aVar) {
        b(b(aVar));
    }

    private void b(c.b bVar) {
        if (this.f1363b == bVar) {
            return;
        }
        this.f1363b = bVar;
        if (this.e || this.f1365d != 0) {
            this.f = true;
            return;
        }
        this.e = true;
        d();
        this.e = false;
    }

    private boolean b() {
        if (this.f1362a.a() == 0) {
            return true;
        }
        c.b bVar = this.f1362a.d().getValue().f1368a;
        c.b bVar2 = this.f1362a.e().getValue().f1368a;
        return bVar == bVar2 && this.f1363b == bVar2;
    }

    private c.b c(d dVar) {
        Map.Entry<d, a> d2 = this.f1362a.d(dVar);
        return a(a(this.f1363b, d2 != null ? d2.getValue().f1368a : null), this.g.isEmpty() ? null : this.g.get(this.g.size() - 1));
    }

    @Override // android.arch.lifecycle.c
    public void a(d dVar) {
        e eVar;
        a aVar = new a(dVar, this.f1363b == c.b.DESTROYED ? c.b.DESTROYED : c.b.INITIALIZED);
        if (this.f1362a.a(dVar, aVar) == null && (eVar = this.f1364c.get()) != null) {
            boolean z = this.f1365d != 0 || this.e;
            c.b c2 = c(dVar);
            this.f1365d++;
            while (aVar.f1368a.compareTo(c2) < 0 && this.f1362a.c(dVar)) {
                c(aVar.f1368a);
                aVar.a(eVar, e(aVar.f1368a));
                c();
                c2 = c(dVar);
            }
            if (!z) {
                d();
            }
            this.f1365d--;
        }
    }

    private void c() {
        this.g.remove(this.g.size() - 1);
    }

    private void c(c.b bVar) {
        this.g.add(bVar);
    }

    @Override // android.arch.lifecycle.c
    public void b(d dVar) {
        this.f1362a.b(dVar);
    }

    @Override // android.arch.lifecycle.c
    public c.b a() {
        return this.f1363b;
    }

    static c.b b(c.a aVar) {
        switch (aVar) {
            case ON_CREATE:
            case ON_STOP:
                return c.b.CREATED;
            case ON_START:
            case ON_PAUSE:
                return c.b.STARTED;
            case ON_RESUME:
                return c.b.RESUMED;
            case ON_DESTROY:
                return c.b.DESTROYED;
            default:
                throw new IllegalArgumentException("Unexpected event value " + aVar);
        }
    }

    private static c.a d(c.b bVar) {
        switch (bVar) {
            case INITIALIZED:
                throw new IllegalArgumentException();
            case CREATED:
                return c.a.ON_DESTROY;
            case STARTED:
                return c.a.ON_STOP;
            case RESUMED:
                return c.a.ON_PAUSE;
            case DESTROYED:
                throw new IllegalArgumentException();
            default:
                throw new IllegalArgumentException("Unexpected state value " + bVar);
        }
    }

    private static c.a e(c.b bVar) {
        switch (bVar) {
            case INITIALIZED:
            case DESTROYED:
                return c.a.ON_CREATE;
            case CREATED:
                return c.a.ON_START;
            case STARTED:
                return c.a.ON_RESUME;
            case RESUMED:
                throw new IllegalArgumentException();
            default:
                throw new IllegalArgumentException("Unexpected state value " + bVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a(e eVar) {
        android.arch.a.b.b<d, a>.d c2 = this.f1362a.c();
        while (c2.hasNext() && !this.f) {
            Map.Entry next = c2.next();
            a aVar = (a) next.getValue();
            while (aVar.f1368a.compareTo(this.f1363b) < 0 && !this.f && this.f1362a.c(next.getKey())) {
                c(aVar.f1368a);
                aVar.a(eVar, e(aVar.f1368a));
                c();
            }
        }
    }

    private void b(e eVar) {
        Iterator<Map.Entry<d, a>> b2 = this.f1362a.b();
        while (b2.hasNext() && !this.f) {
            Map.Entry<d, a> next = b2.next();
            a value = next.getValue();
            while (value.f1368a.compareTo(this.f1363b) > 0 && !this.f && this.f1362a.c(next.getKey())) {
                c.a d2 = d(value.f1368a);
                c(b(d2));
                value.a(eVar, d2);
                c();
            }
        }
    }

    private void d() {
        e eVar = this.f1364c.get();
        if (eVar == null) {
            Log.w("LifecycleRegistry", "LifecycleOwner is garbage collected, you shouldn't try dispatch new events from it.");
            return;
        }
        while (!b()) {
            this.f = false;
            if (this.f1363b.compareTo(this.f1362a.d().getValue().f1368a) < 0) {
                b(eVar);
            }
            Map.Entry<d, a> e = this.f1362a.e();
            if (!this.f && e != null && this.f1363b.compareTo(e.getValue().f1368a) > 0) {
                a(eVar);
            }
        }
        this.f = false;
    }

    static c.b a(c.b bVar, c.b bVar2) {
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }

    /* compiled from: LifecycleRegistry.java */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        c.b f1368a;

        /* renamed from: b, reason: collision with root package name */
        GenericLifecycleObserver f1369b;

        a(d dVar, c.b bVar) {
            this.f1369b = h.a(dVar);
            this.f1368a = bVar;
        }

        void a(e eVar, c.a aVar) {
            c.b b2 = f.b(aVar);
            this.f1368a = f.a(this.f1368a, b2);
            this.f1369b.a(eVar, aVar);
            this.f1368a = b2;
        }
    }
}
