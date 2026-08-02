package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kvl extends kqe {
    public static final ale b = new ale();
    public final String a;

    public kvl() {
        super(b);
        this.a = "Room Invalidation Tracker Refresh";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kvl) && ksp.b(this.a, ((kvl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CoroutineName(" + this.a + ")";
    }
}
