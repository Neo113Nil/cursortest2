package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kwe implements kwq {
    public final boolean a;

    public kwe(boolean z) {
        this.a = z;
    }

    @Override // defpackage.kwq
    public final kxg bP() {
        return null;
    }

    @Override // defpackage.kwq
    public final boolean bR() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(true != this.a ? "New" : "Active");
        sb.append("}");
        return sb.toString();
    }
}
