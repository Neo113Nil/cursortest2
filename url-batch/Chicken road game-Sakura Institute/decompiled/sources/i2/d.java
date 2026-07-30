package i2;

import a0.j0;
import a2.d0;
import a2.k0;
import a2.t;
import a2.w;
import a2.y;
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
import b2.r;
import f2.q;
import f2.s;
import g0.m2;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import l2.m;
import l2.n;
import l2.o;
import l2.p;
import z0.l0;
import z0.o0;
import z0.r0;
import z0.u;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d implements t {

    /* renamed from: a, reason: collision with root package name */
    public final String f4859a;

    /* renamed from: b, reason: collision with root package name */
    public final k0 f4860b;

    /* renamed from: c, reason: collision with root package name */
    public final List f4861c;

    /* renamed from: d, reason: collision with root package name */
    public final List f4862d;

    /* renamed from: e, reason: collision with root package name */
    public final f2.d f4863e;

    /* renamed from: f, reason: collision with root package name */
    public final m2.b f4864f;

    /* renamed from: g, reason: collision with root package name */
    public final e f4865g;

    /* renamed from: h, reason: collision with root package name */
    public final CharSequence f4866h;

    /* renamed from: i, reason: collision with root package name */
    public final r f4867i;

    /* renamed from: j, reason: collision with root package name */
    public b1.b f4868j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f4869k;

    /* renamed from: l, reason: collision with root package name */
    public final int f4870l;

    /* JADX WARN: Code restructure failed: missing block: B:160:0x048d, code lost:
    
        if (r4.a.L(r4.f413b.f452c) == false) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x0099, code lost:
    
        if (r8 == 1) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x05f2  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0672  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0763  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x08a9  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0923  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x094d  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x033a  */
    /* JADX WARN: Type inference failed for: r0v111, types: [android.text.Spannable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v0, types: [i2.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [a2.d0] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d(String str, k0 k0Var, List list, List list2, f2.d dVar, m2.b bVar) {
        Locale locale;
        int i7;
        int i8;
        d0 d0Var;
        String str2;
        h2.b bVar2;
        n nVar;
        long j8;
        long b9;
        q qVar;
        s b10;
        Typeface typeface;
        long j9;
        d0 d0Var2;
        ?? r32;
        ?? r02;
        k0 k0Var2;
        List list3;
        boolean z8;
        String str3;
        float f9;
        Throwable th;
        CharSequence charSequence;
        y yVar;
        float N;
        int i9;
        o oVar;
        ArrayList arrayList;
        int size;
        int i10;
        d0 d0Var3;
        ArrayList arrayList2;
        int i11;
        Integer[] numArr;
        int size2;
        int i12;
        boolean z9;
        int i13;
        int i14;
        int i15;
        boolean z10;
        m2.b bVar3;
        int i16;
        int i17;
        w wVar;
        int i18;
        l3.y yVar2;
        int i19;
        l3.w[] wVarArr;
        h2.b bVar4;
        ?? obj = new Object();
        obj.f4859a = str;
        obj.f4860b = k0Var;
        obj.f4861c = list;
        obj.f4862d = list2;
        obj.f4863e = dVar;
        obj.f4864f = bVar;
        float a3 = bVar.a();
        e eVar = new e(1);
        ((TextPaint) eVar).density = a3;
        eVar.f4872b = l2.j.f5877b;
        eVar.f4873c = 3;
        eVar.f4874d = o0.f10030d;
        obj.f4865g = eVar;
        y yVar3 = k0Var.f414c;
        b6.c cVar = i.f4883a;
        b6.c cVar2 = i.f4883a;
        m2 m2Var = (m2) cVar2.f1394g;
        if (m2Var == null) {
            if (l3.k.c()) {
                m2Var = cVar2.q();
                cVar2.f1394g = m2Var;
            } else {
                m2Var = j.f4884a;
            }
        }
        obj.f4869k = ((Boolean) m2Var.getValue()).booleanValue();
        int i20 = k0Var.f413b.f451b;
        h2.b bVar5 = k0Var.f412a.f357k;
        if (i20 != 4) {
            if (i20 != 5) {
                if (i20 == 1) {
                    i7 = 0;
                } else if (i20 == 2) {
                    i7 = 1;
                } else {
                    if (i20 != 3 && i20 != Integer.MIN_VALUE) {
                        throw new IllegalStateException("Invalid TextDirection.");
                    }
                    int layoutDirectionFromLocale = TextUtils.getLayoutDirectionFromLocale((bVar5 == null || (locale = ((h2.a) bVar5.f4644f.get(0)).f4642a) == null) ? Locale.getDefault() : locale);
                    if (layoutDirectionFromLocale != 0) {
                    }
                }
                obj.f4870l = i7;
                c cVar3 = new c(0, obj);
                p pVar = k0Var.f413b.f458i;
                pVar = pVar == null ? p.f5889c : pVar;
                eVar.setFlags(pVar.f5892b ? eVar.getFlags() | 128 : eVar.getFlags() & (-129));
                i8 = pVar.f5891a;
                if (i8 == 1) {
                    eVar.setFlags(eVar.getFlags() | 64);
                    eVar.setHinting(0);
                } else if (i8 == 2) {
                    eVar.getFlags();
                    eVar.setHinting(1);
                } else if (i8 == 3) {
                    eVar.getFlags();
                    eVar.setHinting(0);
                } else {
                    eVar.getFlags();
                }
                d0Var = k0Var.f412a;
                boolean isEmpty = list.isEmpty();
                long j10 = d0Var.f348b;
                str2 = d0Var.f353g;
                bVar2 = d0Var.f357k;
                m mVar = d0Var.f347a;
                nVar = d0Var.f356j;
                j8 = d0Var.f354h;
                b9 = m2.m.b(j10);
                if (m2.n.a(b9, 4294967296L)) {
                    eVar.setTextSize(bVar.X(j10));
                } else if (m2.n.a(b9, 8589934592L)) {
                    eVar.setTextSize(m2.m.c(j10) * eVar.getTextSize());
                }
                qVar = d0Var.f352f;
                if (qVar == null || d0Var.f350d != null || d0Var.f349c != null) {
                    f2.k kVar = d0Var.f349c;
                    kVar = kVar == null ? f2.k.f3278h : kVar;
                    f2.i iVar = d0Var.f350d;
                    int i21 = iVar != null ? iVar.f3275a : 0;
                    f2.j jVar = d0Var.f351e;
                    b10 = ((f2.e) dVar).b(qVar, kVar, i21, jVar != null ? jVar.f3276a : 1);
                    if (b10 instanceof s) {
                        Object obj2 = b10.f3290f;
                        r6.k.d(obj2, "null cannot be cast to non-null type android.graphics.Typeface");
                        typeface = (Typeface) obj2;
                    } else {
                        b1.b bVar6 = new b1.b(b10, obj.f4868j);
                        obj.f4868j = bVar6;
                        Object obj3 = bVar6.f1232i;
                        r6.k.d(obj3, "null cannot be cast to non-null type android.graphics.Typeface");
                        typeface = (Typeface) obj3;
                    }
                    eVar.setTypeface(typeface);
                }
                if (bVar2 != null) {
                    h2.b bVar7 = h2.b.f4643h;
                    b1.b bVar8 = h2.c.f4646a;
                    bVar8.getClass();
                    LocaleList localeList = LocaleList.getDefault();
                    synchronized (((m4.f) bVar8.f1232i)) {
                        try {
                            bVar4 = (h2.b) bVar8.f1231h;
                            if (bVar4 == null || localeList != ((LocaleList) bVar8.f1230g)) {
                                int size3 = localeList.size();
                                ArrayList arrayList3 = new ArrayList(size3);
                                for (int i22 = 0; i22 < size3; i22++) {
                                    arrayList3.add(new h2.a(localeList.get(i22)));
                                }
                                bVar4 = new h2.b(arrayList3);
                                bVar8.f1230g = localeList;
                                bVar8.f1231h = bVar4;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    if (!bVar2.equals(bVar4)) {
                        j2.a.f4992a.b(eVar, bVar2);
                    }
                }
                if (str2 != null && !str2.equals("")) {
                    eVar.setFontFeatureSettings(str2);
                }
                if (nVar != null && !nVar.equals(n.f5883c)) {
                    eVar.setTextScaleX(eVar.getTextScaleX() * nVar.f5884a);
                    eVar.setTextSkewX(eVar.getTextSkewX() + nVar.f5885b);
                }
                eVar.d(mVar.b());
                eVar.c(mVar.c(), 9205357640488583168L, mVar.a());
                eVar.f(d0Var.f360n);
                eVar.g(d0Var.f359m);
                eVar.e(d0Var.f362p);
                if (m2.n.a(m2.m.b(j8), 4294967296L) || m2.m.c(j8) == 0.0f) {
                    j9 = j8;
                    if (m2.n.a(m2.m.b(j9), 8589934592L)) {
                        eVar.setLetterSpacing(m2.m.c(j9));
                    }
                } else {
                    float textScaleX = eVar.getTextScaleX() * eVar.getTextSize();
                    j9 = j8;
                    float X = bVar.X(j9);
                    if (textScaleX != 0.0f) {
                        eVar.setLetterSpacing(X / textScaleX);
                    }
                }
                long j11 = d0Var.f358l;
                l2.a aVar = d0Var.f355i;
                boolean z11 = isEmpty && m2.n.a(m2.m.b(j9), 4294967296L) && m2.m.c(j9) != 0.0f;
                long j12 = u.f10057g;
                boolean z12 = u.c(j11, j12) && !u.c(j11, u.f10056f);
                boolean z13 = aVar == null && Float.compare(aVar.f5860a, 0.0f) != 0;
                d0Var2 = (!z11 || z12 || z13) ? new d0(0L, 0L, (f2.k) null, (f2.i) null, (f2.j) null, (q) null, (String) null, z11 ? j9 : m2.m.f6327c, z13 ? aVar : null, (n) null, (h2.b) null, z12 ? j11 : j12, (l2.j) null, (o0) null, 63103) : null;
                if (d0Var2 != null) {
                    int size4 = list.size() + 1;
                    r32 = new ArrayList(size4);
                    int i23 = 0;
                    while (i23 < size4) {
                        r32.add(i23 == 0 ? new a2.e(0, obj.f4859a.length(), d0Var2) : (a2.e) obj.f4861c.get(i23 - 1));
                        i23++;
                    }
                } else {
                    r32 = list;
                }
                r02 = obj.f4859a;
                float textSize = obj.f4865g.getTextSize();
                k0Var2 = obj.f4860b;
                list3 = obj.f4862d;
                m2.b bVar9 = obj.f4864f;
                z8 = obj.f4869k;
                a aVar2 = b.f4856a;
                if (z8 || !l3.k.c()) {
                    str3 = r02;
                    f9 = 0.0f;
                    th = null;
                    charSequence = str3;
                } else {
                    y yVar4 = k0Var2.f414c;
                    if (yVar4 != null) {
                        w wVar2 = yVar4.f465b;
                    }
                    l3.k a9 = l3.k.a();
                    int length = r02.length();
                    if (!(a9.b() == 1)) {
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
                    if (r02.length() == 0 || length == 0) {
                        str3 = r02;
                        f9 = 0.0f;
                        th = null;
                    } else {
                        b1.b bVar10 = a9.f5912e.f5898b;
                        bVar10.getClass();
                        if (r02 instanceof Spannable) {
                            yVar2 = new l3.y((Spannable) r02);
                            i18 = 0;
                        } else if (!(r02 instanceof Spanned) || ((Spanned) r02).nextSpanTransition(-1, length + 1, l3.w.class) > length) {
                            i18 = 0;
                            yVar2 = null;
                        } else {
                            yVar2 = new l3.y();
                            i18 = 0;
                            yVar2.f5945f = false;
                            yVar2.f5946g = new SpannableString(r02);
                        }
                        if (yVar2 == null || (wVarArr = (l3.w[]) yVar2.f5946g.getSpans(i18, length, l3.w.class)) == null || wVarArr.length <= 0) {
                            str3 = r02;
                            f9 = 0.0f;
                            th = null;
                            i19 = 0;
                        } else {
                            int length2 = wVarArr.length;
                            f9 = 0.0f;
                            i19 = 0;
                            int i24 = 0;
                            String str4 = r02;
                            while (i24 < length2) {
                                l3.w wVar3 = wVarArr[i24];
                                String str5 = str4;
                                int spanStart = yVar2.f5946g.getSpanStart(wVar3);
                                int i25 = length2;
                                int spanEnd = yVar2.f5946g.getSpanEnd(wVar3);
                                if (spanStart != length) {
                                    yVar2.removeSpan(wVar3);
                                }
                                i19 = Math.min(spanStart, i19);
                                length = Math.max(spanEnd, length);
                                i24++;
                                length2 = i25;
                                str4 = str5;
                            }
                            str3 = str4;
                            th = null;
                        }
                        if (i19 != length && i19 < str3.length()) {
                            l3.y yVar5 = (l3.y) bVar10.x(str3, i19, length, Integer.MAX_VALUE, false, new androidx.room.c(yVar2, 14, (m4.f) bVar10.f1230g));
                            if (yVar5 != null) {
                                charSequence = yVar5.f5946g;
                                r6.k.c(charSequence);
                            }
                        }
                    }
                    charSequence = str3;
                    r6.k.c(charSequence);
                }
                d dVar2 = (r32.isEmpty() && list3.isEmpty() && r6.k.a(k0Var2.f413b.f453d, o.f5886c)) ? obj : dVar2;
                SpannableString spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
                if (r6.k.a(k0Var2.f412a.f359m, l2.j.f5878c)) {
                    spannableString.setSpan(b.f4856a, 0, str3.length(), 33);
                }
                yVar = k0Var2.f414c;
                if ((yVar != null || (wVar = yVar.f465b) == null) ? false : wVar.f462a) {
                    a2.u uVar = k0Var2.f413b;
                    if (uVar.f455f == null) {
                        float N2 = t6.a.N(uVar.f452c, textSize, bVar9);
                        if (!Float.isNaN(N2)) {
                            spannableString.setSpan(new d2.g(N2), 0, spannableString.length(), 33);
                        }
                        i9 = 0;
                        oVar = k0Var2.f413b.f453d;
                        if (oVar != null) {
                            long j13 = oVar.f5888b;
                            long j14 = oVar.f5887a;
                            SpannableString spannableString2 = spannableString;
                            if ((m2.m.a(j14, r4.a.I(i9)) && m2.m.a(j13, r4.a.I(i9))) || r4.a.L(j14) || r4.a.L(j13)) {
                                spannableString = spannableString2;
                            } else {
                                long b11 = m2.m.b(j14);
                                float X2 = m2.n.a(b11, 4294967296L) ? bVar9.X(j14) : m2.n.a(b11, 8589934592L) ? m2.m.c(j14) * textSize : f9;
                                long b12 = m2.m.b(j13);
                                spannableString = spannableString2;
                                spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(X2), (int) Math.ceil(m2.n.a(b12, 4294967296L) ? bVar9.X(j13) : m2.n.a(b12, 8589934592L) ? m2.m.c(j13) * textSize : f9)), 0, spannableString2.length(), 33);
                            }
                        }
                        arrayList = new ArrayList(r32.size());
                        size = r32.size();
                        for (i10 = 0; i10 < size; i10++) {
                            Object obj4 = r32.get(i10);
                            Object obj5 = ((a2.e) obj4).f363a;
                            d0 d0Var4 = (d0) obj5;
                            if (((d0Var4.f352f == null && d0Var4.f350d == null && d0Var4.f349c == null) ? false : true) || ((d0) obj5).f351e != null) {
                                arrayList.add(obj4);
                            }
                        }
                        d0 d0Var5 = k0Var2.f412a;
                        q qVar2 = d0Var5.f352f;
                        ?? d0Var6 = ((qVar2 == null || d0Var5.f350d != null || d0Var5.f349c != null) && d0Var5.f351e == null) ? th : new d0(0L, 0L, d0Var5.f349c, d0Var5.f350d, d0Var5.f351e, qVar2, (String) null, 0L, (l2.a) null, (n) null, (h2.b) null, 0L, (l2.j) null, (o0) null, 65475);
                        j0 j0Var = new j0(spannableString, 1, cVar3);
                        if (arrayList.size() > 1) {
                            int size5 = arrayList.size();
                            int i26 = size5 * 2;
                            Integer[] numArr2 = new Integer[i26];
                            for (int i27 = 0; i27 < i26; i27++) {
                                numArr2[i27] = 0;
                            }
                            int size6 = arrayList.size();
                            for (int i28 = 0; i28 < size6; i28++) {
                                a2.e eVar2 = (a2.e) arrayList.get(i28);
                                numArr2[i28] = Integer.valueOf(eVar2.f364b);
                                numArr2[i28 + size5] = Integer.valueOf(eVar2.f365c);
                            }
                            Integer[] numArr3 = numArr2;
                            if (numArr3.length > 1) {
                                Arrays.sort(numArr3);
                            }
                            if (i26 == 0) {
                                throw new NoSuchElementException("Array is empty.");
                            }
                            int intValue = numArr2[0].intValue();
                            int i29 = 0;
                            d0 d0Var7 = d0Var6;
                            while (i29 < i26) {
                                Integer num = numArr2[i29];
                                int intValue2 = num.intValue();
                                if (intValue2 == intValue) {
                                    arrayList2 = arrayList;
                                    d0Var3 = d0Var7;
                                    i11 = i26;
                                    numArr = numArr2;
                                } else {
                                    int size7 = arrayList.size();
                                    d0Var3 = d0Var7;
                                    int i30 = 0;
                                    d0 d0Var8 = d0Var7;
                                    while (i30 < size7) {
                                        ArrayList arrayList4 = arrayList;
                                        a2.e eVar3 = (a2.e) arrayList.get(i30);
                                        int i31 = i26;
                                        int i32 = eVar3.f364b;
                                        Integer[] numArr4 = numArr2;
                                        int i33 = eVar3.f365c;
                                        if (i32 != i33 && a2.h.c(intValue, intValue2, i32, i33)) {
                                            d0 d0Var9 = (d0) eVar3.f363a;
                                            d0Var8 = d0Var8 != null ? d0Var8.c(d0Var9) : d0Var9;
                                        }
                                        i30++;
                                        arrayList = arrayList4;
                                        i26 = i31;
                                        numArr2 = numArr4;
                                        d0Var8 = d0Var8;
                                    }
                                    arrayList2 = arrayList;
                                    i11 = i26;
                                    numArr = numArr2;
                                    if (d0Var8 != null) {
                                        j0Var.c(d0Var8, Integer.valueOf(intValue), num);
                                    }
                                    intValue = intValue2;
                                }
                                i29++;
                                d0Var7 = d0Var3;
                                arrayList = arrayList2;
                                i26 = i11;
                                numArr2 = numArr;
                            }
                        } else if (!arrayList.isEmpty()) {
                            d0 d0Var10 = (d0) ((a2.e) arrayList.get(0)).f363a;
                            j0Var.c(d0Var6 != 0 ? d0Var6.c(d0Var10) : d0Var10, Integer.valueOf(((a2.e) arrayList.get(0)).f364b), Integer.valueOf(((a2.e) arrayList.get(0)).f365c));
                        }
                        size2 = r32.size();
                        i12 = 0;
                        z9 = false;
                        while (i12 < size2) {
                            a2.e eVar4 = (a2.e) r32.get(i12);
                            int i34 = eVar4.f364b;
                            Object obj6 = eVar4.f363a;
                            int i35 = eVar4.f365c;
                            if (i34 < 0 || i34 >= spannableString.length() || i35 <= i34 || i35 > spannableString.length()) {
                                i14 = size2;
                                i15 = i12;
                                z10 = z9;
                                bVar3 = bVar9;
                            } else {
                                int i36 = eVar4.f364b;
                                int i37 = eVar4.f365c;
                                d0 d0Var11 = (d0) obj6;
                                l2.a aVar3 = d0Var11.f355i;
                                m mVar2 = d0Var11.f347a;
                                if (aVar3 != null) {
                                    spannableString.setSpan(new d2.a(aVar3.f5860a, 0), i36, i37, 33);
                                }
                                i14 = size2;
                                i15 = i12;
                                t6.a.Q(spannableString, mVar2.b(), i36, i37);
                                z0.p c4 = mVar2.c();
                                float a10 = mVar2.a();
                                if (c4 != null) {
                                    if (c4 instanceof r0) {
                                        t6.a.Q(spannableString, ((r0) c4).f10045a, i36, i37);
                                    } else {
                                        spannableString.setSpan(new k2.b((z0.q) c4, a10), i36, i37, 33);
                                    }
                                }
                                l2.j jVar2 = d0Var11.f359m;
                                if (jVar2 != null) {
                                    int i38 = jVar2.f5880a;
                                    d2.k kVar2 = new d2.k((i38 | 1) == i38, (i38 | 2) == i38);
                                    i16 = 33;
                                    spannableString.setSpan(kVar2, i36, i37, 33);
                                } else {
                                    i16 = 33;
                                }
                                t6.a.R(spannableString, d0Var11.f348b, bVar9, i36, i37);
                                String str6 = d0Var11.f353g;
                                if (str6 != null) {
                                    spannableString.setSpan(new d2.b(0, str6), i36, i37, i16);
                                }
                                n nVar2 = d0Var11.f356j;
                                if (nVar2 != null) {
                                    spannableString.setSpan(new ScaleXSpan(nVar2.f5884a), i36, i37, i16);
                                    spannableString.setSpan(new d2.a(nVar2.f5885b, 1), i36, i37, i16);
                                }
                                h2.b bVar11 = d0Var11.f357k;
                                if (bVar11 != null) {
                                    spannableString.setSpan(j2.a.f4992a.a(bVar11), i36, i37, i16);
                                }
                                m2.b bVar12 = bVar9;
                                long j15 = d0Var11.f358l;
                                if (j15 != 16) {
                                    spannableString.setSpan(new BackgroundColorSpan(l0.w(j15)), i36, i37, i16);
                                }
                                o0 o0Var = d0Var11.f360n;
                                if (o0Var != null) {
                                    long j16 = o0Var.f10032b;
                                    bVar3 = bVar12;
                                    z10 = z9;
                                    int w4 = l0.w(o0Var.f10031a);
                                    float d8 = y0.c.d(j16);
                                    float e9 = y0.c.e(j16);
                                    float f10 = o0Var.f10033c;
                                    d2.j jVar3 = new d2.j(w4, d8, e9, f10 == f9 ? Float.MIN_VALUE : f10);
                                    i17 = 33;
                                    spannableString.setSpan(jVar3, i36, i37, 33);
                                } else {
                                    bVar3 = bVar12;
                                    z10 = z9;
                                    i17 = 33;
                                }
                                b1.f fVar = d0Var11.f362p;
                                if (fVar != null) {
                                    spannableString.setSpan(new k2.a(fVar), i36, i37, i17);
                                }
                                if (m2.n.a(m2.m.b(d0Var11.f354h), 4294967296L) || m2.n.a(m2.m.b(d0Var11.f354h), 8589934592L)) {
                                    z9 = true;
                                    i12 = i15 + 1;
                                    size2 = i14;
                                    bVar9 = bVar3;
                                }
                            }
                            z9 = z10;
                            i12 = i15 + 1;
                            size2 = i14;
                            bVar9 = bVar3;
                        }
                        m2.b bVar13 = bVar9;
                        if (z9) {
                            int size8 = r32.size();
                            int i39 = 0;
                            while (i39 < size8) {
                                a2.e eVar5 = (a2.e) r32.get(i39);
                                int i40 = eVar5.f364b;
                                int i41 = eVar5.f365c;
                                d0 d0Var12 = (d0) eVar5.f363a;
                                if (i40 < 0 || i40 >= spannableString.length() || i41 <= i40 || i41 > spannableString.length()) {
                                    i13 = size8;
                                } else {
                                    long j17 = d0Var12.f354h;
                                    long b13 = m2.m.b(j17);
                                    i13 = size8;
                                    Object fVar2 = m2.n.a(b13, 4294967296L) ? new d2.f(bVar13.X(j17)) : m2.n.a(b13, 8589934592L) ? new d2.e(m2.m.c(j17)) : th;
                                    if (fVar2 != null) {
                                        spannableString.setSpan(fVar2, i40, i41, 33);
                                    }
                                }
                                i39++;
                                size8 = i13;
                            }
                        }
                        if (list3.size() <= 0) {
                            dVar2 = this;
                            charSequence = spannableString;
                            dVar2.f4866h = charSequence;
                            dVar2.f4867i = new r(charSequence, dVar2.f4865g, dVar2.f4870l);
                            return;
                        }
                        a2.e eVar6 = (a2.e) list3.get(0);
                        if (eVar6.f363a != null) {
                            throw new ClassCastException();
                        }
                        for (Object obj7 : spannableString.getSpans(eVar6.f364b, eVar6.f365c, l3.w.class)) {
                            spannableString.removeSpan((l3.w) obj7);
                        }
                        throw th;
                    }
                }
                a2.u uVar2 = k0Var2.f413b;
                l2.g gVar = uVar2.f455f;
                gVar = gVar == null ? l2.g.f5870c : gVar;
                N = t6.a.N(uVar2.f452c, textSize, bVar9);
                if (!Float.isNaN(N)) {
                    int length3 = (spannableString.length() == 0 || z6.h.H(spannableString) == '\n') ? spannableString.length() + 1 : spannableString.length();
                    int i42 = gVar.f5872b;
                    i9 = 0;
                    spannableString.setSpan(new d2.h(N, length3, (i42 & 1) > 0, (i42 & 16) > 0, gVar.f5871a), 0, spannableString.length(), 33);
                    oVar = k0Var2.f413b.f453d;
                    if (oVar != null) {
                    }
                    arrayList = new ArrayList(r32.size());
                    size = r32.size();
                    while (i10 < size) {
                    }
                    d0 d0Var52 = k0Var2.f412a;
                    q qVar22 = d0Var52.f352f;
                    if (qVar22 == null || d0Var52.f350d != null || d0Var52.f349c != null) {
                    }
                    j0 j0Var2 = new j0(spannableString, 1, cVar3);
                    if (arrayList.size() > 1) {
                    }
                    size2 = r32.size();
                    i12 = 0;
                    z9 = false;
                    while (i12 < size2) {
                    }
                    m2.b bVar132 = bVar9;
                    if (z9) {
                    }
                    if (list3.size() <= 0) {
                    }
                }
                i9 = 0;
                oVar = k0Var2.f413b.f453d;
                if (oVar != null) {
                }
                arrayList = new ArrayList(r32.size());
                size = r32.size();
                while (i10 < size) {
                }
                d0 d0Var522 = k0Var2.f412a;
                q qVar222 = d0Var522.f352f;
                if (qVar222 == null || d0Var522.f350d != null || d0Var522.f349c != null) {
                }
                j0 j0Var22 = new j0(spannableString, 1, cVar3);
                if (arrayList.size() > 1) {
                }
                size2 = r32.size();
                i12 = 0;
                z9 = false;
                while (i12 < size2) {
                }
                m2.b bVar1322 = bVar9;
                if (z9) {
                }
                if (list3.size() <= 0) {
                }
            }
            i7 = 3;
            obj.f4870l = i7;
            c cVar32 = new c(0, obj);
            p pVar2 = k0Var.f413b.f458i;
            if (pVar2 == null) {
            }
            eVar.setFlags(pVar2.f5892b ? eVar.getFlags() | 128 : eVar.getFlags() & (-129));
            i8 = pVar2.f5891a;
            if (i8 == 1) {
            }
            d0Var = k0Var.f412a;
            boolean isEmpty2 = list.isEmpty();
            long j102 = d0Var.f348b;
            str2 = d0Var.f353g;
            bVar2 = d0Var.f357k;
            m mVar3 = d0Var.f347a;
            nVar = d0Var.f356j;
            j8 = d0Var.f354h;
            b9 = m2.m.b(j102);
            if (m2.n.a(b9, 4294967296L)) {
            }
            qVar = d0Var.f352f;
            if (qVar == null) {
            }
            f2.k kVar3 = d0Var.f349c;
            if (kVar3 == null) {
            }
            f2.i iVar2 = d0Var.f350d;
            if (iVar2 != null) {
            }
            f2.j jVar4 = d0Var.f351e;
            b10 = ((f2.e) dVar).b(qVar, kVar3, i21, jVar4 != null ? jVar4.f3276a : 1);
            if (b10 instanceof s) {
            }
            eVar.setTypeface(typeface);
            if (bVar2 != null) {
            }
            if (str2 != null) {
                eVar.setFontFeatureSettings(str2);
            }
            if (nVar != null) {
                eVar.setTextScaleX(eVar.getTextScaleX() * nVar.f5884a);
                eVar.setTextSkewX(eVar.getTextSkewX() + nVar.f5885b);
            }
            eVar.d(mVar3.b());
            eVar.c(mVar3.c(), 9205357640488583168L, mVar3.a());
            eVar.f(d0Var.f360n);
            eVar.g(d0Var.f359m);
            eVar.e(d0Var.f362p);
            if (m2.n.a(m2.m.b(j8), 4294967296L)) {
            }
            j9 = j8;
            if (m2.n.a(m2.m.b(j9), 8589934592L)) {
            }
            long j112 = d0Var.f358l;
            l2.a aVar4 = d0Var.f355i;
            if (isEmpty2) {
            }
            long j122 = u.f10057g;
            if (u.c(j112, j122)) {
            }
            if (aVar4 == null) {
            }
            if (z11) {
            }
            if (d0Var2 != null) {
            }
            r02 = obj.f4859a;
            float textSize2 = obj.f4865g.getTextSize();
            k0Var2 = obj.f4860b;
            list3 = obj.f4862d;
            m2.b bVar92 = obj.f4864f;
            z8 = obj.f4869k;
            a aVar22 = b.f4856a;
            if (z8) {
            }
            str3 = r02;
            f9 = 0.0f;
            th = null;
            charSequence = str3;
            if (r32.isEmpty()) {
            }
            if (charSequence instanceof Spannable) {
            }
            if (r6.k.a(k0Var2.f412a.f359m, l2.j.f5878c)) {
            }
            yVar = k0Var2.f414c;
            if ((yVar != null || (wVar = yVar.f465b) == null) ? false : wVar.f462a) {
            }
            a2.u uVar22 = k0Var2.f413b;
            l2.g gVar2 = uVar22.f455f;
            if (gVar2 == null) {
            }
            N = t6.a.N(uVar22.f452c, textSize2, bVar92);
            if (!Float.isNaN(N)) {
            }
            i9 = 0;
            oVar = k0Var2.f413b.f453d;
            if (oVar != null) {
            }
            arrayList = new ArrayList(r32.size());
            size = r32.size();
            while (i10 < size) {
            }
            d0 d0Var5222 = k0Var2.f412a;
            q qVar2222 = d0Var5222.f352f;
            if (qVar2222 == null || d0Var5222.f350d != null || d0Var5222.f349c != null) {
            }
            j0 j0Var222 = new j0(spannableString, 1, cVar32);
            if (arrayList.size() > 1) {
            }
            size2 = r32.size();
            i12 = 0;
            z9 = false;
            while (i12 < size2) {
            }
            m2.b bVar13222 = bVar92;
            if (z9) {
            }
            if (list3.size() <= 0) {
            }
        }
        i7 = 2;
        obj.f4870l = i7;
        c cVar322 = new c(0, obj);
        p pVar22 = k0Var.f413b.f458i;
        if (pVar22 == null) {
        }
        eVar.setFlags(pVar22.f5892b ? eVar.getFlags() | 128 : eVar.getFlags() & (-129));
        i8 = pVar22.f5891a;
        if (i8 == 1) {
        }
        d0Var = k0Var.f412a;
        boolean isEmpty22 = list.isEmpty();
        long j1022 = d0Var.f348b;
        str2 = d0Var.f353g;
        bVar2 = d0Var.f357k;
        m mVar32 = d0Var.f347a;
        nVar = d0Var.f356j;
        j8 = d0Var.f354h;
        b9 = m2.m.b(j1022);
        if (m2.n.a(b9, 4294967296L)) {
        }
        qVar = d0Var.f352f;
        if (qVar == null) {
        }
        f2.k kVar32 = d0Var.f349c;
        if (kVar32 == null) {
        }
        f2.i iVar22 = d0Var.f350d;
        if (iVar22 != null) {
        }
        f2.j jVar42 = d0Var.f351e;
        b10 = ((f2.e) dVar).b(qVar, kVar32, i21, jVar42 != null ? jVar42.f3276a : 1);
        if (b10 instanceof s) {
        }
        eVar.setTypeface(typeface);
        if (bVar2 != null) {
        }
        if (str2 != null) {
        }
        if (nVar != null) {
        }
        eVar.d(mVar32.b());
        eVar.c(mVar32.c(), 9205357640488583168L, mVar32.a());
        eVar.f(d0Var.f360n);
        eVar.g(d0Var.f359m);
        eVar.e(d0Var.f362p);
        if (m2.n.a(m2.m.b(j8), 4294967296L)) {
        }
        j9 = j8;
        if (m2.n.a(m2.m.b(j9), 8589934592L)) {
        }
        long j1122 = d0Var.f358l;
        l2.a aVar42 = d0Var.f355i;
        if (isEmpty22) {
        }
        long j1222 = u.f10057g;
        if (u.c(j1122, j1222)) {
        }
        if (aVar42 == null) {
        }
        if (z11) {
        }
        if (d0Var2 != null) {
        }
        r02 = obj.f4859a;
        float textSize22 = obj.f4865g.getTextSize();
        k0Var2 = obj.f4860b;
        list3 = obj.f4862d;
        m2.b bVar922 = obj.f4864f;
        z8 = obj.f4869k;
        a aVar222 = b.f4856a;
        if (z8) {
        }
        str3 = r02;
        f9 = 0.0f;
        th = null;
        charSequence = str3;
        if (r32.isEmpty()) {
        }
        if (charSequence instanceof Spannable) {
        }
        if (r6.k.a(k0Var2.f412a.f359m, l2.j.f5878c)) {
        }
        yVar = k0Var2.f414c;
        if ((yVar != null || (wVar = yVar.f465b) == null) ? false : wVar.f462a) {
        }
        a2.u uVar222 = k0Var2.f413b;
        l2.g gVar22 = uVar222.f455f;
        if (gVar22 == null) {
        }
        N = t6.a.N(uVar222.f452c, textSize22, bVar922);
        if (!Float.isNaN(N)) {
        }
        i9 = 0;
        oVar = k0Var2.f413b.f453d;
        if (oVar != null) {
        }
        arrayList = new ArrayList(r32.size());
        size = r32.size();
        while (i10 < size) {
        }
        d0 d0Var52222 = k0Var2.f412a;
        q qVar22222 = d0Var52222.f352f;
        if (qVar22222 == null || d0Var52222.f350d != null || d0Var52222.f349c != null) {
        }
        j0 j0Var2222 = new j0(spannableString, 1, cVar322);
        if (arrayList.size() > 1) {
        }
        size2 = r32.size();
        i12 = 0;
        z9 = false;
        while (i12 < size2) {
        }
        m2.b bVar132222 = bVar922;
        if (z9) {
        }
        if (list3.size() <= 0) {
        }
    }

    @Override // a2.t
    public final float a() {
        r rVar = this.f4867i;
        if (!Float.isNaN(rVar.f1300e)) {
            return rVar.f1300e;
        }
        CharSequence charSequence = rVar.f1296a;
        TextPaint textPaint = rVar.f1297b;
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        lineInstance.setText(new b2.n(charSequence, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, new b2.s(0));
        int i7 = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new d6.j(Integer.valueOf(i7), Integer.valueOf(next)));
            } else {
                d6.j jVar = (d6.j) priorityQueue.peek();
                if (jVar != null && ((Number) jVar.f2619g).intValue() - ((Number) jVar.f2618f).intValue() < next - i7) {
                    priorityQueue.poll();
                    priorityQueue.add(new d6.j(Integer.valueOf(i7), Integer.valueOf(next)));
                }
            }
            i7 = next;
        }
        Iterator it = priorityQueue.iterator();
        float f9 = 0.0f;
        while (it.hasNext()) {
            d6.j jVar2 = (d6.j) it.next();
            f9 = Math.max(f9, Layout.getDesiredWidth(charSequence, ((Number) jVar2.f2618f).intValue(), ((Number) jVar2.f2619g).intValue(), textPaint));
        }
        rVar.f1300e = f9;
        return f9;
    }

    @Override // a2.t
    public final boolean b() {
        b1.b bVar = this.f4868j;
        if (bVar != null ? bVar.t() : false) {
            return true;
        }
        if (!this.f4869k) {
            y yVar = this.f4860b.f414c;
            b6.c cVar = i.f4883a;
            b6.c cVar2 = i.f4883a;
            m2 m2Var = (m2) cVar2.f1394g;
            if (m2Var == null) {
                if (l3.k.c()) {
                    m2Var = cVar2.q();
                    cVar2.f1394g = m2Var;
                } else {
                    m2Var = j.f4884a;
                }
            }
            if (((Boolean) m2Var.getValue()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // a2.t
    public final float c() {
        return this.f4867i.b();
    }
}
