package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jhi {
    public final jhq a;

    public jhi(jhq jhqVar) {
        this.a = jhqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jhi) && ksp.b(this.a, ((jhi) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PremiumDecorationData(text=" + this.a + ")";
    }
}
