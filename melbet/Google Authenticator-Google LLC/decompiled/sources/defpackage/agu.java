package defpackage;

import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agu extends afc {
    public final int i = 54321;
    public final aha j;
    public agv k;
    private aer l;

    public agu(aha ahaVar) {
        this.j = ahaVar;
        if (ahaVar.j != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        ahaVar.j = this;
        ahaVar.d = 54321;
    }

    @Override // defpackage.aez
    protected final void f() {
        if (agt.b(2)) {
            toString();
        }
        aha ahaVar = this.j;
        ahaVar.f = true;
        ahaVar.h = false;
        ahaVar.g = false;
        agz agzVar = (agz) ahaVar;
        List list = agzVar.c;
        if (list != null) {
            agzVar.b(list);
            return;
        }
        ahaVar.d();
        agzVar.a = new agy(agzVar);
        agzVar.a();
    }

    @Override // defpackage.aez
    protected final void g() {
        if (agt.b(2)) {
            toString();
        }
        aha ahaVar = this.j;
        ahaVar.f = false;
        ahaVar.d();
    }

    @Override // defpackage.aez
    public final void h(afd afdVar) {
        super.h(afdVar);
        this.l = null;
        this.k = null;
    }

    public final void l() {
        aer aerVar = this.l;
        agv agvVar = this.k;
        if (aerVar == null || agvVar == null) {
            return;
        }
        super.h(agvVar);
        d(aerVar, agvVar);
    }

    public final void m() {
        if (agt.b(3)) {
            toString();
        }
        aha ahaVar = this.j;
        ahaVar.d();
        ahaVar.g = true;
        agv agvVar = this.k;
        if (agvVar != null) {
            h(agvVar);
            if (agvVar.b) {
                if (agt.b(2)) {
                    Objects.toString(agvVar.a);
                }
                agvVar.c.a(null);
            }
        }
        agu aguVar = ahaVar.j;
        if (aguVar == null) {
            throw new IllegalStateException("No listener register");
        }
        if (aguVar != this) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        ahaVar.j = null;
        ahaVar.h = true;
        ahaVar.f = false;
        ahaVar.g = false;
        ahaVar.i = false;
    }

    public final void n(aer aerVar, exs exsVar) {
        agv agvVar = new agv(this.j, exsVar);
        d(aerVar, agvVar);
        afd afdVar = this.k;
        if (afdVar != null) {
            h(afdVar);
        }
        this.l = aerVar;
        this.k = agvVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #");
        sb.append(this.i);
        sb.append(" : ");
        aha ahaVar = this.j;
        sb.append(ahaVar.getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(ahaVar)));
        sb.append("}}");
        return sb.toString();
    }
}
