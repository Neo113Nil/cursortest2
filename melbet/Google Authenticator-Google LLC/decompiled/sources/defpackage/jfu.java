package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jfu implements jft {
    public final jhq a;
    private final int b = 1;

    public jfu(jhq jhqVar) {
        this.a = jhqVar;
    }

    @Override // defpackage.jft
    public final int a() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jfu)) {
            return false;
        }
        jfu jfuVar = (jfu) obj;
        if (!ksp.b(this.a, jfuVar.a)) {
            return false;
        }
        int i = jfuVar.b;
        return true;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + 1;
    }

    public final String toString() {
        return "TitleHeader(title=" + this.a + ", trailingIcon=CHEVRON_EXPAND)";
    }
}
