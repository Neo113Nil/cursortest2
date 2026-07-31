package m2;

import java.util.List;
import t1.x0;

/* loaded from: classes.dex */
public final class u extends c {

    /* renamed from: h, reason: collision with root package name */
    private final int f19078h;

    /* renamed from: i, reason: collision with root package name */
    private final Object f19079i;

    public u(x0 x0Var, int i7, int i8) {
        this(x0Var, i7, i8, 0, null);
    }

    public u(x0 x0Var, int i7, int i8, int i9, Object obj) {
        super(x0Var, new int[]{i7}, i8);
        this.f19078h = i9;
        this.f19079i = obj;
    }

    @Override // m2.t
    public void m(long j7, long j8, long j9, List<? extends v1.n> list, v1.o[] oVarArr) {
    }

    @Override // m2.t
    public int q() {
        return this.f19078h;
    }

    @Override // m2.t
    public int r() {
        return 0;
    }

    @Override // m2.t
    public Object t() {
        return this.f19079i;
    }
}
