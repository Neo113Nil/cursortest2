package defpackage;

import android.graphics.Typeface;
import android.os.LocaleList;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.ScaleXSpan;
import com.google.firebase.encoders.json.BuildConfig;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.PriorityQueue;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class na implements cz1 {
    public final String m;
    public final pw2 n;
    public final List o;
    public final List p;
    public final hp0 q;
    public final ca0 r;
    public final sb s;
    public final CharSequence t;
    public final x81 u;
    public mh v;
    public final boolean w;
    public final int x;

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0385, code lost:
    
        if ((r6.b.c & 1095216660480L) != 0) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x0099, code lost:
    
        if (r8 == 1) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x064c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x07a7  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x081d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0847 A[LOOP:6: B:274:0x0845->B:275:0x0847, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0858  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x014f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:347:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x00fb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:415:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02bd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0340  */
    /* JADX WARN: Type inference failed for: r9v26, types: [android.text.Spannable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public na(String str, pw2 pw2Var, List list, List list2, hp0 hp0Var, ca0 ca0Var) {
        Locale locale;
        int i;
        int i2;
        int size;
        int i3;
        Object obj;
        jq0 jq0Var;
        fq0 fq0Var;
        String str2;
        sf1 sf1Var;
        qv2 qv2Var;
        long j;
        long b;
        ip0 ip0Var;
        j13 b2;
        Typeface typeface;
        long j2;
        un2 un2Var;
        String str3;
        float textSize;
        ca0 ca0Var2;
        boolean z;
        CharSequence charSequence;
        un2 un2Var2;
        ez1 ez1Var;
        long j3;
        j22 j22Var;
        float l;
        int length;
        int i4;
        rv2 rv2Var;
        ez1 ez1Var2;
        ArrayList arrayList;
        int size2;
        int i5;
        ArrayList arrayList2;
        un2 un2Var3;
        int i6;
        int size3;
        int i7;
        boolean z2;
        List list3;
        rv2 rv2Var2;
        int size4;
        int i8;
        List list4;
        int i9;
        boolean z3;
        ca0 ca0Var3;
        ez1 ez1Var3;
        int i10;
        int i11;
        int i12;
        a22 a22Var;
        this.m = str;
        this.n = pw2Var;
        this.o = list;
        this.p = list2;
        this.q = hp0Var;
        this.r = ca0Var;
        float d = ca0Var.d();
        sb sbVar = new sb(1);
        ((TextPaint) sbVar).density = d;
        sbVar.b = xt2.b;
        sbVar.c = 3;
        sbVar.d = dk2.d;
        this.s = sbVar;
        j22 j22Var2 = pw2Var.c;
        un2 un2Var4 = pw2Var.a;
        ez1 ez1Var4 = pw2Var.b;
        ar0 ar0Var = eg0.a;
        ar0 ar0Var2 = eg0.a;
        so2 so2Var = (so2) ar0Var2.n;
        if (so2Var == null) {
            if (ag0.d()) {
                so2Var = ar0Var2.u();
                ar0Var2.n = so2Var;
            } else {
                so2Var = z71.t;
            }
        }
        this.w = ((Boolean) so2Var.getValue()).booleanValue();
        int i13 = ez1Var4.b;
        sf1 sf1Var2 = un2Var4.k;
        int i14 = 0;
        if (i13 != 4) {
            if (i13 != 5) {
                if (i13 == 1) {
                    i = 0;
                } else if (i13 == 2) {
                    i = 1;
                } else {
                    if (i13 != 3 && i13 != Integer.MIN_VALUE) {
                        lh.g("Invalid TextDirection.");
                        throw null;
                    }
                    int layoutDirectionFromLocale = TextUtils.getLayoutDirectionFromLocale((sf1Var2 == null || (locale = ((rf1) sf1Var2.m.get(0)).a) == null) ? Locale.getDefault() : locale);
                    if (layoutDirectionFromLocale != 0) {
                    }
                }
                this.x = i;
                ma maVar = new ma(i14, this);
                hw2 hw2Var = ez1Var4.i;
                hw2Var = hw2Var == null ? hw2.c : hw2Var;
                sbVar.setFlags(hw2Var.b ? sbVar.getFlags() | 128 : sbVar.getFlags() & (-129));
                i2 = hw2Var.a;
                if (i2 == 1) {
                    sbVar.setFlags(sbVar.getFlags() | 64);
                    sbVar.setHinting(0);
                } else if (i2 == 2) {
                    sbVar.getFlags();
                    sbVar.setHinting(1);
                } else if (i2 == 3) {
                    sbVar.getFlags();
                    sbVar.setHinting(0);
                } else {
                    sbVar.getFlags();
                }
                size = list.size();
                i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        obj = null;
                        break;
                    }
                    obj = list.get(i3);
                    if (((xd) obj).a instanceof un2) {
                        break;
                    } else {
                        i3++;
                    }
                }
                boolean z4 = obj != null;
                long j4 = un2Var4.b;
                jq0Var = un2Var4.c;
                fq0Var = un2Var4.d;
                str2 = un2Var4.g;
                sf1Var = un2Var4.k;
                pv2 pv2Var = un2Var4.a;
                qv2Var = un2Var4.j;
                j = un2Var4.h;
                boolean z5 = z4;
                b = sw2.b(j4);
                if (tw2.a(b, 4294967296L)) {
                    sbVar.setTextSize(ca0Var.g0(j4));
                } else if (tw2.a(b, 8589934592L)) {
                    sbVar.setTextSize(sw2.c(j4) * sbVar.getTextSize());
                }
                ip0Var = un2Var4.f;
                if (ip0Var == null || fq0Var != null || jq0Var != null) {
                    jq0 jq0Var2 = jq0Var == null ? jq0.q : jq0Var;
                    int i15 = fq0Var != null ? fq0Var.a : 0;
                    gq0 gq0Var = un2Var4.e;
                    int i16 = gq0Var != null ? gq0Var.a : 65535;
                    na naVar = (na) maVar.n;
                    b2 = ((jp0) naVar.q).b(ip0Var, jq0Var2, i15, i16);
                    if (b2 instanceof i13) {
                        Object obj2 = ((i13) b2).m;
                        obj2.getClass();
                        typeface = (Typeface) obj2;
                    } else {
                        mh mhVar = new mh(b2, naVar.v);
                        naVar.v = mhVar;
                        Object obj3 = mhVar.p;
                        obj3.getClass();
                        typeface = (Typeface) obj3;
                    }
                    sbVar.setTypeface(typeface);
                }
                if (sf1Var != null) {
                    sf1 sf1Var3 = sf1.o;
                    if (!sf1Var.equals(s03.t())) {
                        ArrayList arrayList3 = new ArrayList(rv.l(sf1Var, 10));
                        Iterator it = sf1Var.m.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(((rf1) it.next()).a);
                        }
                        Locale[] localeArr = (Locale[]) arrayList3.toArray(new Locale[0]);
                        sbVar.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
                    }
                }
                if (str2 != null && !str2.equals(BuildConfig.FLAVOR)) {
                    sbVar.setFontFeatureSettings(str2);
                }
                if (qv2Var != null && !qv2Var.equals(qv2.c)) {
                    sbVar.setTextScaleX(sbVar.getTextScaleX() * qv2Var.a);
                    sbVar.setTextSkewX(sbVar.getTextSkewX() + qv2Var.b);
                }
                sbVar.d(pv2Var.b());
                sbVar.c(pv2Var.c(), 9205357640488583168L, pv2Var.a());
                sbVar.f(un2Var4.n);
                sbVar.g(un2Var4.m);
                sbVar.e(un2Var4.p);
                if (tw2.a(sw2.b(j), 4294967296L) || sw2.c(j) == 0.0f) {
                    j2 = j;
                    if (tw2.a(sw2.b(j2), 8589934592L)) {
                        sbVar.setLetterSpacing(sw2.c(j2));
                    }
                } else {
                    float textScaleX = sbVar.getTextScaleX() * sbVar.getTextSize();
                    j2 = j;
                    float g0 = ca0Var.g0(j2);
                    if (textScaleX != 0.0f) {
                        sbVar.setLetterSpacing(g0 / textScaleX);
                    }
                }
                long j5 = un2Var4.l;
                nn nnVar = un2Var4.i;
                boolean z6 = (z5 || !tw2.a(sw2.b(j2), 4294967296L) || sw2.c(j2) == 0.0f) ? false : true;
                long j6 = aw.g;
                boolean z7 = aw.c(j5, j6) && !aw.c(j5, aw.f);
                boolean z8 = nnVar == null && Float.compare(nnVar.a, 0.0f) != 0;
                un2Var = (!z6 || z7 || z8) ? new un2(0L, 0L, (jq0) null, (fq0) null, (gq0) null, (ip0) null, (String) null, z6 ? j2 : sw2.c, z8 ? nnVar : null, (qv2) null, (sf1) null, z7 ? j5 : j6, (xt2) null, (dk2) null, 63103) : null;
                List list5 = this.o;
                if (un2Var != null) {
                    int size5 = list5.size() + 1;
                    ArrayList arrayList4 = new ArrayList(size5);
                    int i17 = 0;
                    while (i17 < size5) {
                        arrayList4.add(i17 == 0 ? new xd(0, this.m.length(), un2Var) : (xd) this.o.get(i17 - 1));
                        i17++;
                    }
                    list5 = arrayList4;
                }
                str3 = this.m;
                textSize = this.s.getTextSize();
                pw2 pw2Var2 = this.n;
                List list6 = this.p;
                ca0Var2 = this.r;
                z = this.w;
                ka kaVar = la.a;
                if (z || !ag0.d()) {
                    charSequence = str3;
                } else {
                    j22 j22Var3 = pw2Var2.c;
                    if (j22Var3 != null) {
                        a22 a22Var2 = j22Var3.b;
                    }
                    CharSequence g = ag0.a().g(0, str3.length(), 0, str3);
                    g.getClass();
                    charSequence = g;
                }
                CharSequence charSequence2 = (list5.isEmpty() && list6.isEmpty() && Intrinsics.b(pw2Var2.b.d, rv2.c)) ? charSequence : charSequence2;
                SpannableString spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
                un2Var2 = pw2Var2.a;
                ez1Var = pw2Var2.b;
                if (Intrinsics.b(un2Var2.m, xt2.c)) {
                    j3 = 0;
                    spannableString.setSpan(la.a, 0, str3.length(), 33);
                } else {
                    j3 = 0;
                }
                j22Var = pw2Var2.c;
                if (((j22Var != null || (a22Var = j22Var.b) == null) ? false : a22Var.a) || ez1Var.f != null) {
                    ud1 ud1Var = ez1Var.f;
                    ud1Var = ud1Var == null ? ud1.c : ud1Var;
                    l = hl2.l(ez1Var.c, textSize, ca0Var2);
                    if (!Float.isNaN(l)) {
                        if (spannableString.length() != 0) {
                            if (spannableString.length() == 0) {
                                ch2.k("Char sequence is empty.");
                                throw null;
                            }
                            if (spannableString.charAt(spannableString.length() - 1) != '\n') {
                                length = spannableString.length();
                                int i18 = length;
                                int i19 = ud1Var.b;
                                i4 = 0;
                                spannableString.setSpan(new vd1(l, i18, (i19 & 1) <= 0, (i19 & 16) <= 0, ud1Var.a, false), 0, spannableString.length(), 33);
                                rv2Var = ez1Var.d;
                                if (rv2Var != null) {
                                    int i20 = i4;
                                    long j7 = rv2Var.a;
                                    long j8 = rv2Var.b;
                                    if ((sw2.a(j7, mi2.l(i20)) && sw2.a(j8, mi2.l(i20))) || (j7 & 1095216660480L) == j3 || (j8 & 1095216660480L) == j3) {
                                        ez1Var2 = ez1Var;
                                    } else {
                                        long b3 = sw2.b(j7);
                                        ez1Var2 = ez1Var;
                                        float g02 = tw2.a(b3, 4294967296L) ? ca0Var2.g0(j7) : tw2.a(b3, 8589934592L) ? sw2.c(j7) * textSize : 0.0f;
                                        long b4 = sw2.b(j8);
                                        spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(g02), (int) Math.ceil(tw2.a(b4, 4294967296L) ? ca0Var2.g0(j8) : tw2.a(b4, 8589934592L) ? sw2.c(j8) * textSize : 0.0f)), 0, spannableString.length(), 33);
                                    }
                                } else {
                                    ez1Var2 = ez1Var;
                                }
                                arrayList = new ArrayList(list5.size());
                                size2 = list5.size();
                                for (i5 = 0; i5 < size2; i5++) {
                                    xd xdVar = (xd) list5.get(i5);
                                    Object obj4 = xdVar.a;
                                    if (obj4 instanceof un2) {
                                        un2 un2Var5 = (un2) obj4;
                                        if (un2Var5.f != null || un2Var5.d != null || un2Var5.c != null || ((un2) obj4).e != null) {
                                            arrayList.add(xdVar);
                                        }
                                    }
                                }
                                un2 un2Var6 = pw2Var2.a;
                                ip0 ip0Var2 = un2Var6.f;
                                un2 un2Var7 = (ip0Var2 != null && un2Var6.d == null && un2Var6.c == null && un2Var6.e == null) ? null : new un2(0L, 0L, un2Var6.c, un2Var6.d, un2Var6.e, ip0Var2, (String) null, 0L, (nn) null, (qv2) null, (sf1) null, 0L, (xt2) null, (dk2) null, 65475);
                                qk qkVar = new qk(2, spannableString, maVar);
                                if (arrayList.size() > 1) {
                                    int size6 = arrayList.size();
                                    int i21 = size6 * 2;
                                    int[] iArr = new int[i21];
                                    int size7 = arrayList.size();
                                    for (int i22 = 0; i22 < size7; i22++) {
                                        xd xdVar2 = (xd) arrayList.get(i22);
                                        iArr[i22] = xdVar2.b;
                                        iArr[i22 + size6] = xdVar2.c;
                                    }
                                    if (i21 > 1) {
                                        Arrays.sort(iArr);
                                    }
                                    if (i21 == 0) {
                                        ch2.k("Array is empty.");
                                        throw null;
                                    }
                                    int i23 = iArr[0];
                                    int i24 = 0;
                                    while (i24 < i21) {
                                        int i25 = iArr[i24];
                                        if (i25 == i23) {
                                            arrayList2 = arrayList;
                                            un2Var3 = un2Var7;
                                            i6 = i24;
                                        } else {
                                            int size8 = arrayList.size();
                                            un2 un2Var8 = un2Var7;
                                            int i26 = 0;
                                            while (i26 < size8) {
                                                ArrayList arrayList5 = arrayList;
                                                xd xdVar3 = (xd) arrayList.get(i26);
                                                un2 un2Var9 = un2Var7;
                                                int i27 = xdVar3.b;
                                                int i28 = i24;
                                                int i29 = xdVar3.c;
                                                if (i27 != i29 && ae.b(i23, i25, i27, i29)) {
                                                    un2 un2Var10 = (un2) xdVar3.a;
                                                    un2Var8 = un2Var8 != null ? un2Var8.c(un2Var10) : un2Var10;
                                                }
                                                i26++;
                                                arrayList = arrayList5;
                                                un2Var7 = un2Var9;
                                                i24 = i28;
                                            }
                                            arrayList2 = arrayList;
                                            un2Var3 = un2Var7;
                                            i6 = i24;
                                            if (un2Var8 != null) {
                                                qkVar.a(un2Var8, Integer.valueOf(i23), Integer.valueOf(i25));
                                            }
                                            i23 = i25;
                                        }
                                        i24 = i6 + 1;
                                        arrayList = arrayList2;
                                        un2Var7 = un2Var3;
                                    }
                                } else if (!arrayList.isEmpty()) {
                                    un2 un2Var11 = (un2) ((xd) arrayList.get(0)).a;
                                    qkVar.a(un2Var7 != null ? un2Var7.c(un2Var11) : un2Var11, Integer.valueOf(((xd) arrayList.get(0)).b), Integer.valueOf(((xd) arrayList.get(0)).c));
                                }
                                size3 = list5.size();
                                i7 = 0;
                                z2 = false;
                                while (i7 < size3) {
                                    xd xdVar4 = (xd) list5.get(i7);
                                    Object obj5 = xdVar4.a;
                                    if (obj5 instanceof un2) {
                                        int i30 = xdVar4.b;
                                        int i31 = xdVar4.c;
                                        if (i30 >= 0 && i30 < spannableString.length() && i31 > i30 && i31 <= spannableString.length()) {
                                            un2 un2Var12 = (un2) obj5;
                                            long j9 = un2Var12.h;
                                            nn nnVar2 = un2Var12.i;
                                            pv2 pv2Var2 = un2Var12.a;
                                            if (nnVar2 != null) {
                                                i9 = size3;
                                                spannableString.setSpan(new on(0, nnVar2.a), i30, i31, 33);
                                            } else {
                                                i9 = size3;
                                            }
                                            int i32 = i7;
                                            hl2.m(spannableString, pv2Var2.b(), i30, i31);
                                            cq c = pv2Var2.c();
                                            float a = pv2Var2.a();
                                            if (c != null) {
                                                if (c instanceof nn2) {
                                                    hl2.m(spannableString, ((nn2) c).a, i30, i31);
                                                } else {
                                                    spannableString.setSpan(new ck2((bk2) c, a), i30, i31, 33);
                                                }
                                            }
                                            xt2 xt2Var = un2Var12.m;
                                            if (xt2Var != null) {
                                                int i33 = xt2Var.a;
                                                yt2 yt2Var = new yt2((i33 | 1) == i33, (i33 | 2) == i33);
                                                i11 = 33;
                                                spannableString.setSpan(yt2Var, i30, i31, 33);
                                            } else {
                                                i11 = 33;
                                            }
                                            int i34 = i11;
                                            ez1Var3 = ez1Var2;
                                            hl2.n(spannableString, un2Var12.b, ca0Var2, i30, i31);
                                            String str4 = un2Var12.g;
                                            if (str4 != null) {
                                                spannableString.setSpan(new lp0(0, str4), i30, i31, i34);
                                            }
                                            qv2 qv2Var2 = un2Var12.j;
                                            if (qv2Var2 != null) {
                                                spannableString.setSpan(new ScaleXSpan(qv2Var2.a), i30, i31, i34);
                                                spannableString.setSpan(new on(1, qv2Var2.b), i30, i31, i34);
                                            }
                                            hl2.o(spannableString, un2Var12.k, i30, i31);
                                            ca0Var3 = ca0Var2;
                                            long j10 = un2Var12.l;
                                            if (j10 != 16) {
                                                spannableString.setSpan(new BackgroundColorSpan(ap.H(j10)), i30, i31, i34);
                                            }
                                            dk2 dk2Var = un2Var12.n;
                                            if (dk2Var != null) {
                                                long j11 = dk2Var.b;
                                                z3 = z2;
                                                i10 = i32;
                                                int H = ap.H(dk2Var.a);
                                                float intBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32));
                                                float intBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L));
                                                float f = dk2Var.c;
                                                ek2 ek2Var = new ek2(H, intBitsToFloat, intBitsToFloat2, f == 0.0f ? Float.MIN_VALUE : f);
                                                i12 = 33;
                                                spannableString.setSpan(ek2Var, i30, i31, 33);
                                            } else {
                                                z3 = z2;
                                                i10 = i32;
                                                i12 = i34;
                                            }
                                            ae0 ae0Var = un2Var12.p;
                                            if (ae0Var != null) {
                                                spannableString.setSpan(new be0(ae0Var), i30, i31, i12);
                                            }
                                            if (tw2.a(sw2.b(j9), 4294967296L) || tw2.a(sw2.b(j9), 8589934592L)) {
                                                z2 = true;
                                                i7 = i10 + 1;
                                                ez1Var2 = ez1Var3;
                                                ca0Var2 = ca0Var3;
                                                size3 = i9;
                                            }
                                            z2 = z3;
                                            i7 = i10 + 1;
                                            ez1Var2 = ez1Var3;
                                            ca0Var2 = ca0Var3;
                                            size3 = i9;
                                        }
                                    }
                                    i9 = size3;
                                    z3 = z2;
                                    ca0Var3 = ca0Var2;
                                    ez1Var3 = ez1Var2;
                                    i10 = i7;
                                    z2 = z3;
                                    i7 = i10 + 1;
                                    ez1Var2 = ez1Var3;
                                    ca0Var2 = ca0Var3;
                                    size3 = i9;
                                }
                                ca0 ca0Var4 = ca0Var2;
                                ez1 ez1Var5 = ez1Var2;
                                if (z2) {
                                    int size9 = list5.size();
                                    int i35 = 0;
                                    while (i35 < size9) {
                                        xd xdVar5 = (xd) list5.get(i35);
                                        ud udVar = (ud) xdVar5.a;
                                        if (udVar instanceof un2) {
                                            int i36 = xdVar5.b;
                                            int i37 = xdVar5.c;
                                            if (i36 >= 0 && i36 < spannableString.length() && i37 > i36 && i37 <= spannableString.length()) {
                                                long j12 = ((un2) udVar).h;
                                                long b5 = sw2.b(j12);
                                                list4 = list6;
                                                Object vc1Var = tw2.a(b5, 4294967296L) ? new vc1(ca0Var4.g0(j12)) : tw2.a(b5, 8589934592L) ? new uc1(sw2.c(j12)) : null;
                                                if (vc1Var != null) {
                                                    spannableString.setSpan(vc1Var, i36, i37, 33);
                                                }
                                                i35++;
                                                list6 = list4;
                                            }
                                        }
                                        list4 = list6;
                                        i35++;
                                        list6 = list4;
                                    }
                                }
                                list3 = list6;
                                rv2Var2 = ez1Var5.d;
                                if (rv2Var2 != null) {
                                    long j13 = rv2Var2.a;
                                    long b6 = sw2.b(j13);
                                    if (tw2.a(b6, 4294967296L)) {
                                        ca0Var4.g0(j13);
                                    } else if (tw2.a(b6, 8589934592L)) {
                                        sw2.c(j13);
                                    }
                                }
                                size4 = list5.size();
                                for (i8 = 0; i8 < size4; i8++) {
                                    Object obj6 = ((xd) list5.get(i8)).a;
                                }
                                charSequence2 = spannableString;
                                if (list3.size() > 0) {
                                    xd xdVar6 = (xd) list3.get(0);
                                    if (xdVar6.a != null) {
                                        b71.o();
                                        throw null;
                                    }
                                    for (Object obj7 : spannableString.getSpans(xdVar6.b, xdVar6.c, f13.class)) {
                                        spannableString.removeSpan((f13) obj7);
                                    }
                                    throw null;
                                }
                                this.t = charSequence2;
                                this.u = new x81(charSequence2, this.s, this.x);
                            }
                        }
                        length = spannableString.length() + 1;
                        int i182 = length;
                        int i192 = ud1Var.b;
                        i4 = 0;
                        spannableString.setSpan(new vd1(l, i182, (i192 & 1) <= 0, (i192 & 16) <= 0, ud1Var.a, false), 0, spannableString.length(), 33);
                        rv2Var = ez1Var.d;
                        if (rv2Var != null) {
                        }
                        arrayList = new ArrayList(list5.size());
                        size2 = list5.size();
                        while (i5 < size2) {
                        }
                        un2 un2Var62 = pw2Var2.a;
                        ip0 ip0Var22 = un2Var62.f;
                        if (ip0Var22 != null) {
                        }
                        qk qkVar2 = new qk(2, spannableString, maVar);
                        if (arrayList.size() > 1) {
                        }
                        size3 = list5.size();
                        i7 = 0;
                        z2 = false;
                        while (i7 < size3) {
                        }
                        ca0 ca0Var42 = ca0Var2;
                        ez1 ez1Var52 = ez1Var2;
                        if (z2) {
                        }
                        list3 = list6;
                        rv2Var2 = ez1Var52.d;
                        if (rv2Var2 != null) {
                        }
                        size4 = list5.size();
                        while (i8 < size4) {
                        }
                        charSequence2 = spannableString;
                        if (list3.size() > 0) {
                        }
                        this.t = charSequence2;
                        this.u = new x81(charSequence2, this.s, this.x);
                    }
                } else {
                    float l2 = hl2.l(ez1Var.c, textSize, ca0Var2);
                    if (!Float.isNaN(l2)) {
                        spannableString.setSpan(new qd1(l2), 0, spannableString.length(), 33);
                    }
                }
                i4 = 0;
                rv2Var = ez1Var.d;
                if (rv2Var != null) {
                }
                arrayList = new ArrayList(list5.size());
                size2 = list5.size();
                while (i5 < size2) {
                }
                un2 un2Var622 = pw2Var2.a;
                ip0 ip0Var222 = un2Var622.f;
                if (ip0Var222 != null) {
                }
                qk qkVar22 = new qk(2, spannableString, maVar);
                if (arrayList.size() > 1) {
                }
                size3 = list5.size();
                i7 = 0;
                z2 = false;
                while (i7 < size3) {
                }
                ca0 ca0Var422 = ca0Var2;
                ez1 ez1Var522 = ez1Var2;
                if (z2) {
                }
                list3 = list6;
                rv2Var2 = ez1Var522.d;
                if (rv2Var2 != null) {
                }
                size4 = list5.size();
                while (i8 < size4) {
                }
                charSequence2 = spannableString;
                if (list3.size() > 0) {
                }
                this.t = charSequence2;
                this.u = new x81(charSequence2, this.s, this.x);
            }
            i = 3;
            this.x = i;
            ma maVar2 = new ma(i14, this);
            hw2 hw2Var2 = ez1Var4.i;
            if (hw2Var2 == null) {
            }
            sbVar.setFlags(hw2Var2.b ? sbVar.getFlags() | 128 : sbVar.getFlags() & (-129));
            i2 = hw2Var2.a;
            if (i2 == 1) {
            }
            size = list.size();
            i3 = 0;
            while (true) {
                if (i3 >= size) {
                }
                i3++;
            }
            if (obj != null) {
            }
            long j42 = un2Var4.b;
            jq0Var = un2Var4.c;
            fq0Var = un2Var4.d;
            str2 = un2Var4.g;
            sf1Var = un2Var4.k;
            pv2 pv2Var3 = un2Var4.a;
            qv2Var = un2Var4.j;
            j = un2Var4.h;
            boolean z52 = z4;
            b = sw2.b(j42);
            if (tw2.a(b, 4294967296L)) {
            }
            ip0Var = un2Var4.f;
            if (ip0Var == null) {
            }
            if (jq0Var == null) {
            }
            if (fq0Var != null) {
            }
            gq0 gq0Var2 = un2Var4.e;
            if (gq0Var2 != null) {
            }
            na naVar2 = (na) maVar2.n;
            b2 = ((jp0) naVar2.q).b(ip0Var, jq0Var2, i15, i16);
            if (b2 instanceof i13) {
            }
            sbVar.setTypeface(typeface);
            if (sf1Var != null) {
            }
            if (str2 != null) {
                sbVar.setFontFeatureSettings(str2);
            }
            if (qv2Var != null) {
                sbVar.setTextScaleX(sbVar.getTextScaleX() * qv2Var.a);
                sbVar.setTextSkewX(sbVar.getTextSkewX() + qv2Var.b);
            }
            sbVar.d(pv2Var3.b());
            sbVar.c(pv2Var3.c(), 9205357640488583168L, pv2Var3.a());
            sbVar.f(un2Var4.n);
            sbVar.g(un2Var4.m);
            sbVar.e(un2Var4.p);
            if (tw2.a(sw2.b(j), 4294967296L)) {
            }
            j2 = j;
            if (tw2.a(sw2.b(j2), 8589934592L)) {
            }
            long j52 = un2Var4.l;
            nn nnVar3 = un2Var4.i;
            if (z52) {
            }
            long j62 = aw.g;
            if (aw.c(j52, j62)) {
            }
            if (nnVar3 == null) {
            }
            if (z6) {
            }
            List list52 = this.o;
            if (un2Var != null) {
            }
            str3 = this.m;
            textSize = this.s.getTextSize();
            pw2 pw2Var22 = this.n;
            List list62 = this.p;
            ca0Var2 = this.r;
            z = this.w;
            ka kaVar2 = la.a;
            if (z) {
            }
            charSequence = str3;
            if (list52.isEmpty()) {
            }
            if (charSequence instanceof Spannable) {
            }
            un2Var2 = pw2Var22.a;
            ez1Var = pw2Var22.b;
            if (Intrinsics.b(un2Var2.m, xt2.c)) {
            }
            j22Var = pw2Var22.c;
            if ((j22Var != null || (a22Var = j22Var.b) == null) ? false : a22Var.a) {
            }
            ud1 ud1Var2 = ez1Var.f;
            if (ud1Var2 == null) {
            }
            l = hl2.l(ez1Var.c, textSize, ca0Var2);
            if (!Float.isNaN(l)) {
            }
            i4 = 0;
            rv2Var = ez1Var.d;
            if (rv2Var != null) {
            }
            arrayList = new ArrayList(list52.size());
            size2 = list52.size();
            while (i5 < size2) {
            }
            un2 un2Var6222 = pw2Var22.a;
            ip0 ip0Var2222 = un2Var6222.f;
            if (ip0Var2222 != null) {
            }
            qk qkVar222 = new qk(2, spannableString, maVar2);
            if (arrayList.size() > 1) {
            }
            size3 = list52.size();
            i7 = 0;
            z2 = false;
            while (i7 < size3) {
            }
            ca0 ca0Var4222 = ca0Var2;
            ez1 ez1Var5222 = ez1Var2;
            if (z2) {
            }
            list3 = list62;
            rv2Var2 = ez1Var5222.d;
            if (rv2Var2 != null) {
            }
            size4 = list52.size();
            while (i8 < size4) {
            }
            charSequence2 = spannableString;
            if (list3.size() > 0) {
            }
            this.t = charSequence2;
            this.u = new x81(charSequence2, this.s, this.x);
        }
        i = 2;
        this.x = i;
        ma maVar22 = new ma(i14, this);
        hw2 hw2Var22 = ez1Var4.i;
        if (hw2Var22 == null) {
        }
        sbVar.setFlags(hw2Var22.b ? sbVar.getFlags() | 128 : sbVar.getFlags() & (-129));
        i2 = hw2Var22.a;
        if (i2 == 1) {
        }
        size = list.size();
        i3 = 0;
        while (true) {
            if (i3 >= size) {
            }
            i3++;
        }
        if (obj != null) {
        }
        long j422 = un2Var4.b;
        jq0Var = un2Var4.c;
        fq0Var = un2Var4.d;
        str2 = un2Var4.g;
        sf1Var = un2Var4.k;
        pv2 pv2Var32 = un2Var4.a;
        qv2Var = un2Var4.j;
        j = un2Var4.h;
        boolean z522 = z4;
        b = sw2.b(j422);
        if (tw2.a(b, 4294967296L)) {
        }
        ip0Var = un2Var4.f;
        if (ip0Var == null) {
        }
        if (jq0Var == null) {
        }
        if (fq0Var != null) {
        }
        gq0 gq0Var22 = un2Var4.e;
        if (gq0Var22 != null) {
        }
        na naVar22 = (na) maVar22.n;
        b2 = ((jp0) naVar22.q).b(ip0Var, jq0Var2, i15, i16);
        if (b2 instanceof i13) {
        }
        sbVar.setTypeface(typeface);
        if (sf1Var != null) {
        }
        if (str2 != null) {
        }
        if (qv2Var != null) {
        }
        sbVar.d(pv2Var32.b());
        sbVar.c(pv2Var32.c(), 9205357640488583168L, pv2Var32.a());
        sbVar.f(un2Var4.n);
        sbVar.g(un2Var4.m);
        sbVar.e(un2Var4.p);
        if (tw2.a(sw2.b(j), 4294967296L)) {
        }
        j2 = j;
        if (tw2.a(sw2.b(j2), 8589934592L)) {
        }
        long j522 = un2Var4.l;
        nn nnVar32 = un2Var4.i;
        if (z522) {
        }
        long j622 = aw.g;
        if (aw.c(j522, j622)) {
        }
        if (nnVar32 == null) {
        }
        if (z6) {
        }
        List list522 = this.o;
        if (un2Var != null) {
        }
        str3 = this.m;
        textSize = this.s.getTextSize();
        pw2 pw2Var222 = this.n;
        List list622 = this.p;
        ca0Var2 = this.r;
        z = this.w;
        ka kaVar22 = la.a;
        if (z) {
        }
        charSequence = str3;
        if (list522.isEmpty()) {
        }
        if (charSequence instanceof Spannable) {
        }
        un2Var2 = pw2Var222.a;
        ez1Var = pw2Var222.b;
        if (Intrinsics.b(un2Var2.m, xt2.c)) {
        }
        j22Var = pw2Var222.c;
        if ((j22Var != null || (a22Var = j22Var.b) == null) ? false : a22Var.a) {
        }
        ud1 ud1Var22 = ez1Var.f;
        if (ud1Var22 == null) {
        }
        l = hl2.l(ez1Var.c, textSize, ca0Var2);
        if (!Float.isNaN(l)) {
        }
        i4 = 0;
        rv2Var = ez1Var.d;
        if (rv2Var != null) {
        }
        arrayList = new ArrayList(list522.size());
        size2 = list522.size();
        while (i5 < size2) {
        }
        un2 un2Var62222 = pw2Var222.a;
        ip0 ip0Var22222 = un2Var62222.f;
        if (ip0Var22222 != null) {
        }
        qk qkVar2222 = new qk(2, spannableString, maVar22);
        if (arrayList.size() > 1) {
        }
        size3 = list522.size();
        i7 = 0;
        z2 = false;
        while (i7 < size3) {
        }
        ca0 ca0Var42222 = ca0Var2;
        ez1 ez1Var52222 = ez1Var2;
        if (z2) {
        }
        list3 = list622;
        rv2Var2 = ez1Var52222.d;
        if (rv2Var2 != null) {
        }
        size4 = list522.size();
        while (i8 < size4) {
        }
        charSequence2 = spannableString;
        if (list3.size() > 0) {
        }
        this.t = charSequence2;
        this.u = new x81(charSequence2, this.s, this.x);
    }

    @Override // defpackage.cz1
    public final float a() {
        x81 x81Var = this.u;
        float f = x81Var.e;
        TextPaint textPaint = x81Var.b;
        if (!Float.isNaN(f)) {
            return x81Var.e;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = x81Var.a;
        lineInstance.setText(new wt(charSequence, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, new n(7));
        int i = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new Pair(Integer.valueOf(i), Integer.valueOf(next)));
            } else {
                Pair pair = (Pair) priorityQueue.peek();
                if (pair != null && ((Number) pair.n).intValue() - ((Number) pair.m).intValue() < next - i) {
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
                b71.f();
                return 0.0f;
            }
            Pair pair2 = (Pair) it.next();
            f2 = Layout.getDesiredWidth(x81Var.b(), ((Number) pair2.m).intValue(), ((Number) pair2.n).intValue(), textPaint);
            while (it.hasNext()) {
                Pair pair3 = (Pair) it.next();
                f2 = Math.max(f2, Layout.getDesiredWidth(x81Var.b(), ((Number) pair3.m).intValue(), ((Number) pair3.n).intValue(), textPaint));
            }
        }
        x81Var.e = f2;
        return f2;
    }

    @Override // defpackage.cz1
    public final boolean b() {
        mh mhVar = this.v;
        if (mhVar != null ? mhVar.y() : false) {
            return true;
        }
        if (!this.w) {
            j22 j22Var = this.n.c;
            ar0 ar0Var = eg0.a;
            ar0 ar0Var2 = eg0.a;
            so2 so2Var = (so2) ar0Var2.n;
            if (so2Var == null) {
                if (ag0.d()) {
                    so2Var = ar0Var2.u();
                    ar0Var2.n = so2Var;
                } else {
                    so2Var = z71.t;
                }
            }
            if (((Boolean) so2Var.getValue()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cz1
    public final float c() {
        return this.u.c();
    }
}
