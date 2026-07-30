package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ga implements h01 {
    public final int a;

    public ga(int i) {
        this.a = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return h01.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h01)) {
            return false;
        }
        h01 h01Var = (h01) obj;
        return this.a == h01Var.tag() && g01.d.equals(h01Var.intEncoding());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.a ^ 14552422) + (g01.d.hashCode() ^ 2041407134);
    }

    @Override // defpackage.h01
    public final g01 intEncoding() {
        return g01.d;
    }

    @Override // defpackage.h01
    public final int tag() {
        return this.a;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.a + "intEncoding=" + g01.d + ')';
    }
}
