package defpackage;

import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.util.Log;
import j$.time.Instant;
import j$.util.Optional;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ghn {
    public final int a;
    public final hvl b;
    public final Set c;
    public final koe d;
    public final koe e;
    public final etd f;
    public final String g;
    public final die h;
    public final krx i;
    public final koe j;
    public final Executor k;
    public final hac l;
    public final koe m;
    public final htq n;
    public final kri o;
    public final boolean p;
    public final gbc q;
    public final String r;
    public final koi s;
    public final fcu t;
    public final fym u;
    public final cfe v;
    public final cfe w;
    private final koi x;

    public ghn(int i, Optional optional, hvl hvlVar, dih dihVar, Set set, cfe cfeVar, koe koeVar, koe koeVar2, etd etdVar, cfe cfeVar2, fym fymVar, String str, die dieVar, krx krxVar, koe koeVar3, Executor executor, hac hacVar, fcu fcuVar, koe koeVar4, htq htqVar, kri kriVar) {
        optional.getClass();
        hvlVar.getClass();
        dihVar.getClass();
        set.getClass();
        koeVar.getClass();
        koeVar2.getClass();
        etdVar.getClass();
        cfeVar2.getClass();
        fymVar.getClass();
        str.getClass();
        this.a = i;
        this.b = hvlVar;
        this.c = set;
        this.w = cfeVar;
        this.d = koeVar;
        this.e = koeVar2;
        this.f = etdVar;
        this.v = cfeVar2;
        this.u = fymVar;
        this.g = str;
        this.h = dieVar;
        this.i = krxVar;
        this.j = koeVar3;
        this.k = executor;
        this.l = hacVar;
        this.t = fcuVar;
        this.m = koeVar4;
        this.n = htqVar;
        this.o = kriVar;
        this.p = ((Boolean) ksy.c(optional, true)).booleanValue();
        this.q = new gbc(new htq() { // from class: ghk
            /* JADX WARN: Type inference failed for: r1v6, types: [hvl, java.lang.Object] */
            @Override // defpackage.htq
            public final hvi a() {
                bsh f;
                Set keySet;
                hoq.ay();
                ghn ghnVar = ghn.this;
                try {
                    ghnVar.f.f.f();
                    int a = ghnVar.a().a(iac.TIKTOK, ghnVar.r);
                    if (a != 0) {
                        f = new bsh(null, a, null);
                    } else {
                        String str2 = ghnVar.a().c;
                        if (str2.length() == 0) {
                            ApplicationInfo applicationInfo = (ApplicationInfo) ghnVar.e.b();
                            if (applicationInfo == null) {
                                f = ghnVar.f(7);
                            } else if (ghnVar.w.e(ghnVar.g)) {
                                str2 = applicationInfo.deviceProtectedDataDir;
                                str2.getClass();
                            } else {
                                str2 = applicationInfo.dataDir;
                                str2.getClass();
                            }
                        }
                        String str3 = str2 + File.separator + ghnVar.a().b;
                        try {
                            iyi iyiVar = new iyi(ghnVar.a().a, ghnVar.g, (String) ghnVar.o.a());
                            try {
                                Object r = ((iyi) ghnVar.d.b()).r(new Uri.Builder().scheme("file").appendEncodedPath(File.separator + str3 + File.separator + iyiVar.v()).build(), new eua(ghnVar.a().f.b));
                                r.getClass();
                                eub eubVar = (eub) r;
                                jkj k = etm.a.k();
                                String f2 = eubVar.f();
                                if (!k.b.M()) {
                                    k.t();
                                }
                                etm etmVar = (etm) k.b;
                                f2.getClass();
                                etmVar.b |= 1;
                                etmVar.c = f2;
                                jkj k2 = etl.a.k();
                                if (!k2.b.M()) {
                                    k2.t();
                                }
                                etl etlVar = (etl) k2.b;
                                etlVar.c = 3;
                                etlVar.b |= 1;
                                if (!k.b.M()) {
                                    k.t();
                                }
                                etm etmVar2 = (etm) k.b;
                                etl etlVar2 = (etl) k2.q();
                                etlVar2.getClass();
                                etmVar2.d = etlVar2;
                                etmVar2.b |= 2;
                                ghnVar.e(k);
                                krx krxVar2 = ghnVar.i;
                                hfv hfvVar = eubVar.b().b;
                                hfvVar.getClass();
                                Map g = eubVar.g();
                                her b = ghnVar.b(hfvVar, (g == null || (keySet = g.keySet()) == null) ? null : ixc.s(keySet));
                                String e = eubVar.e();
                                e.getClass();
                                jjq d = eubVar.d();
                                long epochMilli = Instant.now().toEpochMilli();
                                jkp q = k.q();
                                q.getClass();
                                f = new bsh((ghh) krxVar2.a(b, new ghm(e, d, epochMilli, (etm) q)), 0, null);
                            } catch (FileNotFoundException unused) {
                                Log.w("MendelPackageState", "Shared storage file not found for ".concat(ghnVar.g));
                                f = new bsh(null, 8, null);
                            } catch (jld e2) {
                                Log.e("MendelPackageState", "Failed to parse snapshot from shared storage for ".concat(ghnVar.g), e2);
                                f = ghnVar.f(9);
                            }
                        } catch (dik e3) {
                            Log.e("MendelPackageState", "Failed to obtain account name for " + ghnVar.g + ". Falling back on default values.", e3);
                            f = ghnVar.f(12);
                        }
                    }
                } catch (Exception e4) {
                    Log.e("MendelPackageState", "Failed to read shared file for ".concat(ghnVar.g), e4);
                    f = ghnVar.f(10);
                }
                Object obj = f.b;
                if (obj != null) {
                    fym fymVar2 = ghnVar.u;
                    fymVar2.f.execute(gvx.h(new gfm(fymVar2, 4)));
                    return hnu.aJ(obj);
                }
                int i2 = f.a;
                gwu g2 = gwu.g(ghnVar.t.d());
                fvr fvrVar = new fvr(new gdg(ghnVar, 5, (boolean[]) null), 9);
                huf hufVar = huf.a;
                gwu i3 = g2.i(fvrVar, hufVar);
                return hnu.aW(i3).a(gvx.i(new ghl(i3, ghnVar, i2, 0)), hufVar);
            }
        }, new cob(dieVar, 7));
        String c = etb.c(str);
        c.getClass();
        this.r = c;
        this.s = new kop(new ggy(this, 4));
        this.x = new kop(new ggy(this, 5));
    }

    public final evx a() {
        Object a = this.x.a();
        a.getClass();
        return (evx) a;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0071 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final her b(hfv hfvVar, Set set) {
        int i;
        ggn bA;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object b = this.j.b();
        b.getClass();
        ggo ggoVar = (ggo) b;
        hjr it = hfvVar.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            ety etyVar = (ety) next;
            String c = etyVar.c();
            ggn a = ggoVar.a(c);
            if (a != null) {
                int i2 = a.g;
                int i3 = i2 - 1;
                int i4 = 3;
                if (i3 != 0) {
                    if (i3 == 1) {
                        int i5 = etyVar.c;
                        if (i5 != 1 && i5 != 0) {
                            int i6 = etyVar.c;
                            if (i6 == 0) {
                            }
                            Log.w("MendelPackageState", "Type mismatch for flag " + c + ". Expected " + ((Object) hnu.bE(i2)) + ", got " + (i6 == 0 ? i6 != 1 ? i6 != 2 ? i6 != 3 ? i6 != 4 ? i6 != 5 ? a.ai(i6, "UNKNOWN(", ")") : "WIRE_TYPE_BYTES" : "WIRE_TYPE_STRING" : "WIRE_TYPE_DOUBLE" : "WIRE_TYPE_VARINT" : "WIRE_TYPE_TRUE" : "WIRE_TYPE_FALSE") + ". Falling back to default.");
                        }
                        if (set == null) {
                        }
                        if (a.f) {
                        }
                        i = etyVar.c;
                        if (i != 0) {
                        }
                        linkedHashMap.put(c, bA);
                    } else if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 != 4) {
                                if (etyVar.c == 5) {
                                    boolean contains = set == null ? set.contains(c) : false;
                                    if (a.f || contains) {
                                        i = etyVar.c;
                                        if (i != 0) {
                                            bA = hnu.bA(false);
                                        } else if (i == 1) {
                                            bA = hnu.bA(true);
                                        } else if (i == 2) {
                                            hoq.H(i == 2);
                                            bA = hnu.bC(etyVar.d);
                                        } else if (i == 3) {
                                            hoq.H(i == 3);
                                            bA = hnu.bB(Double.longBitsToDouble(etyVar.d));
                                        } else if (i == 4) {
                                            hoq.H(i == 4);
                                            Object obj = etyVar.e;
                                            obj.getClass();
                                            String str = (String) obj;
                                            str.getClass();
                                            bA = hnu.bD(str);
                                        } else {
                                            if (i != 5) {
                                                throw new IllegalStateException(a.Y(i, "Invalid type "));
                                            }
                                            jll jllVar = a.e;
                                            bA = jllVar == null ? new ggn(new ggy(etyVar, i4), 5, null, false) : new ggn(new awb(a, etyVar, 14), 6, jllVar, false);
                                        }
                                        linkedHashMap.put(c, bA);
                                    }
                                } else {
                                    int i62 = etyVar.c;
                                    Log.w("MendelPackageState", "Type mismatch for flag " + c + ". Expected " + ((Object) hnu.bE(i2)) + ", got " + (i62 == 0 ? i62 != 1 ? i62 != 2 ? i62 != 3 ? i62 != 4 ? i62 != 5 ? a.ai(i62, "UNKNOWN(", ")") : "WIRE_TYPE_BYTES" : "WIRE_TYPE_STRING" : "WIRE_TYPE_DOUBLE" : "WIRE_TYPE_VARINT" : "WIRE_TYPE_TRUE" : "WIRE_TYPE_FALSE") + ". Falling back to default.");
                                }
                            } else if (etyVar.c == 5) {
                                if (set == null) {
                                }
                                if (a.f) {
                                }
                                i = etyVar.c;
                                if (i != 0) {
                                }
                                linkedHashMap.put(c, bA);
                            } else {
                                int i622 = etyVar.c;
                                if (i622 == 0) {
                                }
                                Log.w("MendelPackageState", "Type mismatch for flag " + c + ". Expected " + ((Object) hnu.bE(i2)) + ", got " + (i622 == 0 ? i622 != 1 ? i622 != 2 ? i622 != 3 ? i622 != 4 ? i622 != 5 ? a.ai(i622, "UNKNOWN(", ")") : "WIRE_TYPE_BYTES" : "WIRE_TYPE_STRING" : "WIRE_TYPE_DOUBLE" : "WIRE_TYPE_VARINT" : "WIRE_TYPE_TRUE" : "WIRE_TYPE_FALSE") + ". Falling back to default.");
                            }
                        } else if (etyVar.c == 4) {
                            if (set == null) {
                            }
                            if (a.f) {
                            }
                            i = etyVar.c;
                            if (i != 0) {
                            }
                            linkedHashMap.put(c, bA);
                        } else {
                            int i6222 = etyVar.c;
                            if (i6222 == 0) {
                            }
                            Log.w("MendelPackageState", "Type mismatch for flag " + c + ". Expected " + ((Object) hnu.bE(i2)) + ", got " + (i6222 == 0 ? i6222 != 1 ? i6222 != 2 ? i6222 != 3 ? i6222 != 4 ? i6222 != 5 ? a.ai(i6222, "UNKNOWN(", ")") : "WIRE_TYPE_BYTES" : "WIRE_TYPE_STRING" : "WIRE_TYPE_DOUBLE" : "WIRE_TYPE_VARINT" : "WIRE_TYPE_TRUE" : "WIRE_TYPE_FALSE") + ". Falling back to default.");
                        }
                    } else if (etyVar.c == 3) {
                        if (set == null) {
                        }
                        if (a.f) {
                        }
                        i = etyVar.c;
                        if (i != 0) {
                        }
                        linkedHashMap.put(c, bA);
                    } else {
                        int i62222 = etyVar.c;
                        if (i62222 == 0) {
                        }
                        Log.w("MendelPackageState", "Type mismatch for flag " + c + ". Expected " + ((Object) hnu.bE(i2)) + ", got " + (i62222 == 0 ? i62222 != 1 ? i62222 != 2 ? i62222 != 3 ? i62222 != 4 ? i62222 != 5 ? a.ai(i62222, "UNKNOWN(", ")") : "WIRE_TYPE_BYTES" : "WIRE_TYPE_STRING" : "WIRE_TYPE_DOUBLE" : "WIRE_TYPE_VARINT" : "WIRE_TYPE_TRUE" : "WIRE_TYPE_FALSE") + ". Falling back to default.");
                    }
                } else if (etyVar.c == 2) {
                    if (set == null) {
                    }
                    if (a.f) {
                    }
                    i = etyVar.c;
                    if (i != 0) {
                    }
                    linkedHashMap.put(c, bA);
                } else {
                    int i622222 = etyVar.c;
                    if (i622222 == 0) {
                    }
                    Log.w("MendelPackageState", "Type mismatch for flag " + c + ". Expected " + ((Object) hnu.bE(i2)) + ", got " + (i622222 == 0 ? i622222 != 1 ? i622222 != 2 ? i622222 != 3 ? i622222 != 4 ? i622222 != 5 ? a.ai(i622222, "UNKNOWN(", ")") : "WIRE_TYPE_BYTES" : "WIRE_TYPE_STRING" : "WIRE_TYPE_DOUBLE" : "WIRE_TYPE_VARINT" : "WIRE_TYPE_TRUE" : "WIRE_TYPE_FALSE") + ". Falling back to default.");
                }
            }
        }
        hjr it2 = ggoVar.b().iterator();
        it2.getClass();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            next2.getClass();
            String str2 = (String) next2;
            if (!linkedHashMap.containsKey(str2)) {
                ggn a2 = ggoVar.a(str2);
                a2.getClass();
                linkedHashMap.put(str2, a2);
            }
        }
        return hnu.ad(linkedHashMap);
    }

    public final her c(ggj ggjVar) {
        ggn bC;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object b = this.j.b();
        b.getClass();
        ggo ggoVar = (ggo) b;
        for (ggk ggkVar : ggjVar.f) {
            ggn a = ggoVar.a(ggkVar.e);
            if (a != null) {
                int i = ggkVar.c;
                int bF = hnu.bF(i);
                int i2 = a.g;
                if (bF == i2) {
                    String str = ggkVar.e;
                    ggkVar.getClass();
                    int bF2 = hnu.bF(i);
                    if (bF2 == 0) {
                        throw null;
                    }
                    int i3 = 6;
                    switch (bF2 - 1) {
                        case 0:
                            bC = hnu.bC(i == 1 ? ((Long) ggkVar.d).longValue() : 0L);
                            break;
                        case 1:
                            bC = hnu.bA(i == 2 ? ((Boolean) ggkVar.d).booleanValue() : false);
                            break;
                        case 2:
                            bC = hnu.bB(i == 3 ? ((Double) ggkVar.d).doubleValue() : 0.0d);
                            break;
                        case 3:
                            String str2 = i == 4 ? (String) ggkVar.d : "";
                            str2.getClass();
                            bC = hnu.bD(str2);
                            break;
                        case 4:
                            bC = new ggn(new ggy(ggkVar, i3), 5, null, false);
                            break;
                        case 5:
                            awb awbVar = new awb(a, ggkVar, 13);
                            jll jllVar = a.e;
                            jllVar.getClass();
                            bC = new ggn(awbVar, 6, jllVar, false);
                            break;
                        case 6:
                            throw new IllegalStateException("No known flag type");
                        default:
                            throw new koj();
                    }
                    linkedHashMap.put(str, bC);
                } else {
                    Log.w("MendelPackageState", "Type mismatch for flag " + ggkVar.e + ". Expected " + ((Object) hnu.bE(i2)) + ", got " + ((Object) hnu.bE(hnu.bF(i))) + ". Falling back to default.");
                }
            }
        }
        hjr it = ggoVar.b().iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            String str3 = (String) next;
            if (!linkedHashMap.containsKey(str3)) {
                ggn a2 = ggoVar.a(str3);
                a2.getClass();
                linkedHashMap.put(str3, a2);
            }
        }
        return hnu.ad(linkedHashMap);
    }

    public final boolean d() {
        try {
            gbc gbcVar = this.q;
            if (gbcVar.e()) {
                if (((ghh) hnu.aR(gbcVar.c())).d()) {
                    return true;
                }
            }
        } catch (ExecutionException unused) {
        }
        return false;
    }

    public final void e(jkj jkjVar) {
        if (a().d) {
            String str = this.g;
            if (!jkjVar.b.M()) {
                jkjVar.t();
            }
            etm etmVar = (etm) jkjVar.b;
            etm etmVar2 = etm.a;
            etmVar.b |= 4;
            etmVar.e = str;
        }
    }

    public final bsh f(int i) {
        jkj k = etm.a.k();
        jkj k2 = etl.a.k();
        if (!k2.b.M()) {
            k2.t();
        }
        jkp jkpVar = k2.b;
        etl etlVar = (etl) jkpVar;
        etlVar.c = 1;
        etlVar.b = 1 | etlVar.b;
        if (!jkpVar.M()) {
            k2.t();
        }
        etl etlVar2 = (etl) k2.b;
        etlVar2.d = eos.M(i);
        etlVar2.b |= 2;
        if (!k.b.M()) {
            k.t();
        }
        etm etmVar = (etm) k.b;
        etl etlVar3 = (etl) k2.q();
        etlVar3.getClass();
        etmVar.d = etlVar3;
        etmVar.b |= 2;
        e(k);
        krx krxVar = this.i;
        hjc hjcVar = hjc.c;
        hjcVar.getClass();
        her b = b(hjcVar, kpm.a);
        jjq jjqVar = jjq.d;
        long epochMilli = Instant.now().toEpochMilli();
        jkp q = k.q();
        q.getClass();
        return new bsh((ghh) krxVar.a(b, new ghm("", jjqVar, epochMilli, (etm) q)), i, null);
    }
}
