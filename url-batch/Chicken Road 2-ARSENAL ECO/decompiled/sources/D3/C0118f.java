package D3;

import android.os.Build;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.Iterator;

/* renamed from: D3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0118f implements io.flutter.embedding.engine.renderer.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f421a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f422b;

    public /* synthetic */ C0118f(int i7, Object obj) {
        this.f421a = i7;
        this.f422b = obj;
    }

    @Override // io.flutter.embedding.engine.renderer.i
    public final void a() {
        switch (this.f421a) {
            case 0:
                C0121i c0121i = (C0121i) this.f422b;
                c0121i.f425a.getClass();
                c0121i.f432h = false;
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                t tVar = (t) this.f422b;
                tVar.f478m = false;
                Iterator it = tVar.f477l.iterator();
                while (it.hasNext()) {
                    ((io.flutter.embedding.engine.renderer.i) it.next()).a();
                }
                break;
            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                break;
            default:
                ((io.flutter.embedding.engine.renderer.h) this.f422b).f4488c = false;
                break;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.i
    public final void b() {
        switch (this.f421a) {
            case 0:
                C0121i c0121i = (C0121i) this.f422b;
                AbstractActivityC0117e abstractActivityC0117e = c0121i.f425a;
                if (Build.VERSION.SDK_INT >= 29) {
                    abstractActivityC0117e.reportFullyDrawn();
                } else {
                    abstractActivityC0117e.getClass();
                }
                c0121i.f432h = true;
                c0121i.f433i = true;
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                t tVar = (t) this.f422b;
                tVar.f478m = true;
                Iterator it = tVar.f477l.iterator();
                while (it.hasNext()) {
                    ((io.flutter.embedding.engine.renderer.i) it.next()).b();
                }
                break;
            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                N n7 = (N) this.f422b;
                n7.f402a.setAlpha(1.0f);
                io.flutter.embedding.engine.renderer.h hVar = n7.f403b;
                if (hVar != null) {
                    hVar.c(this);
                    break;
                }
                break;
            default:
                ((io.flutter.embedding.engine.renderer.h) this.f422b).f4488c = true;
                break;
        }
    }

    private final void c() {
    }
}
