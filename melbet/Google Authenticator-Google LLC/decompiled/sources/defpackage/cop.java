package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cop {
    public final Object a;
    private final String b;

    public cop(Object obj, String str) {
        this.a = obj;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cop)) {
            return false;
        }
        cop copVar = (cop) obj;
        return this.a == copVar.a && this.b.equals(copVar.b);
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 31) + this.b.hashCode();
    }
}
