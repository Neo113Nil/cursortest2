package defpackage;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.facebook.internal.ServerProtocol;
import java.io.Closeable;
import java.io.EOFException;
import java.io.StringReader;
import java.util.Arrays;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class z61 implements Closeable {
    public int[] A;
    public final StringReader m;
    public long u;
    public int v;
    public String w;
    public int[] x;
    public String[] z;
    public boolean n = false;
    public final char[] o = new char[1024];
    public int p = 0;
    public int q = 0;
    public int r = 0;
    public int s = 0;
    public int t = 0;
    public int y = 1;

    static {
        u30.n = new u30(22);
    }

    public z61(StringReader stringReader) {
        int[] iArr = new int[32];
        this.x = iArr;
        iArr[0] = 6;
        this.z = new String[32];
        this.A = new int[32];
        this.m = stringReader;
    }

    public final boolean A() {
        int i = this.t;
        if (i == 0) {
            i = n();
        }
        if (i == 5) {
            this.t = 0;
            int[] iArr = this.A;
            int i2 = this.y - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        }
        if (i != 6) {
            dm0.h(q40.w(R()), y(), "Expected a boolean but was ");
            return false;
        }
        this.t = 0;
        int[] iArr2 = this.A;
        int i3 = this.y - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return false;
    }

    public final double B() {
        int i = this.t;
        if (i == 0) {
            i = n();
        }
        if (i == 15) {
            this.t = 0;
            int[] iArr = this.A;
            int i2 = this.y - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.u;
        }
        if (i == 16) {
            this.w = new String(this.o, this.p, this.v);
            this.p += this.v;
        } else if (i == 8 || i == 9) {
            this.w = O(i == 8 ? '\'' : '\"');
        } else if (i == 10) {
            this.w = Q();
        } else if (i != 11) {
            dm0.h(q40.w(R()), y(), "Expected a double but was ");
            return 0.0d;
        }
        this.t = 11;
        double parseDouble = Double.parseDouble(this.w);
        if (!this.n && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw new rh1("JSON forbids NaN and infinities: " + parseDouble + y());
        }
        this.w = null;
        this.t = 0;
        int[] iArr2 = this.A;
        int i3 = this.y - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return parseDouble;
    }

    public final int C() {
        int i = this.t;
        if (i == 0) {
            i = n();
        }
        if (i == 15) {
            long j = this.u;
            int i2 = (int) j;
            if (j == i2) {
                this.t = 0;
                int[] iArr = this.A;
                int i3 = this.y - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new NumberFormatException("Expected an int but was " + this.u + y());
        }
        if (i == 16) {
            this.w = new String(this.o, this.p, this.v);
            this.p += this.v;
        } else {
            if (i != 8 && i != 9 && i != 10) {
                dm0.h(q40.w(R()), y(), "Expected an int but was ");
                return 0;
            }
            if (i == 10) {
                this.w = Q();
            } else {
                this.w = O(i == 8 ? '\'' : '\"');
            }
            try {
                int parseInt = Integer.parseInt(this.w);
                this.t = 0;
                int[] iArr2 = this.A;
                int i4 = this.y - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.t = 11;
        double parseDouble = Double.parseDouble(this.w);
        int i5 = (int) parseDouble;
        if (i5 == parseDouble) {
            this.w = null;
            this.t = 0;
            int[] iArr3 = this.A;
            int i6 = this.y - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        }
        throw new NumberFormatException("Expected an int but was " + this.w + y());
    }

    public final long H() {
        int i = this.t;
        if (i == 0) {
            i = n();
        }
        if (i == 15) {
            this.t = 0;
            int[] iArr = this.A;
            int i2 = this.y - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.u;
        }
        if (i == 16) {
            this.w = new String(this.o, this.p, this.v);
            this.p += this.v;
        } else {
            if (i != 8 && i != 9 && i != 10) {
                dm0.h(q40.w(R()), y(), "Expected a long but was ");
                return 0L;
            }
            if (i == 10) {
                this.w = Q();
            } else {
                this.w = O(i == 8 ? '\'' : '\"');
            }
            try {
                long parseLong = Long.parseLong(this.w);
                this.t = 0;
                int[] iArr2 = this.A;
                int i3 = this.y - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.t = 11;
        double parseDouble = Double.parseDouble(this.w);
        long j = (long) parseDouble;
        if (j == parseDouble) {
            this.w = null;
            this.t = 0;
            int[] iArr3 = this.A;
            int i4 = this.y - 1;
            iArr3[i4] = iArr3[i4] + 1;
            return j;
        }
        throw new NumberFormatException("Expected a long but was " + this.w + y());
    }

    public final String J() {
        String O;
        int i = this.t;
        if (i == 0) {
            i = n();
        }
        if (i == 14) {
            O = Q();
        } else if (i == 12) {
            O = O('\'');
        } else {
            if (i != 13) {
                dm0.h(q40.w(R()), y(), "Expected a name but was ");
                return null;
            }
            O = O('\"');
        }
        this.t = 0;
        this.z[this.y - 1] = O;
        return O;
    }

    public final int L(boolean z) {
        char c;
        int i = this.p;
        int i2 = this.q;
        while (true) {
            if (i == i2) {
                this.p = i;
                if (!q(1)) {
                    if (z) {
                        throw new EOFException("End of input".concat(y()));
                    }
                    return -1;
                }
                i = this.p;
                i2 = this.q;
            }
            int i3 = i + 1;
            char[] cArr = this.o;
            c = cArr[i];
            if (c == '\n') {
                this.r++;
                this.s = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.p = i3;
                    if (i3 == i2) {
                        this.p = i;
                        boolean q = q(2);
                        this.p++;
                        if (!q) {
                            break;
                        }
                    }
                    m();
                    int i4 = this.p;
                    char c2 = cArr[i4];
                    if (c2 == '*') {
                        this.p = i4 + 1;
                        while (true) {
                            if (this.p + 2 > this.q && !q(2)) {
                                X("Unterminated comment");
                                throw null;
                            }
                            int i5 = this.p;
                            if (cArr[i5] != '\n') {
                                int i6 = 0;
                                while (true) {
                                    int i7 = this.p;
                                    if (i6 >= 2) {
                                        i = i7 + 2;
                                        i2 = this.q;
                                        break;
                                    }
                                    if (cArr[i7 + i6] != "*/".charAt(i6)) {
                                        break;
                                    }
                                    i6++;
                                }
                            } else {
                                this.r++;
                                this.s = i5 + 1;
                            }
                            this.p++;
                        }
                    } else {
                        if (c2 != '/') {
                            break;
                        }
                        this.p = i4 + 1;
                        V();
                        i = this.p;
                        i2 = this.q;
                    }
                } else {
                    if (c != '#') {
                        this.p = i3;
                        return c;
                    }
                    this.p = i3;
                    m();
                    V();
                    i = this.p;
                    i2 = this.q;
                }
            }
            i = i3;
        }
        return c;
    }

    public final void N() {
        int i = this.t;
        if (i == 0) {
            i = n();
        }
        if (i != 7) {
            dm0.h(q40.w(R()), y(), "Expected null but was ");
            return;
        }
        this.t = 0;
        int[] iArr = this.A;
        int i2 = this.y - 1;
        iArr[i2] = iArr[i2] + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
    
        r10.p = r8;
        r8 = r8 - r3;
        r2 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
    
        if (r1 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r8 * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005b, code lost:
    
        if (r1 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005d, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006b, code lost:
    
        r1.append(r7, r3, r2 - r3);
        r10.p = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String O(char c) {
        char[] cArr;
        int i;
        StringBuilder sb = null;
        do {
            int i2 = this.p;
            int i3 = this.q;
            while (true) {
                int i4 = i3;
                int i5 = i2;
                while (true) {
                    cArr = this.o;
                    if (i2 >= i4) {
                        break;
                    }
                    int i6 = i2 + 1;
                    char c2 = cArr[i2];
                    if (c2 == c) {
                        this.p = i6;
                        int i7 = (i6 - i5) - 1;
                        if (sb == null) {
                            return new String(cArr, i5, i7);
                        }
                        sb.append(cArr, i5, i7);
                        return sb.toString();
                    }
                    if (c2 == '\\') {
                        break;
                    }
                    if (c2 == '\n') {
                        this.r++;
                        this.s = i6;
                    }
                    i2 = i6;
                }
                sb.append(cArr, i5, i);
                sb.append(T());
                i2 = this.p;
                i3 = this.q;
            }
        } while (q(1));
        X("Unterminated string");
        throw null;
    }

    public final String P() {
        String str;
        int i = this.t;
        if (i == 0) {
            i = n();
        }
        if (i == 10) {
            str = Q();
        } else if (i == 8) {
            str = O('\'');
        } else if (i == 9) {
            str = O('\"');
        } else if (i == 11) {
            str = this.w;
            this.w = null;
        } else if (i == 15) {
            str = Long.toString(this.u);
        } else {
            if (i != 16) {
                dm0.h(q40.w(R()), y(), "Expected a string but was ");
                return null;
            }
            str = new String(this.o, this.p, this.v);
            this.p += this.v;
        }
        this.t = 0;
        int[] iArr = this.A;
        int i2 = this.y - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0048, code lost:
    
        m();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:55:0x0042. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String Q() {
        char[] cArr;
        String sb;
        StringBuilder sb2 = null;
        int i = 0;
        do {
            int i2 = 0;
            while (true) {
                int i3 = this.p + i2;
                int i4 = this.q;
                cArr = this.o;
                if (i3 < i4) {
                    char c = cArr[i3];
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
                } else if (i2 >= cArr.length) {
                    if (sb2 == null) {
                        sb2 = new StringBuilder(Math.max(i2, 16));
                    }
                    sb2.append(cArr, this.p, i2);
                    this.p += i2;
                } else if (q(i2 + 1)) {
                }
            }
            i = i2;
            int i5 = this.p;
            if (sb2 != null) {
                sb = new String(cArr, i5, i);
            } else {
                sb2.append(cArr, i5, i);
                sb = sb2.toString();
            }
            this.p += i;
            return sb;
        } while (q(1));
        int i52 = this.p;
        if (sb2 != null) {
        }
        this.p += i;
        return sb;
    }

    public final int R() {
        int i = this.t;
        if (i == 0) {
            i = n();
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
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
            case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
            case ViewHierarchyConstants.RADIO_GROUP_BITMASK /* 14 */:
                return 5;
            case 15:
            case ViewHierarchyConstants.RATINGBAR_BITMASK /* 16 */:
                return 7;
            case FacebookRequestErrorClassification.EC_USER_TOO_MANY_CALLS /* 17 */:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    public final void S(int i) {
        int i2 = this.y;
        int[] iArr = this.x;
        if (i2 == iArr.length) {
            int i3 = i2 * 2;
            this.x = Arrays.copyOf(iArr, i3);
            this.A = Arrays.copyOf(this.A, i3);
            this.z = (String[]) Arrays.copyOf(this.z, i3);
        }
        int[] iArr2 = this.x;
        int i4 = this.y;
        this.y = i4 + 1;
        iArr2[i4] = i;
    }

    public final char T() {
        int i;
        if (this.p == this.q && !q(1)) {
            X("Unterminated escape sequence");
            throw null;
        }
        int i2 = this.p;
        int i3 = i2 + 1;
        this.p = i3;
        char[] cArr = this.o;
        char c = cArr[i2];
        if (c == '\n') {
            this.r++;
            this.s = i3;
            return c;
        }
        if (c == '\"' || c == '\'' || c == '/' || c == '\\') {
            return c;
        }
        if (c == 'b') {
            return '\b';
        }
        if (c == 'f') {
            return '\f';
        }
        if (c == 'n') {
            return '\n';
        }
        if (c == 'r') {
            return '\r';
        }
        if (c == 't') {
            return '\t';
        }
        if (c != 'u') {
            X("Invalid escape sequence");
            throw null;
        }
        if (i2 + 5 > this.q && !q(4)) {
            X("Unterminated escape sequence");
            throw null;
        }
        int i4 = this.p;
        int i5 = i4 + 4;
        char c2 = 0;
        while (i4 < i5) {
            char c3 = cArr[i4];
            char c4 = (char) (c2 << 4);
            if (c3 >= '0' && c3 <= '9') {
                i = c3 - '0';
            } else if (c3 >= 'a' && c3 <= 'f') {
                i = c3 - 'W';
            } else {
                if (c3 < 'A' || c3 > 'F') {
                    throw new NumberFormatException("\\u".concat(new String(cArr, this.p, 4)));
                }
                i = c3 - '7';
            }
            c2 = (char) (i + c4);
            i4++;
        }
        this.p += 4;
        return c2;
    }

    public final void U(char c) {
        do {
            int i = this.p;
            int i2 = this.q;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = this.o[i];
                if (c2 == c) {
                    this.p = i3;
                    return;
                }
                if (c2 == '\\') {
                    this.p = i3;
                    T();
                    i = this.p;
                    i2 = this.q;
                } else {
                    if (c2 == '\n') {
                        this.r++;
                        this.s = i3;
                    }
                    i = i3;
                }
            }
            this.p = i;
        } while (q(1));
        X("Unterminated string");
        throw null;
    }

    public final void V() {
        char c;
        do {
            if (this.p >= this.q && !q(1)) {
                return;
            }
            int i = this.p;
            int i2 = i + 1;
            this.p = i2;
            c = this.o[i];
            if (c == '\n') {
                this.r++;
                this.s = i2;
                return;
            }
        } while (c != '\r');
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:65:0x009b. Please report as an issue. */
    public final void W() {
        int i = 0;
        do {
            int i2 = this.t;
            if (i2 == 0) {
                i2 = n();
            }
            if (i2 == 3) {
                S(1);
            } else if (i2 == 1) {
                S(3);
            } else {
                if (i2 == 4) {
                    this.y--;
                } else if (i2 == 2) {
                    this.y--;
                } else {
                    if (i2 == 14 || i2 == 10) {
                        do {
                            int i3 = 0;
                            while (true) {
                                int i4 = this.p + i3;
                                if (i4 < this.q) {
                                    char c = this.o[i4];
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
                                                                    i3++;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    this.p = i4;
                                }
                            }
                            m();
                            this.p += i3;
                        } while (q(1));
                    } else if (i2 == 8 || i2 == 12) {
                        U('\'');
                    } else if (i2 == 9 || i2 == 13) {
                        U('\"');
                    } else if (i2 == 16) {
                        this.p += this.v;
                    }
                    this.t = 0;
                }
                i--;
                this.t = 0;
            }
            i++;
            this.t = 0;
        } while (i != 0);
        int[] iArr = this.A;
        int i5 = this.y - 1;
        iArr[i5] = iArr[i5] + 1;
        this.z[i5] = "null";
    }

    public final void X(String str) {
        throw new rh1(str.concat(y()));
    }

    public final void b() {
        int i = this.t;
        if (i == 0) {
            i = n();
        }
        if (i != 3) {
            dm0.h(q40.w(R()), y(), "Expected BEGIN_ARRAY but was ");
            return;
        }
        S(1);
        this.A[this.y - 1] = 0;
        this.t = 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.t = 0;
        this.x[0] = 8;
        this.y = 1;
        this.m.close();
    }

    public final void f() {
        int i = this.t;
        if (i == 0) {
            i = n();
        }
        if (i != 1) {
            dm0.h(q40.w(R()), y(), "Expected BEGIN_OBJECT but was ");
        } else {
            S(3);
            this.t = 0;
        }
    }

    public final void m() {
        if (this.n) {
            return;
        }
        X("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x020a, code lost:
    
        if (v(r9) != false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0199, code lost:
    
        r10 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x020d, code lost:
    
        if (r11 != 2) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x020f, code lost:
    
        if (r13 == false) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0215, code lost:
    
        if (r14 != Long.MIN_VALUE) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0217, code lost:
    
        if (r4 == false) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x021e, code lost:
    
        if (r14 != 0) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0220, code lost:
    
        if (r4 != false) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0222, code lost:
    
        if (r4 == false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0225, code lost:
    
        r14 = -r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0226, code lost:
    
        r24.u = r14;
        r24.p += r2;
        r9 = 15;
        r24.t = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x021a, code lost:
    
        r10 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0232, code lost:
    
        if (r11 == r10) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0235, code lost:
    
        if (r11 == 4) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0238, code lost:
    
        if (r11 != 7) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x023a, code lost:
    
        r24.v = r2;
        r9 = 16;
        r24.t = 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0179 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0265 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0266  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int n() {
        int L;
        String str;
        String str2;
        int i;
        int i2;
        char c;
        char c2;
        int i3;
        int[] iArr = this.x;
        int i4 = this.y - 1;
        int i5 = iArr[i4];
        char[] cArr = this.o;
        if (i5 == 1) {
            iArr[i4] = 2;
        } else if (i5 == 2) {
            int L2 = L(true);
            if (L2 != 44) {
                if (L2 != 59) {
                    if (L2 == 93) {
                        this.t = 4;
                        return 4;
                    }
                    X("Unterminated array");
                    throw null;
                }
                m();
            }
        } else {
            if (i5 == 3 || i5 == 5) {
                iArr[i4] = 4;
                if (i5 == 5 && (L = L(true)) != 44) {
                    if (L != 59) {
                        if (L == 125) {
                            this.t = 2;
                            return 2;
                        }
                        X("Unterminated object");
                        throw null;
                    }
                    m();
                }
                int L3 = L(true);
                if (L3 == 34) {
                    this.t = 13;
                    return 13;
                }
                if (L3 == 39) {
                    m();
                    this.t = 12;
                    return 12;
                }
                if (L3 == 125) {
                    if (i5 != 5) {
                        this.t = 2;
                        return 2;
                    }
                    X("Expected name");
                    throw null;
                }
                m();
                this.p--;
                if (v((char) L3)) {
                    this.t = 14;
                    return 14;
                }
                X("Expected name");
                throw null;
            }
            if (i5 == 4) {
                iArr[i4] = 5;
                int L4 = L(true);
                if (L4 != 58) {
                    if (L4 != 61) {
                        X("Expected ':'");
                        throw null;
                    }
                    m();
                    if (this.p < this.q || q(1)) {
                        int i6 = this.p;
                        if (cArr[i6] == '>') {
                            this.p = i6 + 1;
                        }
                    }
                }
            } else if (i5 == 6) {
                if (this.n) {
                    L(true);
                    int i7 = this.p;
                    int i8 = i7 - 1;
                    this.p = i8;
                    if ((i7 + 4 <= this.q || q(5)) && cArr[i8] == ')' && cArr[i7] == ']' && cArr[i7 + 1] == '}' && cArr[i7 + 2] == '\'' && cArr[i7 + 3] == '\n') {
                        this.p += 5;
                    }
                }
                this.x[this.y - 1] = 7;
            } else if (i5 == 7) {
                if (L(false) == -1) {
                    this.t = 17;
                    return 17;
                }
                m();
                this.p--;
            } else if (i5 == 8) {
                lh.g("JsonReader is closed");
                return 0;
            }
        }
        int L5 = L(true);
        if (L5 == 34) {
            this.t = 9;
            return 9;
        }
        if (L5 == 39) {
            m();
            this.t = 8;
            return 8;
        }
        if (L5 != 44 && L5 != 59) {
            if (L5 == 91) {
                this.t = 3;
                return 3;
            }
            if (L5 != 93) {
                if (L5 == 123) {
                    this.t = 1;
                    return 1;
                }
                int i9 = this.p - 1;
                this.p = i9;
                char c3 = cArr[i9];
                if (c3 == 't' || c3 == 'T') {
                    str = ServerProtocol.DIALOG_RETURN_SCOPES_TRUE;
                    str2 = "TRUE";
                    i = 5;
                } else if (c3 == 'f' || c3 == 'F') {
                    str = "false";
                    str2 = "FALSE";
                    i = 6;
                } else {
                    if (c3 == 'n' || c3 == 'N') {
                        str = "null";
                        str2 = "NULL";
                        i = 7;
                    }
                    i2 = 0;
                    if (i2 == 0) {
                        return i2;
                    }
                    int i10 = this.p;
                    int i11 = this.q;
                    boolean z = true;
                    int i12 = 0;
                    boolean z2 = false;
                    char c4 = 0;
                    long j = 0;
                    while (true) {
                        if (i10 + i12 == i11) {
                            if (i12 == cArr.length) {
                                break;
                            }
                            if (!q(i12 + 1)) {
                                break;
                            }
                            i10 = this.p;
                            i11 = this.q;
                        }
                        char c5 = cArr[i10 + i12];
                        if (c5 != '+') {
                            if (c5 == 'E' || c5 == 'e') {
                                if (c4 != 2 && c4 != 4) {
                                    break;
                                }
                                c4 = 5;
                                i12++;
                            } else if (c5 == '-') {
                                c2 = 6;
                                if (c4 == 0) {
                                    z2 = true;
                                    c4 = 1;
                                    i12++;
                                } else {
                                    if (c4 != 5) {
                                        break;
                                    }
                                    c4 = c2;
                                    i12++;
                                }
                            } else if (c5 == '.') {
                                if (c4 != 2) {
                                    break;
                                }
                                c4 = 3;
                                i12++;
                            } else {
                                if (c5 < '0' || c5 > '9') {
                                    break;
                                }
                                if (c4 == 1 || c4 == 0) {
                                    j = -(c5 - '0');
                                    c4 = 2;
                                } else if (c4 == 2) {
                                    if (j == 0) {
                                        break;
                                    }
                                    long j2 = (10 * j) - (c5 - '0');
                                    z &= j > -922337203685477580L || (j == -922337203685477580L && j2 < j);
                                    j = j2;
                                } else if (c4 == 3) {
                                    c4 = 4;
                                } else if (c4 == 5 || c4 == 6) {
                                    c4 = 7;
                                }
                                i12++;
                            }
                            if (i3 == 0) {
                                return i3;
                            }
                            if (!v(cArr[this.p])) {
                                X("Expected value");
                                throw null;
                            }
                            m();
                            this.t = 10;
                            return 10;
                        }
                        c2 = 6;
                        if (c4 != 5) {
                            break;
                        }
                        c4 = c2;
                        i12++;
                    }
                    i3 = 0;
                    if (i3 == 0) {
                    }
                }
                int length = str.length();
                int i13 = 1;
                while (true) {
                    int i14 = this.p;
                    int i15 = this.q;
                    if (i13 < length) {
                        if ((i14 + i13 >= i15 && !q(i13 + 1)) || ((c = cArr[this.p + i13]) != str.charAt(i13) && c != str2.charAt(i13))) {
                            break;
                        }
                        i13++;
                    } else if ((i14 + length >= i15 && !q(length + 1)) || !v(cArr[this.p + length])) {
                        this.p += length;
                        this.t = i;
                        i2 = i;
                    }
                }
                if (i2 == 0) {
                }
            } else if (i5 == 1) {
                this.t = 4;
                return 4;
            }
        }
        if (i5 != 1 && i5 != 2) {
            X("Unexpected value");
            throw null;
        }
        m();
        this.p--;
        this.t = 7;
        return 7;
    }

    public final void o() {
        int i = this.t;
        if (i == 0) {
            i = n();
        }
        if (i != 4) {
            dm0.h(q40.w(R()), y(), "Expected END_ARRAY but was ");
            return;
        }
        int i2 = this.y;
        this.y = i2 - 1;
        int[] iArr = this.A;
        int i3 = i2 - 2;
        iArr[i3] = iArr[i3] + 1;
        this.t = 0;
    }

    public final void p() {
        int i = this.t;
        if (i == 0) {
            i = n();
        }
        if (i != 2) {
            dm0.h(q40.w(R()), y(), "Expected END_OBJECT but was ");
            return;
        }
        int i2 = this.y;
        int i3 = i2 - 1;
        this.y = i3;
        this.z[i3] = null;
        int[] iArr = this.A;
        int i4 = i2 - 2;
        iArr[i4] = iArr[i4] + 1;
        this.t = 0;
    }

    public final boolean q(int i) {
        int i2;
        int i3;
        int i4 = this.s;
        int i5 = this.p;
        this.s = i4 - i5;
        int i6 = this.q;
        char[] cArr = this.o;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.q = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.q = 0;
        }
        this.p = 0;
        do {
            int i8 = this.q;
            int read = this.m.read(cArr, i8, cArr.length - i8);
            if (read == -1) {
                return false;
            }
            i2 = this.q + read;
            this.q = i2;
            if (this.r == 0 && (i3 = this.s) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.p++;
                this.s = i3 + 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    public final boolean s() {
        int i = this.t;
        if (i == 0) {
            i = n();
        }
        return (i == 2 || i == 4) ? false : true;
    }

    public final String toString() {
        return z61.class.getSimpleName().concat(y());
    }

    public final boolean v(char c) {
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
        m();
        return false;
    }

    public final String y() {
        int i = this.r + 1;
        int i2 = (this.p - this.s) + 1;
        StringBuilder sb = new StringBuilder(" at line ");
        sb.append(i);
        sb.append(" column ");
        sb.append(i2);
        sb.append(" path ");
        StringBuilder sb2 = new StringBuilder("$");
        int i3 = this.y;
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = this.x[i4];
            if (i5 == 1 || i5 == 2) {
                sb2.append('[');
                sb2.append(this.A[i4]);
                sb2.append(']');
            } else if (i5 == 3 || i5 == 4 || i5 == 5) {
                sb2.append('.');
                String str = this.z[i4];
                if (str != null) {
                    sb2.append(str);
                }
            }
        }
        sb.append(sb2.toString());
        return sb.toString();
    }
}
