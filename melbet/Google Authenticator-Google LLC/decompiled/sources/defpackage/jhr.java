package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jhr implements jgd {
    public final jhq a;

    public jhr(jhq jhqVar) {
        this.a = jhqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jhr) && ksp.b(this.a, ((jhr) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TextTitle(text=" + this.a + ")";
    }
}
