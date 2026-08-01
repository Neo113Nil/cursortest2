package defpackage;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class lp extends jp {
    public static final lp i = new lp(1, 0, 1);

    @Override // defpackage.jp
    public final boolean equals(Object obj) {
        if (!(obj instanceof lp)) {
            return false;
        }
        if (isEmpty() && ((lp) obj).isEmpty()) {
            return true;
        }
        lp lpVar = (lp) obj;
        return this.f == lpVar.f && this.g == lpVar.g;
    }

    @Override // defpackage.jp
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f * 31) + this.g;
    }

    @Override // defpackage.jp
    public final boolean isEmpty() {
        return this.f > this.g;
    }

    @Override // defpackage.jp
    public final String toString() {
        return this.f + ".." + this.g;
    }
}
