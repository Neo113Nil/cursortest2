package a2;

/* renamed from: a2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0172a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final int f3083a;

    public C0172a(int i2) {
        this.f3083a = i2;
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
        C0172a c0172a = (C0172a) ((e) obj);
        if (this.f3083a != c0172a.f3083a) {
            return false;
        }
        c0172a.getClass();
        Object obj2 = EnumC0175d.f3085d;
        return obj2.equals(obj2);
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (14552422 ^ this.f3083a) + (EnumC0175d.f3085d.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f3083a + "intEncoding=" + EnumC0175d.f3085d + ')';
    }
}
