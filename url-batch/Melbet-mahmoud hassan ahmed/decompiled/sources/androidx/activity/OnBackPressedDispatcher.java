package androidx.activity;

import androidx.lifecycle.e;
import androidx.lifecycle.g;
import androidx.lifecycle.i;
import java.util.ArrayDeque;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* renamed from: a, reason: collision with root package name */
    private final Runnable f485a;

    /* renamed from: b, reason: collision with root package name */
    final ArrayDeque<b> f486b = new ArrayDeque<>();

    private class LifecycleOnBackPressedCancellable implements g, androidx.activity.a {

        /* renamed from: f, reason: collision with root package name */
        private final e f487f;

        /* renamed from: g, reason: collision with root package name */
        private final b f488g;

        /* renamed from: h, reason: collision with root package name */
        private androidx.activity.a f489h;

        LifecycleOnBackPressedCancellable(e eVar, b bVar) {
            this.f487f = eVar;
            this.f488g = bVar;
            eVar.a(this);
        }

        @Override // androidx.activity.a
        public void cancel() {
            this.f487f.c(this);
            this.f488g.e(this);
            androidx.activity.a aVar = this.f489h;
            if (aVar != null) {
                aVar.cancel();
                this.f489h = null;
            }
        }

        @Override // androidx.lifecycle.g
        public void d(i iVar, e.b bVar) {
            if (bVar == e.b.ON_START) {
                this.f489h = OnBackPressedDispatcher.this.b(this.f488g);
                return;
            }
            if (bVar != e.b.ON_STOP) {
                if (bVar == e.b.ON_DESTROY) {
                    cancel();
                }
            } else {
                androidx.activity.a aVar = this.f489h;
                if (aVar != null) {
                    aVar.cancel();
                }
            }
        }
    }

    private class a implements androidx.activity.a {

        /* renamed from: f, reason: collision with root package name */
        private final b f491f;

        a(b bVar) {
            this.f491f = bVar;
        }

        @Override // androidx.activity.a
        public void cancel() {
            OnBackPressedDispatcher.this.f486b.remove(this.f491f);
            this.f491f.e(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f485a = runnable;
    }

    public void a(i iVar, b bVar) {
        e a7 = iVar.a();
        if (a7.b() == e.c.DESTROYED) {
            return;
        }
        bVar.a(new LifecycleOnBackPressedCancellable(a7, bVar));
    }

    androidx.activity.a b(b bVar) {
        this.f486b.add(bVar);
        a aVar = new a(bVar);
        bVar.a(aVar);
        return aVar;
    }

    public void c() {
        Iterator<b> descendingIterator = this.f486b.descendingIterator();
        while (descendingIterator.hasNext()) {
            b next = descendingIterator.next();
            if (next.c()) {
                next.b();
                return;
            }
        }
        Runnable runnable = this.f485a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
