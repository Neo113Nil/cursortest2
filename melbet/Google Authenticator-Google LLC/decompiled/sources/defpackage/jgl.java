package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jgl implements jgm {
    public final jhb a;

    public jgl(jhb jhbVar) {
        this.a = jhbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jgl) && this.a == ((jgl) obj).a;
    }

    public final int hashCode() {
        jhb jhbVar = this.a;
        if (jhbVar == null) {
            return 0;
        }
        return jhbVar.hashCode();
    }

    public final String toString() {
        return "ButtonStyleText(outlineColor=" + this.a + ")";
    }

    public jgl() {
        this(null);
    }
}
