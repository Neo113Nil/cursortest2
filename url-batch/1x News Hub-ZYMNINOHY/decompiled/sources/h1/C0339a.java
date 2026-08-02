package h1;

/* renamed from: h1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0339a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final int f5054a;

    public C0339a(int i3) {
        this.f5054a = i3;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return d.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        C0339a c0339a = (C0339a) ((d) obj);
        if (this.f5054a != c0339a.f5054a) {
            return false;
        }
        Object obj2 = c.f5056a;
        c0339a.getClass();
        return obj2.equals(obj2);
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (14552422 ^ this.f5054a) + (c.f5056a.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f5054a + "intEncoding=" + c.f5056a + ')';
    }
}
