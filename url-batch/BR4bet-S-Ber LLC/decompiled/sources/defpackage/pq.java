package defpackage;

import java.net.SocketTimeoutException;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class pq extends h7 {
    public final /* synthetic */ qq m;

    public pq(qq qqVar) {
        this.m = qqVar;
    }

    @Override // defpackage.h7
    public final void j() {
        this.m.e(9);
        jq jqVar = this.m.b;
        synchronized (jqVar) {
            long j = jqVar.s;
            long j2 = jqVar.r;
            if (j < j2) {
                return;
            }
            jqVar.r = j2 + 1;
            jqVar.t = System.nanoTime() + 1000000000;
            jqVar.m.c(new hq(0, jqVar, jqVar.h + " ping"), 0L);
        }
    }

    public final void k() {
        if (i()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}
