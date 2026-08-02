package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ibq implements ibu {
    private final int a;
    private final ibt b;

    public ibq(int i, ibt ibtVar) {
        this.a = i;
        this.b = ibtVar;
    }

    @Override // defpackage.ibu
    public final int a() {
        return this.a;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return ibu.class;
    }

    @Override // defpackage.ibu
    public final ibt b() {
        return this.b;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ibu)) {
            return false;
        }
        ibu ibuVar = (ibu) obj;
        return this.a == ibuVar.a() && this.b.equals(ibuVar.b());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.a ^ 14552422) + (this.b.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.a + "intEncoding=" + this.b + ')';
    }
}
