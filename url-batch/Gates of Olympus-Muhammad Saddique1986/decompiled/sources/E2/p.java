package E2;

import n2.AbstractC0730j;

/* loaded from: classes.dex */
public final class p extends o {
    @Override // E2.o
    public final boolean b() {
        char charAt;
        int u3 = u();
        String str = this.f1082e;
        return (u3 >= str.length() || u3 == -1 || (charAt = str.charAt(u3)) == ',' || charAt == ':' || charAt == ']' || charAt == '}') ? false : true;
    }

    @Override // E2.o
    public final byte e() {
        int u3 = u();
        String str = this.f1082e;
        if (u3 >= str.length() || u3 == -1) {
            return (byte) 10;
        }
        this.f1078a = u3 + 1;
        return h.d(str.charAt(u3));
    }

    @Override // E2.o
    public final void g(char c2) {
        int u3 = u();
        String str = this.f1082e;
        if (u3 >= str.length() || u3 == -1) {
            this.f1078a = -1;
            x(c2);
            throw null;
        }
        char charAt = str.charAt(u3);
        this.f1078a = u3 + 1;
        if (charAt == c2) {
            return;
        }
        x(c2);
        throw null;
    }

    @Override // E2.o
    public final byte r() {
        int u3 = u();
        String str = this.f1082e;
        if (u3 >= str.length() || u3 == -1) {
            return (byte) 10;
        }
        this.f1078a = u3;
        return h.d(str.charAt(u3));
    }

    @Override // E2.o
    public final int u() {
        int i3;
        int i4 = this.f1078a;
        if (i4 == -1) {
            return i4;
        }
        while (true) {
            String str = this.f1082e;
            if (i4 >= str.length()) {
                break;
            }
            char charAt = str.charAt(i4);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                if (charAt != '/' || (i3 = i4 + 1) >= str.length()) {
                    break;
                }
                char charAt2 = str.charAt(i3);
                if (charAt2 == '*') {
                    int I3 = AbstractC0730j.I(str, "*/", i4 + 2, false, 4);
                    if (I3 == -1) {
                        this.f1078a = str.length();
                        o.n(this, "Expected end of the block comment: \"*/\", but had EOF instead", 0, null, 6);
                        throw null;
                    }
                    i4 = I3 + 2;
                } else {
                    if (charAt2 != '/') {
                        break;
                    }
                    i4 = AbstractC0730j.H(str, '\n', i4 + 2, false, 4);
                    if (i4 == -1) {
                        i4 = str.length();
                    }
                }
            }
            i4++;
        }
        this.f1078a = i4;
        return i4;
    }
}
