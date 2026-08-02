package com.google.android.libraries.performance.primes.transmitter.clearcut;

import android.content.Context;
import android.util.Base64;
import com.google.android.libraries.performance.primes.transmitter.clearcut.ClearcutMetricSnapshotTransmitter;
import defpackage.a;
import defpackage.cji;
import defpackage.csm;
import defpackage.eiu;
import defpackage.esd;
import defpackage.ese;
import defpackage.esi;
import defpackage.esj;
import defpackage.esp;
import defpackage.hac;
import defpackage.hkf;
import defpackage.hkh;
import defpackage.hoq;
import defpackage.hpb;
import defpackage.hpe;
import defpackage.hpl;
import defpackage.hrj;
import defpackage.hrk;
import defpackage.hrl;
import defpackage.hrm;
import defpackage.hti;
import defpackage.htr;
import defpackage.huf;
import defpackage.hve;
import defpackage.hvi;
import defpackage.iwq;
import defpackage.jiz;
import defpackage.jkj;
import defpackage.jkl;
import defpackage.jko;
import defpackage.jkp;
import defpackage.jkw;
import defpackage.jkx;
import defpackage.jlh;
import defpackage.jlu;
import defpackage.lej;
import defpackage.lek;
import defpackage.lfd;
import defpackage.lfe;
import defpackage.lfg;
import defpackage.lfh;
import defpackage.lfi;
import defpackage.lgk;
import defpackage.lgq;
import defpackage.lgr;
import defpackage.lgv;
import j$.util.DesugarCollections;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ClearcutMetricSnapshotTransmitter implements ese {
    public static final hac a = hoq.v(new csm(18));
    public volatile cji b;
    public volatile cji c;
    private volatile esi d;
    private volatile esp e;
    private final hac f = hoq.v(new csm(17));

    @Override // defpackage.ese
    public final hvi a(final Context context, esd esdVar) {
        final Integer valueOf;
        boolean z;
        iwq iwqVar = esj.j;
        esdVar.g(iwqVar);
        hoq.y(esdVar.l.l((jko) iwqVar.c), "ClearcutMetricSnapshotTransmitter received a snapshot without the expected extension.");
        lgv lgvVar = esdVar.c;
        if (lgvVar == null) {
            lgvVar = lgv.a;
        }
        String str = lgvVar.e.isEmpty() ? lgvVar.d : lgvVar.e;
        if (str.isEmpty()) {
            valueOf = null;
        } else {
            int i = hpe.a;
            hpb hpbVar = hpl.a;
            int i2 = lgvVar.b;
            valueOf = Integer.valueOf(hpbVar.b(a.ag(str, (i2 & 8388608) != 0 ? "PRIMES_STATS" : (i2 & 32) != 0 ? "NETWORK_USAGE" : (i2 & 16) != 0 ? "TIMER" : (i2 & 8) != 0 ? "MEMORY_USAGE" : (i2 & 256) != 0 ? "BATTERY_USAGE" : (i2 & 64) != 0 ? "CRASH" : (i2 & 524288) != 0 ? "CUI" : (i2 & 512) != 0 ? "JANK" : (i2 & 128) != 0 ? "PACKAGE" : (i2 & 1024) != 0 ? "TRACE" : "UNKNOWN", "_"), StandardCharsets.UTF_8).a());
        }
        if (this.e == null) {
            synchronized (this) {
                if (this.e == null) {
                    this.e = new esp();
                }
            }
        }
        lgv lgvVar2 = esdVar.c;
        if (lgvVar2 == null) {
            lgvVar2 = lgv.a;
        }
        jkj C = lgvVar2.C();
        esp.b(esp.a, C);
        lek lekVar = ((lgv) C.b).k;
        if (lekVar == null) {
            lekVar = lek.a;
        }
        if ((lekVar.b & 1) != 0) {
            lek lekVar2 = ((lgv) C.b).k;
            if (lekVar2 == null) {
                lekVar2 = lek.a;
            }
            lej lejVar = lekVar2.c;
            if (lejVar == null) {
                lejVar = lej.a;
            }
            jkj C2 = lejVar.C();
            esp.b(esp.b, C2);
            lek lekVar3 = ((lgv) C.b).k;
            if (lekVar3 == null) {
                lekVar3 = lek.a;
            }
            jkj C3 = lekVar3.C();
            if (!C3.b.M()) {
                C3.t();
            }
            lek lekVar4 = (lek) C3.b;
            lej lejVar2 = (lej) C2.q();
            lejVar2.getClass();
            lekVar4.c = lejVar2;
            lekVar4.b |= 1;
            if (!C.b.M()) {
                C.t();
            }
            lgv lgvVar3 = (lgv) C.b;
            lek lekVar5 = (lek) C3.q();
            lekVar5.getClass();
            lgvVar3.k = lekVar5;
            lgvVar3.b |= 256;
        }
        lgk lgkVar = ((lgv) C.b).i;
        if (lgkVar == null) {
            lgkVar = lgk.a;
        }
        if ((lgkVar.b & 256) != 0) {
            lgk lgkVar2 = ((lgv) C.b).i;
            if (lgkVar2 == null) {
                lgkVar2 = lgk.a;
            }
            hrm hrmVar = lgkVar2.i;
            if (hrmVar == null) {
                hrmVar = hrm.a;
            }
            jkj C4 = hrmVar.C();
            hrj hrjVar = ((hrm) C4.b).e;
            if (hrjVar == null) {
                hrjVar = hrj.a;
            }
            hrj c = esp.c(hrjVar);
            if (!C4.b.M()) {
                C4.t();
            }
            hrm hrmVar2 = (hrm) C4.b;
            c.getClass();
            hrmVar2.e = c;
            hrmVar2.b |= 1;
            List unmodifiableList = DesugarCollections.unmodifiableList(hrmVar2.f);
            if (!C4.b.M()) {
                C4.t();
            }
            ((hrm) C4.b).f = jlu.a;
            Iterator it = unmodifiableList.iterator();
            while (it.hasNext()) {
                hrj c2 = esp.c((hrj) it.next());
                if (!C4.b.M()) {
                    C4.t();
                }
                hrm hrmVar3 = (hrm) C4.b;
                c2.getClass();
                hrmVar3.b();
                hrmVar3.f.add(c2);
            }
            hrm hrmVar4 = (hrm) C4.b;
            jkx<hrl> jkxVar = (hrmVar4.c == 4 ? (hrk) hrmVar4.d : hrk.a).b;
            jkj k = hrk.a.k();
            for (hrl hrlVar : jkxVar) {
                hrj hrjVar2 = hrlVar.c;
                if (hrjVar2 == null) {
                    hrjVar2 = hrj.a;
                }
                if ((hrjVar2.b & 2) != 0) {
                    jkj C5 = hrlVar.C();
                    hrj c3 = esp.c(hrjVar2);
                    if (!C5.b.M()) {
                        C5.t();
                    }
                    hrl hrlVar2 = (hrl) C5.b;
                    c3.getClass();
                    hrlVar2.c = c3;
                    hrlVar2.b |= 1;
                    hrlVar = (hrl) C5.q();
                }
                if (!k.b.M()) {
                    k.t();
                }
                hrk hrkVar = (hrk) k.b;
                hrlVar.getClass();
                hrkVar.b();
                hrkVar.b.add(hrlVar);
            }
            hrk hrkVar2 = (hrk) k.q();
            if (!C4.b.M()) {
                C4.t();
            }
            hrm hrmVar5 = (hrm) C4.b;
            hrkVar2.getClass();
            hrmVar5.d = hrkVar2;
            hrmVar5.c = 4;
            lgk lgkVar3 = ((lgv) C.b).i;
            if (lgkVar3 == null) {
                lgkVar3 = lgk.a;
            }
            jkj C6 = lgkVar3.C();
            hrm hrmVar6 = (hrm) C4.q();
            if (!C6.b.M()) {
                C6.t();
            }
            lgk lgkVar4 = (lgk) C6.b;
            hrmVar6.getClass();
            lgkVar4.i = hrmVar6;
            lgkVar4.b |= 256;
            lgk lgkVar5 = (lgk) C6.q();
            if (!C.b.M()) {
                C.t();
            }
            lgv lgvVar4 = (lgv) C.b;
            lgkVar5.getClass();
            lgvVar4.i = lgkVar5;
            lgvVar4.b |= 64;
        }
        lgr lgrVar = ((lgv) C.b).j;
        if (lgrVar == null) {
            lgrVar = lgr.a;
        }
        if (lgrVar.k.size() != 0) {
            lgr lgrVar2 = ((lgv) C.b).j;
            if (lgrVar2 == null) {
                lgrVar2 = lgr.a;
            }
            jkj C7 = lgrVar2.C();
            for (int i3 = 0; i3 < ((lgr) C7.b).k.size(); i3++) {
                jkj C8 = ((lgq) ((lgr) C7.b).k.get(i3)).C();
                if (!((lgq) C8.b).c.isEmpty()) {
                    if (!C8.b.M()) {
                        C8.t();
                    }
                    ((lgq) C8.b).d = jlh.a;
                    List a2 = esp.a(((lgq) C8.b).c);
                    if (!C8.b.M()) {
                        C8.t();
                    }
                    lgq lgqVar = (lgq) C8.b;
                    jkw jkwVar = lgqVar.d;
                    if (!jkwVar.c()) {
                        lgqVar.d = jkp.z(jkwVar);
                    }
                    jiz.f(a2, lgqVar.d);
                }
                if (!C8.b.M()) {
                    C8.t();
                }
                lgq lgqVar2 = (lgq) C8.b;
                lgqVar2.b &= -2;
                lgqVar2.c = lgq.a.c;
                if (!C7.b.M()) {
                    C7.t();
                }
                lgr lgrVar3 = (lgr) C7.b;
                lgq lgqVar3 = (lgq) C8.q();
                lgqVar3.getClass();
                jkx jkxVar2 = lgrVar3.k;
                if (!jkxVar2.c()) {
                    lgrVar3.k = jkp.A(jkxVar2);
                }
                lgrVar3.k.set(i3, lgqVar3);
            }
            if (!C.b.M()) {
                C.t();
            }
            lgv lgvVar5 = (lgv) C.b;
            lgr lgrVar4 = (lgr) C7.q();
            lgrVar4.getClass();
            lgvVar5.j = lgrVar4;
            lgvVar5.b |= 128;
        }
        lfe lfeVar = ((lgv) C.b).h;
        if (lfeVar == null) {
            lfeVar = lfe.a;
        }
        if (lfeVar.b.size() != 0) {
            lfe lfeVar2 = ((lgv) C.b).h;
            if (lfeVar2 == null) {
                lfeVar2 = lfe.a;
            }
            jkj C9 = lfeVar2.C();
            for (int i4 = 0; i4 < ((lfe) C9.b).b.size(); i4++) {
                jkj C10 = ((lfd) ((lfe) C9.b).b.get(i4)).C();
                if (!((lfd) C10.b).z.isEmpty()) {
                    if (!C10.b.M()) {
                        C10.t();
                    }
                    ((lfd) C10.b).A = jlh.a;
                    List a3 = esp.a(((lfd) C10.b).z);
                    if (!C10.b.M()) {
                        C10.t();
                    }
                    lfd lfdVar = (lfd) C10.b;
                    jkw jkwVar2 = lfdVar.A;
                    if (!jkwVar2.c()) {
                        lfdVar.A = jkp.z(jkwVar2);
                    }
                    jiz.f(a3, lfdVar.A);
                }
                if (!C10.b.M()) {
                    C10.t();
                }
                lfd lfdVar2 = (lfd) C10.b;
                lfdVar2.b &= -524289;
                lfdVar2.z = lfd.a.z;
                if (!C9.b.M()) {
                    C9.t();
                }
                lfe lfeVar3 = (lfe) C9.b;
                lfd lfdVar3 = (lfd) C10.q();
                lfdVar3.getClass();
                lfeVar3.b();
                lfeVar3.b.set(i4, lfdVar3);
            }
            for (int i5 = 0; i5 < ((lfe) C9.b).c.size(); i5++) {
                jkj C11 = ((lfg) ((lfe) C9.b).c.get(i5)).C();
                if (!((lfg) C11.b).c.isEmpty()) {
                    if (!C11.b.M()) {
                        C11.t();
                    }
                    ((lfg) C11.b).d = jlh.a;
                    List a4 = esp.a(((lfg) C11.b).c);
                    if (!C11.b.M()) {
                        C11.t();
                    }
                    lfg lfgVar = (lfg) C11.b;
                    jkw jkwVar3 = lfgVar.d;
                    if (!jkwVar3.c()) {
                        lfgVar.d = jkp.z(jkwVar3);
                    }
                    jiz.f(a4, lfgVar.d);
                }
                if (!C11.b.M()) {
                    C11.t();
                }
                lfg lfgVar2 = (lfg) C11.b;
                lfgVar2.b &= -2;
                lfgVar2.c = lfg.a.c;
                if (!C9.b.M()) {
                    C9.t();
                }
                lfe lfeVar4 = (lfe) C9.b;
                lfg lfgVar3 = (lfg) C11.q();
                lfgVar3.getClass();
                jkx jkxVar3 = lfeVar4.c;
                if (!jkxVar3.c()) {
                    lfeVar4.c = jkp.A(jkxVar3);
                }
                lfeVar4.c.set(i5, lfgVar3);
            }
            if (!C.b.M()) {
                C.t();
            }
            lgv lgvVar6 = (lgv) C.b;
            lfe lfeVar5 = (lfe) C9.q();
            lfeVar5.getClass();
            lgvVar6.h = lfeVar5;
            lgvVar6.b |= 32;
        }
        lfh lfhVar = ((lgv) C.b).m;
        if (lfhVar == null) {
            lfhVar = lfh.a;
        }
        if (lfhVar.e.size() != 0) {
            lfh lfhVar2 = ((lgv) C.b).m;
            if (lfhVar2 == null) {
                lfhVar2 = lfh.a;
            }
            jkj C12 = lfhVar2.C();
            for (int i6 = 0; i6 < ((lfh) C12.b).e.size(); i6++) {
                jkl jklVar = (jkl) ((lfi) ((lfh) C12.b).e.get(i6)).C();
                esp.b(esp.c, jklVar);
                if (!C12.b.M()) {
                    C12.t();
                }
                lfh lfhVar3 = (lfh) C12.b;
                lfi lfiVar = (lfi) jklVar.q();
                lfiVar.getClass();
                jkx jkxVar4 = lfhVar3.e;
                if (!jkxVar4.c()) {
                    lfhVar3.e = jkp.A(jkxVar4);
                }
                lfhVar3.e.set(i6, lfiVar);
            }
            if (!C.b.M()) {
                C.t();
            }
            lgv lgvVar7 = (lgv) C.b;
            lfh lfhVar4 = (lfh) C12.q();
            lfhVar4.getClass();
            lgvVar7.m = lfhVar4;
            lgvVar7.b |= 1024;
        }
        final lgv lgvVar8 = (lgv) C.q();
        hkh hkhVar = eiu.a;
        if (((hkf) hkhVar.d()).z()) {
            int i7 = lgvVar8.b;
            String str2 = (8388608 & i7) != 0 ? "primes stats" : null;
            int i8 = i7 & 32;
            int i9 = i7 & 16;
            int i10 = i7 & 8;
            int i11 = i7 & 256;
            int i12 = i7 & 64;
            int i13 = i7 & 512;
            z = true;
            int i14 = i7 & 128;
            int i15 = i7 & 1024;
            int i16 = i7 & 524288;
            if (i8 != 0) {
                str2 = "network metric";
            }
            if (i9 != 0) {
                str2 = "timer metric";
            }
            if (i10 != 0) {
                str2 = "memory metric";
            }
            if (i11 != 0) {
                str2 = "battery metric";
            }
            if (i12 != 0) {
                str2 = "crash metric";
            }
            if (i13 != 0) {
                str2 = "jank metric";
            }
            if (i14 != 0) {
                str2 = "package metric";
            }
            if (i15 != 0) {
                str2 = "trace";
            }
            if (i16 != 0) {
                str2 = "cui metric";
            }
            hkf hkfVar = (hkf) ((hkf) hkhVar.d()).i("com/google/android/libraries/performance/primes/transmitter/clearcut/ClearcutMetricSnapshotTransmitter", "logSystemHealthMetric", 295, "ClearcutMetricSnapshotTransmitter.java");
            if (str2 == null) {
                str2 = "unknown";
            }
            hkfVar.w("Sending Primes %s: %s", str2, lgvVar8);
        } else {
            z = true;
        }
        if (((Boolean) this.f.bB()).booleanValue()) {
            return hve.a;
        }
        iwq iwqVar2 = esj.j;
        esdVar.g(iwqVar2);
        Object j = esdVar.l.j((jko) iwqVar2.c);
        if (j == null) {
            j = iwqVar2.b;
        } else {
            iwqVar2.c(j);
        }
        final esj esjVar = (esj) j;
        if (((hkf) hkhVar.d()).z()) {
            ((hkf) ((hkf) hkhVar.d()).i("com/google/android/libraries/performance/primes/transmitter/clearcut/ClearcutMetricSnapshotTransmitter", "transmit", 125, "ClearcutMetricSnapshotTransmitter.java")).u("%s", Base64.encodeToString(lgvVar8.f(), 2));
        }
        boolean z2 = esjVar.h;
        boolean z3 = (lgvVar8.b & 64) != 0 ? z : false;
        esi esiVar = this.d;
        if (esiVar == null) {
            synchronized (this) {
                esiVar = this.d;
                if (esiVar == null) {
                    esiVar = new esi();
                    this.d = esiVar;
                }
            }
        }
        return hti.g(esiVar.a(context, z2, !z3), new htr() { // from class: esm
            @Override // defpackage.htr
            public final hvi a(Object obj) {
                cji cjiVar;
                if (!((Boolean) obj).booleanValue()) {
                    return hve.a;
                }
                esj esjVar2 = esjVar;
                Context context2 = context;
                ClearcutMetricSnapshotTransmitter clearcutMetricSnapshotTransmitter = ClearcutMetricSnapshotTransmitter.this;
                String str3 = esjVar2.c;
                if (esjVar2.d) {
                    cjiVar = clearcutMetricSnapshotTransmitter.c;
                    if (cjiVar == null) {
                        synchronized (clearcutMetricSnapshotTransmitter) {
                            cjiVar = clearcutMetricSnapshotTransmitter.c;
                            if (cjiVar == null) {
                                cji f = cji.f(context2, str3);
                                clearcutMetricSnapshotTransmitter.c = f;
                                cjiVar = f;
                            }
                        }
                    }
                } else {
                    cjiVar = clearcutMetricSnapshotTransmitter.b;
                    if (cjiVar == null) {
                        synchronized (clearcutMetricSnapshotTransmitter) {
                            cjiVar = clearcutMetricSnapshotTransmitter.b;
                            if (cjiVar == null) {
                                List list = cji.n;
                                cji a5 = new cjd(context2, str3).a();
                                clearcutMetricSnapshotTransmitter.b = a5;
                                cjiVar = a5;
                            }
                        }
                    }
                }
                Integer num = valueOf;
                cjf g = cjiVar.g(lgvVar8);
                if (num != null) {
                    g.g(num.intValue());
                }
                if (jur.a.bB().a(context2)) {
                    g.d(djg.a(context2, (div) ClearcutMetricSnapshotTransmitter.a.bB()));
                }
                if (!esjVar2.d) {
                    String str4 = esjVar2.e;
                    if (!hoq.S(str4)) {
                        if (g.a.c()) {
                            throw new IllegalStateException("setZwiebackCookieOverride forbidden on deidentified logger");
                        }
                        jkl jklVar2 = g.n;
                        if (!jklVar2.b.M()) {
                            jklVar2.t();
                        }
                        jol jolVar = (jol) jklVar2.b;
                        jol jolVar2 = jol.a;
                        str4.getClass();
                        jolVar.b |= 16777216;
                        jolVar.i = str4;
                    }
                    Iterator it2 = esjVar2.i.iterator();
                    while (it2.hasNext()) {
                        g.c((String) it2.next());
                    }
                    if ((esjVar2.b & 8) != 0) {
                        g.e(esjVar2.f);
                    }
                    jkt jktVar = esjVar2.g;
                    if (!jktVar.isEmpty()) {
                        Object[] array = jktVar.toArray();
                        int length = array.length;
                        int[] iArr = new int[length];
                        for (int i17 = 0; i17 < length; i17++) {
                            Object obj2 = array[i17];
                            obj2.getClass();
                            iArr[i17] = ((Number) obj2).intValue();
                        }
                        if (g.a.c()) {
                            throw new IllegalArgumentException("addExperimentIds forbidden on deidentified logger");
                        }
                        if (length != 0) {
                            if (g.d == null) {
                                g.d = new ArrayList();
                            }
                            for (int i18 = 0; i18 < length; i18++) {
                                g.d.add(Integer.valueOf(iArr[i18]));
                            }
                        }
                    }
                }
                return dih.d(g.b());
            }
        }, huf.a);
    }
}
