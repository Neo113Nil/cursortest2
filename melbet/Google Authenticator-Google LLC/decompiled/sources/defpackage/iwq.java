package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import j$.time.Instant;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iwq {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    public iwq(Context context, cfe cfeVar, Map map, kee keeVar, hvl hvlVar, iyi iyiVar, gzp gzpVar, Map map2, ggh gghVar, krt krtVar, Executor executor, Map map3, krx krxVar, krt krtVar2, htr htrVar, kri kriVar, Set set) {
        cfeVar.getClass();
        map.getClass();
        keeVar.getClass();
        hvlVar.getClass();
        iyiVar.getClass();
        gzpVar.getClass();
        map2.getClass();
        gghVar.getClass();
        this.b = keeVar;
        this.c = gzpVar;
        this.d = set;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (((ggh) entry.getValue()) == gghVar) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set keySet = linkedHashMap.keySet();
        int i = 16;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(ksl.f(ixd.m(ixc.w(keySet)), 16));
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            String str = (String) next;
            die dieVar = new die(hvlVar);
            koe koeVar = (koe) map3.get(etb.c(str));
            if (koeVar == null) {
                koeVar = new eig(11);
            }
            koe koeVar2 = koeVar;
            hac v = hoq.v(new dsr(str, dieVar, iyiVar, krtVar, 3));
            fcu p = p(str, dieVar, iyiVar, krtVar, new dvm(i));
            gnk gnkVar = new gnk(krtVar2, str, 1);
            bwr bwrVar = new bwr(htrVar, str, 18);
            gho ghoVar = (gho) cfeVar.a;
            Iterator it2 = it;
            int intValue = ((emp) ghoVar.a).a().intValue();
            Optional optional = (Optional) ((jrx) ghoVar.b).a;
            hvl hvlVar2 = (hvl) ghoVar.c.b();
            dih dihVar = (dih) ghoVar.d.b();
            Set set2 = (Set) ((jrx) ghoVar.e).a;
            jsb jsbVar = ghoVar.f;
            linkedHashMap2.put(next, new ghn(intValue, optional, hvlVar2, dihVar, set2, ((ghg) ghoVar.g).b(), ghoVar.h, ghoVar.i, (etd) ghoVar.j.b(), (cfe) ghoVar.k.b(), (fym) ghoVar.l.b(), str, dieVar, krxVar, koeVar2, executor, v, p, gnkVar, bwrVar, kriVar));
            it = it2;
            i = 16;
        }
        this.a = linkedHashMap2;
    }

    public static final fcu p(String str, die dieVar, iyi iyiVar, krt krtVar, krt krtVar2) {
        hvj hvjVar = new hvj(new bqi(krtVar, krtVar2, str, 5, null));
        dieVar.a.add(hvjVar);
        ggj ggjVar = ggj.a;
        jkj k = ggjVar.k();
        k.getClass();
        return exf.s(str, hvjVar, hnu.bG(k), jkd.a, new cob(dieVar, 6), gzp.g(new fcx(ggjVar)), iyiVar);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    private final void q(Object obj, gef gefVar) {
        hfe hfeVar = new hfe(4);
        ?? r2 = this.b;
        hfh hfhVar = (hfh) r2.get(obj);
        if (hfhVar != null) {
            hfeVar.b(hfhVar);
        }
        hfeVar.d(gefVar, 1);
        r2.put(obj, hfeVar.a());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void r(Object obj, gef gefVar) {
        ?? r5 = this.b;
        hfh hfhVar = (hfh) r5.get(obj);
        hoq.I(hfhVar != null, "Failed to remove a subscription key. State is corrupted.");
        hfe hfeVar = new hfe(4);
        hfeVar.b(hfhVar);
        int b = hfhVar.b(gefVar) - 1;
        hik hikVar = hfeVar.a;
        hikVar.getClass();
        if (b == 0) {
            if (!hfeVar.c) {
                hfeVar.a = new hil(hikVar);
                hfeVar.c = true;
                b = 0;
                hfeVar.b = false;
                gefVar.getClass();
                if (b != 0) {
                    hfeVar.a.f(gefVar, hnu.ag(gefVar));
                } else {
                    hfeVar.a.o(gefVar, b);
                }
                r5.put(obj, hfeVar.a());
                if (((hfh) r5.get(obj)).isEmpty()) {
                    return;
                }
                r5.remove(obj);
                return;
            }
            b = 0;
        }
        if (hfeVar.b) {
            hfeVar.a = new hik(hikVar);
            hfeVar.c = false;
        }
        hfeVar.b = false;
        gefVar.getClass();
        if (b != 0) {
        }
        r5.put(obj, hfeVar.a());
        if (((hfh) r5.get(obj)).isEmpty()) {
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [hic, java.lang.Object] */
    private final boolean s(ged gedVar) {
        return this.d.a(gedVar, 1) == 0;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [hic, java.lang.Object] */
    private final boolean t(ged gedVar) {
        int d = this.d.d(gedVar, 1);
        hoq.H(d > 0);
        return d == 1;
    }

    public final int a() {
        return ((jko) this.c).a;
    }

    public final jmr b() {
        return ((jko) this.c).b;
    }

    public final void c(Object obj) {
        if (((jko) this.c).a() != jms.h) {
            return;
        }
        ((Integer) obj).intValue();
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, koi] */
    public final boolean d() {
        return ((Boolean) this.d.a()).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [hac, java.lang.Object] */
    public final void e(String str, String str2, String str3, String str4) {
        ((fea) this.c.bB()).b(str, str2, str3, str4);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [hac, java.lang.Object] */
    public final void f(double d, String str, String str2, String str3, String str4) {
        ((fdx) this.b.bB()).b(d, str, str2, str3, str4);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x020e  */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final hvi g(String str, etn etnVar) {
        int L;
        String str2;
        jkj k;
        jkx jkxVar;
        Object obj = this.a.get(str);
        obj.getClass();
        ghn ghnVar = (ghn) obj;
        Object b = ghnVar.j.b();
        b.getClass();
        ggo ggoVar = (ggo) b;
        jkj k2 = ggj.a.k();
        k2.getClass();
        int i = ghnVar.a;
        if (!k2.b.M()) {
            k2.t();
        }
        jkp jkpVar = k2.b;
        ggj ggjVar = (ggj) jkpVar;
        ggjVar.b |= 8;
        ggjVar.h = i;
        if ((etnVar.b & 2) != 0) {
            jjq jjqVar = etnVar.d;
            jjqVar.getClass();
            if (!jkpVar.M()) {
                k2.t();
            }
            ggj ggjVar2 = (ggj) k2.b;
            ggjVar2.b |= 4;
            ggjVar2.e = jjqVar;
        }
        String str3 = etnVar.c;
        str3.getClass();
        if (!k2.b.M()) {
            k2.t();
        }
        jkp jkpVar2 = k2.b;
        ggj ggjVar3 = (ggj) jkpVar2;
        ggjVar3.b |= 2;
        ggjVar3.d = str3;
        String str4 = etnVar.e;
        str4.getClass();
        if (!jkpVar2.M()) {
            k2.t();
        }
        ggj ggjVar4 = (ggj) k2.b;
        ggjVar4.b |= 1;
        ggjVar4.c = str4;
        long epochMilli = Instant.now().toEpochMilli();
        if (!k2.b.M()) {
            k2.t();
        }
        ggj ggjVar5 = (ggj) k2.b;
        ggjVar5.b |= 16;
        ggjVar5.i = epochMilli;
        jkx<eto> jkxVar2 = etnVar.f;
        jkxVar2.getClass();
        for (eto etoVar : jkxVar2) {
            ggn a = ggoVar.a(etoVar.e);
            if (a != null) {
                etoVar.getClass();
                int i2 = a.g;
                int i3 = i2 - 1;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                if (i3 != 4) {
                                    if (eos.L(etoVar.c) == 5) {
                                        DesugarCollections.unmodifiableList(((ggj) k2.b).f).getClass();
                                        k = ggk.a.k();
                                        k.getClass();
                                        String str5 = etoVar.e;
                                        str5.getClass();
                                        if (!k.b.M()) {
                                            k.t();
                                        }
                                        jkp jkpVar3 = k.b;
                                        ggk ggkVar = (ggk) jkpVar3;
                                        ggkVar.b |= 1;
                                        ggkVar.e = str5;
                                        if (i3 != 0) {
                                            long longValue = etoVar.c == 1 ? ((Long) etoVar.d).longValue() : 0L;
                                            if (!k.b.M()) {
                                                k.t();
                                            }
                                            ggk ggkVar2 = (ggk) k.b;
                                            ggkVar2.c = 1;
                                            ggkVar2.d = Long.valueOf(longValue);
                                        } else if (i3 == 1) {
                                            boolean booleanValue = etoVar.c == 2 ? ((Boolean) etoVar.d).booleanValue() : false;
                                            if (!k.b.M()) {
                                                k.t();
                                            }
                                            ggk ggkVar3 = (ggk) k.b;
                                            ggkVar3.c = 2;
                                            ggkVar3.d = Boolean.valueOf(booleanValue);
                                        } else if (i3 == 2) {
                                            double doubleValue = etoVar.c == 3 ? ((Double) etoVar.d).doubleValue() : 0.0d;
                                            if (!k.b.M()) {
                                                k.t();
                                            }
                                            ggk ggkVar4 = (ggk) k.b;
                                            ggkVar4.c = 3;
                                            ggkVar4.d = Double.valueOf(doubleValue);
                                        } else if (i3 == 3) {
                                            String str6 = etoVar.c == 4 ? (String) etoVar.d : "";
                                            str6.getClass();
                                            if (!jkpVar3.M()) {
                                                k.t();
                                            }
                                            ggk ggkVar5 = (ggk) k.b;
                                            ggkVar5.c = 4;
                                            ggkVar5.d = str6;
                                        } else if (i3 != 4) {
                                            jjq jjqVar2 = etoVar.c == 5 ? (jjq) etoVar.d : jjq.d;
                                            jjqVar2.getClass();
                                            if (!k.b.M()) {
                                                k.t();
                                            }
                                            ggk ggkVar6 = (ggk) k.b;
                                            ggkVar6.c = 6;
                                            ggkVar6.d = jjqVar2;
                                        } else {
                                            jjq jjqVar3 = etoVar.c == 5 ? (jjq) etoVar.d : jjq.d;
                                            jjqVar3.getClass();
                                            if (!k.b.M()) {
                                                k.t();
                                            }
                                            ggk ggkVar7 = (ggk) k.b;
                                            ggkVar7.c = 5;
                                            ggkVar7.d = jjqVar3;
                                        }
                                        jkp q = k.q();
                                        q.getClass();
                                        ggk ggkVar8 = (ggk) q;
                                        if (!k2.b.M()) {
                                            k2.t();
                                        }
                                        ggj ggjVar6 = (ggj) k2.b;
                                        jkxVar = ggjVar6.f;
                                        if (!jkxVar.c()) {
                                            ggjVar6.f = jkp.A(jkxVar);
                                        }
                                        ggjVar6.f.add(ggkVar8);
                                    } else {
                                        String str7 = etoVar.e;
                                        L = eos.L(etoVar.c);
                                        StringBuilder sb = new StringBuilder("Type mismatch for flag ");
                                        sb.append(str7);
                                        sb.append(". Expected ");
                                        sb.append((Object) hnu.bE(i2));
                                        sb.append(", got ");
                                        switch (L) {
                                            case 1:
                                                str2 = "LONG_VALUE";
                                                break;
                                            case 2:
                                                str2 = "BOOL_VALUE";
                                                break;
                                            case 3:
                                                str2 = "DOUBLE_VALUE";
                                                break;
                                            case 4:
                                                str2 = "STRING_VALUE";
                                                break;
                                            case 5:
                                                str2 = "BYTES_VALUE";
                                                break;
                                            case 6:
                                                str2 = "VALUE_NOT_SET";
                                                break;
                                            default:
                                                str2 = "null";
                                                break;
                                        }
                                        sb.append((Object) str2);
                                        sb.append(". Falling back to default.");
                                        Log.w("MendelPackageState", sb.toString());
                                    }
                                } else if (eos.L(etoVar.c) == 5) {
                                    DesugarCollections.unmodifiableList(((ggj) k2.b).f).getClass();
                                    k = ggk.a.k();
                                    k.getClass();
                                    String str52 = etoVar.e;
                                    str52.getClass();
                                    if (!k.b.M()) {
                                    }
                                    jkp jkpVar32 = k.b;
                                    ggk ggkVar9 = (ggk) jkpVar32;
                                    ggkVar9.b |= 1;
                                    ggkVar9.e = str52;
                                    if (i3 != 0) {
                                    }
                                    jkp q2 = k.q();
                                    q2.getClass();
                                    ggk ggkVar82 = (ggk) q2;
                                    if (!k2.b.M()) {
                                    }
                                    ggj ggjVar62 = (ggj) k2.b;
                                    jkxVar = ggjVar62.f;
                                    if (!jkxVar.c()) {
                                    }
                                    ggjVar62.f.add(ggkVar82);
                                } else {
                                    String str72 = etoVar.e;
                                    L = eos.L(etoVar.c);
                                    StringBuilder sb2 = new StringBuilder("Type mismatch for flag ");
                                    sb2.append(str72);
                                    sb2.append(". Expected ");
                                    sb2.append((Object) hnu.bE(i2));
                                    sb2.append(", got ");
                                    switch (L) {
                                    }
                                    sb2.append((Object) str2);
                                    sb2.append(". Falling back to default.");
                                    Log.w("MendelPackageState", sb2.toString());
                                }
                            } else if (eos.L(etoVar.c) == 4) {
                                DesugarCollections.unmodifiableList(((ggj) k2.b).f).getClass();
                                k = ggk.a.k();
                                k.getClass();
                                String str522 = etoVar.e;
                                str522.getClass();
                                if (!k.b.M()) {
                                }
                                jkp jkpVar322 = k.b;
                                ggk ggkVar92 = (ggk) jkpVar322;
                                ggkVar92.b |= 1;
                                ggkVar92.e = str522;
                                if (i3 != 0) {
                                }
                                jkp q22 = k.q();
                                q22.getClass();
                                ggk ggkVar822 = (ggk) q22;
                                if (!k2.b.M()) {
                                }
                                ggj ggjVar622 = (ggj) k2.b;
                                jkxVar = ggjVar622.f;
                                if (!jkxVar.c()) {
                                }
                                ggjVar622.f.add(ggkVar822);
                            } else {
                                String str722 = etoVar.e;
                                L = eos.L(etoVar.c);
                                StringBuilder sb22 = new StringBuilder("Type mismatch for flag ");
                                sb22.append(str722);
                                sb22.append(". Expected ");
                                sb22.append((Object) hnu.bE(i2));
                                sb22.append(", got ");
                                switch (L) {
                                }
                                sb22.append((Object) str2);
                                sb22.append(". Falling back to default.");
                                Log.w("MendelPackageState", sb22.toString());
                            }
                        } else if (eos.L(etoVar.c) == 3) {
                            DesugarCollections.unmodifiableList(((ggj) k2.b).f).getClass();
                            k = ggk.a.k();
                            k.getClass();
                            String str5222 = etoVar.e;
                            str5222.getClass();
                            if (!k.b.M()) {
                            }
                            jkp jkpVar3222 = k.b;
                            ggk ggkVar922 = (ggk) jkpVar3222;
                            ggkVar922.b |= 1;
                            ggkVar922.e = str5222;
                            if (i3 != 0) {
                            }
                            jkp q222 = k.q();
                            q222.getClass();
                            ggk ggkVar8222 = (ggk) q222;
                            if (!k2.b.M()) {
                            }
                            ggj ggjVar6222 = (ggj) k2.b;
                            jkxVar = ggjVar6222.f;
                            if (!jkxVar.c()) {
                            }
                            ggjVar6222.f.add(ggkVar8222);
                        } else {
                            String str7222 = etoVar.e;
                            L = eos.L(etoVar.c);
                            StringBuilder sb222 = new StringBuilder("Type mismatch for flag ");
                            sb222.append(str7222);
                            sb222.append(". Expected ");
                            sb222.append((Object) hnu.bE(i2));
                            sb222.append(", got ");
                            switch (L) {
                            }
                            sb222.append((Object) str2);
                            sb222.append(". Falling back to default.");
                            Log.w("MendelPackageState", sb222.toString());
                        }
                    } else if (eos.L(etoVar.c) == 2) {
                        DesugarCollections.unmodifiableList(((ggj) k2.b).f).getClass();
                        k = ggk.a.k();
                        k.getClass();
                        String str52222 = etoVar.e;
                        str52222.getClass();
                        if (!k.b.M()) {
                        }
                        jkp jkpVar32222 = k.b;
                        ggk ggkVar9222 = (ggk) jkpVar32222;
                        ggkVar9222.b |= 1;
                        ggkVar9222.e = str52222;
                        if (i3 != 0) {
                        }
                        jkp q2222 = k.q();
                        q2222.getClass();
                        ggk ggkVar82222 = (ggk) q2222;
                        if (!k2.b.M()) {
                        }
                        ggj ggjVar62222 = (ggj) k2.b;
                        jkxVar = ggjVar62222.f;
                        if (!jkxVar.c()) {
                        }
                        ggjVar62222.f.add(ggkVar82222);
                    } else {
                        String str72222 = etoVar.e;
                        L = eos.L(etoVar.c);
                        StringBuilder sb2222 = new StringBuilder("Type mismatch for flag ");
                        sb2222.append(str72222);
                        sb2222.append(". Expected ");
                        sb2222.append((Object) hnu.bE(i2));
                        sb2222.append(", got ");
                        switch (L) {
                        }
                        sb2222.append((Object) str2);
                        sb2222.append(". Falling back to default.");
                        Log.w("MendelPackageState", sb2222.toString());
                    }
                } else if (eos.L(etoVar.c) == 1) {
                    DesugarCollections.unmodifiableList(((ggj) k2.b).f).getClass();
                    k = ggk.a.k();
                    k.getClass();
                    String str522222 = etoVar.e;
                    str522222.getClass();
                    if (!k.b.M()) {
                    }
                    jkp jkpVar322222 = k.b;
                    ggk ggkVar92222 = (ggk) jkpVar322222;
                    ggkVar92222.b |= 1;
                    ggkVar92222.e = str522222;
                    if (i3 != 0) {
                    }
                    jkp q22222 = k.q();
                    q22222.getClass();
                    ggk ggkVar822222 = (ggk) q22222;
                    if (!k2.b.M()) {
                    }
                    ggj ggjVar622222 = (ggj) k2.b;
                    jkxVar = ggjVar622222.f;
                    if (!jkxVar.c()) {
                    }
                    ggjVar622222.f.add(ggkVar822222);
                } else {
                    String str722222 = etoVar.e;
                    L = eos.L(etoVar.c);
                    StringBuilder sb22222 = new StringBuilder("Type mismatch for flag ");
                    sb22222.append(str722222);
                    sb22222.append(". Expected ");
                    sb22222.append((Object) hnu.bE(i2));
                    sb22222.append(", got ");
                    switch (L) {
                    }
                    sb22222.append((Object) str2);
                    sb22222.append(". Falling back to default.");
                    Log.w("MendelPackageState", sb22222.toString());
                }
            }
        }
        DesugarCollections.unmodifiableList(((ggj) k2.b).g).getClass();
        jkx jkxVar3 = etnVar.g;
        jkxVar3.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : jkxVar3) {
            if (ggoVar.b.containsKey((String) obj2)) {
                arrayList.add(obj2);
            }
        }
        if (!k2.b.M()) {
            k2.t();
        }
        ggj ggjVar7 = (ggj) k2.b;
        jkx jkxVar4 = ggjVar7.g;
        if (!jkxVar4.c()) {
            ggjVar7.g = jkp.A(jkxVar4);
        }
        jiz.f(arrayList, ggjVar7.g);
        ggj bG = hnu.bG(k2);
        try {
            her c = ghnVar.c(bG);
            gty aC = hoq.aC(161, "Updating flags from broadcast for: ".concat(String.valueOf(ghnVar.r)));
            try {
                hvi a2 = ghnVar.h.a(ghnVar.b, new bwr(ghnVar, bG, 20, null));
                aC.b(a2);
                ixf.j(aC, null);
                return hti.g(a2, gvx.c(new bpp(ghnVar, bG, c, 14, null)), ghnVar.k);
            } finally {
            }
        } catch (jld e) {
            return hnu.aI(e);
        }
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, java.util.Map] */
    public final List h() {
        hvi a;
        ?? r11 = this.a;
        ArrayList arrayList = new ArrayList(r11.size());
        for (Map.Entry entry : r11.entrySet()) {
            String str = (String) entry.getKey();
            ghn ghnVar = (ghn) entry.getValue();
            gbc gbcVar = ghnVar.q;
            jjq jjqVar = null;
            if (gbcVar.e()) {
                a = gbcVar.c();
            } else {
                gty aC = hoq.aC(159, "Loading flags async for: ".concat(String.valueOf(ghnVar.r)));
                try {
                    a = ghnVar.h.a(ghnVar.b, new fxs(ghnVar, 8));
                    aC.b(a);
                    ixf.j(aC, null);
                } finally {
                }
            }
            hvi at = hoq.at(a, new fyc(new dvm(19), 18), huf.a);
            gbc gbcVar2 = ((ghn) entry.getValue()).q;
            if (gbcVar2.e()) {
                try {
                    jjqVar = ((ghh) hnu.aR(gbcVar2.c())).b().a;
                } catch (ExecutionException unused) {
                }
            }
            arrayList.add(new iyi(str, at, jjqVar));
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public final boolean i() {
        Collection values = this.a.values();
        if ((values instanceof Collection) && values.isEmpty()) {
            return false;
        }
        Iterator it = values.iterator();
        while (it.hasNext()) {
            if (((ghn) it.next()).d()) {
                return true;
            }
        }
        return false;
    }

    public final void j(hvi hviVar, Object obj, gee geeVar, gzp gzpVar, Executor executor) {
        hoq.ay();
        hnu.aS(hviVar, gvx.f(new geb(this, obj, geeVar, gzpVar)), executor);
    }

    public final void k(hvi hviVar, Object obj) {
        j(hviVar, obj, gee.a, gyf.a, huf.a);
    }

    public final void l(Object obj, gef gefVar) {
        fao.c();
        qk qkVar = new qk(0);
        synchronized (this.a) {
            if (obj instanceof gdp) {
                hjr it = ((gdp) obj).a().iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    q(next, gefVar);
                    if (next instanceof ged) {
                        ged gedVar = (ged) next;
                        if (s(gedVar)) {
                            qkVar.add(gedVar);
                        }
                    }
                }
            } else {
                q(obj, gefVar);
                if (obj instanceof ged) {
                    ged gedVar2 = (ged) obj;
                    if (s(gedVar2)) {
                        qkVar.add(gedVar2);
                    }
                }
            }
        }
        qj qjVar = new qj(qkVar);
        while (qjVar.hasNext()) {
            ((ged) qjVar.next()).a();
        }
    }

    public final void m(Object obj, gef gefVar) {
        fao.c();
        qk qkVar = new qk(0);
        synchronized (this.a) {
            if (obj instanceof gdp) {
                hjr it = ((gdp) obj).a().iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    r(next, gefVar);
                    if (next instanceof ged) {
                        ged gedVar = (ged) next;
                        if (t(gedVar)) {
                            qkVar.add(gedVar);
                        }
                    }
                }
            } else {
                r(obj, gefVar);
                if (obj instanceof ged) {
                    ged gedVar2 = (ged) obj;
                    if (t(gedVar2)) {
                        qkVar.add(gedVar2);
                    }
                }
            }
        }
        qj qjVar = new qj(qkVar);
        while (qjVar.hasNext()) {
            ((ged) qjVar.next()).b();
        }
    }

    public final boolean n() {
        return ((ewb) this.a).a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, koi] */
    public final iee o() {
        return (iee) this.c.a();
    }

    public iwq(Context context, cbp cbpVar, fug fugVar, gzp gzpVar) {
        this.a = context;
        this.b = cbpVar;
        this.d = fugVar;
        this.c = gzpVar;
    }

    public iwq(Context context, fym fymVar, hvl hvlVar, koe koeVar) {
        this.b = context;
        this.c = fymVar;
        this.d = hvlVar;
        this.a = koeVar;
    }

    public iwq(gzp gzpVar, hel helVar, hel helVar2, bsh bshVar) {
        this.d = gzpVar;
        this.b = helVar;
        this.c = helVar2;
        this.a = bshVar;
    }

    public iwq(Object obj, Object obj2, Object obj3, Object obj4) {
        this.d = obj;
        this.c = obj2;
        this.b = obj3;
        this.a = obj4;
    }

    public iwq(jyh jyhVar) {
        this.a = jyhVar.c;
        this.b = jyhVar.a;
        this.c = jyhVar.b;
        this.d = jyhVar.d;
    }

    public iwq(kae kaeVar, jww jwwVar, kaa kaaVar, String str) {
        this.b = jwwVar;
        this.c = kaeVar;
        this.a = kaaVar;
        this.d = str;
    }

    public iwq(koe koeVar, koe koeVar2, koe koeVar3, koe koeVar4, koe koeVar5) {
        this.a = koeVar;
        this.d = koeVar3;
        this.b = koeVar4;
        this.c = koeVar5;
    }

    public iwq(eub eubVar, ewb ewbVar) {
        if (eubVar.b.b.isEmpty()) {
            etu.a.equals(eubVar.c);
        }
        this.c = eubVar.f();
        this.b = eubVar.d();
        eubVar.e();
        eubVar.a();
        Map g = eubVar.g();
        if (g != null) {
            hfm.n(g.keySet());
        } else {
            hjb hjbVar = hjb.a;
        }
        hfv hfvVar = eubVar.b().b;
        hen h = her.h(hfvVar.size() + 3);
        hjr it = hfvVar.iterator();
        while (it.hasNext()) {
            ety etyVar = (ety) it.next();
            h.g(etyVar.c(), etyVar.b());
        }
        h.g("__phenotype_server_token", eubVar.e());
        h.g("__phenotype_snapshot_token", eubVar.f());
        h.g("__phenotype_configuration_version", Long.valueOf(eubVar.a()));
        this.d = h.d(false);
        this.a = ewbVar;
    }

    public iwq(gzp gzpVar) {
        this.a = new Object();
        this.b = new qi();
        this.d = new hdv();
        this.c = gzpVar;
    }

    public iwq(ScheduledExecutorService scheduledExecutorService, iyi iyiVar, Application application) {
        this.c = hoq.v(new goi(this, 1));
        this.b = hoq.v(new goi(this, 0));
        fee d = fee.d("tiktok");
        this.d = d;
        fed fedVar = d.c;
        if (fedVar == null) {
            this.a = feg.c(iyiVar, scheduledExecutorService, d, application);
        } else {
            this.a = fedVar;
            ((feg) fedVar).f = iyiVar;
        }
    }

    public iwq(jll jllVar, Object obj, jll jllVar2, jko jkoVar) {
        if (jllVar != null) {
            if (jkoVar.b == jmr.MESSAGE && jllVar2 == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.d = jllVar;
            this.b = obj;
            this.a = jllVar2;
            this.c = jkoVar;
            return;
        }
        throw new IllegalArgumentException("Null containingTypeDefaultInstance");
    }

    public iwq(byte[] bArr) {
        this.b = new HashMap();
        this.d = new HashMap();
        this.a = new HashMap();
        this.c = new HashMap();
    }

    public iwq() {
        throw null;
    }

    public iwq(ikj ikjVar, koe koeVar, koe koeVar2, koe koeVar3) {
        ikjVar.getClass();
        koeVar.getClass();
        koeVar2.getClass();
        koeVar3.getClass();
        this.a = ikjVar;
        this.c = new kop(new ggy(koeVar, 7));
        this.d = new kop(new ggy(koeVar2, 8));
        this.b = new kop(new ggy(koeVar3, 9));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    public iwq(iwq iwqVar) {
        this.b = new HashMap((Map) iwqVar.a);
        this.d = new HashMap((Map) iwqVar.b);
        this.a = new HashMap((Map) iwqVar.d);
        this.c = new HashMap((Map) iwqVar.c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public iwq(iwq iwqVar, byte[] bArr) {
        this.a = new HashMap((Map) iwqVar.b);
        this.b = new HashMap((Map) iwqVar.d);
        this.d = new HashMap((Map) iwqVar.a);
        this.c = new HashMap((Map) iwqVar.c);
    }

    public iwq(ewd ewdVar, ewb ewbVar) {
        jjq jjqVar;
        String str;
        ewd.a.equals(ewdVar);
        this.c = ewdVar.c;
        this.b = ewdVar.d;
        String str2 = ewdVar.e;
        long j = ewdVar.f;
        hjb hjbVar = hjb.a;
        hen h = her.h(ewdVar.g.size() + 3);
        Iterator it = ewdVar.g.iterator();
        while (true) {
            if (!it.hasNext()) {
                h.g("__phenotype_server_token", ewdVar.e);
                h.g("__phenotype_snapshot_token", ewdVar.c);
                h.g("__phenotype_configuration_version", Long.valueOf(ewdVar.f));
                this.d = h.d(false);
                this.a = ewbVar;
                return;
            }
            ewe eweVar = (ewe) it.next();
            int i = eweVar.c;
            int i2 = i != 0 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? i != 6 ? 0 : 5 : 4 : 3 : 2 : 1 : 6;
            if (i2 == 0) {
                throw null;
            }
            int i3 = i2 - 1;
            if (i3 == 0) {
                h.g(eweVar.e, Long.valueOf(i == 2 ? ((Long) eweVar.d).longValue() : 0L));
            } else if (i3 == 1) {
                h.g(eweVar.e, Boolean.valueOf(i == 3 ? ((Boolean) eweVar.d).booleanValue() : false));
            } else if (i3 == 2) {
                h.g(eweVar.e, Double.valueOf(i == 4 ? ((Double) eweVar.d).doubleValue() : 0.0d));
            } else if (i3 == 3) {
                String str3 = eweVar.e;
                if (i == 5) {
                    str = (String) eweVar.d;
                } else {
                    str = "";
                }
                h.g(str3, str);
            } else if (i3 == 4) {
                String str4 = eweVar.e;
                if (i == 6) {
                    jjqVar = (jjq) eweVar.d;
                } else {
                    jjqVar = jjq.d;
                }
                h.g(str4, jjqVar.x());
            }
        }
    }

    public iwq(Context context, PackageManager packageManager, hvl hvlVar) {
        hvlVar.getClass();
        this.b = context;
        this.c = packageManager;
        this.d = hvlVar;
        this.a = new gbc(gvx.b(new fxs(this, 12)), hvlVar);
    }

    public iwq(glu gluVar, cka ckaVar) {
        this.d = new Object();
        this.a = new HashMap();
        this.c = gluVar;
        this.b = ckaVar;
    }
}
