package x3;

/* renamed from: x3.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1531F implements InterfaceC1538M {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f15992a;

    public C1531F(boolean z) {
        this.f15992a = z;
    }

    @Override // x3.InterfaceC1538M
    public final boolean a() {
        return this.f15992a;
    }

    @Override // x3.InterfaceC1538M
    public final e0 c() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.f15992a ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
