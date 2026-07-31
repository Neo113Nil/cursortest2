package o2;

/* renamed from: o2.e0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3326e0 implements InterfaceC3350q0 {

    /* renamed from: b, reason: collision with root package name */
    private final boolean f42058b;

    public C3326e0(boolean z4) {
        this.f42058b = z4;
    }

    @Override // o2.InterfaceC3350q0
    public I0 c() {
        return null;
    }

    @Override // o2.InterfaceC3350q0
    public boolean isActive() {
        return this.f42058b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        sb.append(isActive() ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
