package s;

import G.C0192d;
import G.C0205j0;
import G.W;
import G.X0;
import kotlin.ranges.IntRange;

/* loaded from: classes.dex */
public final class u implements X0 {

    /* renamed from: d, reason: collision with root package name */
    public final C0205j0 f9967d;

    /* renamed from: e, reason: collision with root package name */
    public int f9968e;

    public u(int i2) {
        int i4 = (i2 / 30) * 30;
        this.f9967d = C0192d.K(kotlin.ranges.b.h(Math.max(i4 - 100, 0), i4 + 130), W.f2779l);
        this.f9968e = i2;
    }

    @Override // G.X0
    public final Object getValue() {
        return (IntRange) this.f9967d.getValue();
    }
}
