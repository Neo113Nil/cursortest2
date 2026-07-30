package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class a5 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof a5) {
            return this.a == ((a5) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return "AndroidContentDataType(androidAutofillType=" + this.a + ')';
    }
}
