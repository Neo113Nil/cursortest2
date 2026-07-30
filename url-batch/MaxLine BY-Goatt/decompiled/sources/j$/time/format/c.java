package j$.time.format;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes2.dex */
public final class c implements e {
    public final char a;

    public c(char c) {
        this.a = c;
    }

    @Override // j$.time.format.e
    public final int B(v vVar, CharSequence charSequence, int i) {
        if (i == charSequence.length()) {
            return ~i;
        }
        char charAt = charSequence.charAt(i);
        char c = this.a;
        return (charAt == c || (!vVar.b && (Character.toUpperCase(charAt) == Character.toUpperCase(c) || Character.toLowerCase(charAt) == Character.toLowerCase(c)))) ? i + 1 : ~i;
    }

    @Override // j$.time.format.e
    public final boolean s(y yVar, StringBuilder sb) {
        sb.append(this.a);
        return true;
    }

    public final String toString() {
        char c = this.a;
        if (c == '\'') {
            return "''";
        }
        return "'" + c + "'";
    }
}
