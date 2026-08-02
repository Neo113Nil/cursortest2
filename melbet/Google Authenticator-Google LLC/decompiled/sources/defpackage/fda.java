package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class fda implements htt {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ fda(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v15, types: [fds, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v25, types: [hvi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v26, types: [gdn, java.lang.Object] */
    @Override // defpackage.htt
    public final htz a(bry bryVar, Object obj) {
        int i = this.b;
        int i2 = 4;
        if (i == 0) {
            fwm fwmVar = (fwm) this.a;
            Object obj2 = fwmVar.a;
            Object obj3 = fwmVar.b;
            fdf fdfVar = (fdf) obj;
            gty aC = hoq.aC(63, "ExecSQL: ".concat((String) obj3));
            try {
                bqi bqiVar = new bqi(fdfVar, obj3, obj2, i2);
                fdfVar.b();
                hvj hvjVar = new hvj(gvx.i(new bsp(fdfVar, bqiVar, 12)));
                fdfVar.b.execute(hvjVar);
                aC.b(hvjVar);
                aC.close();
                return new htz(hvjVar);
            } catch (Throwable th) {
                try {
                    aC.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        int i3 = 1;
        if (i == 1) {
            fdf fdfVar2 = (fdf) obj;
            fdfVar2.b();
            fwm fwmVar2 = (fwm) this.a;
            fde fdeVar = new fde(fdfVar2, (Object[]) fwmVar2.a, (String) fwmVar2.b);
            int i4 = fdo.a;
            fdn fdnVar = new fdn(fdeVar);
            fdfVar2.b.execute(gvx.h(fdnVar));
            huf hufVar = huf.a;
            hvh hvhVar = htz.a;
            hufVar.getClass();
            htz htzVar = new htz(hnu.aK(fdnVar));
            hnu.aS(fdnVar, new ecu(htzVar, (Executor) hufVar, 2), hufVar);
            return htzVar;
        }
        if (i == 2) {
            return new htz(((fdf) obj).a(this.a));
        }
        int i5 = 5;
        if (i == 3) {
            return new htz(((fdf) obj).a(new bpi(this.a, i5)));
        }
        if (i != 4) {
            if (i != 5) {
                return cbp.g(this.a, "Second load");
            }
            return new htz(this.a);
        }
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        boolean isWriteAheadLoggingEnabled = sQLiteDatabase.isWriteAheadLoggingEnabled();
        fdl fdlVar = (fdl) this.a;
        Executor executor = fdlVar.i;
        fdf fdfVar3 = isWriteAheadLoggingEnabled ? new fdf(sQLiteDatabase, fdlVar.c, executor, fdlVar.p) : new fdf(sQLiteDatabase, executor, executor, fdlVar.p);
        return fdl.a(hnu.aJ(fdfVar3), new fdg(fdfVar3, i3));
    }
}
