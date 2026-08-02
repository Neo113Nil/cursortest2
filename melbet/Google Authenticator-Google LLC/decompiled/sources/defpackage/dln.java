package defpackage;

import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dln {
    public final Set a = new LinkedHashSet();
    public final Set b = new LinkedHashSet();
    private final Map i = new HashMap();
    public final List c = new ArrayList();
    private final List j = new ArrayList();
    public final Map d = new HashMap();
    public Collection e = null;
    public boolean f = true;
    public Set g = hjb.a;
    public boolean h = false;

    private final dlm e(dks dksVar) {
        List list = this.c;
        dlm dlmVar = new dlm(list.size(), this.a.size(), true);
        dkx a = dlmVar.a(dksVar, -1);
        ArrayList arrayList = new ArrayList(1);
        dih.h(dksVar, arrayList);
        hre hreVar = a.d;
        if (hreVar == null) {
            hreVar = hre.a;
        }
        dlmVar.b(new dlw(1, arrayList, hreVar.c));
        list.add(dlmVar);
        this.i.put(a, dlmVar);
        return dlmVar;
    }

    private final dlm f(List list, int i) {
        dkx dkxVar = (dkx) hnu.V(list);
        Map map = this.i;
        dlm dlmVar = (dlm) map.get(dkxVar);
        if (dlmVar != null) {
            return dlmVar;
        }
        List list2 = this.c;
        dlm dlmVar2 = new dlm(list2.size(), i, false);
        list2.add(dlmVar2);
        map.put(dkxVar, dlmVar2);
        return dlmVar2;
    }

    private final dlm g(dks dksVar) {
        String sb;
        int i = dksVar.a;
        if (i != -1) {
            if (i != -2) {
                return (dlm) this.c.get(i);
            }
        } else {
            if (!dksVar.c()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(dksVar);
                sb2.append(" has no VE id, it may need to be re-instrumented if it has been reset.");
                dla dlaVar = dksVar.b;
                if (dlaVar instanceof dla) {
                    sb2.append("\n\tError occurred on CVE with associated View of type: ");
                    sb2.append(dla.a(dksVar).getClass().getSimpleName());
                } else {
                    sb2.append("\n\tError occurred on SyntheticNode");
                }
                dks c = dlaVar.c();
                if (c != null) {
                    sb2.append("\n\t\tAncestry (leaf -> root):");
                }
                while (true) {
                    if (c != null) {
                        dla dlaVar2 = c.b;
                        if (dlaVar2 == null) {
                            sb2.append("\n\t\t\t<Found CVE with no Node attached. Ending traversal.>");
                            sb = sb2.toString();
                            break;
                        }
                        sb2.append("\n\t\t\tView of type: ");
                        sb2.append(dla.a(c).getClass().getSimpleName());
                        c = dlaVar2.c();
                    } else {
                        sb = sb2.toString();
                        break;
                    }
                }
                throw new IllegalStateException(sb);
            }
            this.j.add(dksVar);
            dla dlaVar3 = dksVar.b;
            if (dlaVar3.h()) {
                return e(dksVar);
            }
            dks c2 = dlaVar3.c();
            if (c2 == null) {
                dkx a = dksVar.a();
                iwq iwqVar = dmc.a;
                a.g(iwqVar);
                if (a.l.l((jko) iwqVar.c)) {
                    return e(dksVar);
                }
                View a2 = dla.a(dksVar);
                while (true) {
                    if (a2 != null) {
                        if (!dla.i(a2)) {
                            Object parent = a2.getParent();
                            if (!(parent instanceof View)) {
                                break;
                            }
                            a2 = (View) parent;
                        } else {
                            Log.e("GIL", a.aj(dksVar, "Unexpected visual element (", ") without parent detected. All visual elements except the root view must have a parent visual element. See also: go/gil-android/instrumentation#requirements."));
                            break;
                        }
                    } else {
                        break;
                    }
                }
                dksVar.a = -2;
                return null;
            }
            if (c2.a == -1 && c2.d()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(null);
                dih.h(c2, arrayList);
                hoq.H(arrayList.size() > 1);
                dlm f = f(arrayList, this.a.size());
                dkx a3 = f.a(dksVar, -1);
                arrayList.set(0, a3);
                hre hreVar = a3.d;
                if (hreVar == null) {
                    hreVar = hre.a;
                }
                f.b(new dlw(1, arrayList, hreVar.c));
                return f;
            }
            dlm g = g(c2);
            if (g != null) {
                hre hreVar2 = ((dkx) c2.c.b).d;
                if (hreVar2 == null) {
                    hreVar2 = hre.a;
                }
                g.a(dksVar, hreVar2.c);
                return g;
            }
        }
        return null;
    }

    public final List a() {
        gty aC = hoq.aC(56, "GIL:LogBatch");
        try {
            List<dlm> list = this.c;
            ArrayList arrayList = new ArrayList(list.size());
            for (dlm dlmVar : list) {
                hrf hrfVar = dlmVar.a;
                arrayList.add(new dlx(dlmVar.b, dlmVar.c, dlmVar.d, dlmVar.e, dlmVar.f));
            }
            list.clear();
            this.i.clear();
            aC.close();
            return arrayList;
        } finally {
        }
    }

    public final void b() {
        gty aC = hoq.aC(57, "GIL:CreateInsertGrafts");
        try {
            Set<dks> set = this.a;
            for (dks dksVar : set) {
                if (dksVar.a == -1) {
                    g(dksVar);
                }
            }
            set.clear();
            List list = this.j;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((dks) it.next()).a = -1;
            }
            list.clear();
            aC.close();
            gty aC2 = hoq.aC(58, "GIL:CreateVisibilityGrafts");
            try {
                Set<dks> set2 = this.b;
                for (dks dksVar2 : set2) {
                    hoq.K(dksVar2.d(), "Not impressed: %s", dksVar2);
                    int f = dksVar2.f();
                    jkl jklVar = dksVar2.c;
                    int i = ((dkx) jklVar.b).e;
                    int A = a.A(i);
                    if (A == 0) {
                        A = 1;
                    }
                    if (A != f) {
                        int A2 = a.A(i);
                        if (A2 == 0) {
                            A2 = 1;
                        }
                        int i2 = A2 - 1;
                        if (i2 == 2 || i2 == 4) {
                            if (f != 2) {
                                hoq.I(false, "Repressed VE was visible.");
                                f = 1;
                            }
                        }
                        if (!jklVar.b.M()) {
                            jklVar.t();
                        }
                        dkx dkxVar = (dkx) jklVar.b;
                        dkxVar.e = f - 1;
                        dkxVar.b |= 2;
                        List arrayList = new ArrayList();
                        dih.h(dksVar2, arrayList);
                        dlm f2 = f(arrayList, 0);
                        int A3 = a.A(((dkx) arrayList.get(0)).e);
                        if (A3 != 0 && A3 != 1) {
                            f2.b(new dlw(3, arrayList, -1));
                        }
                        f2.b(new dlw(2, arrayList, f2.e.size()));
                        dll dllVar = new dll(f2);
                        hre hreVar = ((dkx) jklVar.b).d;
                        if (hreVar == null) {
                            hreVar = hre.a;
                        }
                        hrf hrfVar = hreVar.e;
                        if (hrfVar == null) {
                            hrfVar = hrf.a;
                        }
                        if ((hrfVar.b & 2) != 0) {
                            dllVar.b(dksVar2);
                        }
                    }
                }
                set2.clear();
                aC2.close();
                Map map = this.d;
                if (map.isEmpty()) {
                    return;
                }
                aC2 = hoq.aC(59, "GIL:CreateRemoveGrafts");
                try {
                    for (Map.Entry entry : map.entrySet()) {
                        Collection<dkx> collection = (Collection) entry.getValue();
                        for (dkx dkxVar2 : collection) {
                            dks dksVar3 = (dks) entry.getKey();
                            int A4 = a.A(dkxVar2.e);
                            if (A4 == 0) {
                                A4 = 1;
                            }
                            if (A4 == 1) {
                                ArrayList arrayList2 = new ArrayList();
                                jkl jklVar2 = (jkl) dkxVar2.C();
                                if (!jklVar2.b.M()) {
                                    jklVar2.t();
                                }
                                dkx dkxVar3 = (dkx) jklVar2.b;
                                dkxVar3.e = 1;
                                dkxVar3.b |= 2;
                                arrayList2.add((dkx) jklVar2.q());
                                if (dksVar3 != null) {
                                    dih.h(dksVar3, arrayList2);
                                }
                                f(arrayList2, 0).b(new dlw(3, arrayList2, -1));
                            }
                        }
                        collection.clear();
                        this.e = collection;
                    }
                    aC2.close();
                    this.d.clear();
                } catch (Throwable th) {
                    throw th;
                }
            } finally {
                try {
                    aC2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
        } catch (Throwable th3) {
            try {
                aC.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public final boolean c() {
        return (this.c.isEmpty() && this.a.isEmpty() && this.b.isEmpty() && this.d.isEmpty()) ? false : true;
    }

    public final boolean d(dks dksVar, int i) {
        if (this.a.contains(dksVar)) {
            return false;
        }
        int A = a.A(((dkx) dksVar.c.b).e);
        if (A == 0) {
            A = 1;
        }
        Set set = this.b;
        if (A == i) {
            set.remove(dksVar);
            return false;
        }
        set.add(dksVar);
        return true;
    }
}
