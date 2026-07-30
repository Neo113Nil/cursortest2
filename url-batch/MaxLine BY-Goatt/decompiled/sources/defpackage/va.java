package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class va implements q22 {
    public final int b;

    public va(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!va.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.b == ((va) obj).b;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        return q40.o(new StringBuilder("AndroidPointerIcon(type="), this.b, ')');
    }
}
