package e0;

import android.os.Build;
import java.util.Iterator;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class g implements io.flutter.embedding.engine.renderer.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f147a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f148b;

    public /* synthetic */ g(int i2, Object obj) {
        this.f147a = i2;
        this.f148b = obj;
    }

    @Override // io.flutter.embedding.engine.renderer.i
    public final void a() {
        switch (this.f147a) {
            case 0:
                i iVar = (i) this.f148b;
                iVar.f154a.getClass();
                iVar.f161h = false;
                break;
            case 1:
                u uVar = (u) this.f148b;
                uVar.f218h = false;
                Iterator it = uVar.f217g.iterator();
                while (it.hasNext()) {
                    ((io.flutter.embedding.engine.renderer.i) it.next()).a();
                }
                break;
            case 2:
                break;
            default:
                ((io.flutter.embedding.engine.renderer.h) this.f148b).f424c = false;
                break;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.i
    public final void b() {
        switch (this.f147a) {
            case 0:
                i iVar = (i) this.f148b;
                f fVar = iVar.f154a;
                if (Build.VERSION.SDK_INT >= 29) {
                    fVar.reportFullyDrawn();
                } else {
                    fVar.getClass();
                }
                iVar.f161h = true;
                iVar.f162i = true;
                break;
            case 1:
                u uVar = (u) this.f148b;
                uVar.f218h = true;
                Iterator it = uVar.f217g.iterator();
                while (it.hasNext()) {
                    ((io.flutter.embedding.engine.renderer.i) it.next()).b();
                }
                break;
            case 2:
                q0 q0Var = (q0) this.f148b;
                q0Var.f200a.setAlpha(1.0f);
                io.flutter.embedding.engine.renderer.h hVar = q0Var.f201b;
                if (hVar != null) {
                    hVar.c(this);
                    break;
                }
                break;
            default:
                ((io.flutter.embedding.engine.renderer.h) this.f148b).f424c = true;
                break;
        }
    }

    private final void c() {
    }
}
