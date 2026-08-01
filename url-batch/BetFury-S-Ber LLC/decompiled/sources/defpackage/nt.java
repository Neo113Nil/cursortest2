package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class nt implements ke0 {
    public final sp f;
    public boolean g;
    public final /* synthetic */ rt h;

    public nt(rt rtVar) {
        this.h = rtVar;
        gi0 a = rtVar.c.a();
        a.getClass();
        sp spVar = new sp();
        spVar.e = a;
        this.f = spVar;
    }

    @Override // defpackage.ke0
    public final gi0 a() {
        return this.f;
    }

    @Override // defpackage.ke0
    public long c(long j, t9 t9Var) {
        rt rtVar = this.h;
        t9Var.getClass();
        try {
            return rtVar.c.c(j, t9Var);
        } catch (IOException e) {
            rtVar.b.k();
            this.i();
            throw e;
        }
    }

    public final void i() {
        rt rtVar = this.h;
        int i = rtVar.e;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            throw new IllegalStateException("state: " + rtVar.e);
        }
        sp spVar = this.f;
        gi0 gi0Var = spVar.e;
        spVar.e = gi0.d;
        gi0Var.a();
        gi0Var.b();
        rtVar.e = 6;
    }
}
