package defpackage;

import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesManifestException;
import j$.util.Optional;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gid {
    public final koe a;
    public final Executor b;
    public final jpt c;
    public final int d;
    public final Set e;
    public final Map f;
    public final Optional g;
    public final ldt h;
    public final iwq i;
    public final kee j;
    private final jpt k;
    private final jpt l;
    private final jpt m;
    private final etd n;

    public gid(koe koeVar, iwq iwqVar, Executor executor, kee keeVar, jpt jptVar, int i, Set set, Map map, jpt jptVar2, jpt jptVar3, jpt jptVar4, ldt ldtVar, etd etdVar, Optional optional) {
        koeVar.getClass();
        executor.getClass();
        keeVar.getClass();
        jptVar.getClass();
        set.getClass();
        map.getClass();
        jptVar2.getClass();
        jptVar3.getClass();
        jptVar4.getClass();
        etdVar.getClass();
        optional.getClass();
        this.a = koeVar;
        this.i = iwqVar;
        this.b = executor;
        this.j = keeVar;
        this.c = jptVar;
        this.d = i;
        this.e = set;
        this.f = map;
        this.k = jptVar2;
        this.l = jptVar3;
        this.m = jptVar4;
        this.h = ldtVar;
        this.n = etdVar;
        this.g = optional;
    }

    public static final String[] d(Set set, iae iaeVar) {
        if (iaeVar == null) {
            return (String[]) set.toArray(new String[0]);
        }
        jkx jkxVar = iaeVar.i;
        jkxVar.getClass();
        return (String[]) ixc.p(new LinkedHashSet(ixd.l(set, jkxVar))).toArray(new String[0]);
    }

    public final hvi a(String str, iae iaeVar) {
        jjq jjqVar;
        htq htqVar = (htq) ((Map) this.k.b()).get(str);
        byte[] bArr = null;
        if (htqVar == null) {
            if (iaeVar != null && (jjqVar = iaeVar.k) != null) {
                bArr = jjqVar.x();
            }
            return hnu.aJ(bArr);
        }
        gty aB = hoq.aB(170, "Getting legacy params", gub.a, true);
        try {
            hvi as = hoq.as(htqVar, this.b);
            aB.b(as);
            ixf.j(aB, null);
            return as;
        } finally {
        }
    }

    public final hvi b() {
        return hoq.ao(this.n.f.d(false), cnf.class, new gia(new dvm(20), 2), huf.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
    
        if (((defpackage.ett) r5.a).b().a.p(12200000) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(String str, iae iaeVar) {
        boolean z = ((Map) this.k.b()).containsKey(str) || ((Map) this.l.b()).containsKey(str) || ((Map) this.m.b()).containsKey(str);
        try {
        } catch (GooglePlayServicesManifestException e) {
            Log.e("MendelPackageState", "Failed to check if declarative registration is supported", e);
        }
        if (iaeVar != null) {
            jkx jkxVar = iaeVar.i;
            jkxVar.getClass();
            if (hnu.ae(jkxVar).containsAll(this.e) && !z) {
                return true;
            }
        }
        return false;
    }
}
