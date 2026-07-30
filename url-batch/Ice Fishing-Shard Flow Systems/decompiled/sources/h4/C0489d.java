package h4;

import android.os.Build;
import java.util.Iterator;

/* renamed from: h4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0489d implements io.flutter.embedding.engine.renderer.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5194a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5195b;

    public /* synthetic */ C0489d(int i2, Object obj) {
        this.f5194a = i2;
        this.f5195b = obj;
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void a() {
        switch (this.f5194a) {
            case 0:
                C0492g c0492g = (C0492g) this.f5195b;
                c0492g.f5198a.getClass();
                c0492g.f5205h = false;
                break;
            case 1:
                p pVar = (p) this.f5195b;
                pVar.f5249p = false;
                Iterator it = pVar.f5248o.iterator();
                while (it.hasNext()) {
                    ((io.flutter.embedding.engine.renderer.k) it.next()).a();
                }
                break;
            case 2:
                break;
            default:
                ((io.flutter.embedding.engine.renderer.j) this.f5195b).f5601d = false;
                break;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void b() {
        switch (this.f5194a) {
            case 0:
                C0492g c0492g = (C0492g) this.f5195b;
                AbstractActivityC0488c abstractActivityC0488c = c0492g.f5198a;
                if (Build.VERSION.SDK_INT >= 29) {
                    abstractActivityC0488c.reportFullyDrawn();
                } else {
                    abstractActivityC0488c.getClass();
                }
                c0492g.f5205h = true;
                c0492g.f5206i = true;
                break;
            case 1:
                p pVar = (p) this.f5195b;
                pVar.f5249p = true;
                Iterator it = pVar.f5248o.iterator();
                while (it.hasNext()) {
                    ((io.flutter.embedding.engine.renderer.k) it.next()).b();
                }
                break;
            case 2:
                G g7 = (G) this.f5195b;
                g7.f5177a.setAlpha(1.0f);
                io.flutter.embedding.engine.renderer.j jVar = g7.f5178b;
                if (jVar != null) {
                    jVar.g(this);
                    break;
                }
                break;
            default:
                ((io.flutter.embedding.engine.renderer.j) this.f5195b).f5601d = true;
                break;
        }
    }

    private final void c() {
    }
}
