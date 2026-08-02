package defpackage;

import android.app.Application;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ets implements etp {
    public final dbw a;

    public ets(dbw dbwVar) {
        this.a = dbwVar;
    }

    public static hvi g(ddi ddiVar) {
        return hso.g(dih.d(ddiVar), cmm.class, new bwu(17), huf.a);
    }

    @Override // defpackage.etp
    public final hvi a(String str) {
        str.getClass();
        return g(this.a.b(str));
    }

    @Override // defpackage.etp
    public final hvi b(etm etmVar) {
        dbw dbwVar = this.a;
        return g(dbwVar.c(etmVar).a(huf.a, new cke(dbwVar, etmVar, 2)));
    }

    @Override // defpackage.etp
    public final hvi c(String str, String str2) {
        str.getClass();
        str2.getClass();
        ddi r = this.a.r(str, str2);
        huf hufVar = huf.a;
        etr etrVar = new etr();
        ddm ddmVar = new ddm();
        ddm ddmVar2 = (ddm) r;
        ddmVar2.e.e(new dda(hufVar, etrVar, ddmVar, 1));
        ddmVar2.n();
        return g(ddmVar);
    }

    @Override // defpackage.etp
    public final hvi d() {
        return g(this.a.d());
    }

    @Override // defpackage.etp
    public final hvi e(String str, int i, String[] strArr, byte[] bArr) {
        strArr.getClass();
        return g(this.a.f(str, i, strArr, bArr));
    }

    @Override // defpackage.etp
    public final hvi f(evr evrVar) {
        String str;
        String processName;
        String simpleName = dcb.class.getSimpleName();
        dbw dbwVar = this.a;
        cme m = dbwVar.m(evrVar, simpleName);
        if (cso.a == null) {
            processName = Application.getProcessName();
            cso.a = processName;
        }
        String str2 = cso.a;
        if (str2 == null) {
            str = "__PH_INTERNAL__NO_PROCESS__";
        } else {
            str = str2 + "|" + System.identityHashCode(dcb.class);
        }
        cik cikVar = new cik((Object) str, (Object) m, 14);
        czc czcVar = new czc(4);
        cow cowVar = new cow();
        cowVar.f = m;
        cowVar.a = cikVar;
        cowVar.b = czcVar;
        cowVar.c = new cli[]{dbm.d};
        cowVar.d = false;
        return g(dbwVar.n(cowVar.a()));
    }
}
