package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ign {
    public static final igm a;
    private static final hrg b;
    private final ihf c;

    static {
        jkj k = hrg.a.k();
        if (!k.b.M()) {
            k.t();
        }
        jkp jkpVar = k.b;
        hrg hrgVar = (hrg) jkpVar;
        hrgVar.b |= 1;
        hrgVar.c = 0L;
        if (!jkpVar.M()) {
            k.t();
        }
        jkp jkpVar2 = k.b;
        hrg hrgVar2 = (hrg) jkpVar2;
        hrgVar2.b |= 2;
        hrgVar2.d = 0;
        if (!jkpVar2.M()) {
            k.t();
        }
        hrg hrgVar3 = (hrg) k.b;
        hrgVar3.b |= 4;
        hrgVar3.e = 0;
        b = (hrg) k.q();
        a = igm.a().a();
    }

    public ign(String str, String str2) {
        jkj k = ihh.a.k();
        if (!k.b.M()) {
            k.t();
        }
        jkp jkpVar = k.b;
        ihh ihhVar = (ihh) jkpVar;
        str.getClass();
        ihhVar.b |= 1;
        ihhVar.c = str;
        if (str2 != null) {
            if (!jkpVar.M()) {
                k.t();
            }
            ihh ihhVar2 = (ihh) k.b;
            ihhVar2.b |= 2;
            ihhVar2.d = str2;
        }
        jkj k2 = ihf.a.k();
        if (!k2.b.M()) {
            k2.t();
        }
        ihf ihfVar = (ihf) k2.b;
        ihh ihhVar3 = (ihh) k.q();
        ihhVar3.getClass();
        ihfVar.c = ihhVar3;
        ihfVar.b |= 1;
        jkj k3 = ihk.a.k();
        if (!k3.b.M()) {
            k3.t();
        }
        ihk ihkVar = (ihk) k3.b;
        ihkVar.c = 0;
        ihkVar.b |= 1;
        if (!k2.b.M()) {
            k2.t();
        }
        ihf ihfVar2 = (ihf) k2.b;
        ihk ihkVar2 = (ihk) k3.q();
        ihkVar2.getClass();
        ihfVar2.d = ihkVar2;
        ihfVar2.b |= 2;
        this.c = (ihf) k2.q();
    }

    public static Object a(hlu hluVar, hky hkyVar) {
        return hluVar.k().d(hkyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0183  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final jkj c(hrh hrhVar, int i, igm igmVar, Object... objArr) {
        jkj k;
        jkx jkxVar;
        jkj k2 = ihj.a.k();
        if (!k2.b.M()) {
            k2.t();
        }
        jkp jkpVar = k2.b;
        ihj ihjVar = (ihj) jkpVar;
        ihjVar.c = i - 1;
        ihjVar.b |= 1;
        ihf ihfVar = this.c;
        if (!jkpVar.M()) {
            k2.t();
        }
        jkp jkpVar2 = k2.b;
        ihj ihjVar2 = (ihj) jkpVar2;
        ihfVar.getClass();
        ihjVar2.f = ihfVar;
        ihjVar2.b |= 32;
        if (!jkpVar2.M()) {
            k2.t();
        }
        ihj ihjVar3 = (ihj) k2.b;
        hrhVar.getClass();
        ihjVar3.g = hrhVar;
        ihjVar3.b |= 64;
        if (i == 2) {
            if (igmVar.b) {
                jkj k3 = ihi.a.k();
                for (int i2 = 0; i2 < objArr.length; i2++) {
                    Object obj = objArr[i2];
                    gzp h = obj == null ? gzp.h("null") : obj instanceof ekl ? gzp.h(((ekl) obj).b()) : gyf.a;
                    if (h.f()) {
                        if (!k3.b.M()) {
                            k3.t();
                        }
                        ihi ihiVar = (ihi) k3.b;
                        jkt jktVar = ihiVar.b;
                        if (!jktVar.c()) {
                            ihiVar.b = jkp.y(jktVar);
                        }
                        ihiVar.b.g(i2);
                        Object b2 = h.b();
                        if (!k3.b.M()) {
                            k3.t();
                        }
                        ihi ihiVar2 = (ihi) k3.b;
                        jkx jkxVar2 = ihiVar2.c;
                        if (!jkxVar2.c()) {
                            ihiVar2.c = jkp.A(jkxVar2);
                        }
                        ihiVar2.c.add(b2);
                    }
                }
                if (((ihi) k3.b).b.size() > 0) {
                    ihi ihiVar3 = (ihi) k3.q();
                    if (!k2.b.M()) {
                        k2.t();
                    }
                    ihj ihjVar4 = (ihj) k2.b;
                    ihiVar3.getClass();
                    ihjVar4.j = ihiVar3;
                    ihjVar4.b |= 512;
                }
            }
            for (int i3 = 0; i3 < objArr.length; i3++) {
                Object obj2 = objArr[i3];
                if (obj2 != null) {
                    if (obj2 instanceof igk) {
                        if (((igk) obj2).a == igj.e) {
                        }
                        k = ihl.a.k();
                        if (!k.b.M()) {
                            k.t();
                        }
                        ihl ihlVar = (ihl) k.b;
                        ihlVar.b |= 1;
                        ihlVar.c = i3;
                        String obj3 = obj2.toString();
                        if (!k.b.M()) {
                            k.t();
                        }
                        ihl ihlVar2 = (ihl) k.b;
                        obj3.getClass();
                        ihlVar2.b |= 2;
                        ihlVar2.d = obj3;
                        ihl ihlVar3 = (ihl) k.q();
                        if (!k2.b.M()) {
                            k2.t();
                        }
                        ihj ihjVar5 = (ihj) k2.b;
                        ihlVar3.getClass();
                        jkxVar = ihjVar5.i;
                        if (!jkxVar.c()) {
                            ihjVar5.i = jkp.A(jkxVar);
                        }
                        ihjVar5.i.add(ihlVar3);
                    } else {
                        igo igoVar = (igo) obj2.getClass().getAnnotation(igo.class);
                        if (igoVar != null) {
                            if (igoVar.a() == igj.e) {
                            }
                            k = ihl.a.k();
                            if (!k.b.M()) {
                            }
                            ihl ihlVar4 = (ihl) k.b;
                            ihlVar4.b |= 1;
                            ihlVar4.c = i3;
                            String obj32 = obj2.toString();
                            if (!k.b.M()) {
                            }
                            ihl ihlVar22 = (ihl) k.b;
                            obj32.getClass();
                            ihlVar22.b |= 2;
                            ihlVar22.d = obj32;
                            ihl ihlVar32 = (ihl) k.q();
                            if (!k2.b.M()) {
                            }
                            ihj ihjVar52 = (ihj) k2.b;
                            ihlVar32.getClass();
                            jkxVar = ihjVar52.i;
                            if (!jkxVar.c()) {
                            }
                            ihjVar52.i.add(ihlVar32);
                        }
                    }
                }
            }
        }
        return k2;
    }

    public final jkj b(hlu hluVar, int i, igm igmVar) {
        String name;
        hrh hrhVar;
        lew lewVar;
        if (hluVar.k().d(ejx.a) != null) {
            jkj k = hrh.a.k();
            hrg hrgVar = b;
            if (!k.b.M()) {
                k.t();
            }
            hrh hrhVar2 = (hrh) k.b;
            hrgVar.getClass();
            hrhVar2.c = hrgVar;
            hrhVar2.b |= 1;
            int intValue = hluVar.o().intValue();
            if (!k.b.M()) {
                k.t();
            }
            hrh hrhVar3 = (hrh) k.b;
            hrhVar3.b |= 4;
            hrhVar3.e = intValue;
            String b2 = hluVar.f().b();
            if (!k.b.M()) {
                k.t();
            }
            hrh hrhVar4 = (hrh) k.b;
            b2.getClass();
            hrhVar4.b |= 8;
            hrhVar4.f = b2;
            String d = hluVar.f().d();
            if (!k.b.M()) {
                k.t();
            }
            hrh hrhVar5 = (hrh) k.b;
            d.getClass();
            hrhVar5.b |= 16;
            hrhVar5.g = d;
            int a2 = hluVar.f().a();
            if (!k.b.M()) {
                k.t();
            }
            hrh hrhVar6 = (hrh) k.b;
            hrhVar6.b |= 32;
            hrhVar6.h = a2;
            String e = hluVar.f().e();
            if (e != null) {
                if (!k.b.M()) {
                    k.t();
                }
                hrh hrhVar7 = (hrh) k.b;
                hrhVar7.b |= 64;
                hrhVar7.i = e;
            }
            String str = (String) hluVar.k().d(ejx.b);
            if (str != null) {
                if (!k.b.M()) {
                    k.t();
                }
                hrh hrhVar8 = (hrh) k.b;
                hrhVar8.b |= 2;
                hrhVar8.d = str;
            } else {
                if (!k.b.M()) {
                    k.t();
                }
                hrh hrhVar9 = (hrh) k.b;
                hrhVar9.b |= 2;
                hrhVar9.d = "Unknown native thread";
            }
            hmw l = hluVar.l();
            if (l != null) {
                if (!k.b.M()) {
                    k.t();
                }
                String str2 = l.b;
                hrh hrhVar10 = (hrh) k.b;
                hrhVar10.b |= 256;
                hrhVar10.j = str2;
            } else {
                String obj = hluVar.m().toString();
                if (!k.b.M()) {
                    k.t();
                }
                hrh hrhVar11 = (hrh) k.b;
                obj.getClass();
                hrhVar11.b |= 256;
                hrhVar11.j = obj;
            }
            hrhVar = (hrh) k.q();
        } else {
            hmw l2 = hluVar.l();
            if (l2 != null) {
                name = l2.b;
            } else {
                Object m = hluVar.m();
                name = m instanceof String ? (String) m : m != null ? m.getClass().getName() : "null";
            }
            Throwable th = i == 2 ? (Throwable) a(hluVar, hkl.a) : null;
            hkq f = hluVar.f();
            Level o = hluVar.o();
            String b3 = f.b();
            String d2 = f.d();
            int a3 = f.a();
            jkj k2 = hrh.a.k();
            hrg hrgVar2 = b;
            if (!k2.b.M()) {
                k2.t();
            }
            hrh hrhVar12 = (hrh) k2.b;
            hrgVar2.getClass();
            hrhVar12.c = hrgVar2;
            hrhVar12.b |= 1;
            String name2 = Thread.currentThread().getName();
            if (!k2.b.M()) {
                k2.t();
            }
            hrh hrhVar13 = (hrh) k2.b;
            name2.getClass();
            hrhVar13.b |= 2;
            hrhVar13.d = name2;
            int intValue2 = o.intValue();
            if (!k2.b.M()) {
                k2.t();
            }
            jkp jkpVar = k2.b;
            hrh hrhVar14 = (hrh) jkpVar;
            hrhVar14.b |= 4;
            hrhVar14.e = intValue2;
            if (!jkpVar.M()) {
                k2.t();
            }
            jkp jkpVar2 = k2.b;
            hrh hrhVar15 = (hrh) jkpVar2;
            b3.getClass();
            hrhVar15.b |= 8;
            hrhVar15.f = b3;
            if (!jkpVar2.M()) {
                k2.t();
            }
            jkp jkpVar3 = k2.b;
            hrh hrhVar16 = (hrh) jkpVar3;
            d2.getClass();
            hrhVar16.b |= 16;
            hrhVar16.g = d2;
            if (!jkpVar3.M()) {
                k2.t();
            }
            jkp jkpVar4 = k2.b;
            hrh hrhVar17 = (hrh) jkpVar4;
            hrhVar17.b |= 32;
            hrhVar17.h = a3;
            if (name != null) {
                if (!jkpVar4.M()) {
                    k2.t();
                }
                hrh hrhVar18 = (hrh) k2.b;
                hrhVar18.b |= 256;
                hrhVar18.j = name;
            }
            if (th != null) {
                jkj n = igmVar.c ? hoq.n(th, false) : hoq.p(th);
                if (!k2.b.M()) {
                    k2.t();
                }
                hrh hrhVar19 = (hrh) k2.b;
                hrm hrmVar = (hrm) n.q();
                hrmVar.getClass();
                hrhVar19.k = hrmVar;
                hrhVar19.b |= 1024;
            }
            hrhVar = (hrh) k2.q();
        }
        jkj c = hluVar.l() != null ? c(hrhVar, i, igmVar, hluVar.B()) : c(hrhVar, i, igmVar, new Object[0]);
        if (i == 2 && igmVar.a && (lewVar = (lew) a(hluVar, igp.b)) != null) {
            if (!c.b.M()) {
                c.t();
            }
            ihj ihjVar = (ihj) c.b;
            ihj ihjVar2 = ihj.a;
            ihjVar.e = lewVar;
            ihjVar.b |= 4;
        }
        return c;
    }
}
