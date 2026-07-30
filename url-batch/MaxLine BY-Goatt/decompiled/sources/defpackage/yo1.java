package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class yo1 {
    public final iq1 a;
    public final boolean b = false;

    public yo1(iq1 iq1Var) {
        this.a = iq1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !yo1.class.equals(obj.getClass())) {
            return false;
        }
        yo1 yo1Var = (yo1) obj;
        return this.b == yo1Var.b && this.a.equals(yo1Var.a);
    }

    public final int hashCode() {
        return ((this.a.hashCode() * 961) + (this.b ? 1 : 0)) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(yo1.class.getSimpleName());
        sb.append(" Type: " + this.a);
        sb.append(" Nullable: false");
        if (this.b) {
            sb.append(" DefaultValue: null");
        }
        return sb.toString();
    }
}
