package defpackage;

import androidx.work.WorkerParameters;
import j$.time.Duration;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class gct implements grn {
    final /* synthetic */ WorkerParameters a;
    final /* synthetic */ Supplier b;
    final /* synthetic */ gka c;

    public gct(gka gkaVar, WorkerParameters workerParameters, Supplier supplier) {
        this.c = gkaVar;
        this.a = workerParameters;
        this.b = supplier;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.grn
    public final hvi a(hvi hviVar, Duration duration) {
        Object obj;
        obj = this.b.get();
        ((Integer) obj).intValue();
        gka gkaVar = this.c;
        if (!gkaVar.e()) {
            return hve.a;
        }
        return hoq.at(((gnp) ((gzs) gkaVar.e).a).a(), new gcw(gkaVar, hviVar, this.a, duration, 0), gkaVar.d);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.grn
    public final hvi b() {
        gka gkaVar = this.c;
        if (!gkaVar.e()) {
            return hve.a;
        }
        return hoq.at(((gnp) ((gzs) gkaVar.e).a).a(), new bso(gkaVar, this.a, 14, null), gkaVar.d);
    }
}
