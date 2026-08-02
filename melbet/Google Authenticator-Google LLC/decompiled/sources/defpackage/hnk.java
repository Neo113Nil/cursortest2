package defpackage;

import android.util.Log;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hnk extends hmx {
    public static final Set a;
    public static final hmh b;
    public static final hni c;
    private final String d;
    private final Level e;
    private final Set f;
    private final hmh g;
    private final int h;

    static {
        Set unmodifiableSet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(hkl.a, hlo.a, hlp.a)));
        a = unmodifiableSet;
        hmh a2 = hmk.a(unmodifiableSet);
        b = a2;
        c = new hni(2, Level.ALL, false, unmodifiableSet, a2);
    }

    public hnk(String str, int i, Level level, Set set, hmh hmhVar) {
        super(str);
        this.d = hnu.e(str);
        this.h = 2;
        this.e = level;
        this.f = set;
        this.g = hmhVar;
    }

    public static void e(hlu hluVar, String str, int i, Level level, Set set, hmh hmhVar) {
        String sb;
        Boolean bool = (Boolean) hluVar.k().d(hlp.a);
        if (bool == null || !bool.booleanValue()) {
            hmr g = hmr.g(hmu.f(), hluVar.k());
            boolean z = hluVar.o().intValue() < level.intValue();
            if (z || hmv.b(hluVar, g, set)) {
                StringBuilder sb2 = new StringBuilder();
                if (hoq.c(2, hluVar.f(), sb2)) {
                    sb2.append(" ");
                }
                if (!z || hluVar.l() == null) {
                    hoi.e(hluVar, sb2);
                    hmv.c(g, hmhVar, sb2);
                } else {
                    sb2.append("(REDACTED) ");
                    sb2.append(hluVar.l().b);
                }
                sb = sb2.toString();
            } else {
                sb = hmv.a(hluVar);
            }
            Throwable th = (Throwable) hluVar.k().d(hkl.a);
            int d = hnu.d(hluVar.o());
            if (d == 2 || d == 3 || d == 4) {
                return;
            }
            if (d != 5) {
                Log.e(str, sb, th);
            } else {
                Log.w(str, sb, th);
            }
        }
    }

    @Override // defpackage.hlw
    public final void b(hlu hluVar) {
        e(hluVar, this.d, 2, this.e, this.f, this.g);
    }

    @Override // defpackage.hlw
    public final boolean c(Level level) {
        String str = this.d;
        int d = hnu.d(level);
        return Log.isLoggable(str, d) || Log.isLoggable("all", d);
    }
}
