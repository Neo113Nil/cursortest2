package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.e;

/* loaded from: classes.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    private final j f923a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f924b = new Handler();

    /* renamed from: c, reason: collision with root package name */
    private a f925c;

    static class a implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        private final j f926f;

        /* renamed from: g, reason: collision with root package name */
        final e.b f927g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f928h = false;

        a(j jVar, e.b bVar) {
            this.f926f = jVar;
            this.f927g = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f928h) {
                return;
            }
            this.f926f.h(this.f927g);
            this.f928h = true;
        }
    }

    public t(i iVar) {
        this.f923a = new j(iVar);
    }

    private void f(e.b bVar) {
        a aVar = this.f925c;
        if (aVar != null) {
            aVar.run();
        }
        a aVar2 = new a(this.f923a, bVar);
        this.f925c = aVar2;
        this.f924b.postAtFrontOfQueue(aVar2);
    }

    public e a() {
        return this.f923a;
    }

    public void b() {
        f(e.b.ON_START);
    }

    public void c() {
        f(e.b.ON_CREATE);
    }

    public void d() {
        f(e.b.ON_STOP);
        f(e.b.ON_DESTROY);
    }

    public void e() {
        f(e.b.ON_START);
    }
}
