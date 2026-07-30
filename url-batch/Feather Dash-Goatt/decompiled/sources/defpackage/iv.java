package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class iv implements n70 {
    public final boolean d;

    public iv(boolean z) {
        this.d = z;
    }

    @Override // defpackage.n70
    public final boolean b() {
        return this.d;
    }

    @Override // defpackage.n70
    public final sp0 d() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.d ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
