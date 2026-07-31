package b6;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f1332a;

    /* renamed from: b, reason: collision with root package name */
    public final i f1333b;

    public h0(String str, i iVar) {
        this.f1332a = str;
        this.f1333b = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return q6.i.a(this.f1332a, h0Var.f1332a) && this.f1333b == h0Var.f1333b;
    }

    public final int hashCode() {
        return this.f1333b.hashCode() + (this.f1332a.hashCode() * 31);
    }

    public final String toString() {
        return "GameItem(emoji=" + this.f1332a + ", category=" + this.f1333b + ")";
    }
}
