package defpackage;

import android.content.Context;
import com.google.android.apps.authenticator2.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dtj {
    public final dui a;
    public ehv b;
    public List c;
    public dvt d;
    public kwu e;
    public final dwg f;
    public List g;
    public final lao h;
    private final eia i;
    private final gzp j;
    private final dwl k;
    private final dwe l;
    private final lao m;
    private final dja n;

    public dtj(dui duiVar, lao laoVar, eia eiaVar, lao laoVar2) {
        this.a = duiVar;
        this.m = laoVar;
        this.i = eiaVar;
        this.h = laoVar2;
        kpk kpkVar = kpk.a;
        this.b = new eht(null, kpkVar);
        this.c = kpkVar;
        this.d = new dvt(kpkVar, kpkVar, kpl.a, null);
        duq duqVar = duiVar.a;
        gzp gzpVar = duqVar.q;
        this.j = gzpVar;
        this.k = new dwl(duqVar.g(), duiVar.d, gzpVar);
        duiVar.a.j();
        dja djaVar = new dja();
        this.n = djaVar;
        jiw g = duiVar.a.g();
        gjl gjlVar = duiVar.d;
        jit b = eiaVar.b();
        String str = (String) duiVar.a.d().e();
        dtd h = duiVar.a.h();
        duq duqVar2 = duiVar.a;
        this.l = new dwe(g, gjlVar, b, str, h, duqVar2.u, duqVar2.v);
        gjl gjlVar2 = duiVar.d;
        jiw g2 = duiVar.a.g();
        Object b2 = duiVar.a.l.b();
        b2.getClass();
        Object b3 = duiVar.a.m.b();
        b3.getClass();
        duu duuVar = (duu) ((gzp) b3).e();
        duiVar.a.k();
        dtd h2 = duiVar.a.h();
        Object b4 = duiVar.a.n.b();
        b4.getClass();
        this.f = new dwg(gjlVar2, g2, djaVar, eiaVar, duuVar, h2);
        this.g = kpkVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:221:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0660  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x066e  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0675  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x067a  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0663  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x056e  */
    /* JADX WARN: Type inference failed for: r12v39, types: [java.lang.Object, krt] */
    /* JADX WARN: Type inference failed for: r4v19, types: [gzr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v59 */
    /* JADX WARN: Type inference failed for: r8v60, types: [java.util.List, jgi] */
    /* JADX WARN: Type inference failed for: r8v72 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ void a(dtj dtjVar, ehv ehvVar, jfr jfrVar, jhu jhuVar, List list, dvt dvtVar, List list2, int i) {
        int i2;
        boolean z;
        List list3;
        int i3;
        int i4;
        jhn jhnVar;
        jhu jhuVar2;
        boolean z2;
        dui duiVar;
        ehr ehrVar;
        jgf jhxVar;
        dtj dtjVar2;
        jgn jgnVar;
        ehr ehrVar2;
        int i5;
        jgi jgiVar;
        jgd jgvVar;
        int i6;
        jhk jhkVar;
        jhh c;
        jhh jhhVar;
        jhq jhqVar;
        jhq jhqVar2;
        jhy jhyVar;
        ehv ehvVar2;
        ArrayList arrayList;
        jhn jhnVar2;
        jhn jhnVar3;
        jfs jfsVar;
        jgr jgsVar;
        jfv jfvVar;
        kpt kptVar;
        jhy jhyVar2;
        eba ebaVar;
        boolean z3;
        jhi jhiVar;
        ijy ijyVar;
        String str;
        ijy ijyVar2;
        ?? r8;
        jhn jhnVar4;
        jhh jhhVar2;
        List list4;
        ehv ehvVar3 = (i & 1) != 0 ? dtjVar.b : ehvVar;
        jfr jfrVar2 = (i & 2) != 0 ? dtjVar.a.a.h().k : jfrVar;
        jhu jhuVar3 = (i & 4) != 0 ? (jhu) dtjVar.h.b() : jhuVar;
        List list5 = (i & 8) != 0 ? dtjVar.c : list;
        dvt dvtVar2 = (i & 16) != 0 ? dtjVar.d : dvtVar;
        List list6 = (i & 32) != 0 ? dtjVar.g : list2;
        if (ksp.b(ehvVar3.a(), dtjVar.i.a())) {
            dui duiVar2 = dtjVar.a;
            duq duqVar = duiVar2.a;
            boolean h = duqVar.i().h();
            boolean j = duqVar.i().j();
            ehs b = ehvVar3.b();
            if (b != null) {
                if (b.a.a((jfi) duqVar.e().e()) != null) {
                    throw null;
                }
            }
            ehs b2 = ehvVar3.b();
            ehr ehrVar3 = b2 != null ? b2.a : null;
            int i7 = ehr.e;
            int g = dja.g(ehrVar3, jfrVar2);
            if (h && g == 1) {
                z = true;
                i2 = 0;
            } else {
                i2 = 0;
                z = false;
            }
            if (ehrVar3 != null) {
                jfrVar2.getClass();
                jgi b3 = ehrVar3.b(jfrVar2, j);
                String d = ehrVar3.d();
                jhh[] jhhVarArr = new jhh[2];
                if (d != null) {
                    i3 = 2;
                    list3 = list6;
                    Object[] objArr = new Object[1];
                    objArr[i2] = d;
                    i4 = 1;
                    jhhVar2 = new jhh(R.string.og_greeting_hi_message_with_name, objArr);
                } else {
                    list3 = list6;
                    i3 = 2;
                    i4 = 1;
                    jhhVar2 = new jhh(R.string.og_greeting_hi_message_without_name);
                }
                jhhVarArr[i2] = jhhVar2;
                jhhVarArr[i4] = new jhh(R.string.og_short_greeting_hi_message);
                List D = ixc.D(jhhVarArr);
                if (ehrVar3.b) {
                    jhh[] jhhVarArr2 = new jhh[3];
                    jhhVarArr2[i2] = new jhh(R.string.og_my_account_desc_long_length);
                    jhhVarArr2[i4] = new jhh(R.string.og_my_account_desc_meduim_length);
                    jhhVarArr2[i3] = new jhh(R.string.og_my_account_desc_short_length);
                    list4 = ixc.D(jhhVarArr2);
                } else {
                    list4 = kpk.a;
                }
                jhnVar = new jhn(ehrVar3.a, b3, D, list4, null);
            } else {
                list3 = list6;
                i3 = 2;
                i4 = 1;
                jhnVar = null;
            }
            Map map = dvtVar2.c;
            ixc.k(map.values()).isEmpty();
            int i8 = (h && dvtVar2.a()) ? i4 : i2;
            Boolean bool = jhuVar3.b;
            int booleanValue = bool != null ? bool.booleanValue() : i8 != 0 ? i2 : i4;
            ArrayList arrayList2 = new ArrayList(ixc.w(list3));
            for (Iterator it = list3.iterator(); it.hasNext(); it = it) {
                arrayList2.add(((ehr) it.next()).c);
            }
            List d2 = ehvVar3.d();
            ArrayList arrayList3 = new ArrayList();
            int i9 = booleanValue;
            for (Object obj : d2) {
                int i10 = i9;
                boolean z4 = z;
                if (!arrayList2.contains(((ehs) obj).a.c)) {
                    arrayList3.add(obj);
                }
                i9 = i10;
                z = z4;
            }
            boolean z5 = z;
            int i11 = i9;
            List o = ixc.o(arrayList3, new hfn(map, i4));
            ArrayList arrayList4 = new ArrayList(ixc.w(o));
            Iterator it2 = o.iterator();
            while (it2.hasNext()) {
                ehs ehsVar = (ehs) it2.next();
                gjl gjlVar = duiVar2.d;
                Iterator it3 = it2;
                jhy jhyVar3 = (jhy) map.get(ehsVar);
                ehr ehrVar4 = ehsVar.a;
                Map map2 = map;
                if (ehrVar4.a((jfi) duqVar.e().e()) != null) {
                    throw null;
                }
                ?? r12 = gjlVar.l;
                Object obj2 = gjlVar.k;
                jit jitVar = ehrVar4.a;
                List list7 = list5;
                ((fwm) obj2).b.a(jitVar);
                r12.a(jitVar);
                jgg h2 = ehrVar4.h(1, jfrVar2, null, j);
                if (jhyVar3 != null) {
                    h2 = jgg.a(h2, null, jhyVar3, 63);
                }
                arrayList4.add(h2);
                it2 = it3;
                map = map2;
                list5 = list7;
            }
            List list8 = list5;
            ArrayList arrayList5 = new ArrayList();
            for (Object obj3 : list3) {
                String str2 = ((ehr) obj3).c;
                ehs b4 = ehvVar3.b();
                if (!str2.equals(b4 != null ? b4.a.c : null)) {
                    arrayList5.add(obj3);
                }
            }
            ArrayList arrayList6 = new ArrayList(ixc.w(arrayList5));
            Iterator it4 = arrayList5.iterator();
            while (it4.hasNext()) {
                arrayList6.add(((ehr) it4.next()).h(3, jfrVar2, jhuVar3, j));
            }
            List l = ixc.l(arrayList4, arrayList6);
            boolean z6 = ehvVar3 instanceof eht;
            if (z6) {
                dvw c2 = duqVar.c();
                ehs ehsVar2 = ((eht) ehvVar3).a;
                ehr ehrVar5 = ehsVar2 != null ? ehsVar2.a : null;
                gjl gjlVar2 = duiVar2.d;
                jhuVar2 = jhuVar3;
                if (ksp.b(c2.c, ehrVar5)) {
                    z2 = z6;
                } else {
                    c2.c = ehrVar5;
                    if (ehrVar5 == null || !ehrVar5.b) {
                        z2 = z6;
                    } else {
                        fwm fwmVar = c2.i;
                        z2 = z6;
                        if (((clm) fwmVar.b).l((Context) fwmVar.a, 201200000) == 0) {
                            c2.d = c2.b.a(new aya(c2, gjlVar2, 17));
                            c2.e = dvw.a;
                        }
                    }
                    c2.d = null;
                    c2.e = null;
                }
                jgj jgjVar = duqVar.c().e;
                if (jhnVar == null || jgjVar == null) {
                    r8 = 0;
                    jhnVar4 = jhnVar;
                } else {
                    if (h) {
                        int i12 = i3;
                        jgjVar = new jgj(jgjVar.a, i12, i12);
                    }
                    jgi jgiVar2 = jhnVar.b;
                    jgi jgiVar3 = new jgi(jgiVar2.a, jgiVar2.b, jgjVar);
                    r8 = 0;
                    jhnVar4 = jhn.a(jhnVar, jgiVar3, null, null, 29);
                }
                jiu jiuVar = duqVar.c().d;
                if (jiuVar != null) {
                    jhnVar4 = jhnVar4 != null ? jhn.a(jhnVar4, r8, r8, jiuVar, 15) : null;
                }
                if (dvtVar2.a()) {
                    List list9 = jhnVar4 != null ? jhnVar4.c : kpk.a;
                    if (jhnVar4 != null) {
                        ehr ehrVar6 = ehsVar2 != null ? ehsVar2.a : null;
                        String d3 = ehrVar6 != null ? ehrVar6.d() : null;
                        ArrayList arrayList7 = new ArrayList();
                        if (d3 != null) {
                            Object[] objArr2 = new Object[1];
                            objArr2[i2] = d3;
                            arrayList7.add(new jhh(R.string.og_bento_alert_greeting_with_name, objArr2));
                        }
                        arrayList7.add(new jhh(R.string.og_bento_alert_greeting_without_name));
                        arrayList7.addAll(list9);
                        jhnVar4 = jhn.a(jhnVar4, null, arrayList7, null, 27);
                    } else {
                        jhnVar = null;
                    }
                }
                jhnVar = jhnVar4;
            } else {
                jhuVar2 = jhuVar3;
                z2 = z6;
            }
            if (ehvVar3.e()) {
                ehs b5 = ehvVar3.b();
                jit jitVar2 = b5 != null ? b5.a.a : null;
                if (!h || jitVar2 == null) {
                    jhyVar = null;
                } else {
                    dwe dweVar = dtjVar.l;
                    aya ayaVar = new aya(dweVar, jitVar2, 18, null);
                    jiw jiwVar = dweVar.a;
                    jiu jiuVar2 = dweVar.j;
                    jiwVar.c(jiuVar2, ayaVar);
                    jhh[] jhhVarArr3 = new jhh[3];
                    jhhVarArr3[i2] = new jhh(R.string.og_my_account_desc_long_length);
                    jhhVarArr3[1] = new jhh(R.string.og_my_account_desc_meduim_length);
                    jhhVarArr3[2] = new jhh(R.string.og_my_account_desc_short_length);
                    jhyVar = dwe.b(ixc.D(jhhVarArr3), new jha(14, null), 90139, dweVar.i, jiuVar2, 1);
                }
                jhn jhnVar5 = true != h ? jhnVar : null;
                dvl dvlVar = dvtVar2.d;
                dwe dweVar2 = dtjVar.l;
                ArrayList arrayList8 = new ArrayList();
                jhy jhyVar4 = dweVar2.c;
                if (jhyVar4 != null) {
                    arrayList8.add(jhyVar4);
                }
                jhy jhyVar5 = dweVar2.d;
                if (jhyVar5 != null) {
                    arrayList8.add(jhyVar5);
                }
                jhy jhyVar6 = dweVar2.e;
                if (jhyVar6 != null) {
                    arrayList8.add(jhyVar6);
                }
                ArrayList arrayList9 = new ArrayList(ixc.w(arrayList8));
                for (Iterator it5 = arrayList8.iterator(); it5.hasNext(); it5 = it5) {
                    arrayList9.add(new jic((jhy) it5.next()));
                }
                jia jiaVar = new jia(arrayList9, dweVar2.h);
                int i13 = (l.isEmpty() && jiaVar.a.isEmpty()) ? i2 : 1;
                ArrayList arrayList10 = new ArrayList();
                int i14 = i13;
                if (h) {
                    if (jhnVar != null) {
                        ehs b6 = ehvVar3.b();
                        ehr ehrVar7 = b6 != null ? b6.a : null;
                        if (ehrVar7 != null) {
                            jfrVar2.getClass();
                            duiVar = duiVar2;
                            ehrVar = ehrVar3;
                            kpt kptVar2 = new kpt(10);
                            String f = ehrVar7.f();
                            String e = ehrVar7.e();
                            ehvVar2 = ehvVar3;
                            jit jitVar3 = ehrVar7.a;
                            boolean b7 = jfrVar2.b(jitVar3);
                            if (f == null || ksp.b(f, e) || !b7) {
                                jhnVar2 = jhnVar5;
                                String str3 = (f == null || b7) ? e : f;
                                Object[] objArr3 = new Object[1];
                                objArr3[i2] = str3;
                                kptVar2.add(new jhh(R.string.og_signed_in_as_account, objArr3));
                            } else {
                                jhnVar2 = jhnVar5;
                                Object[] objArr4 = new Object[2];
                                objArr4[i2] = f;
                                objArr4[1] = e;
                                kptVar2.add(new jhh(R.string.og_signed_in_as_account_with_email, objArr4));
                            }
                            jho a = jfrVar2.a(jitVar3);
                            int a2 = a != null ? a.a() : i2;
                            if (a2 != 0) {
                                z3 = ili.a(a2);
                            } else {
                                z3 = ehrVar7.d;
                                a2 = i2;
                            }
                            if (z3) {
                                String str4 = (dvlVar == null || (ijyVar2 = dvlVar.c) == null) ? null : ijyVar2.b;
                                if (!j) {
                                    kptVar2.add(new jhh(R.string.og_google_one_account_a11y));
                                } else if (str4 != null && !ksp.n(str4)) {
                                    Object[] objArr5 = new Object[1];
                                    objArr5[i2] = str4;
                                    kptVar2.add(new jhh(R.string.og_ai_tier_label_format, objArr5));
                                } else if (a2 == 3) {
                                    kptVar2.add(new jhh(R.string.og_google_membership_a11y));
                                } else if (a2 == 2) {
                                    kptVar2.add(new jhh(R.string.og_google_one_account_a11y));
                                } else {
                                    kptVar2.add(new jhh(R.string.og_google_membership_a11y));
                                }
                            }
                            arrayList10.addAll(ixc.a(kptVar2));
                            if (dvlVar != null && j && (ijyVar = dvlVar.c) != null && (str = ijyVar.b) != null) {
                                if (true == ksp.n(str)) {
                                    str = null;
                                }
                                if (str != null) {
                                    jhiVar = new jhi(new jhq(new jhh(str), jhb.b, 3, (Integer) 1, 16));
                                    arrayList = arrayList10;
                                    jhnVar3 = jhnVar;
                                    jfsVar = new jfs(jgg.a(ehrVar7.h(1, jfrVar2, null, j), jhnVar.b, null, 125), i14 == 0 ? 1 : 3, jhnVar.e, arrayList10, jhiVar);
                                }
                            }
                            jhiVar = null;
                            arrayList = arrayList10;
                            jhnVar3 = jhnVar;
                            jfsVar = new jfs(jgg.a(ehrVar7.h(1, jfrVar2, null, j), jhnVar.b, null, 125), i14 == 0 ? 1 : 3, jhnVar.e, arrayList10, jhiVar);
                        }
                    } else {
                        ehvVar2 = ehvVar3;
                        duiVar = duiVar2;
                        arrayList = arrayList10;
                        ehrVar = ehrVar3;
                        jhnVar2 = jhnVar5;
                        jfsVar = null;
                        jhnVar3 = null;
                    }
                    if (!l.isEmpty() && jiaVar.a.isEmpty() && jfsVar == null) {
                        jfvVar = null;
                    } else {
                        if (jhnVar3 != null) {
                            jgsVar = jgx.a;
                        } else if (i14 == 0) {
                            jgsVar = jgz.a;
                        } else {
                            jgsVar = i11 != false ? new jgs(new jhh(R.string.og_account_list_expanded_a11y), 3) : new jgs(new jhh(R.string.og_account_list_collapsed_a11y), 2);
                            if (jgsVar instanceof jgs) {
                                arrayList.add(((jgs) jgsVar).a);
                                arrayList.add(i11 != false ? new jhh(R.string.og_collapse_account_list_a11y) : new jhh(R.string.og_expand_account_list_a11y));
                            }
                            jfvVar = new jfv(l, jgsVar, jfsVar != null ? new jfs(jfsVar.a, jfsVar.e, jfsVar.b, ixc.p(arrayList), jfsVar.d) : new jfu(new jhq(new jhh(R.string.og_switch_account), jhb.b, 2, (Integer) 1, ixc.b(i11 != false ? new jhh(R.string.og_collapse_account_list_a11y) : new jhh(R.string.og_expand_account_list_a11y)))), jiaVar);
                        }
                        if (jgsVar instanceof jgs) {
                        }
                        if (jfsVar != null) {
                        }
                        jfvVar = new jfv(l, jgsVar, jfsVar != null ? new jfs(jfsVar.a, jfsVar.e, jfsVar.b, ixc.p(arrayList), jfsVar.d) : new jfu(new jhq(new jhh(R.string.og_switch_account), jhb.b, 2, (Integer) 1, ixc.b(i11 != false ? new jhh(R.string.og_collapse_account_list_a11y) : new jhh(R.string.og_expand_account_list_a11y)))), jiaVar);
                    }
                    List list10 = !h ? kpk.a : dvtVar2.a;
                    kptVar = new kpt(10);
                    if (jhyVar != null) {
                        kptVar.add(jhyVar);
                    }
                    jhyVar2 = dweVar2.g;
                    if (jhyVar2 != null) {
                        kptVar.add(jhyVar2);
                    }
                    if (h) {
                        kptVar.addAll(dvtVar2.a);
                    }
                    if (dvlVar != null && (ebaVar = dvlVar.b) != null) {
                        kptVar.add(ebaVar.a);
                    }
                    kptVar.addAll(dvtVar2.b);
                    jhxVar = new jhw(jhnVar2, jfvVar, list10, ixc.a(kptVar));
                    dtjVar2 = dtjVar;
                    ehvVar3 = ehvVar2;
                }
                ehvVar2 = ehvVar3;
                duiVar = duiVar2;
                arrayList = arrayList10;
                ehrVar = ehrVar3;
                jhnVar2 = jhnVar5;
                jhnVar3 = jhnVar;
                jfsVar = null;
                if (!l.isEmpty()) {
                }
                if (jhnVar3 != null) {
                }
                if (jgsVar instanceof jgs) {
                }
                if (jfsVar != null) {
                }
                jfvVar = new jfv(l, jgsVar, jfsVar != null ? new jfs(jfsVar.a, jfsVar.e, jfsVar.b, ixc.p(arrayList), jfsVar.d) : new jfu(new jhq(new jhh(R.string.og_switch_account), jhb.b, 2, (Integer) 1, ixc.b(i11 != false ? new jhh(R.string.og_collapse_account_list_a11y) : new jhh(R.string.og_expand_account_list_a11y)))), jiaVar);
                if (!h) {
                }
                kptVar = new kpt(10);
                if (jhyVar != null) {
                }
                jhyVar2 = dweVar2.g;
                if (jhyVar2 != null) {
                }
                if (h) {
                }
                if (dvlVar != null) {
                    kptVar.add(ebaVar.a);
                }
                kptVar.addAll(dvtVar2.b);
                jhxVar = new jhw(jhnVar2, jfvVar, list10, ixc.a(kptVar));
                dtjVar2 = dtjVar;
                ehvVar3 = ehvVar2;
            } else {
                duiVar = duiVar2;
                ehrVar = ehrVar3;
                if (ehvVar3 instanceof ehu) {
                    dtjVar2 = dtjVar;
                    jgnVar = dtjVar2.k.a;
                    jgnVar.getClass();
                } else {
                    dtjVar2 = dtjVar;
                    jgnVar = dtjVar2.k.b;
                }
                jhxVar = new jhx(jgnVar);
            }
            jgf jgfVar = jhxVar;
            if (ehvVar3.e()) {
                jfrVar2.getClass();
                ehrVar2 = ehrVar;
                int g2 = dja.g(ehrVar2, jfrVar2) - 1;
                if (g2 == 0) {
                    i5 = 2;
                    if (ehrVar2 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    i6 = jhnVar != null ? i2 : 1;
                    jho a3 = jfrVar2.a(ehrVar2.a);
                    int a4 = a3 != null ? a3.a() : i2;
                    boolean a5 = a4 != 0 ? ili.a(a4) : ehrVar2.d;
                    ArrayList arrayList11 = new ArrayList();
                    Object[] objArr6 = new Object[1];
                    objArr6[i2] = ehrVar2.e();
                    arrayList11.add(new jhh(R.string.og_signed_in_as_account, objArr6));
                    if (a5) {
                        if (j) {
                            arrayList11.add(new jhh(R.string.og_google_membership_a11y));
                        } else {
                            arrayList11.add(new jhh(R.string.og_google_one_account_a11y));
                        }
                    }
                    jhqVar = new jhq(new jhh(ehrVar2.e()), jhb.b, 2, (Integer) 1, (List) arrayList11);
                } else if (g2 != 1) {
                    i6 = jhnVar != null ? i2 : 1;
                    jhqVar2 = new jhq(new jhh(R.string.og_choose_an_account_title), jhb.b, 1, (Integer) 2, 16);
                    i5 = 2;
                    jgvVar = new jhr(jhqVar2);
                    jgiVar = null;
                } else {
                    i6 = jhnVar != null ? i2 : 1;
                    i5 = 2;
                    jhqVar = new jhq(new jhh(R.string.og_bento_unicorn_account_header_title), jhb.c, 5, (Integer) 2, 16);
                }
                jhqVar2 = jhqVar;
                jgvVar = new jhr(jhqVar2);
                jgiVar = null;
            } else {
                ehrVar2 = ehrVar;
                i5 = 2;
                int i15 = jhnVar != null ? i2 : 1;
                jgiVar = null;
                jgvVar = new jgv(new jha(13, null));
                i6 = i15;
            }
            jit jitVar4 = 1 != i6 ? jhnVar.a : jgiVar;
            gjl gjlVar3 = duiVar.d;
            jfx jfxVar = new jfx(jitVar4, new jhh(R.string.og_privacy_policy), new jhh(R.string.og_terms_of_service));
            if (list8.isEmpty()) {
                jhkVar = jgiVar;
            } else {
                String str5 = (String) duqVar.d().e();
                if (str5 != null) {
                    Object[] objArr7 = new Object[1];
                    objArr7[i2] = str5;
                    jhhVar = new jhh(R.string.og_bento_more_from_product, objArr7);
                } else {
                    jhhVar = new jhh(R.string.og_bento_more_from_product_fallback);
                }
                jhkVar = new jhk(jhhVar, list8);
            }
            boolean z7 = z2;
            if (true != z7) {
                ehrVar2 = jgiVar;
            }
            jhuVar2.getClass();
            jfrVar2.getClass();
            jit jitVar5 = ehrVar2 != null ? ehrVar2.a : jgiVar;
            if (ehrVar2 != null) {
                jgiVar = ehrVar2.b(jfrVar2, j);
            }
            jhu jhuVar4 = jhuVar2;
            jge a6 = jge.a(new jge(jitVar5, jgiVar, jhuVar4.a, i2), z5, 7);
            dsf dsfVar = (dsf) gjlVar3.c;
            Context context = dsfVar.a;
            context.getClass();
            int i16 = !dja.E(context) ? 1 : dsfVar.e.q == 1 ? 3 : i5;
            if (z7) {
                c = ((eht) ehvVar3).a != null ? new jhh(R.string.og_account_and_settings) : ehvVar3.e() ? new jhh(R.string.og_choose_an_account_title) : new jhh(R.string.og_account_particle_disc_no_accounts_available_a11y);
            } else {
                if (!(ehvVar3 instanceof ehu)) {
                    throw new koj();
                }
                c = ((dwy) dtjVar2.j.b()).c();
            }
            dtjVar2.m.d(new jgb(jgfVar, jgvVar, jfxVar, jhkVar, a6, i16, c, jhuVar4.c));
        }
    }
}
