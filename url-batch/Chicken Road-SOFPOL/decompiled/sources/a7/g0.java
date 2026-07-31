package a7;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class g0 implements p0 {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f257d;

    public g0(boolean z3) {
        this.f257d = z3;
    }

    @Override // a7.p0
    public final boolean b() {
        return this.f257d;
    }

    @Override // a7.p0
    public final c1 d() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.f257d ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
