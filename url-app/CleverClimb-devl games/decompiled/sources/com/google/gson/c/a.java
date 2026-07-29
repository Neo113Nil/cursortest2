package com.google.gson.c;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;

/* compiled from: JsonReader.java */
/* loaded from: classes2.dex */
public class a implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    private static final char[] f6496b = ")]}'\n".toCharArray();

    /* renamed from: c, reason: collision with root package name */
    private final Reader f6498c;
    private long j;
    private int k;
    private String l;
    private int n;
    private String[] o;
    private int[] p;

    /* renamed from: d, reason: collision with root package name */
    private boolean f6499d = false;
    private final char[] e = new char[1024];
    private int f = 0;
    private int g = 0;
    private int h = 0;
    private int i = 0;

    /* renamed from: a, reason: collision with root package name */
    int f6497a = 0;
    private int[] m = new int[32];

    static {
        com.google.gson.internal.d.f6638a = new com.google.gson.internal.d() { // from class: com.google.gson.c.a.1
            @Override // com.google.gson.internal.d
            public void a(a aVar) throws IOException {
                if (aVar instanceof com.google.gson.internal.bind.c) {
                    ((com.google.gson.internal.bind.c) aVar).o();
                    return;
                }
                int i = aVar.f6497a;
                if (i == 0) {
                    i = aVar.r();
                }
                if (i == 13) {
                    aVar.f6497a = 9;
                    return;
                }
                if (i == 12) {
                    aVar.f6497a = 8;
                    return;
                }
                if (i == 14) {
                    aVar.f6497a = 10;
                    return;
                }
                throw new IllegalStateException("Expected a name but was " + aVar.f() + aVar.s());
            }
        };
    }

    public a(Reader reader) {
        this.n = 0;
        int[] iArr = this.m;
        int i = this.n;
        this.n = i + 1;
        iArr[i] = 6;
        this.o = new String[32];
        this.p = new int[32];
        if (reader == null) {
            throw new NullPointerException("in == null");
        }
        this.f6498c = reader;
    }

    public final void a(boolean z) {
        this.f6499d = z;
    }

    public final boolean q() {
        return this.f6499d;
    }

    public void a() throws IOException {
        int i = this.f6497a;
        if (i == 0) {
            i = r();
        }
        if (i == 3) {
            a(1);
            this.p[this.n - 1] = 0;
            this.f6497a = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + f() + s());
        }
    }

    public void b() throws IOException {
        int i = this.f6497a;
        if (i == 0) {
            i = r();
        }
        if (i == 4) {
            this.n--;
            int[] iArr = this.p;
            int i2 = this.n - 1;
            iArr[i2] = iArr[i2] + 1;
            this.f6497a = 0;
            return;
        }
        throw new IllegalStateException("Expected END_ARRAY but was " + f() + s());
    }

    public void c() throws IOException {
        int i = this.f6497a;
        if (i == 0) {
            i = r();
        }
        if (i == 1) {
            a(3);
            this.f6497a = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + f() + s());
        }
    }

    public void d() throws IOException {
        int i = this.f6497a;
        if (i == 0) {
            i = r();
        }
        if (i == 2) {
            this.n--;
            this.o[this.n] = null;
            int[] iArr = this.p;
            int i2 = this.n - 1;
            iArr[i2] = iArr[i2] + 1;
            this.f6497a = 0;
            return;
        }
        throw new IllegalStateException("Expected END_OBJECT but was " + f() + s());
    }

    public boolean e() throws IOException {
        int i = this.f6497a;
        if (i == 0) {
            i = r();
        }
        return (i == 2 || i == 4) ? false : true;
    }

    public b f() throws IOException {
        int i = this.f6497a;
        if (i == 0) {
            i = r();
        }
        switch (i) {
            case 1:
                return b.BEGIN_OBJECT;
            case 2:
                return b.END_OBJECT;
            case 3:
                return b.BEGIN_ARRAY;
            case 4:
                return b.END_ARRAY;
            case 5:
            case 6:
                return b.BOOLEAN;
            case 7:
                return b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return b.STRING;
            case 12:
            case 13:
            case 14:
                return b.NAME;
            case 15:
            case 16:
                return b.NUMBER;
            case 17:
                return b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    int r() throws IOException {
        int b2;
        int i = this.m[this.n - 1];
        if (i == 1) {
            this.m[this.n - 1] = 2;
        } else if (i == 2) {
            int b3 = b(true);
            if (b3 != 44) {
                if (b3 != 59) {
                    if (b3 == 93) {
                        this.f6497a = 4;
                        return 4;
                    }
                    throw b("Unterminated array");
                }
                w();
            }
        } else {
            if (i == 3 || i == 5) {
                this.m[this.n - 1] = 4;
                if (i == 5 && (b2 = b(true)) != 44) {
                    if (b2 != 59) {
                        if (b2 == 125) {
                            this.f6497a = 2;
                            return 2;
                        }
                        throw b("Unterminated object");
                    }
                    w();
                }
                int b4 = b(true);
                if (b4 == 34) {
                    this.f6497a = 13;
                    return 13;
                }
                if (b4 == 39) {
                    w();
                    this.f6497a = 12;
                    return 12;
                }
                if (b4 == 125) {
                    if (i != 5) {
                        this.f6497a = 2;
                        return 2;
                    }
                    throw b("Expected name");
                }
                w();
                this.f--;
                if (a((char) b4)) {
                    this.f6497a = 14;
                    return 14;
                }
                throw b("Expected name");
            }
            if (i == 4) {
                this.m[this.n - 1] = 5;
                int b5 = b(true);
                if (b5 != 58) {
                    if (b5 == 61) {
                        w();
                        if ((this.f < this.g || b(1)) && this.e[this.f] == '>') {
                            this.f++;
                        }
                    } else {
                        throw b("Expected ':'");
                    }
                }
            } else if (i == 6) {
                if (this.f6499d) {
                    z();
                }
                this.m[this.n - 1] = 7;
            } else if (i == 7) {
                if (b(false) == -1) {
                    this.f6497a = 17;
                    return 17;
                }
                w();
                this.f--;
            } else if (i == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int b6 = b(true);
        if (b6 == 34) {
            this.f6497a = 9;
            return 9;
        }
        if (b6 == 39) {
            w();
            this.f6497a = 8;
            return 8;
        }
        if (b6 != 44 && b6 != 59) {
            if (b6 == 91) {
                this.f6497a = 3;
                return 3;
            }
            if (b6 != 93) {
                if (b6 == 123) {
                    this.f6497a = 1;
                    return 1;
                }
                this.f--;
                int o = o();
                if (o != 0) {
                    return o;
                }
                int t = t();
                if (t != 0) {
                    return t;
                }
                if (!a(this.e[this.f])) {
                    throw b("Expected value");
                }
                w();
                this.f6497a = 10;
                return 10;
            }
            if (i == 1) {
                this.f6497a = 4;
                return 4;
            }
        }
        if (i == 1 || i == 2) {
            w();
            this.f--;
            this.f6497a = 7;
            return 7;
        }
        throw b("Unexpected value");
    }

    private int o() throws IOException {
        String str;
        String str2;
        int i;
        char c2 = this.e[this.f];
        if (c2 == 't' || c2 == 'T') {
            str = "true";
            str2 = "TRUE";
            i = 5;
        } else if (c2 == 'f' || c2 == 'F') {
            str = "false";
            str2 = "FALSE";
            i = 6;
        } else {
            if (c2 != 'n' && c2 != 'N') {
                return 0;
            }
            str = "null";
            str2 = "NULL";
            i = 7;
        }
        int length = str.length();
        for (int i2 = 1; i2 < length; i2++) {
            if (this.f + i2 >= this.g && !b(i2 + 1)) {
                return 0;
            }
            char c3 = this.e[this.f + i2];
            if (c3 != str.charAt(i2) && c3 != str2.charAt(i2)) {
                return 0;
            }
        }
        if ((this.f + length < this.g || b(length + 1)) && a(this.e[this.f + length])) {
            return 0;
        }
        this.f += length;
        this.f6497a = i;
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0097, code lost:
    
        if (r9 != 2) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0099, code lost:
    
        if (r10 == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x009f, code lost:
    
        if (r11 != Long.MIN_VALUE) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00a1, code lost:
    
        if (r13 == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a7, code lost:
    
        if (r11 != 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a9, code lost:
    
        if (r13 != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ab, code lost:
    
        if (r13 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ae, code lost:
    
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00af, code lost:
    
        r18.j = r11;
        r18.f += r3;
        r18.f6497a = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ba, code lost:
    
        return 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00bb, code lost:
    
        if (r9 == 2) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00be, code lost:
    
        if (r9 == 4) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c1, code lost:
    
        if (r9 != 7) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c4, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c6, code lost:
    
        r18.k = r3;
        r18.f6497a = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00cc, code lost:
    
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0095, code lost:
    
        if (a(r14) != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00cd, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int t() throws IOException {
        char[] cArr = this.e;
        int i = this.f;
        int i2 = 0;
        int i3 = this.g;
        int i4 = 0;
        char c2 = 0;
        boolean z = true;
        long j = 0;
        boolean z2 = false;
        while (true) {
            if (i + i4 == i3) {
                if (i4 == cArr.length) {
                    return i2;
                }
                if (b(i4 + 1)) {
                    i = this.f;
                    i3 = this.g;
                }
            }
            char c3 = cArr[i + i4];
            if (c3 != '+') {
                if (c3 != 'E' && c3 != 'e') {
                    switch (c3) {
                        case '-':
                            i2 = 0;
                            if (c2 == 0) {
                                c2 = 1;
                                z2 = true;
                                break;
                            } else if (c2 != 5) {
                                return 0;
                            }
                            break;
                        case '.':
                            i2 = 0;
                            if (c2 != 2) {
                                return 0;
                            }
                            c2 = 3;
                            break;
                        default:
                            if (c3 >= '0' && c3 <= '9') {
                                if (c2 == 1 || c2 == 0) {
                                    j = -(c3 - '0');
                                    i2 = 0;
                                    c2 = 2;
                                } else {
                                    if (c2 == 2) {
                                        if (j == 0) {
                                            return 0;
                                        }
                                        long j2 = (10 * j) - (c3 - '0');
                                        boolean z3 = j > -922337203685477580L || (j == -922337203685477580L && j2 < j);
                                        j = j2;
                                        z = z3 & z;
                                    } else if (c2 == 3) {
                                        i2 = 0;
                                        c2 = 4;
                                    } else if (c2 == 5 || c2 == 6) {
                                        i2 = 0;
                                        c2 = 7;
                                    }
                                    i2 = 0;
                                }
                                break;
                            }
                            break;
                    }
                } else {
                    i2 = 0;
                    if (c2 != 2 && c2 != 4) {
                        return 0;
                    }
                    c2 = 5;
                }
                i4++;
            } else {
                i2 = 0;
                if (c2 != 5) {
                    return 0;
                }
            }
            c2 = 6;
            i4++;
        }
    }

    private boolean a(char c2) throws IOException {
        switch (c2) {
            case '\t':
            case '\n':
            case '\f':
            case '\r':
            case ' ':
            case ',':
            case ':':
            case '[':
            case ']':
            case '{':
            case '}':
                return false;
            case '#':
            case '/':
            case ';':
            case '=':
            case '\\':
                w();
                return false;
            default:
                return true;
        }
    }

    public String g() throws IOException {
        String b2;
        int i = this.f6497a;
        if (i == 0) {
            i = r();
        }
        if (i == 14) {
            b2 = u();
        } else if (i == 12) {
            b2 = b('\'');
        } else if (i == 13) {
            b2 = b('\"');
        } else {
            throw new IllegalStateException("Expected a name but was " + f() + s());
        }
        this.f6497a = 0;
        this.o[this.n - 1] = b2;
        return b2;
    }

    public String h() throws IOException {
        String str;
        int i = this.f6497a;
        if (i == 0) {
            i = r();
        }
        if (i == 10) {
            str = u();
        } else if (i == 8) {
            str = b('\'');
        } else if (i == 9) {
            str = b('\"');
        } else if (i == 11) {
            str = this.l;
            this.l = null;
        } else if (i == 15) {
            str = Long.toString(this.j);
        } else if (i == 16) {
            str = new String(this.e, this.f, this.k);
            this.f += this.k;
        } else {
            throw new IllegalStateException("Expected a string but was " + f() + s());
        }
        this.f6497a = 0;
        int[] iArr = this.p;
        int i2 = this.n - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    public boolean i() throws IOException {
        int i = this.f6497a;
        if (i == 0) {
            i = r();
        }
        if (i == 5) {
            this.f6497a = 0;
            int[] iArr = this.p;
            int i2 = this.n - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        }
        if (i == 6) {
            this.f6497a = 0;
            int[] iArr2 = this.p;
            int i3 = this.n - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        }
        throw new IllegalStateException("Expected a boolean but was " + f() + s());
    }

    public void j() throws IOException {
        int i = this.f6497a;
        if (i == 0) {
            i = r();
        }
        if (i == 7) {
            this.f6497a = 0;
            int[] iArr = this.p;
            int i2 = this.n - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + f() + s());
    }

    public double k() throws IOException {
        int i = this.f6497a;
        if (i == 0) {
            i = r();
        }
        if (i == 15) {
            this.f6497a = 0;
            int[] iArr = this.p;
            int i2 = this.n - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.j;
        }
        if (i == 16) {
            this.l = new String(this.e, this.f, this.k);
            this.f += this.k;
        } else if (i == 8 || i == 9) {
            this.l = b(i == 8 ? '\'' : '\"');
        } else if (i == 10) {
            this.l = u();
        } else if (i != 11) {
            throw new IllegalStateException("Expected a double but was " + f() + s());
        }
        this.f6497a = 11;
        double parseDouble = Double.parseDouble(this.l);
        if (!this.f6499d && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw new d("JSON forbids NaN and infinities: " + parseDouble + s());
        }
        this.l = null;
        this.f6497a = 0;
        int[] iArr2 = this.p;
        int i3 = this.n - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return parseDouble;
    }

    public long l() throws IOException {
        int i = this.f6497a;
        if (i == 0) {
            i = r();
        }
        if (i == 15) {
            this.f6497a = 0;
            int[] iArr = this.p;
            int i2 = this.n - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.j;
        }
        if (i == 16) {
            this.l = new String(this.e, this.f, this.k);
            this.f += this.k;
        } else if (i == 8 || i == 9 || i == 10) {
            if (i == 10) {
                this.l = u();
            } else {
                this.l = b(i == 8 ? '\'' : '\"');
            }
            try {
                long parseLong = Long.parseLong(this.l);
                this.f6497a = 0;
                int[] iArr2 = this.p;
                int i3 = this.n - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw new IllegalStateException("Expected a long but was " + f() + s());
        }
        this.f6497a = 11;
        double parseDouble = Double.parseDouble(this.l);
        long j = (long) parseDouble;
        if (j != parseDouble) {
            throw new NumberFormatException("Expected a long but was " + this.l + s());
        }
        this.l = null;
        this.f6497a = 0;
        int[] iArr3 = this.p;
        int i4 = this.n - 1;
        iArr3[i4] = iArr3[i4] + 1;
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005b, code lost:
    
        if (r1 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005d, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r4) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006b, code lost:
    
        r1.append(r0, r4, r2 - r4);
        r9.f = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String b(char c2) throws IOException {
        char[] cArr = this.e;
        StringBuilder sb = null;
        do {
            int i = this.f;
            int i2 = this.g;
            while (true) {
                int i3 = i;
                while (i < i2) {
                    int i4 = i + 1;
                    char c3 = cArr[i];
                    if (c3 == c2) {
                        this.f = i4;
                        int i5 = (i4 - i3) - 1;
                        if (sb == null) {
                            return new String(cArr, i3, i5);
                        }
                        sb.append(cArr, i3, i5);
                        return sb.toString();
                    }
                    if (c3 == '\\') {
                        this.f = i4;
                        int i6 = (i4 - i3) - 1;
                        if (sb == null) {
                            sb = new StringBuilder(Math.max((i6 + 1) * 2, 16));
                        }
                        sb.append(cArr, i3, i6);
                        sb.append(y());
                        i = this.f;
                        i2 = this.g;
                    } else {
                        if (c3 == '\n') {
                            this.h++;
                            this.i = i4;
                        }
                        i = i4;
                    }
                }
                break;
            }
        } while (b(1));
        throw b("Unterminated string");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        r0 = r1;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x0012. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String u() throws IOException {
        String sb;
        int i = 0;
        StringBuilder sb2 = null;
        do {
            int i2 = 0;
            while (true) {
                if (this.f + i2 < this.g) {
                    switch (this.e[this.f + i2]) {
                        case '\t':
                        case '\n':
                        case '\f':
                        case '\r':
                        case ' ':
                        case ',':
                        case ':':
                        case '[':
                        case ']':
                        case '{':
                        case '}':
                            break;
                        case '#':
                        case '/':
                        case ';':
                        case '=':
                        case '\\':
                            w();
                            break;
                        default:
                            i2++;
                    }
                } else if (i2 < this.e.length) {
                    if (b(i2 + 1)) {
                    }
                } else {
                    if (sb2 == null) {
                        sb2 = new StringBuilder(Math.max(i2, 16));
                    }
                    sb2.append(this.e, this.f, i2);
                    this.f += i2;
                }
            }
            if (sb2 != null) {
                sb = new String(this.e, this.f, i);
            } else {
                sb2.append(this.e, this.f, i);
                sb = sb2.toString();
            }
            this.f += i;
            return sb;
        } while (b(1));
        if (sb2 != null) {
        }
        this.f += i;
        return sb;
    }

    private void c(char c2) throws IOException {
        char[] cArr = this.e;
        do {
            int i = this.f;
            int i2 = this.g;
            while (i < i2) {
                int i3 = i + 1;
                char c3 = cArr[i];
                if (c3 == c2) {
                    this.f = i3;
                    return;
                }
                if (c3 == '\\') {
                    this.f = i3;
                    y();
                    i = this.f;
                    i2 = this.g;
                } else {
                    if (c3 == '\n') {
                        this.h++;
                        this.i = i3;
                    }
                    i = i3;
                }
            }
            this.f = i;
        } while (b(1));
        throw b("Unterminated string");
    }

    private void v() throws IOException {
        do {
            int i = 0;
            while (this.f + i < this.g) {
                switch (this.e[this.f + i]) {
                    case '\t':
                    case '\n':
                    case '\f':
                    case '\r':
                    case ' ':
                    case ',':
                    case ':':
                    case '[':
                    case ']':
                    case '{':
                    case '}':
                        break;
                    case '#':
                    case '/':
                    case ';':
                    case '=':
                    case '\\':
                        w();
                        break;
                    default:
                        i++;
                }
                this.f += i;
                return;
            }
            this.f += i;
        } while (b(1));
    }

    public int m() throws IOException {
        int i = this.f6497a;
        if (i == 0) {
            i = r();
        }
        if (i == 15) {
            int i2 = (int) this.j;
            if (this.j != i2) {
                throw new NumberFormatException("Expected an int but was " + this.j + s());
            }
            this.f6497a = 0;
            int[] iArr = this.p;
            int i3 = this.n - 1;
            iArr[i3] = iArr[i3] + 1;
            return i2;
        }
        if (i == 16) {
            this.l = new String(this.e, this.f, this.k);
            this.f += this.k;
        } else if (i == 8 || i == 9 || i == 10) {
            if (i == 10) {
                this.l = u();
            } else {
                this.l = b(i == 8 ? '\'' : '\"');
            }
            try {
                int parseInt = Integer.parseInt(this.l);
                this.f6497a = 0;
                int[] iArr2 = this.p;
                int i4 = this.n - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw new IllegalStateException("Expected an int but was " + f() + s());
        }
        this.f6497a = 11;
        double parseDouble = Double.parseDouble(this.l);
        int i5 = (int) parseDouble;
        if (i5 != parseDouble) {
            throw new NumberFormatException("Expected an int but was " + this.l + s());
        }
        this.l = null;
        this.f6497a = 0;
        int[] iArr3 = this.p;
        int i6 = this.n - 1;
        iArr3[i6] = iArr3[i6] + 1;
        return i5;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f6497a = 0;
        this.m[0] = 8;
        this.n = 1;
        this.f6498c.close();
    }

    public void n() throws IOException {
        int i = 0;
        do {
            int i2 = this.f6497a;
            if (i2 == 0) {
                i2 = r();
            }
            if (i2 == 3) {
                a(1);
                i++;
            } else if (i2 == 1) {
                a(3);
                i++;
            } else if (i2 == 4) {
                this.n--;
                i--;
            } else if (i2 == 2) {
                this.n--;
                i--;
            } else if (i2 == 14 || i2 == 10) {
                v();
            } else if (i2 == 8 || i2 == 12) {
                c('\'');
            } else if (i2 == 9 || i2 == 13) {
                c('\"');
            } else if (i2 == 16) {
                this.f += this.k;
            }
            this.f6497a = 0;
        } while (i != 0);
        int[] iArr = this.p;
        int i3 = this.n - 1;
        iArr[i3] = iArr[i3] + 1;
        this.o[this.n - 1] = "null";
    }

    private void a(int i) {
        if (this.n == this.m.length) {
            int[] iArr = new int[this.n * 2];
            int[] iArr2 = new int[this.n * 2];
            String[] strArr = new String[this.n * 2];
            System.arraycopy(this.m, 0, iArr, 0, this.n);
            System.arraycopy(this.p, 0, iArr2, 0, this.n);
            System.arraycopy(this.o, 0, strArr, 0, this.n);
            this.m = iArr;
            this.p = iArr2;
            this.o = strArr;
        }
        int[] iArr3 = this.m;
        int i2 = this.n;
        this.n = i2 + 1;
        iArr3[i2] = i;
    }

    private boolean b(int i) throws IOException {
        char[] cArr = this.e;
        this.i -= this.f;
        if (this.g != this.f) {
            this.g -= this.f;
            System.arraycopy(cArr, this.f, cArr, 0, this.g);
        } else {
            this.g = 0;
        }
        this.f = 0;
        do {
            int read = this.f6498c.read(cArr, this.g, cArr.length - this.g);
            if (read == -1) {
                return false;
            }
            this.g += read;
            if (this.h == 0 && this.i == 0 && this.g > 0 && cArr[0] == 65279) {
                this.f++;
                this.i++;
                i++;
            }
        } while (this.g < i);
        return true;
    }

    private int b(boolean z) throws IOException {
        char[] cArr = this.e;
        int i = this.f;
        int i2 = this.g;
        while (true) {
            if (i == i2) {
                this.f = i;
                if (!b(1)) {
                    if (!z) {
                        return -1;
                    }
                    throw new EOFException("End of input" + s());
                }
                i = this.f;
                i2 = this.g;
            }
            int i3 = i + 1;
            char c2 = cArr[i];
            if (c2 == '\n') {
                this.h++;
                this.i = i3;
            } else if (c2 != ' ' && c2 != '\r' && c2 != '\t') {
                if (c2 == '/') {
                    this.f = i3;
                    if (i3 == i2) {
                        this.f--;
                        boolean b2 = b(2);
                        this.f++;
                        if (!b2) {
                            return c2;
                        }
                    }
                    w();
                    char c3 = cArr[this.f];
                    if (c3 == '*') {
                        this.f++;
                        if (!a("*/")) {
                            throw b("Unterminated comment");
                        }
                        i = this.f + 2;
                        i2 = this.g;
                    } else {
                        if (c3 != '/') {
                            return c2;
                        }
                        this.f++;
                        x();
                        i = this.f;
                        i2 = this.g;
                    }
                } else if (c2 == '#') {
                    this.f = i3;
                    w();
                    x();
                    i = this.f;
                    i2 = this.g;
                } else {
                    this.f = i3;
                    return c2;
                }
            }
            i = i3;
        }
    }

    private void w() throws IOException {
        if (!this.f6499d) {
            throw b("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private void x() throws IOException {
        char c2;
        do {
            if (this.f >= this.g && !b(1)) {
                return;
            }
            char[] cArr = this.e;
            int i = this.f;
            this.f = i + 1;
            c2 = cArr[i];
            if (c2 == '\n') {
                this.h++;
                this.i = this.f;
                return;
            }
        } while (c2 != '\r');
    }

    private boolean a(String str) throws IOException {
        int length = str.length();
        while (true) {
            if (this.f + length > this.g && !b(length)) {
                return false;
            }
            if (this.e[this.f] != '\n') {
                for (int i = 0; i < length; i++) {
                    if (this.e[this.f + i] != str.charAt(i)) {
                        break;
                    }
                }
                return true;
            }
            this.h++;
            this.i = this.f + 1;
            this.f++;
        }
    }

    public String toString() {
        return getClass().getSimpleName() + s();
    }

    String s() {
        return " at line " + (this.h + 1) + " column " + ((this.f - this.i) + 1) + " path " + p();
    }

    public String p() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i = this.n;
        for (int i2 = 0; i2 < i; i2++) {
            switch (this.m[i2]) {
                case 1:
                case 2:
                    sb.append('[');
                    sb.append(this.p[i2]);
                    sb.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb.append('.');
                    if (this.o[i2] != null) {
                        sb.append(this.o[i2]);
                        break;
                    } else {
                        break;
                    }
            }
        }
        return sb.toString();
    }

    private char y() throws IOException {
        int i;
        if (this.f == this.g && !b(1)) {
            throw b("Unterminated escape sequence");
        }
        char[] cArr = this.e;
        int i2 = this.f;
        this.f = i2 + 1;
        char c2 = cArr[i2];
        if (c2 == '\n') {
            this.h++;
            this.i = this.f;
        } else if (c2 != '\"' && c2 != '\'' && c2 != '/' && c2 != '\\') {
            if (c2 == 'b') {
                return '\b';
            }
            if (c2 == 'f') {
                return '\f';
            }
            if (c2 == 'n') {
                return '\n';
            }
            if (c2 == 'r') {
                return '\r';
            }
            switch (c2) {
                case 't':
                    return '\t';
                case 'u':
                    if (this.f + 4 > this.g && !b(4)) {
                        throw b("Unterminated escape sequence");
                    }
                    char c3 = 0;
                    int i3 = this.f;
                    int i4 = i3 + 4;
                    while (i3 < i4) {
                        char c4 = this.e[i3];
                        char c5 = (char) (c3 << 4);
                        if (c4 >= '0' && c4 <= '9') {
                            i = c4 - '0';
                        } else if (c4 >= 'a' && c4 <= 'f') {
                            i = (c4 - 'a') + 10;
                        } else {
                            if (c4 < 'A' || c4 > 'F') {
                                throw new NumberFormatException("\\u" + new String(this.e, this.f, 4));
                            }
                            i = (c4 - 'A') + 10;
                        }
                        c3 = (char) (c5 + i);
                        i3++;
                    }
                    this.f += 4;
                    return c3;
                default:
                    throw b("Invalid escape sequence");
            }
        }
        return c2;
    }

    private IOException b(String str) throws IOException {
        throw new d(str + s());
    }

    private void z() throws IOException {
        b(true);
        this.f--;
        if (this.f + f6496b.length <= this.g || b(f6496b.length)) {
            for (int i = 0; i < f6496b.length; i++) {
                if (this.e[this.f + i] != f6496b[i]) {
                    return;
                }
            }
            this.f += f6496b.length;
        }
    }
}
