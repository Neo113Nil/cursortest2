package defpackage;

import java.util.ArrayList;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class z implements Cloneable {
    public static final int[] e;
    private static final int h;
    public String a;
    public ArrayList c;
    public boolean d;
    private boolean g;
    public ArrayList b = new ArrayList();
    public final int f = h;

    static {
        int i;
        String a = c.a();
        int hashCode = a.hashCode();
        if (hashCode == -413919155) {
            if (a.equals("DOUBLE_REQUIRED")) {
                i = 2;
                h = i;
                e = new int[]{1, 2, 3, 4, 5, 6};
                return;
            }
            throw new IllegalArgumentException();
        }
        if (hashCode == -99796978 && a.equals("DOUBLE_OPTIONAL")) {
            i = 1;
            h = i;
            e = new int[]{1, 2, 3, 4, 5, 6};
            return;
        }
        throw new IllegalArgumentException();
    }

    public z(String str) {
        i(str);
    }

    private final int j(int i) {
        char charAt;
        while (i < this.a.length() && (((charAt = this.a.charAt(i)) >= '0' || "+-.".indexOf(charAt) >= 0) && (charAt <= '9' || charAt == 'e' || charAt == 'E' || charAt == 8734))) {
            i++;
        }
        return i;
    }

    private final int k(int i) {
        String str = this.a;
        byte[] bArr = f.a;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt > 255) {
                if (charAt >= 8206) {
                    if (charAt > 12336) {
                        if (charAt >= 64830) {
                            if (charAt <= 65094) {
                                if (charAt <= 64831 || charAt >= 65093) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else if (((f.c[f.b[(charAt - 8192) >> 5]] >> (charAt & 31)) & 1) != 0) {
                        break;
                    }
                } else {
                    continue;
                }
                i++;
            } else {
                if (f.a[charAt] != 0) {
                    break;
                }
                i++;
            }
        }
        return i;
    }

    private final int l(int i) {
        String str = this.a;
        byte[] bArr = f.a;
        while (i < str.length() && f.a(str.charAt(i))) {
            i++;
        }
        return i;
    }

    private final String m() {
        return o(this.a, 0);
    }

    private final String n(int i) {
        return o(this.a, i);
    }

    private static String o(String str, int i) {
        StringBuilder sb = new StringBuilder(44);
        if (i == 0) {
            sb.append("\"");
        } else {
            sb.append("[at pattern index ");
            sb.append(i);
            sb.append("] \"");
        }
        if (str.length() - i <= 24) {
            if (i != 0) {
                str = str.substring(i);
            }
            sb.append(str);
        } else {
            int i2 = i + 20;
            int i3 = i + 19;
            if (true == Character.isHighSurrogate(str.charAt(i3))) {
                i2 = i3;
            }
            sb.append((CharSequence) str, i, i2);
            sb.append(" ...");
        }
        sb.append("\"");
        return sb.toString();
    }

    private final void p(double d, int i, int i2) {
        int size;
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            this.c = new ArrayList();
            size = 0;
        } else {
            size = arrayList.size();
            if (size > 32767) {
                throw new IndexOutOfBoundsException("Too many numeric values");
            }
        }
        this.c.add(Double.valueOf(d));
        v(14, i, i2, size);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0059 A[LOOP:0: B:16:0x0059->B:23:0x0078, LOOP_START, PHI: r0 r1 r3
      0x0059: PHI (r0v6 char) = (r0v5 char), (r0v11 char) binds: [B:6:0x0031, B:23:0x0078] A[DONT_GENERATE, DONT_INLINE]
      0x0059: PHI (r1v5 int) = (r1v4 int), (r1v6 int) binds: [B:6:0x0031, B:23:0x0078] A[DONT_GENERATE, DONT_INLINE]
      0x0059: PHI (r3v1 int) = (r3v0 int), (r3v3 int) binds: [B:6:0x0031, B:23:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void q(int i, int i2, boolean z) {
        int i3;
        int i4;
        char charAt = this.a.charAt(i);
        int i5 = i + 1;
        int i6 = 0;
        if (charAt == '-') {
            if (i5 != i2) {
                char charAt2 = this.a.charAt(i5);
                i5 = i + 2;
                charAt = charAt2;
                i3 = 1;
                if (charAt == 8734) {
                    while (true) {
                        i4 = i2 - i;
                        if (charAt < '0' || charAt > '9' || (i6 = (i6 * 10) + (charAt - '0')) > i3 + 32767) {
                            break;
                        }
                        if (i5 == i2) {
                            if (i3 != 0) {
                                i6 = -i6;
                            }
                            v(13, i, i4, i6);
                            return;
                        } else {
                            char charAt3 = this.a.charAt(i5);
                            i5++;
                            charAt = charAt3;
                        }
                    }
                    p(Double.parseDouble(this.a.substring(i, i2)), i, i4);
                    return;
                }
                if (z && i5 == i2) {
                    p(1 != i3 ? Double.POSITIVE_INFINITY : Double.NEGATIVE_INFINITY, i, i2 - i);
                    return;
                }
            }
            throw new NumberFormatException("Bad syntax for numeric value: ".concat(String.valueOf(this.a.substring(i, i2))));
        }
        if (charAt == '+') {
            if (i5 != i2) {
                char charAt4 = this.a.charAt(i5);
                i5 = i + 2;
                charAt = charAt4;
            }
            throw new NumberFormatException("Bad syntax for numeric value: ".concat(String.valueOf(this.a.substring(i, i2))));
        }
        i3 = 0;
        if (charAt == 8734) {
        }
    }

    private final boolean r(int i) {
        return i > 0 || ((y) this.b.get(0)).e == 1;
    }

    private final boolean s(int i) {
        char charAt = this.a.charAt(i);
        if (charAt != 's' && charAt != 'S') {
            return false;
        }
        char charAt2 = this.a.charAt(i + 1);
        if (charAt2 != 'e' && charAt2 != 'E') {
            return false;
        }
        int i2 = i + 3;
        char charAt3 = this.a.charAt(i + 2);
        if (charAt3 != 'l' && charAt3 != 'L') {
            return false;
        }
        int i3 = i + 4;
        char charAt4 = this.a.charAt(i2);
        if (charAt4 != 'e' && charAt4 != 'E') {
            return false;
        }
        int i4 = i + 5;
        char charAt5 = this.a.charAt(i3);
        if (charAt5 != 'c' && charAt5 != 'C') {
            return false;
        }
        char charAt6 = this.a.charAt(i4);
        return charAt6 == 't' || charAt6 == 'T';
    }

    /* JADX WARN: Code restructure failed: missing block: B:291:0x0629, code lost:
    
        if (r9 == r(r6)) goto L406;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x062b, code lost:
    
        if (r3 == false) goto L407;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x0665, code lost:
    
        throw new java.lang.IllegalArgumentException("Missing 'other' keyword in " + defpackage.e.a(r4).toLowerCase(java.util.Locale.ENGLISH) + " pattern in " + m());
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x068f, code lost:
    
        throw new java.lang.IllegalArgumentException("Bad " + defpackage.e.a(r4).toLowerCase(java.util.Locale.ENGLISH) + " pattern syntax: " + n(r13));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x06ca A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int t(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int l;
        char charAt;
        int i9;
        int l2;
        int k;
        int i10;
        char charAt2;
        char charAt3;
        char charAt4;
        int indexOf;
        int i11;
        int i12 = i3;
        int i13 = i4;
        if (i12 > 32767) {
            throw new IndexOutOfBoundsException();
        }
        int size = this.b.size();
        boolean z = true;
        v(1, i, i2, i12);
        int i14 = i + i2;
        loop0: while (i14 < this.a.length()) {
            int i15 = i14 + 1;
            char charAt5 = this.a.charAt(i14);
            if (charAt5 == '\'') {
                if (i15 == this.a.length()) {
                    v(4, i15, 0, 39);
                } else {
                    char charAt6 = this.a.charAt(i15);
                    if (charAt6 == '\'') {
                        i14 += 2;
                        v(3, i15, z ? 1 : 0, 0);
                    } else {
                        if (this.f != 2 && charAt6 != '{' && charAt6 != '}') {
                            if (i13 != 3) {
                                i11 = i13;
                            } else if (charAt6 != '|') {
                                i11 = 3;
                            }
                            if (!e.b(i11) || charAt6 != '#') {
                                v(4, i15, 0, 39);
                            }
                        }
                        v(3, i14, z ? 1 : 0, 0);
                        while (true) {
                            indexOf = this.a.indexOf(39, i15 + (z ? 1 : 0));
                            String str = this.a;
                            if (indexOf < 0) {
                                i14 = str.length();
                                v(4, i14, 0, 39);
                                break;
                            }
                            i15 = indexOf + 1;
                            if (i15 >= str.length() || this.a.charAt(i15) != '\'') {
                                break;
                            }
                            v(3, i15, z ? 1 : 0, 0);
                        }
                        v(3, indexOf, z ? 1 : 0, 0);
                        i14 = i15;
                    }
                }
            } else if (e.b(i13) && charAt5 == '#') {
                v(5, i14, z ? 1 : 0, 0);
            } else {
                if (charAt5 != '{') {
                    if (i12 <= 0 || charAt5 != '}') {
                        i5 = 3;
                        if (i13 == 3 && charAt5 == '|') {
                            i13 = 3;
                        }
                    } else {
                        charAt5 = '}';
                        i5 = 3;
                    }
                    u(size, 2, i14, (i13 == i5 && charAt5 == '}') ? 0 : 1, i12);
                    return i13 == i5 ? i14 : i15;
                }
                int size2 = this.b.size();
                v(6, i14, z ? 1 : 0, 0);
                int l3 = l(i14 + 1);
                if (l3 == this.a.length()) {
                    throw new IllegalArgumentException("Unmatched '{' braces in message ".concat(m()));
                }
                int k2 = k(l3);
                String str2 = this.a;
                char c = 65535;
                if (l3 < k2) {
                    int i16 = l3 + 1;
                    char charAt7 = str2.charAt(l3);
                    if (charAt7 != '0') {
                        if (charAt7 >= '1' && charAt7 <= '9') {
                            i6 = charAt7 - '0';
                            i7 = 0;
                        }
                        i8 = -1;
                        if (i8 < 0) {
                        }
                        l = l(k2);
                        if (l != this.a.length()) {
                        }
                    } else if (i16 == k2) {
                        i8 = 0;
                        if (i8 < 0) {
                            int i17 = k2 - l3;
                            if (i17 > 65535 || i8 > 32767) {
                                throw new IndexOutOfBoundsException("Argument number too large: ".concat(n(l3)));
                            }
                            v(8, l3, i17, i8);
                        } else {
                            if (i8 != -1) {
                                throw new IllegalArgumentException("Bad argument syntax: ".concat(n(l3)));
                            }
                            int i18 = k2 - l3;
                            if (i18 > 65535) {
                                throw new IndexOutOfBoundsException("Argument name too long: ".concat(n(l3)));
                            }
                            this.d = z;
                            v(9, l3, i18, 0);
                        }
                        l = l(k2);
                        if (l != this.a.length()) {
                            throw new IllegalArgumentException("Unmatched '{' braces in message ".concat(m()));
                        }
                        char charAt8 = this.a.charAt(l);
                        if (charAt8 != '}') {
                            if (charAt8 != ',') {
                                throw new IllegalArgumentException("Bad argument syntax: ".concat(n(l3)));
                            }
                            int l4 = l(l + 1);
                            int i19 = l4;
                            while (true) {
                                char c2 = c;
                                if (i19 >= this.a.length() || (((charAt4 = this.a.charAt(i19)) < 'a' || charAt4 > 'z') && (charAt4 < 'A' || charAt4 > 'Z'))) {
                                    break;
                                }
                                i19++;
                                c = c2;
                            }
                            int i20 = i19 - l4;
                            int l5 = l(i19);
                            if (l5 == this.a.length()) {
                                throw new IllegalArgumentException("Unmatched '{' braces in message ".concat(m()));
                            }
                            if (i20 != 0) {
                                char charAt9 = this.a.charAt(l5);
                                if (charAt9 != ',') {
                                    if (charAt9 == '}') {
                                        charAt9 = '}';
                                    }
                                }
                                if (i20 > 65535) {
                                    throw new IndexOutOfBoundsException("Argument type name too long: ".concat(n(l3)));
                                }
                                if (i20 == 6) {
                                    int i21 = l4 + 1;
                                    char charAt10 = this.a.charAt(l4);
                                    if (charAt10 == 'c' || charAt10 == 'C') {
                                        int i22 = l4 + 2;
                                        char charAt11 = this.a.charAt(i21);
                                        if (charAt11 == 'h' || charAt11 == 'H') {
                                            int i23 = l4 + 3;
                                            char charAt12 = this.a.charAt(i22);
                                            if (charAt12 == 'o' || charAt12 == 'O') {
                                                int i24 = l4 + 4;
                                                char charAt13 = this.a.charAt(i23);
                                                if (charAt13 == 'i' || charAt13 == 'I') {
                                                    int i25 = l4 + 5;
                                                    char charAt14 = this.a.charAt(i24);
                                                    if ((charAt14 == 'c' || charAt14 == 'C') && ((charAt2 = this.a.charAt(i25)) == 'e' || charAt2 == 'E')) {
                                                        i9 = 3;
                                                        ((y) this.b.get(size2)).c = (short) (i9 - 1);
                                                        if (i9 == 2) {
                                                            v(10, l4, i20, 0);
                                                        }
                                                        if (charAt9 == '}') {
                                                            int i26 = l5 + 1;
                                                            if (i9 == 2) {
                                                                l2 = i26;
                                                                int i27 = 0;
                                                                while (l2 < this.a.length()) {
                                                                    int i28 = l2 + 1;
                                                                    char charAt15 = this.a.charAt(l2);
                                                                    if (charAt15 == '\'') {
                                                                        int indexOf2 = this.a.indexOf(39, i28);
                                                                        if (indexOf2 < 0) {
                                                                            throw new IllegalArgumentException("Quoted literal argument style text reaches to the end of the message: ".concat(n(i26)));
                                                                        }
                                                                        l2 = indexOf2 + 1;
                                                                    } else {
                                                                        if (charAt15 == '{') {
                                                                            i27++;
                                                                        } else if (charAt15 == '}') {
                                                                            if (i27 > 0) {
                                                                                i27--;
                                                                            } else {
                                                                                int i29 = l2 - i26;
                                                                                if (i29 > 65535) {
                                                                                    throw new IndexOutOfBoundsException("Argument style text too long: ".concat(n(i26)));
                                                                                }
                                                                                v(11, i26, i29, 0);
                                                                            }
                                                                        }
                                                                        l2 = i28;
                                                                    }
                                                                }
                                                                throw new IllegalArgumentException("Unmatched '{' braces in message ".concat(m()));
                                                            }
                                                            if (i9 != 3) {
                                                                int i30 = i26;
                                                                boolean z2 = false;
                                                                boolean z3 = true;
                                                                while (true) {
                                                                    l2 = l(i30);
                                                                    boolean z4 = l2 == this.a.length();
                                                                    if (z4 || this.a.charAt(l2) == '}') {
                                                                        break;
                                                                    }
                                                                    if (e.b(i9) && this.a.charAt(l2) == '=') {
                                                                        int i31 = l2 + 1;
                                                                        k = j(i31);
                                                                        int i32 = k - l2;
                                                                        if (i32 == 1) {
                                                                            throw new IllegalArgumentException("Bad " + e.a(i9).toLowerCase(Locale.ENGLISH) + " pattern syntax: " + n(i26));
                                                                        }
                                                                        if (i32 > 65535) {
                                                                            throw new IndexOutOfBoundsException("Argument selector too long: ".concat(n(l2)));
                                                                        }
                                                                        v(12, l2, i32, 0);
                                                                        q(i31, k, false);
                                                                    } else {
                                                                        k = k(l2);
                                                                        int i33 = k - l2;
                                                                        if (i33 == 0) {
                                                                            throw new IllegalArgumentException("Bad " + e.a(i9).toLowerCase(Locale.ENGLISH) + " pattern syntax: " + n(i26));
                                                                        }
                                                                        if (e.b(i9) && i33 == 6) {
                                                                            if (k >= this.a.length() || !this.a.regionMatches(l2, "offset:", 0, 7)) {
                                                                                i33 = 6;
                                                                            } else {
                                                                                if (!z3) {
                                                                                    throw new IllegalArgumentException("Plural argument 'offset:' (if present) must precede key-message pairs: ".concat(n(i26)));
                                                                                }
                                                                                int l6 = l(k + 1);
                                                                                i30 = j(l6);
                                                                                if (i30 == l6) {
                                                                                    throw new IllegalArgumentException("Missing value for plural 'offset:' ".concat(n(i26)));
                                                                                }
                                                                                if (i30 - l6 > 65535) {
                                                                                    throw new IndexOutOfBoundsException("Plural offset value too long: ".concat(n(l6)));
                                                                                }
                                                                                q(l6, i30, false);
                                                                                z3 = false;
                                                                            }
                                                                        }
                                                                        if (i33 > 65535) {
                                                                            throw new IndexOutOfBoundsException("Argument selector too long: ".concat(n(l2)));
                                                                        }
                                                                        v(12, l2, i33, 0);
                                                                        if (this.a.regionMatches(l2, "other", 0, i33)) {
                                                                            z2 = true;
                                                                        }
                                                                    }
                                                                    int l7 = l(k);
                                                                    if (l7 == this.a.length() || this.a.charAt(l7) != '{') {
                                                                        break loop0;
                                                                    }
                                                                    i30 = t(l7, 1, i12 + 1, i9);
                                                                    z3 = false;
                                                                }
                                                                throw new IllegalArgumentException("No message fragment after " + e.a(i9).toLowerCase(Locale.ENGLISH) + " selector: " + n(l2));
                                                            }
                                                            int l8 = l(i26);
                                                            if (l8 == this.a.length() || this.a.charAt(l8) == '}') {
                                                                throw new IllegalArgumentException("Missing choice argument pattern in ".concat(m()));
                                                            }
                                                            while (true) {
                                                                int j = j(l8);
                                                                int i34 = j - l8;
                                                                if (i34 == 0) {
                                                                    throw new IllegalArgumentException("Bad choice pattern syntax: ".concat(n(i26)));
                                                                }
                                                                if (i34 > 65535) {
                                                                    throw new IndexOutOfBoundsException("Choice number too long: ".concat(n(l8)));
                                                                }
                                                                q(l8, j, true);
                                                                int l9 = l(j);
                                                                if (l9 == this.a.length()) {
                                                                    throw new IllegalArgumentException("Bad choice pattern syntax: ".concat(n(i26)));
                                                                }
                                                                char charAt16 = this.a.charAt(l9);
                                                                if (charAt16 != '#' && charAt16 != '<' && charAt16 != 8804) {
                                                                    throw new IllegalArgumentException("Expected choice separator (#<≤) instead of '" + charAt16 + "' in choice pattern " + n(i26));
                                                                }
                                                                v(12, l9, 1, 0);
                                                                l2 = t(l9 + 1, 0, i12 + 1, 3);
                                                                if (l2 == this.a.length()) {
                                                                    break;
                                                                }
                                                                if (this.a.charAt(l2) != '}') {
                                                                    l8 = l(l2 + 1);
                                                                } else if (!r(i12)) {
                                                                    throw new IllegalArgumentException("Bad choice pattern syntax: ".concat(n(i26)));
                                                                }
                                                            }
                                                            i10 = l2;
                                                        } else {
                                                            if (i9 != 2) {
                                                                throw new IllegalArgumentException("No style field for complex argument: ".concat(n(l3)));
                                                            }
                                                            i10 = l5;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    char charAt17 = this.a.charAt(l4);
                                    if (charAt17 == 'p' || charAt17 == 'P') {
                                        int i35 = l4 + 2;
                                        char charAt18 = this.a.charAt(i21);
                                        if (charAt18 == 'l' || charAt18 == 'L') {
                                            int i36 = l4 + 3;
                                            char charAt19 = this.a.charAt(i35);
                                            if (charAt19 == 'u' || charAt19 == 'U') {
                                                int i37 = l4 + 4;
                                                char charAt20 = this.a.charAt(i36);
                                                if (charAt20 == 'r' || charAt20 == 'R') {
                                                    int i38 = l4 + 5;
                                                    char charAt21 = this.a.charAt(i37);
                                                    if ((charAt21 == 'a' || charAt21 == 'A') && ((charAt3 = this.a.charAt(i38)) == 'l' || charAt3 == 'L')) {
                                                        i9 = 4;
                                                        ((y) this.b.get(size2)).c = (short) (i9 - 1);
                                                        if (i9 == 2) {
                                                        }
                                                        if (charAt9 == '}') {
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (s(l4)) {
                                        i9 = 5;
                                        ((y) this.b.get(size2)).c = (short) (i9 - 1);
                                        if (i9 == 2) {
                                        }
                                        if (charAt9 == '}') {
                                        }
                                    }
                                    i9 = 2;
                                    ((y) this.b.get(size2)).c = (short) (i9 - 1);
                                    if (i9 == 2) {
                                    }
                                    if (charAt9 == '}') {
                                    }
                                } else {
                                    if (i20 == 13) {
                                        if (s(l4)) {
                                            char charAt22 = this.a.charAt(l4 + 6);
                                            if (charAt22 == 'o' || charAt22 == 'O') {
                                                int i39 = l4 + 8;
                                                char charAt23 = this.a.charAt(l4 + 7);
                                                if (charAt23 == 'r' || charAt23 == 'R') {
                                                    int i40 = l4 + 9;
                                                    char charAt24 = this.a.charAt(i39);
                                                    if (charAt24 == 'd' || charAt24 == 'D') {
                                                        int i41 = l4 + 10;
                                                        char charAt25 = this.a.charAt(i40);
                                                        if (charAt25 == 'i' || charAt25 == 'I') {
                                                            int i42 = l4 + 11;
                                                            char charAt26 = this.a.charAt(i41);
                                                            if (charAt26 == 'n' || charAt26 == 'N') {
                                                                int i43 = l4 + 12;
                                                                char charAt27 = this.a.charAt(i42);
                                                                if ((charAt27 == 'a' || charAt27 == 'A') && ((charAt = this.a.charAt(i43)) == 'l' || charAt == 'L')) {
                                                                    i20 = 13;
                                                                    i9 = 6;
                                                                    ((y) this.b.get(size2)).c = (short) (i9 - 1);
                                                                    if (i9 == 2) {
                                                                    }
                                                                    if (charAt9 == '}') {
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        i20 = 13;
                                    }
                                    i9 = 2;
                                    ((y) this.b.get(size2)).c = (short) (i9 - 1);
                                    if (i9 == 2) {
                                    }
                                    if (charAt9 == '}') {
                                    }
                                }
                            }
                            throw new IllegalArgumentException("Bad argument syntax: ".concat(n(l3)));
                        }
                        i9 = z ? 1 : 0;
                        i10 = l;
                        u(size2, 7, i10, 1, i9 - 1);
                        i14 = i10 + 1;
                        z = true;
                    } else {
                        i6 = 0;
                        i7 = z ? 1 : 0;
                    }
                    while (i16 < k2) {
                        int i44 = i16 + 1;
                        char charAt28 = str2.charAt(i16);
                        if (charAt28 >= '0' && charAt28 <= '9') {
                            i7 |= (i6 >= 214748364 ? (char) 0 : z ? 1 : 0) ^ (z ? 1 : 0);
                            i6 = (i6 * 10) + (charAt28 - '0');
                            i16 = i44;
                        }
                        i8 = -1;
                        break;
                    }
                    if (i7 == 0) {
                        i8 = i6;
                        if (i8 < 0) {
                        }
                        l = l(k2);
                        if (l != this.a.length()) {
                        }
                    }
                }
                i8 = -2;
                if (i8 < 0) {
                }
                l = l(k2);
                if (l != this.a.length()) {
                }
            }
            size = size;
            i12 = i12;
            i14 = i15;
            z = true;
        }
        int i45 = i12;
        int i46 = size;
        if (i45 > 0 && (i45 != 1 || i13 != 3 || ((y) this.b.get(0)).e == 1)) {
            throw new IllegalArgumentException("Unmatched '{' braces in message ".concat(m()));
        }
        u(i46, 2, i14, 0, i45);
        return i14;
    }

    private final void u(int i, int i2, int i3, int i4, int i5) {
        ((y) this.b.get(i)).d = this.b.size();
        v(i2, i3, i4, i5);
    }

    private final void v(int i, int i2, int i3, int i4) {
        this.b.add(new y(i, i2, i3, i4));
    }

    public final double a(y yVar) {
        int i = yVar.e;
        if (i == 13) {
            return yVar.c;
        }
        if (i == 14) {
            return ((Double) this.c.get(yVar.c)).doubleValue();
        }
        return -1.23456789E8d;
    }

    public final int b() {
        return this.b.size();
    }

    public final int c(int i) {
        int i2 = ((y) this.b.get(i)).d;
        return i2 < i ? i : i2;
    }

    public final Object clone() {
        return e();
    }

    public final y d(int i) {
        return (y) this.b.get(i);
    }

    public final z e() {
        try {
            z zVar = (z) super.clone();
            zVar.b = (ArrayList) this.b.clone();
            ArrayList arrayList = this.c;
            if (arrayList != null) {
                zVar.c = (ArrayList) arrayList.clone();
            }
            zVar.g = false;
            return zVar;
        } catch (CloneNotSupportedException e2) {
            throw new aa(e2);
        }
    }

    public final boolean equals(Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        z zVar = (z) obj;
        int i = this.f;
        int i2 = zVar.f;
        if (i != 0) {
            return i == i2 && ((str = this.a) != null ? str.equals(zVar.a) : zVar.a == null) && this.b.equals(zVar.b);
        }
        throw null;
    }

    public final String f(y yVar) {
        int i = yVar.a;
        return this.a.substring(i, yVar.b + i);
    }

    public final boolean g(y yVar, String str) {
        return this.a.regionMatches(yVar.a, str, 0, yVar.b);
    }

    public final int h(int i) {
        return ((y) this.b.get(i)).e;
    }

    public final int hashCode() {
        int i = this.f;
        a.D(i);
        String str = this.a;
        return (((i * 37) + (str != null ? str.hashCode() : 0)) * 37) + this.b.hashCode();
    }

    public final void i(String str) {
        this.a = str;
        this.d = false;
        this.b.clear();
        ArrayList arrayList = this.c;
        if (arrayList != null) {
            arrayList.clear();
        }
        t(0, 0, 0, 1);
    }

    public final String toString() {
        return this.a;
    }

    public z() {
    }
}
