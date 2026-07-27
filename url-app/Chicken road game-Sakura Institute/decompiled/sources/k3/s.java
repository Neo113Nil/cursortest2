package k3;

import e2.C0559a;
import kotlin.text.y;

/* loaded from: classes.dex */
public final class s extends C0559a {
    @Override // e2.C0559a
    public final int B() {
        int i2;
        int i4 = this.f6165b;
        if (i4 == -1) {
            return i4;
        }
        while (true) {
            String str = (String) this.f6169f;
            if (i4 >= str.length()) {
                break;
            }
            char charAt = str.charAt(i4);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                if (charAt != '/' || (i2 = i4 + 1) >= str.length()) {
                    break;
                }
                char charAt2 = str.charAt(i2);
                if (charAt2 == '*') {
                    int v4 = y.v(str, "*/", i4 + 2, false, 4);
                    if (v4 == -1) {
                        this.f6165b = str.length();
                        C0559a.o(this, "Expected end of the block comment: \"*/\", but had EOF instead", 0, null, 6);
                        throw null;
                    }
                    i4 = v4 + 2;
                } else {
                    if (charAt2 != '/') {
                        break;
                    }
                    i4 = y.u(str, '\n', i4 + 2, false, 4);
                    if (i4 == -1) {
                        i4 = str.length();
                    }
                }
            }
            i4++;
        }
        this.f6165b = i4;
        return i4;
    }

    @Override // e2.C0559a
    public final boolean b() {
        char charAt;
        int B = B();
        String str = (String) this.f6169f;
        return (B >= str.length() || B == -1 || (charAt = str.charAt(B)) == ',' || charAt == ':' || charAt == ']' || charAt == '}') ? false : true;
    }

    @Override // e2.C0559a
    public final byte f() {
        int B = B();
        String str = (String) this.f6169f;
        if (B >= str.length() || B == -1) {
            return (byte) 10;
        }
        this.f6165b = B + 1;
        return h.h(str.charAt(B));
    }

    @Override // e2.C0559a
    public final void h(char c4) {
        int B = B();
        String str = (String) this.f6169f;
        if (B >= str.length() || B == -1) {
            this.f6165b = -1;
            E(c4);
            throw null;
        }
        char charAt = str.charAt(B);
        this.f6165b = B + 1;
        if (charAt == c4) {
            return;
        }
        E(c4);
        throw null;
    }

    @Override // e2.C0559a
    public final byte y() {
        int B = B();
        String str = (String) this.f6169f;
        if (B >= str.length() || B == -1) {
            return (byte) 10;
        }
        this.f6165b = B;
        return h.h(str.charAt(B));
    }
}
