package com.crrepa.t1;

import com.crrepa.n1.f;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class a implements Closeable {
    private static final int A = 10;
    private static final int B = 11;
    private static final int C = 12;
    private static final int D = 13;
    private static final int E = 14;
    private static final int F = 15;
    private static final int G = 16;
    private static final int H = 17;
    private static final int I = 0;
    private static final int J = 1;
    private static final int K = 2;
    private static final int L = 3;
    private static final int M = 4;
    private static final int N = 5;
    private static final int O = 6;
    private static final int P = 7;

    /* renamed from: p, reason: collision with root package name */
    private static final long f13806p = -922337203685477580L;

    /* renamed from: q, reason: collision with root package name */
    private static final int f13807q = 0;

    /* renamed from: r, reason: collision with root package name */
    private static final int f13808r = 1;

    /* renamed from: s, reason: collision with root package name */
    private static final int f13809s = 2;

    /* renamed from: t, reason: collision with root package name */
    private static final int f13810t = 3;

    /* renamed from: u, reason: collision with root package name */
    private static final int f13811u = 4;

    /* renamed from: v, reason: collision with root package name */
    private static final int f13812v = 5;

    /* renamed from: w, reason: collision with root package name */
    private static final int f13813w = 6;

    /* renamed from: x, reason: collision with root package name */
    private static final int f13814x = 7;

    /* renamed from: y, reason: collision with root package name */
    private static final int f13815y = 8;

    /* renamed from: z, reason: collision with root package name */
    private static final int f13816z = 9;

    /* renamed from: a, reason: collision with root package name */
    private final Reader f13817a;

    /* renamed from: i, reason: collision with root package name */
    private long f13825i;

    /* renamed from: j, reason: collision with root package name */
    private int f13826j;

    /* renamed from: k, reason: collision with root package name */
    private String f13827k;

    /* renamed from: l, reason: collision with root package name */
    private int[] f13828l;

    /* renamed from: n, reason: collision with root package name */
    private String[] f13830n;

    /* renamed from: o, reason: collision with root package name */
    private int[] f13831o;

    /* renamed from: b, reason: collision with root package name */
    private boolean f13818b = false;

    /* renamed from: c, reason: collision with root package name */
    private final char[] f13819c = new char[1024];

    /* renamed from: d, reason: collision with root package name */
    private int f13820d = 0;

    /* renamed from: e, reason: collision with root package name */
    private int f13821e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f13822f = 0;

    /* renamed from: g, reason: collision with root package name */
    private int f13823g = 0;

    /* renamed from: h, reason: collision with root package name */
    int f13824h = 0;

    /* renamed from: m, reason: collision with root package name */
    private int f13829m = 1;

    /* renamed from: com.crrepa.t1.a$a, reason: collision with other inner class name */
    class C0244a extends f {
        C0244a() {
        }

        @Override // com.crrepa.n1.f
        public void a(a aVar) {
            int i8;
            if (aVar instanceof com.crrepa.o1.f) {
                ((com.crrepa.o1.f) aVar).D();
                return;
            }
            int i9 = aVar.f13824h;
            if (i9 == 0) {
                i9 = aVar.e();
            }
            if (i9 == 13) {
                i8 = 9;
            } else if (i9 == 12) {
                i8 = 8;
            } else {
                if (i9 != 14) {
                    throw new IllegalStateException("Expected a name but was " + aVar.t() + aVar.k());
                }
                i8 = 10;
            }
            aVar.f13824h = i8;
        }
    }

    static {
        f.f13429a = new C0244a();
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.f13828l = iArr;
        iArr[0] = 6;
        this.f13830n = new String[32];
        this.f13831o = new int[32];
        if (reader == null) {
            throw new NullPointerException("in == null");
        }
        this.f13817a = reader;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
    
        if (r5 != '/') goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0055, code lost:
    
        r8.f13820d = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0058, code lost:
    
        if (r4 != r2) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005a, code lost:
    
        r8.f13820d = r1;
        r1 = a(2);
        r8.f13820d++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0065, code lost:
    
        if (r1 != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0067, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0068, code lost:
    
        c();
        r1 = r8.f13820d;
        r2 = r0[r1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0071, code lost:
    
        if (r2 == '*') goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007e, code lost:
    
        r8.f13820d = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0088, code lost:
    
        if (a(cn.hutool.core.util.g1.WAR_URL_SEPARATOR) == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0095, code lost:
    
        throw b("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0073, code lost:
    
        if (r2 == '/') goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0076, code lost:
    
        r8.f13820d = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0075, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0096, code lost:
    
        r8.f13820d = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x009a, code lost:
    
        if (r5 != '#') goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x009c, code lost:
    
        c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a0, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int a(boolean z7) {
        char[] cArr = this.f13819c;
        while (true) {
            int i8 = this.f13820d;
            while (true) {
                int i9 = this.f13821e;
                while (true) {
                    if (i8 == i9) {
                        this.f13820d = i8;
                        if (!a(1)) {
                            if (!z7) {
                                return -1;
                            }
                            throw new EOFException("End of input" + k());
                        }
                        i8 = this.f13820d;
                        i9 = this.f13821e;
                    }
                    int i10 = i8 + 1;
                    char c8 = cArr[i8];
                    if (c8 != '\n') {
                        if (c8 != ' ' && c8 != '\r' && c8 != '\t') {
                            break;
                        }
                    } else {
                        this.f13822f++;
                        this.f13823g = i10;
                    }
                    i8 = i10;
                }
                i8 = this.f13820d + 2;
            }
            x();
        }
    }

    private IOException b(String str) {
        throw new e(str + k());
    }

    private void c() {
        if (!this.f13818b) {
            throw b("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private void d() {
        a(true);
        int i8 = this.f13820d;
        int i9 = i8 - 1;
        this.f13820d = i9;
        if (i8 + 4 <= this.f13821e || a(5)) {
            char[] cArr = this.f13819c;
            if (cArr[i9] == ')' && cArr[i8] == ']' && cArr[i8 + 1] == '}' && cArr[i8 + 2] == '\'' && cArr[i8 + 3] == '\n') {
                this.f13820d += 5;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0048, code lost:
    
        c();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:54:0x0042. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String s() {
        String sb;
        StringBuilder sb2 = null;
        int i8 = 0;
        do {
            int i9 = 0;
            while (true) {
                int i10 = this.f13820d + i9;
                if (i10 < this.f13821e) {
                    char c8 = this.f13819c[i10];
                    if (c8 != '\t' && c8 != '\n' && c8 != '\f' && c8 != '\r' && c8 != ' ') {
                        if (c8 != '#') {
                            if (c8 != ',') {
                                if (c8 != '/' && c8 != '=') {
                                    if (c8 != '{' && c8 != '}' && c8 != ':') {
                                        if (c8 != ';') {
                                            switch (c8) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i9++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (i9 >= this.f13819c.length) {
                    if (sb2 == null) {
                        sb2 = new StringBuilder(Math.max(i9, 16));
                    }
                    sb2.append(this.f13819c, this.f13820d, i9);
                    this.f13820d += i9;
                } else if (a(i9 + 1)) {
                }
            }
            i8 = i9;
            if (sb2 != null) {
                sb = new String(this.f13819c, this.f13820d, i8);
            } else {
                sb2.append(this.f13819c, this.f13820d, i8);
                sb = sb2.toString();
            }
            this.f13820d += i8;
            return sb;
        } while (a(1));
        if (sb2 != null) {
        }
        this.f13820d += i8;
        return sb;
    }

    private int u() {
        String str;
        String str2;
        int i8;
        char c8 = this.f13819c[this.f13820d];
        if (c8 == 't' || c8 == 'T') {
            str = "true";
            str2 = "TRUE";
            i8 = 5;
        } else if (c8 == 'f' || c8 == 'F') {
            str = "false";
            str2 = "FALSE";
            i8 = 6;
        } else {
            if (c8 != 'n' && c8 != 'N') {
                return 0;
            }
            str = "null";
            str2 = "NULL";
            i8 = 7;
        }
        int length = str.length();
        for (int i9 = 1; i9 < length; i9++) {
            if (this.f13820d + i9 >= this.f13821e && !a(i9 + 1)) {
                return 0;
            }
            char c9 = this.f13819c[this.f13820d + i9];
            if (c9 != str.charAt(i9) && c9 != str2.charAt(i9)) {
                return 0;
            }
        }
        if ((this.f13820d + length < this.f13821e || a(length + 1)) && a(this.f13819c[this.f13820d + length])) {
            return 0;
        }
        this.f13820d += length;
        this.f13824h = i8;
        return i8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0095, code lost:
    
        if (r9 != 2) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0097, code lost:
    
        if (r13 == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x009d, code lost:
    
        if (r10 != Long.MIN_VALUE) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x009f, code lost:
    
        if (r12 == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a5, code lost:
    
        if (r10 != 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a7, code lost:
    
        if (r12 != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a9, code lost:
    
        if (r12 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ac, code lost:
    
        r10 = -r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ad, code lost:
    
        r18.f13825i = r10;
        r18.f13820d += r8;
        r1 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b6, code lost:
    
        r18.f13824h = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b8, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b9, code lost:
    
        if (r9 == 2) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bc, code lost:
    
        if (r9 == 4) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bf, code lost:
    
        if (r9 != 7) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c2, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c4, code lost:
    
        r18.f13826j = r8;
        r1 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0093, code lost:
    
        if (a(r14) != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00c9, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int v() {
        char[] cArr = this.f13819c;
        int i8 = this.f13820d;
        int i9 = this.f13821e;
        int i10 = 0;
        int i11 = 0;
        char c8 = 0;
        long j8 = 0;
        boolean z7 = false;
        boolean z8 = true;
        while (true) {
            if (i8 + i11 == i9) {
                if (i11 == cArr.length) {
                    return i10;
                }
                if (!a(i11 + 1)) {
                    break;
                }
                i8 = this.f13820d;
                i9 = this.f13821e;
            }
            char c9 = cArr[i8 + i11];
            if (c9 != '+') {
                if (c9 == 'E' || c9 == 'e') {
                    i10 = 0;
                    if (c8 != 2 && c8 != 4) {
                        return 0;
                    }
                    c8 = 5;
                } else if (c9 == '-') {
                    i10 = 0;
                    if (c8 == 0) {
                        c8 = 1;
                        z7 = true;
                    } else if (c8 != 5) {
                        return 0;
                    }
                } else if (c9 == '.') {
                    i10 = 0;
                    if (c8 != 2) {
                        return 0;
                    }
                    c8 = 3;
                } else {
                    if (c9 < '0' || c9 > '9') {
                        break;
                    }
                    if (c8 == 1 || c8 == 0) {
                        j8 = -(c9 - '0');
                        i10 = 0;
                        c8 = 2;
                    } else {
                        if (c8 == 2) {
                            if (j8 == 0) {
                                return 0;
                            }
                            long j9 = (10 * j8) - (c9 - '0');
                            z8 &= j8 > -922337203685477580L || (j8 == -922337203685477580L && j9 < j8);
                            j8 = j9;
                        } else if (c8 == 3) {
                            i10 = 0;
                            c8 = 4;
                        } else if (c8 == 5 || c8 == 6) {
                            i10 = 0;
                            c8 = 7;
                        }
                        i10 = 0;
                    }
                }
                i11++;
            } else {
                i10 = 0;
                if (c8 != 5) {
                    return 0;
                }
            }
            c8 = 6;
            i11++;
        }
    }

    private char w() {
        int i8;
        if (this.f13820d == this.f13821e && !a(1)) {
            throw b("Unterminated escape sequence");
        }
        char[] cArr = this.f13819c;
        int i9 = this.f13820d;
        int i10 = i9 + 1;
        this.f13820d = i10;
        char c8 = cArr[i9];
        if (c8 == '\n') {
            this.f13822f++;
            this.f13823g = i10;
        } else if (c8 != '\"' && c8 != '\'' && c8 != '/' && c8 != '\\') {
            if (c8 == 'b') {
                return '\b';
            }
            if (c8 == 'f') {
                return '\f';
            }
            if (c8 == 'n') {
                return '\n';
            }
            if (c8 == 'r') {
                return '\r';
            }
            if (c8 == 't') {
                return '\t';
            }
            if (c8 != 'u') {
                throw b("Invalid escape sequence");
            }
            if (i9 + 5 > this.f13821e && !a(4)) {
                throw b("Unterminated escape sequence");
            }
            int i11 = this.f13820d;
            int i12 = i11 + 4;
            char c9 = 0;
            while (i11 < i12) {
                char c10 = this.f13819c[i11];
                char c11 = (char) (c9 << 4);
                if (c10 >= '0' && c10 <= '9') {
                    i8 = c10 - '0';
                } else if (c10 >= 'a' && c10 <= 'f') {
                    i8 = c10 - 'W';
                } else {
                    if (c10 < 'A' || c10 > 'F') {
                        throw new NumberFormatException("\\u" + new String(this.f13819c, this.f13820d, 4));
                    }
                    i8 = c10 - '7';
                }
                c9 = (char) (c11 + i8);
                i11++;
            }
            this.f13820d += 4;
            return c9;
        }
        return c8;
    }

    private void x() {
        char c8;
        do {
            if (this.f13820d >= this.f13821e && !a(1)) {
                return;
            }
            char[] cArr = this.f13819c;
            int i8 = this.f13820d;
            int i9 = i8 + 1;
            this.f13820d = i9;
            c8 = cArr[i8];
            if (c8 == '\n') {
                this.f13822f++;
                this.f13823g = i9;
                return;
            }
        } while (c8 != '\r');
    }

    private void y() {
        do {
            int i8 = 0;
            while (true) {
                int i9 = this.f13820d + i8;
                if (i9 < this.f13821e) {
                    char c8 = this.f13819c[i9];
                    if (c8 != '\t' && c8 != '\n' && c8 != '\f' && c8 != '\r' && c8 != ' ') {
                        if (c8 != '#') {
                            if (c8 != ',') {
                                if (c8 != '/' && c8 != '=') {
                                    if (c8 != '{' && c8 != '}' && c8 != ':') {
                                        if (c8 != ';') {
                                            switch (c8) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i8++;
                                            }
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    this.f13820d = i9;
                }
            }
            c();
            this.f13820d += i8;
            return;
        } while (a(1));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f13824h = 0;
        this.f13828l[0] = 8;
        this.f13829m = 1;
        this.f13817a.close();
    }

    int e() {
        int i8;
        int a8;
        int[] iArr = this.f13828l;
        int i9 = this.f13829m - 1;
        int i10 = iArr[i9];
        if (i10 == 1) {
            iArr[i9] = 2;
        } else {
            if (i10 != 2) {
                if (i10 == 3 || i10 == 5) {
                    iArr[i9] = 4;
                    if (i10 == 5 && (a8 = a(true)) != 44) {
                        if (a8 != 59) {
                            if (a8 != 125) {
                                throw b("Unterminated object");
                            }
                            this.f13824h = 2;
                            return 2;
                        }
                        c();
                    }
                    int a9 = a(true);
                    if (a9 == 34) {
                        i8 = 13;
                    } else if (a9 == 39) {
                        c();
                        i8 = 12;
                    } else {
                        if (a9 == 125) {
                            if (i10 == 5) {
                                throw b("Expected name");
                            }
                            this.f13824h = 2;
                            return 2;
                        }
                        c();
                        this.f13820d--;
                        if (!a((char) a9)) {
                            throw b("Expected name");
                        }
                        i8 = 14;
                    }
                } else if (i10 == 4) {
                    iArr[i9] = 5;
                    int a10 = a(true);
                    if (a10 != 58) {
                        if (a10 != 61) {
                            throw b("Expected ':'");
                        }
                        c();
                        if (this.f13820d < this.f13821e || a(1)) {
                            char[] cArr = this.f13819c;
                            int i11 = this.f13820d;
                            if (cArr[i11] == '>') {
                                this.f13820d = i11 + 1;
                            }
                        }
                    }
                } else if (i10 == 6) {
                    if (this.f13818b) {
                        d();
                    }
                    this.f13828l[this.f13829m - 1] = 7;
                } else if (i10 == 7) {
                    if (a(false) == -1) {
                        i8 = 17;
                    } else {
                        c();
                        this.f13820d--;
                    }
                } else if (i10 == 8) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                this.f13824h = i8;
                return i8;
            }
            int a11 = a(true);
            if (a11 != 44) {
                if (a11 != 59) {
                    if (a11 != 93) {
                        throw b("Unterminated array");
                    }
                    this.f13824h = 4;
                    return 4;
                }
                c();
            }
        }
        int a12 = a(true);
        if (a12 != 34) {
            if (a12 == 39) {
                c();
                this.f13824h = 8;
                return 8;
            }
            if (a12 != 44 && a12 != 59) {
                if (a12 == 91) {
                    this.f13824h = 3;
                    return 3;
                }
                if (a12 != 93) {
                    if (a12 == 123) {
                        this.f13824h = 1;
                        return 1;
                    }
                    this.f13820d--;
                    int u7 = u();
                    if (u7 != 0) {
                        return u7;
                    }
                    int v7 = v();
                    if (v7 != 0) {
                        return v7;
                    }
                    if (!a(this.f13819c[this.f13820d])) {
                        throw b("Expected value");
                    }
                    c();
                    i8 = 10;
                } else if (i10 == 1) {
                    this.f13824h = 4;
                    return 4;
                }
            }
            if (i10 != 1 && i10 != 2) {
                throw b("Unexpected value");
            }
            c();
            this.f13820d--;
            this.f13824h = 7;
            return 7;
        }
        i8 = 9;
        this.f13824h = i8;
        return i8;
    }

    public void f() {
        int i8 = this.f13824h;
        if (i8 == 0) {
            i8 = e();
        }
        if (i8 != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + t() + k());
        }
        int i9 = this.f13829m;
        this.f13829m = i9 - 1;
        int[] iArr = this.f13831o;
        int i10 = i9 - 2;
        iArr[i10] = iArr[i10] + 1;
        this.f13824h = 0;
    }

    public void g() {
        int i8 = this.f13824h;
        if (i8 == 0) {
            i8 = e();
        }
        if (i8 != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + t() + k());
        }
        int i9 = this.f13829m;
        int i10 = i9 - 1;
        this.f13829m = i10;
        this.f13830n[i10] = null;
        int[] iArr = this.f13831o;
        int i11 = i9 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.f13824h = 0;
    }

    public String h() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i8 = this.f13829m;
        for (int i9 = 0; i9 < i8; i9++) {
            int i10 = this.f13828l[i9];
            if (i10 == 1 || i10 == 2) {
                sb.append('[');
                sb.append(this.f13831o[i9]);
                sb.append(']');
            } else if (i10 == 3 || i10 == 4 || i10 == 5) {
                sb.append('.');
                String str = this.f13830n[i9];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public boolean i() {
        int i8 = this.f13824h;
        if (i8 == 0) {
            i8 = e();
        }
        return (i8 == 2 || i8 == 4) ? false : true;
    }

    public final boolean j() {
        return this.f13818b;
    }

    String k() {
        return " at line " + (this.f13822f + 1) + " column " + ((this.f13820d - this.f13823g) + 1) + " path " + h();
    }

    public boolean l() {
        int i8 = this.f13824h;
        if (i8 == 0) {
            i8 = e();
        }
        if (i8 == 5) {
            this.f13824h = 0;
            int[] iArr = this.f13831o;
            int i9 = this.f13829m - 1;
            iArr[i9] = iArr[i9] + 1;
            return true;
        }
        if (i8 == 6) {
            this.f13824h = 0;
            int[] iArr2 = this.f13831o;
            int i10 = this.f13829m - 1;
            iArr2[i10] = iArr2[i10] + 1;
            return false;
        }
        throw new IllegalStateException("Expected a boolean but was " + t() + k());
    }

    public double m() {
        String b8;
        int i8 = this.f13824h;
        if (i8 == 0) {
            i8 = e();
        }
        if (i8 == 15) {
            this.f13824h = 0;
            int[] iArr = this.f13831o;
            int i9 = this.f13829m - 1;
            iArr[i9] = iArr[i9] + 1;
            return this.f13825i;
        }
        if (i8 == 16) {
            this.f13827k = new String(this.f13819c, this.f13820d, this.f13826j);
            this.f13820d += this.f13826j;
        } else {
            if (i8 == 8 || i8 == 9) {
                b8 = b(i8 == 8 ? '\'' : '\"');
            } else if (i8 == 10) {
                b8 = s();
            } else if (i8 != 11) {
                throw new IllegalStateException("Expected a double but was " + t() + k());
            }
            this.f13827k = b8;
        }
        this.f13824h = 11;
        double parseDouble = Double.parseDouble(this.f13827k);
        if (!this.f13818b && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw new e("JSON forbids NaN and infinities: " + parseDouble + k());
        }
        this.f13827k = null;
        this.f13824h = 0;
        int[] iArr2 = this.f13831o;
        int i10 = this.f13829m - 1;
        iArr2[i10] = iArr2[i10] + 1;
        return parseDouble;
    }

    public int n() {
        String b8;
        int i8 = this.f13824h;
        if (i8 == 0) {
            i8 = e();
        }
        if (i8 == 15) {
            long j8 = this.f13825i;
            int i9 = (int) j8;
            if (j8 == i9) {
                this.f13824h = 0;
                int[] iArr = this.f13831o;
                int i10 = this.f13829m - 1;
                iArr[i10] = iArr[i10] + 1;
                return i9;
            }
            throw new NumberFormatException("Expected an int but was " + this.f13825i + k());
        }
        if (i8 == 16) {
            this.f13827k = new String(this.f13819c, this.f13820d, this.f13826j);
            this.f13820d += this.f13826j;
        } else {
            if (i8 != 8 && i8 != 9 && i8 != 10) {
                throw new IllegalStateException("Expected an int but was " + t() + k());
            }
            if (i8 == 10) {
                b8 = s();
            } else {
                b8 = b(i8 == 8 ? '\'' : '\"');
            }
            this.f13827k = b8;
            try {
                int parseInt = Integer.parseInt(this.f13827k);
                this.f13824h = 0;
                int[] iArr2 = this.f13831o;
                int i11 = this.f13829m - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.f13824h = 11;
        double parseDouble = Double.parseDouble(this.f13827k);
        int i12 = (int) parseDouble;
        if (i12 != parseDouble) {
            throw new NumberFormatException("Expected an int but was " + this.f13827k + k());
        }
        this.f13827k = null;
        this.f13824h = 0;
        int[] iArr3 = this.f13831o;
        int i13 = this.f13829m - 1;
        iArr3[i13] = iArr3[i13] + 1;
        return i12;
    }

    public long o() {
        String b8;
        int i8 = this.f13824h;
        if (i8 == 0) {
            i8 = e();
        }
        if (i8 == 15) {
            this.f13824h = 0;
            int[] iArr = this.f13831o;
            int i9 = this.f13829m - 1;
            iArr[i9] = iArr[i9] + 1;
            return this.f13825i;
        }
        if (i8 == 16) {
            this.f13827k = new String(this.f13819c, this.f13820d, this.f13826j);
            this.f13820d += this.f13826j;
        } else {
            if (i8 != 8 && i8 != 9 && i8 != 10) {
                throw new IllegalStateException("Expected a long but was " + t() + k());
            }
            if (i8 == 10) {
                b8 = s();
            } else {
                b8 = b(i8 == 8 ? '\'' : '\"');
            }
            this.f13827k = b8;
            try {
                long parseLong = Long.parseLong(this.f13827k);
                this.f13824h = 0;
                int[] iArr2 = this.f13831o;
                int i10 = this.f13829m - 1;
                iArr2[i10] = iArr2[i10] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.f13824h = 11;
        double parseDouble = Double.parseDouble(this.f13827k);
        long j8 = (long) parseDouble;
        if (j8 != parseDouble) {
            throw new NumberFormatException("Expected a long but was " + this.f13827k + k());
        }
        this.f13827k = null;
        this.f13824h = 0;
        int[] iArr3 = this.f13831o;
        int i11 = this.f13829m - 1;
        iArr3[i11] = iArr3[i11] + 1;
        return j8;
    }

    public String p() {
        char c8;
        String b8;
        int i8 = this.f13824h;
        if (i8 == 0) {
            i8 = e();
        }
        if (i8 == 14) {
            b8 = s();
        } else {
            if (i8 == 12) {
                c8 = '\'';
            } else {
                if (i8 != 13) {
                    throw new IllegalStateException("Expected a name but was " + t() + k());
                }
                c8 = '\"';
            }
            b8 = b(c8);
        }
        this.f13824h = 0;
        this.f13830n[this.f13829m - 1] = b8;
        return b8;
    }

    public void q() {
        int i8 = this.f13824h;
        if (i8 == 0) {
            i8 = e();
        }
        if (i8 == 7) {
            this.f13824h = 0;
            int[] iArr = this.f13831o;
            int i9 = this.f13829m - 1;
            iArr[i9] = iArr[i9] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + t() + k());
    }

    public String r() {
        String str;
        char c8;
        int i8 = this.f13824h;
        if (i8 == 0) {
            i8 = e();
        }
        if (i8 == 10) {
            str = s();
        } else {
            if (i8 == 8) {
                c8 = '\'';
            } else if (i8 == 9) {
                c8 = '\"';
            } else if (i8 == 11) {
                str = this.f13827k;
                this.f13827k = null;
            } else if (i8 == 15) {
                str = Long.toString(this.f13825i);
            } else {
                if (i8 != 16) {
                    throw new IllegalStateException("Expected a string but was " + t() + k());
                }
                str = new String(this.f13819c, this.f13820d, this.f13826j);
                this.f13820d += this.f13826j;
            }
            str = b(c8);
        }
        this.f13824h = 0;
        int[] iArr = this.f13831o;
        int i9 = this.f13829m - 1;
        iArr[i9] = iArr[i9] + 1;
        return str;
    }

    public c t() {
        int i8 = this.f13824h;
        if (i8 == 0) {
            i8 = e();
        }
        switch (i8) {
            case 1:
                return c.BEGIN_OBJECT;
            case 2:
                return c.END_OBJECT;
            case 3:
                return c.BEGIN_ARRAY;
            case 4:
                return c.END_ARRAY;
            case 5:
            case 6:
                return c.BOOLEAN;
            case 7:
                return c.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return c.STRING;
            case 12:
            case 13:
            case 14:
                return c.NAME;
            case 15:
            case 16:
                return c.NUMBER;
            case 17:
                return c.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public String toString() {
        return getClass().getSimpleName() + k();
    }

    public void z() {
        char c8;
        int i8 = 0;
        do {
            int i9 = this.f13824h;
            if (i9 == 0) {
                i9 = e();
            }
            if (i9 == 3) {
                b(1);
            } else if (i9 == 1) {
                b(3);
            } else {
                if (i9 == 4 || i9 == 2) {
                    this.f13829m--;
                    i8--;
                } else if (i9 == 14 || i9 == 10) {
                    y();
                } else {
                    if (i9 == 8 || i9 == 12) {
                        c8 = '\'';
                    } else if (i9 == 9 || i9 == 13) {
                        c8 = '\"';
                    } else if (i9 == 16) {
                        this.f13820d += this.f13826j;
                    }
                    c(c8);
                }
                this.f13824h = 0;
            }
            i8++;
            this.f13824h = 0;
        } while (i8 != 0);
        int[] iArr = this.f13831o;
        int i10 = this.f13829m - 1;
        iArr[i10] = iArr[i10] + 1;
        this.f13830n[i10] = "null";
    }

    private String b(char c8) {
        char[] cArr = this.f13819c;
        StringBuilder sb = null;
        do {
            int i8 = this.f13820d;
            int i9 = this.f13821e;
            int i10 = i8;
            while (i8 < i9) {
                int i11 = i8 + 1;
                char c9 = cArr[i8];
                if (c9 == c8) {
                    this.f13820d = i11;
                    int i12 = (i11 - i10) - 1;
                    if (sb == null) {
                        return new String(cArr, i10, i12);
                    }
                    sb.append(cArr, i10, i12);
                    return sb.toString();
                }
                if (c9 == '\\') {
                    this.f13820d = i11;
                    int i13 = i11 - i10;
                    int i14 = i13 - 1;
                    if (sb == null) {
                        sb = new StringBuilder(Math.max(i13 * 2, 16));
                    }
                    sb.append(cArr, i10, i14);
                    sb.append(w());
                    i10 = this.f13820d;
                    i9 = this.f13821e;
                    i8 = i10;
                } else {
                    if (c9 == '\n') {
                        this.f13822f++;
                        this.f13823g = i11;
                    }
                    i8 = i11;
                }
            }
            if (sb == null) {
                sb = new StringBuilder(Math.max((i8 - i10) * 2, 16));
            }
            sb.append(cArr, i10, i8 - i10);
            this.f13820d = i8;
        } while (a(1));
        throw b("Unterminated string");
    }

    private void c(char c8) {
        char[] cArr = this.f13819c;
        while (true) {
            int i8 = this.f13820d;
            int i9 = this.f13821e;
            while (true) {
                if (i8 < i9) {
                    int i10 = i8 + 1;
                    char c9 = cArr[i8];
                    if (c9 == c8) {
                        this.f13820d = i10;
                        return;
                    }
                    if (c9 == '\\') {
                        this.f13820d = i10;
                        w();
                        break;
                    } else {
                        if (c9 == '\n') {
                            this.f13822f++;
                            this.f13823g = i10;
                        }
                        i8 = i10;
                    }
                } else {
                    this.f13820d = i8;
                    if (!a(1)) {
                        throw b("Unterminated string");
                    }
                }
            }
        }
    }

    public void a() {
        int i8 = this.f13824h;
        if (i8 == 0) {
            i8 = e();
        }
        if (i8 == 3) {
            b(1);
            this.f13831o[this.f13829m - 1] = 0;
            this.f13824h = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + t() + k());
        }
    }

    private boolean a(char c8) {
        if (c8 == '\t' || c8 == '\n' || c8 == '\f' || c8 == '\r' || c8 == ' ') {
            return false;
        }
        if (c8 != '#') {
            if (c8 == ',') {
                return false;
            }
            if (c8 != '/' && c8 != '=') {
                if (c8 == '{' || c8 == '}' || c8 == ':') {
                    return false;
                }
                if (c8 != ';') {
                    switch (c8) {
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
        c();
        return false;
    }

    public void b() {
        int i8 = this.f13824h;
        if (i8 == 0) {
            i8 = e();
        }
        if (i8 == 1) {
            b(3);
            this.f13824h = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + t() + k());
        }
    }

    private boolean a(int i8) {
        int i9;
        int i10;
        char[] cArr = this.f13819c;
        int i11 = this.f13823g;
        int i12 = this.f13820d;
        this.f13823g = i11 - i12;
        int i13 = this.f13821e;
        if (i13 != i12) {
            int i14 = i13 - i12;
            this.f13821e = i14;
            System.arraycopy(cArr, i12, cArr, 0, i14);
        } else {
            this.f13821e = 0;
        }
        this.f13820d = 0;
        do {
            Reader reader = this.f13817a;
            int i15 = this.f13821e;
            int read = reader.read(cArr, i15, cArr.length - i15);
            if (read == -1) {
                return false;
            }
            i9 = this.f13821e + read;
            this.f13821e = i9;
            if (this.f13822f == 0 && (i10 = this.f13823g) == 0 && i9 > 0 && cArr[0] == 65279) {
                this.f13820d++;
                this.f13823g = i10 + 1;
                i8++;
            }
        } while (i9 < i8);
        return true;
    }

    private void b(int i8) {
        int i9 = this.f13829m;
        int[] iArr = this.f13828l;
        if (i9 == iArr.length) {
            int i10 = i9 * 2;
            this.f13828l = Arrays.copyOf(iArr, i10);
            this.f13831o = Arrays.copyOf(this.f13831o, i10);
            this.f13830n = (String[]) Arrays.copyOf(this.f13830n, i10);
        }
        int[] iArr2 = this.f13828l;
        int i11 = this.f13829m;
        this.f13829m = i11 + 1;
        iArr2[i11] = i8;
    }

    private boolean a(String str) {
        int length = str.length();
        while (true) {
            if (this.f13820d + length > this.f13821e && !a(length)) {
                return false;
            }
            char[] cArr = this.f13819c;
            int i8 = this.f13820d;
            if (cArr[i8] != '\n') {
                for (int i9 = 0; i9 < length; i9++) {
                    if (this.f13819c[this.f13820d + i9] != str.charAt(i9)) {
                        break;
                    }
                }
                return true;
            }
            this.f13822f++;
            this.f13823g = i8 + 1;
            this.f13820d++;
        }
    }

    public final void b(boolean z7) {
        this.f13818b = z7;
    }
}
