package b.a.i;

import javax.security.auth.x500.X500Principal;

/* compiled from: DistinguishedNameParser.java */
/* loaded from: classes.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f2026a;

    /* renamed from: b, reason: collision with root package name */
    private final int f2027b;

    /* renamed from: c, reason: collision with root package name */
    private int f2028c;

    /* renamed from: d, reason: collision with root package name */
    private int f2029d;
    private int e;
    private int f;
    private char[] g;

    public c(X500Principal x500Principal) {
        this.f2026a = x500Principal.getName("RFC2253");
        this.f2027b = this.f2026a.length();
    }

    private String a() {
        while (this.f2028c < this.f2027b && this.g[this.f2028c] == ' ') {
            this.f2028c++;
        }
        if (this.f2028c == this.f2027b) {
            return null;
        }
        this.f2029d = this.f2028c;
        this.f2028c++;
        while (this.f2028c < this.f2027b && this.g[this.f2028c] != '=' && this.g[this.f2028c] != ' ') {
            this.f2028c++;
        }
        if (this.f2028c >= this.f2027b) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f2026a);
        }
        this.e = this.f2028c;
        if (this.g[this.f2028c] == ' ') {
            while (this.f2028c < this.f2027b && this.g[this.f2028c] != '=' && this.g[this.f2028c] == ' ') {
                this.f2028c++;
            }
            if (this.g[this.f2028c] != '=' || this.f2028c == this.f2027b) {
                throw new IllegalStateException("Unexpected end of DN: " + this.f2026a);
            }
        }
        this.f2028c++;
        while (this.f2028c < this.f2027b && this.g[this.f2028c] == ' ') {
            this.f2028c++;
        }
        if (this.e - this.f2029d > 4 && this.g[this.f2029d + 3] == '.' && ((this.g[this.f2029d] == 'O' || this.g[this.f2029d] == 'o') && ((this.g[this.f2029d + 1] == 'I' || this.g[this.f2029d + 1] == 'i') && (this.g[this.f2029d + 2] == 'D' || this.g[this.f2029d + 2] == 'd')))) {
            this.f2029d += 4;
        }
        return new String(this.g, this.f2029d, this.e - this.f2029d);
    }

    private String b() {
        this.f2028c++;
        this.f2029d = this.f2028c;
        this.e = this.f2029d;
        while (this.f2028c != this.f2027b) {
            if (this.g[this.f2028c] == '\"') {
                this.f2028c++;
                while (this.f2028c < this.f2027b && this.g[this.f2028c] == ' ') {
                    this.f2028c++;
                }
                return new String(this.g, this.f2029d, this.e - this.f2029d);
            }
            if (this.g[this.f2028c] == '\\') {
                this.g[this.e] = e();
            } else {
                this.g[this.e] = this.g[this.f2028c];
            }
            this.f2028c++;
            this.e++;
        }
        throw new IllegalStateException("Unexpected end of DN: " + this.f2026a);
    }

    private String c() {
        int i;
        if (this.f2028c + 4 >= this.f2027b) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f2026a);
        }
        this.f2029d = this.f2028c;
        this.f2028c++;
        while (this.f2028c != this.f2027b && this.g[this.f2028c] != '+' && this.g[this.f2028c] != ',' && this.g[this.f2028c] != ';') {
            if (this.g[this.f2028c] == ' ') {
                this.e = this.f2028c;
                this.f2028c++;
                while (this.f2028c < this.f2027b && this.g[this.f2028c] == ' ') {
                    this.f2028c++;
                }
                i = this.e - this.f2029d;
                if (i >= 5 || (i & 1) == 0) {
                    throw new IllegalStateException("Unexpected end of DN: " + this.f2026a);
                }
                byte[] bArr = new byte[i / 2];
                int i2 = this.f2029d + 1;
                for (int i3 = 0; i3 < bArr.length; i3++) {
                    bArr[i3] = (byte) a(i2);
                    i2 += 2;
                }
                return new String(this.g, this.f2029d, i);
            }
            if (this.g[this.f2028c] >= 'A' && this.g[this.f2028c] <= 'F') {
                char[] cArr = this.g;
                int i4 = this.f2028c;
                cArr[i4] = (char) (cArr[i4] + ' ');
            }
            this.f2028c++;
        }
        this.e = this.f2028c;
        i = this.e - this.f2029d;
        if (i >= 5) {
        }
        throw new IllegalStateException("Unexpected end of DN: " + this.f2026a);
    }

    private String d() {
        this.f2029d = this.f2028c;
        this.e = this.f2028c;
        while (this.f2028c < this.f2027b) {
            char c2 = this.g[this.f2028c];
            if (c2 != ' ') {
                if (c2 != ';') {
                    if (c2 == '\\') {
                        char[] cArr = this.g;
                        int i = this.e;
                        this.e = i + 1;
                        cArr[i] = e();
                        this.f2028c++;
                    } else {
                        switch (c2) {
                            case '+':
                            case ',':
                                break;
                            default:
                                char[] cArr2 = this.g;
                                int i2 = this.e;
                                this.e = i2 + 1;
                                cArr2[i2] = this.g[this.f2028c];
                                this.f2028c++;
                                continue;
                        }
                    }
                }
                return new String(this.g, this.f2029d, this.e - this.f2029d);
            }
            this.f = this.e;
            this.f2028c++;
            char[] cArr3 = this.g;
            int i3 = this.e;
            this.e = i3 + 1;
            cArr3[i3] = ' ';
            while (this.f2028c < this.f2027b && this.g[this.f2028c] == ' ') {
                char[] cArr4 = this.g;
                int i4 = this.e;
                this.e = i4 + 1;
                cArr4[i4] = ' ';
                this.f2028c++;
            }
            if (this.f2028c == this.f2027b || this.g[this.f2028c] == ',' || this.g[this.f2028c] == '+' || this.g[this.f2028c] == ';') {
                return new String(this.g, this.f2029d, this.f - this.f2029d);
            }
        }
        return new String(this.g, this.f2029d, this.e - this.f2029d);
    }

    private char e() {
        this.f2028c++;
        if (this.f2028c == this.f2027b) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f2026a);
        }
        char c2 = this.g[this.f2028c];
        if (c2 != ' ' && c2 != '%' && c2 != '\\' && c2 != '_') {
            switch (c2) {
                case '\"':
                case '#':
                    break;
                default:
                    switch (c2) {
                        case '*':
                        case '+':
                        case ',':
                            break;
                        default:
                            switch (c2) {
                                case ';':
                                case '<':
                                case '=':
                                case '>':
                                    break;
                                default:
                                    return f();
                            }
                    }
            }
        }
        return this.g[this.f2028c];
    }

    private char f() {
        int i;
        int i2;
        int a2 = a(this.f2028c);
        this.f2028c++;
        if (a2 < 128) {
            return (char) a2;
        }
        if (a2 < 192 || a2 > 247) {
            return '?';
        }
        if (a2 <= 223) {
            i2 = a2 & 31;
            i = 1;
        } else if (a2 <= 239) {
            i = 2;
            i2 = a2 & 15;
        } else {
            i = 3;
            i2 = a2 & 7;
        }
        for (int i3 = 0; i3 < i; i3++) {
            this.f2028c++;
            if (this.f2028c == this.f2027b || this.g[this.f2028c] != '\\') {
                return '?';
            }
            this.f2028c++;
            int a3 = a(this.f2028c);
            this.f2028c++;
            if ((a3 & 192) != 128) {
                return '?';
            }
            i2 = (i2 << 6) + (a3 & 63);
        }
        return (char) i2;
    }

    private int a(int i) {
        int i2;
        int i3;
        int i4 = i + 1;
        if (i4 >= this.f2027b) {
            throw new IllegalStateException("Malformed DN: " + this.f2026a);
        }
        char c2 = this.g[i];
        if (c2 >= '0' && c2 <= '9') {
            i2 = c2 - '0';
        } else if (c2 >= 'a' && c2 <= 'f') {
            i2 = c2 - 'W';
        } else {
            if (c2 < 'A' || c2 > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.f2026a);
            }
            i2 = c2 - '7';
        }
        char c3 = this.g[i4];
        if (c3 >= '0' && c3 <= '9') {
            i3 = c3 - '0';
        } else if (c3 >= 'a' && c3 <= 'f') {
            i3 = c3 - 'W';
        } else {
            if (c3 < 'A' || c3 > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.f2026a);
            }
            i3 = c3 - '7';
        }
        return (i2 << 4) + i3;
    }

    public String a(String str) {
        this.f2028c = 0;
        this.f2029d = 0;
        this.e = 0;
        this.f = 0;
        this.g = this.f2026a.toCharArray();
        String a2 = a();
        if (a2 == null) {
            return null;
        }
        do {
            String str2 = "";
            if (this.f2028c == this.f2027b) {
                return null;
            }
            switch (this.g[this.f2028c]) {
                case '\"':
                    str2 = b();
                    break;
                case '#':
                    str2 = c();
                    break;
                case '+':
                case ',':
                case ';':
                    break;
                default:
                    str2 = d();
                    break;
            }
            if (str.equalsIgnoreCase(a2)) {
                return str2;
            }
            if (this.f2028c >= this.f2027b) {
                return null;
            }
            if (this.g[this.f2028c] != ',' && this.g[this.f2028c] != ';' && this.g[this.f2028c] != '+') {
                throw new IllegalStateException("Malformed DN: " + this.f2026a);
            }
            this.f2028c++;
            a2 = a();
        } while (a2 != null);
        throw new IllegalStateException("Malformed DN: " + this.f2026a);
    }
}
