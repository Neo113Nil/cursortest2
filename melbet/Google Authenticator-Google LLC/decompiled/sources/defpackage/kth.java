package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kth extends ktg {
    public static final kth d = new kth(1, 0);

    @Override // defpackage.ktg
    public final boolean a() {
        return this.a > this.b;
    }

    @Override // defpackage.ktg
    public final boolean equals(Object obj) {
        if (obj instanceof kth) {
            if (a() && ((kth) obj).a()) {
                return true;
            }
            kth kthVar = (kth) obj;
            return this.a == kthVar.a && this.b == kthVar.b;
        }
        return false;
    }

    @Override // defpackage.ktg
    public final int hashCode() {
        if (a()) {
            return -1;
        }
        return (this.a * 31) + this.b;
    }

    @Override // defpackage.ktg
    public final String toString() {
        return this.a + ".." + this.b;
    }
}
