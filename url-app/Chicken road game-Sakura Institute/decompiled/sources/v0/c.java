package v0;

import android.view.DragEvent;
import c.h;
import l1.x;
import r1.f;
import r1.l;
import r1.q1;
import r6.k;
import r6.v;
import s0.n;
import u3.r;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c extends n implements q1, l {

    /* renamed from: s, reason: collision with root package name */
    public c f9099s;

    public final boolean A0(x xVar) {
        c cVar = this.f9099s;
        if (cVar == null) {
            return false;
        }
        return cVar.A0(xVar);
    }

    public final void B0(x xVar) {
        c cVar = this.f9099s;
        if (cVar != null) {
            cVar.B0(xVar);
        }
    }

    public final void C0(x xVar) {
        c cVar = this.f9099s;
        if (cVar != null) {
            cVar.C0(xVar);
        }
        this.f9099s = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D0(x xVar) {
        q1 q1Var;
        c cVar;
        c cVar2 = this.f9099s;
        if (cVar2 != null) {
            DragEvent dragEvent = (DragEvent) xVar.f5847g;
            if (d.b(cVar2, r.a(dragEvent.getX(), dragEvent.getY()))) {
                cVar = cVar2;
                if (cVar == null && cVar2 == null) {
                    cVar.B0(xVar);
                    cVar.D0(xVar);
                } else if (cVar != null && cVar2 != null) {
                    cVar2.C0(xVar);
                } else if (k.a(cVar, cVar2)) {
                    if (cVar != null) {
                        cVar.B0(xVar);
                        cVar.D0(xVar);
                    }
                    if (cVar2 != null) {
                        cVar2.C0(xVar);
                    }
                } else if (cVar != null) {
                    cVar.D0(xVar);
                }
                this.f9099s = cVar;
            }
        }
        if (this.f8104f.f8116r) {
            v vVar = new v();
            f.x(this, new h(vVar, this, xVar, 10));
            q1Var = (q1) vVar.f7968f;
        } else {
            q1Var = null;
        }
        cVar = (c) q1Var;
        if (cVar == null) {
        }
        if (cVar != null) {
        }
        if (k.a(cVar, cVar2)) {
        }
        this.f9099s = cVar;
    }

    public final void E0(x xVar) {
        c cVar = this.f9099s;
        if (cVar != null) {
            cVar.E0(xVar);
        }
    }

    @Override // r1.q1
    public final Object o() {
        return b.f9098a;
    }

    @Override // s0.n
    public final void t0() {
        this.f9099s = null;
    }
}
