package t2;

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
import c4.k;
import c4.y;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import k1.e0;
import k1.m;
import kotlin.collections.i0;
import kotlin.collections.z;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import m2.a0;
import m2.h0;
import m2.o;
import m2.r;
import n0.m2;
import p2.c0;
import p2.d0;
import p2.s;
import w2.l;
import w2.p;
import w2.q;
import x2.n;
import z4.v;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c implements o {

    /* renamed from: d, reason: collision with root package name */
    public final String f9226d;

    /* renamed from: e, reason: collision with root package name */
    public final h0 f9227e;

    /* renamed from: i, reason: collision with root package name */
    public final List f9228i;

    /* renamed from: r, reason: collision with root package name */
    public final List f9229r;

    /* renamed from: s, reason: collision with root package name */
    public final p2.h f9230s;

    /* renamed from: t, reason: collision with root package name */
    public final x2.c f9231t;

    /* renamed from: u, reason: collision with root package name */
    public final d f9232u;

    /* renamed from: v, reason: collision with root package name */
    public final CharSequence f9233v;

    /* renamed from: w, reason: collision with root package name */
    public final n2.d f9234w;

    /* renamed from: x, reason: collision with root package name */
    public p.e f9235x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f9236y;

    /* renamed from: z, reason: collision with root package name */
    public final int f9237z;

    /* JADX WARN: Code restructure failed: missing block: B:108:0x03af, code lost:
    
        if ((r6.f6482b.f6503c & 1095216660480L) != 0) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x009d, code lost:
    
        if (r7 == 1) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0689  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x07da  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0857  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0154 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0881 A[LOOP:6: B:299:0x087f->B:300:0x0881, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0892  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:425:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00ab  */
    /* JADX WARN: Type inference failed for: r9v16, types: [android.text.Spannable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c(String str, h0 h0Var, List list, List list2, p2.h hVar, x2.c cVar) {
        boolean booleanValue;
        Locale locale;
        int i3;
        int i10;
        int size;
        int i11;
        Object obj;
        s sVar;
        p2.o oVar;
        String str2;
        s2.b bVar;
        w2.o oVar2;
        p pVar;
        long j;
        long b10;
        boolean z10;
        p2.i iVar;
        w2.o oVar3;
        boolean z11;
        d0 b11;
        Typeface typeface;
        a0 a0Var;
        String str3;
        float textSize;
        List list3;
        x2.c cVar2;
        boolean z12;
        CharSequence charSequence;
        a0 a0Var2;
        m2.p pVar2;
        float f3;
        m2.s sVar2;
        long j3;
        float a02;
        int length;
        q qVar;
        ArrayList arrayList;
        int size2;
        int i12;
        a0 a0Var3;
        ArrayList arrayList2;
        int i13;
        int[] iArr;
        int size3;
        int i14;
        boolean z13;
        q qVar2;
        int size4;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        List list4;
        x2.c cVar3;
        int i20;
        r rVar;
        r rVar2;
        this.f9226d = str;
        this.f9227e = h0Var;
        this.f9228i = list;
        this.f9229r = list2;
        this.f9230s = hVar;
        this.f9231t = cVar;
        float g = cVar.g();
        int i21 = 1;
        d dVar = new d(1);
        ((TextPaint) dVar).density = g;
        dVar.f9239b = l.f10044b;
        dVar.f9240c = 3;
        dVar.f9241d = e0.f5315d;
        this.f9232u = dVar;
        boolean a9 = i.a(h0Var);
        a0 a0Var4 = h0Var.f6481a;
        m2.p pVar3 = h0Var.f6482b;
        if (a9) {
            l.d dVar2 = h.f9250a;
            l.d dVar3 = h.f9250a;
            m2 m2Var = (m2) dVar3.f5643e;
            if (m2Var == null) {
                if (k.c()) {
                    m2Var = dVar3.r();
                    dVar3.f5643e = m2Var;
                } else {
                    m2Var = i.f9251a;
                }
            }
            booleanValue = ((Boolean) m2Var.getValue()).booleanValue();
        } else {
            booleanValue = false;
        }
        this.f9236y = booleanValue;
        int i22 = pVar3.f6502b;
        s2.b bVar2 = a0Var4.f6430k;
        if (i22 != 4) {
            if (i22 != 5) {
                if (i22 == 1) {
                    i3 = 0;
                } else if (i22 == 2) {
                    i3 = 1;
                } else {
                    if (i22 != 3 && i22 != 0) {
                        i0.l("Invalid TextDirection.");
                        throw null;
                    }
                    int layoutDirectionFromLocale = TextUtils.getLayoutDirectionFromLocale((bVar2 == null || (locale = ((s2.a) bVar2.f8410d.get(0)).f8408a) == null) ? Locale.getDefault() : locale);
                    if (layoutDirectionFromLocale != 0) {
                    }
                }
                this.f9237z = i3;
                k5.a aVar = new k5.a(i21, this);
                w2.s sVar3 = pVar3.f6508i;
                sVar3 = sVar3 == null ? w2.s.f10056c : sVar3;
                dVar.setFlags(sVar3.f10059b ? dVar.getFlags() | 128 : dVar.getFlags() & (-129));
                i10 = sVar3.f10058a;
                if (i10 == 1) {
                    dVar.setFlags(dVar.getFlags() | 64);
                    dVar.setHinting(0);
                } else if (i10 == 2) {
                    dVar.getFlags();
                    dVar.setHinting(1);
                } else if (i10 == 3) {
                    dVar.getFlags();
                    dVar.setHinting(0);
                } else {
                    dVar.getFlags();
                }
                size = list.size();
                i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        obj = null;
                        break;
                    }
                    obj = list.get(i11);
                    if (((m2.c) obj).f6439a instanceof a0) {
                        break;
                    } else {
                        i11++;
                    }
                }
                boolean z14 = obj != null;
                long j10 = a0Var4.f6423b;
                sVar = a0Var4.f6424c;
                oVar = a0Var4.f6425d;
                str2 = a0Var4.g;
                bVar = a0Var4.f6430k;
                oVar2 = a0Var4.f6422a;
                pVar = a0Var4.j;
                j = a0Var4.f6428h;
                b10 = n.b(j10);
                z10 = z14;
                if (x2.o.a(b10, 4294967296L)) {
                    dVar.setTextSize(cVar.I(j10));
                } else if (x2.o.a(b10, 8589934592L)) {
                    dVar.setTextSize(n.c(j10) * dVar.getTextSize());
                }
                iVar = a0Var4.f6427f;
                if (iVar != null && oVar == null && sVar == null) {
                    oVar3 = oVar2;
                    z11 = z10;
                } else {
                    s sVar4 = sVar == null ? s.f7645s : sVar;
                    int i23 = oVar != null ? oVar.f7639a : 0;
                    p2.p pVar4 = a0Var4.f6426e;
                    int i24 = pVar4 != null ? pVar4.f7640a : 65535;
                    oVar3 = oVar2;
                    c cVar4 = (c) aVar.f5392e;
                    z11 = z10;
                    b11 = ((p2.j) cVar4.f9230s).b(iVar, sVar4, i23, i24);
                    if (b11 instanceof c0) {
                        Object obj2 = ((c0) b11).f7621d;
                        obj2.getClass();
                        typeface = (Typeface) obj2;
                    } else {
                        p.e eVar = new p.e(b11, cVar4.f9235x);
                        cVar4.f9235x = eVar;
                        Object obj3 = eVar.f7590r;
                        obj3.getClass();
                        typeface = (Typeface) obj3;
                    }
                    dVar.setTypeface(typeface);
                }
                if (bVar != null) {
                    s2.b bVar3 = s2.b.f8409i;
                    if (!bVar.equals(k7.e.t())) {
                        ArrayList arrayList3 = new ArrayList(z.j(bVar, 10));
                        Iterator it = bVar.f8410d.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(((s2.a) it.next()).f8408a);
                        }
                        Locale[] localeArr = (Locale[]) arrayList3.toArray(new Locale[0]);
                        dVar.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
                    }
                }
                if (str2 != null && !str2.equals("")) {
                    dVar.setFontFeatureSettings(str2);
                }
                if (pVar != null && !pVar.equals(p.f10049c)) {
                    dVar.setTextScaleX(dVar.getTextScaleX() * pVar.f10050a);
                    dVar.setTextSkewX(dVar.getTextSkewX() + pVar.f10051b);
                }
                dVar.d(oVar3.b());
                dVar.c(oVar3.c(), 9205357640488583168L, oVar3.a());
                dVar.f(a0Var4.f6433n);
                dVar.g(a0Var4.f6432m);
                dVar.e(a0Var4.f6434o);
                if (!x2.o.a(n.b(j), 4294967296L) && n.c(j) != 0.0f) {
                    float textScaleX = dVar.getTextScaleX() * dVar.getTextSize();
                    float I = cVar.I(j);
                    if (textScaleX != 0.0f) {
                        dVar.setLetterSpacing(I / textScaleX);
                    }
                } else if (x2.o.a(n.b(j), 8589934592L)) {
                    dVar.setLetterSpacing(n.c(j));
                }
                long j11 = a0Var4.f6431l;
                w2.a aVar2 = a0Var4.f6429i;
                boolean z15 = (z11 || !x2.o.a(n.b(j), 4294967296L) || n.c(j) == 0.0f) ? false : true;
                long j12 = k1.p.g;
                boolean z16 = k1.p.c(j11, j12) && !k1.p.c(j11, k1.p.f5340f);
                boolean z17 = aVar2 == null && Float.compare(aVar2.f10023a, 0.0f) != 0;
                a0Var = (!z15 || z16 || z17) ? new a0(0L, 0L, (s) null, (p2.o) null, (p2.p) null, (p2.i) null, (String) null, z15 ? j : n.f10335c, z17 ? aVar2 : null, (p) null, (s2.b) null, z16 ? j11 : j12, (l) null, (e0) null, 63103) : null;
                List list5 = this.f9228i;
                if (a0Var != null) {
                    int size5 = list5.size() + 1;
                    ArrayList arrayList4 = new ArrayList(size5);
                    int i25 = 0;
                    while (i25 < size5) {
                        arrayList4.add(i25 == 0 ? new m2.c(0, this.f9226d.length(), a0Var) : (m2.c) this.f9228i.get(i25 - 1));
                        i25++;
                    }
                    list5 = arrayList4;
                }
                str3 = this.f9226d;
                textSize = this.f9232u.getTextSize();
                h0 h0Var2 = this.f9227e;
                list3 = this.f9229r;
                cVar2 = this.f9231t;
                z12 = this.f9236y;
                a aVar3 = b.f9225a;
                if (z12 || !k.c()) {
                    charSequence = str3;
                } else {
                    m2.s sVar5 = h0Var2.f6483c;
                    m2.h hVar2 = (sVar5 == null || (rVar2 = sVar5.f6513a) == null) ? null : new m2.h(rVar2.f6512b);
                    CharSequence f10 = k.a().f(0, str3.length(), (hVar2 != null && hVar2.f6479a == 2) ? 1 : 0, str3);
                    f10.getClass();
                    charSequence = f10;
                }
                CharSequence charSequence2 = (list5.isEmpty() && list3.isEmpty() && Intrinsics.a(h0Var2.f6482b.f6504d, q.f10052c)) ? charSequence : charSequence2;
                SpannableString spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
                a0Var2 = h0Var2.f6481a;
                pVar2 = h0Var2.f6482b;
                if (Intrinsics.a(a0Var2.f6432m, l.f10045c)) {
                    f3 = 0.0f;
                    spannableString.setSpan(b.f9225a, 0, str3.length(), 33);
                } else {
                    f3 = 0.0f;
                }
                sVar2 = h0Var2.f6483c;
                if (((sVar2 != null || (rVar = sVar2.f6513a) == null) ? false : rVar.f6511a) || pVar2.f6506f != null) {
                    w2.i iVar2 = pVar2.f6506f;
                    iVar2 = iVar2 == null ? w2.i.f10036d : iVar2;
                    j3 = 0;
                    a02 = i7.a.a0(pVar2.f6503c, textSize, cVar2);
                    if (!Float.isNaN(a02)) {
                        if (spannableString.length() != 0) {
                            if (spannableString.length() == 0) {
                                throw new NoSuchElementException("Char sequence is empty.");
                            }
                            if (spannableString.charAt(spannableString.length() - 1) != '\n') {
                                length = spannableString.length();
                                int i26 = length;
                                int i27 = iVar2.f10038b;
                                spannableString.setSpan(new o2.h(a02, i26, (i27 & 1) <= 0, (i27 & 16) <= 0, iVar2.f10037a, iVar2.f10039c), 0, spannableString.length(), 33);
                            }
                        }
                        length = spannableString.length() + 1;
                        int i262 = length;
                        int i272 = iVar2.f10038b;
                        spannableString.setSpan(new o2.h(a02, i262, (i272 & 1) <= 0, (i272 & 16) <= 0, iVar2.f10037a, iVar2.f10039c), 0, spannableString.length(), 33);
                    }
                } else {
                    float a03 = i7.a.a0(pVar2.f6503c, textSize, cVar2);
                    if (!Float.isNaN(a03)) {
                        spannableString.setSpan(new o2.g(a03), 0, spannableString.length(), 33);
                    }
                    j3 = 0;
                }
                qVar = pVar2.f6504d;
                if (qVar != null) {
                    long j13 = qVar.f10053a;
                    long j14 = qVar.f10054b;
                    if ((n.a(j13, v.c(0)) && n.a(j14, v.c(0))) || (j13 & 1095216660480L) == j3 || (j14 & 1095216660480L) == j3) {
                        cVar2 = cVar2;
                    } else {
                        long b12 = n.b(j13);
                        cVar2 = cVar2;
                        float I2 = x2.o.a(b12, 4294967296L) ? cVar2.I(j13) : x2.o.a(b12, 8589934592L) ? n.c(j13) * textSize : f3;
                        long b13 = n.b(j14);
                        spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(I2), (int) Math.ceil(x2.o.a(b13, 4294967296L) ? cVar2.I(j14) : x2.o.a(b13, 8589934592L) ? n.c(j14) * textSize : f3)), 0, spannableString.length(), 33);
                    }
                }
                arrayList = new ArrayList(list5.size());
                size2 = list5.size();
                for (i12 = 0; i12 < size2; i12++) {
                    m2.c cVar5 = (m2.c) list5.get(i12);
                    Object obj4 = cVar5.f6439a;
                    if (obj4 instanceof a0) {
                        a0 a0Var5 = (a0) obj4;
                        if (((a0Var5.f6427f == null && a0Var5.f6425d == null && a0Var5.f6424c == null) ? false : true) || ((a0) obj4).f6426e != null) {
                            arrayList.add(cVar5);
                        }
                    }
                }
                a0 a0Var6 = h0Var2.f6481a;
                p2.i iVar3 = a0Var6.f6427f;
                a0 a0Var7 = ((iVar3 == null || a0Var6.f6425d != null || a0Var6.f6424c != null) && a0Var6.f6426e == null) ? null : new a0(0L, 0L, a0Var6.f6424c, a0Var6.f6425d, a0Var6.f6426e, iVar3, (String) null, 0L, (w2.a) null, (p) null, (s2.b) null, 0L, (l) null, (e0) null, 65475);
                o9.c cVar6 = new o9.c(3, spannableString, aVar);
                if (arrayList.size() > 1) {
                    int size6 = arrayList.size();
                    int i28 = size6 * 2;
                    int[] iArr2 = new int[i28];
                    int size7 = arrayList.size();
                    for (int i29 = 0; i29 < size7; i29++) {
                        m2.c cVar7 = (m2.c) arrayList.get(i29);
                        iArr2[i29] = cVar7.f6440b;
                        iArr2[i29 + size6] = cVar7.f6441c;
                    }
                    if (i28 > 1) {
                        Arrays.sort(iArr2);
                    }
                    if (i28 == 0) {
                        throw new NoSuchElementException("Array is empty.");
                    }
                    int i30 = iArr2[0];
                    int i31 = 0;
                    while (i31 < i28) {
                        int i32 = iArr2[i31];
                        if (i32 == i30) {
                            arrayList2 = arrayList;
                            a0Var3 = a0Var7;
                            i13 = i28;
                            iArr = iArr2;
                        } else {
                            int size8 = arrayList.size();
                            a0Var3 = a0Var7;
                            int i33 = 0;
                            while (i33 < size8) {
                                ArrayList arrayList5 = arrayList;
                                m2.c cVar8 = (m2.c) arrayList.get(i33);
                                int i34 = i28;
                                int i35 = cVar8.f6440b;
                                int[] iArr3 = iArr2;
                                int i36 = cVar8.f6441c;
                                if (i35 != i36 && m2.f.a(i30, i32, i35, i36)) {
                                    a0 a0Var8 = (a0) cVar8.f6439a;
                                    a0Var7 = a0Var7 != null ? a0Var7.c(a0Var8) : a0Var8;
                                }
                                i33++;
                                arrayList = arrayList5;
                                i28 = i34;
                                iArr2 = iArr3;
                            }
                            arrayList2 = arrayList;
                            i13 = i28;
                            iArr = iArr2;
                            if (a0Var7 != null) {
                                cVar6.a(a0Var7, Integer.valueOf(i30), Integer.valueOf(i32));
                            }
                            i30 = i32;
                        }
                        i31++;
                        a0Var7 = a0Var3;
                        arrayList = arrayList2;
                        i28 = i13;
                        iArr2 = iArr;
                    }
                } else if (!arrayList.isEmpty()) {
                    a0 a0Var9 = (a0) ((m2.c) arrayList.get(0)).f6439a;
                    cVar6.a(a0Var7 != null ? a0Var7.c(a0Var9) : a0Var9, Integer.valueOf(((m2.c) arrayList.get(0)).f6440b), Integer.valueOf(((m2.c) arrayList.get(0)).f6441c));
                }
                size3 = list5.size();
                i14 = 0;
                z13 = false;
                while (i14 < size3) {
                    m2.c cVar9 = (m2.c) list5.get(i14);
                    Object obj5 = cVar9.f6439a;
                    if (obj5 instanceof a0) {
                        int i37 = cVar9.f6440b;
                        int i38 = cVar9.f6441c;
                        if (i37 >= 0 && i37 < spannableString.length() && i38 > i37 && i38 <= spannableString.length()) {
                            a0 a0Var10 = (a0) obj5;
                            long j15 = a0Var10.f6428h;
                            w2.a aVar4 = a0Var10.f6429i;
                            w2.o oVar4 = a0Var10.f6422a;
                            if (aVar4 != null) {
                                i18 = size3;
                                i19 = i14;
                                spannableString.setSpan(new o2.a(0, aVar4.f10023a), i37, i38, 33);
                            } else {
                                i18 = size3;
                                i19 = i14;
                            }
                            i7.a.c0(spannableString, oVar4.b(), i37, i38);
                            k1.v c10 = oVar4.c();
                            float a10 = oVar4.a();
                            if (c10 != null) {
                                if (c10 instanceof k1.h0) {
                                    i7.a.c0(spannableString, ((k1.h0) c10).f5325f, i37, i38);
                                } else {
                                    spannableString.setSpan(new v2.b((m) c10, a10), i37, i38, 33);
                                }
                            }
                            l lVar = a0Var10.f6432m;
                            if (lVar != null) {
                                int i39 = lVar.f10046a;
                                o2.k kVar = new o2.k((i39 | 1) == i39, (i39 | 2) == i39);
                                i20 = 33;
                                spannableString.setSpan(kVar, i37, i38, 33);
                            } else {
                                i20 = 33;
                            }
                            int i40 = i20;
                            i7.a.d0(spannableString, a0Var10.f6423b, cVar2, i37, i38);
                            String str4 = a0Var10.g;
                            if (str4 != null) {
                                spannableString.setSpan(new o2.b(0, str4), i37, i38, i40);
                            }
                            p pVar5 = a0Var10.j;
                            if (pVar5 != null) {
                                spannableString.setSpan(new ScaleXSpan(pVar5.f10050a), i37, i38, i40);
                                spannableString.setSpan(new o2.a(1, pVar5.f10051b), i37, i38, i40);
                            }
                            i7.a.e0(spannableString, a0Var10.f6430k, i37, i38);
                            cVar3 = cVar2;
                            long j16 = a0Var10.f6431l;
                            if (j16 != 16) {
                                spannableString.setSpan(new BackgroundColorSpan(k1.v.r(j16)), i37, i38, i40);
                            }
                            e0 e0Var = a0Var10.f6433n;
                            if (e0Var != null) {
                                long j17 = e0Var.f5317b;
                                list4 = list5;
                                int r9 = k1.v.r(e0Var.f5316a);
                                float intBitsToFloat = Float.intBitsToFloat((int) (j17 >> 32));
                                float intBitsToFloat2 = Float.intBitsToFloat((int) (j17 & 4294967295L));
                                float f11 = e0Var.f5318c;
                                o2.j jVar = new o2.j(r9, intBitsToFloat, intBitsToFloat2, f11 == f3 ? Float.MIN_VALUE : f11);
                                i37 = i37;
                                i40 = 33;
                                spannableString.setSpan(jVar, i37, i38, 33);
                            } else {
                                list4 = list5;
                            }
                            m1.c cVar10 = a0Var10.f6434o;
                            if (cVar10 != null) {
                                spannableString.setSpan(new v2.a(cVar10), i37, i38, i40);
                            }
                            if (x2.o.a(n.b(j15), 4294967296L) || x2.o.a(n.b(j15), 8589934592L)) {
                                z13 = true;
                            }
                            i14 = i19 + 1;
                            list5 = list4;
                            size3 = i18;
                            cVar2 = cVar3;
                        }
                    }
                    i18 = size3;
                    i19 = i14;
                    list4 = list5;
                    cVar3 = cVar2;
                    i14 = i19 + 1;
                    list5 = list4;
                    size3 = i18;
                    cVar2 = cVar3;
                }
                List list6 = list5;
                x2.c cVar11 = cVar2;
                if (z13) {
                    int size9 = list6.size();
                    int i41 = 0;
                    while (i41 < size9) {
                        List list7 = list6;
                        m2.c cVar12 = (m2.c) list7.get(i41);
                        m2.b bVar4 = (m2.b) cVar12.f6439a;
                        if (bVar4 instanceof a0) {
                            int i42 = cVar12.f6440b;
                            int i43 = cVar12.f6441c;
                            if (i42 >= 0 && i42 < spannableString.length() && i43 > i42 && i43 <= spannableString.length()) {
                                long j18 = ((a0) bVar4).f6428h;
                                long b14 = n.b(j18);
                                i16 = size9;
                                i17 = i41;
                                Object fVar = x2.o.a(b14, 4294967296L) ? new o2.f(cVar11.I(j18)) : x2.o.a(b14, 8589934592L) ? new o2.e(n.c(j18)) : null;
                                if (fVar != null) {
                                    spannableString.setSpan(fVar, i42, i43, 33);
                                }
                                i41 = i17 + 1;
                                list6 = list7;
                                size9 = i16;
                            }
                        }
                        i16 = size9;
                        i17 = i41;
                        i41 = i17 + 1;
                        list6 = list7;
                        size9 = i16;
                    }
                }
                List list8 = list6;
                qVar2 = pVar2.f6504d;
                if (qVar2 != null) {
                    long j19 = qVar2.f10053a;
                    long b15 = n.b(j19);
                    if (x2.o.a(b15, 4294967296L)) {
                        cVar11.I(j19);
                    } else if (x2.o.a(b15, 8589934592L)) {
                        n.c(j19);
                    }
                }
                size4 = list8.size();
                for (i15 = 0; i15 < size4; i15++) {
                    Object obj6 = ((m2.c) list8.get(i15)).f6439a;
                }
                charSequence2 = spannableString;
                if (list3.size() > 0) {
                    m2.c cVar13 = (m2.c) list3.get(0);
                    if (cVar13.f6439a != null) {
                        i0.j();
                        throw null;
                    }
                    for (Object obj7 : spannableString.getSpans(cVar13.f6440b, cVar13.f6441c, y.class)) {
                        spannableString.removeSpan((y) obj7);
                    }
                    throw null;
                }
                this.f9233v = charSequence2;
                this.f9234w = new n2.d(charSequence2, this.f9232u, this.f9237z);
            }
            i3 = 3;
            this.f9237z = i3;
            k5.a aVar5 = new k5.a(i21, this);
            w2.s sVar32 = pVar3.f6508i;
            if (sVar32 == null) {
            }
            dVar.setFlags(sVar32.f10059b ? dVar.getFlags() | 128 : dVar.getFlags() & (-129));
            i10 = sVar32.f10058a;
            if (i10 == 1) {
            }
            size = list.size();
            i11 = 0;
            while (true) {
                if (i11 >= size) {
                }
                i11++;
            }
            if (obj != null) {
            }
            long j102 = a0Var4.f6423b;
            sVar = a0Var4.f6424c;
            oVar = a0Var4.f6425d;
            str2 = a0Var4.g;
            bVar = a0Var4.f6430k;
            oVar2 = a0Var4.f6422a;
            pVar = a0Var4.j;
            j = a0Var4.f6428h;
            b10 = n.b(j102);
            z10 = z14;
            if (x2.o.a(b10, 4294967296L)) {
            }
            iVar = a0Var4.f6427f;
            if (iVar != null) {
            }
            if (sVar == null) {
            }
            if (oVar != null) {
            }
            p2.p pVar42 = a0Var4.f6426e;
            if (pVar42 != null) {
            }
            oVar3 = oVar2;
            c cVar42 = (c) aVar5.f5392e;
            z11 = z10;
            b11 = ((p2.j) cVar42.f9230s).b(iVar, sVar4, i23, i24);
            if (b11 instanceof c0) {
            }
            dVar.setTypeface(typeface);
            if (bVar != null) {
            }
            if (str2 != null) {
                dVar.setFontFeatureSettings(str2);
            }
            if (pVar != null) {
                dVar.setTextScaleX(dVar.getTextScaleX() * pVar.f10050a);
                dVar.setTextSkewX(dVar.getTextSkewX() + pVar.f10051b);
            }
            dVar.d(oVar3.b());
            dVar.c(oVar3.c(), 9205357640488583168L, oVar3.a());
            dVar.f(a0Var4.f6433n);
            dVar.g(a0Var4.f6432m);
            dVar.e(a0Var4.f6434o);
            if (!x2.o.a(n.b(j), 4294967296L)) {
            }
            if (x2.o.a(n.b(j), 8589934592L)) {
            }
            long j112 = a0Var4.f6431l;
            w2.a aVar22 = a0Var4.f6429i;
            if (z11) {
            }
            long j122 = k1.p.g;
            if (k1.p.c(j112, j122)) {
            }
            if (aVar22 == null) {
            }
            if (z15) {
            }
            List list52 = this.f9228i;
            if (a0Var != null) {
            }
            str3 = this.f9226d;
            textSize = this.f9232u.getTextSize();
            h0 h0Var22 = this.f9227e;
            list3 = this.f9229r;
            cVar2 = this.f9231t;
            z12 = this.f9236y;
            a aVar32 = b.f9225a;
            if (z12) {
            }
            charSequence = str3;
            if (list52.isEmpty()) {
            }
            if (charSequence instanceof Spannable) {
            }
            a0Var2 = h0Var22.f6481a;
            pVar2 = h0Var22.f6482b;
            if (Intrinsics.a(a0Var2.f6432m, l.f10045c)) {
            }
            sVar2 = h0Var22.f6483c;
            if ((sVar2 != null || (rVar = sVar2.f6513a) == null) ? false : rVar.f6511a) {
            }
            w2.i iVar22 = pVar2.f6506f;
            if (iVar22 == null) {
            }
            j3 = 0;
            a02 = i7.a.a0(pVar2.f6503c, textSize, cVar2);
            if (!Float.isNaN(a02)) {
            }
            qVar = pVar2.f6504d;
            if (qVar != null) {
            }
            arrayList = new ArrayList(list52.size());
            size2 = list52.size();
            while (i12 < size2) {
            }
            a0 a0Var62 = h0Var22.f6481a;
            p2.i iVar32 = a0Var62.f6427f;
            if (iVar32 == null || a0Var62.f6425d != null || a0Var62.f6424c != null) {
            }
            o9.c cVar62 = new o9.c(3, spannableString, aVar5);
            if (arrayList.size() > 1) {
            }
            size3 = list52.size();
            i14 = 0;
            z13 = false;
            while (i14 < size3) {
            }
            List list62 = list52;
            x2.c cVar112 = cVar2;
            if (z13) {
            }
            List list82 = list62;
            qVar2 = pVar2.f6504d;
            if (qVar2 != null) {
            }
            size4 = list82.size();
            while (i15 < size4) {
            }
            charSequence2 = spannableString;
            if (list3.size() > 0) {
            }
            this.f9233v = charSequence2;
            this.f9234w = new n2.d(charSequence2, this.f9232u, this.f9237z);
        }
        i3 = 2;
        this.f9237z = i3;
        k5.a aVar52 = new k5.a(i21, this);
        w2.s sVar322 = pVar3.f6508i;
        if (sVar322 == null) {
        }
        dVar.setFlags(sVar322.f10059b ? dVar.getFlags() | 128 : dVar.getFlags() & (-129));
        i10 = sVar322.f10058a;
        if (i10 == 1) {
        }
        size = list.size();
        i11 = 0;
        while (true) {
            if (i11 >= size) {
            }
            i11++;
        }
        if (obj != null) {
        }
        long j1022 = a0Var4.f6423b;
        sVar = a0Var4.f6424c;
        oVar = a0Var4.f6425d;
        str2 = a0Var4.g;
        bVar = a0Var4.f6430k;
        oVar2 = a0Var4.f6422a;
        pVar = a0Var4.j;
        j = a0Var4.f6428h;
        b10 = n.b(j1022);
        z10 = z14;
        if (x2.o.a(b10, 4294967296L)) {
        }
        iVar = a0Var4.f6427f;
        if (iVar != null) {
        }
        if (sVar == null) {
        }
        if (oVar != null) {
        }
        p2.p pVar422 = a0Var4.f6426e;
        if (pVar422 != null) {
        }
        oVar3 = oVar2;
        c cVar422 = (c) aVar52.f5392e;
        z11 = z10;
        b11 = ((p2.j) cVar422.f9230s).b(iVar, sVar4, i23, i24);
        if (b11 instanceof c0) {
        }
        dVar.setTypeface(typeface);
        if (bVar != null) {
        }
        if (str2 != null) {
        }
        if (pVar != null) {
        }
        dVar.d(oVar3.b());
        dVar.c(oVar3.c(), 9205357640488583168L, oVar3.a());
        dVar.f(a0Var4.f6433n);
        dVar.g(a0Var4.f6432m);
        dVar.e(a0Var4.f6434o);
        if (!x2.o.a(n.b(j), 4294967296L)) {
        }
        if (x2.o.a(n.b(j), 8589934592L)) {
        }
        long j1122 = a0Var4.f6431l;
        w2.a aVar222 = a0Var4.f6429i;
        if (z11) {
        }
        long j1222 = k1.p.g;
        if (k1.p.c(j1122, j1222)) {
        }
        if (aVar222 == null) {
        }
        if (z15) {
        }
        List list522 = this.f9228i;
        if (a0Var != null) {
        }
        str3 = this.f9226d;
        textSize = this.f9232u.getTextSize();
        h0 h0Var222 = this.f9227e;
        list3 = this.f9229r;
        cVar2 = this.f9231t;
        z12 = this.f9236y;
        a aVar322 = b.f9225a;
        if (z12) {
        }
        charSequence = str3;
        if (list522.isEmpty()) {
        }
        if (charSequence instanceof Spannable) {
        }
        a0Var2 = h0Var222.f6481a;
        pVar2 = h0Var222.f6482b;
        if (Intrinsics.a(a0Var2.f6432m, l.f10045c)) {
        }
        sVar2 = h0Var222.f6483c;
        if ((sVar2 != null || (rVar = sVar2.f6513a) == null) ? false : rVar.f6511a) {
        }
        w2.i iVar222 = pVar2.f6506f;
        if (iVar222 == null) {
        }
        j3 = 0;
        a02 = i7.a.a0(pVar2.f6503c, textSize, cVar2);
        if (!Float.isNaN(a02)) {
        }
        qVar = pVar2.f6504d;
        if (qVar != null) {
        }
        arrayList = new ArrayList(list522.size());
        size2 = list522.size();
        while (i12 < size2) {
        }
        a0 a0Var622 = h0Var222.f6481a;
        p2.i iVar322 = a0Var622.f6427f;
        if (iVar322 == null || a0Var622.f6425d != null || a0Var622.f6424c != null) {
        }
        o9.c cVar622 = new o9.c(3, spannableString, aVar52);
        if (arrayList.size() > 1) {
        }
        size3 = list522.size();
        i14 = 0;
        z13 = false;
        while (i14 < size3) {
        }
        List list622 = list522;
        x2.c cVar1122 = cVar2;
        if (z13) {
        }
        List list822 = list622;
        qVar2 = pVar2.f6504d;
        if (qVar2 != null) {
        }
        size4 = list822.size();
        while (i15 < size4) {
        }
        charSequence2 = spannableString;
        if (list3.size() > 0) {
        }
        this.f9233v = charSequence2;
        this.f9234w = new n2.d(charSequence2, this.f9232u, this.f9237z);
    }

    public final float a() {
        float f3;
        n2.d dVar = this.f9234w;
        float f10 = dVar.f7000e;
        TextPaint textPaint = dVar.f6997b;
        if (!Float.isNaN(f10)) {
            return dVar.f7000e;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = dVar.f6996a;
        lineInstance.setText(new n2.a(charSequence.length(), charSequence));
        PriorityQueue priorityQueue = new PriorityQueue(10, n2.e.f7003a);
        int i3 = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new IntRange(i3, next, 1));
            } else {
                IntRange intRange = (IntRange) priorityQueue.peek();
                if (intRange != null && intRange.f5600e - intRange.f5599d < next - i3) {
                    priorityQueue.poll();
                    priorityQueue.add(new IntRange(i3, next, 1));
                }
            }
            i3 = next;
        }
        if (priorityQueue.isEmpty()) {
            f3 = 0.0f;
        } else {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                i0.c();
                return 0.0f;
            }
            IntRange intRange2 = (IntRange) it.next();
            float desiredWidth = Layout.getDesiredWidth(dVar.b(), intRange2.f5599d, intRange2.f5600e, textPaint);
            while (it.hasNext()) {
                IntRange intRange3 = (IntRange) it.next();
                desiredWidth = Math.max(desiredWidth, Layout.getDesiredWidth(dVar.b(), intRange3.f5599d, intRange3.f5600e, textPaint));
            }
            f3 = desiredWidth;
        }
        dVar.f7000e = f3;
        return f3;
    }

    @Override // m2.o
    public final boolean b() {
        p.e eVar = this.f9235x;
        if (eVar != null ? eVar.f() : false) {
            return true;
        }
        if (!this.f9236y && i.a(this.f9227e)) {
            l.d dVar = h.f9250a;
            l.d dVar2 = h.f9250a;
            m2 m2Var = (m2) dVar2.f5643e;
            if (m2Var == null) {
                if (k.c()) {
                    m2Var = dVar2.r();
                    dVar2.f5643e = m2Var;
                } else {
                    m2Var = i.f9251a;
                }
            }
            if (((Boolean) m2Var.getValue()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // m2.o
    public final float h() {
        return this.f9234w.c();
    }
}
