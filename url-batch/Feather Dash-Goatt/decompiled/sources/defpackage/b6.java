package defpackage;

import android.graphics.Typeface;
import android.os.LocaleList;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.ScaleXSpan;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class b6 implements su0 {
    public final String d;
    public final th1 e;
    public final List g;
    public final List h;
    public final v10 i;
    public final nr j;
    public final l6 k;
    public final CharSequence l;
    public final yc0 m;
    public i8 n;
    public final boolean o;
    public final int p;

    /* JADX WARN: Code restructure failed: missing block: B:155:0x04b5, code lost:
    
        if ((r4.b.c & 1095216660480L) == 0) goto L503;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x009b, code lost:
    
        if (r7 == 1) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x063b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0669  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0781  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x08d4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x095b  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0985 A[LOOP:7: B:317:0x0983->B:318:0x0985, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0996  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x09c2  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x06e8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:492:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02ce A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00ab  */
    /* JADX WARN: Type inference failed for: r0v0, types: [b6, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v88, types: [android.text.Spannable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b6(String str, th1 th1Var, List list, List list2, v10 v10Var, nr nrVar) {
        boolean booleanValue;
        Locale locale;
        int i;
        a6 a6Var;
        int i2;
        jc1 jc1Var;
        int size;
        int i3;
        Object obj;
        boolean z;
        String str2;
        mi0 mi0Var;
        zg1 zg1Var;
        ah1 ah1Var;
        long j;
        long b;
        w10 w10Var;
        boolean z2;
        a6 a6Var2;
        zg1 zg1Var2;
        dk1 b2;
        Typeface typeface;
        jc1 jc1Var2;
        List list3;
        ?? r1;
        th1 th1Var2;
        boolean z3;
        String str3;
        float f;
        CharSequence charSequence;
        long j2;
        b6 b6Var;
        kx0 kx0Var;
        float B;
        int i4;
        int length;
        bh1 bh1Var;
        List list4;
        Object obj2;
        ArrayList arrayList;
        int size2;
        int i5;
        ArrayList arrayList2;
        jc1 jc1Var3;
        int i6;
        int size3;
        boolean z4;
        int i7;
        List list5;
        bh1 bh1Var2;
        int size4;
        int i8;
        int i9;
        List list6;
        nr nrVar2;
        Object jg0Var;
        int i10;
        int i11;
        nr nrVar3;
        boolean z5;
        int i12;
        int i13;
        hx0 hx0Var;
        int i14;
        hl1 hl1Var;
        int i15;
        zj1[] zj1VarArr;
        hx0 hx0Var2;
        ?? obj3 = new Object();
        obj3.d = str;
        obj3.e = th1Var;
        obj3.g = list;
        obj3.h = list2;
        obj3.i = v10Var;
        obj3.j = nrVar;
        float k = nrVar.k();
        l6 l6Var = new l6(1);
        ((TextPaint) l6Var).density = k;
        l6Var.b = wg1.b;
        l6Var.c = 3;
        l6Var.d = s91.d;
        obj3.k = l6Var;
        if (la0.r(th1Var)) {
            s40 s40Var = cv.a;
            s40 s40Var2 = cv.a;
            yd1 yd1Var = (yd1) s40Var2.e;
            if (yd1Var == null) {
                if (yu.k != null) {
                    yd1Var = s40Var2.r();
                    s40Var2.e = yd1Var;
                } else {
                    yd1Var = mo.g;
                }
            }
            booleanValue = ((Boolean) yd1Var.getValue()).booleanValue();
        } else {
            booleanValue = false;
        }
        obj3.o = booleanValue;
        int i16 = th1Var.b.b;
        mi0 mi0Var2 = th1Var.a.k;
        if (i16 != 4) {
            if (i16 != 5) {
                if (i16 == 1) {
                    i = 0;
                } else if (i16 == 2) {
                    i = 1;
                } else {
                    if (i16 != 3 && i16 != 0) {
                        dd0.j("Invalid TextDirection.");
                        throw null;
                    }
                    int layoutDirectionFromLocale = TextUtils.getLayoutDirectionFromLocale((mi0Var2 == null || (locale = ((li0) mi0Var2.d.get(0)).a) == null) ? Locale.getDefault() : locale);
                    if (layoutDirectionFromLocale != 0) {
                    }
                }
                obj3.p = i;
                a6Var = new a6(obj3);
                lh1 lh1Var = th1Var.b.i;
                lh1Var = lh1Var == null ? lh1.c : lh1Var;
                l6Var.setFlags(lh1Var.b ? l6Var.getFlags() | 128 : l6Var.getFlags() & (-129));
                i2 = lh1Var.a;
                if (i2 == 1) {
                    l6Var.setFlags(l6Var.getFlags() | 64);
                    l6Var.setHinting(0);
                } else if (i2 == 2) {
                    l6Var.getFlags();
                    l6Var.setHinting(1);
                } else if (i2 == 3) {
                    l6Var.getFlags();
                    l6Var.setHinting(0);
                } else {
                    l6Var.getFlags();
                }
                jc1Var = th1Var.a;
                size = list.size();
                i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        obj = null;
                        break;
                    }
                    obj = list.get(i3);
                    if (((x7) obj).a instanceof jc1) {
                        break;
                    } else {
                        i3++;
                    }
                }
                z = obj != null;
                long j3 = jc1Var.b;
                str2 = jc1Var.g;
                mi0Var = jc1Var.k;
                zg1Var = jc1Var.a;
                ah1Var = jc1Var.j;
                j = jc1Var.h;
                b = wh1.b(j3);
                if (xh1.a(b, 4294967296L)) {
                    l6Var.setTextSize(nrVar.U(j3));
                } else if (xh1.a(b, 8589934592L)) {
                    l6Var.setTextSize(wh1.c(j3) * l6Var.getTextSize());
                }
                w10Var = jc1Var.f;
                if (w10Var != null && jc1Var.d == null && jc1Var.c == null) {
                    z2 = z;
                    a6Var2 = a6Var;
                    zg1Var2 = zg1Var;
                } else {
                    x20 x20Var = jc1Var.c;
                    x20Var = x20Var == null ? x20.i : x20Var;
                    t20 t20Var = jc1Var.d;
                    int i17 = t20Var != null ? t20Var.a : 0;
                    u20 u20Var = jc1Var.e;
                    int i18 = u20Var != null ? u20Var.a : 65535;
                    z2 = z;
                    a6Var2 = a6Var;
                    b6 b6Var2 = a6Var2.d;
                    zg1Var2 = zg1Var;
                    b2 = ((x10) b6Var2.i).b(w10Var, x20Var, i17, i18);
                    if (b2 instanceof ck1) {
                        Object obj4 = ((ck1) b2).d;
                        obj4.getClass();
                        typeface = (Typeface) obj4;
                    } else {
                        i8 i8Var = new i8(b2, b6Var2.n);
                        b6Var2.n = i8Var;
                        Object obj5 = i8Var.h;
                        obj5.getClass();
                        typeface = (Typeface) obj5;
                    }
                    l6Var.setTypeface(typeface);
                }
                if (mi0Var != null) {
                    mi0 mi0Var3 = mi0.g;
                    if (!mi0Var.equals(ca0.m())) {
                        ArrayList arrayList3 = new ArrayList(ai.h(mi0Var));
                        Iterator it = mi0Var.d.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(((li0) it.next()).a);
                        }
                        Locale[] localeArr = (Locale[]) arrayList3.toArray(new Locale[0]);
                        l6Var.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
                    }
                }
                if (str2 != null && !str2.equals("")) {
                    l6Var.setFontFeatureSettings(str2);
                }
                if (ah1Var != null && !ah1Var.equals(ah1.c)) {
                    l6Var.setTextScaleX(l6Var.getTextScaleX() * ah1Var.a);
                    l6Var.setTextSkewX(l6Var.getTextSkewX() + ah1Var.b);
                }
                l6Var.d(zg1Var2.c());
                l6Var.c(zg1Var2.j(), 9205357640488583168L, zg1Var2.k());
                l6Var.f(jc1Var.n);
                l6Var.g(jc1Var.m);
                l6Var.e(jc1Var.o);
                if (!xh1.a(wh1.b(j), 4294967296L) && wh1.c(j) != 0.0f) {
                    float textScaleX = l6Var.getTextScaleX() * l6Var.getTextSize();
                    float U = nrVar.U(j);
                    if (textScaleX != 0.0f) {
                        l6Var.setLetterSpacing(U / textScaleX);
                    }
                } else if (xh1.a(wh1.b(j), 8589934592L)) {
                    l6Var.setLetterSpacing(wh1.c(j));
                }
                long j4 = jc1Var.l;
                ad adVar = jc1Var.i;
                boolean z6 = (z2 || !xh1.a(wh1.b(j), 4294967296L) || wh1.c(j) == 0.0f) ? false : true;
                long j5 = hi.g;
                boolean z7 = hi.c(j4, j5) && !hi.c(j4, hi.f);
                boolean z8 = adVar == null && Float.compare(adVar.a, 0.0f) != 0;
                jc1Var2 = (!z6 || z7 || z8) ? new jc1(0L, 0L, (x20) null, (t20) null, (u20) null, (w10) null, (String) null, z6 ? j : wh1.c, z8 ? adVar : null, (ah1) null, (mi0) null, z7 ? j4 : j5, (wg1) null, (s91) null, 63103) : null;
                list3 = obj3.g;
                if (jc1Var2 != null) {
                    int size5 = list3.size() + 1;
                    ArrayList arrayList4 = new ArrayList(size5);
                    int i19 = 0;
                    while (i19 < size5) {
                        arrayList4.add(i19 == 0 ? new x7(0, obj3.d.length(), jc1Var2) : (x7) obj3.g.get(i19 - 1));
                        i19++;
                    }
                    list3 = arrayList4;
                }
                r1 = obj3.d;
                float textSize = obj3.k.getTextSize();
                th1Var2 = obj3.e;
                List list7 = obj3.h;
                nr nrVar4 = obj3.j;
                z3 = obj3.o;
                y5 y5Var = z5.a;
                if (z3 || yu.k == null) {
                    str3 = r1;
                    f = 0.0f;
                    charSequence = str3;
                } else {
                    kx0 kx0Var2 = th1Var2.c;
                    hv hvVar = (kx0Var2 == null || (hx0Var2 = kx0Var2.a) == null) ? null : new hv(hx0Var2.b);
                    boolean z9 = hvVar != null && hvVar.a == 2;
                    yu a = yu.a();
                    int length2 = r1.length();
                    if (!(a.b() == 1)) {
                        dd0.j("Not initialized yet");
                        throw null;
                    }
                    if (length2 < 0) {
                        dd0.e("end cannot be negative");
                        throw null;
                    }
                    if (!(length2 >= 0)) {
                        dd0.e("start should be <= than end");
                        throw null;
                    }
                    if (!(r1.length() >= 0)) {
                        dd0.e("start should be < than charSequence length");
                        throw null;
                    }
                    if (!(length2 <= r1.length())) {
                        dd0.e("end should be < than charSequence length");
                        throw null;
                    }
                    if (r1.length() == 0 || length2 == 0) {
                        str3 = r1;
                        f = 0.0f;
                    } else {
                        boolean z10 = z9;
                        i8 i8Var2 = a.e.b;
                        i8Var2.getClass();
                        if (r1 instanceof Spannable) {
                            hl1Var = new hl1((Spannable) r1);
                            i14 = 0;
                        } else if (!(r1 instanceof Spanned) || ((Spanned) r1).nextSpanTransition(-1, length2 + 1, zj1.class) > length2) {
                            i14 = 0;
                            hl1Var = null;
                        } else {
                            hl1Var = new hl1();
                            i14 = 0;
                            hl1Var.d = false;
                            hl1Var.e = new SpannableString(r1);
                        }
                        if (hl1Var == null || (zj1VarArr = (zj1[]) hl1Var.e.getSpans(i14, length2, zj1.class)) == null || zj1VarArr.length <= 0) {
                            str3 = r1;
                            f = 0.0f;
                            i15 = 0;
                        } else {
                            int length3 = zj1VarArr.length;
                            f = 0.0f;
                            i15 = 0;
                            int i20 = 0;
                            String str4 = r1;
                            while (true) {
                                str3 = str4;
                                if (i20 >= length3) {
                                    break;
                                }
                                zj1 zj1Var = zj1VarArr[i20];
                                int i21 = length3;
                                int spanStart = hl1Var.e.getSpanStart(zj1Var);
                                zj1[] zj1VarArr2 = zj1VarArr;
                                int spanEnd = hl1Var.e.getSpanEnd(zj1Var);
                                if (spanStart != length2) {
                                    hl1Var.removeSpan(zj1Var);
                                }
                                i15 = Math.min(spanStart, i15);
                                length2 = Math.max(spanEnd, length2);
                                i20++;
                                zj1VarArr = zj1VarArr2;
                                length3 = i21;
                                str4 = str3;
                            }
                        }
                        if (i15 != length2 && i15 < str3.length()) {
                            hl1 hl1Var2 = (hl1) i8Var2.n(str3, i15, length2, Integer.MAX_VALUE, z10, new yw(hl1Var, 8, (a60) i8Var2.e));
                            if (hl1Var2 != null) {
                                charSequence = hl1Var2.e;
                                charSequence.getClass();
                            }
                        }
                    }
                    charSequence = str3;
                    charSequence.getClass();
                }
                if (!list3.isEmpty() && list7.isEmpty() && Intrinsics.a(th1Var2.b.d, bh1.c)) {
                    j2 = 0;
                    b6Var = obj3;
                } else {
                    j2 = 0;
                }
                SpannableString spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
                if (Intrinsics.a(th1Var2.a.m, wg1.c)) {
                    spannableString.setSpan(z5.a, 0, str3.length(), 33);
                }
                kx0Var = th1Var2.c;
                if ((kx0Var != null || (hx0Var = kx0Var.a) == null) ? false : hx0Var.a) {
                    uu0 uu0Var = th1Var2.b;
                    if (uu0Var.f == null) {
                        float B2 = ka0.B(uu0Var.c, textSize, nrVar4);
                        if (!Float.isNaN(B2)) {
                            spannableString.setSpan(new fh0(B2), 0, spannableString.length(), 33);
                        }
                        bh1Var = th1Var2.b.d;
                        if (bh1Var == null) {
                            long j6 = bh1Var.a;
                            long j7 = bh1Var.b;
                            if ((!wh1.a(j6, t80.x(0)) || !wh1.a(j7, t80.x(0))) && (j6 & 1095216660480L) != j2 && (j7 & 1095216660480L) != j2) {
                                long b3 = wh1.b(j6);
                                list4 = list7;
                                obj2 = zj1.class;
                                float U2 = xh1.a(b3, 4294967296L) ? nrVar4.U(j6) : xh1.a(b3, 8589934592L) ? wh1.c(j6) * textSize : f;
                                long b4 = wh1.b(j7);
                                spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(U2), (int) Math.ceil(xh1.a(b4, 4294967296L) ? nrVar4.U(j7) : xh1.a(b4, 8589934592L) ? wh1.c(j7) * textSize : f)), 0, spannableString.length(), 33);
                                arrayList = new ArrayList(list3.size());
                                size2 = list3.size();
                                for (i5 = 0; i5 < size2; i5++) {
                                    x7 x7Var = (x7) list3.get(i5);
                                    Object obj6 = x7Var.a;
                                    if (obj6 instanceof jc1) {
                                        jc1 jc1Var4 = (jc1) obj6;
                                        if (jc1Var4.f != null || jc1Var4.d != null || jc1Var4.c != null || ((jc1) obj6).e != null) {
                                            arrayList.add(x7Var);
                                        }
                                    }
                                }
                                jc1 jc1Var5 = th1Var2.a;
                                w10 w10Var2 = jc1Var5.f;
                                jc1 jc1Var6 = (w10Var2 != null && jc1Var5.d == null && jc1Var5.c == null && jc1Var5.e == null) ? null : new jc1(0L, 0L, jc1Var5.c, jc1Var5.d, jc1Var5.e, w10Var2, (String) null, 0L, (ad) null, (ah1) null, (mi0) null, 0L, (wg1) null, (s91) null, 65475);
                                al0 al0Var = new al0(spannableString, 2, a6Var2);
                                if (arrayList.size() > 1) {
                                    int size6 = arrayList.size();
                                    int i22 = size6 * 2;
                                    int[] iArr = new int[i22];
                                    int size7 = arrayList.size();
                                    for (int i23 = 0; i23 < size7; i23++) {
                                        x7 x7Var2 = (x7) arrayList.get(i23);
                                        iArr[i23] = x7Var2.b;
                                        iArr[i23 + size6] = x7Var2.c;
                                    }
                                    if (i22 > 1) {
                                        Arrays.sort(iArr);
                                    }
                                    if (i22 == 0) {
                                        throw new NoSuchElementException("Array is empty.");
                                    }
                                    int i24 = iArr[0];
                                    int i25 = 0;
                                    while (i25 < i22) {
                                        int i26 = iArr[i25];
                                        if (i26 == i24) {
                                            arrayList2 = arrayList;
                                            jc1Var3 = jc1Var6;
                                            i6 = i22;
                                        } else {
                                            int size8 = arrayList.size();
                                            jc1 jc1Var7 = jc1Var6;
                                            int i27 = 0;
                                            while (i27 < size8) {
                                                ArrayList arrayList5 = arrayList;
                                                x7 x7Var3 = (x7) arrayList.get(i27);
                                                jc1 jc1Var8 = jc1Var6;
                                                int i28 = x7Var3.b;
                                                int i29 = i22;
                                                int i30 = x7Var3.c;
                                                if (i28 != i30 && z7.a(i24, i26, i28, i30)) {
                                                    jc1 jc1Var9 = (jc1) x7Var3.a;
                                                    jc1Var7 = jc1Var7 != null ? jc1Var7.c(jc1Var9) : jc1Var9;
                                                }
                                                i27++;
                                                arrayList = arrayList5;
                                                jc1Var6 = jc1Var8;
                                                i22 = i29;
                                            }
                                            arrayList2 = arrayList;
                                            jc1Var3 = jc1Var6;
                                            i6 = i22;
                                            if (jc1Var7 != null) {
                                                al0Var.a(jc1Var7, Integer.valueOf(i24), Integer.valueOf(i26));
                                            }
                                            i24 = i26;
                                        }
                                        i25++;
                                        arrayList = arrayList2;
                                        jc1Var6 = jc1Var3;
                                        i22 = i6;
                                    }
                                } else if (!arrayList.isEmpty()) {
                                    jc1 jc1Var10 = (jc1) ((x7) arrayList.get(0)).a;
                                    al0Var.a(jc1Var6 != null ? jc1Var6.c(jc1Var10) : jc1Var10, Integer.valueOf(((x7) arrayList.get(0)).b), Integer.valueOf(((x7) arrayList.get(0)).c));
                                }
                                size3 = list3.size();
                                z4 = false;
                                i7 = 0;
                                while (i7 < size3) {
                                    x7 x7Var4 = (x7) list3.get(i7);
                                    Object obj7 = x7Var4.a;
                                    if (obj7 instanceof jc1) {
                                        int i31 = x7Var4.b;
                                        int i32 = x7Var4.c;
                                        if (i31 >= 0 && i31 < spannableString.length() && i32 > i31 && i32 <= spannableString.length()) {
                                            jc1 jc1Var11 = (jc1) obj7;
                                            ad adVar2 = jc1Var11.i;
                                            zg1 zg1Var3 = jc1Var11.a;
                                            if (adVar2 != null) {
                                                spannableString.setSpan(new bd(adVar2.a, 0), i31, i32, 33);
                                            }
                                            ka0.D(spannableString, zg1Var3.c(), i31, i32);
                                            op j8 = zg1Var3.j();
                                            float k2 = zg1Var3.k();
                                            if (j8 != null) {
                                                if (j8 instanceof ec1) {
                                                    ka0.D(spannableString, ((ec1) j8).t, i31, i32);
                                                } else {
                                                    spannableString.setSpan(new r91((q91) j8, k2), i31, i32, 33);
                                                }
                                            }
                                            wg1 wg1Var = jc1Var11.m;
                                            if (wg1Var != null) {
                                                int i33 = wg1Var.a;
                                                xg1 xg1Var = new xg1((i33 | 1) == i33, (i33 | 2) == i33);
                                                i12 = 33;
                                                spannableString.setSpan(xg1Var, i31, i32, 33);
                                            } else {
                                                i12 = 33;
                                            }
                                            ka0.E(spannableString, jc1Var11.b, nrVar4, i31, i32);
                                            String str5 = jc1Var11.g;
                                            if (str5 != null) {
                                                spannableString.setSpan(new z10(0, str5), i31, i32, i12);
                                            }
                                            ah1 ah1Var2 = jc1Var11.j;
                                            if (ah1Var2 != null) {
                                                spannableString.setSpan(new ScaleXSpan(ah1Var2.a), i31, i32, i12);
                                                spannableString.setSpan(new bd(ah1Var2.b, 1), i31, i32, i12);
                                            }
                                            ka0.F(spannableString, jc1Var11.k, i31, i32);
                                            nr nrVar5 = nrVar4;
                                            long j9 = jc1Var11.l;
                                            if (j9 != 16) {
                                                spannableString.setSpan(new BackgroundColorSpan(la0.W(j9)), i31, i32, 33);
                                            }
                                            s91 s91Var = jc1Var11.n;
                                            if (s91Var != null) {
                                                long j10 = s91Var.b;
                                                i10 = size3;
                                                z5 = z4;
                                                int W = la0.W(s91Var.a);
                                                nrVar3 = nrVar5;
                                                i11 = i7;
                                                float intBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
                                                float intBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & j10));
                                                float f2 = s91Var.c;
                                                t91 t91Var = new t91(intBitsToFloat, intBitsToFloat2, f2 == f ? Float.MIN_VALUE : f2, W);
                                                i13 = 33;
                                                spannableString.setSpan(t91Var, i31, i32, 33);
                                            } else {
                                                i10 = size3;
                                                z5 = z4;
                                                nrVar3 = nrVar5;
                                                i11 = i7;
                                                i13 = 33;
                                            }
                                            p4 p4Var = jc1Var11.o;
                                            if (p4Var != null) {
                                                spannableString.setSpan(new iu(p4Var), i31, i32, i13);
                                            }
                                            if (xh1.a(wh1.b(jc1Var11.h), 4294967296L) || xh1.a(wh1.b(jc1Var11.h), 8589934592L)) {
                                                z4 = true;
                                                i7 = i11 + 1;
                                                size3 = i10;
                                                nrVar4 = nrVar3;
                                            }
                                            z4 = z5;
                                            i7 = i11 + 1;
                                            size3 = i10;
                                            nrVar4 = nrVar3;
                                        }
                                    }
                                    i10 = size3;
                                    i11 = i7;
                                    nrVar3 = nrVar4;
                                    z5 = z4;
                                    z4 = z5;
                                    i7 = i11 + 1;
                                    size3 = i10;
                                    nrVar4 = nrVar3;
                                }
                                nr nrVar6 = nrVar4;
                                if (z4) {
                                    int size9 = list3.size();
                                    int i34 = 0;
                                    while (i34 < size9) {
                                        x7 x7Var5 = (x7) list3.get(i34);
                                        w7 w7Var = (w7) x7Var5.a;
                                        if (w7Var instanceof jc1) {
                                            int i35 = x7Var5.b;
                                            int i36 = x7Var5.c;
                                            if (i35 >= 0 && i35 < spannableString.length() && i36 > i35 && i36 <= spannableString.length()) {
                                                long j11 = ((jc1) w7Var).h;
                                                long b5 = wh1.b(j11);
                                                i9 = i34;
                                                if (xh1.a(b5, 4294967296L)) {
                                                    nrVar2 = nrVar6;
                                                    jg0Var = new kg0(nrVar2.U(j11));
                                                    list6 = list4;
                                                } else {
                                                    list6 = list4;
                                                    nrVar2 = nrVar6;
                                                    jg0Var = xh1.a(b5, 8589934592L) ? new jg0(wh1.c(j11)) : null;
                                                }
                                                if (jg0Var != null) {
                                                    spannableString.setSpan(jg0Var, i35, i36, 33);
                                                }
                                                list4 = list6;
                                                nrVar6 = nrVar2;
                                                i34 = i9 + 1;
                                            }
                                        }
                                        i9 = i34;
                                        list6 = list4;
                                        nrVar2 = nrVar6;
                                        list4 = list6;
                                        nrVar6 = nrVar2;
                                        i34 = i9 + 1;
                                    }
                                }
                                list5 = list4;
                                nr nrVar7 = nrVar6;
                                bh1Var2 = th1Var2.b.d;
                                if (bh1Var2 != null) {
                                    long j12 = bh1Var2.a;
                                    long b6 = wh1.b(j12);
                                    if (xh1.a(b6, 4294967296L)) {
                                        nrVar7.U(j12);
                                    } else if (xh1.a(b6, 8589934592L)) {
                                        wh1.c(j12);
                                    }
                                }
                                size4 = list3.size();
                                for (i8 = 0; i8 < size4; i8++) {
                                    Object obj8 = ((x7) list3.get(i8)).a;
                                }
                                if (list5.size() <= 0) {
                                    b6Var = this;
                                    charSequence = spannableString;
                                    b6Var.l = charSequence;
                                    b6Var.m = new yc0(charSequence, b6Var.k, b6Var.p);
                                    return;
                                }
                                x7 x7Var6 = (x7) list5.get(0);
                                if (x7Var6.a != null) {
                                    af.c();
                                    throw null;
                                }
                                for (Object obj9 : spannableString.getSpans(x7Var6.b, x7Var6.c, obj2)) {
                                    spannableString.removeSpan((zj1) obj9);
                                }
                                throw null;
                            }
                            list4 = list7;
                        } else {
                            list4 = list7;
                        }
                        obj2 = zj1.class;
                        arrayList = new ArrayList(list3.size());
                        size2 = list3.size();
                        while (i5 < size2) {
                        }
                        jc1 jc1Var52 = th1Var2.a;
                        w10 w10Var22 = jc1Var52.f;
                        if (w10Var22 != null) {
                        }
                        al0 al0Var2 = new al0(spannableString, 2, a6Var2);
                        if (arrayList.size() > 1) {
                        }
                        size3 = list3.size();
                        z4 = false;
                        i7 = 0;
                        while (i7 < size3) {
                        }
                        nr nrVar62 = nrVar4;
                        if (z4) {
                        }
                        list5 = list4;
                        nr nrVar72 = nrVar62;
                        bh1Var2 = th1Var2.b.d;
                        if (bh1Var2 != null) {
                        }
                        size4 = list3.size();
                        while (i8 < size4) {
                        }
                        if (list5.size() <= 0) {
                        }
                    }
                }
                uu0 uu0Var2 = th1Var2.b;
                jh0 jh0Var = uu0Var2.f;
                jh0Var = jh0Var == null ? jh0.d : jh0Var;
                B = ka0.B(uu0Var2.c, textSize, nrVar4);
                if (!Float.isNaN(B)) {
                    if (spannableString.length() == 0) {
                        i4 = 1;
                    } else {
                        if (spannableString.length() == 0) {
                            throw new NoSuchElementException("Char sequence is empty.");
                        }
                        i4 = 1;
                        if (spannableString.charAt(spannableString.length() - 1) != '\n') {
                            length = spannableString.length();
                            int i37 = length;
                            int i38 = jh0Var.b;
                            spannableString.setSpan(new kh0(B, i37, (i38 & 1) <= 0, (i38 & 16) <= 0, jh0Var.a, jh0Var.c), 0, spannableString.length(), 33);
                        }
                    }
                    length = spannableString.length() + i4;
                    int i372 = length;
                    int i382 = jh0Var.b;
                    spannableString.setSpan(new kh0(B, i372, (i382 & 1) <= 0, (i382 & 16) <= 0, jh0Var.a, jh0Var.c), 0, spannableString.length(), 33);
                }
                bh1Var = th1Var2.b.d;
                if (bh1Var == null) {
                }
                obj2 = zj1.class;
                arrayList = new ArrayList(list3.size());
                size2 = list3.size();
                while (i5 < size2) {
                }
                jc1 jc1Var522 = th1Var2.a;
                w10 w10Var222 = jc1Var522.f;
                if (w10Var222 != null) {
                }
                al0 al0Var22 = new al0(spannableString, 2, a6Var2);
                if (arrayList.size() > 1) {
                }
                size3 = list3.size();
                z4 = false;
                i7 = 0;
                while (i7 < size3) {
                }
                nr nrVar622 = nrVar4;
                if (z4) {
                }
                list5 = list4;
                nr nrVar722 = nrVar622;
                bh1Var2 = th1Var2.b.d;
                if (bh1Var2 != null) {
                }
                size4 = list3.size();
                while (i8 < size4) {
                }
                if (list5.size() <= 0) {
                }
            }
            i = 3;
            obj3.p = i;
            a6Var = new a6(obj3);
            lh1 lh1Var2 = th1Var.b.i;
            if (lh1Var2 == null) {
            }
            l6Var.setFlags(lh1Var2.b ? l6Var.getFlags() | 128 : l6Var.getFlags() & (-129));
            i2 = lh1Var2.a;
            if (i2 == 1) {
            }
            jc1Var = th1Var.a;
            size = list.size();
            i3 = 0;
            while (true) {
                if (i3 >= size) {
                }
                i3++;
            }
            if (obj != null) {
            }
            long j32 = jc1Var.b;
            str2 = jc1Var.g;
            mi0Var = jc1Var.k;
            zg1Var = jc1Var.a;
            ah1Var = jc1Var.j;
            j = jc1Var.h;
            b = wh1.b(j32);
            if (xh1.a(b, 4294967296L)) {
            }
            w10Var = jc1Var.f;
            if (w10Var != null) {
            }
            x20 x20Var2 = jc1Var.c;
            if (x20Var2 == null) {
            }
            t20 t20Var2 = jc1Var.d;
            if (t20Var2 != null) {
            }
            u20 u20Var2 = jc1Var.e;
            if (u20Var2 != null) {
            }
            z2 = z;
            a6Var2 = a6Var;
            b6 b6Var22 = a6Var2.d;
            zg1Var2 = zg1Var;
            b2 = ((x10) b6Var22.i).b(w10Var, x20Var2, i17, i18);
            if (b2 instanceof ck1) {
            }
            l6Var.setTypeface(typeface);
            if (mi0Var != null) {
            }
            if (str2 != null) {
                l6Var.setFontFeatureSettings(str2);
            }
            if (ah1Var != null) {
                l6Var.setTextScaleX(l6Var.getTextScaleX() * ah1Var.a);
                l6Var.setTextSkewX(l6Var.getTextSkewX() + ah1Var.b);
            }
            l6Var.d(zg1Var2.c());
            l6Var.c(zg1Var2.j(), 9205357640488583168L, zg1Var2.k());
            l6Var.f(jc1Var.n);
            l6Var.g(jc1Var.m);
            l6Var.e(jc1Var.o);
            if (!xh1.a(wh1.b(j), 4294967296L)) {
            }
            if (xh1.a(wh1.b(j), 8589934592L)) {
            }
            long j42 = jc1Var.l;
            ad adVar3 = jc1Var.i;
            if (z2) {
            }
            long j52 = hi.g;
            if (hi.c(j42, j52)) {
            }
            if (adVar3 == null) {
            }
            if (z6) {
            }
            list3 = obj3.g;
            if (jc1Var2 != null) {
            }
            r1 = obj3.d;
            float textSize2 = obj3.k.getTextSize();
            th1Var2 = obj3.e;
            List list72 = obj3.h;
            nr nrVar42 = obj3.j;
            z3 = obj3.o;
            y5 y5Var2 = z5.a;
            if (z3) {
            }
            str3 = r1;
            f = 0.0f;
            charSequence = str3;
            if (!list3.isEmpty()) {
            }
            j2 = 0;
            if (charSequence instanceof Spannable) {
            }
            if (Intrinsics.a(th1Var2.a.m, wg1.c)) {
            }
            kx0Var = th1Var2.c;
            if ((kx0Var != null || (hx0Var = kx0Var.a) == null) ? false : hx0Var.a) {
            }
            uu0 uu0Var22 = th1Var2.b;
            jh0 jh0Var2 = uu0Var22.f;
            if (jh0Var2 == null) {
            }
            B = ka0.B(uu0Var22.c, textSize2, nrVar42);
            if (!Float.isNaN(B)) {
            }
            bh1Var = th1Var2.b.d;
            if (bh1Var == null) {
            }
            obj2 = zj1.class;
            arrayList = new ArrayList(list3.size());
            size2 = list3.size();
            while (i5 < size2) {
            }
            jc1 jc1Var5222 = th1Var2.a;
            w10 w10Var2222 = jc1Var5222.f;
            if (w10Var2222 != null) {
            }
            al0 al0Var222 = new al0(spannableString, 2, a6Var2);
            if (arrayList.size() > 1) {
            }
            size3 = list3.size();
            z4 = false;
            i7 = 0;
            while (i7 < size3) {
            }
            nr nrVar6222 = nrVar42;
            if (z4) {
            }
            list5 = list4;
            nr nrVar7222 = nrVar6222;
            bh1Var2 = th1Var2.b.d;
            if (bh1Var2 != null) {
            }
            size4 = list3.size();
            while (i8 < size4) {
            }
            if (list5.size() <= 0) {
            }
        }
        i = 2;
        obj3.p = i;
        a6Var = new a6(obj3);
        lh1 lh1Var22 = th1Var.b.i;
        if (lh1Var22 == null) {
        }
        l6Var.setFlags(lh1Var22.b ? l6Var.getFlags() | 128 : l6Var.getFlags() & (-129));
        i2 = lh1Var22.a;
        if (i2 == 1) {
        }
        jc1Var = th1Var.a;
        size = list.size();
        i3 = 0;
        while (true) {
            if (i3 >= size) {
            }
            i3++;
        }
        if (obj != null) {
        }
        long j322 = jc1Var.b;
        str2 = jc1Var.g;
        mi0Var = jc1Var.k;
        zg1Var = jc1Var.a;
        ah1Var = jc1Var.j;
        j = jc1Var.h;
        b = wh1.b(j322);
        if (xh1.a(b, 4294967296L)) {
        }
        w10Var = jc1Var.f;
        if (w10Var != null) {
        }
        x20 x20Var22 = jc1Var.c;
        if (x20Var22 == null) {
        }
        t20 t20Var22 = jc1Var.d;
        if (t20Var22 != null) {
        }
        u20 u20Var22 = jc1Var.e;
        if (u20Var22 != null) {
        }
        z2 = z;
        a6Var2 = a6Var;
        b6 b6Var222 = a6Var2.d;
        zg1Var2 = zg1Var;
        b2 = ((x10) b6Var222.i).b(w10Var, x20Var22, i17, i18);
        if (b2 instanceof ck1) {
        }
        l6Var.setTypeface(typeface);
        if (mi0Var != null) {
        }
        if (str2 != null) {
        }
        if (ah1Var != null) {
        }
        l6Var.d(zg1Var2.c());
        l6Var.c(zg1Var2.j(), 9205357640488583168L, zg1Var2.k());
        l6Var.f(jc1Var.n);
        l6Var.g(jc1Var.m);
        l6Var.e(jc1Var.o);
        if (!xh1.a(wh1.b(j), 4294967296L)) {
        }
        if (xh1.a(wh1.b(j), 8589934592L)) {
        }
        long j422 = jc1Var.l;
        ad adVar32 = jc1Var.i;
        if (z2) {
        }
        long j522 = hi.g;
        if (hi.c(j422, j522)) {
        }
        if (adVar32 == null) {
        }
        if (z6) {
        }
        list3 = obj3.g;
        if (jc1Var2 != null) {
        }
        r1 = obj3.d;
        float textSize22 = obj3.k.getTextSize();
        th1Var2 = obj3.e;
        List list722 = obj3.h;
        nr nrVar422 = obj3.j;
        z3 = obj3.o;
        y5 y5Var22 = z5.a;
        if (z3) {
        }
        str3 = r1;
        f = 0.0f;
        charSequence = str3;
        if (!list3.isEmpty()) {
        }
        j2 = 0;
        if (charSequence instanceof Spannable) {
        }
        if (Intrinsics.a(th1Var2.a.m, wg1.c)) {
        }
        kx0Var = th1Var2.c;
        if ((kx0Var != null || (hx0Var = kx0Var.a) == null) ? false : hx0Var.a) {
        }
        uu0 uu0Var222 = th1Var2.b;
        jh0 jh0Var22 = uu0Var222.f;
        if (jh0Var22 == null) {
        }
        B = ka0.B(uu0Var222.c, textSize22, nrVar422);
        if (!Float.isNaN(B)) {
        }
        bh1Var = th1Var2.b.d;
        if (bh1Var == null) {
        }
        obj2 = zj1.class;
        arrayList = new ArrayList(list3.size());
        size2 = list3.size();
        while (i5 < size2) {
        }
        jc1 jc1Var52222 = th1Var2.a;
        w10 w10Var22222 = jc1Var52222.f;
        if (w10Var22222 != null) {
        }
        al0 al0Var2222 = new al0(spannableString, 2, a6Var2);
        if (arrayList.size() > 1) {
        }
        size3 = list3.size();
        z4 = false;
        i7 = 0;
        while (i7 < size3) {
        }
        nr nrVar62222 = nrVar422;
        if (z4) {
        }
        list5 = list4;
        nr nrVar72222 = nrVar62222;
        bh1Var2 = th1Var2.b.d;
        if (bh1Var2 != null) {
        }
        size4 = list3.size();
        while (i8 < size4) {
        }
        if (list5.size() <= 0) {
        }
    }

    public final float a() {
        yc0 yc0Var = this.m;
        float f = yc0Var.e;
        TextPaint textPaint = yc0Var.b;
        if (!Float.isNaN(f)) {
            return yc0Var.e;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = yc0Var.a;
        lineInstance.setText(new qg(charSequence, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, new f6(3));
        int i = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new Pair(Integer.valueOf(i), Integer.valueOf(next)));
            } else {
                Pair pair = (Pair) priorityQueue.peek();
                if (pair != null && ((Number) pair.e).intValue() - ((Number) pair.d).intValue() < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new Pair(Integer.valueOf(i), Integer.valueOf(next)));
                }
            }
            i = next;
        }
        float f2 = 0.0f;
        if (!priorityQueue.isEmpty()) {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                dd0.c();
                return 0.0f;
            }
            Pair pair2 = (Pair) it.next();
            f2 = Layout.getDesiredWidth(yc0Var.b(), ((Number) pair2.d).intValue(), ((Number) pair2.e).intValue(), textPaint);
            while (it.hasNext()) {
                Pair pair3 = (Pair) it.next();
                f2 = Math.max(f2, Layout.getDesiredWidth(yc0Var.b(), ((Number) pair3.d).intValue(), ((Number) pair3.e).intValue(), textPaint));
            }
        }
        yc0Var.e = f2;
        return f2;
    }

    @Override // defpackage.su0
    public final boolean c() {
        i8 i8Var = this.n;
        if (i8Var != null ? i8Var.m() : false) {
            return true;
        }
        if (!this.o && la0.r(this.e)) {
            s40 s40Var = cv.a;
            s40 s40Var2 = cv.a;
            yd1 yd1Var = (yd1) s40Var2.e;
            if (yd1Var == null) {
                if (yu.k != null) {
                    yd1Var = s40Var2.r();
                    s40Var2.e = yd1Var;
                } else {
                    yd1Var = mo.g;
                }
            }
            if (((Boolean) yd1Var.getValue()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.su0
    public final float d() {
        return this.m.c();
    }
}
