package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.Reader;
import java.util.Arrays;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ihs implements Closeable {
    public long d;
    public int e;
    public String f;
    public String[] h;
    public int[] i;
    private final Reader j;
    private int[] n;
    public final char[] a = new char[1024];
    public int b = 0;
    private int k = 0;
    private int l = 0;
    private int m = 0;
    public int c = 0;
    public int g = 1;

    static {
        ikg.a = new ikg(null);
    }

    public ihs(Reader reader) {
        int[] iArr = new int[32];
        this.n = iArr;
        iArr[0] = 6;
        this.h = new String[32];
        this.i = new int[32];
        this.j = reader;
    }

    private final int k(boolean z) {
        int i;
        int i2 = this.b;
        int i3 = this.k;
        while (true) {
            if (i2 == i3) {
                this.b = i2;
                if (!n(1)) {
                    if (z) {
                        throw new EOFException("End of input".concat(d()));
                    }
                    return -1;
                }
                i2 = this.b;
                i3 = this.k;
            }
            char[] cArr = this.a;
            int i4 = i2 + 1;
            char c = cArr[i2];
            if (c == '\n') {
                this.l++;
                this.m = i4;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.b = i4;
                    if (i4 == i3) {
                        this.b = i2;
                        boolean n = n(2);
                        this.b++;
                        if (!n) {
                            return 47;
                        }
                    }
                    l();
                    int i5 = this.b;
                    char c2 = cArr[i5];
                    if (c2 == '*') {
                        this.b = i5 + 1;
                        while (true) {
                            if (this.b + 2 > this.k && !n(2)) {
                                throw b("Unterminated comment");
                            }
                            int i6 = this.b;
                            if (cArr[i6] != '\n') {
                                while (true) {
                                    int i7 = this.b;
                                    if (i >= 2) {
                                        i2 = i7 + 2;
                                        i3 = this.k;
                                        break;
                                    }
                                    i = cArr[i7 + i] == "*/".charAt(i) ? i + 1 : 0;
                                }
                            } else {
                                this.l++;
                                this.m = i6 + 1;
                            }
                            this.b++;
                        }
                    } else {
                        if (c2 != '/') {
                            return 47;
                        }
                        this.b = i5 + 1;
                        m();
                        i2 = this.b;
                        i3 = this.k;
                    }
                } else {
                    if (c != '#') {
                        this.b = i4;
                        return c;
                    }
                    this.b = i4;
                    l();
                    m();
                    i2 = this.b;
                    i3 = this.k;
                }
            }
            i2 = i4;
        }
    }

    private final void l() {
        throw b("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
    }

    private final void m() {
        char c;
        do {
            if (this.b >= this.k && !n(1)) {
                return;
            }
            char[] cArr = this.a;
            int i = this.b;
            int i2 = i + 1;
            this.b = i2;
            c = cArr[i];
            if (c == '\n') {
                this.l++;
                this.m = i2;
                return;
            }
        } while (c != '\r');
    }

    private final boolean n(int i) {
        int i2;
        int i3 = this.m;
        int i4 = this.b;
        this.m = i3 - i4;
        char[] cArr = this.a;
        int i5 = this.k;
        if (i5 != i4) {
            int i6 = i5 - i4;
            this.k = i6;
            System.arraycopy(cArr, i4, cArr, 0, i6);
        } else {
            this.k = 0;
        }
        this.b = 0;
        do {
            Reader reader = this.j;
            int i7 = this.k;
            int read = reader.read(cArr, i7, 1024 - i7);
            if (read == -1) {
                return false;
            }
            i2 = this.k + read;
            this.k = i2;
            if (this.l == 0 && this.m == 0 && i2 > 0 && cArr[0] == 65279) {
                this.b++;
                this.m = 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    private final boolean o(char c) {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        l();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x01c3, code lost:
    
        r23 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01c9, code lost:
    
        if (o(r13) == false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01cd, code lost:
    
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01ce, code lost:
    
        if (r9 != r1) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01d0, code lost:
    
        if (r10 == false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01d6, code lost:
    
        if (r23 != Long.MIN_VALUE) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01d8, code lost:
    
        if (r18 == false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01df, code lost:
    
        if (r23 != 0) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01e1, code lost:
    
        if (r8 != false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01e9, code lost:
    
        r6 = -r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01ec, code lost:
    
        r27.d = r6;
        r27.b += r4;
        r27.c = 15;
        r6 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01e4, code lost:
    
        if (r8 == false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01e6, code lost:
    
        r6 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01db, code lost:
    
        r8 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01fa, code lost:
    
        r7 = 2;
        r9 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01fe, code lost:
    
        if (r9 == r7) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0201, code lost:
    
        if (r9 == 4) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0204, code lost:
    
        if (r9 != 7) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0206, code lost:
    
        r27.e = r4;
        r6 = 16;
        r27.c = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01fd, code lost:
    
        r7 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:141:0x025a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0240 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0241  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a() {
        int k;
        String str;
        String str2;
        int i;
        char c;
        long j;
        int i2;
        int[] iArr = this.n;
        int i3 = this.g - 1;
        int i4 = iArr[i3];
        int i5 = 3;
        char c2 = 2;
        boolean z = true;
        if (i4 == 1) {
            iArr[i3] = 2;
        } else {
            if (i4 != 2) {
                if (i4 == 3 || i4 == 5) {
                    iArr[i3] = 4;
                    if (i4 == 5 && (k = k(true)) != 44) {
                        if (k != 59) {
                            if (k != 125) {
                                throw b("Unterminated object");
                            }
                            i5 = 2;
                        } else {
                            l();
                        }
                    }
                    int k2 = k(true);
                    if (k2 == 34) {
                        i5 = 13;
                    } else {
                        if (k2 == 39) {
                            l();
                            this.c = 12;
                            return 12;
                        }
                        if (k2 != 125) {
                            l();
                            this.b--;
                            if (!o((char) k2)) {
                                throw b("Expected name");
                            }
                            i5 = 14;
                        } else {
                            if (i4 == 5) {
                                throw b("Expected name");
                            }
                            i5 = 2;
                        }
                    }
                } else if (i4 == 4) {
                    iArr[i3] = 5;
                    int k3 = k(true);
                    if (k3 != 58) {
                        if (k3 != 61) {
                            throw b("Expected ':'");
                        }
                        l();
                        if (this.b < this.k || n(1)) {
                            char[] cArr = this.a;
                            int i6 = this.b;
                            if (cArr[i6] == '>') {
                                this.b = i6 + 1;
                            }
                        }
                    }
                } else if (i4 == 6) {
                    iArr[i3] = 7;
                } else if (i4 == 7) {
                    if (k(false) == -1) {
                        i5 = 17;
                    } else {
                        l();
                        this.b--;
                    }
                } else if (i4 == 8) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                this.c = i5;
                return i5;
            }
            int k4 = k(true);
            if (k4 != 44) {
                if (k4 != 59) {
                    if (k4 != 93) {
                        throw b("Unterminated array");
                    }
                    i5 = 4;
                    this.c = i5;
                    return i5;
                }
                l();
            }
        }
        int k5 = k(true);
        if (k5 != 34) {
            if (k5 == 39) {
                l();
                this.c = 8;
                return 8;
            }
            if (k5 != 44 && k5 != 59) {
                if (k5 != 91) {
                    if (k5 != 93) {
                        if (k5 != 123) {
                            int i7 = this.b - 1;
                            this.b = i7;
                            char[] cArr2 = this.a;
                            char c3 = cArr2[i7];
                            if (c3 == 't' || c3 == 'T') {
                                str = "TRUE";
                                str2 = "true";
                                i = 5;
                            } else if (c3 == 'f' || c3 == 'F') {
                                str = "FALSE";
                                str2 = "false";
                                i = 6;
                            } else {
                                if (c3 == 'n' || c3 == 'N') {
                                    str = "NULL";
                                    str2 = "null";
                                    i = 7;
                                }
                                i = 0;
                                if (i == 0) {
                                    return i;
                                }
                                int i8 = this.b;
                                int i9 = this.k;
                                int i10 = 0;
                                char c4 = 0;
                                boolean z2 = false;
                                boolean z3 = true;
                                long j2 = 0;
                                while (true) {
                                    if (i8 + i10 == i9) {
                                        if (i10 == 1024) {
                                            break;
                                        }
                                        if (!n(i10 + 1)) {
                                            char c5 = c2;
                                            long j3 = j2;
                                            break;
                                        }
                                        i8 = this.b;
                                        i9 = this.k;
                                    }
                                    char c6 = cArr2[i8 + i10];
                                    if (c6 != '+') {
                                        if (c6 == 'E' || c6 == 'e') {
                                            long j4 = j2;
                                            if (c4 != c2 && c4 != 4) {
                                                break;
                                            }
                                            j2 = j4;
                                            c4 = 5;
                                            i10++;
                                            c2 = 2;
                                        } else if (c6 == '-') {
                                            j = j2;
                                            if (c4 == 0) {
                                                j2 = j;
                                                c4 = 1;
                                                z2 = true;
                                                i10++;
                                                c2 = 2;
                                            } else {
                                                if (c4 != 5) {
                                                    break;
                                                }
                                                j2 = j;
                                                c4 = 6;
                                                i10++;
                                                c2 = 2;
                                            }
                                        } else if (c6 == '.') {
                                            long j5 = j2;
                                            if (c4 != c2) {
                                                break;
                                            }
                                            j2 = j5;
                                            c4 = 3;
                                            i10++;
                                            c2 = 2;
                                        } else {
                                            if (c6 < '0' || c6 > '9') {
                                                break;
                                            }
                                            if (c4 == 1 || c4 == 0) {
                                                j2 = -(c6 - '0');
                                                c4 = 2;
                                            } else if (c4 != c2) {
                                                long j6 = j2;
                                                if (c4 == 3) {
                                                    j2 = j6;
                                                    c4 = 4;
                                                } else if (c4 == 5 || c4 == 6) {
                                                    j2 = j6;
                                                    c4 = 7;
                                                } else {
                                                    j2 = j6;
                                                }
                                            } else {
                                                if (j2 == 0) {
                                                    break;
                                                }
                                                long j7 = (10 * j2) - (c6 - '0');
                                                z3 &= j2 > -922337203685477580L || (j2 == -922337203685477580L && j7 < j2);
                                                j2 = j7;
                                            }
                                            i10++;
                                            c2 = 2;
                                        }
                                        if (i2 == 0) {
                                            return i2;
                                        }
                                        if (!o(cArr2[this.b])) {
                                            throw b("Expected value");
                                        }
                                        l();
                                        this.c = 10;
                                        return 10;
                                    }
                                    j = j2;
                                    if (c4 != 5) {
                                        break;
                                    }
                                    j2 = j;
                                    c4 = 6;
                                    i10++;
                                    c2 = 2;
                                }
                                i2 = 0;
                                if (i2 == 0) {
                                }
                            }
                            int i11 = 0;
                            while (true) {
                                int length = str2.length();
                                int i12 = this.b;
                                if (i11 < length) {
                                    if ((i12 + i11 >= this.k && !n(i11 + 1)) || ((c = cArr2[this.b + i11]) != str2.charAt(i11) && c != str.charAt(i11))) {
                                        break;
                                    }
                                    i11++;
                                } else if ((i12 + length >= this.k && !n(length + 1)) || !o(cArr2[this.b + length])) {
                                    this.b += length;
                                    this.c = i;
                                }
                            }
                            i = 0;
                            if (i == 0) {
                            }
                        } else {
                            i5 = 1;
                        }
                    } else if (i4 == 1) {
                        i5 = 4;
                    }
                }
            }
            if (i4 != 1 && i4 != 2) {
                throw b("Unexpected value");
            }
            l();
            this.b--;
            this.c = 7;
            return 7;
        }
        i5 = 9;
        this.c = i5;
        return i5;
    }

    public final iht b(String str) {
        throw new iht(str + d() + "\nSee https://github.com/google/gson/blob/main/Troubleshooting.md#malformed-json");
    }

    public final IllegalStateException c(String str) {
        String str2;
        int i = i();
        switch (i()) {
            case 1:
                str2 = "BEGIN_ARRAY";
                break;
            case 2:
                str2 = "END_ARRAY";
                break;
            case 3:
                str2 = "BEGIN_OBJECT";
                break;
            case 4:
                str2 = "END_OBJECT";
                break;
            case 5:
                str2 = "NAME";
                break;
            case 6:
                str2 = "STRING";
                break;
            case 7:
                str2 = "NUMBER";
                break;
            case 8:
                str2 = "BOOLEAN";
                break;
            case 9:
                str2 = "NULL";
                break;
            default:
                str2 = "END_DOCUMENT";
                break;
        }
        String d = d();
        StringBuilder sb = new StringBuilder("Expected ");
        sb.append(str);
        sb.append(" but was ");
        sb.append(str2);
        sb.append(d);
        sb.append("\nSee ");
        sb.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(i == 9 ? "adapter-not-null-safe" : "unexpected-json-structure"));
        return new IllegalStateException(sb.toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c = 0;
        this.n[0] = 8;
        this.g = 1;
        this.j.close();
    }

    public final String d() {
        int i = this.l + 1;
        int i2 = this.b - this.m;
        return " at line " + i + " column " + (i2 + 1) + " path " + j();
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0118, code lost:
    
        r0 = new java.lang.StringBuilder(java.lang.Math.max(r3 + r3, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0124, code lost:
    
        r0.append(r4, r2, r3);
        r10.b = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00db, code lost:
    
        throw b("Malformed Unicode escape \\u".concat(new java.lang.String(r4, r10.b, 4)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0114, code lost:
    
        r3 = r1 - r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0116, code lost:
    
        if (r0 != null) goto L90;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String e(char c) {
        int i;
        StringBuilder sb = null;
        loop0: do {
            int i2 = this.b;
            int i3 = this.k;
            int i4 = i2;
            while (true) {
                char[] cArr = this.a;
                if (i2 >= i3) {
                    break;
                }
                int i5 = i2 + 1;
                char c2 = cArr[i2];
                if (c2 == c) {
                    int i6 = (i5 - i4) - 1;
                    this.b = i5;
                    if (sb == null) {
                        return new String(cArr, i4, i6);
                    }
                    sb.append(cArr, i4, i6);
                    return sb.toString();
                }
                char c3 = '\n';
                if (c2 == '\\') {
                    int i7 = i5 - i4;
                    int i8 = i7 - 1;
                    this.b = i5;
                    if (sb == null) {
                        sb = new StringBuilder(Math.max(i7 + i7, 16));
                    }
                    sb.append(cArr, i4, i8);
                    if (this.b == this.k && !n(1)) {
                        throw b("Unterminated escape sequence");
                    }
                    int i9 = this.b;
                    int i10 = i9 + 1;
                    this.b = i10;
                    char c4 = cArr[i9];
                    if (c4 == '\n') {
                        this.l++;
                        this.m = i10;
                    } else if (c4 != '\"' && c4 != '\'' && c4 != '/' && c4 != '\\') {
                        if (c4 == 'b') {
                            c3 = '\b';
                        } else if (c4 == 'f') {
                            c3 = '\f';
                        } else if (c4 != 'n') {
                            if (c4 == 'r') {
                                c3 = '\r';
                            } else if (c4 == 't') {
                                c3 = '\t';
                            } else {
                                if (c4 != 'u') {
                                    throw b("Invalid escape sequence");
                                }
                                if (i9 + 5 > this.k && !n(4)) {
                                    throw b("Unterminated escape sequence");
                                }
                                int i11 = this.b;
                                int i12 = i11 + 4;
                                int i13 = 0;
                                while (i11 < i12) {
                                    int i14 = i13 << 4;
                                    char c5 = cArr[i11];
                                    if (c5 >= '0' && c5 <= '9') {
                                        i = c5 - '0';
                                    } else if (c5 >= 'a' && c5 <= 'f') {
                                        i = c5 - 'W';
                                    } else {
                                        if (c5 < 'A' || c5 > 'F') {
                                            break loop0;
                                        }
                                        i = c5 - '7';
                                    }
                                    i13 = i14 + i;
                                    i11++;
                                }
                                this.b += 4;
                                c3 = (char) i13;
                            }
                        }
                        sb.append(c3);
                        i4 = this.b;
                        i3 = this.k;
                        i2 = i4;
                    }
                    c3 = c4;
                    sb.append(c3);
                    i4 = this.b;
                    i3 = this.k;
                    i2 = i4;
                } else {
                    if (c2 == '\n') {
                        this.l++;
                        this.m = i5;
                    }
                    i2 = i5;
                }
            }
        } while (n(1));
        throw b("Unterminated string");
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0048, code lost:
    
        l();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:55:0x0042. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String f() {
        String sb;
        int i = 0;
        StringBuilder sb2 = null;
        do {
            int i2 = 0;
            while (true) {
                int i3 = this.b + i2;
                if (i3 < this.k) {
                    char c = this.a[i3];
                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                        if (c != '#') {
                            if (c != ',') {
                                if (c != '/' && c != '=') {
                                    if (c != '{' && c != '}' && c != ':') {
                                        if (c != ';') {
                                            switch (c) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i2++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (i2 >= 1024) {
                    if (sb2 == null) {
                        sb2 = new StringBuilder(Math.max(i2, 16));
                    }
                    sb2.append(this.a, this.b, i2);
                    this.b += i2;
                } else if (n(i2 + 1)) {
                }
            }
            i = i2;
            char[] cArr = this.a;
            if (sb2 != null) {
                sb = new String(cArr, this.b, i);
            } else {
                sb2.append(cArr, this.b, i);
                sb = sb2.toString();
            }
            this.b += i;
            return sb;
        } while (n(1));
        char[] cArr2 = this.a;
        if (sb2 != null) {
        }
        this.b += i;
        return sb;
    }

    public final void g(int i) {
        int i2 = this.g;
        if (i2 - 1 >= 1280) {
            throw new iht("Nesting limit 1280 reached" + d());
        }
        int[] iArr = this.n;
        if (i2 == iArr.length) {
            int i3 = i2 + i2;
            this.n = Arrays.copyOf(iArr, i3);
            this.i = Arrays.copyOf(this.i, i3);
            this.h = (String[]) Arrays.copyOf(this.h, i3);
        }
        int[] iArr2 = this.n;
        int i4 = this.g;
        this.g = i4 + 1;
        iArr2[i4] = i;
    }

    public final boolean h() {
        int i = this.c;
        if (i == 0) {
            i = a();
        }
        return (i == 2 || i == 4 || i == 17) ? false : true;
    }

    public final int i() {
        int i = this.c;
        if (i == 0) {
            i = a();
        }
        switch (i) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return 5;
            case 15:
            case 16:
                return 7;
            default:
                return 10;
        }
    }

    public final String j() {
        StringBuilder sb = new StringBuilder("$");
        for (int i = 0; i < this.g; i++) {
            int i2 = this.n[i];
            switch (i2) {
                case 1:
                case 2:
                    int i3 = this.i[i];
                    sb.append('[');
                    sb.append(i3);
                    sb.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb.append('.');
                    String str = this.h[i];
                    if (str != null) {
                        sb.append(str);
                        break;
                    } else {
                        break;
                    }
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    throw new AssertionError(a.Y(i2, "Unknown scope value: "));
            }
        }
        return sb.toString();
    }

    public final String toString() {
        return String.valueOf(getClass().getSimpleName()).concat(d());
    }
}
