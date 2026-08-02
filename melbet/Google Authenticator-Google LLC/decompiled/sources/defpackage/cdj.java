package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cdj extends cdu {
    private final Integer a;

    public cdj(Integer num) {
        this.a = num;
    }

    @Override // defpackage.cdu
    public final Integer a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cdu) {
            return this.a.equals(((cdu) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.a + "}";
    }
}
