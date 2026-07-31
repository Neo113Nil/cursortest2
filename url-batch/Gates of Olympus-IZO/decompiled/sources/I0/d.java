package I0;

import B0.AbstractC0008e;
import B0.C;
import B0.C0005b;
import B0.n;
import B0.o;
import B0.q;
import B0.w;
import C0.p;
import D1.C0014b;
import F0.r;
import F0.t;
import I.X0;
import L0.l;
import L0.m;
import a.AbstractC0157a;
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
import b0.AbstractC0259J;
import b0.C0262M;
import b0.C0265P;
import b0.C0284q;
import b0.C0288u;
import d0.AbstractC0322c;
import h2.AbstractC0447i;
import j1.C0518i;
import j1.u;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

/* loaded from: classes.dex */
public final class d implements n {

    /* renamed from: a, reason: collision with root package name */
    public final String f2428a;

    /* renamed from: b, reason: collision with root package name */
    public final C f2429b;

    /* renamed from: c, reason: collision with root package name */
    public final List f2430c;

    /* renamed from: d, reason: collision with root package name */
    public final List f2431d;

    /* renamed from: e, reason: collision with root package name */
    public final F0.e f2432e;

    /* renamed from: f, reason: collision with root package name */
    public final M0.b f2433f;

    /* renamed from: g, reason: collision with root package name */
    public final e f2434g;

    /* renamed from: h, reason: collision with root package name */
    public final CharSequence f2435h;

    /* renamed from: i, reason: collision with root package name */
    public final p f2436i;

    /* renamed from: j, reason: collision with root package name */
    public C0014b f2437j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f2438k;

    /* renamed from: l, reason: collision with root package name */
    public final int f2439l;

    /* JADX WARN: Code restructure failed: missing block: B:516:0x00b5, code lost:
    
        if (r4 == 1) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02cf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x064c  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x068e  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0779  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x08b9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0936  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d(String str, C c3, List list, List list2, F0.e eVar, M0.b bVar) {
        Locale locale;
        int i3;
        int i4;
        w wVar;
        boolean a3;
        r rVar;
        H0.b bVar2;
        String str2;
        L0.k kVar;
        long j3;
        w wVar2;
        C c4;
        boolean z3;
        Spannable spannable;
        long b2;
        float f3;
        float c5;
        float f4;
        int i5;
        l lVar;
        c cVar;
        List list3;
        ArrayList arrayList;
        int size;
        int i6;
        ArrayList arrayList2;
        w wVar3;
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
        j1.w wVar4;
        int i14;
        u[] uVarArr;
        int i15;
        C0005b c0005b;
        H0.b bVar3;
        Typeface typeface;
        this.f2428a = str;
        this.f2429b = c3;
        List list4 = list;
        this.f2430c = list4;
        this.f2431d = list2;
        this.f2432e = eVar;
        this.f2433f = bVar;
        float a4 = bVar.a();
        e eVar2 = new e(1);
        ((TextPaint) eVar2).density = a4;
        eVar2.f2441b = L0.g.f2682b;
        eVar2.f2442c = 3;
        eVar2.f2443d = C0262M.f4239d;
        this.f2434g = eVar2;
        B0.r rVar2 = c3.f237c;
        A2.g gVar = i.f2452a;
        A2.g gVar2 = i.f2452a;
        X0 x02 = (X0) gVar2.f83b;
        if (x02 == null) {
            if (C0518i.f5255k != null) {
                x02 = gVar2.m();
                gVar2.f83b = x02;
            } else {
                x02 = j.f2453a;
            }
        }
        this.f2438k = ((Boolean) x02.getValue()).booleanValue();
        int i16 = c3.f236b.f289b;
        H0.b bVar4 = c3.f235a.f375k;
        if (!L0.h.a(i16, 4)) {
            if (!L0.h.a(i16, 5)) {
                if (L0.h.a(i16, 1)) {
                    i3 = 0;
                } else if (L0.h.a(i16, 2)) {
                    i3 = 1;
                } else {
                    if (!(L0.h.a(i16, 3) ? true : L0.h.a(i16, Integer.MIN_VALUE))) {
                        throw new IllegalStateException("Invalid TextDirection.");
                    }
                    int layoutDirectionFromLocale = TextUtils.getLayoutDirectionFromLocale((bVar4 == null || (locale = ((H0.a) bVar4.f1849d.get(0)).f1847a) == null) ? Locale.getDefault() : locale);
                    if (layoutDirectionFromLocale != 0) {
                    }
                }
                this.f2439l = i3;
                c cVar2 = new c(0, this);
                m mVar = c3.f236b.f296i;
                mVar = mVar == null ? m.f2693c : mVar;
                eVar2.setFlags(mVar.f2696b ? eVar2.getFlags() | 128 : eVar2.getFlags() & (-129));
                i4 = mVar.f2695a;
                if (i4 == 1) {
                    eVar2.setFlags(eVar2.getFlags() | 64);
                    eVar2.setHinting(0);
                } else if (i4 == 2) {
                    eVar2.getFlags();
                    eVar2.setHinting(1);
                } else if (i4 == 3) {
                    eVar2.getFlags();
                    eVar2.setHinting(0);
                } else {
                    eVar2.getFlags();
                }
                wVar = c3.f235a;
                boolean isEmpty = list.isEmpty();
                long b3 = M0.l.b(wVar.f366b);
                a3 = M0.m.a(b3, 4294967296L);
                long j4 = wVar.f366b;
                if (a3) {
                    eVar2.setTextSize(bVar.G(j4));
                } else if (M0.m.a(b3, 8589934592L)) {
                    eVar2.setTextSize(M0.l.c(j4) * eVar2.getTextSize());
                }
                rVar = wVar.f370f;
                if ((rVar != null && wVar.f368d == null && wVar.f367c == null) ? false : true) {
                    F0.l lVar2 = wVar.f367c;
                    lVar2 = lVar2 == null ? F0.l.f1454f : lVar2;
                    F0.j jVar = wVar.f368d;
                    int i17 = jVar != null ? jVar.f1451a : 0;
                    F0.k kVar2 = wVar.f369e;
                    t b4 = ((F0.f) eVar).b(rVar, lVar2, i17, kVar2 != null ? kVar2.f1452a : 1);
                    if (b4 instanceof t) {
                        Object obj = b4.f1468d;
                        Z1.i.d(obj, "null cannot be cast to non-null type android.graphics.Typeface");
                        typeface = (Typeface) obj;
                    } else {
                        C0014b c0014b = new C0014b(b4, this.f2437j);
                        this.f2437j = c0014b;
                        Object obj2 = c0014b.f538d;
                        Z1.i.d(obj2, "null cannot be cast to non-null type android.graphics.Typeface");
                        typeface = (Typeface) obj2;
                    }
                    eVar2.setTypeface(typeface);
                }
                bVar2 = wVar.f375k;
                if (bVar2 != null) {
                    H0.b bVar5 = H0.b.f1848f;
                    C0014b c0014b2 = H0.c.f1851a;
                    c0014b2.getClass();
                    LocaleList localeList = LocaleList.getDefault();
                    synchronized (((F0.a) c0014b2.f538d)) {
                        try {
                            bVar3 = (H0.b) c0014b2.f537c;
                            if (bVar3 == null || localeList != ((LocaleList) c0014b2.f536b)) {
                                int size3 = localeList.size();
                                ArrayList arrayList3 = new ArrayList(size3);
                                for (int i18 = 0; i18 < size3; i18++) {
                                    arrayList3.add(new H0.a(localeList.get(i18)));
                                }
                                bVar3 = new H0.b(arrayList3);
                                c0014b2.f536b = localeList;
                                c0014b2.f537c = bVar3;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (!bVar2.equals(bVar3)) {
                        J0.a.f2579a.b(eVar2, bVar2);
                    }
                }
                str2 = wVar.f371g;
                if (str2 != null && !str2.equals("")) {
                    eVar2.setFontFeatureSettings(str2);
                }
                kVar = wVar.f374j;
                if (kVar != null && !kVar.equals(L0.k.f2687c)) {
                    eVar2.setTextScaleX(eVar2.getTextScaleX() * kVar.f2688a);
                    eVar2.setTextSkewX(eVar2.getTextSkewX() + kVar.f2689b);
                }
                L0.j jVar2 = wVar.f365a;
                eVar2.d(jVar2.b());
                eVar2.c(jVar2.c(), 9205357640488583168L, jVar2.a());
                eVar2.f(wVar.f378n);
                eVar2.g(wVar.f377m);
                eVar2.e(wVar.f379o);
                j3 = wVar.f372h;
                if (!M0.m.a(M0.l.b(j3), 4294967296L) && M0.l.c(j3) != 0.0f) {
                    float textScaleX = eVar2.getTextScaleX() * eVar2.getTextSize();
                    float G3 = bVar.G(j3);
                    if (textScaleX != 0.0f) {
                        eVar2.setLetterSpacing(G3 / textScaleX);
                    }
                } else if (M0.m.a(M0.l.b(j3), 8589934592L)) {
                    eVar2.setLetterSpacing(M0.l.c(j3));
                }
                boolean z5 = isEmpty && M0.m.a(M0.l.b(j3), 4294967296L) && M0.l.c(j3) != 0.0f;
                long j5 = C0288u.f4296f;
                long j6 = wVar.f376l;
                boolean z6 = C0288u.c(j6, j5) && !C0288u.c(j6, C0288u.f4295e);
                L0.a aVar = wVar.f373i;
                boolean z7 = aVar == null && Float.compare(aVar.f2671a, 0.0f) != 0;
                wVar2 = (!z5 || z6 || z7) ? new w(0L, 0L, (F0.l) null, (F0.j) null, (F0.k) null, (r) null, (String) null, z5 ? j3 : M0.l.f2780c, z7 ? aVar : null, (L0.k) null, (H0.b) null, z6 ? j6 : j5, (L0.g) null, (C0262M) null, 63103) : null;
                if (wVar2 != null) {
                    int size4 = list.size() + 1;
                    ArrayList arrayList4 = new ArrayList(size4);
                    int i19 = 0;
                    while (i19 < size4) {
                        if (i19 == 0) {
                            c0005b = new C0005b(wVar2, 0, this.f2428a.length());
                            i15 = 1;
                        } else {
                            i15 = 1;
                            c0005b = (C0005b) this.f2430c.get(i19 - 1);
                        }
                        arrayList4.add(c0005b);
                        i19 += i15;
                    }
                    list4 = arrayList4;
                }
                String str3 = this.f2428a;
                float textSize = this.f2434g.getTextSize();
                c4 = this.f2429b;
                List list5 = this.f2431d;
                M0.b bVar6 = this.f2433f;
                z3 = this.f2438k;
                a aVar2 = b.f2425a;
                if (z3) {
                    if (C0518i.f5255k != null) {
                        B0.r rVar3 = c4.f237c;
                        if (rVar3 != null) {
                            q qVar = rVar3.f299a;
                        }
                        C0518i a5 = C0518i.a();
                        int length = str3.length();
                        if (!(a5.b() == 1)) {
                            throw new IllegalStateException("Not initialized yet");
                        }
                        if (length < 0) {
                            throw new IllegalArgumentException("end cannot be negative");
                        }
                        if (!(length >= 0)) {
                            throw new IllegalArgumentException("start should be <= than end");
                        }
                        if (!(str3.length() >= 0)) {
                            throw new IllegalArgumentException("start should be < than charSequence length");
                        }
                        if (!(length <= str3.length())) {
                            throw new IllegalArgumentException("end should be < than charSequence length");
                        }
                        if (str3.length() != 0 && length != 0) {
                            C0014b c0014b3 = a5.f5260e.f5250b;
                            c0014b3.getClass();
                            if (str3 instanceof Spannable) {
                                wVar4 = new j1.w((Spannable) str3);
                            } else if (!(str3 instanceof Spanned) || ((Spanned) str3).nextSpanTransition(-1, length + 1, u.class) > length) {
                                wVar4 = null;
                            } else {
                                wVar4 = new j1.w();
                                wVar4.f5297a = false;
                                wVar4.f5298b = new SpannableString(str3);
                            }
                            if (wVar4 == null || (uVarArr = (u[]) wVar4.f5298b.getSpans(0, length, u.class)) == null || uVarArr.length <= 0) {
                                i14 = 0;
                            } else {
                                int length2 = uVarArr.length;
                                i14 = 0;
                                int i20 = 0;
                                while (i20 < length2) {
                                    int i21 = length2;
                                    u uVar = uVarArr[i20];
                                    u[] uVarArr2 = uVarArr;
                                    int spanStart = wVar4.f5298b.getSpanStart(uVar);
                                    int spanEnd = wVar4.f5298b.getSpanEnd(uVar);
                                    if (spanStart != length) {
                                        wVar4.removeSpan(uVar);
                                    }
                                    i14 = Math.min(spanStart, i14);
                                    length = Math.max(spanEnd, length);
                                    i20++;
                                    uVarArr = uVarArr2;
                                    length2 = i21;
                                }
                            }
                            if (i14 != length && i14 < str3.length()) {
                                j1.w wVar5 = (j1.w) c0014b3.s(str3, i14, length, Integer.MAX_VALUE, false, new C2.c(wVar4, 6, (F0.a) c0014b3.f536b));
                                if (wVar5 != null) {
                                    spannable = wVar5.f5298b;
                                    Z1.i.c(spannable);
                                    if (list4.isEmpty() || !list5.isEmpty() || !Z1.i.a(c4.f236b.f291d, l.f2690c) || !AbstractC0157a.L(c4.f236b.f290c)) {
                                        spannable = spannable instanceof Spannable ? spannable : new SpannableString(spannable);
                                        if (Z1.i.a(c4.f235a.f377m, L0.g.f2683c)) {
                                            spannable.setSpan(b.f2425a, 0, str3.length(), 33);
                                        }
                                        o oVar = c4.f236b;
                                        L0.e eVar3 = oVar.f293f;
                                        eVar3 = eVar3 == null ? L0.e.f2678c : eVar3;
                                        long j7 = oVar.f290c;
                                        b2 = M0.l.b(j7);
                                        if (M0.m.a(b2, 4294967296L)) {
                                            if (bVar6.p() > 1.05d) {
                                                c5 = M0.l.c(j7) / M0.l.c(bVar6.R(textSize));
                                                f3 = c5 * textSize;
                                                f4 = f3;
                                                if (Float.isNaN(f4)) {
                                                    int length3 = (spannable.length() == 0 || AbstractC0447i.u0(spannable) == '\n') ? spannable.length() + 1 : spannable.length();
                                                    int i22 = eVar3.f2680b;
                                                    i5 = 0;
                                                    spannable.setSpan(new D0.g(f4, length3, (i22 & 1) > 0, (i22 & 16) > 0, eVar3.f2679a), 0, spannable.length(), 33);
                                                } else {
                                                    i5 = 0;
                                                }
                                                lVar = c4.f236b.f291d;
                                                if (lVar == null) {
                                                    long I3 = AbstractC0157a.I(i5);
                                                    long j8 = lVar.f2691a;
                                                    boolean a6 = M0.l.a(j8, I3);
                                                    long j9 = lVar.f2692b;
                                                    cVar = cVar2;
                                                    list3 = list5;
                                                    if ((!a6 || !M0.l.a(j9, AbstractC0157a.I(i5))) && !AbstractC0157a.L(j8) && !AbstractC0157a.L(j9)) {
                                                        long b5 = M0.l.b(j8);
                                                        float G4 = M0.m.a(b5, 4294967296L) ? bVar6.G(j8) : M0.m.a(b5, 8589934592L) ? M0.l.c(j8) * textSize : 0.0f;
                                                        long b6 = M0.l.b(j9);
                                                        spannable.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(G4), (int) Math.ceil(M0.m.a(b6, 4294967296L) ? bVar6.G(j9) : M0.m.a(b6, 8589934592L) ? M0.l.c(j9) * textSize : 0.0f)), 0, spannable.length(), 33);
                                                    }
                                                } else {
                                                    cVar = cVar2;
                                                    list3 = list5;
                                                }
                                                arrayList = new ArrayList(list4.size());
                                                size = list4.size();
                                                for (i6 = 0; i6 < size; i6++) {
                                                    Object obj3 = list4.get(i6);
                                                    Object obj4 = ((C0005b) obj3).f246a;
                                                    w wVar6 = (w) obj4;
                                                    if (((wVar6.f370f == null && wVar6.f368d == null && wVar6.f367c == null) ? false : true) || ((w) obj4).f369e != null) {
                                                        arrayList.add(obj3);
                                                    }
                                                }
                                                w wVar7 = c4.f235a;
                                                r rVar4 = wVar7.f370f;
                                                w wVar8 = ((rVar4 == null || wVar7.f368d != null || wVar7.f367c != null) && wVar7.f369e == null) ? null : new w(0L, 0L, wVar7.f367c, wVar7.f368d, wVar7.f369e, rVar4, (String) null, 0L, (L0.a) null, (L0.k) null, (H0.b) null, 0L, (L0.g) null, (C0262M) null, 65475);
                                                J0.b bVar7 = new J0.b(spannable, 0, cVar);
                                                if (arrayList.size() <= 1) {
                                                    int size5 = arrayList.size();
                                                    int i23 = size5 * 2;
                                                    Integer[] numArr2 = new Integer[i23];
                                                    for (int i24 = 0; i24 < i23; i24++) {
                                                        numArr2[i24] = 0;
                                                    }
                                                    int size6 = arrayList.size();
                                                    for (int i25 = 0; i25 < size6; i25++) {
                                                        C0005b c0005b2 = (C0005b) arrayList.get(i25);
                                                        numArr2[i25] = Integer.valueOf(c0005b2.f247b);
                                                        numArr2[i25 + size5] = Integer.valueOf(c0005b2.f248c);
                                                    }
                                                    Integer[] numArr3 = numArr2;
                                                    if (numArr3.length > 1) {
                                                        Arrays.sort(numArr3);
                                                    }
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
                                                            wVar3 = wVar8;
                                                            numArr = numArr2;
                                                            i7 = 1;
                                                        } else {
                                                            int size7 = arrayList.size();
                                                            w wVar9 = wVar8;
                                                            int i27 = 0;
                                                            while (i27 < size7) {
                                                                ArrayList arrayList5 = arrayList;
                                                                C0005b c0005b3 = (C0005b) arrayList.get(i27);
                                                                w wVar10 = wVar8;
                                                                int i28 = c0005b3.f247b;
                                                                Integer[] numArr4 = numArr2;
                                                                int i29 = c0005b3.f248c;
                                                                if (i28 != i29 && AbstractC0008e.b(intValue, intValue2, i28, i29)) {
                                                                    w wVar11 = (w) c0005b3.f246a;
                                                                    wVar9 = wVar9 != null ? wVar9.c(wVar11) : wVar11;
                                                                }
                                                                i27++;
                                                                arrayList = arrayList5;
                                                                wVar8 = wVar10;
                                                                numArr2 = numArr4;
                                                            }
                                                            arrayList2 = arrayList;
                                                            wVar3 = wVar8;
                                                            numArr = numArr2;
                                                            i7 = 1;
                                                            if (wVar9 != null) {
                                                                bVar7.f(wVar9, Integer.valueOf(intValue), num);
                                                            }
                                                            intValue = intValue2;
                                                        }
                                                        i26 += i7;
                                                        arrayList = arrayList2;
                                                        wVar8 = wVar3;
                                                        numArr2 = numArr;
                                                    }
                                                } else if (!arrayList.isEmpty()) {
                                                    w wVar12 = (w) ((C0005b) arrayList.get(0)).f246a;
                                                    bVar7.f(wVar8 != null ? wVar8.c(wVar12) : wVar12, Integer.valueOf(((C0005b) arrayList.get(0)).f247b), Integer.valueOf(((C0005b) arrayList.get(0)).f248c));
                                                }
                                                size2 = list4.size();
                                                z4 = false;
                                                for (i8 = 0; i8 < size2; i8++) {
                                                    C0005b c0005b4 = (C0005b) list4.get(i8);
                                                    int i30 = c0005b4.f247b;
                                                    if (i30 >= 0 && i30 < spannable.length() && (i11 = c0005b4.f248c) > i30 && i11 <= spannable.length()) {
                                                        w wVar13 = (w) c0005b4.f246a;
                                                        L0.a aVar3 = wVar13.f373i;
                                                        int i31 = c0005b4.f247b;
                                                        int i32 = c0005b4.f248c;
                                                        if (aVar3 != null) {
                                                            spannable.setSpan(new D0.a(aVar3.f2671a, 0), i31, i32, 33);
                                                        }
                                                        L0.j jVar3 = wVar13.f365a;
                                                        AbstractC0157a.S(spannable, jVar3.b(), i31, i32);
                                                        AbstractC0259J c6 = jVar3.c();
                                                        float a7 = jVar3.a();
                                                        if (c6 != null) {
                                                            if (c6 instanceof C0265P) {
                                                                AbstractC0157a.S(spannable, ((C0265P) c6).f4257e, i31, i32);
                                                            } else {
                                                                spannable.setSpan(new K0.b((C0284q) c6, a7), i31, i32, 33);
                                                            }
                                                        }
                                                        L0.g gVar3 = wVar13.f377m;
                                                        if (gVar3 != null) {
                                                            int i33 = gVar3.f2684a;
                                                            spannable.setSpan(new D0.j((i33 | 1) == i33, (i33 | 2) == i33), i31, i32, 33);
                                                        }
                                                        AbstractC0157a.U(spannable, wVar13.f366b, bVar6, i31, i32);
                                                        String str4 = wVar13.f371g;
                                                        if (str4 != null) {
                                                            D0.b bVar8 = new D0.b(0, str4);
                                                            i12 = 33;
                                                            spannable.setSpan(bVar8, i31, i32, 33);
                                                        } else {
                                                            i12 = 33;
                                                        }
                                                        L0.k kVar3 = wVar13.f374j;
                                                        if (kVar3 != null) {
                                                            spannable.setSpan(new ScaleXSpan(kVar3.f2688a), i31, i32, i12);
                                                            spannable.setSpan(new D0.a(kVar3.f2689b, 1), i31, i32, i12);
                                                        }
                                                        H0.b bVar9 = wVar13.f375k;
                                                        if (bVar9 != null) {
                                                            spannable.setSpan(J0.a.f2579a.a(bVar9), i31, i32, i12);
                                                        }
                                                        long j10 = wVar13.f376l;
                                                        if (j10 != 16) {
                                                            spannable.setSpan(new BackgroundColorSpan(AbstractC0259J.E(j10)), i31, i32, 33);
                                                        }
                                                        C0262M c0262m = wVar13.f378n;
                                                        if (c0262m != null) {
                                                            int E3 = AbstractC0259J.E(c0262m.f4240a);
                                                            long j11 = c0262m.f4241b;
                                                            float d3 = a0.c.d(j11);
                                                            float e3 = a0.c.e(j11);
                                                            float f5 = c0262m.f4242c;
                                                            D0.i iVar = new D0.i(E3, d3, e3, f5 == 0.0f ? Float.MIN_VALUE : f5);
                                                            i13 = 33;
                                                            spannable.setSpan(iVar, i31, i32, 33);
                                                        } else {
                                                            i13 = 33;
                                                        }
                                                        AbstractC0322c abstractC0322c = wVar13.f379o;
                                                        if (abstractC0322c != null) {
                                                            spannable.setSpan(new K0.a(abstractC0322c), i31, i32, i13);
                                                        }
                                                        if (M0.m.a(M0.l.b(wVar13.f372h), 4294967296L) || M0.m.a(M0.l.b(wVar13.f372h), 8589934592L)) {
                                                            z4 = true;
                                                        }
                                                    }
                                                }
                                                if (z4) {
                                                    int size8 = list4.size();
                                                    int i34 = 0;
                                                    while (i34 < size8) {
                                                        C0005b c0005b5 = (C0005b) list4.get(i34);
                                                        int i35 = c0005b5.f247b;
                                                        w wVar14 = (w) c0005b5.f246a;
                                                        if (i35 >= 0 && i35 < spannable.length() && (i10 = c0005b5.f248c) > i35) {
                                                            if (i10 > spannable.length()) {
                                                                i9 = 1;
                                                                i34 += i9;
                                                            } else {
                                                                long j12 = wVar14.f372h;
                                                                long b7 = M0.l.b(j12);
                                                                Object fVar = M0.m.a(b7, 4294967296L) ? new D0.f(bVar6.G(j12)) : M0.m.a(b7, 8589934592L) ? new D0.e(M0.l.c(j12)) : null;
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
                                                    C0005b c0005b6 = (C0005b) list3.get(0);
                                                    if (c0005b6.f246a != null) {
                                                        throw new ClassCastException();
                                                    }
                                                    for (Object obj5 : spannable.getSpans(c0005b6.f247b, c0005b6.f248c, u.class)) {
                                                        spannable.removeSpan((u) obj5);
                                                    }
                                                    throw null;
                                                }
                                            } else {
                                                f3 = bVar6.G(j7);
                                                f4 = f3;
                                                if (Float.isNaN(f4)) {
                                                }
                                                lVar = c4.f236b.f291d;
                                                if (lVar == null) {
                                                }
                                                arrayList = new ArrayList(list4.size());
                                                size = list4.size();
                                                while (i6 < size) {
                                                }
                                                w wVar72 = c4.f235a;
                                                r rVar42 = wVar72.f370f;
                                                if (rVar42 == null || wVar72.f368d != null || wVar72.f367c != null) {
                                                }
                                                J0.b bVar72 = new J0.b(spannable, 0, cVar);
                                                if (arrayList.size() <= 1) {
                                                }
                                                size2 = list4.size();
                                                z4 = false;
                                                while (i8 < size2) {
                                                }
                                                if (z4) {
                                                }
                                                if (list3.size() > 0) {
                                                }
                                            }
                                        } else if (M0.m.a(b2, 8589934592L)) {
                                            c5 = M0.l.c(j7);
                                            f3 = c5 * textSize;
                                            f4 = f3;
                                            if (Float.isNaN(f4)) {
                                            }
                                            lVar = c4.f236b.f291d;
                                            if (lVar == null) {
                                            }
                                            arrayList = new ArrayList(list4.size());
                                            size = list4.size();
                                            while (i6 < size) {
                                            }
                                            w wVar722 = c4.f235a;
                                            r rVar422 = wVar722.f370f;
                                            if (rVar422 == null || wVar722.f368d != null || wVar722.f367c != null) {
                                            }
                                            J0.b bVar722 = new J0.b(spannable, 0, cVar);
                                            if (arrayList.size() <= 1) {
                                            }
                                            size2 = list4.size();
                                            z4 = false;
                                            while (i8 < size2) {
                                            }
                                            if (z4) {
                                            }
                                            if (list3.size() > 0) {
                                            }
                                        } else {
                                            f3 = Float.NaN;
                                            f4 = f3;
                                            if (Float.isNaN(f4)) {
                                            }
                                            lVar = c4.f236b.f291d;
                                            if (lVar == null) {
                                            }
                                            arrayList = new ArrayList(list4.size());
                                            size = list4.size();
                                            while (i6 < size) {
                                            }
                                            w wVar7222 = c4.f235a;
                                            r rVar4222 = wVar7222.f370f;
                                            if (rVar4222 == null || wVar7222.f368d != null || wVar7222.f367c != null) {
                                            }
                                            J0.b bVar7222 = new J0.b(spannable, 0, cVar);
                                            if (arrayList.size() <= 1) {
                                            }
                                            size2 = list4.size();
                                            z4 = false;
                                            while (i8 < size2) {
                                            }
                                            if (z4) {
                                            }
                                            if (list3.size() > 0) {
                                            }
                                        }
                                    }
                                    this.f2435h = spannable;
                                    this.f2436i = new p(spannable, this.f2434g, this.f2439l);
                                }
                            }
                        }
                        spannable = str3;
                        Z1.i.c(spannable);
                        if (list4.isEmpty()) {
                        }
                        if (spannable instanceof Spannable) {
                        }
                        if (Z1.i.a(c4.f235a.f377m, L0.g.f2683c)) {
                        }
                        o oVar2 = c4.f236b;
                        L0.e eVar32 = oVar2.f293f;
                        if (eVar32 == null) {
                        }
                        long j72 = oVar2.f290c;
                        b2 = M0.l.b(j72);
                        if (M0.m.a(b2, 4294967296L)) {
                        }
                        this.f2435h = spannable;
                        this.f2436i = new p(spannable, this.f2434g, this.f2439l);
                    }
                }
                spannable = str3;
                if (list4.isEmpty()) {
                }
                if (spannable instanceof Spannable) {
                }
                if (Z1.i.a(c4.f235a.f377m, L0.g.f2683c)) {
                }
                o oVar22 = c4.f236b;
                L0.e eVar322 = oVar22.f293f;
                if (eVar322 == null) {
                }
                long j722 = oVar22.f290c;
                b2 = M0.l.b(j722);
                if (M0.m.a(b2, 4294967296L)) {
                }
                this.f2435h = spannable;
                this.f2436i = new p(spannable, this.f2434g, this.f2439l);
            }
            i3 = 3;
            this.f2439l = i3;
            c cVar22 = new c(0, this);
            m mVar2 = c3.f236b.f296i;
            if (mVar2 == null) {
            }
            eVar2.setFlags(mVar2.f2696b ? eVar2.getFlags() | 128 : eVar2.getFlags() & (-129));
            i4 = mVar2.f2695a;
            if (i4 == 1) {
            }
            wVar = c3.f235a;
            boolean isEmpty2 = list.isEmpty();
            long b32 = M0.l.b(wVar.f366b);
            a3 = M0.m.a(b32, 4294967296L);
            long j42 = wVar.f366b;
            if (a3) {
            }
            rVar = wVar.f370f;
            if ((rVar != null && wVar.f368d == null && wVar.f367c == null) ? false : true) {
            }
            bVar2 = wVar.f375k;
            if (bVar2 != null) {
            }
            str2 = wVar.f371g;
            if (str2 != null) {
                eVar2.setFontFeatureSettings(str2);
            }
            kVar = wVar.f374j;
            if (kVar != null) {
                eVar2.setTextScaleX(eVar2.getTextScaleX() * kVar.f2688a);
                eVar2.setTextSkewX(eVar2.getTextSkewX() + kVar.f2689b);
            }
            L0.j jVar22 = wVar.f365a;
            eVar2.d(jVar22.b());
            eVar2.c(jVar22.c(), 9205357640488583168L, jVar22.a());
            eVar2.f(wVar.f378n);
            eVar2.g(wVar.f377m);
            eVar2.e(wVar.f379o);
            j3 = wVar.f372h;
            if (!M0.m.a(M0.l.b(j3), 4294967296L)) {
            }
            if (M0.m.a(M0.l.b(j3), 8589934592L)) {
            }
            if (isEmpty2) {
            }
            long j52 = C0288u.f4296f;
            long j62 = wVar.f376l;
            if (C0288u.c(j62, j52)) {
            }
            L0.a aVar4 = wVar.f373i;
            if (aVar4 == null) {
            }
            if (z5) {
            }
            if (wVar2 != null) {
            }
            String str32 = this.f2428a;
            float textSize2 = this.f2434g.getTextSize();
            c4 = this.f2429b;
            List list52 = this.f2431d;
            M0.b bVar62 = this.f2433f;
            z3 = this.f2438k;
            a aVar22 = b.f2425a;
            if (z3) {
            }
            spannable = str32;
            if (list4.isEmpty()) {
            }
            if (spannable instanceof Spannable) {
            }
            if (Z1.i.a(c4.f235a.f377m, L0.g.f2683c)) {
            }
            o oVar222 = c4.f236b;
            L0.e eVar3222 = oVar222.f293f;
            if (eVar3222 == null) {
            }
            long j7222 = oVar222.f290c;
            b2 = M0.l.b(j7222);
            if (M0.m.a(b2, 4294967296L)) {
            }
            this.f2435h = spannable;
            this.f2436i = new p(spannable, this.f2434g, this.f2439l);
        }
        i3 = 2;
        this.f2439l = i3;
        c cVar222 = new c(0, this);
        m mVar22 = c3.f236b.f296i;
        if (mVar22 == null) {
        }
        eVar2.setFlags(mVar22.f2696b ? eVar2.getFlags() | 128 : eVar2.getFlags() & (-129));
        i4 = mVar22.f2695a;
        if (i4 == 1) {
        }
        wVar = c3.f235a;
        boolean isEmpty22 = list.isEmpty();
        long b322 = M0.l.b(wVar.f366b);
        a3 = M0.m.a(b322, 4294967296L);
        long j422 = wVar.f366b;
        if (a3) {
        }
        rVar = wVar.f370f;
        if ((rVar != null && wVar.f368d == null && wVar.f367c == null) ? false : true) {
        }
        bVar2 = wVar.f375k;
        if (bVar2 != null) {
        }
        str2 = wVar.f371g;
        if (str2 != null) {
        }
        kVar = wVar.f374j;
        if (kVar != null) {
        }
        L0.j jVar222 = wVar.f365a;
        eVar2.d(jVar222.b());
        eVar2.c(jVar222.c(), 9205357640488583168L, jVar222.a());
        eVar2.f(wVar.f378n);
        eVar2.g(wVar.f377m);
        eVar2.e(wVar.f379o);
        j3 = wVar.f372h;
        if (!M0.m.a(M0.l.b(j3), 4294967296L)) {
        }
        if (M0.m.a(M0.l.b(j3), 8589934592L)) {
        }
        if (isEmpty22) {
        }
        long j522 = C0288u.f4296f;
        long j622 = wVar.f376l;
        if (C0288u.c(j622, j522)) {
        }
        L0.a aVar42 = wVar.f373i;
        if (aVar42 == null) {
        }
        if (z5) {
        }
        if (wVar2 != null) {
        }
        String str322 = this.f2428a;
        float textSize22 = this.f2434g.getTextSize();
        c4 = this.f2429b;
        List list522 = this.f2431d;
        M0.b bVar622 = this.f2433f;
        z3 = this.f2438k;
        a aVar222 = b.f2425a;
        if (z3) {
        }
        spannable = str322;
        if (list4.isEmpty()) {
        }
        if (spannable instanceof Spannable) {
        }
        if (Z1.i.a(c4.f235a.f377m, L0.g.f2683c)) {
        }
        o oVar2222 = c4.f236b;
        L0.e eVar32222 = oVar2222.f293f;
        if (eVar32222 == null) {
        }
        long j72222 = oVar2222.f290c;
        b2 = M0.l.b(j72222);
        if (M0.m.a(b2, 4294967296L)) {
        }
        this.f2435h = spannable;
        this.f2436i = new p(spannable, this.f2434g, this.f2439l);
    }

    @Override // B0.n
    public final boolean a() {
        C0014b c0014b = this.f2437j;
        if (!(c0014b != null ? c0014b.p() : false)) {
            if (this.f2438k) {
                return false;
            }
            B0.r rVar = this.f2429b.f237c;
            A2.g gVar = i.f2452a;
            A2.g gVar2 = i.f2452a;
            X0 x02 = (X0) gVar2.f83b;
            if (x02 == null) {
                if (C0518i.f5255k != null) {
                    x02 = gVar2.m();
                    gVar2.f83b = x02;
                } else {
                    x02 = j.f2453a;
                }
            }
            if (!((Boolean) x02.getValue()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @Override // B0.n
    public final float b() {
        return this.f2436i.b();
    }

    public final float c() {
        p pVar = this.f2436i;
        if (!Float.isNaN(pVar.f458e)) {
            return pVar.f458e;
        }
        TextPaint textPaint = pVar.f455b;
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = pVar.f454a;
        lineInstance.setText(new C0.m(charSequence, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, new C0.q(0));
        int i3 = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new L1.j(Integer.valueOf(i3), Integer.valueOf(next)));
            } else {
                L1.j jVar = (L1.j) priorityQueue.peek();
                if (jVar != null && ((Number) jVar.f2709e).intValue() - ((Number) jVar.f2708d).intValue() < next - i3) {
                    priorityQueue.poll();
                    priorityQueue.add(new L1.j(Integer.valueOf(i3), Integer.valueOf(next)));
                }
            }
            i3 = next;
        }
        Iterator it = priorityQueue.iterator();
        float f3 = 0.0f;
        while (it.hasNext()) {
            L1.j jVar2 = (L1.j) it.next();
            f3 = Math.max(f3, Layout.getDesiredWidth(charSequence, ((Number) jVar2.f2708d).intValue(), ((Number) jVar2.f2709e).intValue(), textPaint));
        }
        pVar.f458e = f3;
        return f3;
    }
}
