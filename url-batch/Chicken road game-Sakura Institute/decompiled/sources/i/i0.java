package i;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class i0 extends e6.b0 {

    /* renamed from: f, reason: collision with root package name */
    public int f4751f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ h0 f4752g;

    public i0(h0 h0Var) {
        this.f4752g = h0Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4751f < this.f4752g.e();
    }

    @Override // e6.b0
    public final int nextInt() {
        int i7 = this.f4751f;
        this.f4751f = i7 + 1;
        return this.f4752g.c(i7);
    }
}
