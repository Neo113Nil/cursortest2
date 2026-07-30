package j$.time.format;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes2.dex */
public final class k implements e {
    public final e a;
    public final int b;
    public final char c;

    public k(e eVar, int i, char c) {
        this.a = eVar;
        this.b = i;
        this.c = c;
    }

    @Override // j$.time.format.e
    public final int B(v vVar, CharSequence charSequence, int i) {
        boolean z = vVar.c;
        if (i > charSequence.length()) {
            throw new IndexOutOfBoundsException();
        }
        if (i == charSequence.length()) {
            return ~i;
        }
        int i2 = this.b + i;
        if (i2 > charSequence.length()) {
            if (z) {
                return ~i;
            }
            i2 = charSequence.length();
        }
        int i3 = i;
        while (i3 < i2 && vVar.a(charSequence.charAt(i3), this.c)) {
            i3++;
        }
        int B = this.a.B(vVar, charSequence.subSequence(0, i2), i3);
        return (B == i2 || !z) ? B : ~(i + i3);
    }

    @Override // j$.time.format.e
    public final boolean s(y yVar, StringBuilder sb) {
        int length = sb.length();
        if (!this.a.s(yVar, sb)) {
            return false;
        }
        int length2 = sb.length() - length;
        int i = this.b;
        if (length2 <= i) {
            for (int i2 = 0; i2 < i - length2; i2++) {
                sb.insert(length, this.c);
            }
            return true;
        }
        throw new j$.time.c("Cannot print as output of " + length2 + " characters exceeds pad width of " + i);
    }

    public final String toString() {
        String str;
        char c = this.c;
        if (c == ' ') {
            str = ")";
        } else {
            str = ",'" + c + "')";
        }
        return "Pad(" + this.a + "," + this.b + str;
    }
}
