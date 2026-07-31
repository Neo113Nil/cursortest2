package q3;

import android.util.Log;
import java.util.Map;
import p3.a;

/* loaded from: classes.dex */
final class b0 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ o3.b f20226f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ c0 f20227g;

    b0(c0 c0Var, o3.b bVar) {
        this.f20227g = c0Var;
        this.f20226f = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map map;
        b bVar;
        a.f fVar;
        a.f fVar2;
        a.f fVar3;
        a.f fVar4;
        map = this.f20227g.f20238f.f20255q;
        bVar = this.f20227g.f20234b;
        z zVar = (z) map.get(bVar);
        if (zVar == null) {
            return;
        }
        if (!this.f20226f.j()) {
            zVar.p(this.f20226f, null);
            return;
        }
        c0.e(this.f20227g, true);
        fVar = this.f20227g.f20233a;
        if (fVar.o()) {
            this.f20227g.h();
            return;
        }
        try {
            fVar3 = this.f20227g.f20233a;
            fVar4 = this.f20227g.f20233a;
            fVar3.e(null, fVar4.b());
        } catch (SecurityException e7) {
            Log.e("GoogleApiManager", "Failed to get service from broker. ", e7);
            fVar2 = this.f20227g.f20233a;
            fVar2.f("Failed to get service from broker.");
            zVar.p(new o3.b(10), null);
        }
    }
}
