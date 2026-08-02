package g0;

import java.util.List;
import r0.AbstractC1391b;

/* loaded from: classes.dex */
public final class g extends AbstractC1391b {

    /* renamed from: d, reason: collision with root package name */
    public final List f8838d;

    /* renamed from: e, reason: collision with root package name */
    public final long f8839e;

    public g(List list, long j4) {
        super(0L, list.size() - 1);
        this.f8839e = j4;
        this.f8838d = list;
    }

    @Override // r0.n
    public final long c() {
        a();
        return this.f8839e + ((h0.j) this.f8838d.get((int) this.f15118c)).f9118e;
    }

    @Override // r0.n
    public final long e() {
        a();
        h0.j jVar = (h0.j) this.f8838d.get((int) this.f15118c);
        return this.f8839e + jVar.f9118e + jVar.f9116c;
    }
}
