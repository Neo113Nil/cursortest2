package I0;

import A.J;
import A0.AbstractC0037h;
import A0.C0034e;
import A0.D;
import A0.L;
import A0.t;
import A0.u;
import A0.w;
import A0.y;
import A1.A0;
import B0.s;
import B1.C0097d;
import F0.r;
import G.X0;
import L0.o;
import L0.p;
import L0.q;
import M0.m;
import M0.n;
import Z.AbstractC0319p;
import Z.C0323u;
import Z.K;
import Z.N;
import Z.O;
import Z.S;
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
import b0.AbstractC0497e;
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
import kotlin.text.A;
import u3.l;
import w2.C1294c;

/* loaded from: classes.dex */
public final class c implements t {

    /* renamed from: a, reason: collision with root package name */
    public final String f3345a;

    /* renamed from: b, reason: collision with root package name */
    public final L f3346b;

    /* renamed from: c, reason: collision with root package name */
    public final List f3347c;

    /* renamed from: d, reason: collision with root package name */
    public final List f3348d;

    /* renamed from: e, reason: collision with root package name */
    public final F0.d f3349e;

    /* renamed from: f, reason: collision with root package name */
    public final M0.b f3350f;

    /* renamed from: g, reason: collision with root package name */
    public final e f3351g;

    /* renamed from: h, reason: collision with root package name */
    public final CharSequence f3352h;

    /* renamed from: i, reason: collision with root package name */
    public final s f3353i;

    /* renamed from: j, reason: collision with root package name */
    public C0097d f3354j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f3355k;

    /* renamed from: l, reason: collision with root package name */
    public final int f3356l;

    /* JADX WARN: Code restructure failed: missing block: B:516:0x00b2, code lost:
    
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
    /* JADX WARN: Removed duplicated region for block: B:241:0x0672  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0768  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x08a8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0925  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x00cf  */
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
    /* JADX WARN: Type inference failed for: r8v54, types: [B1.d, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c(String str, L l4, List list, List list2, F0.d dVar, M0.b bVar) {
        Locale locale;
        int i2;
        int i4;
        D d4;
        boolean a4;
        r rVar;
        H0.b bVar2;
        String str2;
        o oVar;
        long j4;
        D d5;
        ?? r32;
        ?? r02;
        float textSize;
        L l5;
        M0.b bVar3;
        boolean z4;
        Spannable spannable;
        y yVar;
        float K3;
        int i5;
        p pVar;
        List list3;
        Object obj;
        ArrayList arrayList;
        int size;
        int i6;
        ArrayList arrayList2;
        D d6;
        Integer[] numArr;
        int i7;
        int size2;
        boolean z5;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        long j5;
        float c4;
        w wVar;
        k1.t tVar;
        int i14;
        k1.r[] rVarArr;
        int i15;
        C0034e c0034e;
        H0.b bVar4;
        Typeface typeface;
        int i16 = 1;
        this.f3345a = str;
        this.f3346b = l4;
        this.f3347c = list;
        this.f3348d = list2;
        this.f3349e = dVar;
        this.f3350f = bVar;
        float e4 = bVar.e();
        e eVar = new e(1);
        ((TextPaint) eVar).density = e4;
        eVar.f3361b = L0.j.f3510b;
        eVar.f3362c = 3;
        eVar.f3363d = O.f4488d;
        this.f3351g = eVar;
        y yVar2 = l4.f305c;
        C1294c c1294c = i.f3372a;
        C1294c c1294c2 = i.f3372a;
        X0 x02 = (X0) c1294c2.f11388d;
        if (x02 == null) {
            if (k1.h.c()) {
                x02 = c1294c2.f();
                c1294c2.f11388d = x02;
            } else {
                x02 = j.f3373a;
            }
        }
        this.f3355k = ((Boolean) x02.getValue()).booleanValue();
        int i17 = l4.f304b.f377b;
        H0.b bVar5 = l4.f303a.f266k;
        if (!L0.k.a(i17, 4)) {
            if (!L0.k.a(i17, 5)) {
                if (L0.k.a(i17, 1)) {
                    i2 = 0;
                } else if (L0.k.a(i17, 2)) {
                    i2 = 1;
                } else {
                    if (!(L0.k.a(i17, 3) ? true : L0.k.a(i17, Integer.MIN_VALUE))) {
                        throw new IllegalStateException("Invalid TextDirection.");
                    }
                    int layoutDirectionFromLocale = TextUtils.getLayoutDirectionFromLocale((bVar5 == null || (locale = ((H0.a) bVar5.f3226d.get(0)).f3224a) == null) ? Locale.getDefault() : locale);
                    if (layoutDirectionFromLocale != 0) {
                    }
                }
                this.f3356l = i2;
                A0 a02 = new A0(i16, this);
                q qVar = l4.f304b.f384i;
                qVar = qVar == null ? q.f3524c : qVar;
                eVar.setFlags(qVar.f3527b ? eVar.getFlags() | 128 : eVar.getFlags() & (-129));
                i4 = qVar.f3526a;
                if (i4 == 1) {
                    eVar.setFlags(eVar.getFlags() | 64);
                    eVar.setHinting(0);
                } else if (i4 == 2) {
                    eVar.getFlags();
                    eVar.setHinting(1);
                } else if (i4 == 3) {
                    eVar.getFlags();
                    eVar.setHinting(0);
                } else {
                    eVar.getFlags();
                }
                d4 = l4.f303a;
                boolean isEmpty = list.isEmpty();
                long b4 = m.b(d4.f257b);
                a4 = n.a(b4, 4294967296L);
                long j6 = d4.f257b;
                if (a4) {
                    eVar.setTextSize(bVar.M(j6));
                } else if (n.a(b4, 8589934592L)) {
                    eVar.setTextSize(m.c(j6) * eVar.getTextSize());
                }
                rVar = d4.f261f;
                if ((rVar != null && d4.f259d == null && d4.f258c == null) ? false : true) {
                    F0.k kVar = d4.f258c;
                    kVar = kVar == null ? F0.k.f2614i : kVar;
                    F0.i iVar = d4.f259d;
                    int i18 = iVar != null ? iVar.f2611a : 0;
                    F0.j jVar = d4.f260e;
                    F0.t b5 = ((F0.e) dVar).b(rVar, kVar, i18, jVar != null ? jVar.f2612a : 1);
                    if (b5 instanceof F0.t) {
                        Object obj2 = b5.f2632d;
                        Intrinsics.d(obj2, "null cannot be cast to non-null type android.graphics.Typeface");
                        typeface = (Typeface) obj2;
                    } else {
                        C0097d c0097d = new C0097d(b5, this.f3354j);
                        this.f3354j = c0097d;
                        Object obj3 = c0097d.f989j;
                        Intrinsics.d(obj3, "null cannot be cast to non-null type android.graphics.Typeface");
                        typeface = (Typeface) obj3;
                    }
                    eVar.setTypeface(typeface);
                }
                bVar2 = d4.f266k;
                if (bVar2 != null) {
                    H0.b bVar6 = H0.b.f3225i;
                    C0097d c0097d2 = H0.c.f3228a;
                    c0097d2.getClass();
                    LocaleList localeList = LocaleList.getDefault();
                    synchronized (((E1.i) c0097d2.f989j)) {
                        try {
                            bVar4 = (H0.b) c0097d2.f988i;
                            if (bVar4 == null || localeList != ((LocaleList) c0097d2.f987e)) {
                                int size3 = localeList.size();
                                ArrayList arrayList3 = new ArrayList(size3);
                                for (int i19 = 0; i19 < size3; i19++) {
                                    arrayList3.add(new H0.a(localeList.get(i19)));
                                }
                                H0.b bVar7 = new H0.b(arrayList3);
                                c0097d2.f987e = localeList;
                                c0097d2.f988i = bVar7;
                                bVar4 = bVar7;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (!bVar2.equals(bVar4)) {
                        J0.a.f3380a.b(eVar, bVar2);
                    }
                }
                str2 = d4.f262g;
                if (str2 != null && !str2.equals("")) {
                    eVar.setFontFeatureSettings(str2);
                }
                oVar = d4.f265j;
                if (oVar != null && !oVar.equals(o.f3518c)) {
                    eVar.setTextScaleX(eVar.getTextScaleX() * oVar.f3519a);
                    eVar.setTextSkewX(eVar.getTextSkewX() + oVar.f3520b);
                }
                L0.n nVar = d4.f256a;
                eVar.d(nVar.b());
                eVar.c(nVar.c(), 9205357640488583168L, nVar.a());
                eVar.f(d4.f269n);
                eVar.g(d4.f268m);
                eVar.e(d4.f271p);
                j4 = d4.f263h;
                if (!n.a(m.b(j4), 4294967296L) && m.c(j4) != 0.0f) {
                    float textScaleX = eVar.getTextScaleX() * eVar.getTextSize();
                    float M3 = bVar.M(j4);
                    if (textScaleX != 0.0f) {
                        eVar.setLetterSpacing(M3 / textScaleX);
                    }
                } else if (n.a(m.b(j4), 8589934592L)) {
                    eVar.setLetterSpacing(m.c(j4));
                }
                boolean z6 = isEmpty && n.a(m.b(j4), 4294967296L) && m.c(j4) != 0.0f;
                long j7 = C0323u.f4547g;
                long j8 = d4.f267l;
                boolean z7 = C0323u.c(j8, j7) && !C0323u.c(j8, C0323u.f4546f);
                L0.a aVar = d4.f264i;
                boolean z8 = aVar == null && Float.compare(aVar.f3493a, 0.0f) != 0;
                d5 = (!z6 || z7 || z8) ? new D(0L, 0L, null, null, null, null, null, z6 ? j4 : m.f3560c, z8 ? aVar : null, null, null, z7 ? j8 : j7, null, null, 63103) : null;
                if (d5 != null) {
                    int size4 = list.size() + 1;
                    r32 = new ArrayList(size4);
                    int i20 = 0;
                    while (i20 < size4) {
                        if (i20 == 0) {
                            c0034e = new C0034e(0, this.f3345a.length(), d5);
                            i15 = 1;
                        } else {
                            i15 = 1;
                            c0034e = (C0034e) this.f3347c.get(i20 - 1);
                        }
                        r32.add(c0034e);
                        i20 += i15;
                    }
                } else {
                    r32 = list;
                }
                r02 = this.f3345a;
                textSize = this.f3351g.getTextSize();
                l5 = this.f3346b;
                List list4 = this.f3348d;
                bVar3 = this.f3350f;
                z4 = this.f3355k;
                a aVar2 = b.f3344a;
                if (z4 || !k1.h.c()) {
                    spannable = r02;
                } else {
                    y yVar3 = l5.f305c;
                    if (yVar3 != null) {
                        w wVar2 = yVar3.f391b;
                    }
                    k1.h a5 = k1.h.a();
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
                        ?? r8 = a5.f7385e.f7377b;
                        r8.getClass();
                        if (r02 instanceof Spannable) {
                            tVar = new k1.t((Spannable) r02);
                        } else if (!(r02 instanceof Spanned) || ((Spanned) r02).nextSpanTransition(-1, length + 1, k1.r.class) > length) {
                            tVar = null;
                        } else {
                            tVar = new k1.t();
                            tVar.f7417a = false;
                            tVar.f7418b = new SpannableString(r02);
                        }
                        if (tVar == null || (rVarArr = (k1.r[]) tVar.f7418b.getSpans(0, length, k1.r.class)) == null || rVarArr.length <= 0) {
                            i14 = 0;
                        } else {
                            int length2 = rVarArr.length;
                            i14 = 0;
                            int i21 = 0;
                            while (i21 < length2) {
                                int i22 = length2;
                                k1.r rVar2 = rVarArr[i21];
                                k1.r[] rVarArr2 = rVarArr;
                                int spanStart = tVar.f7418b.getSpanStart(rVar2);
                                int spanEnd = tVar.f7418b.getSpanEnd(rVar2);
                                if (spanStart != length) {
                                    tVar.removeSpan(rVar2);
                                }
                                i14 = Math.min(spanStart, i14);
                                length = Math.max(spanEnd, length);
                                i21++;
                                rVarArr = rVarArr2;
                                length2 = i22;
                            }
                        }
                        if (i14 != length && i14 < r02.length()) {
                            k1.t tVar2 = (k1.t) r8.A(r02, i14, length, Integer.MAX_VALUE, false, new y.t(tVar, 26, (H1.f) r8.f987e));
                            if (tVar2 != null) {
                                spannable = tVar2.f7418b;
                                Intrinsics.c(spannable);
                            }
                        }
                    }
                    spannable = r02;
                    Intrinsics.c(spannable);
                }
                if (r32.isEmpty() || !list4.isEmpty() || !Intrinsics.a(l5.f304b.f379d, p.f3521c) || !l.m0(l5.f304b.f378c)) {
                    spannable = spannable instanceof Spannable ? spannable : new SpannableString(spannable);
                    if (Intrinsics.a(l5.f303a.f268m, L0.j.f3511c)) {
                        spannable.setSpan(b.f3344a, 0, r02.length(), 33);
                    }
                    yVar = l5.f305c;
                    if ((yVar != null || (wVar = yVar.f391b) == null) ? false : wVar.f388a) {
                        u uVar = l5.f304b;
                        if (uVar.f381f == null) {
                            float K4 = j0.c.K(uVar.f378c, textSize, bVar3);
                            if (!Float.isNaN(K4)) {
                                spannable.setSpan(new D0.g(K4), 0, spannable.length(), 33);
                            }
                            i5 = 0;
                            pVar = l5.f304b.f379d;
                            if (pVar != null) {
                                long k02 = l.k0(i5);
                                long j9 = pVar.f3522a;
                                boolean a6 = m.a(j9, k02);
                                long j10 = pVar.f3523b;
                                obj = k1.r.class;
                                if ((a6 && m.a(j10, l.k0(i5))) || l.m0(j9) || l.m0(j10)) {
                                    list3 = list4;
                                } else {
                                    long b6 = m.b(j9);
                                    list3 = list4;
                                    if (n.a(b6, 4294967296L)) {
                                        c4 = bVar3.M(j9);
                                        j5 = 8589934592L;
                                    } else {
                                        j5 = 8589934592L;
                                        c4 = n.a(b6, 8589934592L) ? m.c(j9) * textSize : 0.0f;
                                    }
                                    long b7 = m.b(j10);
                                    spannable.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(c4), (int) Math.ceil(n.a(b7, 4294967296L) ? bVar3.M(j10) : n.a(b7, j5) ? textSize * m.c(j10) : 0.0f)), 0, spannable.length(), 33);
                                }
                            } else {
                                list3 = list4;
                                obj = k1.r.class;
                            }
                            arrayList = new ArrayList(r32.size());
                            size = r32.size();
                            for (i6 = 0; i6 < size; i6++) {
                                Object obj4 = r32.get(i6);
                                Object obj5 = ((C0034e) obj4).f324a;
                                D d7 = (D) obj5;
                                if (((d7.f261f == null && d7.f259d == null && d7.f258c == null) ? false : true) || ((D) obj5).f260e != null) {
                                    arrayList.add(obj4);
                                }
                            }
                            D d8 = l5.f303a;
                            r rVar3 = d8.f261f;
                            D d9 = ((rVar3 == null || d8.f259d != null || d8.f258c != null) && d8.f260e == null) ? null : new D(0L, 0L, d8.f258c, d8.f259d, d8.f260e, rVar3, null, 0L, null, null, null, 0L, null, null, 65475);
                            J j11 = new J(spannable, 2, a02);
                            if (arrayList.size() > 1) {
                                int size5 = arrayList.size();
                                int i23 = size5 * 2;
                                Integer[] numArr2 = new Integer[i23];
                                for (int i24 = 0; i24 < i23; i24++) {
                                    numArr2[i24] = 0;
                                }
                                int size6 = arrayList.size();
                                for (int i25 = 0; i25 < size6; i25++) {
                                    C0034e c0034e2 = (C0034e) arrayList.get(i25);
                                    numArr2[i25] = Integer.valueOf(c0034e2.f325b);
                                    numArr2[i25 + size5] = Integer.valueOf(c0034e2.f326c);
                                }
                                Integer[] numArr3 = numArr2;
                                Intrinsics.checkNotNullParameter(numArr3, "<this>");
                                if (numArr3.length > 1) {
                                    Arrays.sort(numArr3);
                                }
                                Intrinsics.checkNotNullParameter(numArr2, "<this>");
                                if (i23 == 0) {
                                    throw new NoSuchElementException("Array is empty.");
                                }
                                int intValue = numArr2[0].intValue();
                                int i26 = 0;
                                while (i26 < i23) {
                                    Integer num = numArr2[i26];
                                    int intValue2 = num.intValue();
                                    if (intValue2 == intValue) {
                                        arrayList2 = arrayList;
                                        d6 = d9;
                                        numArr = numArr2;
                                        i7 = 1;
                                    } else {
                                        int size7 = arrayList.size();
                                        D d10 = d9;
                                        int i27 = 0;
                                        while (i27 < size7) {
                                            ArrayList arrayList4 = arrayList;
                                            C0034e c0034e3 = (C0034e) arrayList.get(i27);
                                            D d11 = d9;
                                            int i28 = c0034e3.f325b;
                                            Integer[] numArr4 = numArr2;
                                            int i29 = c0034e3.f326c;
                                            if (i28 != i29 && AbstractC0037h.c(intValue, intValue2, i28, i29)) {
                                                D d12 = (D) c0034e3.f324a;
                                                d10 = d10 != null ? d10.c(d12) : d12;
                                            }
                                            i27++;
                                            arrayList = arrayList4;
                                            d9 = d11;
                                            numArr2 = numArr4;
                                        }
                                        arrayList2 = arrayList;
                                        d6 = d9;
                                        numArr = numArr2;
                                        i7 = 1;
                                        if (d10 != null) {
                                            j11.g(d10, Integer.valueOf(intValue), num);
                                        }
                                        intValue = intValue2;
                                    }
                                    i26 += i7;
                                    arrayList = arrayList2;
                                    d9 = d6;
                                    numArr2 = numArr;
                                }
                            } else if (!arrayList.isEmpty()) {
                                D d13 = (D) ((C0034e) arrayList.get(0)).f324a;
                                j11.g(d9 != null ? d9.c(d13) : d13, Integer.valueOf(((C0034e) arrayList.get(0)).f325b), Integer.valueOf(((C0034e) arrayList.get(0)).f326c));
                            }
                            size2 = r32.size();
                            z5 = false;
                            for (i8 = 0; i8 < size2; i8++) {
                                C0034e c0034e4 = (C0034e) r32.get(i8);
                                int i30 = c0034e4.f325b;
                                if (i30 >= 0 && i30 < spannable.length() && (i11 = c0034e4.f326c) > i30 && i11 <= spannable.length()) {
                                    D d14 = (D) c0034e4.f324a;
                                    L0.a aVar3 = d14.f264i;
                                    int i31 = c0034e4.f325b;
                                    int i32 = c0034e4.f326c;
                                    if (aVar3 != null) {
                                        spannable.setSpan(new D0.a(aVar3.f3493a, 0), i31, i32, 33);
                                    }
                                    L0.n nVar2 = d14.f256a;
                                    j0.c.M(spannable, nVar2.b(), i31, i32);
                                    AbstractC0319p c5 = nVar2.c();
                                    float a7 = nVar2.a();
                                    if (c5 != null) {
                                        if (c5 instanceof S) {
                                            j0.c.M(spannable, ((S) c5).f4508a, i31, i32);
                                        } else {
                                            spannable.setSpan(new K0.b((N) c5, a7), i31, i32, 33);
                                        }
                                    }
                                    L0.j jVar2 = d14.f268m;
                                    if (jVar2 != null) {
                                        int i33 = jVar2.f3513a;
                                        spannable.setSpan(new D0.k((i33 | 1) == i33, (i33 | 2) == i33), i31, i32, 33);
                                    }
                                    j0.c.N(spannable, d14.f257b, bVar3, i31, i32);
                                    String str3 = d14.f262g;
                                    if (str3 != null) {
                                        D0.b bVar8 = new D0.b(0, str3);
                                        i12 = 33;
                                        spannable.setSpan(bVar8, i31, i32, 33);
                                    } else {
                                        i12 = 33;
                                    }
                                    o oVar2 = d14.f265j;
                                    if (oVar2 != null) {
                                        spannable.setSpan(new ScaleXSpan(oVar2.f3519a), i31, i32, i12);
                                        spannable.setSpan(new D0.a(oVar2.f3520b, 1), i31, i32, i12);
                                    }
                                    H0.b bVar9 = d14.f266k;
                                    if (bVar9 != null) {
                                        spannable.setSpan(J0.a.f3380a.a(bVar9), i31, i32, i12);
                                    }
                                    long j12 = d14.f267l;
                                    if (j12 != 16) {
                                        spannable.setSpan(new BackgroundColorSpan(K.D(j12)), i31, i32, 33);
                                    }
                                    O o4 = d14.f269n;
                                    if (o4 != null) {
                                        int D3 = K.D(o4.f4489a);
                                        long j13 = o4.f4490b;
                                        float d15 = Y.c.d(j13);
                                        float e5 = Y.c.e(j13);
                                        float f4 = o4.f4491c;
                                        D0.j jVar3 = new D0.j(D3, d15, e5, f4 == 0.0f ? Float.MIN_VALUE : f4);
                                        i13 = 33;
                                        spannable.setSpan(jVar3, i31, i32, 33);
                                    } else {
                                        i13 = 33;
                                    }
                                    AbstractC0497e abstractC0497e = d14.f271p;
                                    if (abstractC0497e != null) {
                                        spannable.setSpan(new K0.a(abstractC0497e), i31, i32, i13);
                                    }
                                    if (n.a(m.b(d14.f263h), 4294967296L) || n.a(m.b(d14.f263h), 8589934592L)) {
                                        z5 = true;
                                    }
                                }
                            }
                            if (z5) {
                                int size8 = r32.size();
                                int i34 = 0;
                                while (i34 < size8) {
                                    C0034e c0034e5 = (C0034e) r32.get(i34);
                                    int i35 = c0034e5.f325b;
                                    D d16 = (D) c0034e5.f324a;
                                    if (i35 >= 0 && i35 < spannable.length() && (i10 = c0034e5.f326c) > i35) {
                                        if (i10 > spannable.length()) {
                                            i9 = 1;
                                            i34 += i9;
                                        } else {
                                            long j14 = d16.f263h;
                                            long b8 = m.b(j14);
                                            Object fVar = n.a(b8, 4294967296L) ? new D0.f(bVar3.M(j14)) : n.a(b8, 8589934592L) ? new D0.e(m.c(j14)) : null;
                                            if (fVar != null) {
                                                spannable.setSpan(fVar, i35, i10, 33);
                                            }
                                        }
                                    }
                                    i9 = 1;
                                    i34 += i9;
                                }
                            }
                            if (list3.size() > 0) {
                                C0034e c0034e6 = (C0034e) list3.get(0);
                                if (c0034e6.f324a != null) {
                                    throw new ClassCastException();
                                }
                                for (Object obj6 : spannable.getSpans(c0034e6.f325b, c0034e6.f326c, obj)) {
                                    spannable.removeSpan((k1.r) obj6);
                                }
                                throw null;
                            }
                        }
                    }
                    u uVar2 = l5.f304b;
                    L0.g gVar = uVar2.f381f;
                    gVar = gVar == null ? L0.g.f3503c : gVar;
                    K3 = j0.c.K(uVar2.f378c, textSize, bVar3);
                    if (!Float.isNaN(K3)) {
                        int length3 = (spannable.length() == 0 || A.O(spannable) == '\n') ? spannable.length() + 1 : spannable.length();
                        int i36 = gVar.f3505b;
                        i5 = 0;
                        spannable.setSpan(new D0.h(K3, length3, (i36 & 1) > 0, (i36 & 16) > 0, gVar.f3504a), 0, spannable.length(), 33);
                        pVar = l5.f304b.f379d;
                        if (pVar != null) {
                        }
                        arrayList = new ArrayList(r32.size());
                        size = r32.size();
                        while (i6 < size) {
                        }
                        D d82 = l5.f303a;
                        r rVar32 = d82.f261f;
                        if (rVar32 == null || d82.f259d != null || d82.f258c != null) {
                        }
                        J j112 = new J(spannable, 2, a02);
                        if (arrayList.size() > 1) {
                        }
                        size2 = r32.size();
                        z5 = false;
                        while (i8 < size2) {
                        }
                        if (z5) {
                        }
                        if (list3.size() > 0) {
                        }
                    }
                    i5 = 0;
                    pVar = l5.f304b.f379d;
                    if (pVar != null) {
                    }
                    arrayList = new ArrayList(r32.size());
                    size = r32.size();
                    while (i6 < size) {
                    }
                    D d822 = l5.f303a;
                    r rVar322 = d822.f261f;
                    if (rVar322 == null || d822.f259d != null || d822.f258c != null) {
                    }
                    J j1122 = new J(spannable, 2, a02);
                    if (arrayList.size() > 1) {
                    }
                    size2 = r32.size();
                    z5 = false;
                    while (i8 < size2) {
                    }
                    if (z5) {
                    }
                    if (list3.size() > 0) {
                    }
                }
                this.f3352h = spannable;
                this.f3353i = new s(spannable, this.f3351g, this.f3356l);
            }
            i2 = 3;
            this.f3356l = i2;
            A0 a022 = new A0(i16, this);
            q qVar2 = l4.f304b.f384i;
            if (qVar2 == null) {
            }
            eVar.setFlags(qVar2.f3527b ? eVar.getFlags() | 128 : eVar.getFlags() & (-129));
            i4 = qVar2.f3526a;
            if (i4 == 1) {
            }
            d4 = l4.f303a;
            boolean isEmpty2 = list.isEmpty();
            long b42 = m.b(d4.f257b);
            a4 = n.a(b42, 4294967296L);
            long j62 = d4.f257b;
            if (a4) {
            }
            rVar = d4.f261f;
            if ((rVar != null && d4.f259d == null && d4.f258c == null) ? false : true) {
            }
            bVar2 = d4.f266k;
            if (bVar2 != null) {
            }
            str2 = d4.f262g;
            if (str2 != null) {
                eVar.setFontFeatureSettings(str2);
            }
            oVar = d4.f265j;
            if (oVar != null) {
                eVar.setTextScaleX(eVar.getTextScaleX() * oVar.f3519a);
                eVar.setTextSkewX(eVar.getTextSkewX() + oVar.f3520b);
            }
            L0.n nVar3 = d4.f256a;
            eVar.d(nVar3.b());
            eVar.c(nVar3.c(), 9205357640488583168L, nVar3.a());
            eVar.f(d4.f269n);
            eVar.g(d4.f268m);
            eVar.e(d4.f271p);
            j4 = d4.f263h;
            if (!n.a(m.b(j4), 4294967296L)) {
            }
            if (n.a(m.b(j4), 8589934592L)) {
            }
            if (isEmpty2) {
            }
            long j72 = C0323u.f4547g;
            long j82 = d4.f267l;
            if (C0323u.c(j82, j72)) {
            }
            L0.a aVar4 = d4.f264i;
            if (aVar4 == null) {
            }
            if (z6) {
            }
            if (d5 != null) {
            }
            r02 = this.f3345a;
            textSize = this.f3351g.getTextSize();
            l5 = this.f3346b;
            List list42 = this.f3348d;
            bVar3 = this.f3350f;
            z4 = this.f3355k;
            a aVar22 = b.f3344a;
            if (z4) {
            }
            spannable = r02;
            if (r32.isEmpty()) {
            }
            if (spannable instanceof Spannable) {
            }
            if (Intrinsics.a(l5.f303a.f268m, L0.j.f3511c)) {
            }
            yVar = l5.f305c;
            if ((yVar != null || (wVar = yVar.f391b) == null) ? false : wVar.f388a) {
            }
            u uVar22 = l5.f304b;
            L0.g gVar2 = uVar22.f381f;
            if (gVar2 == null) {
            }
            K3 = j0.c.K(uVar22.f378c, textSize, bVar3);
            if (!Float.isNaN(K3)) {
            }
            i5 = 0;
            pVar = l5.f304b.f379d;
            if (pVar != null) {
            }
            arrayList = new ArrayList(r32.size());
            size = r32.size();
            while (i6 < size) {
            }
            D d8222 = l5.f303a;
            r rVar3222 = d8222.f261f;
            if (rVar3222 == null || d8222.f259d != null || d8222.f258c != null) {
            }
            J j11222 = new J(spannable, 2, a022);
            if (arrayList.size() > 1) {
            }
            size2 = r32.size();
            z5 = false;
            while (i8 < size2) {
            }
            if (z5) {
            }
            if (list3.size() > 0) {
            }
            this.f3352h = spannable;
            this.f3353i = new s(spannable, this.f3351g, this.f3356l);
        }
        i2 = 2;
        this.f3356l = i2;
        A0 a0222 = new A0(i16, this);
        q qVar22 = l4.f304b.f384i;
        if (qVar22 == null) {
        }
        eVar.setFlags(qVar22.f3527b ? eVar.getFlags() | 128 : eVar.getFlags() & (-129));
        i4 = qVar22.f3526a;
        if (i4 == 1) {
        }
        d4 = l4.f303a;
        boolean isEmpty22 = list.isEmpty();
        long b422 = m.b(d4.f257b);
        a4 = n.a(b422, 4294967296L);
        long j622 = d4.f257b;
        if (a4) {
        }
        rVar = d4.f261f;
        if ((rVar != null && d4.f259d == null && d4.f258c == null) ? false : true) {
        }
        bVar2 = d4.f266k;
        if (bVar2 != null) {
        }
        str2 = d4.f262g;
        if (str2 != null) {
        }
        oVar = d4.f265j;
        if (oVar != null) {
        }
        L0.n nVar32 = d4.f256a;
        eVar.d(nVar32.b());
        eVar.c(nVar32.c(), 9205357640488583168L, nVar32.a());
        eVar.f(d4.f269n);
        eVar.g(d4.f268m);
        eVar.e(d4.f271p);
        j4 = d4.f263h;
        if (!n.a(m.b(j4), 4294967296L)) {
        }
        if (n.a(m.b(j4), 8589934592L)) {
        }
        if (isEmpty22) {
        }
        long j722 = C0323u.f4547g;
        long j822 = d4.f267l;
        if (C0323u.c(j822, j722)) {
        }
        L0.a aVar42 = d4.f264i;
        if (aVar42 == null) {
        }
        if (z6) {
        }
        if (d5 != null) {
        }
        r02 = this.f3345a;
        textSize = this.f3351g.getTextSize();
        l5 = this.f3346b;
        List list422 = this.f3348d;
        bVar3 = this.f3350f;
        z4 = this.f3355k;
        a aVar222 = b.f3344a;
        if (z4) {
        }
        spannable = r02;
        if (r32.isEmpty()) {
        }
        if (spannable instanceof Spannable) {
        }
        if (Intrinsics.a(l5.f303a.f268m, L0.j.f3511c)) {
        }
        yVar = l5.f305c;
        if ((yVar != null || (wVar = yVar.f391b) == null) ? false : wVar.f388a) {
        }
        u uVar222 = l5.f304b;
        L0.g gVar22 = uVar222.f381f;
        if (gVar22 == null) {
        }
        K3 = j0.c.K(uVar222.f378c, textSize, bVar3);
        if (!Float.isNaN(K3)) {
        }
        i5 = 0;
        pVar = l5.f304b.f379d;
        if (pVar != null) {
        }
        arrayList = new ArrayList(r32.size());
        size = r32.size();
        while (i6 < size) {
        }
        D d82222 = l5.f303a;
        r rVar32222 = d82222.f261f;
        if (rVar32222 == null || d82222.f259d != null || d82222.f258c != null) {
        }
        J j112222 = new J(spannable, 2, a0222);
        if (arrayList.size() > 1) {
        }
        size2 = r32.size();
        z5 = false;
        while (i8 < size2) {
        }
        if (z5) {
        }
        if (list3.size() > 0) {
        }
        this.f3352h = spannable;
        this.f3353i = new s(spannable, this.f3351g, this.f3356l);
    }

    @Override // A0.t
    public final float a() {
        s sVar = this.f3353i;
        if (!Float.isNaN(sVar.f940e)) {
            return sVar.f940e;
        }
        TextPaint textPaint = sVar.f937b;
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = sVar.f936a;
        lineInstance.setText(new B0.o(charSequence, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, new B0.t(0));
        int i2 = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new Pair(Integer.valueOf(i2), Integer.valueOf(next)));
            } else {
                Pair pair = (Pair) priorityQueue.peek();
                if (pair != null && ((Number) pair.f7486e).intValue() - ((Number) pair.f7485d).intValue() < next - i2) {
                    priorityQueue.poll();
                    priorityQueue.add(new Pair(Integer.valueOf(i2), Integer.valueOf(next)));
                }
            }
            i2 = next;
        }
        Iterator it = priorityQueue.iterator();
        float f4 = 0.0f;
        while (it.hasNext()) {
            Pair pair2 = (Pair) it.next();
            f4 = Math.max(f4, Layout.getDesiredWidth(charSequence, ((Number) pair2.f7485d).intValue(), ((Number) pair2.f7486e).intValue(), textPaint));
        }
        sVar.f940e = f4;
        return f4;
    }

    @Override // A0.t
    public final boolean b() {
        C0097d c0097d = this.f3354j;
        if (!(c0097d != null ? c0097d.w() : false)) {
            if (this.f3355k) {
                return false;
            }
            y yVar = this.f3346b.f305c;
            C1294c c1294c = i.f3372a;
            C1294c c1294c2 = i.f3372a;
            X0 x02 = (X0) c1294c2.f11388d;
            if (x02 == null) {
                if (k1.h.c()) {
                    x02 = c1294c2.f();
                    c1294c2.f11388d = x02;
                } else {
                    x02 = j.f3373a;
                }
            }
            if (!((Boolean) x02.getValue()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @Override // A0.t
    public final float c() {
        return this.f3353i.b();
    }
}
