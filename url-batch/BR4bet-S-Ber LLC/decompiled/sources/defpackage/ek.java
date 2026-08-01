package defpackage;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class ek implements xq {
    public final boolean a;

    public ek(boolean z) {
        this.a = z;
    }

    @Override // defpackage.xq
    public final boolean b() {
        return this.a;
    }

    @Override // defpackage.xq
    public final iy d() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.a ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
