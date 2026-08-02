package defpackage;

import java.io.IOException;
import java.util.Map;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ccb implements gzf {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ccb(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x039d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0304 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v55, types: [java.lang.Object, krt] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Object, krt] */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.lang.Object, krt] */
    /* JADX WARN: Type inference failed for: r0v68, types: [java.lang.Object, krt] */
    /* JADX WARN: Type inference failed for: r0v70, types: [java.lang.Object, krt] */
    @Override // defpackage.gzf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj) {
        ccf ccfVar;
        ccf ccfVar2;
        int i = 10;
        int i2 = 9;
        final int i3 = 3;
        final int i4 = 0;
        final int i5 = 2;
        final int i6 = 1;
        switch (this.b) {
            case 0:
                Map map = (Map) obj;
                heg hegVar = new heg(4);
                for (cmq cmqVar : map.values()) {
                    Object obj2 = cmqVar.a;
                    Object obj3 = cmqVar.b;
                    if (obj3 == null) {
                        if (obj2 != null) {
                            bpc bpcVar = (bpc) obj2;
                            if (!bpcVar.k) {
                                hegVar.h(new ccf(3, 2, bpcVar));
                            }
                        }
                    } else if (obj2 == null) {
                        bpc bpcVar2 = (bpc) obj3;
                        if (!bpcVar2.g()) {
                            hegVar.h(new ccf(3, 1, bpcVar2));
                        }
                    } else {
                        bpc bpcVar3 = (bpc) obj2;
                        if (!bpcVar3.equals(obj3)) {
                            bpc bpcVar4 = (bpc) obj3;
                            if (bpcVar4.g()) {
                                if (!bpcVar3.k) {
                                    Long l = bpcVar4.l;
                                    long j = bpcVar3.j;
                                    long longValue = l.longValue();
                                    if (longValue > j) {
                                        ccfVar = new ccf(1, 1, bpcVar4);
                                        if (ccfVar == null) {
                                            hegVar.h(ccfVar);
                                        }
                                    } else if (longValue < j) {
                                        ccfVar2 = new ccf(2, 2, bpcVar3);
                                        ccfVar = ccfVar2;
                                        if (ccfVar == null) {
                                        }
                                    }
                                }
                            } else if (bpcVar3.k) {
                                long j2 = bpcVar3.j;
                                long j3 = bpcVar4.j;
                                if (j2 > j3) {
                                    ccfVar = new ccf(1, 2, bpcVar4);
                                } else if (j2 < j3) {
                                    ccfVar = new ccf(2, 1, bpcVar4);
                                }
                                if (ccfVar == null) {
                                }
                            } else {
                                long j4 = bpcVar3.j;
                                long j5 = bpcVar4.j;
                                if (j4 > j5) {
                                    ccfVar2 = new ccf(2, 2, bpcVar3);
                                    ccfVar = ccfVar2;
                                    if (ccfVar == null) {
                                    }
                                } else if (j4 < j5) {
                                    ccfVar = new ccf(2, 1, bpcVar4);
                                    if (ccfVar == null) {
                                    }
                                }
                            }
                        }
                        ccfVar = null;
                        if (ccfVar == null) {
                        }
                    }
                }
                ccd ccdVar = (ccd) this.a;
                ccdVar.f = ccd.a("totp", map.values());
                ccdVar.g = ccd.a("hotp", map.values());
                return hegVar.g();
            case 1:
                bpc bpcVar5 = (bpc) obj;
                Object obj4 = this.a;
                try {
                    jkj k = jnm.a.k();
                    jnd B = kt.B(bpcVar5, (String) obj4);
                    if (!k.b.M()) {
                        k.t();
                    }
                    jnm jnmVar = (jnm) k.b;
                    B.getClass();
                    jnmVar.c = B;
                    jnmVar.b |= 1;
                    return gzp.h((jnm) k.q());
                } catch (boz | bps e) {
                    ((hkf) ((hkf) ((hkf) caz.a.g()).h(e)).i("com/google/android/apps/authenticator2/passbox/PassboxServiceClientImpl", "batchUpdateOtps", (char) 429, "PassboxServiceClientImpl.java")).s("Could not create a passbox credential from an OTP during batch update before making the gRPC call");
                    return gyf.a;
                }
            case 2:
                cjq cjqVar = (cjq) obj;
                if (cjqVar != null) {
                    jkl jklVar = ((cjf) this.a).n;
                    jon jonVar = ((jol) jklVar.b).m;
                    if (jonVar == null) {
                        jonVar = jon.a;
                    }
                    jkl jklVar2 = (jkl) jonVar.C();
                    jon jonVar2 = ((jol) jklVar.b).m;
                    if (jonVar2 == null) {
                        jonVar2 = jon.a;
                    }
                    iik iikVar = jonVar2.e;
                    if (iikVar == null) {
                        iikVar = iik.a;
                    }
                    jkj C = iikVar.C();
                    String b = cjqVar.b();
                    if (!C.b.M()) {
                        C.t();
                    }
                    iik iikVar2 = (iik) C.b;
                    b.getClass();
                    iikVar2.c = b;
                    iij a = cjqVar.a();
                    if (!C.b.M()) {
                        C.t();
                    }
                    iik iikVar3 = (iik) C.b;
                    a.getClass();
                    iikVar3.d = a;
                    iikVar3.b |= 1;
                    if (!jklVar2.b.M()) {
                        jklVar2.t();
                    }
                    jon jonVar3 = (jon) jklVar2.b;
                    iik iikVar4 = (iik) C.q();
                    iikVar4.getClass();
                    jonVar3.e = iikVar4;
                    jonVar3.b |= 4;
                    jon jonVar4 = (jon) jklVar2.q();
                    if (!jklVar.b.M()) {
                        jklVar.t();
                    }
                    jol jolVar = (jol) jklVar.b;
                    jonVar4.getClass();
                    jolVar.m = jonVar4;
                    jolVar.b |= 268435456;
                }
                return null;
            case 3:
                return ((ddw) this.a).o((cjf) obj, cjx.c);
            case 4:
                return cjx.a(((Boolean) obj).booleanValue(), ((cku) this.a).c.b);
            case 5:
                return ((cms) this.a).j(ox.p(cvw.a, "accountDataResponseListener"), 28012);
            case 6:
                final cvn cvnVar = (cvn) obj;
                Object obj5 = this.a;
                cms cmsVar = (cms) obj5;
                cme m = cmsVar.m(cvw.a, "accountDataResponseListener");
                cik cikVar = new cik(obj5, new cvu(m), 6);
                ciu ciuVar = new ciu(obj5, i2);
                cow cowVar = new cow();
                cowVar.f = m;
                cowVar.c = new cli[]{cvb.c};
                cowVar.a = cikVar;
                cowVar.b = ciuVar;
                cowVar.e = 28011;
                ddi n = cmsVar.n(cowVar.a());
                n.m(new cvy(cvnVar, i6));
                n.k(new ddb() { // from class: cvz
                    @Override // defpackage.ddb
                    public final void a() {
                        int i7 = i6;
                        if (i7 == 0) {
                            cwe.b.b(cvnVar, new cvr(3));
                            return;
                        }
                        int i8 = 2;
                        if (i7 == 1) {
                            cvw.b.b(cvnVar, new cvr(i8));
                        } else if (i7 != 2) {
                            cww.l.b(cvnVar, new cvr(8));
                        } else {
                            cwi.b.b(cvnVar, new cvr(6));
                        }
                    }
                });
                return n;
            case 7:
                return ((cms) this.a).j(ox.p(cwe.a, "accountHealthListener"), 28002);
            case 8:
                final cvo cvoVar = (cvo) obj;
                Object obj6 = this.a;
                cms cmsVar2 = (cms) obj6;
                cme m2 = cmsVar2.m(cwe.a, "accountHealthListener");
                cik cikVar2 = new cik(obj6, new cwo(m2, 0), 7);
                ciu ciuVar2 = new ciu(obj6, i);
                cow cowVar2 = new cow();
                cowVar2.f = m2;
                cowVar2.c = new cli[]{cvb.a};
                cowVar2.a = cikVar2;
                cowVar2.b = ciuVar2;
                cowVar2.e = 28001;
                ddi n2 = cmsVar2.n(cowVar2.a());
                n2.m(new cvy(cvoVar, i4));
                n2.k(new ddb() { // from class: cvz
                    @Override // defpackage.ddb
                    public final void a() {
                        int i7 = i4;
                        if (i7 == 0) {
                            cwe.b.b(cvoVar, new cvr(3));
                            return;
                        }
                        int i8 = 2;
                        if (i7 == 1) {
                            cvw.b.b(cvoVar, new cvr(i8));
                        } else if (i7 != 2) {
                            cww.l.b(cvoVar, new cvr(8));
                        } else {
                            cwi.b.b(cvoVar, new cvr(6));
                        }
                    }
                });
                return n2;
            case 9:
                return ((cms) this.a).j(ox.p(cwi.a, "accountMessagesListener"), 28008);
            case 10:
                final cvp cvpVar = (cvp) obj;
                Object obj7 = this.a;
                cms cmsVar3 = (cms) obj7;
                cme m3 = cmsVar3.m(cwi.a, "accountMessagesListener");
                cik cikVar3 = new cik(obj7, new cwo(m3, 2, (byte[]) null), i2);
                ciu ciuVar3 = new ciu(obj7, 13);
                cow cowVar3 = new cow();
                cowVar3.f = m3;
                cowVar3.c = new cli[]{cvb.b};
                cowVar3.a = cikVar3;
                cowVar3.b = ciuVar3;
                cowVar3.e = 28007;
                ddi n3 = cmsVar3.n(cowVar3.a());
                n3.m(new cvy(cvpVar, i5));
                n3.k(new ddb() { // from class: cvz
                    @Override // defpackage.ddb
                    public final void a() {
                        int i7 = i5;
                        if (i7 == 0) {
                            cwe.b.b(cvpVar, new cvr(3));
                            return;
                        }
                        int i8 = 2;
                        if (i7 == 1) {
                            cvw.b.b(cvpVar, new cvr(i8));
                        } else if (i7 != 2) {
                            cww.l.b(cvpVar, new cvr(8));
                        } else {
                            cwi.b.b(cvpVar, new cvr(6));
                        }
                    }
                });
                return n3;
            case 11:
                final cvm cvmVar = (cvm) obj;
                Object obj8 = this.a;
                cms cmsVar4 = (cms) obj8;
                cme m4 = cmsVar4.m(cww.k, "accountDataResponseV2Listener");
                cik cikVar4 = new cik(obj8, new cwu(m4), i);
                ciu ciuVar4 = new ciu(obj8, 14);
                cow cowVar4 = new cow();
                cowVar4.f = m4;
                cowVar4.c = new cli[]{cvb.d};
                cowVar4.a = cikVar4;
                cowVar4.b = ciuVar4;
                cowVar4.e = 28015;
                ddi n4 = cmsVar4.n(cowVar4.a());
                n4.m(new cvy(cvmVar, i3));
                n4.k(new ddb() { // from class: cvz
                    @Override // defpackage.ddb
                    public final void a() {
                        int i7 = i3;
                        if (i7 == 0) {
                            cwe.b.b(cvmVar, new cvr(3));
                            return;
                        }
                        int i8 = 2;
                        if (i7 == 1) {
                            cvw.b.b(cvmVar, new cvr(i8));
                        } else if (i7 != 2) {
                            cww.l.b(cvmVar, new cvr(8));
                        } else {
                            cwi.b.b(cvmVar, new cvr(6));
                        }
                    }
                });
                return n4;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return ((cms) this.a).j(ox.p(cww.k, "accountDataResponseV2Listener"), 28016);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return this.a.a(obj);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return this.a.a(obj);
            case 15:
                return this.a.a(obj);
            case 16:
                dop dopVar = (dop) obj;
                if (!dok.h(dopVar)) {
                    return ((dok) this.a).a();
                }
                ikc ikcVar = dopVar.b;
                if (ikcVar == null) {
                    ikcVar = ikc.a;
                }
                return gzp.h(ikcVar);
            case 17:
                return this.a.a(obj);
            case 18:
                return this.a.a(obj);
            case 19:
                return this.a;
            default:
                try {
                    return new ProcessBuilder("/system/bin/trigger_perfetto", (String) obj).start();
                } catch (IOException unused) {
                    ((emt) this.a).b = true;
                    return null;
                }
        }
    }
}
