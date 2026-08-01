package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class sn implements ml {
    public final ao f;
    public final /* synthetic */ xn g;

    public sn(xn xnVar, ao aoVar) {
        this.g = xnVar;
        this.f = aoVar;
    }

    @Override // defpackage.ml
    public final Object a() {
        xn xnVar = this.g;
        ao aoVar = this.f;
        try {
        } catch (IOException e) {
            xnVar.m(2, 2, e);
        } catch (Throwable th) {
            xnVar.m(3, 3, null);
            r70.b(aoVar);
            throw th;
        }
        if (!aoVar.m(true, this)) {
            throw new IOException("Required SETTINGS preface not received");
        }
        while (aoVar.m(false, this)) {
        }
        xnVar.m(1, 9, null);
        r70.b(aoVar);
        return dh.m;
    }
}
