package y2;

import h2.AbstractC0447i;
import t.u;

/* loaded from: classes.dex */
public final class k extends u {
    @Override // t.u
    public final boolean b() {
        char charAt;
        int x3 = x();
        String str = (String) this.f7675f;
        return (x3 >= str.length() || x3 == -1 || (charAt = str.charAt(x3)) == ',' || charAt == ':' || charAt == ']' || charAt == '}') ? false : true;
    }

    @Override // t.u
    public final byte e() {
        int x3 = x();
        String str = (String) this.f7675f;
        if (x3 >= str.length() || x3 == -1) {
            return (byte) 10;
        }
        this.f7671b = x3 + 1;
        return e.d(str.charAt(x3));
    }

    @Override // t.u
    public final void g(char c3) {
        int x3 = x();
        String str = (String) this.f7675f;
        if (x3 >= str.length() || x3 == -1) {
            this.f7671b = -1;
            B(c3);
            throw null;
        }
        char charAt = str.charAt(x3);
        this.f7671b = x3 + 1;
        if (charAt == c3) {
            return;
        }
        B(c3);
        throw null;
    }

    @Override // t.u
    public final byte u() {
        int x3 = x();
        String str = (String) this.f7675f;
        if (x3 >= str.length() || x3 == -1) {
            return (byte) 10;
        }
        this.f7671b = x3;
        return e.d(str.charAt(x3));
    }

    @Override // t.u
    public final int x() {
        int i3;
        int i4 = this.f7671b;
        if (i4 == -1) {
            return i4;
        }
        while (true) {
            String str = (String) this.f7675f;
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
                    int r02 = AbstractC0447i.r0(str, "*/", i4 + 2, false, 4);
                    if (r02 == -1) {
                        this.f7671b = str.length();
                        u.n(this, "Expected end of the block comment: \"*/\", but had EOF instead", 0, null, 6);
                        throw null;
                    }
                    i4 = r02 + 2;
                } else {
                    if (charAt2 != '/') {
                        break;
                    }
                    i4 = AbstractC0447i.q0(str, '\n', i4 + 2, false, 4);
                    if (i4 == -1) {
                        i4 = str.length();
                    }
                }
            }
            i4++;
        }
        this.f7671b = i4;
        return i4;
    }
}
