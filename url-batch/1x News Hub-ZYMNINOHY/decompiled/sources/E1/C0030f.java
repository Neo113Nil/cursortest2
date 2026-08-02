package E1;

import android.os.Build;
import java.util.Iterator;

/* renamed from: E1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0030f implements io.flutter.embedding.engine.renderer.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f342a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f343b;

    public /* synthetic */ C0030f(int i3, Object obj) {
        this.f342a = i3;
        this.f343b = obj;
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void a() {
        switch (this.f342a) {
            case 0:
                C0032h c0032h = (C0032h) this.f343b;
                c0032h.f346a.getClass();
                c0032h.f352h = false;
                break;
            case 1:
                t tVar = (t) this.f343b;
                tVar.f391h = false;
                Iterator it = tVar.f390g.iterator();
                while (it.hasNext()) {
                    ((io.flutter.embedding.engine.renderer.k) it.next()).a();
                }
                break;
            case 2:
                break;
            default:
                ((io.flutter.embedding.engine.renderer.j) this.f343b).f9165d = false;
                break;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void b() {
        switch (this.f342a) {
            case 0:
                C0032h c0032h = (C0032h) this.f343b;
                AbstractActivityC0029e abstractActivityC0029e = c0032h.f346a;
                if (Build.VERSION.SDK_INT >= 29) {
                    abstractActivityC0029e.reportFullyDrawn();
                } else {
                    abstractActivityC0029e.getClass();
                }
                c0032h.f352h = true;
                c0032h.f353i = true;
                break;
            case 1:
                t tVar = (t) this.f343b;
                tVar.f391h = true;
                Iterator it = tVar.f390g.iterator();
                while (it.hasNext()) {
                    ((io.flutter.embedding.engine.renderer.k) it.next()).b();
                }
                break;
            case 2:
                L l3 = (L) this.f343b;
                l3.f324a.setAlpha(1.0f);
                io.flutter.embedding.engine.renderer.j jVar = l3.f325b;
                if (jVar != null) {
                    jVar.g(this);
                    break;
                }
                break;
            default:
                ((io.flutter.embedding.engine.renderer.j) this.f343b).f9165d = true;
                break;
        }
    }

    private final void c() {
    }
}
