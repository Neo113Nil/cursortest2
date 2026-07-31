package X;

import B.Y;
import R.h;
import U.p;
import android.view.DragEvent;
import f2.j;
import f2.u;
import t0.AbstractC0993f;
import t0.InterfaceC0999l;
import t0.r0;

/* loaded from: classes.dex */
public final class e extends p implements r0, InterfaceC0999l {

    /* renamed from: q, reason: collision with root package name */
    public e f4621q;

    public final void A0(Y y3) {
        e eVar = this.f4621q;
        if (eVar != null) {
            eVar.A0(y3);
        }
        this.f4621q = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B0(Y y3) {
        r0 r0Var;
        e eVar;
        e eVar2 = this.f4621q;
        if (eVar2 != null) {
            DragEvent dragEvent = (DragEvent) y3.f334d;
            if (O2.d.k(eVar2, l0.c.e(dragEvent.getX(), dragEvent.getY()))) {
                eVar = eVar2;
                if (eVar == null && eVar2 == null) {
                    eVar.z0(y3);
                    eVar.B0(y3);
                } else if (eVar != null && eVar2 != null) {
                    eVar2.A0(y3);
                } else if (j.a(eVar, eVar2)) {
                    if (eVar != null) {
                        eVar.z0(y3);
                        eVar.B0(y3);
                    }
                    if (eVar2 != null) {
                        eVar2.A0(y3);
                    }
                } else if (eVar != null) {
                    eVar.B0(y3);
                }
                this.f4621q = eVar;
            }
        }
        if (this.f4489d.f4501p) {
            u uVar = new u();
            AbstractC0993f.x(this, new h(uVar, this, y3, 1));
            r0Var = (r0) uVar.f5832d;
        } else {
            r0Var = null;
        }
        eVar = (e) r0Var;
        if (eVar == null) {
        }
        if (eVar != null) {
        }
        if (j.a(eVar, eVar2)) {
        }
        this.f4621q = eVar;
    }

    public final void C0(Y y3) {
        e eVar = this.f4621q;
        if (eVar != null) {
            eVar.C0(y3);
        }
    }

    @Override // U.p
    public final void r0() {
        this.f4621q = null;
    }

    @Override // t0.r0
    public final Object w() {
        return b.f4618a;
    }

    public final boolean y0(Y y3) {
        e eVar = this.f4621q;
        if (eVar == null) {
            return false;
        }
        return eVar.y0(y3);
    }

    public final void z0(Y y3) {
        e eVar = this.f4621q;
        if (eVar != null) {
            eVar.z0(y3);
        }
    }
}
