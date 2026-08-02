package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jik {
    public final jil a;
    public final jhq b;

    public jik(jil jilVar, jhq jhqVar) {
        this.a = jilVar;
        this.b = jhqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jik)) {
            return false;
        }
        jik jikVar = (jik) obj;
        return ksp.b(this.a, jikVar.a) && ksp.b(this.b, jikVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        jhq jhqVar = this.b;
        return hashCode + (jhqVar == null ? 0 : jhqVar.hashCode());
    }

    public final String toString() {
        return "ProgressContent(progress=" + this.a + ", text=" + this.b + ")";
    }
}
