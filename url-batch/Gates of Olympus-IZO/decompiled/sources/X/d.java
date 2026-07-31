package X;

import A2.g;
import I2.l;
import R.h;
import U.k;
import Z1.i;
import Z1.t;
import android.view.DragEvent;
import t0.AbstractC0898f;
import t0.InterfaceC0904l;
import t0.q0;

/* loaded from: classes.dex */
public final class d extends k implements q0, InterfaceC0904l {

    /* renamed from: q, reason: collision with root package name */
    public d f3390q;

    @Override // U.k
    public final void o0() {
        this.f3390q = null;
    }

    @Override // t0.q0
    public final Object v() {
        return b.f3389a;
    }

    public final boolean v0(g gVar) {
        d dVar = this.f3390q;
        if (dVar == null) {
            return false;
        }
        return dVar.v0(gVar);
    }

    public final void w0(g gVar) {
        d dVar = this.f3390q;
        if (dVar != null) {
            dVar.w0(gVar);
        }
    }

    public final void x0(g gVar) {
        d dVar = this.f3390q;
        if (dVar != null) {
            dVar.x0(gVar);
        }
        this.f3390q = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y0(g gVar) {
        q0 q0Var;
        d dVar;
        d dVar2 = this.f3390q;
        if (dVar2 != null) {
            DragEvent dragEvent = (DragEvent) gVar.f83b;
            if (l.g(dVar2, l.f(dragEvent.getX(), dragEvent.getY()))) {
                dVar = dVar2;
                if (dVar == null && dVar2 == null) {
                    dVar.w0(gVar);
                    dVar.y0(gVar);
                } else if (dVar != null && dVar2 != null) {
                    dVar2.x0(gVar);
                } else if (i.a(dVar, dVar2)) {
                    if (dVar != null) {
                        dVar.w0(gVar);
                        dVar.y0(gVar);
                    }
                    if (dVar2 != null) {
                        dVar2.x0(gVar);
                    }
                } else if (dVar != null) {
                    dVar.y0(gVar);
                }
                this.f3390q = dVar;
            }
        }
        if (this.f3303d.p) {
            t tVar = new t();
            AbstractC0898f.v(this, new h(tVar, this, gVar, 1));
            q0Var = (q0) tVar.f3480d;
        } else {
            q0Var = null;
        }
        dVar = (d) q0Var;
        if (dVar == null) {
        }
        if (dVar != null) {
        }
        if (i.a(dVar, dVar2)) {
        }
        this.f3390q = dVar;
    }

    public final void z0(g gVar) {
        d dVar = this.f3390q;
        if (dVar != null) {
            dVar.z0(gVar);
        }
    }
}
