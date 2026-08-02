package defpackage;

import j$.util.DesugarCollections;
import java.io.Serializable;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class w implements Serializable {
    public static final w a;
    static final Pattern b;
    static final Pattern c;
    static final Pattern d;
    static final Pattern e;
    static final Pattern f;
    static final Pattern g;
    private static final o i;
    private static final u j;
    private static final long serialVersionUID = 1;
    public final v h;

    static {
        l lVar = new l();
        i = lVar;
        u uVar = new u("other", lVar, null, null);
        j = uVar;
        v vVar = new v();
        vVar.a(uVar);
        a = new w(vVar);
        b = Pattern.compile("\\s*\\Q\\E@\\s*");
        c = Pattern.compile("\\s*or\\s*");
        d = Pattern.compile("\\s*and\\s*");
        e = Pattern.compile("\\s*,\\s*");
        Pattern.compile("\\s*\\Q..\\E\\s*");
        f = Pattern.compile("\\s*~\\s*");
        g = Pattern.compile("\\s*;\\s*");
    }

    public w(v vVar) {
        this.h = vVar;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = vVar.b.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((u) it.next()).a);
        }
        DesugarCollections.unmodifiableSet(linkedHashSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03e5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static u a(String str) {
        r rVar;
        r rVar2;
        boolean equals;
        o oVar;
        int i2;
        o oVar2;
        String str2;
        r rVar3;
        r rVar4;
        int i3;
        String[] strArr;
        int i4;
        o oVar3;
        int i5;
        int parseInt;
        int i6;
        int i7;
        boolean equals2;
        int i8;
        int i9;
        String str3;
        boolean z;
        boolean z2;
        String str4;
        double d2;
        long parseLong;
        int length;
        String[] strArr2;
        long j2;
        double max;
        long[] jArr;
        int i10;
        if (str.length() == 0) {
            return j;
        }
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        int indexOf = lowerCase.indexOf(58);
        int i11 = 0;
        if (indexOf == -1) {
            throw new ParseException(a.Z(lowerCase, "missing ':' in rule description '", "'"), 0);
        }
        String trim = lowerCase.substring(0, indexOf).trim();
        for (int i12 = 0; i12 < trim.length(); i12++) {
            char charAt = trim.charAt(i12);
            if (charAt < 'a' || charAt > 'z') {
                throw new ParseException(a.Z(trim, "keyword '", " is not valid"), 0);
            }
        }
        String trim2 = lowerCase.substring(indexOf + 1).trim();
        String[] split = b.split(trim2);
        int length2 = split.length;
        int i13 = 2;
        if (length2 != 1) {
            if (length2 == 2) {
                rVar = r.a(split[1]);
                if (rVar.c == 2) {
                    rVar2 = rVar;
                    rVar = null;
                }
            } else {
                if (length2 != 3) {
                    throw new IllegalArgumentException("Too many samples in ".concat(String.valueOf(trim2)));
                }
                rVar = r.a(split[1]);
                rVar2 = r.a(split[2]);
                if (rVar.c != 1 || rVar2.c != 2) {
                    throw new IllegalArgumentException("Must have @integer then @decimal in ".concat(String.valueOf(trim2)));
                }
            }
            equals = trim.equals("other");
            if (equals == (split[0].length() != 0)) {
                throw new IllegalArgumentException("The keyword 'other' must have no constraints, just samples.");
            }
            if (equals) {
                oVar = i;
            } else {
                String[] split2 = c.split(split[0]);
                int i14 = 0;
                o oVar4 = null;
                while (i14 < split2.length) {
                    String[] split3 = d.split(split2[i14]);
                    int i15 = i11;
                    o oVar5 = null;
                    while (i15 < split3.length) {
                        o oVar6 = i;
                        String trim3 = split3[i15].trim();
                        ArrayList arrayList = new ArrayList();
                        int i16 = i11;
                        int i17 = i13;
                        int i18 = -1;
                        while (i11 < trim3.length()) {
                            int i19 = i11 + 1;
                            char charAt2 = trim3.charAt(i11);
                            String[] strArr3 = split2;
                            if (charAt2 > ' ' || !(charAt2 == ' ' || charAt2 == '\t' || charAt2 == '\n' || charAt2 == '\f' || charAt2 == '\r')) {
                                if (charAt2 > '=' || charAt2 < '!' || !(charAt2 == '!' || charAt2 == '%' || charAt2 == ',' || charAt2 == '.' || charAt2 == '=')) {
                                    if (i18 < 0) {
                                        i18 = i11;
                                    }
                                    i11 = i19;
                                    split2 = strArr3;
                                } else {
                                    if (i18 >= 0) {
                                        arrayList.add(trim3.substring(i18, i11));
                                    }
                                    arrayList.add(trim3.substring(i11, i19));
                                    i18 = -1;
                                    i11 = i19;
                                    split2 = strArr3;
                                }
                            } else if (i18 >= 0) {
                                arrayList.add(trim3.substring(i18, i11));
                                i18 = -1;
                                i11 = i19;
                                split2 = strArr3;
                            } else {
                                i11 = i19;
                                split2 = strArr3;
                            }
                        }
                        String[] strArr4 = split2;
                        if (i18 >= 0) {
                            arrayList.add(trim3.substring(i18));
                        }
                        String[] strArr5 = (String[]) arrayList.toArray(new String[arrayList.size()]);
                        String str5 = strArr5[i16];
                        try {
                            int hashCode = str5.hashCode();
                            if (hashCode == 102) {
                                if (!str5.equals("f")) {
                                    throw new IllegalArgumentException();
                                }
                                i2 = 3;
                                if (strArr5.length > 1) {
                                }
                                if (oVar3 == null) {
                                }
                                i15 = i4 + 1;
                                i13 = i5;
                                i11 = i16;
                                split2 = strArr4;
                                i14 = i3;
                                split3 = strArr;
                                trim = str2;
                                rVar = rVar3;
                                rVar2 = rVar4;
                                oVar4 = oVar2;
                            } else if (hashCode == 110) {
                                if (!str5.equals("n")) {
                                    throw new IllegalArgumentException();
                                }
                                i2 = 1;
                                if (strArr5.length > 1) {
                                }
                                if (oVar3 == null) {
                                }
                                i15 = i4 + 1;
                                i13 = i5;
                                i11 = i16;
                                split2 = strArr4;
                                i14 = i3;
                                split3 = strArr;
                                trim = str2;
                                rVar = rVar3;
                                rVar2 = rVar4;
                                oVar4 = oVar2;
                            } else if (hashCode == 116) {
                                if (!str5.equals("t")) {
                                    throw new IllegalArgumentException();
                                }
                                i2 = 4;
                                if (strArr5.length > 1) {
                                }
                                if (oVar3 == null) {
                                }
                                i15 = i4 + 1;
                                i13 = i5;
                                i11 = i16;
                                split2 = strArr4;
                                i14 = i3;
                                split3 = strArr;
                                trim = str2;
                                rVar = rVar3;
                                rVar2 = rVar4;
                                oVar4 = oVar2;
                            } else if (hashCode == 105) {
                                if (!str5.equals("i")) {
                                    throw new IllegalArgumentException();
                                }
                                i2 = i17;
                                if (strArr5.length > 1) {
                                }
                                if (oVar3 == null) {
                                }
                                i15 = i4 + 1;
                                i13 = i5;
                                i11 = i16;
                                split2 = strArr4;
                                i14 = i3;
                                split3 = strArr;
                                trim = str2;
                                rVar = rVar3;
                                rVar2 = rVar4;
                                oVar4 = oVar2;
                            } else if (hashCode != 106) {
                                if (hashCode != 118) {
                                    if (hashCode == 119 && str5.equals("w")) {
                                        i10 = 6;
                                        i2 = i10;
                                        if (strArr5.length > 1) {
                                            String str6 = strArr5[1];
                                            if ("mod".equals(str6) || "%".equals(str6)) {
                                                parseInt = Integer.parseInt(strArr5[i17]);
                                                str6 = d(strArr5, 3, trim3);
                                                i6 = 4;
                                            } else {
                                                parseInt = i16;
                                                i6 = i17;
                                            }
                                            if ("not".equals(str6)) {
                                                int i20 = i6 + 1;
                                                String d3 = d(strArr5, i6, trim3);
                                                if ("=".equals(d3)) {
                                                    throw e(d3, trim3);
                                                }
                                                i6 = i20;
                                                str6 = d3;
                                            } else if ("!".equals(str6)) {
                                                int i21 = i6 + 1;
                                                String d4 = d(strArr5, i6, trim3);
                                                if (!"=".equals(d4)) {
                                                    throw e(d4, trim3);
                                                }
                                                i6 = i21;
                                                str6 = d4;
                                            } else {
                                                i7 = 1;
                                                i3 = i14;
                                                if (!"is".equals(str6) || "in".equals(str6) || "=".equals(str6)) {
                                                    equals2 = "is".equals(str6);
                                                    if (!equals2 && i7 == 0) {
                                                        throw e(str6, trim3);
                                                    }
                                                    i8 = i6 + 1;
                                                    String d5 = d(strArr5, i6, trim3);
                                                    i9 = equals2 ? 1 : 0;
                                                    str3 = d5;
                                                    z = 1;
                                                } else {
                                                    if (!"within".equals(str6)) {
                                                        throw e(str6, trim3);
                                                    }
                                                    i8 = i6 + 1;
                                                    str3 = d(strArr5, i6, trim3);
                                                    i9 = i16;
                                                    z = i9;
                                                }
                                                if ("not".equals(str3)) {
                                                    z2 = i7;
                                                } else {
                                                    if (i9 == 0 && i7 == 0) {
                                                        throw e(str3, trim3);
                                                    }
                                                    z2 = i7 ^ 1;
                                                    str3 = d(strArr5, i8, trim3);
                                                    i8++;
                                                }
                                                ArrayList arrayList2 = new ArrayList();
                                                str2 = trim;
                                                str4 = str3;
                                                rVar3 = rVar;
                                                strArr = split3;
                                                d2 = -9.223372036854776E18d;
                                                int i22 = i9;
                                                double d6 = 9.223372036854776E18d;
                                                while (true) {
                                                    parseLong = Long.parseLong(str4);
                                                    i4 = i15;
                                                    length = strArr5.length;
                                                    String str7 = str4;
                                                    if (i8 >= length) {
                                                        rVar4 = rVar2;
                                                        int i23 = i8 + 1;
                                                        oVar2 = oVar4;
                                                        String d7 = d(strArr5, i8, trim3);
                                                        int i24 = i8;
                                                        if (d7.equals(".")) {
                                                            int i25 = i24 + 2;
                                                            String d8 = d(strArr5, i23, trim3);
                                                            if (!d8.equals(".")) {
                                                                throw e(d8, trim3);
                                                            }
                                                            i8 = i24 + 3;
                                                            String d9 = d(strArr5, i25, trim3);
                                                            long parseLong2 = Long.parseLong(d9);
                                                            if (i8 < length) {
                                                                int i26 = i24 + 4;
                                                                String d10 = d(strArr5, i8, trim3);
                                                                if (!d10.equals(",")) {
                                                                    throw e(d10, trim3);
                                                                }
                                                                strArr2 = strArr5;
                                                                str7 = d10;
                                                                i8 = i26;
                                                            } else {
                                                                strArr2 = strArr5;
                                                                str7 = d9;
                                                            }
                                                            j2 = parseLong2;
                                                            if (parseLong > j2) {
                                                                throw e(parseLong + "~" + j2, trim3);
                                                            }
                                                            oVar3 = oVar5;
                                                            if (parseInt != 0 && j2 >= parseInt) {
                                                                throw e(j2 + ">mod=" + parseInt, trim3);
                                                            }
                                                            arrayList2.add(Long.valueOf(parseLong));
                                                            arrayList2.add(Long.valueOf(j2));
                                                            d6 = Math.min(d6, parseLong);
                                                            max = Math.max(d2, j2);
                                                            if (i8 >= length) {
                                                                String str8 = str7;
                                                                if (str8.equals(",")) {
                                                                    throw e(str8, trim3);
                                                                }
                                                                i5 = i17;
                                                                if (arrayList2.size() == i5) {
                                                                    jArr = null;
                                                                } else {
                                                                    int size = arrayList2.size();
                                                                    long[] jArr2 = new long[size];
                                                                    for (int i27 = i16; i27 < size; i27++) {
                                                                        jArr2[i27] = ((Long) arrayList2.get(i27)).longValue();
                                                                    }
                                                                    jArr = jArr2;
                                                                }
                                                                if (d6 != max && i22 != 0 && z2 == 0) {
                                                                    throw e("is not <range>", trim3);
                                                                }
                                                                oVar6 = new t(parseInt, z2, i2, z, d6, max, jArr);
                                                            } else {
                                                                str4 = d(strArr2, i8, trim3);
                                                                i8++;
                                                                strArr5 = strArr2;
                                                                d2 = max;
                                                                i15 = i4;
                                                                rVar2 = rVar4;
                                                                oVar4 = oVar2;
                                                                oVar5 = oVar3;
                                                            }
                                                        } else {
                                                            if (!d7.equals(",")) {
                                                                throw e(d7, trim3);
                                                            }
                                                            str7 = d7;
                                                            i8 = i23;
                                                        }
                                                    } else {
                                                        oVar2 = oVar4;
                                                        rVar4 = rVar2;
                                                    }
                                                    strArr2 = strArr5;
                                                    j2 = parseLong;
                                                    if (parseLong > j2) {
                                                    }
                                                }
                                            }
                                            i7 = i16;
                                            i3 = i14;
                                            if ("is".equals(str6)) {
                                            }
                                            equals2 = "is".equals(str6);
                                            if (!equals2) {
                                            }
                                            i8 = i6 + 1;
                                            String d52 = d(strArr5, i6, trim3);
                                            i9 = equals2 ? 1 : 0;
                                            str3 = d52;
                                            z = 1;
                                            if ("not".equals(str3)) {
                                            }
                                            ArrayList arrayList22 = new ArrayList();
                                            str2 = trim;
                                            str4 = str3;
                                            rVar3 = rVar;
                                            strArr = split3;
                                            d2 = -9.223372036854776E18d;
                                            int i222 = i9;
                                            double d62 = 9.223372036854776E18d;
                                            while (true) {
                                                parseLong = Long.parseLong(str4);
                                                i4 = i15;
                                                length = strArr5.length;
                                                String str72 = str4;
                                                if (i8 >= length) {
                                                }
                                                strArr2 = strArr5;
                                                j2 = parseLong;
                                                if (parseLong > j2) {
                                                }
                                                str4 = d(strArr2, i8, trim3);
                                                i8++;
                                                strArr5 = strArr2;
                                                d2 = max;
                                                i15 = i4;
                                                rVar2 = rVar4;
                                                oVar4 = oVar2;
                                                oVar5 = oVar3;
                                            }
                                        } else {
                                            oVar2 = oVar4;
                                            str2 = trim;
                                            rVar3 = rVar;
                                            rVar4 = rVar2;
                                            i3 = i14;
                                            strArr = split3;
                                            i4 = i15;
                                            oVar3 = oVar5;
                                            i5 = i17;
                                        }
                                        oVar5 = oVar3 == null ? oVar6 : new m(oVar3, oVar6);
                                        i15 = i4 + 1;
                                        i13 = i5;
                                        i11 = i16;
                                        split2 = strArr4;
                                        i14 = i3;
                                        split3 = strArr;
                                        trim = str2;
                                        rVar = rVar3;
                                        rVar2 = rVar4;
                                        oVar4 = oVar2;
                                    }
                                    throw new IllegalArgumentException();
                                }
                                if (!str5.equals("v")) {
                                    throw new IllegalArgumentException();
                                }
                                i10 = 5;
                                i2 = i10;
                                if (strArr5.length > 1) {
                                }
                                if (oVar3 == null) {
                                }
                                i15 = i4 + 1;
                                i13 = i5;
                                i11 = i16;
                                split2 = strArr4;
                                i14 = i3;
                                split3 = strArr;
                                trim = str2;
                                rVar = rVar3;
                                rVar2 = rVar4;
                                oVar4 = oVar2;
                            } else {
                                if (!str5.equals("j")) {
                                    throw new IllegalArgumentException();
                                }
                                i10 = 7;
                                i2 = i10;
                                if (strArr5.length > 1) {
                                }
                                if (oVar3 == null) {
                                }
                                i15 = i4 + 1;
                                i13 = i5;
                                i11 = i16;
                                split2 = strArr4;
                                i14 = i3;
                                split3 = strArr;
                                trim = str2;
                                rVar = rVar3;
                                rVar2 = rVar4;
                                oVar4 = oVar2;
                            }
                        } catch (Exception unused) {
                            throw e(str5, trim3);
                        }
                        throw e(str5, trim3);
                    }
                    String[] strArr6 = split2;
                    o oVar7 = oVar4;
                    int i28 = i11;
                    String str9 = trim;
                    r rVar5 = rVar;
                    r rVar6 = rVar2;
                    int i29 = i14;
                    o oVar8 = oVar5;
                    int i30 = i13;
                    oVar4 = oVar7 == null ? oVar8 : new s(oVar7, oVar8);
                    i13 = i30;
                    i11 = i28;
                    trim = str9;
                    rVar = rVar5;
                    rVar2 = rVar6;
                    i14 = i29 + 1;
                    split2 = strArr6;
                }
                oVar = oVar4;
            }
            return new u(trim, oVar, rVar, rVar2);
        }
        rVar = null;
        rVar2 = null;
        equals = trim.equals("other");
        if (equals == (split[0].length() != 0)) {
        }
    }

    public static void b(StringBuilder sb, double d2, double d3, boolean z) {
        if (z) {
            sb.append(",");
        }
        if (d2 == d3) {
            sb.append(c(d2));
            return;
        }
        sb.append(c(d2) + ".." + c(d3));
    }

    private static String c(double d2) {
        long j2 = (long) d2;
        return d2 == ((double) j2) ? String.valueOf(j2) : String.valueOf(d2);
    }

    private static String d(String[] strArr, int i2, String str) {
        if (i2 < strArr.length) {
            return strArr[i2];
        }
        throw new ParseException(a.Z(str, "missing token at end of '", "'"), -1);
    }

    private static ParseException e(String str, String str2) {
        return new ParseException("unexpected token '" + str + "' in '" + str2 + "'", -1);
    }

    public final boolean equals(Object obj) {
        w wVar;
        return (obj instanceof w) && (wVar = (w) obj) != null && toString().equals(wVar.toString());
    }

    @Deprecated
    public final int hashCode() {
        return this.h.hashCode();
    }

    public final String toString() {
        return this.h.toString();
    }
}
