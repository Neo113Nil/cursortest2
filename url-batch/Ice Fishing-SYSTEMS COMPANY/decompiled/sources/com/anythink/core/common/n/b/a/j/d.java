package com.anythink.core.common.n.b.a.j;

import com.anythink.basead.b.b.j;
import com.anythink.core.common.d.j;
import javax.security.auth.x500.X500Principal;

/* loaded from: classes.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    private final String f15526a;

    /* renamed from: b, reason: collision with root package name */
    private final int f15527b;

    /* renamed from: c, reason: collision with root package name */
    private int f15528c;

    /* renamed from: d, reason: collision with root package name */
    private int f15529d;

    /* renamed from: e, reason: collision with root package name */
    private int f15530e;

    /* renamed from: f, reason: collision with root package name */
    private int f15531f;

    /* renamed from: g, reason: collision with root package name */
    private char[] f15532g;

    private d(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f15526a = name;
        this.f15527b = name.length();
    }

    private String a() {
        int i;
        int i4;
        int i9;
        int i10;
        int i11;
        char c4;
        int i12;
        int i13;
        char c9;
        char c10;
        while (true) {
            i = this.f15528c;
            i4 = this.f15527b;
            if (i >= i4 || this.f15532g[i] != ' ') {
                break;
            }
            this.f15528c = i + 1;
        }
        if (i == i4) {
            return null;
        }
        this.f15529d = i;
        this.f15528c = i + 1;
        while (true) {
            i9 = this.f15528c;
            i10 = this.f15527b;
            if (i9 >= i10 || (c10 = this.f15532g[i9]) == '=' || c10 == ' ') {
                break;
            }
            this.f15528c = i9 + 1;
        }
        if (i9 >= i10) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f15526a);
        }
        this.f15530e = i9;
        if (this.f15532g[i9] == ' ') {
            while (true) {
                i12 = this.f15528c;
                i13 = this.f15527b;
                if (i12 >= i13 || (c9 = this.f15532g[i12]) == '=' || c9 != ' ') {
                    break;
                }
                this.f15528c = i12 + 1;
            }
            if (this.f15532g[i12] != '=' || i12 == i13) {
                throw new IllegalStateException("Unexpected end of DN: " + this.f15526a);
            }
        }
        do {
            i11 = this.f15528c + 1;
            this.f15528c = i11;
            if (i11 >= this.f15527b) {
                break;
            }
        } while (this.f15532g[i11] == ' ');
        int i14 = this.f15530e;
        int i15 = this.f15529d;
        if (i14 - i15 > 4) {
            char[] cArr = this.f15532g;
            if (cArr[i15 + 3] == '.' && (((c4 = cArr[i15]) == 'O' || c4 == 'o') && ((cArr[i15 + 1] == 'I' || cArr[i15 + 1] == 'i') && (cArr[i15 + 2] == 'D' || cArr[i15 + 2] == 'd')))) {
                this.f15529d = i15 + 4;
            }
        }
        char[] cArr2 = this.f15532g;
        int i16 = this.f15529d;
        return new String(cArr2, i16, i14 - i16);
    }

    private String b() {
        int i = this.f15528c + 1;
        this.f15528c = i;
        this.f15529d = i;
        this.f15530e = i;
        while (true) {
            int i4 = this.f15528c;
            if (i4 == this.f15527b) {
                throw new IllegalStateException("Unexpected end of DN: " + this.f15526a);
            }
            char[] cArr = this.f15532g;
            char c4 = cArr[i4];
            if (c4 == '\"') {
                this.f15528c = i4 + 1;
                while (true) {
                    int i9 = this.f15528c;
                    if (i9 >= this.f15527b || this.f15532g[i9] != ' ') {
                        break;
                    }
                    this.f15528c = i9 + 1;
                }
                char[] cArr2 = this.f15532g;
                int i10 = this.f15529d;
                return new String(cArr2, i10, this.f15530e - i10);
            }
            if (c4 == '\\') {
                cArr[this.f15530e] = e();
            } else {
                cArr[this.f15530e] = c4;
            }
            this.f15528c++;
            this.f15530e++;
        }
    }

    private String c() {
        int i;
        char[] cArr;
        char c4;
        int i4 = this.f15528c;
        if (i4 + 4 >= this.f15527b) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f15526a);
        }
        this.f15529d = i4;
        this.f15528c = i4 + 1;
        while (true) {
            i = this.f15528c;
            if (i == this.f15527b || (c4 = (cArr = this.f15532g)[i]) == '+' || c4 == ',' || c4 == ';') {
                break;
            }
            if (c4 == ' ') {
                this.f15530e = i;
                this.f15528c = i + 1;
                while (true) {
                    int i9 = this.f15528c;
                    if (i9 >= this.f15527b || this.f15532g[i9] != ' ') {
                        break;
                    }
                    this.f15528c = i9 + 1;
                }
            } else {
                if (c4 >= 'A' && c4 <= 'F') {
                    cArr[i] = (char) (c4 + ' ');
                }
                this.f15528c = i + 1;
            }
        }
        this.f15530e = i;
        int i10 = this.f15530e;
        int i11 = this.f15529d;
        int i12 = i10 - i11;
        if (i12 < 5 || (i12 & 1) == 0) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f15526a);
        }
        int i13 = i12 / 2;
        byte[] bArr = new byte[i13];
        int i14 = i11 + 1;
        for (int i15 = 0; i15 < i13; i15++) {
            bArr[i15] = (byte) a(i14);
            i14 += 2;
        }
        return new String(this.f15532g, this.f15529d, i12);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x009b, code lost:
    
        return new java.lang.String(r1, r2, r8.f15531f - r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String d() {
        char[] cArr;
        int i;
        int i4;
        char c4;
        int i9 = this.f15528c;
        this.f15529d = i9;
        this.f15530e = i9;
        while (true) {
            int i10 = this.f15528c;
            if (i10 >= this.f15527b) {
                char[] cArr2 = this.f15532g;
                int i11 = this.f15529d;
                return new String(cArr2, i11, this.f15530e - i11);
            }
            cArr = this.f15532g;
            char c9 = cArr[i10];
            if (c9 == ' ') {
                int i12 = this.f15530e;
                this.f15531f = i12;
                this.f15528c = i10 + 1;
                this.f15530e = i12 + 1;
                cArr[i12] = ' ';
                while (true) {
                    i = this.f15528c;
                    i4 = this.f15527b;
                    if (i >= i4) {
                        break;
                    }
                    char[] cArr3 = this.f15532g;
                    if (cArr3[i] != ' ') {
                        break;
                    }
                    int i13 = this.f15530e;
                    this.f15530e = i13 + 1;
                    cArr3[i13] = ' ';
                    this.f15528c = i + 1;
                }
                if (i == i4 || (c4 = this.f15532g[i]) == ',' || c4 == '+' || c4 == ';') {
                    break;
                }
            } else {
                if (c9 == ';') {
                    break;
                }
                if (c9 == '\\') {
                    int i14 = this.f15530e;
                    this.f15530e = i14 + 1;
                    cArr[i14] = e();
                    this.f15528c++;
                } else {
                    if (c9 == '+' || c9 == ',') {
                        break;
                    }
                    int i15 = this.f15530e;
                    this.f15530e = i15 + 1;
                    cArr[i15] = c9;
                    this.f15528c = i10 + 1;
                }
            }
        }
        int i16 = this.f15529d;
        return new String(cArr, i16, this.f15530e - i16);
    }

    private char e() {
        int i = this.f15528c + 1;
        this.f15528c = i;
        if (i == this.f15527b) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f15526a);
        }
        char c4 = this.f15532g[i];
        if (c4 == ' ' || c4 == '%' || c4 == '\\' || c4 == '_' || c4 == '\"' || c4 == '#') {
            return c4;
        }
        switch (c4) {
            case '*':
            case j.f5968R /* 43 */:
            case j.f5969S /* 44 */:
                return c4;
            default:
                switch (c4) {
                    case j.v.f12748n /* 59 */:
                    case '<':
                    case '=':
                    case '>':
                        return c4;
                    default:
                        return f();
                }
        }
    }

    private char f() {
        int i;
        int i4;
        int a9 = a(this.f15528c);
        this.f15528c++;
        if (a9 < 128) {
            return (char) a9;
        }
        if (a9 < 192 || a9 > 247) {
            return '?';
        }
        if (a9 <= 223) {
            i = a9 & 31;
            i4 = 1;
        } else if (a9 <= 239) {
            i = a9 & 15;
            i4 = 2;
        } else {
            i = a9 & 7;
            i4 = 3;
        }
        for (int i9 = 0; i9 < i4; i9++) {
            int i10 = this.f15528c;
            int i11 = i10 + 1;
            this.f15528c = i11;
            if (i11 == this.f15527b || this.f15532g[i11] != '\\') {
                return '?';
            }
            int i12 = i10 + 2;
            this.f15528c = i12;
            int a10 = a(i12);
            this.f15528c++;
            if ((a10 & 192) != 128) {
                return '?';
            }
            i = (i << 6) + (a10 & 63);
        }
        return (char) i;
    }

    private int a(int i) {
        int i4;
        int i9;
        int i10 = i + 1;
        if (i10 < this.f15527b) {
            char[] cArr = this.f15532g;
            char c4 = cArr[i];
            if (c4 >= '0' && c4 <= '9') {
                i4 = c4 - '0';
            } else if (c4 >= 'a' && c4 <= 'f') {
                i4 = c4 - 'W';
            } else {
                if (c4 < 'A' || c4 > 'F') {
                    throw new IllegalStateException("Malformed DN: " + this.f15526a);
                }
                i4 = c4 - '7';
            }
            char c9 = cArr[i10];
            if (c9 >= '0' && c9 <= '9') {
                i9 = c9 - '0';
            } else if (c9 >= 'a' && c9 <= 'f') {
                i9 = c9 - 'W';
            } else {
                if (c9 < 'A' || c9 > 'F') {
                    throw new IllegalStateException("Malformed DN: " + this.f15526a);
                }
                i9 = c9 - '7';
            }
            return (i4 << 4) + i9;
        }
        throw new IllegalStateException("Malformed DN: " + this.f15526a);
    }

    private String a(String str) {
        String str2;
        this.f15528c = 0;
        this.f15529d = 0;
        this.f15530e = 0;
        this.f15531f = 0;
        this.f15532g = this.f15526a.toCharArray();
        String a9 = a();
        if (a9 == null) {
            return null;
        }
        do {
            int i = this.f15528c;
            if (i == this.f15527b) {
                return null;
            }
            char c4 = this.f15532g[i];
            if (c4 == '\"') {
                int i4 = i + 1;
                this.f15528c = i4;
                this.f15529d = i4;
                this.f15530e = i4;
                while (true) {
                    int i9 = this.f15528c;
                    if (i9 != this.f15527b) {
                        char[] cArr = this.f15532g;
                        char c9 = cArr[i9];
                        if (c9 == '\"') {
                            this.f15528c = i9 + 1;
                            while (true) {
                                int i10 = this.f15528c;
                                if (i10 >= this.f15527b || this.f15532g[i10] != ' ') {
                                    break;
                                }
                                this.f15528c = i10 + 1;
                            }
                            char[] cArr2 = this.f15532g;
                            int i11 = this.f15529d;
                            str2 = new String(cArr2, i11, this.f15530e - i11);
                        } else {
                            if (c9 == '\\') {
                                cArr[this.f15530e] = e();
                            } else {
                                cArr[this.f15530e] = c9;
                            }
                            this.f15528c++;
                            this.f15530e++;
                        }
                    } else {
                        throw new IllegalStateException("Unexpected end of DN: " + this.f15526a);
                    }
                }
            } else if (c4 == '#') {
                str2 = c();
            } else if (c4 != '+' && c4 != ',' && c4 != ';') {
                str2 = d();
            } else {
                str2 = "";
            }
            if (str.equalsIgnoreCase(a9)) {
                return str2;
            }
            int i12 = this.f15528c;
            if (i12 >= this.f15527b) {
                return null;
            }
            char c10 = this.f15532g[i12];
            if (c10 != ',' && c10 != ';' && c10 != '+') {
                throw new IllegalStateException("Malformed DN: " + this.f15526a);
            }
            this.f15528c = i12 + 1;
            a9 = a();
        } while (a9 != null);
        throw new IllegalStateException("Malformed DN: " + this.f15526a);
    }
}
