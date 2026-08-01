package E;

import android.os.Build;
import java.util.Iterator;

/* renamed from: E.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0005f implements io.flutter.embedding.engine.renderer.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f151a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f152b;

    public /* synthetic */ C0005f(int i2, Object obj) {
        this.f151a = i2;
        this.f152b = obj;
    }

    @Override // io.flutter.embedding.engine.renderer.i
    public final void a() {
        switch (this.f151a) {
            case 0:
                C0007h c0007h = (C0007h) this.f152b;
                AbstractActivityC0004e abstractActivityC0004e = c0007h.f155a;
                if (Build.VERSION.SDK_INT >= 29) {
                    abstractActivityC0004e.reportFullyDrawn();
                } else {
                    abstractActivityC0004e.getClass();
                }
                c0007h.f162h = true;
                c0007h.f163i = true;
                break;
            case 1:
                v vVar = (v) this.f152b;
                vVar.f196g = true;
                Iterator it = vVar.f195f.iterator();
                while (it.hasNext()) {
                    ((io.flutter.embedding.engine.renderer.i) it.next()).a();
                }
                break;
            case 2:
                P p2 = (P) this.f152b;
                p2.f133a.setAlpha(1.0f);
                io.flutter.embedding.engine.renderer.h hVar = p2.f134b;
                if (hVar != null) {
                    hVar.c(this);
                    break;
                }
                break;
            default:
                ((io.flutter.embedding.engine.renderer.h) this.f152b).f625c = true;
                break;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.i
    public final void b() {
        switch (this.f151a) {
            case 0:
                C0007h c0007h = (C0007h) this.f152b;
                c0007h.f155a.getClass();
                c0007h.f162h = false;
                break;
            case 1:
                v vVar = (v) this.f152b;
                vVar.f196g = false;
                Iterator it = vVar.f195f.iterator();
                while (it.hasNext()) {
                    ((io.flutter.embedding.engine.renderer.i) it.next()).b();
                }
                break;
            case 2:
                break;
            default:
                ((io.flutter.embedding.engine.renderer.h) this.f152b).f625c = false;
                break;
        }
    }

    private final void c() {
    }
}
