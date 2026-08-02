package defpackage;

import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fua implements htr {
    public final List a;
    public final int b;
    public final Executor c;
    private final gzr e;
    public int d = -1;
    private final htr f = gvx.c(this);

    public fua(List list, gzr gzrVar, Executor executor) {
        this.a = list;
        this.b = list.size();
        this.e = gzrVar;
        this.c = executor;
    }

    @Override // defpackage.htr
    public final hvi a(Object obj) {
        return this.e.a(obj) ? hnu.aJ(obj) : b();
    }

    public final hvi b() {
        int i = this.d + 1;
        this.d = i;
        return i < this.b ? hti.g((hvi) this.a.get(i), this.f, this.c) : hnu.aJ(null);
    }
}
