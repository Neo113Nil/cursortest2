package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class pl implements ol {
    public final ll d;

    public pl(ll llVar) {
        this.d = llVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pl) {
            return this.d.equals(((pl) obj).d);
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() * 31;
    }
}
