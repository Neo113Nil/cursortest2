package i6;

import q6.t;
import q6.u;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class h extends g implements q6.f {

    /* renamed from: e, reason: collision with root package name */
    public final int f3464e;

    public h(g6.c cVar) {
        super(cVar);
        this.f3464e = 2;
    }

    @Override // q6.f
    public final int c() {
        return this.f3464e;
    }

    @Override // i6.a
    public final String toString() {
        if (this.f3458d != null) {
            return super.toString();
        }
        t.f6206a.getClass();
        String a8 = u.a(this);
        q6.i.d(a8, "renderLambdaToString(...)");
        return a8;
    }
}
