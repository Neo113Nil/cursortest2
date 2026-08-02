package defpackage;

import android.view.Window;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dx implements go {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public dx(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.go
    public final void a(gd gdVar, boolean z) {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                ((dy) this.a).z(gdVar);
                return;
            }
            if (gdVar instanceof gw) {
                gdVar.a().i(false);
            }
            go goVar = ((fs) this.a).e;
            if (goVar != null) {
                goVar.a(gdVar, z);
                return;
            }
            return;
        }
        gd a = gdVar.a();
        gd gdVar2 = a != gdVar ? a : gdVar;
        dy dyVar = (dy) this.a;
        dw u = dyVar.u(gdVar2);
        if (u != null) {
            if (a == gdVar) {
                dyVar.A(u, z);
            } else {
                dyVar.y(u.a, u, a);
                dyVar.A(u, true);
            }
        }
    }

    @Override // defpackage.go
    public final boolean b(gd gdVar) {
        Window.Callback v;
        int i = this.b;
        if (i == 0) {
            if (gdVar == gdVar.a()) {
                dy dyVar = (dy) this.a;
                if (dyVar.y && (v = dyVar.v()) != null && !dyVar.F) {
                    v.onMenuOpened(108, gdVar);
                }
            }
            return true;
        }
        Object obj = this.a;
        if (i == 1) {
            Window.Callback v2 = ((dy) obj).v();
            if (v2 != null) {
                v2.onMenuOpened(108, gdVar);
            }
            return true;
        }
        hk hkVar = (hk) obj;
        if (gdVar == hkVar.c) {
            return false;
        }
        hkVar.l = ((gw) gdVar).m.a;
        go goVar = ((fs) obj).e;
        if (goVar != null) {
            return goVar.b(gdVar);
        }
        return false;
    }
}
