package V;

import M2.E;
import P.h;
import S.n;
import a.AbstractC0345a;
import android.view.DragEvent;
import kotlin.jvm.internal.Intrinsics;
import r0.AbstractC1065f;
import r0.InterfaceC1072m;
import r0.q0;
import w2.C1294c;

/* loaded from: classes.dex */
public final class e extends n implements q0, InterfaceC1072m {

    /* renamed from: t, reason: collision with root package name */
    public e f4141t;

    public final boolean B0(C1294c c1294c) {
        e eVar = this.f4141t;
        if (eVar == null) {
            return false;
        }
        return eVar.B0(c1294c);
    }

    public final void C0(C1294c c1294c) {
        e eVar = this.f4141t;
        if (eVar != null) {
            eVar.C0(c1294c);
        }
    }

    public final void D0(C1294c c1294c) {
        e eVar = this.f4141t;
        if (eVar != null) {
            eVar.D0(c1294c);
        }
        this.f4141t = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E0(C1294c c1294c) {
        q0 q0Var;
        e eVar;
        e eVar2 = this.f4141t;
        if (eVar2 != null) {
            DragEvent dragEvent = (DragEvent) c1294c.f11388d;
            if (M1.a.l(eVar2, AbstractC0345a.c(dragEvent.getX(), dragEvent.getY()))) {
                eVar = eVar2;
                if (eVar == null && eVar2 == null) {
                    eVar.C0(c1294c);
                    eVar.E0(c1294c);
                } else if (eVar != null && eVar2 != null) {
                    eVar2.D0(c1294c);
                } else if (Intrinsics.a(eVar, eVar2)) {
                    if (eVar != null) {
                        eVar.C0(c1294c);
                        eVar.E0(c1294c);
                    }
                    if (eVar2 != null) {
                        eVar2.D0(c1294c);
                    }
                } else if (eVar != null) {
                    eVar.E0(c1294c);
                }
                this.f4141t = eVar;
            }
        }
        if (this.f3978d.f3990s) {
            E e4 = new E();
            AbstractC1065f.z(this, new h(e4, this, c1294c, 1));
            q0Var = (q0) e4.f3580d;
        } else {
            q0Var = null;
        }
        eVar = (e) q0Var;
        if (eVar == null) {
        }
        if (eVar != null) {
        }
        if (Intrinsics.a(eVar, eVar2)) {
        }
        this.f4141t = eVar;
    }

    public final void F0(C1294c c1294c) {
        e eVar = this.f4141t;
        if (eVar != null) {
            eVar.F0(c1294c);
        }
    }

    @Override // r0.q0
    public final Object u() {
        return b.f4138a;
    }

    @Override // S.n
    public final void u0() {
        this.f4141t = null;
    }
}
