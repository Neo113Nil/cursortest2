package b1;

import O3.l;
import W.AbstractC0108a;
import W.J;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Pair;
import com.google.android.gms.internal.play_billing.AbstractC0347t0;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* renamed from: b1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0258c {

    /* renamed from: a, reason: collision with root package name */
    public final String f5329a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5330b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5331c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5332d;

    /* renamed from: e, reason: collision with root package name */
    public final long f5333e;

    /* renamed from: f, reason: collision with root package name */
    public final C0262g f5334f;

    /* renamed from: g, reason: collision with root package name */
    public final String[] f5335g;

    /* renamed from: h, reason: collision with root package name */
    public final String f5336h;

    /* renamed from: i, reason: collision with root package name */
    public final String f5337i;

    /* renamed from: j, reason: collision with root package name */
    public final C0258c f5338j;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f5339k;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f5340l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f5341m;

    public C0258c(String str, String str2, long j4, long j5, C0262g c0262g, String[] strArr, String str3, String str4, C0258c c0258c) {
        this.f5329a = str;
        this.f5330b = str2;
        this.f5337i = str4;
        this.f5334f = c0262g;
        this.f5335g = strArr;
        this.f5331c = str2 != null;
        this.f5332d = j4;
        this.f5333e = j5;
        str3.getClass();
        this.f5336h = str3;
        this.f5338j = c0258c;
        this.f5339k = new HashMap();
        this.f5340l = new HashMap();
    }

    public static C0258c a(String str) {
        return new C0258c(null, str.replaceAll(IOUtils.LINE_SEPARATOR_WINDOWS, IOUtils.LINE_SEPARATOR_UNIX).replaceAll(" *\n *", IOUtils.LINE_SEPARATOR_UNIX).replaceAll(IOUtils.LINE_SEPARATOR_UNIX, " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static SpannableStringBuilder e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            V.a aVar = new V.a();
            aVar.f3115a = new SpannableStringBuilder();
            aVar.f3116b = null;
            treeMap.put(str, aVar);
        }
        CharSequence charSequence = ((V.a) treeMap.get(str)).f3115a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final C0258c b(int i4) {
        ArrayList arrayList = this.f5341m;
        if (arrayList != null) {
            return (C0258c) arrayList.get(i4);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int c() {
        ArrayList arrayList = this.f5341m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void d(TreeSet treeSet, boolean z) {
        String str = this.f5329a;
        boolean equals = "p".equals(str);
        boolean equals2 = "div".equals(str);
        if (z || equals || (equals2 && this.f5337i != null)) {
            long j4 = this.f5332d;
            if (j4 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j4));
            }
            long j5 = this.f5333e;
            if (j5 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j5));
            }
        }
        if (this.f5341m == null) {
            return;
        }
        for (int i4 = 0; i4 < this.f5341m.size(); i4++) {
            ((C0258c) this.f5341m.get(i4)).d(treeSet, z || equals);
        }
    }

    public final boolean f(long j4) {
        long j5 = this.f5332d;
        long j6 = this.f5333e;
        if (j5 == -9223372036854775807L && j6 == -9223372036854775807L) {
            return true;
        }
        if (j5 <= j4 && j6 == -9223372036854775807L) {
            return true;
        }
        if (j5 != -9223372036854775807L || j4 >= j6) {
            return j5 <= j4 && j4 < j6;
        }
        return true;
    }

    public final void g(long j4, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.f5336h;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (f(j4) && "div".equals(this.f5329a) && (str2 = this.f5337i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i4 = 0; i4 < c(); i4++) {
            b(i4).g(j4, str, arrayList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02d1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(long j4, Map map, HashMap hashMap, String str, TreeMap treeMap) {
        Iterator it;
        int i4;
        C0258c c0258c;
        int i5;
        C0262g p2;
        int i6;
        float f4;
        int i7;
        int i8;
        int i9;
        Map map2 = map;
        if (f(j4)) {
            String str2 = this.f5336h;
            String str3 = "".equals(str2) ? str : str2;
            Iterator it2 = this.f5340l.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                String str4 = (String) entry.getKey();
                HashMap hashMap2 = this.f5339k;
                int intValue = hashMap2.containsKey(str4) ? ((Integer) hashMap2.get(str4)).intValue() : 0;
                int intValue2 = ((Integer) entry.getValue()).intValue();
                if (intValue != intValue2) {
                    V.a aVar = (V.a) treeMap.get(str4);
                    aVar.getClass();
                    C0261f c0261f = (C0261f) hashMap.get(str3);
                    c0261f.getClass();
                    int i10 = c0261f.f5363j;
                    C0262g p4 = AbstractC0347t0.p(this.f5334f, this.f5335g, map2);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) aVar.f3115a;
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        aVar.f3115a = spannableStringBuilder;
                        aVar.f3116b = null;
                    }
                    if (p4 != null) {
                        int i11 = p4.f5371h;
                        int i12 = 1;
                        if (((i11 == -1 && p4.f5372i == -1) ? -1 : (i11 == 1 ? (char) 1 : (char) 0) | (p4.f5372i == 1 ? (char) 2 : (char) 0)) != -1) {
                            int i13 = p4.f5371h;
                            if (i13 == -1) {
                                if (p4.f5372i == -1) {
                                    i9 = -1;
                                    i12 = 1;
                                    StyleSpan styleSpan = new StyleSpan(i9);
                                    i4 = 33;
                                    spannableStringBuilder.setSpan(styleSpan, intValue, intValue2, 33);
                                } else {
                                    i12 = 1;
                                }
                            }
                            i9 = (i13 == i12 ? i12 : 0) | (p4.f5372i == i12 ? 2 : 0);
                            StyleSpan styleSpan2 = new StyleSpan(i9);
                            i4 = 33;
                            spannableStringBuilder.setSpan(styleSpan2, intValue, intValue2, 33);
                        } else {
                            i4 = 33;
                        }
                        if (p4.f5369f == i12) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), intValue, intValue2, i4);
                        }
                        if (p4.f5370g == i12) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), intValue, intValue2, i4);
                        }
                        if (p4.f5366c) {
                            if (!p4.f5366c) {
                                throw new IllegalStateException("Font color has not been defined.");
                            }
                            l.a(spannableStringBuilder, new ForegroundColorSpan(p4.f5365b), intValue, intValue2);
                        }
                        if (p4.f5368e) {
                            if (!p4.f5368e) {
                                throw new IllegalStateException("Background color has not been defined.");
                            }
                            l.a(spannableStringBuilder, new BackgroundColorSpan(p4.f5367d), intValue, intValue2);
                        }
                        if (p4.f5364a != null) {
                            l.a(spannableStringBuilder, new TypefaceSpan(p4.f5364a), intValue, intValue2);
                        }
                        C0257b c0257b = p4.f5379r;
                        if (c0257b != null) {
                            int i14 = c0257b.f5326a;
                            if (i14 == -1) {
                                i14 = (i10 == 2 || i10 == 1) ? 3 : 1;
                                i8 = 1;
                            } else {
                                i8 = c0257b.f5327b;
                            }
                            int i15 = c0257b.f5328c;
                            if (i15 == -2) {
                                i15 = 1;
                            }
                            l.a(spannableStringBuilder, new V.g(i14, i8, i15), intValue, intValue2);
                        }
                        int i16 = p4.f5376m;
                        if (i16 == 2) {
                            C0258c c0258c2 = this.f5338j;
                            while (true) {
                                if (c0258c2 == null) {
                                    c0258c2 = null;
                                    break;
                                }
                                C0262g p5 = AbstractC0347t0.p(c0258c2.f5334f, c0258c2.f5335g, map2);
                                if (p5 != null && p5.f5376m == 1) {
                                    break;
                                } else {
                                    c0258c2 = c0258c2.f5338j;
                                }
                            }
                            if (c0258c2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(c0258c2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        c0258c = null;
                                        break;
                                    }
                                    C0258c c0258c3 = (C0258c) arrayDeque.pop();
                                    C0262g p6 = AbstractC0347t0.p(c0258c3.f5334f, c0258c3.f5335g, map2);
                                    if (p6 != null && p6.f5376m == 3) {
                                        c0258c = c0258c3;
                                        break;
                                    }
                                    for (int c4 = c0258c3.c() - 1; c4 >= 0; c4--) {
                                        arrayDeque.push(c0258c3.b(c4));
                                    }
                                }
                                if (c0258c != null) {
                                    if (c0258c.c() == 1) {
                                        i5 = 0;
                                        if (c0258c.b(0).f5330b != null) {
                                            String str5 = c0258c.b(0).f5330b;
                                            String str6 = J.f3263a;
                                            C0262g p7 = AbstractC0347t0.p(c0258c.f5334f, c0258c.f5335g, map2);
                                            int i17 = p7 != null ? p7.n : -1;
                                            if (i17 == -1 && (p2 = AbstractC0347t0.p(c0258c2.f5334f, c0258c2.f5335g, map2)) != null) {
                                                i17 = p2.n;
                                            }
                                            spannableStringBuilder.setSpan(new V.f(str5, i17), intValue, intValue2, 33);
                                            if (p4.f5378q == 1) {
                                                l.a(spannableStringBuilder, new V.e(), intValue, intValue2);
                                            }
                                            i6 = p4.f5373j;
                                            float f5 = 100.0f;
                                            if (i6 == 1) {
                                                it = it2;
                                                f4 = 100.0f;
                                                l.a(spannableStringBuilder, new AbsoluteSizeSpan((int) p4.f5374k, true), intValue, intValue2);
                                            } else if (i6 == 2) {
                                                it = it2;
                                                f4 = 100.0f;
                                                l.a(spannableStringBuilder, new RelativeSizeSpan(p4.f5374k), intValue, intValue2);
                                            } else if (i6 != 3) {
                                                it = it2;
                                                f4 = 100.0f;
                                            } else {
                                                float f6 = p4.f5374k / 100.0f;
                                                RelativeSizeSpan[] relativeSizeSpanArr = (RelativeSizeSpan[]) spannableStringBuilder.getSpans(intValue, intValue2, RelativeSizeSpan.class);
                                                int length = relativeSizeSpanArr.length;
                                                int i18 = i5;
                                                float f7 = f6;
                                                int i19 = i18;
                                                while (i19 < length) {
                                                    float f8 = f5;
                                                    RelativeSizeSpan relativeSizeSpan = relativeSizeSpanArr[i19];
                                                    Iterator it3 = it2;
                                                    if (spannableStringBuilder.getSpanStart(relativeSizeSpan) <= intValue && spannableStringBuilder.getSpanEnd(relativeSizeSpan) >= intValue2) {
                                                        f7 = relativeSizeSpan.getSizeChange() * f7;
                                                    }
                                                    if (spannableStringBuilder.getSpanStart(relativeSizeSpan) == intValue && spannableStringBuilder.getSpanEnd(relativeSizeSpan) == intValue2) {
                                                        i7 = i19;
                                                        if (spannableStringBuilder.getSpanFlags(relativeSizeSpan) == 33) {
                                                            spannableStringBuilder.removeSpan(relativeSizeSpan);
                                                        }
                                                    } else {
                                                        i7 = i19;
                                                    }
                                                    i19 = i7 + 1;
                                                    f5 = f8;
                                                    it2 = it3;
                                                }
                                                it = it2;
                                                f4 = f5;
                                                spannableStringBuilder.setSpan(new RelativeSizeSpan(f7), intValue, intValue2, 33);
                                            }
                                            if ("p".equals(this.f5329a)) {
                                                float f9 = p4.f5380s;
                                                if (f9 != Float.MAX_VALUE) {
                                                    aVar.f3129q = (f9 * (-90.0f)) / f4;
                                                }
                                                Layout.Alignment alignment = p4.o;
                                                if (alignment != null) {
                                                    aVar.f3117c = alignment;
                                                }
                                                Layout.Alignment alignment2 = p4.f5377p;
                                                if (alignment2 != null) {
                                                    aVar.f3118d = alignment2;
                                                }
                                            }
                                            it2 = it;
                                        }
                                    } else {
                                        i5 = 0;
                                    }
                                    AbstractC0108a.j("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                    if (p4.f5378q == 1) {
                                    }
                                    i6 = p4.f5373j;
                                    float f52 = 100.0f;
                                    if (i6 == 1) {
                                    }
                                    if ("p".equals(this.f5329a)) {
                                    }
                                    it2 = it;
                                }
                            }
                        } else if (i16 == 3 || i16 == 4) {
                            spannableStringBuilder.setSpan(new C0256a(), intValue, intValue2, 33);
                        }
                        i5 = 0;
                        if (p4.f5378q == 1) {
                        }
                        i6 = p4.f5373j;
                        float f522 = 100.0f;
                        if (i6 == 1) {
                        }
                        if ("p".equals(this.f5329a)) {
                        }
                        it2 = it;
                    }
                }
                it = it2;
                it2 = it;
            }
            int i20 = 0;
            while (i20 < c()) {
                b(i20).h(j4, map2, hashMap, str3, treeMap);
                i20++;
                map2 = map;
            }
        }
    }

    public final void i(long j4, boolean z, String str, TreeMap treeMap) {
        boolean z4;
        TreeMap treeMap2;
        long j5;
        HashMap hashMap = this.f5339k;
        hashMap.clear();
        HashMap hashMap2 = this.f5340l;
        hashMap2.clear();
        String str2 = this.f5329a;
        if ("metadata".equals(str2)) {
            return;
        }
        String str3 = this.f5336h;
        String str4 = "".equals(str3) ? str : str3;
        if (this.f5331c && z) {
            SpannableStringBuilder e4 = e(str4, treeMap);
            String str5 = this.f5330b;
            str5.getClass();
            e4.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z) {
            e(str4, treeMap).append('\n');
            return;
        }
        if (f(j4)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((V.a) entry.getValue()).f3115a;
                charSequence.getClass();
                hashMap.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean equals = "p".equals(str2);
            for (int i4 = 0; i4 < c(); i4++) {
                C0258c b4 = b(i4);
                if (z || equals) {
                    z4 = true;
                    treeMap2 = treeMap;
                    j5 = j4;
                } else {
                    z4 = false;
                    j5 = j4;
                    treeMap2 = treeMap;
                }
                b4.i(j5, z4, str4, treeMap2);
            }
            if (equals) {
                SpannableStringBuilder e5 = e(str4, treeMap);
                int length = e5.length() - 1;
                while (length >= 0 && e5.charAt(length) == ' ') {
                    length--;
                }
                if (length >= 0 && e5.charAt(length) != '\n') {
                    e5.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequence2 = ((V.a) entry2.getValue()).f3115a;
                charSequence2.getClass();
                hashMap2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }
}
