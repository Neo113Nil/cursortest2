package c0;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.r0;
import java.util.LinkedHashMap;
import r1.f0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b extends q implements m {
    public l C;
    public n D;

    @Override // c0.q
    public final void A0(p.l lVar, long j8, float f9) {
        l lVar2 = this.C;
        if (lVar2 == null) {
            lVar2 = u.a(u.b((View) r1.f.i(this, AndroidCompositionLocals_androidKt.f743f)));
            this.C = lVar2;
        }
        n a3 = lVar2.a(this);
        int O = t6.a.O(f9);
        long a9 = this.f1498v.a();
        this.f1499w.a();
        a3.b(lVar, this.f1496t, j8, O, a9, 0.1f, new r0(3, this));
        this.D = a3;
        r1.f.m(this);
    }

    @Override // c0.q
    public final void B0(f0 f0Var) {
        z0.r k8 = f0Var.f7767f.f1234g.k();
        n nVar = this.D;
        if (nVar != null) {
            long j8 = this.f1502z;
            long a3 = this.f1498v.a();
            this.f1499w.a();
            nVar.e(0.1f, j8, a3);
            nVar.draw(z0.e.a(k8));
        }
    }

    @Override // c0.q
    public final void D0(p.l lVar) {
        n nVar = this.D;
        if (nVar != null) {
            nVar.d();
        }
    }

    @Override // c0.m
    public final void d0() {
        this.D = null;
        r1.f.m(this);
    }

    @Override // s0.n
    public final void t0() {
        l lVar = this.C;
        if (lVar != null) {
            d0();
            androidx.room.c cVar = lVar.f1483i;
            n nVar = (n) ((LinkedHashMap) cVar.f1069g).get(this);
            if (nVar != null) {
                nVar.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) cVar.f1069g;
                n nVar2 = (n) linkedHashMap.get(this);
                if (nVar2 != null) {
                }
                linkedHashMap.remove(this);
                lVar.f1482h.add(nVar);
            }
        }
    }
}
