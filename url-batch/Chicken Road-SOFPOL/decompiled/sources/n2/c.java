package n2;

import a0.g1;
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
import b6.a0;
import b6.f1;
import f1.h0;
import f1.k0;
import g2.b0;
import g2.i0;
import g2.q;
import g2.t;
import g2.u;
import j2.r;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import m0.t2;
import q2.l;
import q2.o;
import q2.p;
import q2.s;
import r2.n;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c implements q {

    /* renamed from: a, reason: collision with root package name */
    public final String f5306a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f5307b;

    /* renamed from: c, reason: collision with root package name */
    public final List f5308c;

    /* renamed from: d, reason: collision with root package name */
    public final List f5309d;

    /* renamed from: e, reason: collision with root package name */
    public final j2.d f5310e;

    /* renamed from: f, reason: collision with root package name */
    public final r2.c f5311f;

    /* renamed from: g, reason: collision with root package name */
    public final e f5312g;

    /* renamed from: h, reason: collision with root package name */
    public final CharSequence f5313h;
    public final h2.e i;

    /* renamed from: j, reason: collision with root package name */
    public g1 f5314j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f5315k;

    /* renamed from: l, reason: collision with root package name */
    public final int f5316l;

    /* JADX WARN: Code restructure failed: missing block: B:125:0x03d5, code lost:
    
        if ((r5.f2965b.f2995c & 1095216660480L) != 0) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:461:0x0099, code lost:
    
        if (r7 == 1) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x06a5  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0801  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0879  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x08a3 A[LOOP:7: B:305:0x08a1->B:306:0x08a3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x08b4  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x08e0  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:438:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0309 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v24, types: [android.text.Spannable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c(String str, i0 i0Var, List list, List list2, j2.d dVar, r2.c cVar) {
        Locale locale;
        int i;
        int i8;
        b0 b0Var;
        int size;
        int i9;
        Object obj;
        String str2;
        m2.b bVar;
        o oVar;
        p pVar;
        long j7;
        long b8;
        j2.p pVar2;
        o oVar2;
        r b9;
        Typeface typeface;
        b0 b0Var2;
        c cVar2;
        ?? r42;
        String str3;
        float textSize;
        List list3;
        r2.c cVar3;
        boolean z3;
        CharSequence charSequence;
        b0 b0Var3;
        g2.r rVar;
        long j8;
        u uVar;
        float J;
        int length;
        q2.q qVar;
        g2.r rVar2;
        ArrayList arrayList;
        int size2;
        int i10;
        ArrayList arrayList2;
        b0 b0Var4;
        g2.r rVar3;
        int size3;
        int i11;
        boolean z7;
        q2.q qVar2;
        int size4;
        int i12;
        r2.c cVar4;
        Object eVar;
        int i13;
        int i14;
        boolean z8;
        g2.r rVar4;
        r2.c cVar5;
        int i15;
        int i16;
        t tVar;
        m2.b bVar2;
        this.f5306a = str;
        this.f5307b = i0Var;
        this.f5308c = list;
        this.f5309d = list2;
        this.f5310e = dVar;
        this.f5311f = cVar;
        float b10 = cVar.b();
        e eVar2 = new e(1);
        ((TextPaint) eVar2).density = b10;
        eVar2.f5320b = l.f6056b;
        eVar2.f5321c = 3;
        eVar2.f5322d = h0.f2663d;
        this.f5312g = eVar2;
        u uVar2 = i0Var.f2966c;
        b1.b bVar3 = i.f5331a;
        b1.b bVar4 = i.f5331a;
        t2 t2Var = (t2) bVar4.f1050e;
        if (t2Var == null) {
            if (d4.l.c()) {
                t2Var = bVar4.s();
                bVar4.f1050e = t2Var;
            } else {
                t2Var = j.f5332a;
            }
        }
        this.f5315k = ((Boolean) t2Var.getValue()).booleanValue();
        int i17 = i0Var.f2965b.f2994b;
        m2.b bVar5 = i0Var.f2964a.f2912k;
        int i18 = 2;
        if (i17 != 4) {
            if (i17 != 5) {
                if (i17 == 1) {
                    i = 0;
                } else if (i17 == 2) {
                    i = 1;
                } else {
                    if (i17 != 3 && i17 != Integer.MIN_VALUE) {
                        throw new IllegalStateException("Invalid TextDirection.");
                    }
                    int layoutDirectionFromLocale = TextUtils.getLayoutDirectionFromLocale((bVar5 == null || (locale = ((m2.a) bVar5.f5218d.get(0)).f5216a) == null) ? Locale.getDefault() : locale);
                    if (layoutDirectionFromLocale != 0) {
                    }
                }
                this.f5316l = i;
                f1 f1Var = new f1(i18, this);
                s sVar = i0Var.f2965b.i;
                sVar = sVar == null ? s.f6068c : sVar;
                eVar2.setFlags(sVar.f6071b ? eVar2.getFlags() | 128 : eVar2.getFlags() & (-129));
                i8 = sVar.f6070a;
                if (i8 == 1) {
                    eVar2.setFlags(eVar2.getFlags() | 64);
                    eVar2.setHinting(0);
                } else if (i8 == 2) {
                    eVar2.getFlags();
                    eVar2.setHinting(1);
                } else if (i8 == 3) {
                    eVar2.getFlags();
                    eVar2.setHinting(0);
                } else {
                    eVar2.getFlags();
                }
                b0Var = i0Var.f2964a;
                size = list.size();
                i9 = 0;
                while (true) {
                    if (i9 >= size) {
                        obj = null;
                        break;
                    }
                    obj = list.get(i9);
                    if (((g2.c) obj).f2917a instanceof b0) {
                        break;
                    } else {
                        i9++;
                    }
                }
                boolean z9 = obj != null;
                long j9 = b0Var.f2904b;
                str2 = b0Var.f2909g;
                bVar = b0Var.f2912k;
                oVar = b0Var.f2903a;
                pVar = b0Var.f2911j;
                j7 = b0Var.f2910h;
                b8 = n.b(j9);
                boolean z10 = z9;
                if (r2.p.a(b8, 4294967296L)) {
                    eVar2.setTextSize(cVar.R(j9));
                } else if (r2.p.a(b8, 8589934592L)) {
                    eVar2.setTextSize(n.c(j9) * eVar2.getTextSize());
                }
                pVar2 = b0Var.f2908f;
                if (pVar2 != null && b0Var.f2906d == null && b0Var.f2905c == null) {
                    oVar2 = oVar;
                } else {
                    j2.k kVar = b0Var.f2905c;
                    kVar = kVar == null ? j2.k.f3995f : kVar;
                    j2.i iVar = b0Var.f2906d;
                    int i19 = iVar != null ? iVar.f3992a : 0;
                    j2.j jVar = b0Var.f2907e;
                    int i20 = jVar != null ? jVar.f3993a : 65535;
                    c cVar6 = (c) f1Var.f1319e;
                    oVar2 = oVar;
                    b9 = ((j2.e) cVar6.f5310e).b(pVar2, kVar, i19, i20);
                    if (b9 instanceof r) {
                        Object obj2 = b9.f4008d;
                        q6.i.c(obj2, "null cannot be cast to non-null type android.graphics.Typeface");
                        typeface = (Typeface) obj2;
                    } else {
                        g1 g1Var = new g1(b9, cVar6.f5314j);
                        cVar6.f5314j = g1Var;
                        Object obj3 = g1Var.f85c;
                        q6.i.c(obj3, "null cannot be cast to non-null type android.graphics.Typeface");
                        typeface = (Typeface) obj3;
                    }
                    eVar2.setTypeface(typeface);
                }
                if (bVar != null) {
                    m2.b bVar6 = m2.b.f5217f;
                    g1 g1Var2 = m2.c.f5220a;
                    g1Var2.getClass();
                    LocaleList localeList = LocaleList.getDefault();
                    synchronized (((w5.f) g1Var2.f86d)) {
                        try {
                            bVar2 = (m2.b) g1Var2.f85c;
                            if (bVar2 == null || localeList != ((LocaleList) g1Var2.f84b)) {
                                int size5 = localeList.size();
                                ArrayList arrayList3 = new ArrayList(size5);
                                int i21 = 0;
                                while (i21 < size5) {
                                    arrayList3.add(new m2.a(localeList.get(i21)));
                                    i21++;
                                    size5 = size5;
                                }
                                bVar2 = new m2.b(arrayList3);
                                g1Var2.f84b = localeList;
                                g1Var2.f85c = bVar2;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (!bVar.equals(bVar2)) {
                        ArrayList arrayList4 = new ArrayList(d6.n.M(bVar, 10));
                        Iterator it = bVar.f5218d.iterator();
                        while (it.hasNext()) {
                            arrayList4.add(((m2.a) it.next()).f5216a);
                        }
                        Locale[] localeArr = (Locale[]) arrayList4.toArray(new Locale[0]);
                        eVar2.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
                    }
                }
                if (str2 != null && !str2.equals("")) {
                    eVar2.setFontFeatureSettings(str2);
                }
                if (pVar != null && !pVar.equals(p.f6061c)) {
                    eVar2.setTextScaleX(eVar2.getTextScaleX() * pVar.f6062a);
                    eVar2.setTextSkewX(eVar2.getTextSkewX() + pVar.f6063b);
                }
                eVar2.d(oVar2.b());
                eVar2.c(oVar2.c(), 9205357640488583168L, oVar2.a());
                eVar2.f(b0Var.f2915n);
                eVar2.g(b0Var.f2914m);
                eVar2.e(b0Var.f2916o);
                if (!r2.p.a(n.b(j7), 4294967296L) && n.c(j7) != 0.0f) {
                    float textScaleX = eVar2.getTextScaleX() * eVar2.getTextSize();
                    float R = cVar.R(j7);
                    if (textScaleX != 0.0f) {
                        eVar2.setLetterSpacing(R / textScaleX);
                    }
                } else if (r2.p.a(n.b(j7), 8589934592L)) {
                    eVar2.setLetterSpacing(n.c(j7));
                }
                long j10 = b0Var.f2913l;
                q2.a aVar = b0Var.i;
                boolean z11 = (z10 || !r2.p.a(n.b(j7), 4294967296L) || n.c(j7) == 0.0f) ? false : true;
                long j11 = f1.s.f2704h;
                boolean z12 = f1.s.c(j10, j11) && !f1.s.c(j10, f1.s.f2703g);
                boolean z13 = aVar == null && Float.compare(aVar.f6037a, 0.0f) != 0;
                b0Var2 = (!z11 || z12 || z13) ? new b0(0L, 0L, (j2.k) null, (j2.i) null, (j2.j) null, (j2.p) null, (String) null, z11 ? j7 : n.f6534c, z13 ? aVar : null, (p) null, (m2.b) null, z12 ? j10 : j11, (l) null, (h0) null, 63103) : null;
                if (b0Var2 != null) {
                    cVar2 = this;
                    int size6 = cVar2.f5308c.size() + 1;
                    r42 = new ArrayList(size6);
                    int i22 = 0;
                    while (i22 < size6) {
                        r42.add(i22 == 0 ? new g2.c(0, cVar2.f5306a.length(), b0Var2) : (g2.c) cVar2.f5308c.get(i22 - 1));
                        i22++;
                    }
                } else {
                    cVar2 = this;
                    r42 = cVar2.f5308c;
                }
                str3 = cVar2.f5306a;
                textSize = cVar2.f5312g.getTextSize();
                i0 i0Var2 = cVar2.f5307b;
                list3 = cVar2.f5309d;
                cVar3 = cVar2.f5311f;
                z3 = cVar2.f5315k;
                a aVar2 = b.f5305a;
                if (z3 || !d4.l.c()) {
                    charSequence = str3;
                } else {
                    u uVar3 = i0Var2.f2966c;
                    if (uVar3 != null) {
                        t tVar2 = uVar3.f3004a;
                    }
                    CharSequence f6 = d4.l.a().f(0, str3.length(), 0, str3);
                    q6.i.b(f6);
                    charSequence = f6;
                }
                CharSequence charSequence2 = (r42.isEmpty() && list3.isEmpty() && q6.i.a(i0Var2.f2965b.f2996d, q2.q.f6064c)) ? charSequence : charSequence2;
                SpannableString spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
                b0Var3 = i0Var2.f2964a;
                rVar = i0Var2.f2965b;
                if (q6.i.a(b0Var3.f2914m, l.f6057c)) {
                    j8 = 0;
                    spannableString.setSpan(b.f5305a, 0, str3.length(), 33);
                } else {
                    j8 = 0;
                }
                uVar = i0Var2.f2966c;
                if (((uVar != null || (tVar = uVar.f3004a) == null) ? false : tVar.f3003a) || rVar.f2998f != null) {
                    q2.i iVar2 = rVar.f2998f;
                    iVar2 = iVar2 == null ? q2.i.f6049c : iVar2;
                    J = m.a.J(rVar.f2995c, textSize, cVar3);
                    if (!Float.isNaN(J)) {
                        if (spannableString.length() != 0) {
                            if (spannableString.length() == 0) {
                                throw new NoSuchElementException("Char sequence is empty.");
                            }
                            if (spannableString.charAt(y6.j.b0(spannableString)) != '\n') {
                                length = spannableString.length();
                                int i23 = length;
                                int i24 = iVar2.f6051b;
                                spannableString.setSpan(new i2.h(J, i23, (i24 & 1) <= 0, (i24 & 16) <= 0, iVar2.f6050a, false), 0, spannableString.length(), 33);
                            }
                        }
                        length = spannableString.length() + 1;
                        int i232 = length;
                        int i242 = iVar2.f6051b;
                        spannableString.setSpan(new i2.h(J, i232, (i242 & 1) <= 0, (i242 & 16) <= 0, iVar2.f6050a, false), 0, spannableString.length(), 33);
                    }
                } else {
                    float J2 = m.a.J(rVar.f2995c, textSize, cVar3);
                    if (!Float.isNaN(J2)) {
                        spannableString.setSpan(new i2.g(J2), 0, spannableString.length(), 33);
                    }
                }
                qVar = rVar.f2996d;
                if (qVar != null) {
                    long j12 = qVar.f6065a;
                    long j13 = qVar.f6066b;
                    if ((!n.a(j12, r2.o.Q(0)) || !n.a(j13, r2.o.Q(0))) && (j12 & 1095216660480L) != j8 && (j13 & 1095216660480L) != j8) {
                        long b11 = n.b(j12);
                        rVar2 = rVar;
                        float R2 = r2.p.a(b11, 4294967296L) ? cVar3.R(j12) : r2.p.a(b11, 8589934592L) ? n.c(j12) * textSize : 0.0f;
                        long b12 = n.b(j13);
                        spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(R2), (int) Math.ceil(r2.p.a(b12, 4294967296L) ? cVar3.R(j13) : r2.p.a(b12, 8589934592L) ? n.c(j13) * textSize : 0.0f)), 0, spannableString.length(), 33);
                        arrayList = new ArrayList(r42.size());
                        size2 = r42.size();
                        for (i10 = 0; i10 < size2; i10++) {
                            g2.c cVar7 = (g2.c) r42.get(i10);
                            Object obj4 = cVar7.f2917a;
                            if (obj4 instanceof b0) {
                                b0 b0Var5 = (b0) obj4;
                                if (((b0Var5.f2908f == null && b0Var5.f2906d == null && b0Var5.f2905c == null) ? false : true) || ((b0) obj4).f2907e != null) {
                                    arrayList.add(cVar7);
                                }
                            }
                        }
                        b0 b0Var6 = i0Var2.f2964a;
                        j2.p pVar3 = b0Var6.f2908f;
                        b0 b0Var7 = ((pVar3 == null || b0Var6.f2906d != null || b0Var6.f2905c != null) && b0Var6.f2907e == null) ? null : new b0(0L, 0L, b0Var6.f2905c, b0Var6.f2906d, b0Var6.f2907e, pVar3, (String) null, 0L, (q2.a) null, (p) null, (m2.b) null, 0L, (l) null, (h0) null, 65475);
                        a0 a0Var = new a0(3, spannableString, f1Var);
                        if (arrayList.size() <= 1) {
                            int size7 = arrayList.size();
                            int i25 = size7 * 2;
                            int[] iArr = new int[i25];
                            int size8 = arrayList.size();
                            for (int i26 = 0; i26 < size8; i26++) {
                                g2.c cVar8 = (g2.c) arrayList.get(i26);
                                iArr[i26] = cVar8.f2918b;
                                iArr[i26 + size7] = cVar8.f2919c;
                            }
                            if (i25 > 1) {
                                Arrays.sort(iArr);
                            }
                            if (i25 == 0) {
                                throw new NoSuchElementException("Array is empty.");
                            }
                            int i27 = iArr[0];
                            int i28 = 0;
                            while (i28 < i25) {
                                int i29 = iArr[i28];
                                if (i29 == i27) {
                                    arrayList2 = arrayList;
                                    b0Var4 = b0Var7;
                                    rVar3 = rVar2;
                                } else {
                                    int size9 = arrayList.size();
                                    b0 b0Var8 = b0Var7;
                                    int i30 = 0;
                                    while (i30 < size9) {
                                        ArrayList arrayList5 = arrayList;
                                        g2.c cVar9 = (g2.c) arrayList.get(i30);
                                        b0 b0Var9 = b0Var7;
                                        int i31 = cVar9.f2918b;
                                        g2.r rVar5 = rVar2;
                                        int i32 = cVar9.f2919c;
                                        if (i31 != i32 && g2.f.a(i27, i29, i31, i32)) {
                                            b0 b0Var10 = (b0) cVar9.f2917a;
                                            b0Var8 = b0Var8 != null ? b0Var8.c(b0Var10) : b0Var10;
                                        }
                                        i30++;
                                        arrayList = arrayList5;
                                        b0Var7 = b0Var9;
                                        rVar2 = rVar5;
                                    }
                                    arrayList2 = arrayList;
                                    b0Var4 = b0Var7;
                                    rVar3 = rVar2;
                                    if (b0Var8 != null) {
                                        a0Var.d(b0Var8, Integer.valueOf(i27), Integer.valueOf(i29));
                                    }
                                    i27 = i29;
                                }
                                i28++;
                                arrayList = arrayList2;
                                b0Var7 = b0Var4;
                                rVar2 = rVar3;
                            }
                        } else if (!arrayList.isEmpty()) {
                            b0 b0Var11 = (b0) ((g2.c) arrayList.get(0)).f2917a;
                            a0Var.d(b0Var7 != null ? b0Var7.c(b0Var11) : b0Var11, Integer.valueOf(((g2.c) arrayList.get(0)).f2918b), Integer.valueOf(((g2.c) arrayList.get(0)).f2919c));
                        }
                        g2.r rVar6 = rVar2;
                        size3 = r42.size();
                        i11 = 0;
                        z7 = false;
                        while (i11 < size3) {
                            g2.c cVar10 = (g2.c) r42.get(i11);
                            Object obj5 = cVar10.f2917a;
                            if (obj5 instanceof b0) {
                                int i33 = cVar10.f2918b;
                                int i34 = cVar10.f2919c;
                                if (i33 >= 0 && i33 < spannableString.length() && i34 > i33 && i34 <= spannableString.length()) {
                                    b0 b0Var12 = (b0) obj5;
                                    long j14 = b0Var12.f2910h;
                                    q2.a aVar3 = b0Var12.i;
                                    o oVar3 = b0Var12.f2903a;
                                    if (aVar3 != null) {
                                        spannableString.setSpan(new i2.a(0, aVar3.f6037a), i33, i34, 33);
                                    }
                                    m.a.L(spannableString, oVar3.b(), i33, i34);
                                    f1.p c8 = oVar3.c();
                                    float a8 = oVar3.a();
                                    if (c8 != null) {
                                        if (c8 instanceof k0) {
                                            m.a.L(spannableString, ((k0) c8).f2682e, i33, i34);
                                        } else {
                                            spannableString.setSpan(new p2.b((f1.b0) c8, a8), i33, i34, 33);
                                        }
                                    }
                                    l lVar = b0Var12.f2914m;
                                    if (lVar != null) {
                                        int i35 = lVar.f6058a;
                                        i2.k kVar2 = new i2.k((i35 | 1) == i35, (i35 | 2) == i35);
                                        i15 = 33;
                                        spannableString.setSpan(kVar2, i33, i34, 33);
                                    } else {
                                        i15 = 33;
                                    }
                                    int i36 = i15;
                                    rVar4 = rVar6;
                                    m.a.M(spannableString, b0Var12.f2904b, cVar3, i33, i34);
                                    String str4 = b0Var12.f2909g;
                                    if (str4 != null) {
                                        i13 = size3;
                                        spannableString.setSpan(new i2.b(0, str4), i33, i34, i36);
                                    } else {
                                        i13 = size3;
                                    }
                                    p pVar4 = b0Var12.f2911j;
                                    if (pVar4 != null) {
                                        spannableString.setSpan(new ScaleXSpan(pVar4.f6062a), i33, i34, i36);
                                        spannableString.setSpan(new i2.a(1, pVar4.f6063b), i33, i34, i36);
                                    }
                                    m.a.N(spannableString, b0Var12.f2912k, i33, i34);
                                    r2.c cVar11 = cVar3;
                                    long j15 = b0Var12.f2913l;
                                    if (j15 != 16) {
                                        spannableString.setSpan(new BackgroundColorSpan(f1.p.u(j15)), i33, i34, i36);
                                    }
                                    h0 h0Var = b0Var12.f2915n;
                                    if (h0Var != null) {
                                        long j16 = h0Var.f2665b;
                                        cVar5 = cVar11;
                                        i14 = i11;
                                        int u7 = f1.p.u(h0Var.f2664a);
                                        z8 = z7;
                                        float intBitsToFloat = Float.intBitsToFloat((int) (j16 >> 32));
                                        float intBitsToFloat2 = Float.intBitsToFloat((int) (j16 & 4294967295L));
                                        float f8 = h0Var.f2666c;
                                        i2.j jVar2 = new i2.j(u7, intBitsToFloat, intBitsToFloat2, f8 == 0.0f ? Float.MIN_VALUE : f8);
                                        i16 = 33;
                                        spannableString.setSpan(jVar2, i33, i34, 33);
                                    } else {
                                        cVar5 = cVar11;
                                        i14 = i11;
                                        z8 = z7;
                                        i16 = i36;
                                    }
                                    h1.c cVar12 = b0Var12.f2916o;
                                    if (cVar12 != null) {
                                        spannableString.setSpan(new p2.a(cVar12), i33, i34, i16);
                                    }
                                    if (r2.p.a(n.b(j14), 4294967296L) || r2.p.a(n.b(j14), 8589934592L)) {
                                        z7 = true;
                                        i11 = i14 + 1;
                                        size3 = i13;
                                        cVar3 = cVar5;
                                        rVar6 = rVar4;
                                    }
                                    z7 = z8;
                                    i11 = i14 + 1;
                                    size3 = i13;
                                    cVar3 = cVar5;
                                    rVar6 = rVar4;
                                }
                            }
                            i13 = size3;
                            i14 = i11;
                            z8 = z7;
                            rVar4 = rVar6;
                            cVar5 = cVar3;
                            z7 = z8;
                            i11 = i14 + 1;
                            size3 = i13;
                            cVar3 = cVar5;
                            rVar6 = rVar4;
                        }
                        g2.r rVar7 = rVar6;
                        r2.c cVar13 = cVar3;
                        if (z7) {
                            int size10 = r42.size();
                            int i37 = 0;
                            while (i37 < size10) {
                                g2.c cVar14 = (g2.c) r42.get(i37);
                                g2.b bVar7 = (g2.b) cVar14.f2917a;
                                if (bVar7 instanceof b0) {
                                    int i38 = cVar14.f2918b;
                                    int i39 = cVar14.f2919c;
                                    if (i38 >= 0 && i38 < spannableString.length() && i39 > i38 && i39 <= spannableString.length()) {
                                        long j17 = ((b0) bVar7).f2910h;
                                        long b13 = n.b(j17);
                                        if (r2.p.a(b13, 4294967296L)) {
                                            cVar4 = cVar13;
                                            eVar = new i2.f(cVar4.R(j17));
                                        } else {
                                            cVar4 = cVar13;
                                            eVar = r2.p.a(b13, 8589934592L) ? new i2.e(n.c(j17)) : null;
                                        }
                                        if (eVar != null) {
                                            spannableString.setSpan(eVar, i38, i39, 33);
                                        }
                                        i37++;
                                        cVar13 = cVar4;
                                    }
                                }
                                cVar4 = cVar13;
                                i37++;
                                cVar13 = cVar4;
                            }
                        }
                        r2.c cVar15 = cVar13;
                        qVar2 = rVar7.f2996d;
                        if (qVar2 != null) {
                            long j18 = qVar2.f6065a;
                            long b14 = n.b(j18);
                            if (r2.p.a(b14, 4294967296L)) {
                                cVar15.R(j18);
                            } else if (r2.p.a(b14, 8589934592L)) {
                                n.c(j18);
                            }
                        }
                        size4 = r42.size();
                        for (i12 = 0; i12 < size4; i12++) {
                            Object obj6 = ((g2.c) r42.get(i12)).f2917a;
                        }
                        if (list3.size() > 0) {
                            cVar2 = this;
                            charSequence2 = spannableString;
                            cVar2.f5313h = charSequence2;
                            cVar2.i = new h2.e(charSequence2, cVar2.f5312g, cVar2.f5316l);
                            return;
                        }
                        g2.c cVar16 = (g2.c) list3.get(0);
                        if (cVar16.f2917a != null) {
                            throw new ClassCastException();
                        }
                        for (Object obj7 : spannableString.getSpans(cVar16.f2918b, cVar16.f2919c, d4.b0.class)) {
                            spannableString.removeSpan((d4.b0) obj7);
                        }
                        throw null;
                    }
                }
                rVar2 = rVar;
                arrayList = new ArrayList(r42.size());
                size2 = r42.size();
                while (i10 < size2) {
                }
                b0 b0Var62 = i0Var2.f2964a;
                j2.p pVar32 = b0Var62.f2908f;
                if (pVar32 == null || b0Var62.f2906d != null || b0Var62.f2905c != null) {
                }
                a0 a0Var2 = new a0(3, spannableString, f1Var);
                if (arrayList.size() <= 1) {
                }
                g2.r rVar62 = rVar2;
                size3 = r42.size();
                i11 = 0;
                z7 = false;
                while (i11 < size3) {
                }
                g2.r rVar72 = rVar62;
                r2.c cVar132 = cVar3;
                if (z7) {
                }
                r2.c cVar152 = cVar132;
                qVar2 = rVar72.f2996d;
                if (qVar2 != null) {
                }
                size4 = r42.size();
                while (i12 < size4) {
                }
                if (list3.size() > 0) {
                }
            }
            i = 3;
            this.f5316l = i;
            f1 f1Var2 = new f1(i18, this);
            s sVar2 = i0Var.f2965b.i;
            if (sVar2 == null) {
            }
            eVar2.setFlags(sVar2.f6071b ? eVar2.getFlags() | 128 : eVar2.getFlags() & (-129));
            i8 = sVar2.f6070a;
            if (i8 == 1) {
            }
            b0Var = i0Var.f2964a;
            size = list.size();
            i9 = 0;
            while (true) {
                if (i9 >= size) {
                }
                i9++;
            }
            if (obj != null) {
            }
            long j92 = b0Var.f2904b;
            str2 = b0Var.f2909g;
            bVar = b0Var.f2912k;
            oVar = b0Var.f2903a;
            pVar = b0Var.f2911j;
            j7 = b0Var.f2910h;
            b8 = n.b(j92);
            boolean z102 = z9;
            if (r2.p.a(b8, 4294967296L)) {
            }
            pVar2 = b0Var.f2908f;
            if (pVar2 != null) {
            }
            j2.k kVar3 = b0Var.f2905c;
            if (kVar3 == null) {
            }
            j2.i iVar3 = b0Var.f2906d;
            if (iVar3 != null) {
            }
            j2.j jVar3 = b0Var.f2907e;
            if (jVar3 != null) {
            }
            c cVar62 = (c) f1Var2.f1319e;
            oVar2 = oVar;
            b9 = ((j2.e) cVar62.f5310e).b(pVar2, kVar3, i19, i20);
            if (b9 instanceof r) {
            }
            eVar2.setTypeface(typeface);
            if (bVar != null) {
            }
            if (str2 != null) {
                eVar2.setFontFeatureSettings(str2);
            }
            if (pVar != null) {
                eVar2.setTextScaleX(eVar2.getTextScaleX() * pVar.f6062a);
                eVar2.setTextSkewX(eVar2.getTextSkewX() + pVar.f6063b);
            }
            eVar2.d(oVar2.b());
            eVar2.c(oVar2.c(), 9205357640488583168L, oVar2.a());
            eVar2.f(b0Var.f2915n);
            eVar2.g(b0Var.f2914m);
            eVar2.e(b0Var.f2916o);
            if (!r2.p.a(n.b(j7), 4294967296L)) {
            }
            if (r2.p.a(n.b(j7), 8589934592L)) {
            }
            long j102 = b0Var.f2913l;
            q2.a aVar4 = b0Var.i;
            if (z102) {
            }
            long j112 = f1.s.f2704h;
            if (f1.s.c(j102, j112)) {
            }
            if (aVar4 == null) {
            }
            if (z11) {
            }
            if (b0Var2 != null) {
            }
            str3 = cVar2.f5306a;
            textSize = cVar2.f5312g.getTextSize();
            i0 i0Var22 = cVar2.f5307b;
            list3 = cVar2.f5309d;
            cVar3 = cVar2.f5311f;
            z3 = cVar2.f5315k;
            a aVar22 = b.f5305a;
            if (z3) {
            }
            charSequence = str3;
            if (r42.isEmpty()) {
            }
            if (charSequence instanceof Spannable) {
            }
            b0Var3 = i0Var22.f2964a;
            rVar = i0Var22.f2965b;
            if (q6.i.a(b0Var3.f2914m, l.f6057c)) {
            }
            uVar = i0Var22.f2966c;
            if ((uVar != null || (tVar = uVar.f3004a) == null) ? false : tVar.f3003a) {
            }
            q2.i iVar22 = rVar.f2998f;
            if (iVar22 == null) {
            }
            J = m.a.J(rVar.f2995c, textSize, cVar3);
            if (!Float.isNaN(J)) {
            }
            qVar = rVar.f2996d;
            if (qVar != null) {
            }
            rVar2 = rVar;
            arrayList = new ArrayList(r42.size());
            size2 = r42.size();
            while (i10 < size2) {
            }
            b0 b0Var622 = i0Var22.f2964a;
            j2.p pVar322 = b0Var622.f2908f;
            if (pVar322 == null || b0Var622.f2906d != null || b0Var622.f2905c != null) {
            }
            a0 a0Var22 = new a0(3, spannableString, f1Var2);
            if (arrayList.size() <= 1) {
            }
            g2.r rVar622 = rVar2;
            size3 = r42.size();
            i11 = 0;
            z7 = false;
            while (i11 < size3) {
            }
            g2.r rVar722 = rVar622;
            r2.c cVar1322 = cVar3;
            if (z7) {
            }
            r2.c cVar1522 = cVar1322;
            qVar2 = rVar722.f2996d;
            if (qVar2 != null) {
            }
            size4 = r42.size();
            while (i12 < size4) {
            }
            if (list3.size() > 0) {
            }
        }
        i = 2;
        this.f5316l = i;
        f1 f1Var22 = new f1(i18, this);
        s sVar22 = i0Var.f2965b.i;
        if (sVar22 == null) {
        }
        eVar2.setFlags(sVar22.f6071b ? eVar2.getFlags() | 128 : eVar2.getFlags() & (-129));
        i8 = sVar22.f6070a;
        if (i8 == 1) {
        }
        b0Var = i0Var.f2964a;
        size = list.size();
        i9 = 0;
        while (true) {
            if (i9 >= size) {
            }
            i9++;
        }
        if (obj != null) {
        }
        long j922 = b0Var.f2904b;
        str2 = b0Var.f2909g;
        bVar = b0Var.f2912k;
        oVar = b0Var.f2903a;
        pVar = b0Var.f2911j;
        j7 = b0Var.f2910h;
        b8 = n.b(j922);
        boolean z1022 = z9;
        if (r2.p.a(b8, 4294967296L)) {
        }
        pVar2 = b0Var.f2908f;
        if (pVar2 != null) {
        }
        j2.k kVar32 = b0Var.f2905c;
        if (kVar32 == null) {
        }
        j2.i iVar32 = b0Var.f2906d;
        if (iVar32 != null) {
        }
        j2.j jVar32 = b0Var.f2907e;
        if (jVar32 != null) {
        }
        c cVar622 = (c) f1Var22.f1319e;
        oVar2 = oVar;
        b9 = ((j2.e) cVar622.f5310e).b(pVar2, kVar32, i19, i20);
        if (b9 instanceof r) {
        }
        eVar2.setTypeface(typeface);
        if (bVar != null) {
        }
        if (str2 != null) {
        }
        if (pVar != null) {
        }
        eVar2.d(oVar2.b());
        eVar2.c(oVar2.c(), 9205357640488583168L, oVar2.a());
        eVar2.f(b0Var.f2915n);
        eVar2.g(b0Var.f2914m);
        eVar2.e(b0Var.f2916o);
        if (!r2.p.a(n.b(j7), 4294967296L)) {
        }
        if (r2.p.a(n.b(j7), 8589934592L)) {
        }
        long j1022 = b0Var.f2913l;
        q2.a aVar42 = b0Var.i;
        if (z1022) {
        }
        long j1122 = f1.s.f2704h;
        if (f1.s.c(j1022, j1122)) {
        }
        if (aVar42 == null) {
        }
        if (z11) {
        }
        if (b0Var2 != null) {
        }
        str3 = cVar2.f5306a;
        textSize = cVar2.f5312g.getTextSize();
        i0 i0Var222 = cVar2.f5307b;
        list3 = cVar2.f5309d;
        cVar3 = cVar2.f5311f;
        z3 = cVar2.f5315k;
        a aVar222 = b.f5305a;
        if (z3) {
        }
        charSequence = str3;
        if (r42.isEmpty()) {
        }
        if (charSequence instanceof Spannable) {
        }
        b0Var3 = i0Var222.f2964a;
        rVar = i0Var222.f2965b;
        if (q6.i.a(b0Var3.f2914m, l.f6057c)) {
        }
        uVar = i0Var222.f2966c;
        if ((uVar != null || (tVar = uVar.f3004a) == null) ? false : tVar.f3003a) {
        }
        q2.i iVar222 = rVar.f2998f;
        if (iVar222 == null) {
        }
        J = m.a.J(rVar.f2995c, textSize, cVar3);
        if (!Float.isNaN(J)) {
        }
        qVar = rVar.f2996d;
        if (qVar != null) {
        }
        rVar2 = rVar;
        arrayList = new ArrayList(r42.size());
        size2 = r42.size();
        while (i10 < size2) {
        }
        b0 b0Var6222 = i0Var222.f2964a;
        j2.p pVar3222 = b0Var6222.f2908f;
        if (pVar3222 == null || b0Var6222.f2906d != null || b0Var6222.f2905c != null) {
        }
        a0 a0Var222 = new a0(3, spannableString, f1Var22);
        if (arrayList.size() <= 1) {
        }
        g2.r rVar6222 = rVar2;
        size3 = r42.size();
        i11 = 0;
        z7 = false;
        while (i11 < size3) {
        }
        g2.r rVar7222 = rVar6222;
        r2.c cVar13222 = cVar3;
        if (z7) {
        }
        r2.c cVar15222 = cVar13222;
        qVar2 = rVar7222.f2996d;
        if (qVar2 != null) {
        }
        size4 = r42.size();
        while (i12 < size4) {
        }
        if (list3.size() > 0) {
        }
    }

    @Override // g2.q
    public final boolean a() {
        g1 g1Var = this.f5314j;
        if (g1Var != null ? g1Var.B() : false) {
            return true;
        }
        if (!this.f5315k) {
            u uVar = this.f5307b.f2966c;
            b1.b bVar = i.f5331a;
            b1.b bVar2 = i.f5331a;
            t2 t2Var = (t2) bVar2.f1050e;
            if (t2Var == null) {
                if (d4.l.c()) {
                    t2Var = bVar2.s();
                    bVar2.f1050e = t2Var;
                } else {
                    t2Var = j.f5332a;
                }
            }
            if (((Boolean) t2Var.getValue()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // g2.q
    public final float b() {
        return this.i.c();
    }

    public final float c() {
        float f6;
        h2.e eVar = this.i;
        float f8 = eVar.f3096e;
        TextPaint textPaint = eVar.f3093b;
        if (!Float.isNaN(f8)) {
            return eVar.f3096e;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = eVar.f3092a;
        lineInstance.setText(new h2.b(charSequence.length(), charSequence));
        PriorityQueue priorityQueue = new PriorityQueue(10, new a0.a(2));
        int i = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new c6.f(Integer.valueOf(i), Integer.valueOf(next)));
            } else {
                c6.f fVar = (c6.f) priorityQueue.peek();
                if (fVar != null && ((Number) fVar.f1748e).intValue() - ((Number) fVar.f1747d).intValue() < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new c6.f(Integer.valueOf(i), Integer.valueOf(next)));
                }
            }
            i = next;
        }
        if (priorityQueue.isEmpty()) {
            f6 = 0.0f;
        } else {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            c6.f fVar2 = (c6.f) it.next();
            float desiredWidth = Layout.getDesiredWidth(eVar.b(), ((Number) fVar2.f1747d).intValue(), ((Number) fVar2.f1748e).intValue(), textPaint);
            while (it.hasNext()) {
                c6.f fVar3 = (c6.f) it.next();
                desiredWidth = Math.max(desiredWidth, Layout.getDesiredWidth(eVar.b(), ((Number) fVar3.f1747d).intValue(), ((Number) fVar3.f1748e).intValue(), textPaint));
            }
            f6 = desiredWidth;
        }
        eVar.f3096e = f6;
        return f6;
    }
}
