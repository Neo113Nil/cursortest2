package kotlinx.coroutines;

/* loaded from: classes3.dex */
final class x0 implements g1 {
    private final boolean isActive;

    public x0(boolean z7) {
        this.isActive = z7;
    }

    @Override // kotlinx.coroutines.g1
    public w1 getList() {
        return null;
    }

    @Override // kotlinx.coroutines.g1
    public boolean isActive() {
        return this.isActive;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        sb.append(isActive() ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
