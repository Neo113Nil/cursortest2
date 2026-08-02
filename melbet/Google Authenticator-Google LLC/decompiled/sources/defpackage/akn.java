package defpackage;

import android.database.SQLException;
import android.view.View;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akn extends kra implements krx {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akn(akt aktVar, kqj kqjVar, int i) {
        super(2, kqjVar);
        this.d = i;
        this.c = aktVar;
    }

    @Override // defpackage.krx
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                return ((akn) c((ald) obj, (kqj) obj2)).b(kow.a);
            case 1:
                return ((akn) c((aky) obj, (kqj) obj2)).b(kow.a);
            case 2:
                return ((akn) c((kzd) obj, (kqj) obj2)).b(kow.a);
            case 3:
                return ((akn) c((kvm) obj, (kqj) obj2)).b(kow.a);
            case 4:
                return ((akn) c((kzd) obj, (kqj) obj2)).b(kow.a);
            case 5:
                return ((akn) c((kzd) obj, (kqj) obj2)).b(kow.a);
            case 6:
                return ((akn) c((kzd) obj, (kqj) obj2)).b(kow.a);
            case 7:
                return ((akn) c((kvm) obj, (kqj) obj2)).b(kow.a);
            case 8:
                return ((akn) c((kvm) obj, (kqj) obj2)).b(kow.a);
            case 9:
                return ((akn) c((kzd) obj, (kqj) obj2)).b(kow.a);
            case 10:
                return ((akn) c((kzr) obj, (kqj) obj2)).b(kow.a);
            default:
                return ((akn) c((kzd) obj, (kqj) obj2)).b(kow.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x0380, code lost:
    
        if (r0 == r1) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0382, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x035f, code lost:
    
        if (r4 == r1) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if (r3.cg(r2, r16) == r1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
    
        if (r6.a(r3, r16) == r1) goto L17;
     */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, jpt] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, jpt] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.Object, jpt] */
    /* JADX WARN: Type inference failed for: r3v28, types: [java.lang.Object, krt] */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.lang.Object, jpt] */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    @Override // defpackage.kqu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj) {
        ald aldVar;
        Object e;
        Object d;
        kzq kzqVar;
        azc azcVar;
        int i = 10;
        int i2 = 6;
        int i3 = 0;
        switch (this.d) {
            case 0:
                kqp kqpVar = kqp.a;
                int i4 = this.a;
                try {
                    if (i4 == 0) {
                        ixc.Y(obj);
                        aldVar = (ald) this.b;
                        this.b = aldVar;
                        this.a = 1;
                        e = aldVar.e();
                        break;
                    } else {
                        if (i4 != 1) {
                            ixc.Y(obj);
                            d = obj;
                            return (Set) d;
                        }
                        aldVar = (ald) this.b;
                        ixc.Y(obj);
                        e = obj;
                    }
                    if (!((Boolean) e).booleanValue()) {
                        akg akgVar = akg.b;
                        akn aknVar = new akn((akt) this.c, (kqj) null, 1, (byte[]) null);
                        this.b = null;
                        this.a = 2;
                        d = aldVar.d(akgVar, aknVar, this);
                        break;
                    } else {
                        return kpm.a;
                    }
                } catch (SQLException unused) {
                    return kpm.a;
                }
            case 1:
                kqp kqpVar2 = kqp.a;
                if (this.a != 0) {
                    ixc.Y(obj);
                    return obj;
                }
                ixc.Y(obj);
                aky akyVar = (aky) this.b;
                Object obj2 = this.c;
                this.a = 1;
                Object a = ((akt) obj2).a(akyVar, this);
                return a == kqpVar2 ? kqpVar2 : a;
            case 2:
                kqp kqpVar3 = kqp.a;
                if (this.a != 0) {
                    ixc.Y(obj);
                } else {
                    ixc.Y(obj);
                    kzd kzdVar = (kzd) this.b;
                    Object obj3 = this.c;
                    awc awcVar = new awc(obj3, kzdVar);
                    awp awpVar = ((awd) obj3).a;
                    synchronized (awpVar.b) {
                        LinkedHashSet linkedHashSet = awpVar.c;
                        if (linkedHashSet.add(awcVar)) {
                            if (linkedHashSet.size() == 1) {
                                awpVar.d = awpVar.b();
                                asq.a();
                                int i5 = awq.a;
                                awpVar.getClass().getSimpleName();
                                Objects.toString(awpVar.d);
                                awpVar.d();
                            }
                            awcVar.a(awpVar.d);
                        }
                    }
                    awb awbVar = new awb(this.c, awcVar, i3);
                    this.a = 1;
                    if (ixj.g(kzdVar, awbVar, this) == kqpVar3) {
                        return kqpVar3;
                    }
                }
                return kow.a;
            case 3:
                kqp kqpVar4 = kqp.a;
                if (this.a != 0) {
                    ixc.Y(obj);
                } else {
                    ixc.Y(obj);
                    kvm kvmVar = (kvm) this.b;
                    dtj dtjVar = (dtj) this.c;
                    dth dthVar = new dth(dtjVar, kvmVar);
                    this.a = 1;
                    if (lar.g((lar) dtjVar.a.d.g, dthVar, this) == kqpVar4) {
                        return kqpVar4;
                    }
                }
                return kow.a;
            case 4:
                kqp kqpVar5 = kqp.a;
                if (this.a != 0) {
                    ixc.Y(obj);
                } else {
                    ixc.Y(obj);
                    kzd kzdVar2 = (kzd) this.b;
                    dvg dvgVar = new dvg(kzdVar2);
                    Object obj4 = this.c;
                    cww.l.a(dvgVar, new ccb(((dvi) obj4).a, 11)).getClass();
                    awb awbVar2 = new awb(obj4, dvgVar, i2);
                    this.a = 1;
                    if (ixj.g(kzdVar2, awbVar2, this) == kqpVar5) {
                        return kqpVar5;
                    }
                }
                return kow.a;
            case 5:
                kqp kqpVar6 = kqp.a;
                if (this.a != 0) {
                    ixc.Y(obj);
                } else {
                    ixc.Y(obj);
                    final kzd kzdVar3 = (kzd) this.b;
                    final LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Object obj5 = this.c;
                    final dvk dvkVar = (dvk) obj5;
                    cvo cvoVar = new cvo() { // from class: dvj
                        @Override // defpackage.cvo
                        public final void a(her herVar) {
                            herVar.getClass();
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap(ixd.m(herVar.size()));
                            for (Map.Entry entry : herVar.entrySet()) {
                                Map map = linkedHashMap;
                                Object key = entry.getKey();
                                Object value = entry.getValue();
                                value.getClass();
                                cvg cvgVar = (cvg) value;
                                Object key2 = entry.getKey();
                                Object obj6 = map.get(key2);
                                if (obj6 == null) {
                                    dvk dvkVar2 = dvkVar;
                                    obj6 = dvkVar2.a.a(new ajt(18));
                                    map.put(key2, obj6);
                                }
                                linkedHashMap2.put(key, new dvs(cvgVar, (jiu) obj6));
                            }
                            kzd.this.j(linkedHashMap2);
                        }
                    };
                    cwe.a(cvoVar, dvkVar.b);
                    awb awbVar3 = new awb(obj5, cvoVar, 8);
                    this.a = 1;
                    if (ixj.g(kzdVar3, awbVar3, this) == kqpVar6) {
                        return kqpVar6;
                    }
                }
                return kow.a;
            case 6:
                kqp kqpVar7 = kqp.a;
                if (this.a != 0) {
                    ixc.Y(obj);
                } else {
                    ixc.Y(obj);
                    final kzd kzdVar4 = (kzd) this.b;
                    cvn cvnVar = new cvn() { // from class: dvo
                        @Override // defpackage.cvn
                        public final void a(her herVar) {
                            kzd.this.j(herVar);
                        }
                    };
                    Object obj6 = this.c;
                    cvw.b.a(cvnVar, new ccb(((dvq) obj6).n, i2)).getClass();
                    awb awbVar4 = new awb(obj6, cvnVar, 9);
                    this.a = 1;
                    if (ixj.g(kzdVar4, awbVar4, this) == kqpVar7) {
                        return kqpVar7;
                    }
                }
                return kow.a;
            case 7:
                kqp kqpVar8 = kqp.a;
                if (this.a != 0) {
                    ixc.Y(obj);
                } else {
                    ixc.Y(obj);
                    kvm kvmVar2 = (kvm) this.b;
                    Object obj7 = this.c;
                    this.a = 1;
                    dvu dvuVar = (dvu) obj7;
                    ehr ehrVar = dvuVar.a;
                    kzq azcVar2 = new azc(null, 3);
                    gjl gjlVar = dvuVar.h;
                    fym fymVar = dvuVar.i;
                    if (ehrVar != null) {
                        ehrVar.g((jfi) ((gzp) fymVar.e).e());
                        azcVar2 = new kzl(new dve(ehrVar, (dvf) fymVar.c.b(), gjlVar, null));
                    }
                    kzq a2 = ((dvk) fymVar.f.b()).a();
                    dvq dvqVar = dvuVar.b;
                    if (dvqVar == null) {
                        kzqVar = new azc(null, 3);
                    } else {
                        kzq azcVar3 = new azc(null, 3);
                        if (ehrVar != null) {
                            ehrVar.g((jfi) ((gzp) fymVar.e).e());
                            kzqVar = (dvqVar.c.isPresent() || dvqVar.o.f()) ? new lae(dvqVar.m, ehrVar, dvqVar, 1) : new azc(new dvl(null, null, null), 3);
                        } else {
                            kzqVar = azcVar3;
                        }
                    }
                    if (!((gzp) fymVar.b.b()).f() || ehrVar == null) {
                        azcVar = null;
                    } else {
                        ehrVar.g((jfi) ((gzp) fymVar.e).e());
                        gjlVar.f(ehrVar.a);
                        azcVar = new azc(null, 3);
                    }
                    if (azcVar == null) {
                        azcVar = new azc(null, 3);
                    }
                    ixg.i(kvmVar2, null, 0, new alg(azcVar2, dvuVar, (kqj) null, 10), 3);
                    ixg.i(kvmVar2, null, 0, new alg(kzqVar, dvuVar, (kqj) null, 11, (byte[]) null), 3);
                    ixg.i(kvmVar2, null, 0, new alg(azcVar, dvuVar, (kqj) null, 12, (char[]) null), 3);
                    ixg.i(kvmVar2, null, 0, new alg(a2, dvuVar, (kqj) null, 13, (short[]) null), 3);
                    if (kow.a == kqpVar8) {
                        return kqpVar8;
                    }
                }
                return kow.a;
            case 8:
                kqp kqpVar9 = kqp.a;
                if (this.a != 0) {
                    ixc.Y(obj);
                } else {
                    ixc.Y(obj);
                    kvm kvmVar3 = (kvm) this.b;
                    Object obj8 = this.c;
                    this.a = 1;
                    dvv dvvVar = (dvv) obj8;
                    ixg.i(kvmVar3, null, 0, new alg(((dvk) dvvVar.e.f.b()).a(), dvvVar, (kqj) null, 14), 3);
                    ixg.i(kvmVar3, null, 0, new aki(dvvVar, (kqj) null, 17), 3);
                    if (kow.a == kqpVar9) {
                        return kqpVar9;
                    }
                }
                return kow.a;
            case 9:
                kqp kqpVar10 = kqp.a;
                if (this.a != 0) {
                    ixc.Y(obj);
                } else {
                    ixc.Y(obj);
                    kzd kzdVar5 = (kzd) this.b;
                    Object obj9 = this.c;
                    dwb dwbVar = (dwb) obj9;
                    ehn ehnVar = new ehn(dwbVar, kzdVar5);
                    dwbVar.a.e(ehnVar);
                    ehnVar.c();
                    awb awbVar5 = new awb(obj9, ehnVar, i);
                    this.a = 1;
                    if (ixj.g(kzdVar5, awbVar5, this) == kqpVar10) {
                        return kqpVar10;
                    }
                }
                return kow.a;
            case 10:
                kqp kqpVar11 = kqp.a;
                if (this.a == 0) {
                    ixc.Y(obj);
                    kzr kzrVar = (kzr) this.b;
                    Object obj10 = this.c;
                    ?? r6 = ((eau) obj10).b;
                    if (!r6.isEmpty()) {
                        kni kniVar = new kni((kzq[]) ixc.p(r6).toArray(new kzq[0]), obj10, 1);
                        this.a = 2;
                        break;
                    } else {
                        jia jiaVar = new jia(View.generateViewId());
                        this.a = 1;
                        break;
                    }
                } else {
                    ixc.Y(obj);
                }
                return kow.a;
            default:
                kqp kqpVar12 = kqp.a;
                int i6 = this.a;
                ixc.Y(obj);
                if (i6 == 0) {
                    kzd kzdVar6 = (kzd) this.b;
                    eat eatVar = (eat) ((eau) this.c).a.a(kzdVar6);
                    eatVar.b = false;
                    eatVar.b();
                    eatVar.b = true;
                    eatVar.c.a(null);
                    aux auxVar = new aux(eatVar, 15);
                    this.a = 1;
                    if (ixj.g(kzdVar6, auxVar, this) == kqpVar12) {
                        return kqpVar12;
                    }
                }
                return kow.a;
        }
    }

    @Override // defpackage.kqu
    public final kqj c(Object obj, kqj kqjVar) {
        switch (this.d) {
            case 0:
                akn aknVar = new akn((akt) this.c, kqjVar, 0);
                aknVar.b = obj;
                return aknVar;
            case 1:
                akn aknVar2 = new akn((akt) this.c, kqjVar, 1, (byte[]) null);
                aknVar2.b = obj;
                return aknVar2;
            case 2:
                akn aknVar3 = new akn((awd) this.c, kqjVar, 2);
                aknVar3.b = obj;
                return aknVar3;
            case 3:
                akn aknVar4 = new akn((dtj) this.c, kqjVar, 3);
                aknVar4.b = obj;
                return aknVar4;
            case 4:
                akn aknVar5 = new akn((dvi) this.c, kqjVar, 4);
                aknVar5.b = obj;
                return aknVar5;
            case 5:
                akn aknVar6 = new akn((dvk) this.c, kqjVar, 5);
                aknVar6.b = obj;
                return aknVar6;
            case 6:
                akn aknVar7 = new akn((dvq) this.c, kqjVar, 6);
                aknVar7.b = obj;
                return aknVar7;
            case 7:
                akn aknVar8 = new akn((dvu) this.c, kqjVar, 7);
                aknVar8.b = obj;
                return aknVar8;
            case 8:
                akn aknVar9 = new akn((dvv) this.c, kqjVar, 8);
                aknVar9.b = obj;
                return aknVar9;
            case 9:
                akn aknVar10 = new akn((dwb) this.c, kqjVar, 9);
                aknVar10.b = obj;
                return aknVar10;
            case 10:
                akn aknVar11 = new akn((eau) this.c, kqjVar, 10, (byte[]) null);
                aknVar11.b = obj;
                return aknVar11;
            default:
                akn aknVar12 = new akn((eau) this.c, kqjVar, 11);
                aknVar12.b = obj;
                return aknVar12;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akn(akt aktVar, kqj kqjVar, int i, byte[] bArr) {
        super(2, kqjVar);
        this.d = i;
        this.c = aktVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akn(awd awdVar, kqj kqjVar, int i) {
        super(2, kqjVar);
        this.d = i;
        this.c = awdVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akn(dtj dtjVar, kqj kqjVar, int i) {
        super(2, kqjVar);
        this.d = i;
        this.c = dtjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akn(dvi dviVar, kqj kqjVar, int i) {
        super(2, kqjVar);
        this.d = i;
        this.c = dviVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akn(dvk dvkVar, kqj kqjVar, int i) {
        super(2, kqjVar);
        this.d = i;
        this.c = dvkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akn(dvq dvqVar, kqj kqjVar, int i) {
        super(2, kqjVar);
        this.d = i;
        this.c = dvqVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akn(dvu dvuVar, kqj kqjVar, int i) {
        super(2, kqjVar);
        this.d = i;
        this.c = dvuVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akn(dvv dvvVar, kqj kqjVar, int i) {
        super(2, kqjVar);
        this.d = i;
        this.c = dvvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akn(dwb dwbVar, kqj kqjVar, int i) {
        super(2, kqjVar);
        this.d = i;
        this.c = dwbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akn(eau eauVar, kqj kqjVar, int i) {
        super(2, kqjVar);
        this.d = i;
        this.c = eauVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akn(eau eauVar, kqj kqjVar, int i, byte[] bArr) {
        super(2, kqjVar);
        this.d = i;
        this.c = eauVar;
    }
}
