package defpackage;

import android.view.View;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dve extends kra implements krx {
    int a;
    final /* synthetic */ ehr b;
    final /* synthetic */ dvf c;
    final /* synthetic */ gjl d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dve(ehr ehrVar, dvf dvfVar, gjl gjlVar, kqj kqjVar) {
        super(2, kqjVar);
        this.b = ehrVar;
        this.c = dvfVar;
        this.d = gjlVar;
    }

    @Override // defpackage.krx
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dve) c((kzd) obj, (kqj) obj2)).b(kow.a);
    }

    @Override // defpackage.kqu
    public final Object b(Object obj) {
        kqp kqpVar = kqp.a;
        int i = this.a;
        ixc.Y(obj);
        if (i == 0) {
            final kzd kzdVar = (kzd) this.e;
            ehr ehrVar = this.b;
            final ksw kswVar = new ksw();
            final dvf dvfVar = this.c;
            final gjl gjlVar = this.d;
            final String str = ehrVar.c;
            cvp cvpVar = new cvp() { // from class: dvd
                /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
                
                    if ((r5 - 1) != 3) goto L18;
                 */
                @Override // defpackage.cvp
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void a(her herVar) {
                    ksw kswVar2 = ksw.this;
                    if (ksp.b(herVar, kswVar2.a)) {
                        return;
                    }
                    final String str2 = str;
                    kswVar2.a = herVar;
                    final cvi cviVar = (cvi) herVar.get(str2);
                    jhy jhyVar = null;
                    if (cviVar != null) {
                        iiz iizVar = cviVar.b;
                        if (iizVar == null) {
                            iizVar = iiz.a;
                        }
                        iiy iiyVar = iizVar.c;
                        if (iiyVar == null) {
                            iiyVar = iiy.a;
                        }
                        int y = a.y(iiyVar.b);
                        if (y == 0) {
                            y = 1;
                        }
                    }
                    cviVar = null;
                    if (cviVar != null) {
                        final gjl gjlVar2 = gjlVar;
                        final dvf dvfVar2 = dvfVar;
                        krt krtVar = new krt() { // from class: dvc
                            @Override // defpackage.krt
                            public final Object a(Object obj2) {
                                ((View) obj2).getClass();
                                iiz iizVar2 = cviVar.b;
                                if (iizVar2 == null) {
                                    iizVar2 = iiz.a;
                                }
                                iiy iiyVar2 = iizVar2.c;
                                if (iiyVar2 == null) {
                                    iiyVar2 = iiy.a;
                                }
                                iix iixVar = iiyVar2.c;
                                if (iixVar == null) {
                                    iixVar = iix.a;
                                }
                                iiw iiwVar = iixVar.b;
                                if (iiwVar == null) {
                                    iiwVar = iiw.a;
                                }
                                iiwVar.getClass();
                                if ((iiwVar.b & 1) == 0) {
                                    jkj C = iiwVar.C();
                                    if (!C.b.M()) {
                                        C.t();
                                    }
                                    iiw iiwVar2 = (iiw) C.b;
                                    iiwVar2.b |= 1;
                                    iiwVar2.c = 400;
                                    C.G(iie.a);
                                    jkp q = C.q();
                                    q.getClass();
                                    iiwVar = (iiw) q;
                                }
                                String str3 = str2;
                                dvf dvfVar3 = dvf.this;
                                dvfVar3.g.d();
                                dvfVar3.h.e(dih.ag(str3, iiwVar, gyf.a), new dtn(new dtl(str3), jiv.a), 4);
                                return jiv.b;
                            }
                        };
                        jiw jiwVar = dvfVar2.b;
                        jiu jiuVar = dvfVar2.c;
                        jiwVar.c(jiuVar, krtVar);
                        jim jimVar = new jim(new jig(new jha(11, null)), new jhq(new jhh(R.string.og_recommended_actions_entry_point), jhb.b, 2, (Integer) 2, 16), null, null, null, null, null, 0, 0, 2044);
                        jhb jhbVar = jhb.i;
                        dvn dvnVar = new dvn(dvfVar2.f, str2, 2, dvfVar2.a, 1);
                        dvx dvxVar = dvfVar2.d;
                        dvxVar.a = dvnVar;
                        jkj k = hrd.a.k();
                        jkj k2 = hra.a.k();
                        if (!k2.b.M()) {
                            k2.t();
                        }
                        hra hraVar = (hra) k2.b;
                        hraVar.c = 3;
                        hraVar.b = 1 | hraVar.b;
                        hra hraVar2 = (hra) k2.q();
                        if (!k.b.M()) {
                            k.t();
                        }
                        int i2 = dvfVar2.e;
                        hrd hrdVar = (hrd) k.b;
                        hraVar2.getClass();
                        hrdVar.e = hraVar2;
                        hrdVar.b |= 64;
                        jhyVar = new jhy(jimVar, i2, jhbVar, jiuVar, dvxVar, 160133, (hrd) k.q());
                    }
                    kzdVar.j(jhyVar);
                }
            };
            cwi.a(cvpVar, dvfVar.f);
            awb awbVar = new awb(dvfVar, cvpVar, 5);
            this.a = 1;
            if (ixj.g(kzdVar, awbVar, this) == kqpVar) {
                return kqpVar;
            }
        }
        return kow.a;
    }

    @Override // defpackage.kqu
    public final kqj c(Object obj, kqj kqjVar) {
        dve dveVar = new dve(this.b, this.c, this.d, kqjVar);
        dveVar.e = obj;
        return dveVar;
    }
}
