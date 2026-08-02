package defpackage;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Formattable;
import java.util.Formatter;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hoi {
    public int a = 0;
    public int b = -1;
    protected final Object[] c;
    public final StringBuilder d;
    public int e;
    private final hmw f;

    protected hoi(hmw hmwVar, Object[] objArr, StringBuilder sb) {
        hmwVar.getClass();
        this.f = hmwVar;
        this.e = 0;
        this.c = objArr;
        this.d = sb;
    }

    public static void c(StringBuilder sb, Object obj, String str) {
        sb.append("[INVALID: format=");
        sb.append(str);
        sb.append(", type=");
        sb.append(obj.getClass().getCanonicalName());
        sb.append(", value=");
        sb.append(hly.b(obj));
        sb.append("]");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x018e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void e(hlu hluVar, StringBuilder sb) {
        int i;
        int i2;
        hlr hlrVar;
        int i3;
        hlq hlqVar;
        hoe hodVar;
        hoe hogVar;
        int i4;
        Object[] objArr;
        if (hluVar.l() == null) {
            sb.append(hly.b(hluVar.m()));
            return;
        }
        hoi hoiVar = new hoi(hluVar.l(), hluVar.B(), sb);
        String b = hoiVar.b();
        int i5 = 0;
        int b2 = hol.b(b, 0);
        int i6 = -1;
        int i7 = 0;
        int i8 = -1;
        while (true) {
            int i9 = 1;
            if (b2 < 0) {
                int i10 = hoiVar.a;
                if (((i10 + 1) & i10) != 0 || (hoiVar.b > 31 && i10 != -1)) {
                    throw new hok(String.format("unreferenced arguments [first missing index=%d]", Integer.valueOf(Integer.numberOfTrailingZeros(~i10))));
                }
                hoj a = hoiVar.a();
                String b3 = hoiVar.b();
                int i11 = hoiVar.e;
                int length = hoiVar.b().length();
                StringBuilder sb2 = hoiVar.d;
                a.a(sb2, b3, i11, length);
                if (hluVar.B().length > hoiVar.b + 1) {
                    sb2.append(" [ERROR: UNUSED LOG ARGUMENTS]");
                    return;
                }
                return;
            }
            int i12 = b2 + 1;
            int i13 = i5;
            int i14 = i12;
            while (i14 < b.length()) {
                int i15 = i14 + 1;
                char charAt = b.charAt(i14);
                char c = (char) (charAt - '0');
                if (c >= '\n') {
                    if (charAt == '$') {
                        if (i14 - i12 == 0) {
                            throw hok.b("missing index", b, b2, i15);
                        }
                        if (b.charAt(i12) == '0') {
                            throw hok.b("index has leading zero", b, b2, i15);
                        }
                        int i16 = i13 - 1;
                        if (i15 == b.length()) {
                            throw hok.c("unterminated parameter", b, b2);
                        }
                        i = i14 + 2;
                        b.charAt(i15);
                        i8 = i16;
                    } else {
                        if (charAt != '<') {
                            i8 = i7;
                            i7++;
                            i2 = i15 + i6;
                            while (i2 < b.length()) {
                                if (((char) ((b.charAt(i2) & 65503) - 65)) < 26) {
                                    char charAt2 = b.charAt(i2);
                                    int i17 = charAt2 & ' ';
                                    boolean z = i17 == 0;
                                    hlr hlrVar2 = hlr.a;
                                    if (i12 != i2 || z) {
                                        int i18 = true != z ? 0 : 128;
                                        while (i12 != i2) {
                                            i3 = i9;
                                            int i19 = i12 + 1;
                                            char charAt3 = b.charAt(i12);
                                            char c2 = '.';
                                            if (charAt3 >= ' ' && charAt3 <= '0') {
                                                int a2 = hlr.a(charAt3);
                                                if (a2 >= 0) {
                                                    int i20 = i3 << a2;
                                                    if ((i18 & i20) != 0) {
                                                        throw hok.a("repeated flag", b, i12);
                                                    }
                                                    i18 |= i20;
                                                    i12 = i19;
                                                    i9 = i3;
                                                    i6 = -1;
                                                } else {
                                                    if (charAt3 != '.') {
                                                        throw hok.a("invalid flag", b, i12);
                                                    }
                                                    hlrVar = new hlr(i18, -1, hlr.b(b, i19, i2));
                                                }
                                            } else {
                                                if (charAt3 > '9') {
                                                    throw hok.a("invalid flag", b, i12);
                                                }
                                                int i21 = charAt3 - '0';
                                                while (true) {
                                                    if (i19 == i2) {
                                                        hlrVar = new hlr(i18, i21, -1);
                                                        break;
                                                    }
                                                    int i22 = i19 + 1;
                                                    char charAt4 = b.charAt(i19);
                                                    if (charAt4 == c2) {
                                                        hlrVar = new hlr(i18, i21, hlr.b(b, i22, i2));
                                                        break;
                                                    }
                                                    char c3 = (char) (charAt4 - '0');
                                                    if (c3 >= '\n') {
                                                        throw hok.a("invalid width character", b, i19);
                                                    }
                                                    i21 = (i21 * 10) + c3;
                                                    if (i21 > 999999) {
                                                        throw hok.b("width too large", b, i12, i2);
                                                    }
                                                    i19 = i22;
                                                    c2 = '.';
                                                }
                                            }
                                            hlqVar = hlq.k[(charAt2 | ' ') - 97];
                                            if (i17 == 0 && (hlqVar == null || (hlqVar.n & 128) == 0)) {
                                                hlqVar = null;
                                            }
                                            int i23 = i2 + 1;
                                            if (hlqVar == null) {
                                                if (!hlrVar.e(hlqVar.n, hlqVar.m.f)) {
                                                    throw hok.b("invalid format specifier", b, b2, i23);
                                                }
                                                Map map = hof.c;
                                                if (i8 >= 10 || !hlrVar.c()) {
                                                    hogVar = new hof(i8, hlqVar, hlrVar);
                                                    hodVar = hogVar;
                                                } else {
                                                    hoe[] hoeVarArr = (hof[]) hof.c.get(hlqVar);
                                                    hoeVarArr.getClass();
                                                    hodVar = hoeVarArr[i8];
                                                }
                                            } else if (charAt2 == 't' || charAt2 == 'T') {
                                                if (!hlrVar.e(160, false)) {
                                                    throw hok.b("invalid format specification", b, b2, i23);
                                                }
                                                int i24 = i2 + 2;
                                                if (i24 > b.length()) {
                                                    throw hok.a("truncated format specifier", b, b2);
                                                }
                                                hoc hocVar = (hoc) hoc.F.get(Character.valueOf(b.charAt(i23)));
                                                if (hocVar == null) {
                                                    throw hok.a("illegal date/time conversion", b, i23);
                                                }
                                                hodVar = new hod(hlrVar, i8, hocVar);
                                                i23 = i24;
                                            } else {
                                                if (charAt2 != 'h' && charAt2 != 'H') {
                                                    throw hok.b("invalid format specification", b, b2, i23);
                                                }
                                                if (!hlrVar.e(160, false)) {
                                                    throw hok.b("invalid format specification", b, b2, i23);
                                                }
                                                hogVar = new hog(hlrVar, i8);
                                                hodVar = hogVar;
                                            }
                                            i4 = hodVar.a;
                                            if (i4 < 32) {
                                                hoiVar.a |= i3 << i4;
                                            }
                                            hoiVar.b = Math.max(hoiVar.b, i4);
                                            hoj a3 = hoiVar.a();
                                            String b4 = hoiVar.b();
                                            int i25 = hoiVar.e;
                                            StringBuilder sb3 = hoiVar.d;
                                            a3.a(sb3, b4, i25, b2);
                                            objArr = hoiVar.c;
                                            if (i4 >= objArr.length) {
                                                Object obj = objArr[i4];
                                                if (obj != null) {
                                                    hodVar.a(hoiVar, obj);
                                                } else {
                                                    sb3.append("null");
                                                }
                                            } else {
                                                sb3.append("[ERROR: MISSING LOG ARGUMENT]");
                                            }
                                            hoiVar.e = i23;
                                            b2 = hol.b(b, i23);
                                            i5 = 0;
                                            i6 = -1;
                                        }
                                        hlrVar = new hlr(i18, i6, i6);
                                    } else {
                                        hlrVar = hlr.a;
                                    }
                                    i3 = i9;
                                    hlqVar = hlq.k[(charAt2 | ' ') - 97];
                                    if (i17 == 0) {
                                        hlqVar = null;
                                    }
                                    int i232 = i2 + 1;
                                    if (hlqVar == null) {
                                    }
                                    i4 = hodVar.a;
                                    if (i4 < 32) {
                                    }
                                    hoiVar.b = Math.max(hoiVar.b, i4);
                                    hoj a32 = hoiVar.a();
                                    String b42 = hoiVar.b();
                                    int i252 = hoiVar.e;
                                    StringBuilder sb32 = hoiVar.d;
                                    a32.a(sb32, b42, i252, b2);
                                    objArr = hoiVar.c;
                                    if (i4 >= objArr.length) {
                                    }
                                    hoiVar.e = i232;
                                    b2 = hol.b(b, i232);
                                    i5 = 0;
                                    i6 = -1;
                                } else {
                                    i2++;
                                    i6 = -1;
                                }
                            }
                            throw hok.c("unterminated parameter", b, b2);
                        }
                        if (i8 == i6) {
                            throw hok.b("invalid relative parameter", b, b2, i15);
                        }
                        if (i15 == b.length()) {
                            throw hok.c("unterminated parameter", b, b2);
                        }
                        i = i14 + 2;
                        b.charAt(i15);
                    }
                    i12 = i15;
                    i15 = i;
                    i2 = i15 + i6;
                    while (i2 < b.length()) {
                    }
                    throw hok.c("unterminated parameter", b, b2);
                }
                i13 = (i13 * 10) + c;
                if (i13 >= 1000000) {
                    throw hok.b("index too large", b, b2, i15);
                }
                i14 = i15;
            }
            throw hok.c("unterminated parameter", b, b2);
        }
    }

    public final hoj a() {
        return this.f.a;
    }

    public final String b() {
        return this.f.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
    
        if ((r7 instanceof java.math.BigDecimal) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0038, code lost:
    
        if ((r7 instanceof java.math.BigInteger) == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Object obj, hlq hlqVar, hlr hlrVar) {
        hlr hlrVar2;
        boolean z;
        int ordinal = hlqVar.m.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                z = obj instanceof Boolean;
            } else if (ordinal == 2) {
                if (!(obj instanceof Character)) {
                    if ((obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short)) {
                        z = Character.isValidCodePoint(((Number) obj).intValue());
                    }
                    z = false;
                }
                z = true;
            } else if (ordinal == 3) {
                if (!(obj instanceof Integer)) {
                    if (!(obj instanceof Long)) {
                        if (!(obj instanceof Byte)) {
                            if (!(obj instanceof Short)) {
                            }
                        }
                    }
                }
                z = true;
            } else {
                if (ordinal != 4) {
                    throw null;
                }
                if (!(obj instanceof Double)) {
                    if (!(obj instanceof Float)) {
                    }
                }
                z = true;
            }
            if (!z) {
                c(this.d, obj, hlqVar.o);
                return;
            }
        }
        StringBuilder sb = this.d;
        int ordinal2 = hlqVar.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 != 1) {
                if (ordinal2 != 2) {
                    if (ordinal2 != 3) {
                        if (ordinal2 == 5) {
                            if (!hlrVar.c()) {
                                int i = hlrVar.b;
                                int i2 = i & 128;
                                if (i2 == 0) {
                                    hlrVar2 = hlr.a;
                                } else if (i2 != i || hlrVar.c != -1 || hlrVar.d != -1) {
                                    hlrVar2 = new hlr(i2, -1, -1);
                                }
                                if (hlrVar2.equals(hlrVar)) {
                                    Number number = (Number) obj;
                                    boolean d = hlrVar.d();
                                    long longValue = number.longValue();
                                    if (number instanceof Long) {
                                        hly.c(sb, longValue, d);
                                        return;
                                    }
                                    if (number instanceof Integer) {
                                        hly.c(sb, longValue & 4294967295L, d);
                                        return;
                                    }
                                    if (number instanceof Byte) {
                                        hly.c(sb, longValue & 255, d);
                                        return;
                                    }
                                    if (number instanceof Short) {
                                        hly.c(sb, longValue & 65535, d);
                                        return;
                                    } else {
                                        if (!(number instanceof BigInteger)) {
                                            throw new IllegalStateException("unsupported number type: ".concat(String.valueOf(String.valueOf(number.getClass()))));
                                        }
                                        String bigInteger = ((BigInteger) number).toString(16);
                                        if (d) {
                                            bigInteger = bigInteger.toUpperCase(hly.a);
                                        }
                                        sb.append(bigInteger);
                                        return;
                                    }
                                }
                            }
                            hlrVar2 = hlrVar;
                            if (hlrVar2.equals(hlrVar)) {
                            }
                        }
                    }
                } else if (hlrVar.c()) {
                    if (obj instanceof Character) {
                        sb.append(obj);
                        return;
                    }
                    int intValue = ((Number) obj).intValue();
                    if ((intValue >>> 16) == 0) {
                        sb.append((char) intValue);
                        return;
                    } else {
                        sb.append(Character.toChars(intValue));
                        return;
                    }
                }
            }
            if (hlrVar.c()) {
                sb.append(obj);
                return;
            }
        } else {
            if (obj instanceof Formattable) {
                Formattable formattable = (Formattable) obj;
                int i3 = hlrVar.b;
                int i4 = i3 & 162;
                if (i4 != 0) {
                    i4 = ((i3 & 32) == 0 ? 0 : 1) | ((i3 & 128) != 0 ? 2 : 0) | ((i3 & 2) == 0 ? 0 : 4);
                }
                int length = sb.length();
                Formatter formatter = new Formatter(sb, hly.a);
                try {
                    formattable.formatTo(formatter, i4, hlrVar.c, hlrVar.d);
                    return;
                } catch (RuntimeException e) {
                    sb.setLength(length);
                    try {
                        formatter.out().append(hly.a(formattable, e));
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                }
            }
            if (hlrVar.c()) {
                sb.append(hly.b(obj));
                return;
            }
        }
        String str = hlqVar.o;
        if (!hlrVar.c()) {
            int i5 = hlqVar.l;
            if (hlrVar.d()) {
                i5 &= 65503;
            }
            StringBuilder sb2 = new StringBuilder("%");
            hlrVar.f(sb2);
            sb2.append((char) i5);
            str = sb2.toString();
        }
        sb.append(String.format(hly.a, str, obj));
    }
}
