package D4;

/* loaded from: classes.dex */
public final class I implements U {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f465a;

    public I(boolean z) {
        this.f465a = z;
    }

    @Override // D4.U
    public final boolean a() {
        return this.f465a;
    }

    @Override // D4.U
    public final i0 d() {
        return null;
    }

    public final String toString() {
        return B0.o.l(new StringBuilder("Empty{"), this.f465a ? "Active" : "New", '}');
    }
}
