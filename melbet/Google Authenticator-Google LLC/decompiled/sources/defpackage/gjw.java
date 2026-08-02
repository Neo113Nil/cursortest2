package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gjw {
    public static final iwq m;
    public final Context a;
    public final ExecutorService b;
    public final hvm c;
    public final int d;
    public final Map e;
    public final koe f;
    public final koe g;
    public final hkh h;
    public final boolean i;
    public final Map j;
    public final cka k;
    public final fwm l;
    private final Map n;
    private final jpt o;
    private final koe p;

    static {
        fdp fdpVar = new fdp();
        fdpVar.a("CREATE TABLE ListenerSuccessfulRuns (listener_key, version_code INTEGER NOT NULL);");
        fdpVar.a("CREATE TABLE AllListenersSucceededVersionTable (version_code INTEGER PRIMARY KEY ON CONFLICT REPLACE);");
        m = fdpVar.b();
    }

    public gjw(Context context, fwm fwmVar, gzp gzpVar, ExecutorService executorService, hvm hvmVar, cka ckaVar, int i, Map map, Map map2, koe koeVar, koe koeVar2, jpt jptVar, koe koeVar3) {
        gzpVar.getClass();
        executorService.getClass();
        hvmVar.getClass();
        map.getClass();
        map2.getClass();
        koeVar.getClass();
        koeVar2.getClass();
        jptVar.getClass();
        koeVar3.getClass();
        this.a = context;
        this.l = fwmVar;
        this.b = executorService;
        this.c = hvmVar;
        this.k = ckaVar;
        this.d = i;
        this.n = map;
        this.e = map2;
        this.f = koeVar;
        this.g = koeVar2;
        this.o = jptVar;
        this.p = koeVar3;
        if (!ixc.r(map.keySet(), map2.keySet()).isEmpty()) {
            Set r = ixc.r(map.keySet(), map2.keySet());
            Objects.toString(r);
            throw new IllegalStateException("Don't provide both an unannotated and @AllProcessesStartupAfterPackageReplacedListener StartupAfterPackageReplacedListener provider for keys ".concat(r.toString()));
        }
        this.h = hkh.l("com/google/apps/tiktok/inject/StartupAfterPackageReplacedWithRetryRunner");
        this.i = ((Boolean) gzpVar.d(false)).booleanValue();
        this.j = fwmVar.l() ? ixd.q(map, map2) : map2;
    }

    public final File a() {
        String str;
        Object b = this.p.b();
        b.getClass();
        ApplicationInfo applicationInfo = ((PackageInfo) b).applicationInfo;
        if (applicationInfo == null || (str = applicationInfo.dataDir) == null) {
            return null;
        }
        File file = new File(new File(str, "files"), "tiktok");
        if (!file.exists()) {
            file.mkdirs();
        }
        fwm fwmVar = this.l;
        String I = eos.I();
        return new File(file, (fwmVar.l() || I == null) ? "878177909" : "878177909_".concat(new kud("[^A-Za-z0-9\\-_:]").a(I, "_")));
    }

    public final hvi b(String str) {
        Set b = ((jsd) this.g).b();
        b.getClass();
        ArrayList arrayList = new ArrayList(ixc.w(b));
        Iterator it = b.iterator();
        while (it.hasNext()) {
            arrayList.add(hoq.as(gvx.b(new gib((gka) it.next(), str, 7, null)), this.c));
        }
        return hoq.aU(arrayList).s(new bws(10), this.b);
    }

    public final bst c() {
        Object b = this.o.b();
        b.getClass();
        return (bst) b;
    }
}
