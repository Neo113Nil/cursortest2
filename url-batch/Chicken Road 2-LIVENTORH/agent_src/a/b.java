package a;

import android.graphics.Typeface;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f2g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f3h;

    public /* synthetic */ b(Object obj, Object obj2, int i) {
        this.f1f = i;
        this.f2g = obj;
        this.f3h = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1f) {
            case 0:
                g.j jVar = (g.j) this.f2g;
                jVar.f754f.a(new d((g0) this.f3h, jVar));
                return;
            case 1:
                ((e0.b) this.f2g).h((Typeface) this.f3h);
                return;
            default:
                g.n nVar = (g.n) this.f2g;
                Runnable runnable = (Runnable) this.f3h;
                nVar.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    nVar.a();
                }
        }
    }
}
