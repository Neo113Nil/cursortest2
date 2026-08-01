package defpackage;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class qz implements fb {
    public final Class a;

    public qz(Class cls) {
        this.a = cls;
    }

    @Override // defpackage.fb
    public final Class a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qz) {
            return this.a.equals(((qz) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a + " (Kotlin reflection is not available)";
    }
}
