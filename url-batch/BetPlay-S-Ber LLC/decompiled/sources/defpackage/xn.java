package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public abstract class xn implements q30 {
    public final ck f;
    public boolean g;
    public final /* synthetic */ bo h;

    public xn(bo boVar) {
        this.h = boVar;
        d60 a = boVar.c.a();
        a.getClass();
        ck ckVar = new ck();
        ckVar.e = a;
        this.f = ckVar;
    }

    @Override // defpackage.q30
    public final d60 a() {
        return this.f;
    }

    @Override // defpackage.q30
    public long b(long j, p8 p8Var) {
        bo boVar = this.h;
        p8Var.getClass();
        try {
            return boVar.c.b(j, p8Var);
        } catch (IOException e) {
            boVar.b.k();
            this.m();
            throw e;
        }
    }

    public final void m() {
        bo boVar = this.h;
        int i = boVar.e;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            throw new IllegalStateException("state: " + boVar.e);
        }
        ck ckVar = this.f;
        d60 d60Var = ckVar.e;
        ckVar.e = d60.d;
        d60Var.a();
        d60Var.b();
        boVar.e = 6;
    }
}
