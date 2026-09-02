package D;

import android.os.Build;
import java.util.Iterator;

/* renamed from: D.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0006g implements io.flutter.embedding.engine.renderer.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f73a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f74b;

    public /* synthetic */ C0006g(int i2, Object obj) {
        this.f73a = i2;
        this.f74b = obj;
    }

    @Override // io.flutter.embedding.engine.renderer.i
    public final void a() {
        switch (this.f73a) {
            case 0:
                C0008i c0008i = (C0008i) this.f74b;
                AbstractActivityC0005f abstractActivityC0005f = c0008i.f77a;
                if (Build.VERSION.SDK_INT >= 29) {
                    abstractActivityC0005f.reportFullyDrawn();
                } else {
                    abstractActivityC0005f.getClass();
                }
                c0008i.f84h = true;
                c0008i.f85i = true;
                break;
            case 1:
                y yVar = (y) this.f74b;
                yVar.f128i = true;
                Iterator it = yVar.f127h.iterator();
                while (it.hasNext()) {
                    ((io.flutter.embedding.engine.renderer.i) it.next()).a();
                }
                break;
            case 2:
                T t2 = (T) this.f74b;
                t2.f55a.setAlpha(1.0f);
                io.flutter.embedding.engine.renderer.h hVar = t2.f56b;
                if (hVar != null) {
                    hVar.c(this);
                    break;
                }
                break;
            default:
                ((io.flutter.embedding.engine.renderer.h) this.f74b).f572c = true;
                break;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.i
    public final void b() {
        switch (this.f73a) {
            case 0:
                C0008i c0008i = (C0008i) this.f74b;
                c0008i.f77a.getClass();
                c0008i.f84h = false;
                break;
            case 1:
                y yVar = (y) this.f74b;
                yVar.f128i = false;
                Iterator it = yVar.f127h.iterator();
                while (it.hasNext()) {
                    ((io.flutter.embedding.engine.renderer.i) it.next()).b();
                }
                break;
            case 2:
                break;
            default:
                ((io.flutter.embedding.engine.renderer.h) this.f74b).f572c = false;
                break;
        }
    }

    private final void c() {
    }
}
