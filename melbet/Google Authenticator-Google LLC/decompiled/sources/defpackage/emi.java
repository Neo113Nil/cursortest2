package defpackage;

import android.content.Context;
import android.text.TextUtils;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class emi {
    public final emg a;
    public final koe b;
    public final ert c;
    public final koe d;
    public final jpt e;
    private final eiw f;
    private final Executor g;

    /* JADX WARN: Type inference failed for: r9v12, types: [java.lang.Object, koe] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, koe] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, koe] */
    public emi(emg emgVar, koe koeVar, eiw eiwVar, ldt ldtVar, koe koeVar2, Executor executor, jpt jptVar, koe koeVar3) {
        this.a = emgVar;
        this.f = eiwVar;
        this.b = koeVar;
        this.g = executor;
        this.d = new eqn(koeVar2, 1);
        Context b = ((jrk) ldtVar.e).b();
        Executor executor2 = (Executor) ldtVar.d.b();
        executor2.getClass();
        erx erxVar = (erx) ldtVar.c.b();
        erxVar.getClass();
        Boolean bool = true;
        bool.getClass();
        gzp gzpVar = (gzp) ((jrx) ldtVar.a).a;
        gzpVar.getClass();
        this.c = new ert(b, executor2, erxVar, jptVar, gzpVar, koeVar3, (ggw) ldtVar.b.b());
        this.e = jptVar;
    }

    public final eru a(String str) {
        if (this.f.a) {
            return eru.b;
        }
        ert ertVar = this.c;
        if (ertVar.c.b()) {
            return eru.b;
        }
        return ertVar.b ? ertVar.a.a(str) : eru.b;
    }

    public final hvi b(final emf emfVar) {
        return this.f.a ? hnu.aH() : hnu.aN(new htq() { // from class: emh
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:335:0x0980  */
            /* JADX WARN: Removed duplicated region for block: B:337:0x0982  */
            /* JADX WARN: Type inference failed for: r0v9, types: [hac, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r10v10, types: [hac, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r13v43, types: [java.lang.Object, koe] */
            /* JADX WARN: Type inference failed for: r13v47, types: [java.lang.Object, koe] */
            /* JADX WARN: Type inference failed for: r8v14, types: [hac, java.lang.Object] */
            @Override // defpackage.htq
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final hvi a() {
                lgc a;
                String str;
                int i;
                RuntimeException runtimeException;
                int i2;
                boolean z;
                int i3;
                RuntimeException runtimeException2;
                lgk lgkVar;
                hvi f;
                lgv lgvVar;
                int i4;
                int i5;
                int i6;
                long j;
                ArrayList arrayList;
                int i7;
                int i8;
                boolean z2;
                int i9;
                ekd ekdVar;
                int i10;
                ejz[] ejzVarArr;
                emf emfVar2 = emfVar;
                boolean z3 = emfVar2.g;
                emi emiVar = emi.this;
                if (z3) {
                    jkj k = lgc.a.k();
                    if (!k.b.M()) {
                        k.t();
                    }
                    lgc lgcVar = (lgc) k.b;
                    lgcVar.e = 2;
                    lgcVar.b |= 2;
                    a = (lgc) k.q();
                } else {
                    a = emiVar.c.a(emfVar2.f);
                }
                int i11 = emfVar2.n;
                if (i11 != 0) {
                    jkj C = a.C();
                    if (!C.b.M()) {
                        C.t();
                    }
                    lgc lgcVar2 = (lgc) C.b;
                    lgcVar2.e = i11 - 1;
                    lgcVar2.b |= 2;
                    a = (lgc) C.q();
                }
                eru eruVar = eru.a;
                if (a.c != 2 || ((Integer) a.d).intValue() != -1) {
                    int i12 = 4;
                    if ((a.c == 4 ? (lga) a.d : lga.a).c != -1) {
                        eml emlVar = (eml) emiVar.b.b();
                        lgv lgvVar2 = emfVar2.c;
                        jkj C2 = lgvVar2.C();
                        jkj k2 = lgf.a.k();
                        int i13 = emlVar.k;
                        if (!k2.b.M()) {
                            k2.t();
                        }
                        jkp jkpVar = k2.b;
                        lgf lgfVar = (lgf) jkpVar;
                        lgfVar.e = i13 - 1;
                        lgfVar.b |= 4;
                        String str2 = emlVar.b;
                        boolean z4 = true;
                        if (str2 != null) {
                            if (!jkpVar.M()) {
                                k2.t();
                            }
                            lgf lgfVar2 = (lgf) k2.b;
                            lgfVar2.b |= 1;
                            lgfVar2.c = str2;
                        }
                        if (!k2.b.M()) {
                            k2.t();
                        }
                        jkp jkpVar2 = k2.b;
                        lgf lgfVar3 = (lgf) jkpVar2;
                        lgfVar3.b |= 8;
                        lgfVar3.f = 951541897L;
                        String str3 = emlVar.d;
                        if (str3 != null) {
                            if (!jkpVar2.M()) {
                                k2.t();
                            }
                            lgf lgfVar4 = (lgf) k2.b;
                            lgfVar4.b |= 2;
                            lgfVar4.d = str3;
                        }
                        lfb lfbVar = lgvVar2.f;
                        if (lfbVar == null) {
                            lfbVar = lfb.a;
                        }
                        lfz lfzVar = lfbVar.d;
                        if (lfzVar == null) {
                            lfzVar = lfz.a;
                        }
                        lfy lfyVar = lfzVar.c;
                        if (lfyVar == null) {
                            lfyVar = lfy.a;
                        }
                        if ((lfyVar.b & 8) == 0 || !((Boolean) emlVar.f.b()).booleanValue()) {
                            str = emlVar.c;
                        } else {
                            lfb lfbVar2 = lgvVar2.f;
                            if (lfbVar2 == null) {
                                lfbVar2 = lfb.a;
                            }
                            lfz lfzVar2 = lfbVar2.d;
                            if (lfzVar2 == null) {
                                lfzVar2 = lfz.a;
                            }
                            lfy lfyVar2 = lfzVar2.c;
                            if (lfyVar2 == null) {
                                lfyVar2 = lfy.a;
                            }
                            str = elh.c(str2, lfyVar2.f);
                        }
                        int i14 = 16;
                        if (str != null) {
                            if (!k2.b.M()) {
                                k2.t();
                            }
                            lgf lgfVar5 = (lgf) k2.b;
                            lgfVar5.b |= 16;
                            lgfVar5.g = str;
                        }
                        iyi iyiVar = emlVar.m;
                        int i15 = lgvVar2.b;
                        if ((i15 & 64) != 0 || (((i15 & 65536) != 0 && ((Boolean) iyiVar.a.b()).booleanValue()) || ((Boolean) iyiVar.c.b()).booleanValue())) {
                            gzp gzpVar = (gzp) ((bry) iyiVar.b).a.bB();
                            if (gzpVar.f()) {
                                String str4 = (String) gzpVar.b();
                                if (str4.equals("com.android.vending")) {
                                    if (!k2.b.M()) {
                                        k2.t();
                                    }
                                    lgf lgfVar6 = (lgf) k2.b;
                                    lgfVar6.b |= 64;
                                    lgfVar6.h = true;
                                } else {
                                    if (!k2.b.M()) {
                                        k2.t();
                                    }
                                    lgf lgfVar7 = (lgf) k2.b;
                                    lgfVar7.b |= 128;
                                    lgfVar7.i = str4;
                                }
                            }
                        }
                        if (!C2.b.M()) {
                            C2.t();
                        }
                        lgv lgvVar3 = (lgv) C2.b;
                        lgf lgfVar8 = (lgf) k2.q();
                        lgfVar8.getClass();
                        lgvVar3.y = lgfVar8;
                        lgvVar3.b |= 4194304;
                        if (djl.i(emlVar.a)) {
                            jkj k3 = lgm.a.k();
                            long freeSpace = emlVar.l.a().getFreeSpace() / 1024;
                            if (!k3.b.M()) {
                                k3.t();
                            }
                            lgm lgmVar = (lgm) k3.b;
                            lgmVar.b |= 1;
                            lgmVar.c = freeSpace;
                            long longValue = ((Long) emlVar.e.bB()).longValue();
                            if (!k3.b.M()) {
                                k3.t();
                            }
                            lgm lgmVar2 = (lgm) k3.b;
                            lgmVar2.b |= 2;
                            lgmVar2.d = longValue;
                            if (!C2.b.M()) {
                                C2.t();
                            }
                            lgv lgvVar4 = (lgv) C2.b;
                            lgm lgmVar3 = (lgm) k3.q();
                            lgmVar3.getClass();
                            lgvVar4.A = lgmVar3;
                            lgvVar4.b |= 16777216;
                        }
                        RuntimeException runtimeException3 = null;
                        int i16 = 67108864;
                        if (!TextUtils.isEmpty(null)) {
                            lge lgeVar = lgvVar2.C;
                            if (lgeVar == null) {
                                lgeVar = lge.a;
                            }
                            jkj C3 = lgeVar.C();
                            if (((lge) C3.b).c.isEmpty()) {
                                if (!C3.b.M()) {
                                    C3.t();
                                }
                                throw null;
                            }
                            String str5 = ((String) null) + "::" + ((lge) C3.b).c;
                            if (!C3.b.M()) {
                                C3.t();
                            }
                            lge lgeVar2 = (lge) C3.b;
                            lgeVar2.b |= 1;
                            lgeVar2.c = str5;
                            if (!C2.b.M()) {
                                C2.t();
                            }
                            lgv lgvVar5 = (lgv) C2.b;
                            lge lgeVar3 = (lge) C3.q();
                            lgeVar3.getClass();
                            lgvVar5.C = lgeVar3;
                            lgvVar5.b |= 67108864;
                        }
                        ekd ekdVar2 = emfVar2.l;
                        int i17 = 0;
                        if (ekdVar2 != null) {
                            gzp gzpVar2 = emlVar.g;
                            int i18 = emfVar2.m;
                            ArrayList arrayList2 = new ArrayList();
                            int i19 = 0;
                            while (true) {
                                ekg[] ekgVarArr = ekdVar2.b;
                                runtimeException = runtimeException3;
                                if (i19 >= ekgVarArr.length) {
                                    break;
                                }
                                ekg ekgVar = ekgVarArr[i19];
                                int i20 = ekdVar2.c[i19];
                                if (i18 <= 0) {
                                    ejzVarArr = new ejz[i17];
                                    i8 = i12;
                                    ekdVar = ekdVar2;
                                    i9 = i14;
                                    z2 = z4;
                                    i7 = i16;
                                } else {
                                    i7 = i16;
                                    int max = Math.max(i20 - Math.min(i18, 19), i17);
                                    i8 = i12;
                                    int i21 = i20 - max;
                                    if (i21 <= 0) {
                                        ejzVarArr = new ejz[i17];
                                        ekdVar = ekdVar2;
                                        i9 = i14;
                                        z2 = z4;
                                    } else {
                                        z2 = z4;
                                        ejz[] ejzVarArr2 = new ejz[i21];
                                        i9 = i14;
                                        int i22 = i17;
                                        while (i22 < i21) {
                                            ejzVarArr2[i22] = (ejz) ekgVar.a.get((i22 + max) % 20);
                                            i22++;
                                            ekdVar2 = ekdVar2;
                                        }
                                        ekdVar = ekdVar2;
                                        int i23 = ekgVar.c;
                                        if (i23 >= i20) {
                                            i10 = i23 - i20;
                                        } else {
                                            int i24 = ekgVar.d;
                                            i10 = (i23 - 27) + (Integer.MAX_VALUE - i20);
                                        }
                                        int i25 = (i10 - (20 - i21)) + 1;
                                        if (i25 >= i21) {
                                            ejzVarArr = new ejz[0];
                                        } else if (i25 > 0) {
                                            int i26 = i21 - i25;
                                            ejz[] ejzVarArr3 = new ejz[i26];
                                            System.arraycopy(ejzVarArr2, i25, ejzVarArr3, 0, i26);
                                            ejzVarArr = ejzVarArr3;
                                        } else {
                                            ejzVarArr = ejzVarArr2;
                                        }
                                    }
                                }
                                for (ejz ejzVar : ejzVarArr) {
                                    arrayList2.add(new bsh(ejzVar, i19));
                                }
                                i19++;
                                runtimeException3 = runtimeException;
                                i16 = i7;
                                i12 = i8;
                                z4 = z2;
                                i14 = i9;
                                ekdVar2 = ekdVar;
                                i17 = 0;
                            }
                            i = i12;
                            i2 = i14;
                            z = z4;
                            i3 = i16;
                            Collections.sort(arrayList2, new alu(6));
                            jkj k4 = lgl.a.k();
                            ArrayList arrayList3 = new ArrayList();
                            int max2 = Math.max(arrayList2.size() - i18, 0);
                            long j2 = 0;
                            while (max2 < arrayList2.size()) {
                                bsh bshVar = (bsh) arrayList2.get(max2);
                                ejz ejzVar2 = (ejz) bshVar.b;
                                ejy ejyVar = ejzVar2.g;
                                if (ejyVar != null) {
                                    jkj k5 = lgp.a.k();
                                    int intValue = ejyVar.a.intValue();
                                    if (!k5.b.M()) {
                                        k5.t();
                                    }
                                    lgp lgpVar = (lgp) k5.b;
                                    i6 = max2;
                                    lgpVar.b |= 1;
                                    lgpVar.c = intValue;
                                    long j3 = ejzVar2.a;
                                    j = j2;
                                    jmh c = jmx.c(j3 / 1000000000, (int) (j3 % 1000000000));
                                    if (!k5.b.M()) {
                                        k5.t();
                                    }
                                    jkp jkpVar3 = k5.b;
                                    lgp lgpVar2 = (lgp) jkpVar3;
                                    c.getClass();
                                    lgpVar2.d = c;
                                    lgpVar2.b |= 2;
                                    int i27 = ejzVar2.d;
                                    if (!jkpVar3.M()) {
                                        k5.t();
                                    }
                                    jkp jkpVar4 = k5.b;
                                    lgp lgpVar3 = (lgp) jkpVar4;
                                    lgpVar3.b |= 16;
                                    lgpVar3.g = i27;
                                    long j4 = ejyVar.d;
                                    if (!jkpVar4.M()) {
                                        k5.t();
                                    }
                                    jkp jkpVar5 = k5.b;
                                    lgp lgpVar4 = (lgp) jkpVar5;
                                    lgpVar4.b |= 32;
                                    lgpVar4.h = j4;
                                    String str6 = ejyVar.b;
                                    if (!jkpVar5.M()) {
                                        k5.t();
                                    }
                                    jkp jkpVar6 = k5.b;
                                    lgp lgpVar5 = (lgp) jkpVar6;
                                    lgpVar5.b |= 4;
                                    lgpVar5.e = str6;
                                    String str7 = ejyVar.c;
                                    if (!jkpVar6.M()) {
                                        k5.t();
                                    }
                                    lgp lgpVar6 = (lgp) k5.b;
                                    lgpVar6.b |= 8;
                                    lgpVar6.f = str7;
                                    arrayList3.add((lgp) k5.q());
                                } else {
                                    i6 = max2;
                                    j = j2;
                                    int i28 = bshVar.a;
                                    Long av = hnu.av(ejzVar2.b + "." + ejzVar2.c + ":" + ejzVar2.d);
                                    if (av != null) {
                                        long longValue2 = av.longValue();
                                        if (!k4.b.M()) {
                                            k4.t();
                                        }
                                        lgl lglVar = (lgl) k4.b;
                                        jkw jkwVar = lglVar.b;
                                        if (!jkwVar.c()) {
                                            lglVar.b = jkp.z(jkwVar);
                                        }
                                        lglVar.b.e(longValue2);
                                        int size = ((lgl) k4.b).b.size() - 1;
                                        j2 = ejzVar2.a / 1000000;
                                        long j5 = j2 - j;
                                        if (!k4.b.M()) {
                                            k4.t();
                                        }
                                        lgl lglVar2 = (lgl) k4.b;
                                        arrayList = arrayList3;
                                        jkw jkwVar2 = lglVar2.c;
                                        if (!jkwVar2.c()) {
                                            lglVar2.c = jkp.z(jkwVar2);
                                        }
                                        lglVar2.c.e(j5);
                                        if (!k4.b.M()) {
                                            k4.t();
                                        }
                                        lgl lglVar3 = (lgl) k4.b;
                                        jkt jktVar = lglVar3.d;
                                        if (!jktVar.c()) {
                                            lglVar3.d = jkp.y(jktVar);
                                        }
                                        lglVar3.d.g(i28);
                                        int i29 = 0;
                                        while (true) {
                                            int[] iArr = ejzVar2.e;
                                            if (i29 < iArr.length) {
                                                int i30 = iArr[i29];
                                                if (!k4.b.M()) {
                                                    k4.t();
                                                }
                                                lgl lglVar4 = (lgl) k4.b;
                                                jkt jktVar2 = lglVar4.e;
                                                if (!jktVar2.c()) {
                                                    lglVar4.e = jkp.y(jktVar2);
                                                }
                                                lglVar4.e.g(size);
                                                if (!k4.b.M()) {
                                                    k4.t();
                                                }
                                                lgl lglVar5 = (lgl) k4.b;
                                                jkt jktVar3 = lglVar5.f;
                                                if (!jktVar3.c()) {
                                                    lglVar5.f = jkp.y(jktVar3);
                                                }
                                                lglVar5.f.g(i30);
                                                String str8 = ejzVar2.f[i29];
                                                if (!k4.b.M()) {
                                                    k4.t();
                                                }
                                                lgl lglVar6 = (lgl) k4.b;
                                                str8.getClass();
                                                jkx jkxVar = lglVar6.g;
                                                if (!jkxVar.c()) {
                                                    lglVar6.g = jkp.A(jkxVar);
                                                }
                                                lglVar6.g.add(str8);
                                                i29++;
                                            }
                                        }
                                        max2 = i6 + 1;
                                        arrayList3 = arrayList;
                                    }
                                }
                                arrayList = arrayList3;
                                j2 = j;
                                max2 = i6 + 1;
                                arrayList3 = arrayList;
                            }
                            ekc ekcVar = new ekc((lgl) k4.q(), hel.o(arrayList3));
                            lgl lglVar7 = ekcVar.a;
                            if (!C2.b.M()) {
                                C2.t();
                            }
                            jkp jkpVar7 = C2.b;
                            lgv lgvVar6 = (lgv) jkpVar7;
                            lgvVar6.v = lglVar7;
                            lgvVar6.b |= 2097152;
                            hel helVar = ekcVar.b;
                            if (!jkpVar7.M()) {
                                C2.t();
                            }
                            lgv lgvVar7 = (lgv) C2.b;
                            jkx jkxVar2 = lgvVar7.w;
                            if (!jkxVar2.c()) {
                                lgvVar7.w = jkp.A(jkxVar2);
                            }
                            jiz.f(helVar, lgvVar7.w);
                        } else {
                            i = 4;
                            runtimeException = null;
                            i2 = 16;
                            z = true;
                            i3 = 67108864;
                        }
                        gzp gzpVar3 = emlVar.h;
                        if (emfVar2.i && (i5 = emfVar2.j) > 0) {
                            if (((Boolean) emlVar.j.b()).booleanValue()) {
                                Stream map = Collection.EL.stream(((gvn) ((brn) ((gzs) gzpVar3).a).a).a()).filter(emfVar2.k).map(new ejs(11));
                                int i31 = hel.d;
                                hel helVar2 = (hel) map.collect(hby.a);
                                if (!helVar2.isEmpty()) {
                                    C2.ai(hnu.G(eml.a(helVar2, i5), new drv(i2)));
                                }
                            } else {
                                Stream map2 = Collection.EL.stream(((gvn) ((brn) ((gzs) gzpVar3).a).a).a()).filter(emfVar2.k).map(new ejs(10));
                                int i32 = hel.d;
                                hel helVar3 = (hel) map2.collect(hby.a);
                                if (!helVar3.isEmpty()) {
                                    C2.ai(hnu.G(eml.a(helVar3, i5), new drv(17)));
                                }
                            }
                        }
                        if (emfVar2.h != null) {
                            throw runtimeException;
                        }
                        gzp gzpVar4 = emlVar.i;
                        if (gzpVar4.f()) {
                            hel a2 = ((emd) gzpVar4.b()).a();
                            if (!C2.b.M()) {
                                C2.t();
                            }
                            lgv lgvVar8 = (lgv) C2.b;
                            jkx jkxVar3 = lgvVar8.x;
                            if (!jkxVar3.c()) {
                                lgvVar8.x = jkp.A(jkxVar3);
                            }
                            jiz.f(a2, lgvVar8.x);
                        }
                        jkj C4 = ((lgv) C2.q()).C();
                        if (!C4.b.M()) {
                            C4.t();
                        }
                        jkp jkpVar8 = C4.b;
                        lgv lgvVar9 = (lgv) jkpVar8;
                        a.getClass();
                        lgvVar9.q = a;
                        lgvVar9.b |= 1048576;
                        String str9 = emfVar2.a;
                        if (emfVar2.b) {
                            if (str9 != null) {
                                if (!jkpVar8.M()) {
                                    C4.t();
                                }
                                lgv lgvVar10 = (lgv) C4.b;
                                lgvVar10.b |= 4;
                                lgvVar10.e = str9;
                            } else {
                                if (!jkpVar8.M()) {
                                    C4.t();
                                }
                                lgv lgvVar11 = (lgv) C4.b;
                                lgvVar11.b &= -5;
                                lgvVar11.e = lgv.a.e;
                            }
                        } else if (str9 != null) {
                            if (!jkpVar8.M()) {
                                C4.t();
                            }
                            lgv lgvVar12 = (lgv) C4.b;
                            lgvVar12.b |= 2;
                            lgvVar12.d = str9;
                        } else {
                            if (!jkpVar8.M()) {
                                C4.t();
                            }
                            lgv lgvVar13 = (lgv) C4.b;
                            lgvVar13.b &= -3;
                            lgvVar13.d = lgv.a.d;
                        }
                        emiVar.d.b();
                        lew lewVar = lew.a;
                        jkl jklVar = (jkl) lewVar.k();
                        lew lewVar2 = emfVar2.d;
                        ((elj) emiVar.e.b()).c();
                        if (lewVar2 != null) {
                            jklVar.w(lewVar2);
                        }
                        lew lewVar3 = (lew) jklVar.q();
                        boolean equals = lewVar3.equals(lewVar);
                        lew lewVar4 = lewVar3;
                        if (z == equals) {
                            lewVar4 = runtimeException;
                        }
                        if (lewVar4 != 0) {
                            if (!C4.b.M()) {
                                C4.t();
                            }
                            lgv lgvVar14 = (lgv) C4.b;
                            lgvVar14.B = lewVar4;
                            lgvVar14.b |= 33554432;
                        }
                        String str10 = emfVar2.e;
                        if (str10 != null) {
                            jkj k6 = lge.a.k();
                            if (!k6.b.M()) {
                                k6.t();
                            }
                            lge lgeVar4 = (lge) k6.b;
                            lgeVar4.b |= 1;
                            lgeVar4.c = str10;
                            if (!C4.b.M()) {
                                C4.t();
                            }
                            lgv lgvVar15 = (lgv) C4.b;
                            lge lgeVar5 = (lge) k6.q();
                            lgeVar5.getClass();
                            lgvVar15.C = lgeVar5;
                            lgvVar15.b |= i3;
                        }
                        emg emgVar = emiVar.a;
                        lgv lgvVar16 = (lgv) C4.q();
                        hel helVar4 = (hel) emgVar.a.bB();
                        heg d = hel.d(helVar4.size());
                        int size2 = helVar4.size();
                        RuntimeException runtimeException4 = runtimeException;
                        int i33 = 0;
                        while (i33 < size2) {
                            gka gkaVar = (gka) helVar4.get(i33);
                            try {
                            } catch (RuntimeException e) {
                                e = e;
                            }
                            if (gkaVar.a) {
                                try {
                                    lgkVar = lgvVar16.i;
                                    if (lgkVar == null) {
                                        lgkVar = lgk.a;
                                    }
                                } catch (RuntimeException e2) {
                                    runtimeException2 = e2;
                                    ((hkf) ((hkf) ((hkf) eiu.a.g()).h(runtimeException2)).i("com/google/android/libraries/performance/primes/metrics/core/MetricDispatcher", "dispatch", '<', "MetricDispatcher.java")).s("One transmitter failed to send message");
                                    RuntimeException runtimeException5 = runtimeException2;
                                    if (runtimeException4 != null) {
                                    }
                                    i33++;
                                    i = 4;
                                }
                                if ((lgkVar.b & 1) != 0) {
                                    f = hti.f(((esk) gkaVar.e).a(), new bso(gkaVar, lgvVar16, i), huf.a);
                                    d.h(f);
                                    i33++;
                                    i = 4;
                                }
                            }
                            if ((lgvVar16.b & 512) == 0 || !((Boolean) gkaVar.d.bB()).booleanValue()) {
                                lgvVar = lgvVar16;
                            } else {
                                jkj C5 = lgvVar16.C();
                                lgo lgoVar = lgvVar16.l;
                                if (lgoVar == null) {
                                    lgoVar = lgo.a;
                                }
                                jkx<lgn> jkxVar4 = lgoVar.k;
                                if (!jkxVar4.isEmpty()) {
                                    jkj k7 = lgs.a.k();
                                    lgn lgnVar = runtimeException;
                                    for (lgn lgnVar2 : jkxVar4) {
                                        if (lgnVar != 0 && (i4 = lgnVar.e + 1) != lgnVar2.d) {
                                            k7.ah(0);
                                            k7.ag(i4);
                                        }
                                        k7.ah(lgnVar2.c);
                                        k7.ag(lgnVar2.d);
                                        lgnVar = lgnVar2;
                                    }
                                    if (lgnVar != 0 && (lgnVar.b & 4) != 0) {
                                        int i34 = lgnVar.e + 1;
                                        try {
                                            k7.ah(0);
                                            k7.ag(i34);
                                        } catch (RuntimeException e3) {
                                            e = e3;
                                            runtimeException2 = e;
                                            ((hkf) ((hkf) ((hkf) eiu.a.g()).h(runtimeException2)).i("com/google/android/libraries/performance/primes/metrics/core/MetricDispatcher", "dispatch", '<', "MetricDispatcher.java")).s("One transmitter failed to send message");
                                            RuntimeException runtimeException52 = runtimeException2;
                                            if (runtimeException4 != null) {
                                                runtimeException4 = runtimeException52;
                                            } else {
                                                runtimeException4.addSuppressed(runtimeException52);
                                            }
                                            i33++;
                                            i = 4;
                                        }
                                    }
                                    jkl jklVar2 = (jkl) lgoVar.C();
                                    if (!jklVar2.b.M()) {
                                        jklVar2.t();
                                    }
                                    ((lgo) jklVar2.b).k = jlu.a;
                                    if (!jklVar2.b.M()) {
                                        jklVar2.t();
                                    }
                                    lgo lgoVar2 = (lgo) jklVar2.b;
                                    lgs lgsVar = (lgs) k7.q();
                                    lgsVar.getClass();
                                    lgoVar2.j = lgsVar;
                                    lgoVar2.b |= 128;
                                    lgoVar = (lgo) jklVar2.q();
                                }
                                if (!C5.b.M()) {
                                    C5.t();
                                }
                                lgv lgvVar17 = (lgv) C5.b;
                                lgoVar.getClass();
                                lgvVar17.l = lgoVar;
                                lgvVar17.b |= 512;
                                lgvVar = (lgv) C5.q();
                            }
                            f = hti.g(((esk) gkaVar.e).a(), new egl(gkaVar, lgvVar, 3), huf.a);
                            d.h(f);
                            i33++;
                            i = 4;
                        }
                        if (runtimeException4 != null) {
                            throw runtimeException4;
                        }
                        hvi a3 = hnu.aX(d.g()).a(new bws(4), huf.a);
                        emiVar.c.c.a();
                        return a3;
                    }
                }
                return hve.a;
            }
        }, this.g);
    }

    public final boolean c(String str) {
        return !a(str).e();
    }
}
