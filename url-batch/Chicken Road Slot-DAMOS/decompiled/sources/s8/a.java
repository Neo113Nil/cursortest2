package s8;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a implements e {

    /* renamed from: b, reason: collision with root package name */
    public final int f9151b;

    public a(int i3) {
        this.f9151b = i3;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return e.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f9151b == eVar.tag() && d.f9153d.equals(eVar.intEncoding());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (14552422 ^ this.f9151b) + (d.f9153d.hashCode() ^ 2041407134);
    }

    @Override // s8.e
    public final d intEncoding() {
        return d.f9153d;
    }

    @Override // s8.e
    public final int tag() {
        return this.f9151b;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f9151b + "intEncoding=" + d.f9153d + ')';
    }
}
