package defpackage;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class ir extends gr {
    public static final ir i = new ir(1, 0, 1);

    @Override // defpackage.gr
    public final boolean equals(Object obj) {
        if (!(obj instanceof ir)) {
            return false;
        }
        if (isEmpty() && ((ir) obj).isEmpty()) {
            return true;
        }
        ir irVar = (ir) obj;
        return this.f == irVar.f && this.g == irVar.g;
    }

    @Override // defpackage.gr
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f * 31) + this.g;
    }

    @Override // defpackage.gr
    public final boolean isEmpty() {
        return this.f > this.g;
    }

    @Override // defpackage.gr
    public final String toString() {
        return this.f + ".." + this.g;
    }
}
