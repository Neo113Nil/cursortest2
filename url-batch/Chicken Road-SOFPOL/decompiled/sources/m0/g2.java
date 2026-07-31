package m0;

import java.util.Iterator;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class g2 implements Iterable, r6.a {

    /* renamed from: d, reason: collision with root package name */
    public final f2 f4939d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4940e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4941f;

    public g2(f2 f2Var, int i, int i8) {
        this.f4939d = f2Var;
        this.f4940e = i;
        this.f4941f = i8;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        f2 f2Var = this.f4939d;
        if (f2Var.f4934k != this.f4941f) {
            h2.f();
        }
        int i = this.f4940e;
        f2Var.g(i);
        return new l0(f2Var, i + 1, h2.a(f2Var.f4928d, i) + i);
    }
}
