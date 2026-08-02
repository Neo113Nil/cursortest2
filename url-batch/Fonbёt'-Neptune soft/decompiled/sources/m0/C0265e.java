package m0;

import android.os.Build;
import java.util.Iterator;

/* renamed from: m0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0265e implements io.flutter.embedding.engine.renderer.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3147a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3148b;

    public /* synthetic */ C0265e(int i2, Object obj) {
        this.f3147a = i2;
        this.f3148b = obj;
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void a() {
        switch (this.f3147a) {
            case 0:
                C0267g c0267g = (C0267g) this.f3148b;
                c0267g.f3151a.getClass();
                c0267g.f3157g = false;
                break;
            case 1:
                break;
            default:
                q qVar = (q) this.f3148b;
                qVar.f3189k = false;
                Iterator it = qVar.f3188j.iterator();
                while (it.hasNext()) {
                    ((io.flutter.embedding.engine.renderer.m) it.next()).a();
                }
                break;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void b() {
        switch (this.f3147a) {
            case 0:
                C0267g c0267g = (C0267g) this.f3148b;
                AbstractActivityC0264d abstractActivityC0264d = c0267g.f3151a;
                if (Build.VERSION.SDK_INT >= 29) {
                    abstractActivityC0264d.reportFullyDrawn();
                } else {
                    abstractActivityC0264d.getClass();
                }
                c0267g.f3157g = true;
                c0267g.f3158h = true;
                break;
            case 1:
                l lVar = (l) this.f3148b;
                lVar.setAlpha(1.0f);
                io.flutter.embedding.engine.renderer.l lVar2 = lVar.f3171g;
                if (lVar2 != null) {
                    lVar2.f2537a.removeIsDisplayingFlutterUiListener(this);
                    break;
                }
                break;
            default:
                q qVar = (q) this.f3148b;
                qVar.f3189k = true;
                Iterator it = qVar.f3188j.iterator();
                while (it.hasNext()) {
                    ((io.flutter.embedding.engine.renderer.m) it.next()).b();
                }
                break;
        }
    }

    private final void c() {
    }
}
