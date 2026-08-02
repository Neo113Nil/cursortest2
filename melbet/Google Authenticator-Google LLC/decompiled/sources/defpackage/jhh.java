package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jhh {
    public final jhc a;

    public jhh(int i, Object... objArr) {
        this(new jhe(i, ixc.L(objArr)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jhh) && ksp.b(this.a, ((jhh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PlatformString(content=" + this.a + ")";
    }

    public jhh(jhc jhcVar) {
        this.a = jhcVar;
    }

    public jhh(String str) {
        this(new jhg(str));
    }

    public /* synthetic */ jhh(int i) {
        this(i, new Object[0]);
    }
}
