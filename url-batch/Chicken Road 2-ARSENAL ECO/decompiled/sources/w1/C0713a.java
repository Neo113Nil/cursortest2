package w1;

/* renamed from: w1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0713a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final int f6178a;

    public C0713a(int i7) {
        this.f6178a = i7;
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
        C0713a c0713a = (C0713a) ((e) obj);
        if (this.f6178a != c0713a.f6178a) {
            return false;
        }
        c0713a.getClass();
        Object obj2 = EnumC0716d.f6180f;
        return obj2.equals(obj2);
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (14552422 ^ this.f6178a) + (EnumC0716d.f6180f.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f6178a + "intEncoding=" + EnumC0716d.f6180f + ')';
    }
}
