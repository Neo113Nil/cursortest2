package K0;

import B.I;
import B.Y;
import C0.AbstractC0032h;
import C0.C0029e;
import C0.D;
import C0.K;
import C0.t;
import C0.u;
import C0.w;
import C0.y;
import G1.m;
import H0.q;
import H0.s;
import I.W0;
import N0.k;
import N0.n;
import N0.o;
import N0.p;
import O2.l;
import a0.C0238c;
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
import b0.AbstractC0347p;
import b0.C0348q;
import b0.C0352v;
import b0.M;
import b0.P;
import b0.T;
import d0.AbstractC0404e;
import h2.AbstractC0508a;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import m1.v;
import n2.AbstractC0730j;
import z.C1256t;

/* loaded from: classes.dex */
public final class c implements t {

    /* renamed from: a, reason: collision with root package name */
    public final String f3229a;

    /* renamed from: b, reason: collision with root package name */
    public final K f3230b;

    /* renamed from: c, reason: collision with root package name */
    public final List f3231c;

    /* renamed from: d, reason: collision with root package name */
    public final List f3232d;

    /* renamed from: e, reason: collision with root package name */
    public final H0.d f3233e;

    /* renamed from: f, reason: collision with root package name */
    public final O0.b f3234f;

    /* renamed from: g, reason: collision with root package name */
    public final d f3235g;

    /* renamed from: h, reason: collision with root package name */
    public final CharSequence f3236h;

    /* renamed from: i, reason: collision with root package name */
    public final D0.t f3237i;

    /* renamed from: j, reason: collision with root package name */
    public m f3238j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f3239k;

    /* renamed from: l, reason: collision with root package name */
    public final int f3240l;

    /* JADX WARN: Code restructure failed: missing block: B:515:0x00b2, code lost:
    
        if (r11 == 1) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02cf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0632  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0671  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x075d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x089d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x091a  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02b2  */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v54, types: [G1.m, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c(String str, K k3, List list, List list2, H0.d dVar, O0.b bVar) {
        Locale locale;
        int i3;
        int i4;
        D d3;
        boolean a3;
        q qVar;
        J0.b bVar2;
        String str2;
        n nVar;
        long j3;
        D d4;
        ?? r3;
        ?? r02;
        float textSize;
        K k4;
        O0.b bVar3;
        boolean z3;
        Spannable spannable;
        y yVar;
        float P3;
        int i5;
        o oVar;
        List list3;
        Object obj;
        ArrayList arrayList;
        int size;
        int i6;
        ArrayList arrayList2;
        D d5;
        Integer[] numArr;
        int i7;
        int size2;
        boolean z4;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        long j4;
        float c2;
        w wVar;
        m1.y yVar2;
        int i14;
        v[] vVarArr;
        int i15;
        C0029e c0029e;
        J0.b bVar4;
        Typeface typeface;
        int i16 = 1;
        this.f3229a = str;
        this.f3230b = k3;
        this.f3231c = list;
        this.f3232d = list2;
        this.f3233e = dVar;
        this.f3234f = bVar;
        float a4 = bVar.a();
        d dVar2 = new d(1);
        ((TextPaint) dVar2).density = a4;
        dVar2.f3242b = N0.j.f3548b;
        dVar2.f3243c = 3;
        dVar2.f3244d = P.f5380d;
        this.f3235g = dVar2;
        y yVar3 = k3.f573c;
        Y y3 = h.f3253a;
        Y y4 = h.f3253a;
        W0 w02 = (W0) y4.f334d;
        if (w02 == null) {
            if (m1.i.c()) {
                w02 = y4.g();
                y4.f334d = w02;
            } else {
                w02 = i.f3254a;
            }
        }
        this.f3239k = ((Boolean) w02.getValue()).booleanValue();
        int i17 = k3.f572b.f645b;
        J0.b bVar5 = k3.f571a.f535k;
        if (!k.a(i17, 4)) {
            if (!k.a(i17, 5)) {
                if (k.a(i17, 1)) {
                    i3 = 0;
                } else if (k.a(i17, 2)) {
                    i3 = 1;
                } else {
                    if (!(k.a(i17, 3) ? true : k.a(i17, Integer.MIN_VALUE))) {
                        throw new IllegalStateException("Invalid TextDirection.");
                    }
                    int layoutDirectionFromLocale = TextUtils.getLayoutDirectionFromLocale((bVar5 == null || (locale = ((J0.a) bVar5.f3156d.get(0)).f3154a) == null) ? Locale.getDefault() : locale);
                    if (layoutDirectionFromLocale != 0) {
                    }
                }
                this.f3240l = i3;
                A1.b bVar6 = new A1.b(i16, this);
                p pVar = k3.f572b.f652i;
                pVar = pVar == null ? p.f3560c : pVar;
                dVar2.setFlags(pVar.f3563b ? dVar2.getFlags() | 128 : dVar2.getFlags() & (-129));
                i4 = pVar.f3562a;
                if (i4 == 1) {
                    dVar2.setFlags(dVar2.getFlags() | 64);
                    dVar2.setHinting(0);
                } else if (i4 == 2) {
                    dVar2.getFlags();
                    dVar2.setHinting(1);
                } else if (i4 == 3) {
                    dVar2.getFlags();
                    dVar2.setHinting(0);
                } else {
                    dVar2.getFlags();
                }
                d3 = k3.f571a;
                boolean isEmpty = list.isEmpty();
                long b3 = O0.m.b(d3.f526b);
                a3 = O0.n.a(b3, 4294967296L);
                long j5 = d3.f526b;
                if (a3) {
                    dVar2.setTextSize(bVar.K(j5));
                } else if (O0.n.a(b3, 8589934592L)) {
                    dVar2.setTextSize(O0.m.c(j5) * dVar2.getTextSize());
                }
                qVar = d3.f530f;
                if ((qVar != null && d3.f528d == null && d3.f527c == null) ? false : true) {
                    H0.k kVar = d3.f527c;
                    kVar = kVar == null ? H0.k.f2597f : kVar;
                    H0.i iVar = d3.f528d;
                    int i18 = iVar != null ? iVar.f2594a : 0;
                    H0.j jVar = d3.f529e;
                    s b4 = ((H0.e) dVar).b(qVar, kVar, i18, jVar != null ? jVar.f2595a : 1);
                    if (b4 instanceof s) {
                        Object obj2 = b4.f2611d;
                        f2.j.d(obj2, "null cannot be cast to non-null type android.graphics.Typeface");
                        typeface = (Typeface) obj2;
                    } else {
                        m mVar = new m(b4, this.f3238j);
                        this.f3238j = mVar;
                        Object obj3 = mVar.f2118d;
                        f2.j.d(obj3, "null cannot be cast to non-null type android.graphics.Typeface");
                        typeface = (Typeface) obj3;
                    }
                    dVar2.setTypeface(typeface);
                }
                bVar2 = d3.f535k;
                if (bVar2 != null) {
                    J0.b bVar7 = J0.b.f3155f;
                    m mVar2 = J0.c.f3158a;
                    mVar2.getClass();
                    LocaleList localeList = LocaleList.getDefault();
                    synchronized (((A1.i) mVar2.f2118d)) {
                        try {
                            bVar4 = (J0.b) mVar2.f2117c;
                            if (bVar4 == null || localeList != ((LocaleList) mVar2.f2116b)) {
                                int size3 = localeList.size();
                                ArrayList arrayList3 = new ArrayList(size3);
                                for (int i19 = 0; i19 < size3; i19++) {
                                    arrayList3.add(new J0.a(localeList.get(i19)));
                                }
                                J0.b bVar8 = new J0.b(arrayList3);
                                mVar2.f2116b = localeList;
                                mVar2.f2117c = bVar8;
                                bVar4 = bVar8;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (!bVar2.equals(bVar4)) {
                        L0.a.f3342a.b(dVar2, bVar2);
                    }
                }
                str2 = d3.f531g;
                if (str2 != null && !str2.equals("")) {
                    dVar2.setFontFeatureSettings(str2);
                }
                nVar = d3.f534j;
                if (nVar != null && !nVar.equals(n.f3554c)) {
                    dVar2.setTextScaleX(dVar2.getTextScaleX() * nVar.f3555a);
                    dVar2.setTextSkewX(dVar2.getTextSkewX() + nVar.f3556b);
                }
                N0.m mVar3 = d3.f525a;
                dVar2.d(mVar3.b());
                dVar2.c(mVar3.c(), 9205357640488583168L, mVar3.a());
                dVar2.f(d3.f538n);
                dVar2.g(d3.f537m);
                dVar2.e(d3.f540p);
                j3 = d3.f532h;
                if (!O0.n.a(O0.m.b(j3), 4294967296L) && O0.m.c(j3) != 0.0f) {
                    float textScaleX = dVar2.getTextScaleX() * dVar2.getTextSize();
                    float K3 = bVar.K(j3);
                    if (textScaleX != 0.0f) {
                        dVar2.setLetterSpacing(K3 / textScaleX);
                    }
                } else if (O0.n.a(O0.m.b(j3), 8589934592L)) {
                    dVar2.setLetterSpacing(O0.m.c(j3));
                }
                boolean z5 = isEmpty && O0.n.a(O0.m.b(j3), 4294967296L) && O0.m.c(j3) != 0.0f;
                long j6 = C0352v.f5439g;
                long j7 = d3.f536l;
                boolean z6 = C0352v.c(j7, j6) && !C0352v.c(j7, C0352v.f5438f);
                N0.a aVar = d3.f533i;
                boolean z7 = aVar == null && Float.compare(aVar.f3531a, 0.0f) != 0;
                d4 = (!z5 || z6 || z7) ? new D(0L, 0L, null, null, null, null, null, z5 ? j3 : O0.m.f3746c, z7 ? aVar : null, null, null, z6 ? j7 : j6, null, null, 63103) : null;
                if (d4 != null) {
                    int size4 = list.size() + 1;
                    r3 = new ArrayList(size4);
                    int i20 = 0;
                    while (i20 < size4) {
                        if (i20 == 0) {
                            c0029e = new C0029e(0, this.f3229a.length(), d4);
                            i15 = 1;
                        } else {
                            i15 = 1;
                            c0029e = (C0029e) this.f3231c.get(i20 - 1);
                        }
                        r3.add(c0029e);
                        i20 += i15;
                    }
                } else {
                    r3 = list;
                }
                r02 = this.f3229a;
                textSize = this.f3235g.getTextSize();
                k4 = this.f3230b;
                List list4 = this.f3232d;
                bVar3 = this.f3234f;
                z3 = this.f3239k;
                a aVar2 = b.f3228a;
                if (z3 || !m1.i.c()) {
                    spannable = r02;
                } else {
                    y yVar4 = k4.f573c;
                    if (yVar4 != null) {
                        w wVar2 = yVar4.f659b;
                    }
                    m1.i a5 = m1.i.a();
                    int length = r02.length();
                    if (!(a5.b() == 1)) {
                        throw new IllegalStateException("Not initialized yet");
                    }
                    if (length < 0) {
                        throw new IllegalArgumentException("end cannot be negative");
                    }
                    if (!(length >= 0)) {
                        throw new IllegalArgumentException("start should be <= than end");
                    }
                    if (!(r02.length() >= 0)) {
                        throw new IllegalArgumentException("start should be < than charSequence length");
                    }
                    if (!(length <= r02.length())) {
                        throw new IllegalArgumentException("end should be < than charSequence length");
                    }
                    if (r02.length() != 0 && length != 0) {
                        ?? r8 = a5.f6950e.f6940b;
                        r8.getClass();
                        if (r02 instanceof Spannable) {
                            yVar2 = new m1.y((Spannable) r02);
                        } else if (!(r02 instanceof Spanned) || ((Spanned) r02).nextSpanTransition(-1, length + 1, v.class) > length) {
                            yVar2 = null;
                        } else {
                            yVar2 = new m1.y();
                            yVar2.f6992a = false;
                            yVar2.f6993b = new SpannableString(r02);
                        }
                        if (yVar2 == null || (vVarArr = (v[]) yVar2.f6993b.getSpans(0, length, v.class)) == null || vVarArr.length <= 0) {
                            i14 = 0;
                        } else {
                            int length2 = vVarArr.length;
                            i14 = 0;
                            int i21 = 0;
                            while (i21 < length2) {
                                int i22 = length2;
                                v vVar = vVarArr[i21];
                                v[] vVarArr2 = vVarArr;
                                int spanStart = yVar2.f6993b.getSpanStart(vVar);
                                int spanEnd = yVar2.f6993b.getSpanEnd(vVar);
                                if (spanStart != length) {
                                    yVar2.removeSpan(vVar);
                                }
                                i14 = Math.min(spanStart, i14);
                                length = Math.max(spanEnd, length);
                                i21++;
                                vVarArr = vVarArr2;
                                length2 = i22;
                            }
                        }
                        if (i14 != length && i14 < r02.length()) {
                            m1.y yVar5 = (m1.y) r8.t(r02, i14, length, Integer.MAX_VALUE, false, new C1256t(yVar2, 8, (A1.i) r8.f2116b));
                            if (yVar5 != null) {
                                spannable = yVar5.f6993b;
                                f2.j.c(spannable);
                            }
                        }
                    }
                    spannable = r02;
                    f2.j.c(spannable);
                }
                if (r3.isEmpty() || !list4.isEmpty() || !f2.j.a(k4.f572b.f647d, o.f3557c) || !l.k0(k4.f572b.f646c)) {
                    spannable = spannable instanceof Spannable ? spannable : new SpannableString(spannable);
                    if (f2.j.a(k4.f571a.f537m, N0.j.f3549c)) {
                        spannable.setSpan(b.f3228a, 0, r02.length(), 33);
                    }
                    yVar = k4.f573c;
                    if ((yVar != null || (wVar = yVar.f659b) == null) ? false : wVar.f656a) {
                        u uVar = k4.f572b;
                        if (uVar.f649f == null) {
                            float P4 = AbstractC0508a.P(uVar.f646c, textSize, bVar3);
                            if (!Float.isNaN(P4)) {
                                spannable.setSpan(new F0.g(P4), 0, spannable.length(), 33);
                            }
                            i5 = 0;
                            oVar = k4.f572b.f647d;
                            if (oVar != null) {
                                long g02 = l.g0(i5);
                                long j8 = oVar.f3558a;
                                boolean a6 = O0.m.a(j8, g02);
                                long j9 = oVar.f3559b;
                                obj = v.class;
                                if ((a6 && O0.m.a(j9, l.g0(i5))) || l.k0(j8) || l.k0(j9)) {
                                    list3 = list4;
                                } else {
                                    long b5 = O0.m.b(j8);
                                    list3 = list4;
                                    if (O0.n.a(b5, 4294967296L)) {
                                        c2 = bVar3.K(j8);
                                        j4 = 8589934592L;
                                    } else {
                                        j4 = 8589934592L;
                                        c2 = O0.n.a(b5, 8589934592L) ? O0.m.c(j8) * textSize : 0.0f;
                                    }
                                    long b6 = O0.m.b(j9);
                                    spannable.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(c2), (int) Math.ceil(O0.n.a(b6, 4294967296L) ? bVar3.K(j9) : O0.n.a(b6, j4) ? textSize * O0.m.c(j9) : 0.0f)), 0, spannable.length(), 33);
                                }
                            } else {
                                list3 = list4;
                                obj = v.class;
                            }
                            arrayList = new ArrayList(r3.size());
                            size = r3.size();
                            for (i6 = 0; i6 < size; i6++) {
                                Object obj4 = r3.get(i6);
                                Object obj5 = ((C0029e) obj4).f592a;
                                D d6 = (D) obj5;
                                if (((d6.f530f == null && d6.f528d == null && d6.f527c == null) ? false : true) || ((D) obj5).f529e != null) {
                                    arrayList.add(obj4);
                                }
                            }
                            D d7 = k4.f571a;
                            q qVar2 = d7.f530f;
                            D d8 = ((qVar2 == null || d7.f528d != null || d7.f527c != null) && d7.f529e == null) ? null : new D(0L, 0L, d7.f527c, d7.f528d, d7.f529e, qVar2, null, 0L, null, null, null, 0L, null, null, 65475);
                            I i23 = new I(spannable, 1, bVar6);
                            if (arrayList.size() > 1) {
                                int size5 = arrayList.size();
                                int i24 = size5 * 2;
                                Integer[] numArr2 = new Integer[i24];
                                for (int i25 = 0; i25 < i24; i25++) {
                                    numArr2[i25] = 0;
                                }
                                int size6 = arrayList.size();
                                for (int i26 = 0; i26 < size6; i26++) {
                                    C0029e c0029e2 = (C0029e) arrayList.get(i26);
                                    numArr2[i26] = Integer.valueOf(c0029e2.f593b);
                                    numArr2[i26 + size5] = Integer.valueOf(c0029e2.f594c);
                                }
                                Integer[] numArr3 = numArr2;
                                if (numArr3.length > 1) {
                                    Arrays.sort(numArr3);
                                }
                                if (i24 == 0) {
                                    throw new NoSuchElementException("Array is empty.");
                                }
                                int intValue = numArr2[0].intValue();
                                int i27 = 0;
                                while (i27 < i24) {
                                    Integer num = numArr2[i27];
                                    int intValue2 = num.intValue();
                                    if (intValue2 == intValue) {
                                        arrayList2 = arrayList;
                                        d5 = d8;
                                        numArr = numArr2;
                                        i7 = 1;
                                    } else {
                                        int size7 = arrayList.size();
                                        D d9 = d8;
                                        int i28 = 0;
                                        while (i28 < size7) {
                                            ArrayList arrayList4 = arrayList;
                                            C0029e c0029e3 = (C0029e) arrayList.get(i28);
                                            D d10 = d8;
                                            int i29 = c0029e3.f593b;
                                            Integer[] numArr4 = numArr2;
                                            int i30 = c0029e3.f594c;
                                            if (i29 != i30 && AbstractC0032h.c(intValue, intValue2, i29, i30)) {
                                                D d11 = (D) c0029e3.f592a;
                                                d9 = d9 != null ? d9.c(d11) : d11;
                                            }
                                            i28++;
                                            arrayList = arrayList4;
                                            d8 = d10;
                                            numArr2 = numArr4;
                                        }
                                        arrayList2 = arrayList;
                                        d5 = d8;
                                        numArr = numArr2;
                                        i7 = 1;
                                        if (d9 != null) {
                                            i23.g(d9, Integer.valueOf(intValue), num);
                                        }
                                        intValue = intValue2;
                                    }
                                    i27 += i7;
                                    arrayList = arrayList2;
                                    d8 = d5;
                                    numArr2 = numArr;
                                }
                            } else if (!arrayList.isEmpty()) {
                                D d12 = (D) ((C0029e) arrayList.get(0)).f592a;
                                i23.g(d8 != null ? d8.c(d12) : d12, Integer.valueOf(((C0029e) arrayList.get(0)).f593b), Integer.valueOf(((C0029e) arrayList.get(0)).f594c));
                            }
                            size2 = r3.size();
                            z4 = false;
                            for (i8 = 0; i8 < size2; i8++) {
                                C0029e c0029e4 = (C0029e) r3.get(i8);
                                int i31 = c0029e4.f593b;
                                if (i31 >= 0 && i31 < spannable.length() && (i11 = c0029e4.f594c) > i31 && i11 <= spannable.length()) {
                                    D d13 = (D) c0029e4.f592a;
                                    N0.a aVar3 = d13.f533i;
                                    int i32 = c0029e4.f593b;
                                    int i33 = c0029e4.f594c;
                                    if (aVar3 != null) {
                                        spannable.setSpan(new F0.a(aVar3.f3531a, 0), i32, i33, 33);
                                    }
                                    N0.m mVar4 = d13.f525a;
                                    AbstractC0508a.S(spannable, mVar4.b(), i32, i33);
                                    AbstractC0347p c3 = mVar4.c();
                                    float a7 = mVar4.a();
                                    if (c3 != null) {
                                        if (c3 instanceof T) {
                                            AbstractC0508a.S(spannable, ((T) c3).f5399a, i32, i33);
                                        } else {
                                            spannable.setSpan(new M0.b((C0348q) c3, a7), i32, i33, 33);
                                        }
                                    }
                                    N0.j jVar2 = d13.f537m;
                                    if (jVar2 != null) {
                                        int i34 = jVar2.f3551a;
                                        spannable.setSpan(new F0.k((i34 | 1) == i34, (i34 | 2) == i34), i32, i33, 33);
                                    }
                                    AbstractC0508a.T(spannable, d13.f526b, bVar3, i32, i33);
                                    String str3 = d13.f531g;
                                    if (str3 != null) {
                                        F0.b bVar9 = new F0.b(0, str3);
                                        i12 = 33;
                                        spannable.setSpan(bVar9, i32, i33, 33);
                                    } else {
                                        i12 = 33;
                                    }
                                    n nVar2 = d13.f534j;
                                    if (nVar2 != null) {
                                        spannable.setSpan(new ScaleXSpan(nVar2.f3555a), i32, i33, i12);
                                        spannable.setSpan(new F0.a(nVar2.f3556b, 1), i32, i33, i12);
                                    }
                                    J0.b bVar10 = d13.f535k;
                                    if (bVar10 != null) {
                                        spannable.setSpan(L0.a.f3342a.a(bVar10), i32, i33, i12);
                                    }
                                    long j10 = d13.f536l;
                                    if (j10 != 16) {
                                        spannable.setSpan(new BackgroundColorSpan(M.D(j10)), i32, i33, 33);
                                    }
                                    P p3 = d13.f538n;
                                    if (p3 != null) {
                                        int D = M.D(p3.f5381a);
                                        long j11 = p3.f5382b;
                                        float d14 = C0238c.d(j11);
                                        float e3 = C0238c.e(j11);
                                        float f3 = p3.f5383c;
                                        F0.j jVar3 = new F0.j(D, d14, e3, f3 == 0.0f ? Float.MIN_VALUE : f3);
                                        i13 = 33;
                                        spannable.setSpan(jVar3, i32, i33, 33);
                                    } else {
                                        i13 = 33;
                                    }
                                    AbstractC0404e abstractC0404e = d13.f540p;
                                    if (abstractC0404e != null) {
                                        spannable.setSpan(new M0.a(abstractC0404e), i32, i33, i13);
                                    }
                                    if (O0.n.a(O0.m.b(d13.f532h), 4294967296L) || O0.n.a(O0.m.b(d13.f532h), 8589934592L)) {
                                        z4 = true;
                                    }
                                }
                            }
                            if (z4) {
                                int size8 = r3.size();
                                int i35 = 0;
                                while (i35 < size8) {
                                    C0029e c0029e5 = (C0029e) r3.get(i35);
                                    int i36 = c0029e5.f593b;
                                    D d15 = (D) c0029e5.f592a;
                                    if (i36 >= 0 && i36 < spannable.length() && (i10 = c0029e5.f594c) > i36) {
                                        if (i10 > spannable.length()) {
                                            i9 = 1;
                                            i35 += i9;
                                        } else {
                                            long j12 = d15.f532h;
                                            long b7 = O0.m.b(j12);
                                            Object fVar = O0.n.a(b7, 4294967296L) ? new F0.f(bVar3.K(j12)) : O0.n.a(b7, 8589934592L) ? new F0.e(O0.m.c(j12)) : null;
                                            if (fVar != null) {
                                                spannable.setSpan(fVar, i36, i10, 33);
                                            }
                                        }
                                    }
                                    i9 = 1;
                                    i35 += i9;
                                }
                            }
                            if (list3.size() > 0) {
                                C0029e c0029e6 = (C0029e) list3.get(0);
                                if (c0029e6.f592a != null) {
                                    throw new ClassCastException();
                                }
                                for (Object obj6 : spannable.getSpans(c0029e6.f593b, c0029e6.f594c, obj)) {
                                    spannable.removeSpan((v) obj6);
                                }
                                throw null;
                            }
                        }
                    }
                    u uVar2 = k4.f572b;
                    N0.g gVar = uVar2.f649f;
                    gVar = gVar == null ? N0.g.f3541c : gVar;
                    P3 = AbstractC0508a.P(uVar2.f646c, textSize, bVar3);
                    if (!Float.isNaN(P3)) {
                        int length3 = (spannable.length() == 0 || AbstractC0730j.L(spannable) == '\n') ? spannable.length() + 1 : spannable.length();
                        int i37 = gVar.f3543b;
                        i5 = 0;
                        spannable.setSpan(new F0.h(P3, length3, (i37 & 1) > 0, (i37 & 16) > 0, gVar.f3542a), 0, spannable.length(), 33);
                        oVar = k4.f572b.f647d;
                        if (oVar != null) {
                        }
                        arrayList = new ArrayList(r3.size());
                        size = r3.size();
                        while (i6 < size) {
                        }
                        D d72 = k4.f571a;
                        q qVar22 = d72.f530f;
                        if (qVar22 == null || d72.f528d != null || d72.f527c != null) {
                        }
                        I i232 = new I(spannable, 1, bVar6);
                        if (arrayList.size() > 1) {
                        }
                        size2 = r3.size();
                        z4 = false;
                        while (i8 < size2) {
                        }
                        if (z4) {
                        }
                        if (list3.size() > 0) {
                        }
                    }
                    i5 = 0;
                    oVar = k4.f572b.f647d;
                    if (oVar != null) {
                    }
                    arrayList = new ArrayList(r3.size());
                    size = r3.size();
                    while (i6 < size) {
                    }
                    D d722 = k4.f571a;
                    q qVar222 = d722.f530f;
                    if (qVar222 == null || d722.f528d != null || d722.f527c != null) {
                    }
                    I i2322 = new I(spannable, 1, bVar6);
                    if (arrayList.size() > 1) {
                    }
                    size2 = r3.size();
                    z4 = false;
                    while (i8 < size2) {
                    }
                    if (z4) {
                    }
                    if (list3.size() > 0) {
                    }
                }
                this.f3236h = spannable;
                this.f3237i = new D0.t(spannable, this.f3235g, this.f3240l);
            }
            i3 = 3;
            this.f3240l = i3;
            A1.b bVar62 = new A1.b(i16, this);
            p pVar2 = k3.f572b.f652i;
            if (pVar2 == null) {
            }
            dVar2.setFlags(pVar2.f3563b ? dVar2.getFlags() | 128 : dVar2.getFlags() & (-129));
            i4 = pVar2.f3562a;
            if (i4 == 1) {
            }
            d3 = k3.f571a;
            boolean isEmpty2 = list.isEmpty();
            long b32 = O0.m.b(d3.f526b);
            a3 = O0.n.a(b32, 4294967296L);
            long j52 = d3.f526b;
            if (a3) {
            }
            qVar = d3.f530f;
            if ((qVar != null && d3.f528d == null && d3.f527c == null) ? false : true) {
            }
            bVar2 = d3.f535k;
            if (bVar2 != null) {
            }
            str2 = d3.f531g;
            if (str2 != null) {
                dVar2.setFontFeatureSettings(str2);
            }
            nVar = d3.f534j;
            if (nVar != null) {
                dVar2.setTextScaleX(dVar2.getTextScaleX() * nVar.f3555a);
                dVar2.setTextSkewX(dVar2.getTextSkewX() + nVar.f3556b);
            }
            N0.m mVar32 = d3.f525a;
            dVar2.d(mVar32.b());
            dVar2.c(mVar32.c(), 9205357640488583168L, mVar32.a());
            dVar2.f(d3.f538n);
            dVar2.g(d3.f537m);
            dVar2.e(d3.f540p);
            j3 = d3.f532h;
            if (!O0.n.a(O0.m.b(j3), 4294967296L)) {
            }
            if (O0.n.a(O0.m.b(j3), 8589934592L)) {
            }
            if (isEmpty2) {
            }
            long j62 = C0352v.f5439g;
            long j72 = d3.f536l;
            if (C0352v.c(j72, j62)) {
            }
            N0.a aVar4 = d3.f533i;
            if (aVar4 == null) {
            }
            if (z5) {
            }
            if (d4 != null) {
            }
            r02 = this.f3229a;
            textSize = this.f3235g.getTextSize();
            k4 = this.f3230b;
            List list42 = this.f3232d;
            bVar3 = this.f3234f;
            z3 = this.f3239k;
            a aVar22 = b.f3228a;
            if (z3) {
            }
            spannable = r02;
            if (r3.isEmpty()) {
            }
            if (spannable instanceof Spannable) {
            }
            if (f2.j.a(k4.f571a.f537m, N0.j.f3549c)) {
            }
            yVar = k4.f573c;
            if ((yVar != null || (wVar = yVar.f659b) == null) ? false : wVar.f656a) {
            }
            u uVar22 = k4.f572b;
            N0.g gVar2 = uVar22.f649f;
            if (gVar2 == null) {
            }
            P3 = AbstractC0508a.P(uVar22.f646c, textSize, bVar3);
            if (!Float.isNaN(P3)) {
            }
            i5 = 0;
            oVar = k4.f572b.f647d;
            if (oVar != null) {
            }
            arrayList = new ArrayList(r3.size());
            size = r3.size();
            while (i6 < size) {
            }
            D d7222 = k4.f571a;
            q qVar2222 = d7222.f530f;
            if (qVar2222 == null || d7222.f528d != null || d7222.f527c != null) {
            }
            I i23222 = new I(spannable, 1, bVar62);
            if (arrayList.size() > 1) {
            }
            size2 = r3.size();
            z4 = false;
            while (i8 < size2) {
            }
            if (z4) {
            }
            if (list3.size() > 0) {
            }
            this.f3236h = spannable;
            this.f3237i = new D0.t(spannable, this.f3235g, this.f3240l);
        }
        i3 = 2;
        this.f3240l = i3;
        A1.b bVar622 = new A1.b(i16, this);
        p pVar22 = k3.f572b.f652i;
        if (pVar22 == null) {
        }
        dVar2.setFlags(pVar22.f3563b ? dVar2.getFlags() | 128 : dVar2.getFlags() & (-129));
        i4 = pVar22.f3562a;
        if (i4 == 1) {
        }
        d3 = k3.f571a;
        boolean isEmpty22 = list.isEmpty();
        long b322 = O0.m.b(d3.f526b);
        a3 = O0.n.a(b322, 4294967296L);
        long j522 = d3.f526b;
        if (a3) {
        }
        qVar = d3.f530f;
        if ((qVar != null && d3.f528d == null && d3.f527c == null) ? false : true) {
        }
        bVar2 = d3.f535k;
        if (bVar2 != null) {
        }
        str2 = d3.f531g;
        if (str2 != null) {
        }
        nVar = d3.f534j;
        if (nVar != null) {
        }
        N0.m mVar322 = d3.f525a;
        dVar2.d(mVar322.b());
        dVar2.c(mVar322.c(), 9205357640488583168L, mVar322.a());
        dVar2.f(d3.f538n);
        dVar2.g(d3.f537m);
        dVar2.e(d3.f540p);
        j3 = d3.f532h;
        if (!O0.n.a(O0.m.b(j3), 4294967296L)) {
        }
        if (O0.n.a(O0.m.b(j3), 8589934592L)) {
        }
        if (isEmpty22) {
        }
        long j622 = C0352v.f5439g;
        long j722 = d3.f536l;
        if (C0352v.c(j722, j622)) {
        }
        N0.a aVar42 = d3.f533i;
        if (aVar42 == null) {
        }
        if (z5) {
        }
        if (d4 != null) {
        }
        r02 = this.f3229a;
        textSize = this.f3235g.getTextSize();
        k4 = this.f3230b;
        List list422 = this.f3232d;
        bVar3 = this.f3234f;
        z3 = this.f3239k;
        a aVar222 = b.f3228a;
        if (z3) {
        }
        spannable = r02;
        if (r3.isEmpty()) {
        }
        if (spannable instanceof Spannable) {
        }
        if (f2.j.a(k4.f571a.f537m, N0.j.f3549c)) {
        }
        yVar = k4.f573c;
        if ((yVar != null || (wVar = yVar.f659b) == null) ? false : wVar.f656a) {
        }
        u uVar222 = k4.f572b;
        N0.g gVar22 = uVar222.f649f;
        if (gVar22 == null) {
        }
        P3 = AbstractC0508a.P(uVar222.f646c, textSize, bVar3);
        if (!Float.isNaN(P3)) {
        }
        i5 = 0;
        oVar = k4.f572b.f647d;
        if (oVar != null) {
        }
        arrayList = new ArrayList(r3.size());
        size = r3.size();
        while (i6 < size) {
        }
        D d72222 = k4.f571a;
        q qVar22222 = d72222.f530f;
        if (qVar22222 == null || d72222.f528d != null || d72222.f527c != null) {
        }
        I i232222 = new I(spannable, 1, bVar622);
        if (arrayList.size() > 1) {
        }
        size2 = r3.size();
        z4 = false;
        while (i8 < size2) {
        }
        if (z4) {
        }
        if (list3.size() > 0) {
        }
        this.f3236h = spannable;
        this.f3237i = new D0.t(spannable, this.f3235g, this.f3240l);
    }

    @Override // C0.t
    public final float a() {
        D0.t tVar = this.f3237i;
        if (!Float.isNaN(tVar.f862e)) {
            return tVar.f862e;
        }
        TextPaint textPaint = tVar.f859b;
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = tVar.f858a;
        lineInstance.setText(new D0.p(charSequence, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, new D0.u(0));
        int i3 = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new R1.i(Integer.valueOf(i3), Integer.valueOf(next)));
            } else {
                R1.i iVar = (R1.i) priorityQueue.peek();
                if (iVar != null && ((Number) iVar.f4151e).intValue() - ((Number) iVar.f4150d).intValue() < next - i3) {
                    priorityQueue.poll();
                    priorityQueue.add(new R1.i(Integer.valueOf(i3), Integer.valueOf(next)));
                }
            }
            i3 = next;
        }
        Iterator it = priorityQueue.iterator();
        float f3 = 0.0f;
        while (it.hasNext()) {
            R1.i iVar2 = (R1.i) it.next();
            f3 = Math.max(f3, Layout.getDesiredWidth(charSequence, ((Number) iVar2.f4150d).intValue(), ((Number) iVar2.f4151e).intValue(), textPaint));
        }
        tVar.f862e = f3;
        return f3;
    }

    @Override // C0.t
    public final boolean b() {
        m mVar = this.f3238j;
        if (!(mVar != null ? mVar.q() : false)) {
            if (this.f3239k) {
                return false;
            }
            y yVar = this.f3230b.f573c;
            Y y3 = h.f3253a;
            Y y4 = h.f3253a;
            W0 w02 = (W0) y4.f334d;
            if (w02 == null) {
                if (m1.i.c()) {
                    w02 = y4.g();
                    y4.f334d = w02;
                } else {
                    w02 = i.f3254a;
                }
            }
            if (!((Boolean) w02.getValue()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @Override // C0.t
    public final float c() {
        return this.f3237i.b();
    }
}
