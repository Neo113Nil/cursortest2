package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private boolean f493a;

    /* renamed from: b, reason: collision with root package name */
    private CopyOnWriteArrayList<a> f494b = new CopyOnWriteArrayList<>();

    public b(boolean z6) {
        this.f493a = z6;
    }

    void a(a aVar) {
        this.f494b.add(aVar);
    }

    public abstract void b();

    public final boolean c() {
        return this.f493a;
    }

    public final void d() {
        Iterator<a> it = this.f494b.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }

    void e(a aVar) {
        this.f494b.remove(aVar);
    }

    public final void f(boolean z6) {
        this.f493a = z6;
    }
}
