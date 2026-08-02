package defpackage;

import android.content.Context;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class dvn implements kri {
    public final /* synthetic */ String a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ int c;
    public final /* synthetic */ cwy d;
    private final /* synthetic */ int e;

    public /* synthetic */ dvn(cwy cwyVar, String str, int i, Context context, int i2) {
        this.e = i2;
        this.d = cwyVar;
        this.a = str;
        this.c = i;
        this.b = context;
    }

    @Override // defpackage.kri
    public final Object a() {
        if (this.e == 0) {
            String str = this.a;
            dvq.a.put(str, true);
            jkj k = ijw.b.k();
            k.getClass();
            ikg.e(k);
            ikg.d(ije.BADGE_SOURCE_G1, k);
            jkj k2 = ijv.a.k();
            k2.getClass();
            jkj k3 = ijt.a.k();
            k3.getClass();
            ikg.j(Build.VERSION.SDK_INT, k3);
            cll cllVar = cll.a;
            Context context = this.b;
            ikg.l(cmd.a(context), k3);
            String packageName = context.getPackageName();
            packageName.getClass();
            ikg.k(packageName, k3);
            ikg.g(ikg.i(k3), k2);
            ikg.h(this.c, k2);
            ikg.c(ikg.f(k2), k);
            ijw b = ikg.b(k);
            cvs cvsVar = cvw.a;
            cpa cpaVar = new cpa();
            cpaVar.b = new cli[]{cvb.c};
            cpaVar.a = new cik((Object) str, (Object) b, 5);
            cpaVar.c = 28013;
            this.d.i(0, cpaVar.a());
            return kow.a;
        }
        jkj k4 = cvq.a.k();
        if (!k4.b.M()) {
            k4.t();
        }
        ((cvq) k4.b).c = this.a;
        jkj k5 = ijb.a.k();
        if (!k5.b.M()) {
            k5.t();
        }
        int i = this.c;
        ijb ijbVar = (ijb) k5.b;
        ijbVar.c = i - 1;
        ijbVar.b |= 1;
        if (!k4.b.M()) {
            k4.t();
        }
        Context context2 = this.b;
        cvq cvqVar = (cvq) k4.b;
        ijb ijbVar2 = (ijb) k5.q();
        ijbVar2.getClass();
        cvqVar.d = ijbVar2;
        cvqVar.b |= 1;
        String packageName2 = context2.getPackageName();
        if (!k4.b.M()) {
            k4.t();
        }
        cwy cwyVar = this.d;
        cvq cvqVar2 = (cvq) k4.b;
        packageName2.getClass();
        cvqVar2.b |= 2;
        cvqVar2.e = packageName2;
        cvq cvqVar3 = (cvq) k4.q();
        cwh cwhVar = cwi.a;
        cpa cpaVar2 = new cpa();
        cpaVar2.b = new cli[]{cvb.b};
        cpaVar2.a = new ciu(cvqVar3, 12);
        cpaVar2.c = 28010;
        cwyVar.i(0, cpaVar2.a());
        return kow.a;
    }

    public /* synthetic */ dvn(String str, cwy cwyVar, int i, Context context, int i2) {
        this.e = i2;
        this.a = str;
        this.d = cwyVar;
        this.c = i;
        this.b = context;
    }
}
