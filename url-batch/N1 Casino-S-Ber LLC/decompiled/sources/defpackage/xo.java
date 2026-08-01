package defpackage;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class xo extends vo {
    public static final xo i = new xo(1, 0, 1);

    @Override // defpackage.vo
    public final boolean equals(Object obj) {
        if (!(obj instanceof xo)) {
            return false;
        }
        if (isEmpty() && ((xo) obj).isEmpty()) {
            return true;
        }
        xo xoVar = (xo) obj;
        return this.f == xoVar.f && this.g == xoVar.g;
    }

    @Override // defpackage.vo
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f * 31) + this.g;
    }

    @Override // defpackage.vo
    public final boolean isEmpty() {
        return this.f > this.g;
    }

    @Override // defpackage.vo
    public final String toString() {
        return this.f + ".." + this.g;
    }
}
