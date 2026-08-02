package defpackage;

import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hmv {
    public static final hlv a;
    private static final Set b;

    static {
        Set singleton = Collections.singleton(hkl.a);
        b = singleton;
        a = new hlv(singleton);
    }

    public static String a(hlu hluVar) {
        return hly.b(hluVar.m());
    }

    public static boolean b(hlu hluVar, hmr hmrVar, Set set) {
        return (hluVar.l() == null && hmrVar.a() <= set.size() && set.containsAll(hmrVar.c())) ? false : true;
    }

    public static void c(hmr hmrVar, hmh hmhVar, StringBuilder sb) {
        hlt hltVar = new hlt(sb);
        hmrVar.d(hmhVar, hltVar);
        if (hltVar.c) {
            hltVar.b.append(hltVar.a);
        }
    }
}
