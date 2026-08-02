package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auj extends yp {
    private static final String g = asq.b("WorkContinuationImpl");
    public final auy a;
    public final String b;
    public final List c;
    public final List d;
    public boolean e;
    public final int f;
    private final List h = new ArrayList();
    private asv i;

    public auj(auy auyVar, String str, int i, List list) {
        this.a = auyVar;
        this.b = str;
        this.f = i;
        this.c = list;
        this.d = new ArrayList(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (i == 1 && ((axt) ((bvw) list.get(i2)).b).u != Long.MAX_VALUE) {
                throw new IllegalArgumentException("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
            }
            String j = ((bvw) list.get(i2)).j();
            this.d.add(j);
            this.h.add(j);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final asv g() {
        if (this.e) {
            asq.a().e(g, "Already enqueued work ids (" + TextUtils.join(", ", this.d) + ")");
        } else {
            auy auyVar = this.a;
            this.i = yo.f(auyVar.c.m, "EnqueueRunnable_".concat(this.f != 1 ? "KEEP" : "REPLACE"), auyVar.k.e, new nb(this, 13));
        }
        return this.i;
    }
}
