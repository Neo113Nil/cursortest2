package m0;

import java.util.Iterator;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class s2 implements Iterable, r6.a {

    /* renamed from: d, reason: collision with root package name */
    public final f2 f5105d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5106e;

    /* renamed from: f, reason: collision with root package name */
    public final b f5107f;

    public s2(f2 f2Var, int i, m0 m0Var, b bVar) {
        this.f5105d = f2Var;
        this.f5106e = i;
        this.f5107f = bVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new l0(this.f5105d, this.f5106e, null, this.f5107f);
    }
}
