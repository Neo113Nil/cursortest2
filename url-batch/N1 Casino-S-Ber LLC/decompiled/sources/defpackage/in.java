package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public abstract class in implements f30 {
    public final hk f;
    public boolean g;
    public final /* synthetic */ mn h;

    public in(mn mnVar) {
        this.h = mnVar;
        v50 a = mnVar.c.a();
        a.getClass();
        hk hkVar = new hk();
        hkVar.e = a;
        this.f = hkVar;
    }

    @Override // defpackage.f30
    public final v50 a() {
        return this.f;
    }

    @Override // defpackage.f30
    public long b(long j, u8 u8Var) {
        mn mnVar = this.h;
        u8Var.getClass();
        try {
            return mnVar.c.b(j, u8Var);
        } catch (IOException e) {
            mnVar.b.k();
            this.m();
            throw e;
        }
    }

    public final void m() {
        mn mnVar = this.h;
        int i = mnVar.e;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            throw new IllegalStateException("state: " + mnVar.e);
        }
        hk hkVar = this.f;
        v50 v50Var = hkVar.e;
        hkVar.e = v50.d;
        v50Var.a();
        v50Var.b();
        mnVar.e = 6;
    }
}
