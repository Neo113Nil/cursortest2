package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import defpackage.aso;
import defpackage.asq;
import defpackage.auy;
import defpackage.axi;
import defpackage.axm;
import defpackage.axu;
import defpackage.ayf;
import defpackage.azg;
import defpackage.yo;
import defpackage.yp;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // androidx.work.Worker
    public final yo c() {
        auy i = auy.i(this.a);
        WorkDatabase workDatabase = i.d;
        workDatabase.getClass();
        axu C = workDatabase.C();
        axm A = workDatabase.A();
        ayf D = workDatabase.D();
        axi z = workDatabase.z();
        yp ypVar = i.c.n;
        long currentTimeMillis = System.currentTimeMillis();
        TimeUnit timeUnit = TimeUnit.DAYS;
        List g = C.g(currentTimeMillis - 86400000);
        List h = C.h();
        List v = C.v();
        if (!g.isEmpty()) {
            asq.a();
            int i2 = azg.a;
            asq.a();
            azg.a(A, D, z, g);
        }
        if (!h.isEmpty()) {
            asq.a();
            int i3 = azg.a;
            asq.a();
            azg.a(A, D, z, h);
        }
        if (!v.isEmpty()) {
            asq.a();
            int i4 = azg.a;
            asq.a();
            azg.a(A, D, z, v);
        }
        return new aso();
    }
}
