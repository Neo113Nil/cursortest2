package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jis {
    public final String a;
    public final CharSequence b;
    public final CharSequence c;
    public final krt d;
    public final CharSequence e;
    public final Integer f;

    public jis(String str, CharSequence charSequence, CharSequence charSequence2, krt krtVar, CharSequence charSequence3, Integer num) {
        charSequence2.getClass();
        this.a = str;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = krtVar;
        this.e = charSequence3;
        this.f = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jis)) {
            return false;
        }
        jis jisVar = (jis) obj;
        return ksp.b(this.a, jisVar.a) && ksp.b(this.b, jisVar.b) && ksp.b(this.c, jisVar.c) && ksp.b(this.d, jisVar.d) && ksp.b(this.e, jisVar.e) && ksp.b(this.f, jisVar.f);
    }

    public final int hashCode() {
        int hashCode = (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        CharSequence charSequence = this.e;
        return (((hashCode * 31) + (charSequence == null ? 0 : charSequence.hashCode())) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "CustomDialogData(title=" + this.a + ", message=" + ((Object) this.b) + ", positiveButtonText=" + ((Object) this.c) + ", onPositiveButtonClicked=" + this.d + ", negativeButtonText=" + ((Object) this.e) + ", icon=" + this.f + ")";
    }
}
