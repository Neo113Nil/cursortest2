package com.google.android.gms.internal.ads;

import com.anythink.core.common.d.j;
import java.io.Closeable;
import java.io.EOFException;
import java.io.StringReader;
import java.util.Arrays;
import t0.AbstractC5051n;

/* loaded from: classes2.dex */
public final class GK implements Closeable {

    /* renamed from: A, reason: collision with root package name */
    public long f25139A;

    /* renamed from: B, reason: collision with root package name */
    public int f25140B;

    /* renamed from: C, reason: collision with root package name */
    public int[] f25141C;

    /* renamed from: E, reason: collision with root package name */
    public String[] f25143E;

    /* renamed from: F, reason: collision with root package name */
    public int[] f25144F;

    /* renamed from: n, reason: collision with root package name */
    public final StringReader f25145n;

    /* renamed from: u, reason: collision with root package name */
    public final char[] f25146u = new char[1024];

    /* renamed from: v, reason: collision with root package name */
    public int f25147v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f25148w = 0;

    /* renamed from: x, reason: collision with root package name */
    public int f25149x = 0;

    /* renamed from: y, reason: collision with root package name */
    public int f25150y = 0;

    /* renamed from: z, reason: collision with root package name */
    public int f25151z = 0;

    /* renamed from: D, reason: collision with root package name */
    public int f25142D = 1;

    public GK(StringReader stringReader) {
        int[] iArr = new int[32];
        this.f25141C = iArr;
        iArr[0] = 6;
        this.f25143E = new String[32];
        this.f25144F = new int[32];
        this.f25145n = stringReader;
    }

    public final int B() {
        int i = this.f25151z;
        if (i == 0) {
            i = b();
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
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            default:
                return 10;
        }
    }

    public final boolean C(char c4) {
        if (c4 == '\t' || c4 == '\n' || c4 == '\f' || c4 == '\r' || c4 == ' ') {
            return false;
        }
        if (c4 != '#') {
            if (c4 == ',') {
                return false;
            }
            if (c4 != '/' && c4 != '=') {
                if (c4 == '{' || c4 == '}' || c4 == ':') {
                    return false;
                }
                if (c4 != ';') {
                    switch (c4) {
                        case '[':
                        case j.v.f12735I /* 93 */:
                            return false;
                        case j.v.f12734H /* 92 */:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        I();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0116, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r4 + r4, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0122, code lost:
    
        r1.append(r5, r3, r4);
        r11.f25147v = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00ca, code lost:
    
        J("Malformed Unicode escape \\u".concat(new java.lang.String(r5, r11.f25147v, 4)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00da, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0112, code lost:
    
        r4 = r2 - r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0114, code lost:
    
        if (r1 != null) goto L90;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String D(char c4) {
        int i;
        StringBuilder sb = null;
        loop0: do {
            int i4 = this.f25147v;
            int i9 = this.f25148w;
            int i10 = i4;
            while (true) {
                char[] cArr = this.f25146u;
                if (i4 >= i9) {
                    break;
                }
                int i11 = i4 + 1;
                char c9 = cArr[i4];
                if (c9 == c4) {
                    int i12 = (i11 - i10) - 1;
                    this.f25147v = i11;
                    if (sb == null) {
                        return new String(cArr, i10, i12);
                    }
                    sb.append(cArr, i10, i12);
                    return sb.toString();
                }
                char c10 = '\n';
                if (c9 == '\\') {
                    int i13 = i11 - i10;
                    int i14 = i13 - 1;
                    this.f25147v = i11;
                    if (sb == null) {
                        sb = new StringBuilder(Math.max(i13 + i13, 16));
                    }
                    sb.append(cArr, i10, i14);
                    if (this.f25147v == this.f25148w && !G(1)) {
                        J("Unterminated escape sequence");
                        throw null;
                    }
                    int i15 = this.f25147v;
                    int i16 = i15 + 1;
                    this.f25147v = i16;
                    char c11 = cArr[i15];
                    if (c11 == '\n') {
                        this.f25149x++;
                        this.f25150y = i16;
                    } else if (c11 != '\"' && c11 != '\'' && c11 != '/' && c11 != '\\') {
                        if (c11 == 'b') {
                            c10 = '\b';
                        } else if (c11 == 'f') {
                            c10 = '\f';
                        } else if (c11 != 'n') {
                            if (c11 == 'r') {
                                c10 = '\r';
                            } else if (c11 == 't') {
                                c10 = '\t';
                            } else {
                                if (c11 != 'u') {
                                    J("Invalid escape sequence");
                                    throw null;
                                }
                                if (i15 + 5 > this.f25148w && !G(4)) {
                                    J("Unterminated escape sequence");
                                    throw null;
                                }
                                int i17 = this.f25147v;
                                int i18 = i17 + 4;
                                int i19 = 0;
                                while (i17 < i18) {
                                    int i20 = i19 << 4;
                                    char c12 = cArr[i17];
                                    if (c12 >= '0' && c12 <= '9') {
                                        i = c12 - '0';
                                    } else if (c12 >= 'a' && c12 <= 'f') {
                                        i = c12 - 'W';
                                    } else {
                                        if (c12 < 'A' || c12 > 'F') {
                                            break loop0;
                                        }
                                        i = c12 - '7';
                                    }
                                    i19 = i + i20;
                                    i17++;
                                }
                                this.f25147v += 4;
                                c10 = (char) i19;
                            }
                        }
                        sb.append(c10);
                        i10 = this.f25147v;
                        i9 = this.f25148w;
                        i4 = i10;
                    }
                    c10 = c11;
                    sb.append(c10);
                    i10 = this.f25147v;
                    i9 = this.f25148w;
                    i4 = i10;
                } else {
                    if (c9 == '\n') {
                        this.f25149x++;
                        this.f25150y = i11;
                    }
                    i4 = i11;
                }
            }
        } while (G(1));
        J("Unterminated string");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0049, code lost:
    
        I();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x004c, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String E() {
        char[] cArr;
        String sb;
        int i = 0;
        int i4 = 0;
        StringBuilder sb2 = null;
        while (true) {
            int i9 = this.f25147v + i4;
            int i10 = this.f25148w;
            cArr = this.f25146u;
            if (i9 < i10) {
                char c4 = cArr[i9];
                if (c4 != '\t' && c4 != '\n' && c4 != '\f' && c4 != '\r' && c4 != ' ') {
                    if (c4 != '#') {
                        if (c4 != ',') {
                            if (c4 != '/' && c4 != '=') {
                                if (c4 != '{' && c4 != '}' && c4 != ':') {
                                    if (c4 != ';') {
                                        switch (c4) {
                                            case '[':
                                            case j.v.f12735I /* 93 */:
                                                break;
                                            case j.v.f12734H /* 92 */:
                                                break;
                                            default:
                                                i4++;
                                                continue;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else if (i4 >= 1024) {
                if (sb2 == null) {
                    sb2 = new StringBuilder(Math.max(i4, 16));
                }
                sb2.append(cArr, this.f25147v, i4);
                this.f25147v += i4;
                if (G(1)) {
                    i4 = 0;
                }
            } else if (G(i4 + 1)) {
            }
        }
        i = i4;
        if (sb2 == null) {
            sb = new String(cArr, this.f25147v, i);
        } else {
            sb2.append(cArr, this.f25147v, i);
            sb = sb2.toString();
        }
        this.f25147v += i;
        return sb;
    }

    public final void F(int i) {
        int i4 = this.f25142D;
        if (i4 - 1 >= 1280) {
            String z8 = z();
            throw new B1.y(AbstractC5051n.g(new StringBuilder(z8.length() + 26), "Nesting limit 1280 reached", z8));
        }
        int[] iArr = this.f25141C;
        if (i4 == iArr.length) {
            int i9 = i4 + i4;
            this.f25141C = Arrays.copyOf(iArr, i9);
            this.f25144F = Arrays.copyOf(this.f25144F, i9);
            this.f25143E = (String[]) Arrays.copyOf(this.f25143E, i9);
        }
        int[] iArr2 = this.f25141C;
        int i10 = this.f25142D;
        this.f25142D = i10 + 1;
        iArr2[i10] = i;
    }

    public final boolean G(int i) {
        int i4;
        int i9 = this.f25150y;
        int i10 = this.f25147v;
        this.f25150y = i9 - i10;
        int i11 = this.f25148w;
        char[] cArr = this.f25146u;
        if (i11 != i10) {
            int i12 = i11 - i10;
            this.f25148w = i12;
            System.arraycopy(cArr, i10, cArr, 0, i12);
        } else {
            this.f25148w = 0;
        }
        this.f25147v = 0;
        do {
            int i13 = this.f25148w;
            int read = this.f25145n.read(cArr, i13, 1024 - i13);
            if (read == -1) {
                return false;
            }
            i4 = this.f25148w + read;
            this.f25148w = i4;
            if (this.f25149x == 0 && this.f25150y == 0 && i4 > 0 && cArr[0] == 65279) {
                this.f25147v++;
                this.f25150y = 1;
                i++;
            }
        } while (i4 < i);
        return true;
    }

    public final int H(boolean z8) {
        int i = this.f25147v;
        int i4 = this.f25148w;
        while (true) {
            if (i == i4) {
                this.f25147v = i;
                if (!G(1)) {
                    if (z8) {
                        throw new EOFException("End of input".concat(z()));
                    }
                    return -1;
                }
                i = this.f25147v;
                i4 = this.f25148w;
            }
            int i9 = i + 1;
            char c4 = this.f25146u[i];
            if (c4 == '\n') {
                this.f25149x++;
                this.f25150y = i9;
            } else if (c4 != ' ' && c4 != '\r' && c4 != '\t') {
                if (c4 != '/') {
                    if (c4 != '#') {
                        this.f25147v = i9;
                        return c4;
                    }
                    this.f25147v = i9;
                    I();
                    throw null;
                }
                this.f25147v = i9;
                if (i9 == i4) {
                    this.f25147v = i;
                    boolean G7 = G(2);
                    this.f25147v++;
                    if (!G7) {
                        return 47;
                    }
                }
                I();
                throw null;
            }
            i = i9;
        }
    }

    public final void I() {
        J("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        throw null;
    }

    public final void J(String str) {
        String z8 = z();
        throw new B1.y(D.y.o(new StringBuilder(str.length() + z8.length() + 79), str, z8, "\nSee https://github.com/google/gson/blob/main/Troubleshooting.md#malformed-json"));
    }

    public final IllegalStateException K(String str) {
        int B8 = B();
        String a9 = AbstractC4161xD.a(B());
        String z8 = z();
        int a10 = AbstractC5051n.a(str.length() + 18, z8.length(), a9);
        String concat = "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(B8 == 9 ? "adapter-not-null-safe" : "unexpected-json-structure");
        StringBuilder sb = new StringBuilder(concat.length() + a10 + 5);
        AbstractC5051n.j(sb, "Expected ", str, " but was ", a9);
        return new IllegalStateException(D.y.o(sb, z8, "\nSee ", concat));
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x01b4, code lost:
    
        if (C(r15) == false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01b8, code lost:
    
        r3 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01b9, code lost:
    
        if (r10 != r3) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01bb, code lost:
    
        if (r11 == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01c1, code lost:
    
        if (r1 != Long.MIN_VALUE) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01c3, code lost:
    
        if (r19 == 0) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01c5, code lost:
    
        r7 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01ce, code lost:
    
        if (r1 != 0) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01d0, code lost:
    
        if (r7 != 0) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01d6, code lost:
    
        r1 = -r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01d7, code lost:
    
        r26.f25139A = r1;
        r26.f25147v += r4;
        r7 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01e0, code lost:
    
        r26.f25151z = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01d3, code lost:
    
        if (r7 == 0) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01ca, code lost:
    
        r7 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01c7, code lost:
    
        r6 = 2;
        r10 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01e4, code lost:
    
        if (r10 == r6) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01e7, code lost:
    
        if (r10 == 4) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01ea, code lost:
    
        if (r10 != 7) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01ec, code lost:
    
        r26.f25140B = r4;
        r7 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01e3, code lost:
    
        r6 = r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:141:0x022e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0219 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b() {
        int i;
        int H6;
        int i4;
        int H8;
        int i9;
        String str;
        String str2;
        int i10;
        char c4;
        int i11;
        int[] iArr = this.f25141C;
        int i12 = this.f25142D;
        int i13 = i12 - 1;
        int i14 = iArr[i13];
        char[] cArr = this.f25146u;
        int i15 = 3;
        int i16 = 4;
        int i17 = 2;
        int i18 = 1;
        if (i14 == 1) {
            iArr[i13] = 2;
        } else {
            if (i14 != 2) {
                if (i14 == 3) {
                    i = 4;
                } else if (i14 == 5) {
                    i = 4;
                } else if (i14 == 4) {
                    iArr[i13] = 5;
                    int H9 = H(true);
                    if (H9 != 58) {
                        if (H9 == 61) {
                            I();
                            throw null;
                        }
                        J("Expected ':'");
                        throw null;
                    }
                } else {
                    if (i14 != 6) {
                        if (i14 == 7) {
                            if (H(false) != -1) {
                                I();
                                throw null;
                            }
                            i15 = 17;
                            this.f25151z = i15;
                            return i15;
                        }
                        i4 = 0;
                        if (i14 == 8) {
                            throw new IllegalStateException("JsonReader is closed");
                        }
                        H8 = H(true);
                        if (H8 == 34) {
                            if (H8 == 39) {
                                I();
                                throw null;
                            }
                            if (H8 == 44 || H8 == 59) {
                                i9 = 1;
                            } else if (H8 != 91) {
                                if (H8 == 93) {
                                    i9 = 1;
                                    if (i14 == 1) {
                                        i15 = 4;
                                    }
                                } else if (H8 != 123) {
                                    int i19 = this.f25147v - 1;
                                    this.f25147v = i19;
                                    char c9 = cArr[i19];
                                    if (c9 == 't' || c9 == 'T') {
                                        str = "TRUE";
                                        str2 = "true";
                                        i10 = 5;
                                    } else if (c9 == 'f' || c9 == 'F') {
                                        str = "FALSE";
                                        str2 = "false";
                                        i10 = 6;
                                    } else {
                                        if (c9 == 'n' || c9 == 'N') {
                                            str = "NULL";
                                            str2 = "null";
                                            i10 = 7;
                                        }
                                        i10 = i4;
                                        if (i10 == 0) {
                                            return i10;
                                        }
                                        int i20 = this.f25147v;
                                        int i21 = this.f25148w;
                                        int i22 = i4;
                                        int i23 = i22;
                                        int i24 = i23;
                                        int i25 = i20;
                                        boolean z8 = true;
                                        long j9 = 0;
                                        while (true) {
                                            if (i25 + i22 == i21) {
                                                if (i22 == 1024) {
                                                    break;
                                                }
                                                if (!G(i22 + 1)) {
                                                    int i26 = i17;
                                                    break;
                                                }
                                                i25 = this.f25147v;
                                                i21 = this.f25148w;
                                            }
                                            char c10 = cArr[i25 + i22];
                                            if (c10 != '+') {
                                                if (c10 == 'E' || c10 == 'e') {
                                                    if (i23 != i17 && i23 != 4) {
                                                        break;
                                                    }
                                                    i23 = 5;
                                                    i22++;
                                                    i18 = 1;
                                                    i17 = 2;
                                                } else if (c10 != '-') {
                                                    if (c10 == '.') {
                                                        if (i23 != i17) {
                                                            break;
                                                        }
                                                        i23 = 3;
                                                        i22++;
                                                        i18 = 1;
                                                        i17 = 2;
                                                    } else {
                                                        if (c10 < '0' || c10 > '9') {
                                                            break;
                                                        }
                                                        if (i23 == i18 || i23 == 0) {
                                                            j9 = -(c10 - '0');
                                                            i23 = 2;
                                                        } else if (i23 == i17) {
                                                            if (j9 == 0) {
                                                                break;
                                                            }
                                                            long j10 = (10 * j9) - (c10 - '0');
                                                            z8 &= j9 > -922337203685477580L || (j9 == -922337203685477580L && j10 < j9);
                                                            j9 = j10;
                                                        } else if (i23 == 3) {
                                                            i23 = 4;
                                                        } else if (i23 == 5 || i23 == 6) {
                                                            i23 = 7;
                                                        }
                                                        i22++;
                                                        i18 = 1;
                                                        i17 = 2;
                                                    }
                                                } else if (i23 == 0) {
                                                    i23 = 1;
                                                    i24 = 1;
                                                    i22++;
                                                    i18 = 1;
                                                    i17 = 2;
                                                } else {
                                                    if (i23 != 5) {
                                                        break;
                                                    }
                                                    i23 = 6;
                                                    i22++;
                                                    i18 = 1;
                                                    i17 = 2;
                                                }
                                                if (i11 == 0) {
                                                    return i11;
                                                }
                                                if (C(cArr[this.f25147v])) {
                                                    I();
                                                    throw null;
                                                }
                                                J("Expected value");
                                                throw null;
                                            }
                                            if (i23 != 5) {
                                                break;
                                            }
                                            i23 = 6;
                                            i22++;
                                            i18 = 1;
                                            i17 = 2;
                                        }
                                        i11 = 0;
                                        if (i11 == 0) {
                                        }
                                    }
                                    int i27 = i4;
                                    while (true) {
                                        int length = str2.length();
                                        if (i27 < length) {
                                            if ((this.f25147v + i27 >= this.f25148w && !G(i27 + 1)) || ((c4 = cArr[this.f25147v + i27]) != str2.charAt(i27) && c4 != str.charAt(i27))) {
                                                break;
                                            }
                                            i27++;
                                        } else if ((this.f25147v + length >= this.f25148w && !G(length + 1)) || !C(cArr[this.f25147v + length])) {
                                            this.f25147v += length;
                                            this.f25151z = i10;
                                        }
                                    }
                                    i10 = i4;
                                    if (i10 == 0) {
                                    }
                                } else {
                                    i15 = 1;
                                }
                            }
                            if (i14 == i9 || i14 == 2) {
                                I();
                                throw null;
                            }
                            J("Unexpected value");
                            throw null;
                        }
                        i15 = 9;
                        this.f25151z = i15;
                        return i15;
                    }
                    iArr[i12 - 1] = 7;
                }
                i16 = 2;
                iArr[i13] = i;
                if (i14 != 5 || (H6 = H(true)) == 44) {
                    int H10 = H(true);
                    if (H10 == 34) {
                        i15 = 13;
                        this.f25151z = i15;
                        return i15;
                    }
                    if (H10 == 39) {
                        I();
                        throw null;
                    }
                    if (H10 != 125) {
                        I();
                        throw null;
                    }
                    if (i14 == 5) {
                        J("Expected name");
                        throw null;
                    }
                } else {
                    if (H6 == 59) {
                        I();
                        throw null;
                    }
                    if (H6 != 125) {
                        J("Unterminated object");
                        throw null;
                    }
                }
                i15 = i16;
                this.f25151z = i15;
                return i15;
            }
            int H11 = H(true);
            if (H11 != 44) {
                if (H11 == 59) {
                    I();
                    throw null;
                }
                if (H11 != 93) {
                    J("Unterminated array");
                    throw null;
                }
                i15 = i16;
                this.f25151z = i15;
                return i15;
            }
        }
        i4 = 0;
        H8 = H(true);
        if (H8 == 34) {
        }
        this.f25151z = i15;
        return i15;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f25151z = 0;
        this.f25141C[0] = 8;
        this.f25142D = 1;
        this.f25145n.close();
    }

    public final String j() {
        String str;
        int i = this.f25151z;
        if (i == 0) {
            i = b();
        }
        if (i == 10) {
            str = E();
        } else if (i == 8) {
            str = D('\'');
        } else if (i == 9) {
            str = D('\"');
        } else if (i == 11) {
            str = null;
        } else if (i == 15) {
            str = Long.toString(this.f25139A);
        } else {
            if (i != 16) {
                throw K("a string");
            }
            str = new String(this.f25146u, this.f25147v, this.f25140B);
            this.f25147v += this.f25140B;
        }
        this.f25151z = 0;
        int[] iArr = this.f25144F;
        int i4 = this.f25142D - 1;
        iArr[i4] = iArr[i4] + 1;
        return str;
    }

    public final String toString() {
        return GK.class.getSimpleName().concat(z());
    }

    public final String z() {
        int i = this.f25149x + 1;
        int i4 = this.f25147v - this.f25150y;
        StringBuilder sb = new StringBuilder("$");
        for (int i9 = 0; i9 < this.f25142D; i9++) {
            int i10 = this.f25141C[i9];
            switch (i10) {
                case 1:
                case 2:
                    int i11 = this.f25144F[i9];
                    sb.append('[');
                    sb.append(i11);
                    sb.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb.append('.');
                    String str = this.f25143E[i9];
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
                    throw new AssertionError(D.y.j(i10, "Unknown scope value: ", new StringBuilder(String.valueOf(i10).length() + 21)));
            }
        }
        int i12 = i4 + 1;
        String sb2 = sb.toString();
        int length = String.valueOf(i).length();
        int length2 = String.valueOf(i12).length();
        StringBuilder sb3 = new StringBuilder(sb2.length() + length2 + length + 17 + 6);
        AbstractC5051n.i(sb3, " at line ", i, " column ", i12);
        return AbstractC5051n.g(sb3, " path ", sb2);
    }
}
