package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jhg implements jhc {
    public final String a;

    public jhg(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jhg) && ksp.b(this.a, ((jhg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StringContent(string=" + this.a + ")";
    }
}
