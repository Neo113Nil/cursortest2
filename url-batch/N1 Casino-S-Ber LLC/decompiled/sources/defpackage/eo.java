package defpackage;

import java.net.SocketTimeoutException;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class eo extends x6 {
    public final /* synthetic */ fo m;

    public eo(fo foVar) {
        this.m = foVar;
    }

    @Override // defpackage.x6
    public final void j() {
        this.m.e(9);
        xn xnVar = this.m.b;
        synchronized (xnVar) {
            long j = xnVar.s;
            long j2 = xnVar.r;
            if (j < j2) {
                return;
            }
            xnVar.r = j2 + 1;
            xnVar.t = System.nanoTime() + 1000000000;
            xnVar.m.c(new vn(0, xnVar, xnVar.h + " ping"), 0L);
        }
    }

    public final void k() {
        if (i()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}
