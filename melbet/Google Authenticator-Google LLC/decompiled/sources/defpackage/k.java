package defpackage;

import java.io.IOException;
import java.text.AttributedCharacterIterator;
import java.text.AttributedString;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.FieldPosition;
import java.text.Format;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class k extends Format {
    public static final /* synthetic */ int d = 0;
    private static final String[] e = {"number", "date", "time", "spellout", "ordinal", "duration"};
    private static final String[] f = {"", "currency", "percent", "integer"};
    private static final String[] g = {"", "short", "medium", "long", "full"};
    private static final Locale h = new Locale("");
    static final long serialVersionUID = 7136212545847378652L;
    public transient Locale a;
    public transient z b;
    public transient Map c;
    private transient DateFormat i;
    private transient NumberFormat j;
    private transient j k;
    private transient j l;

    public k(String str, Locale locale) {
        Cloneable decimalFormat;
        this.a = locale;
        try {
            z zVar = this.b;
            if (zVar == null) {
                this.b = new z(str);
            } else {
                zVar.i(str);
            }
            Map map = this.c;
            if (map != null) {
                map.clear();
            }
            int b = this.b.b() - 2;
            int i = 1;
            while (i < b) {
                y d2 = this.b.d(i);
                if (d2.e == 6 && d2.b() == 2) {
                    z zVar2 = this.b;
                    int i2 = i + 3;
                    String f2 = zVar2.f(zVar2.d(i + 2));
                    String str2 = "";
                    y d3 = this.b.d(i2);
                    if (d3.e == 11) {
                        str2 = this.b.f(d3);
                        i2 = i + 4;
                    }
                    int c = c(f2, e);
                    if (c == 0) {
                        int c2 = c(str2, f);
                        decimalFormat = c2 != 0 ? c2 != 1 ? c2 != 2 ? c2 != 3 ? new DecimalFormat(str2, new DecimalFormatSymbols(this.a)) : NumberFormat.getIntegerInstance(this.a) : NumberFormat.getPercentInstance(this.a) : NumberFormat.getCurrencyInstance(this.a) : NumberFormat.getInstance(this.a);
                    } else if (c == 1) {
                        int c3 = c(str2, g);
                        decimalFormat = c3 != 0 ? c3 != 1 ? c3 != 2 ? c3 != 3 ? c3 != 4 ? new SimpleDateFormat(str2, this.a) : DateFormat.getDateInstance(0, this.a) : DateFormat.getDateInstance(1, this.a) : DateFormat.getDateInstance(2, this.a) : DateFormat.getDateInstance(3, this.a) : DateFormat.getDateInstance(2, this.a);
                    } else {
                        if (c != 2) {
                            throw new IllegalArgumentException(a.Z(f2, "Unknown format type \"", "\""));
                        }
                        int c4 = c(str2, g);
                        decimalFormat = c4 != 0 ? c4 != 1 ? c4 != 2 ? c4 != 3 ? c4 != 4 ? new SimpleDateFormat(str2, this.a) : DateFormat.getTimeInstance(0, this.a) : DateFormat.getTimeInstance(1, this.a) : DateFormat.getTimeInstance(2, this.a) : DateFormat.getTimeInstance(3, this.a) : DateFormat.getTimeInstance(2, this.a);
                    }
                    if (this.c == null) {
                        this.c = new HashMap();
                    }
                    this.c.put(Integer.valueOf(i), decimalFormat);
                    i = i2;
                }
                i++;
            }
        } catch (RuntimeException e2) {
            z zVar3 = this.b;
            if (zVar3 != null) {
                zVar3.a = null;
                zVar3.d = false;
                zVar3.b.clear();
                ArrayList arrayList = zVar3.c;
                if (arrayList != null) {
                    arrayList.clear();
                }
            }
            Map map2 = this.c;
            if (map2 != null) {
                map2.clear();
            }
            throw e2;
        }
    }

    private static final int c(String str, String[] strArr) {
        byte[] bArr = f.a;
        if (str.length() != 0 && (f.a(str.charAt(0)) || f.a(str.charAt(str.length() - 1)))) {
            int length = str.length();
            int i = 0;
            while (i < length && f.a(str.charAt(i))) {
                i++;
            }
            if (i < length) {
                while (true) {
                    int i2 = length - 1;
                    if (!f.a(str.charAt(i2))) {
                        break;
                    }
                    length = i2;
                }
            }
            str = str.substring(i, length);
        }
        String lowerCase = str.toLowerCase(h);
        for (int i3 = 0; i3 < strArr.length; i3++) {
            if (lowerCase.equals(strArr[i3])) {
                return i3;
            }
        }
        return -1;
    }

    private final void d(String str, ParsePosition parsePosition, Object[] objArr, Map map) {
        String str2;
        String f2;
        Object obj;
        short s;
        short s2;
        int indexOf;
        boolean z;
        Object obj2;
        Map map2;
        boolean z2;
        z zVar;
        int i;
        int i2;
        Format format;
        if (str == null) {
            return;
        }
        z zVar2 = this.b;
        String str3 = zVar2.a;
        int a = zVar2.d(0).a();
        int index = parsePosition.getIndex();
        ParsePosition parsePosition2 = new ParsePosition(0);
        boolean z3 = true;
        int i3 = 1;
        while (true) {
            y d2 = this.b.d(i3);
            int i4 = d2.e;
            int i5 = d2.a - a;
            if (i5 != 0 && !str3.regionMatches(a, str, index, i5)) {
                parsePosition.setErrorIndex(index);
                return;
            }
            index += i5;
            if (i4 == 2) {
                parsePosition.setIndex(index);
                return;
            }
            if (i4 == 3 || i4 == 4) {
                str2 = str3;
                a = d2.a();
            } else {
                int c = this.b.c(i3);
                int b = d2.b();
                y d3 = this.b.d(i3 + 1);
                if (objArr != null) {
                    s = d3.c;
                    obj = Integer.valueOf(s);
                    f2 = null;
                } else {
                    f2 = d3.e == 9 ? this.b.f(d3) : Integer.toString(d3.c);
                    obj = f2;
                    s = 0;
                }
                int i6 = i3 + 2;
                Map map3 = this.c;
                if (map3 != null && (format = (Format) map3.get(Integer.valueOf(i3))) != null) {
                    parsePosition2.setIndex(index);
                    obj2 = format.parseObject(str, parsePosition2);
                    if (parsePosition2.getIndex() == index) {
                        parsePosition.setErrorIndex(index);
                        return;
                    }
                    str2 = str3;
                    indexOf = parsePosition2.getIndex();
                    z = z3;
                    s2 = s;
                } else if (b == z3 || ((map2 = this.c) != null && map2.containsKey(Integer.valueOf(i3)))) {
                    str2 = str3;
                    boolean z4 = z3;
                    s2 = s;
                    StringBuilder sb = new StringBuilder();
                    z zVar3 = this.b;
                    String str4 = zVar3.a;
                    int a2 = zVar3.d(c).a();
                    int i7 = c + 1;
                    while (true) {
                        y d4 = this.b.d(i7);
                        int i8 = d4.e;
                        sb.append((CharSequence) str4, a2, d4.a);
                        if (i8 == 6 || i8 == 2) {
                            break;
                        }
                        i7++;
                        a2 = d4.a();
                    }
                    String sb2 = sb.toString();
                    indexOf = sb2.length() != 0 ? str.indexOf(sb2, index) : str.length();
                    if (indexOf < 0) {
                        parsePosition.setErrorIndex(index);
                        return;
                    }
                    String substring = str.substring(index, indexOf);
                    boolean equals = substring.equals(a.aa(obj, "{", "}"));
                    z = !equals;
                    obj2 = z4 == equals ? null : substring;
                } else {
                    if (b != 3) {
                        if (!e.b(b) && b != 5) {
                            throw new IllegalStateException("unexpected argType ".concat(e.a(b)));
                        }
                        throw new UnsupportedOperationException("Parsing of plural/select/selectordinal argument is not supported.");
                    }
                    parsePosition2.setIndex(index);
                    z zVar4 = this.b;
                    int index2 = parsePosition2.getIndex();
                    double d5 = Double.NaN;
                    int i9 = index2;
                    int i10 = i6;
                    while (true) {
                        z2 = z3;
                        if (zVar4.h(i10) == 7) {
                            str2 = str3;
                            s2 = s;
                            break;
                        }
                        double a3 = zVar4.a(zVar4.d(i10));
                        int i11 = i10 + 2;
                        int c2 = zVar4.c(i11);
                        String str5 = zVar4.a;
                        str2 = str3;
                        int a4 = zVar4.d(i11).a();
                        int i12 = 0;
                        while (true) {
                            i11++;
                            s2 = s;
                            y d6 = zVar4.d(i11);
                            zVar = zVar4;
                            if (i11 != c2 && d6.e != 3) {
                                zVar4 = zVar;
                                s = s2;
                            }
                            int i13 = d6.a - a4;
                            if (i13 != 0 && !str.regionMatches(index2, str5, a4, i13)) {
                                i = -1;
                                break;
                            }
                            i12 += i13;
                            if (i11 == c2) {
                                i = i12;
                                break;
                            } else {
                                a4 = d6.a();
                                zVar4 = zVar;
                                s = s2;
                            }
                        }
                        if (i >= 0 && (i2 = i + index2) > i9) {
                            if (i2 == str.length()) {
                                i9 = i2;
                                d5 = a3;
                                break;
                            } else {
                                i9 = i2;
                                d5 = a3;
                            }
                        }
                        i10 = c2 + 1;
                        z3 = z2;
                        zVar4 = zVar;
                        str3 = str2;
                        s = s2;
                    }
                    if (i9 == index2) {
                        parsePosition2.setErrorIndex(index2);
                    } else {
                        parsePosition2.setIndex(i9);
                    }
                    if (parsePosition2.getIndex() == index) {
                        parsePosition.setErrorIndex(index);
                        return;
                    } else {
                        obj2 = Double.valueOf(d5);
                        indexOf = parsePosition2.getIndex();
                        z = z2;
                    }
                }
                if (z) {
                    if (objArr != null) {
                        objArr[s2] = obj2;
                    } else if (map != null) {
                        map.put(f2, obj2);
                        a = this.b.d(c).a();
                        index = indexOf;
                        i3 = c;
                    }
                }
                a = this.b.d(c).a();
                index = indexOf;
                i3 = c;
            }
            i3++;
            z3 = true;
            str3 = str2;
        }
    }

    private final void e(Object obj, kmg kmgVar, FieldPosition fieldPosition) {
        if (obj == null || (obj instanceof Map)) {
            f(null, (Map) obj, kmgVar, fieldPosition);
        } else {
            f((Object[]) obj, null, kmgVar, fieldPosition);
        }
    }

    private final void f(Object[] objArr, Map map, kmg kmgVar, FieldPosition fieldPosition) {
        if (objArr != null && this.b.d) {
            throw new IllegalArgumentException("This method is not available in MessageFormat objects that use alphanumeric argument names.");
        }
        b(0, null, objArr, map, null, kmgVar, fieldPosition);
    }

    private final void g(int i, i iVar, Object[] objArr, Map map, Object[] objArr2, kmg kmgVar) {
        if (this.b.f == 2) {
            throw new UnsupportedOperationException("JDK apostrophe mode not supported");
        }
        b(i, iVar, objArr, map, objArr2, kmgVar, null);
    }

    public final NumberFormat a() {
        NumberFormat numberFormat = this.j;
        if (numberFormat != null) {
            return numberFormat;
        }
        NumberFormat numberFormat2 = NumberFormat.getInstance(this.a);
        this.j = numberFormat2;
        return numberFormat2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:181:0x035b, code lost:
    
        if (r12 == 2) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x030c, code lost:
    
        r13 = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x04b9 A[LOOP:2: B:111:0x022b->B:122:0x04b9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x04cd A[EDGE_INSN: B:123:0x04cd->B:124:0x04cd BREAK  A[LOOP:2: B:111:0x022b->B:122:0x04b9], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0587  */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Appendable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v25, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i, i iVar, Object[] objArr, Map map, Object[] objArr2, kmg kmgVar, FieldPosition fieldPosition) {
        boolean z;
        Object obj;
        Object obj2;
        FieldPosition fieldPosition2;
        int i2;
        String str;
        Object obj3;
        Map map2;
        int i3;
        int i4;
        j jVar;
        double d2;
        kmg kmgVar2;
        Object[] objArr3;
        Object[] objArr4;
        i iVar2;
        int i5;
        boolean z2;
        int i6;
        double d3;
        int i7;
        int i8;
        int i9;
        int i10;
        double d4;
        String str2;
        u uVar;
        double d5;
        Map map3;
        Object obj4;
        w wVar;
        int i11;
        Format format;
        ?? r2;
        int i12;
        int i13;
        k kVar = this;
        i iVar3 = iVar;
        Object[] objArr5 = objArr;
        Map map4 = map;
        kmg kmgVar3 = kmgVar;
        z zVar = kVar.b;
        String str3 = zVar.a;
        int a = zVar.d(i).a();
        boolean z3 = true;
        int i14 = i + 1;
        FieldPosition fieldPosition3 = fieldPosition;
        while (true) {
            y d6 = kVar.b.d(i14);
            int i15 = d6.e;
            int i16 = d6.a;
            try {
                kmgVar3.a.append(str3, a, i16);
                kmgVar3.b += i16 - a;
                if (i15 == 2) {
                    return;
                }
                int a2 = d6.a();
                if (i15 == 5) {
                    if (iVar3.h) {
                        kmgVar3.c(iVar3.f, iVar3.c, iVar3.g);
                    } else {
                        kmgVar3.b(kVar.a(), iVar3.c);
                    }
                } else if (i15 == 6) {
                    int c = kVar.b.c(i14);
                    int b = d6.b();
                    y d7 = kVar.b.d(i14 + 1);
                    String f2 = kVar.b.f(d7);
                    if (objArr5 != null) {
                        short s = d7.c;
                        obj = kmgVar3.c != null ? Integer.valueOf(s) : null;
                        if (s < 0 || s >= objArr5.length) {
                            z = z3;
                            obj2 = null;
                        } else {
                            obj2 = objArr5[s];
                            z = false;
                        }
                    } else if (objArr2 != null) {
                        int i17 = 0;
                        while (true) {
                            if (i17 >= 2) {
                                z = z3;
                                obj2 = null;
                                break;
                            } else {
                                if (f2.equals(objArr2[i17].toString())) {
                                    obj2 = objArr2[i17 + 1];
                                    z = false;
                                    break;
                                }
                                i17 += 2;
                            }
                        }
                        obj = f2;
                    } else if (map4 == null || !map4.containsKey(f2)) {
                        z = z3;
                        obj = f2;
                        obj2 = null;
                    } else {
                        obj2 = map4.get(f2);
                        obj = f2;
                        z = false;
                    }
                    int i18 = i14 + 2;
                    int i19 = kmgVar3.b;
                    if (z) {
                        kmgVar3.a(a.Z(f2, "{", "}"));
                    } else if (obj2 == null) {
                        kmgVar3.a("null");
                    } else {
                        if (iVar3 == null || iVar3.e != i14) {
                            fieldPosition2 = fieldPosition3;
                            Map map5 = kVar.c;
                            if (map5 == null || (format = (Format) map5.get(Integer.valueOf(i14))) == null) {
                                if (b == 1 || ((map2 = kVar.c) != null && map2.containsKey(Integer.valueOf(i14)))) {
                                    i2 = i19;
                                    str = str3;
                                    obj3 = obj;
                                    if (obj2 instanceof Number) {
                                        kmgVar3.b(kVar.a(), obj2);
                                    } else if (obj2 instanceof Date) {
                                        DateFormat dateFormat = kVar.i;
                                        if (dateFormat == null) {
                                            dateFormat = DateFormat.getDateTimeInstance(3, 3, kVar.a);
                                            kVar.i = dateFormat;
                                        }
                                        kmgVar3.b(dateFormat, obj2);
                                    } else {
                                        kmgVar3.a(obj2.toString());
                                    }
                                } else {
                                    int i20 = i14;
                                    if (b != 3) {
                                        int i21 = i19;
                                        if (!e.b(b)) {
                                            str = str3;
                                            i3 = i21;
                                            obj3 = obj;
                                            int i22 = i18;
                                            if (b != 5) {
                                                throw new IllegalStateException("unexpected argType ".concat(e.a(b)));
                                            }
                                            z zVar2 = kVar.b;
                                            String obj5 = obj2.toString();
                                            int b2 = zVar2.b();
                                            int i23 = 0;
                                            do {
                                                int i24 = i22 + 1;
                                                y d8 = zVar2.d(i22);
                                                if (d8.e == 7) {
                                                    break;
                                                }
                                                if (zVar2.g(d8, obj5)) {
                                                    i4 = i24;
                                                    break;
                                                } else {
                                                    if (i23 == 0) {
                                                        i23 = zVar2.g(d8, "other") ? i24 : 0;
                                                    }
                                                    i22 = zVar2.c(i24) + 1;
                                                }
                                            } while (i22 < b2);
                                            i4 = i23;
                                            kmgVar3 = kmgVar;
                                            kVar.g(i4, null, objArr, map, objArr2, kmgVar3);
                                        } else {
                                            if (!(obj2 instanceof Number)) {
                                                throw new IllegalArgumentException(a.aa(obj2, "'", "' is not a Number"));
                                            }
                                            if (b == 4) {
                                                jVar = kVar.k;
                                                if (jVar == null) {
                                                    jVar = new j(kVar, 1);
                                                    kVar.k = jVar;
                                                }
                                            } else {
                                                jVar = kVar.l;
                                                if (jVar == null) {
                                                    jVar = new j(kVar, 2);
                                                    kVar.l = jVar;
                                                }
                                            }
                                            Number number = (Number) obj2;
                                            z zVar3 = kVar.b;
                                            y yVar = (y) zVar3.b.get(i18);
                                            i iVar4 = new i(i18, f2, number, a.J(yVar.e) ? zVar3.a(yVar) : 0.0d);
                                            int i25 = i18;
                                            z zVar4 = kVar.b;
                                            double doubleValue = number.doubleValue();
                                            int b3 = zVar4.b();
                                            y d9 = zVar4.d(i25);
                                            if (a.J(d9.e)) {
                                                d2 = zVar4.a(d9);
                                                i25 = i20 + 3;
                                            } else {
                                                d2 = 0.0d;
                                            }
                                            String str4 = null;
                                            boolean z4 = false;
                                            int i26 = 0;
                                            while (true) {
                                                int i27 = i25 + 1;
                                                y d10 = zVar4.d(i25);
                                                int i28 = i25;
                                                if (d10.e == 7) {
                                                    str = str3;
                                                    i3 = i21;
                                                    obj3 = obj;
                                                    kVar = this;
                                                    break;
                                                }
                                                if (a.J(zVar4.h(i27))) {
                                                    i7 = i28 + 2;
                                                    if (doubleValue == zVar4.a(zVar4.d(i27))) {
                                                        kVar = this;
                                                        objArr3 = objArr2;
                                                        kmgVar2 = kmgVar;
                                                        i5 = i7;
                                                        iVar2 = iVar4;
                                                        str = str3;
                                                        i3 = i21;
                                                        obj3 = obj;
                                                        objArr4 = objArr;
                                                        break;
                                                    }
                                                    str = str3;
                                                    i3 = i21;
                                                } else {
                                                    if (!z4) {
                                                        if (!zVar4.g(d10, "other")) {
                                                            str = str3;
                                                            if (str4 == null) {
                                                                double d11 = doubleValue - d2;
                                                                if (jVar.b == null) {
                                                                    Locale locale = jVar.a.a;
                                                                    int i29 = jVar.c;
                                                                    w wVar2 = w.a;
                                                                    x xVar = x.a;
                                                                    xVar.b();
                                                                    i3 = i21;
                                                                    String str5 = (String) (i29 == 1 ? xVar.b : xVar.c).get(locale.getLanguage());
                                                                    if (str5 == null || str5.trim().length() == 0) {
                                                                        wVar = w.a;
                                                                    } else {
                                                                        wVar = xVar.a(str5);
                                                                        if (wVar == null) {
                                                                            wVar = w.a;
                                                                        }
                                                                    }
                                                                    jVar.b = wVar;
                                                                } else {
                                                                    i3 = i21;
                                                                }
                                                                k kVar2 = jVar.a;
                                                                int i30 = iVar4.a;
                                                                int b4 = kVar2.b.b();
                                                                z2 = z4;
                                                                if (a.J(kVar2.b.d(i30).e)) {
                                                                    i30++;
                                                                }
                                                                while (true) {
                                                                    i6 = i27;
                                                                    int i31 = i30 + 1;
                                                                    y d12 = kVar2.b.d(i30);
                                                                    int i32 = i30;
                                                                    d3 = doubleValue;
                                                                    if (d12.e == 7) {
                                                                        i8 = 0;
                                                                        break;
                                                                    }
                                                                    if (kVar2.b.g(d12, "other")) {
                                                                        i8 = i31;
                                                                        break;
                                                                    }
                                                                    if (a.J(kVar2.b.h(i31))) {
                                                                        i31 = i32 + 2;
                                                                    }
                                                                    int c2 = kVar2.b.c(i31);
                                                                    i9 = 1;
                                                                    i30 = c2 + 1;
                                                                    if (i30 >= b4) {
                                                                        i8 = 0;
                                                                        break;
                                                                    } else {
                                                                        i27 = i6;
                                                                        doubleValue = d3;
                                                                    }
                                                                }
                                                                String str6 = iVar4.b;
                                                                int i33 = i8 + i9;
                                                                while (true) {
                                                                    y d13 = kVar2.b.d(i33);
                                                                    int i34 = d13.e;
                                                                    if (i34 == 2) {
                                                                        i33 = 0;
                                                                        break;
                                                                    }
                                                                    if (i34 == 5) {
                                                                        i33 = -1;
                                                                        break;
                                                                    }
                                                                    if (i34 == 6) {
                                                                        int b5 = d13.b();
                                                                        if (str6.length() != 0) {
                                                                            if (b5 != 1) {
                                                                            }
                                                                            if (kVar2.b.g(kVar2.b.d(i33 + 1), str6)) {
                                                                                break;
                                                                            }
                                                                        }
                                                                        obj4 = obj;
                                                                        i33 = kVar2.b.c(i33);
                                                                    } else {
                                                                        obj4 = obj;
                                                                    }
                                                                    i33++;
                                                                    obj = obj4;
                                                                }
                                                                iVar4.e = i33;
                                                                if (i33 > 0 && (map3 = kVar2.c) != null) {
                                                                    iVar4.f = (Format) map3.get(Integer.valueOf(i33));
                                                                }
                                                                if (iVar4.f == null) {
                                                                    iVar4.f = kVar2.a();
                                                                    iVar4.h = true;
                                                                }
                                                                iVar4.g = iVar4.f.format(iVar4.c);
                                                                v vVar = jVar.b.h;
                                                                if (Double.isInfinite(d11) || Double.isNaN(d11)) {
                                                                    obj3 = obj;
                                                                } else {
                                                                    if (d11 < 0.0d) {
                                                                        obj3 = obj;
                                                                        d5 = -d11;
                                                                    } else {
                                                                        obj3 = obj;
                                                                        d5 = d11;
                                                                    }
                                                                    if (d5 < 1.0E9d) {
                                                                        long j = (long) (d5 * 1000000.0d);
                                                                        int i35 = 10;
                                                                        i10 = 6;
                                                                        while (i10 > 0) {
                                                                            long j2 = j;
                                                                            if ((j % 1000000) % i35 != 0) {
                                                                                break;
                                                                            }
                                                                            i35 *= 10;
                                                                            i10--;
                                                                            j = j2;
                                                                        }
                                                                    } else {
                                                                        String format2 = String.format(Locale.ENGLISH, "%1.15e", Double.valueOf(d5));
                                                                        int lastIndexOf = format2.lastIndexOf(101);
                                                                        int i36 = lastIndexOf + 1;
                                                                        if (format2.charAt(i36) == '+') {
                                                                            i36 = lastIndexOf + 2;
                                                                        }
                                                                        i10 = (lastIndexOf - 2) - Integer.parseInt(format2.substring(i36));
                                                                        if (i10 >= 0) {
                                                                            while (true) {
                                                                                lastIndexOf--;
                                                                                if (i10 <= 0 || format2.charAt(lastIndexOf) != '0') {
                                                                                    break;
                                                                                } else {
                                                                                    i10--;
                                                                                }
                                                                            }
                                                                            p pVar = new p(d11, i10);
                                                                            d4 = pVar.a;
                                                                            if (!Double.isInfinite(d4) || Double.isNaN(d4)) {
                                                                                str2 = "other";
                                                                            } else {
                                                                                Iterator it = vVar.b.iterator();
                                                                                while (true) {
                                                                                    if (!it.hasNext()) {
                                                                                        uVar = null;
                                                                                        break;
                                                                                    } else {
                                                                                        uVar = (u) it.next();
                                                                                        if (uVar.b.a(pVar)) {
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                str2 = uVar.a;
                                                                            }
                                                                            if (i26 == 0 && str2.equals("other")) {
                                                                                str4 = str2;
                                                                                z2 = true;
                                                                            } else {
                                                                                str4 = str2;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                i10 = 0;
                                                                p pVar2 = new p(d11, i10);
                                                                d4 = pVar2.a;
                                                                if (Double.isInfinite(d4)) {
                                                                }
                                                                str2 = "other";
                                                                if (i26 == 0) {
                                                                }
                                                                str4 = str2;
                                                            } else {
                                                                i3 = i21;
                                                                z2 = z4;
                                                                i6 = i27;
                                                                d3 = doubleValue;
                                                                obj3 = obj;
                                                            }
                                                            if (!z2 && zVar4.g(d10, str4)) {
                                                                i7 = i6;
                                                                i26 = i7;
                                                                z4 = true;
                                                                i25 = zVar4.c(i7) + 1;
                                                                kVar = this;
                                                                if (i25 >= b3) {
                                                                }
                                                            }
                                                            z4 = z2;
                                                            i7 = i6;
                                                            i25 = zVar4.c(i7) + 1;
                                                            kVar = this;
                                                            if (i25 >= b3) {
                                                            }
                                                        } else if (i26 == 0) {
                                                            if (str4 == null || !str4.equals("other")) {
                                                                str = str3;
                                                                i3 = i21;
                                                                i7 = i27;
                                                                i26 = i7;
                                                            } else {
                                                                str = str3;
                                                                i3 = i21;
                                                                i7 = i27;
                                                                i26 = i7;
                                                                d3 = doubleValue;
                                                                z4 = true;
                                                                obj3 = obj;
                                                                i25 = zVar4.c(i7) + 1;
                                                                kVar = this;
                                                                if (i25 >= b3) {
                                                                    break;
                                                                }
                                                                obj = obj3;
                                                                str3 = str;
                                                                i21 = i3;
                                                                doubleValue = d3;
                                                            }
                                                        }
                                                    }
                                                    str = str3;
                                                    i3 = i21;
                                                    z2 = z4;
                                                    i6 = i27;
                                                    d3 = doubleValue;
                                                    obj3 = obj;
                                                    z4 = z2;
                                                    i7 = i6;
                                                    i25 = zVar4.c(i7) + 1;
                                                    kVar = this;
                                                    if (i25 >= b3) {
                                                    }
                                                }
                                                d3 = doubleValue;
                                                obj3 = obj;
                                                i25 = zVar4.c(i7) + 1;
                                                kVar = this;
                                                if (i25 >= b3) {
                                                }
                                            }
                                            objArr4 = objArr;
                                            objArr3 = objArr2;
                                            kmgVar2 = kmgVar;
                                            iVar2 = iVar4;
                                            i5 = i26;
                                            kVar.g(i5, iVar2, objArr4, map, objArr3, kmgVar2);
                                            kmgVar3 = kmgVar;
                                        }
                                        i2 = i3;
                                    } else {
                                        if (!(obj2 instanceof Number)) {
                                            throw new IllegalArgumentException(a.aa(obj2, "'", "' is not a Number"));
                                        }
                                        double doubleValue2 = ((Number) obj2).doubleValue();
                                        z zVar5 = kVar.b;
                                        int b6 = zVar5.b();
                                        int i37 = i20 + 4;
                                        while (true) {
                                            int c3 = zVar5.c(i37);
                                            int i38 = c3 + 1;
                                            if (i38 < b6) {
                                                int i39 = c3 + 2;
                                                y d14 = zVar5.d(i38);
                                                i11 = i19;
                                                if (d14.e == 7) {
                                                    break;
                                                }
                                                double a3 = zVar5.a(d14);
                                                int i40 = c3 + 3;
                                                if (zVar5.a.charAt(((y) zVar5.b.get(i39)).a) != '<') {
                                                    if (doubleValue2 < a3) {
                                                        break;
                                                    }
                                                    i37 = i40;
                                                    i19 = i11;
                                                } else {
                                                    if (doubleValue2 <= a3) {
                                                        break;
                                                    }
                                                    i37 = i40;
                                                    i19 = i11;
                                                }
                                                obj3 = obj;
                                            } else {
                                                i11 = i19;
                                                break;
                                            }
                                        }
                                        kVar = this;
                                        kVar.g(i37, null, objArr, map4, objArr2, kmgVar3);
                                        kmgVar3 = kmgVar;
                                        str = str3;
                                        i2 = i11;
                                        obj3 = obj;
                                    }
                                }
                                r2 = kmgVar3.c;
                                if (r2 != 0 && i2 < (i13 = kmgVar3.b)) {
                                    r2.add(new tf(obj3, i2, i13));
                                }
                                if (fieldPosition2 == null && h.a.equals(fieldPosition2.getFieldAttribute())) {
                                    FieldPosition fieldPosition4 = fieldPosition2;
                                    fieldPosition4.setBeginIndex(i2);
                                    fieldPosition4.setEndIndex(kmgVar3.b);
                                    fieldPosition3 = null;
                                } else {
                                    fieldPosition3 = fieldPosition2;
                                }
                                a = kVar.b.d(c).a();
                                i12 = c;
                                i14 = i12 + 1;
                                iVar3 = iVar;
                                objArr5 = objArr;
                                map4 = map;
                                z3 = true;
                                str3 = str;
                            } else {
                                kmgVar3.b(format, obj2);
                            }
                        } else {
                            fieldPosition2 = fieldPosition3;
                            if (iVar3.d == 0.0d) {
                                kmgVar3.c(iVar3.f, iVar3.c, iVar3.g);
                            } else {
                                kmgVar3.b(iVar3.f, obj2);
                            }
                        }
                        i2 = i19;
                        str = str3;
                        obj3 = obj;
                        r2 = kmgVar3.c;
                        if (r2 != 0) {
                            r2.add(new tf(obj3, i2, i13));
                        }
                        if (fieldPosition2 == null) {
                        }
                        fieldPosition3 = fieldPosition2;
                        a = kVar.b.d(c).a();
                        i12 = c;
                        i14 = i12 + 1;
                        iVar3 = iVar;
                        objArr5 = objArr;
                        map4 = map;
                        z3 = true;
                        str3 = str;
                    }
                    i2 = i19;
                    str = str3;
                    fieldPosition2 = fieldPosition3;
                    obj3 = obj;
                    r2 = kmgVar3.c;
                    if (r2 != 0) {
                    }
                    if (fieldPosition2 == null) {
                    }
                    fieldPosition3 = fieldPosition2;
                    a = kVar.b.d(c).a();
                    i12 = c;
                    i14 = i12 + 1;
                    iVar3 = iVar;
                    objArr5 = objArr;
                    map4 = map;
                    z3 = true;
                    str3 = str;
                }
                str = str3;
                fieldPosition3 = fieldPosition3;
                a = a2;
                i12 = i14;
                i14 = i12 + 1;
                iVar3 = iVar;
                objArr5 = objArr;
                map4 = map;
                z3 = true;
                str3 = str;
            } catch (IOException e2) {
                throw new ac(e2);
            }
        }
    }

    @Override // java.text.Format
    public final StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        e(obj, new kmg(stringBuffer), fieldPosition);
        return stringBuffer;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.List] */
    @Override // java.text.Format
    public final AttributedCharacterIterator formatToCharacterIterator(Object obj) {
        if (obj == null) {
            throw new NullPointerException("formatToCharacterIterator must be passed non-null object");
        }
        StringBuilder sb = new StringBuilder();
        kmg kmgVar = new kmg(sb);
        kmgVar.c = new ArrayList();
        e(obj, kmgVar, null);
        AttributedString attributedString = new AttributedString(sb.toString());
        for (tf tfVar : kmgVar.c) {
            attributedString.addAttribute((AttributedCharacterIterator.Attribute) tfVar.c, tfVar.d, tfVar.a, tfVar.b);
        }
        return attributedString.getIterator();
    }

    public final int hashCode() {
        return this.b.a.hashCode();
    }

    @Override // java.text.Format
    public final Object parseObject(String str, ParsePosition parsePosition) {
        if (this.b.d) {
            HashMap hashMap = new HashMap();
            int index = parsePosition.getIndex();
            d(str, parsePosition, null, hashMap);
            if (parsePosition.getIndex() == index) {
                return null;
            }
            return hashMap;
        }
        int i = 0;
        short s = -1;
        while (true) {
            if (i != 0) {
                i = this.b.c(i);
            }
            while (true) {
                i++;
                int h2 = this.b.h(i);
                if (h2 == 6) {
                    break;
                }
                if (h2 == 2) {
                    i = -1;
                    break;
                }
            }
            if (i < 0) {
                break;
            }
            short s2 = this.b.d(i + 1).c;
            if (s2 > s) {
                s = s2;
            }
        }
        Object[] objArr = new Object[s + 1];
        int index2 = parsePosition.getIndex();
        d(str, parsePosition, objArr, null);
        if (parsePosition.getIndex() == index2) {
            return null;
        }
        return objArr;
    }
}
