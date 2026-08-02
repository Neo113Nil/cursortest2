package defpackage;

import java.util.Random;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class erx {
    static final ery a = new erv(lgc.a, true);
    private final Random b;
    private final hsl c;
    private final erh d;

    public erx(Random random) {
        this.b = random;
        this.d = null;
        this.c = null;
    }

    public final ery a(lgc lgcVar) {
        hsl hslVar;
        int H = a.H(lgcVar.e);
        if (H == 0) {
            H = 1;
        }
        int i = H - 1;
        if (i == 1) {
            eru b = eru.b(lgcVar);
            return new erv(lgcVar, b.c == b.a());
        }
        if (i == 3) {
            return new erv(lgcVar, eru.b(lgcVar).c(this.b));
        }
        if (i == 4) {
            erh erhVar = this.d;
            return (erhVar == null || (hslVar = this.c) == null) ? a : new erw(lgcVar, eru.b(lgcVar), this.b, erhVar, hslVar);
        }
        if (i == 5) {
            lgcVar = lgc.a;
        }
        return new erv(lgcVar, true);
    }

    public erx(Random random, erh erhVar, hsl hslVar) {
        this.b = random;
        this.c = hslVar;
        this.d = erhVar;
    }
}
