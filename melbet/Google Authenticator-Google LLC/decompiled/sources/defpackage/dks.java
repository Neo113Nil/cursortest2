package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dks {
    public static final dja e = new dja();
    public int a = -1;
    public dla b;
    public final jkl c;
    public final cka d;
    private final dja f;

    public dks(jkl jklVar, dja djaVar, cka ckaVar) {
        this.c = jklVar;
        this.f = djaVar;
        this.d = ckaVar;
    }

    public final dkx a() {
        return (dkx) this.c.q();
    }

    final void b(dks dksVar) {
        hoq.H(dksVar.b == null);
        hoq.H(!c());
        hoq.H(this.f == dksVar.f);
        boolean z = this.b.c;
        if (z) {
            this.d.e(this);
        }
        jkl jklVar = this.c;
        if (jklVar.a.M()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        jklVar.b = jklVar.p();
        jklVar.w((dkx) dksVar.c.q());
        if (z) {
            this.d.d(this);
        }
    }

    public final boolean c() {
        hre hreVar = ((dkx) this.c.b).d;
        if (hreVar == null) {
            hreVar = hre.a;
        }
        return (hreVar.b & 8) != 0;
    }

    public final boolean d() {
        hre hreVar = ((dkx) this.c.b).d;
        if (hreVar == null) {
            hreVar = hre.a;
        }
        return (hreVar.b & 2048) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        if (r4.contains(java.lang.Integer.valueOf(r5.d)) != false) goto L20;
     */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e() {
        ?? r0 = this.d.a;
        if (!r0.isEmpty()) {
            Iterator it = r0.iterator();
            while (it.hasNext()) {
                Object obj = ((kee) it.next()).a;
                long c = dih.c();
                if (c != -1) {
                    jkl jklVar = this.c;
                    long j = c * 1000;
                    if (!jklVar.b.M()) {
                        jklVar.t();
                    }
                    dkx dkxVar = (dkx) jklVar.b;
                    dkx dkxVar2 = dkx.a;
                    dkxVar.b |= 4;
                    dkxVar.f = j;
                }
                dlk dlkVar = (dlk) obj;
                dln dlnVar = dlkVar.c;
                if (!dlnVar.f) {
                    Set set = dlnVar.g;
                    hre hreVar = a().d;
                    if (hreVar == null) {
                        hreVar = hre.a;
                    }
                }
                Map map = dlnVar.d;
                Collection collection = (Collection) map.remove(this);
                if (collection != null) {
                    collection.clear();
                    dlnVar.e = collection;
                }
                if (d()) {
                    dks c2 = this.b.c();
                    if (this.b.h() || (c2 != null && c2.d())) {
                        Collection collection2 = (Collection) map.get(c2);
                        if (collection2 != null) {
                            collection2.add(a());
                        } else {
                            Collection collection3 = dlnVar.e;
                            if (collection3 != null) {
                                dlnVar.e = null;
                            } else {
                                collection3 = new ArrayList();
                            }
                            collection3.add(a());
                            map.put(c2, collection3);
                        }
                    }
                }
                dlnVar.a.remove(this);
                dlnVar.b.remove(this);
                if (!dlnVar.d.isEmpty()) {
                    dlkVar.b();
                }
            }
        }
        jkl jklVar2 = this.c;
        hre hreVar2 = ((dkx) jklVar2.b).d;
        if (hreVar2 == null) {
            hreVar2 = hre.a;
        }
        jkj C = hreVar2.C();
        if (!C.b.M()) {
            C.t();
        }
        jkp jkpVar = C.b;
        hre hreVar3 = (hre) jkpVar;
        hreVar3.e = null;
        hreVar3.b &= -2049;
        if (!jkpVar.M()) {
            C.t();
        }
        hre hreVar4 = (hre) C.b;
        hreVar4.b &= -2;
        hreVar4.c = -1;
        hre hreVar5 = (hre) C.q();
        if (!jklVar2.b.M()) {
            jklVar2.t();
        }
        dkx dkxVar3 = (dkx) jklVar2.b;
        hreVar5.getClass();
        dkxVar3.d = hreVar5;
        dkxVar3.b |= 1;
    }

    public final int f() {
        return this.b.k();
    }

    public final String toString() {
        dla dlaVar = this.b;
        String concat = dlaVar != null ? ".".concat(String.valueOf(dlaVar.getClass().getSimpleName())) : "";
        hre hreVar = ((dkx) this.c.b).d;
        if (hreVar == null) {
            hreVar = hre.a;
        }
        return "CVE" + concat + "#" + hreVar.d + " [" + Integer.toHexString(hashCode()) + "]";
    }
}
