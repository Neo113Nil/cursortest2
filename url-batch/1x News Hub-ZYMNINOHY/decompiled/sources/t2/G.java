package t2;

/* loaded from: classes.dex */
public final class G implements N {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10380a;

    public G(boolean z) {
        this.f10380a = z;
    }

    @Override // t2.N
    public final boolean a() {
        return this.f10380a;
    }

    @Override // t2.N
    public final f0 d() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.f10380a ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
