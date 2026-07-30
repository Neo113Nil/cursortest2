package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class hy0 implements pn2 {
    public final vq0 m;
    public boolean n;
    public final /* synthetic */ ly0 o;

    public hy0(ly0 ly0Var) {
        this.o = ly0Var;
        rx2 e = ly0Var.c.e();
        e.getClass();
        vq0 vq0Var = new vq0();
        vq0Var.e = e;
        this.m = vq0Var;
    }

    public final void b() {
        ly0 ly0Var = this.o;
        int i = ly0Var.e;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            throw new IllegalStateException("state: " + ly0Var.e);
        }
        vq0 vq0Var = this.m;
        rx2 rx2Var = vq0Var.e;
        vq0Var.e = rx2.d;
        rx2Var.a();
        rx2Var.b();
        ly0Var.e = 6;
    }

    @Override // defpackage.pn2
    public final rx2 e() {
        return this.m;
    }

    @Override // defpackage.pn2
    public long h(long j, fq fqVar) {
        ly0 ly0Var = this.o;
        fqVar.getClass();
        try {
            return ly0Var.c.h(j, fqVar);
        } catch (IOException e) {
            ly0Var.b.k();
            this.b();
            throw e;
        }
    }
}
