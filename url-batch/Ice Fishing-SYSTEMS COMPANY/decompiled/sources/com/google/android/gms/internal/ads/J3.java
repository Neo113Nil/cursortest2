package com.google.android.gms.internal.ads;

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
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* loaded from: classes2.dex */
public final class J3 {

    /* renamed from: a, reason: collision with root package name */
    public final String f25716a;

    /* renamed from: b, reason: collision with root package name */
    public final String f25717b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f25718c;

    /* renamed from: d, reason: collision with root package name */
    public final long f25719d;

    /* renamed from: e, reason: collision with root package name */
    public final long f25720e;

    /* renamed from: f, reason: collision with root package name */
    public final N3 f25721f;

    /* renamed from: g, reason: collision with root package name */
    public final String[] f25722g;

    /* renamed from: h, reason: collision with root package name */
    public final String f25723h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final J3 f25724j;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f25725k;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f25726l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f25727m;

    public J3(String str, String str2, long j9, long j10, N3 n32, String[] strArr, String str3, String str4, J3 j32) {
        this.f25716a = str;
        this.f25717b = str2;
        this.i = str4;
        this.f25721f = n32;
        this.f25722g = strArr;
        this.f25718c = str2 != null;
        this.f25719d = j9;
        this.f25720e = j10;
        str3.getClass();
        this.f25723h = str3;
        this.f25724j = j32;
        this.f25725k = new HashMap();
        this.f25726l = new HashMap();
    }

    public static J3 a(String str) {
        return new J3(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), com.anythink.basead.exoplayer.b.f6539b, com.anythink.basead.exoplayer.b.f6539b, null, null, "", null, null);
    }

    public static J3 b(String str, long j9, long j10, N3 n32, String[] strArr, String str2, String str3, J3 j32) {
        return new J3(str, null, j9, j10, n32, strArr, str2, str3, j32);
    }

    public static SpannableStringBuilder i(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            C3914sj c3914sj = new C3914sj();
            c3914sj.f34261a = new SpannableStringBuilder();
            c3914sj.f34262b = null;
            treeMap.put(str, c3914sj);
        }
        CharSequence charSequence = ((C3914sj) treeMap.get(str)).f34261a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final boolean c(long j9) {
        long j10 = this.f25719d;
        long j11 = this.f25720e;
        if (j10 == com.anythink.basead.exoplayer.b.f6539b) {
            if (j11 == com.anythink.basead.exoplayer.b.f6539b) {
                return true;
            }
            j10 = -9223372036854775807L;
        }
        if (j10 <= j9 && j11 == com.anythink.basead.exoplayer.b.f6539b) {
            return true;
        }
        if (j10 != com.anythink.basead.exoplayer.b.f6539b || j9 >= j11) {
            return j10 <= j9 && j9 < j11;
        }
        return true;
    }

    public final J3 d(int i) {
        ArrayList arrayList = this.f25727m;
        if (arrayList != null) {
            return (J3) arrayList.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int e() {
        ArrayList arrayList = this.f25727m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void f(TreeSet treeSet, boolean z8) {
        String str = this.f25716a;
        boolean equals = "p".equals(str);
        if (z8 || equals || ("div".equals(str) && this.i != null)) {
            long j9 = this.f25719d;
            if (j9 != com.anythink.basead.exoplayer.b.f6539b) {
                treeSet.add(Long.valueOf(j9));
            }
            long j10 = this.f25720e;
            if (j10 != com.anythink.basead.exoplayer.b.f6539b) {
                treeSet.add(Long.valueOf(j10));
            }
        }
        if (this.f25727m != null) {
            for (int i = 0; i < this.f25727m.size(); i++) {
                J3 j32 = (J3) this.f25727m.get(i);
                boolean z9 = true;
                if (!z8 && !equals) {
                    z9 = false;
                }
                j32.f(treeSet, z9);
            }
        }
    }

    public final void g(long j9, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.f25723h;
        boolean equals = "".equals(str3);
        boolean c4 = c(j9);
        if (true != equals) {
            str = str3;
        }
        if (c4 && "div".equals(this.f25716a) && (str2 = this.i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i = 0; i < e(); i++) {
            d(i).g(j9, str, arrayList);
        }
    }

    public final void h(long j9, boolean z8, String str, TreeMap treeMap) {
        long j10;
        boolean z9;
        HashMap hashMap = this.f25725k;
        hashMap.clear();
        HashMap hashMap2 = this.f25726l;
        hashMap2.clear();
        String str2 = this.f25716a;
        if ("metadata".equals(str2)) {
            return;
        }
        String str3 = this.f25723h;
        String str4 = true != "".equals(str3) ? str3 : str;
        if (this.f25718c && z8) {
            SpannableStringBuilder i = i(str4, treeMap);
            String str5 = this.f25717b;
            str5.getClass();
            i.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z8) {
            i(str4, treeMap).append('\n');
            return;
        }
        if (c(j9)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((C3914sj) entry.getValue()).f34261a;
                charSequence.getClass();
                hashMap.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean equals = "p".equals(str2);
            for (int i4 = 0; i4 < e(); i4++) {
                J3 d2 = d(i4);
                if (z8 || equals) {
                    j10 = j9;
                    z9 = true;
                } else {
                    j10 = j9;
                    z9 = false;
                }
                d2.h(j10, z9, str4, treeMap);
            }
            if (equals) {
                SpannableStringBuilder i9 = i(str4, treeMap);
                int length = i9.length();
                do {
                    length--;
                    if (length < 0) {
                        break;
                    }
                } while (i9.charAt(length) == ' ');
                if (length >= 0 && i9.charAt(length) != '\n') {
                    i9.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequence2 = ((C3914sj) entry2.getValue()).f34261a;
                charSequence2.getClass();
                hashMap2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(long j9, Map map, HashMap hashMap, String str, TreeMap treeMap) {
        int i;
        int i4;
        J3 j32;
        int i9;
        int i10;
        N3 c4;
        int i11;
        Iterator it;
        float f6;
        int i12;
        int i13;
        Map map2 = map;
        int i14 = -1;
        int i15 = 1;
        if (c(j9)) {
            String str2 = this.f25723h;
            String str3 = true != "".equals(str2) ? str2 : str;
            Iterator it2 = this.f25726l.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                String str4 = (String) entry.getKey();
                HashMap hashMap2 = this.f25725k;
                int intValue = hashMap2.containsKey(str4) ? ((Integer) hashMap2.get(str4)).intValue() : 0;
                int intValue2 = ((Integer) entry.getValue()).intValue();
                if (intValue != intValue2) {
                    C3914sj c3914sj = (C3914sj) treeMap.get(str4);
                    c3914sj.getClass();
                    M3 m32 = (M3) hashMap.get(str3);
                    m32.getClass();
                    N3 c9 = AbstractC2655Lg.c(this.f25721f, this.f25722g, map2);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) c3914sj.f34261a;
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        c3914sj.f34261a = spannableStringBuilder;
                        c3914sj.f34262b = null;
                    }
                    if (c9 != null) {
                        int i16 = c9.f26463h;
                        if (((i16 == i14 && c9.i == i14) ? i14 : (i16 == i15 ? i15 : 0) | (c9.i == i15 ? 2 : 0)) != i14) {
                            int i17 = c9.f26463h;
                            if (i17 == i14) {
                                if (c9.i == i14) {
                                    i13 = i14;
                                    i15 = 1;
                                    StyleSpan styleSpan = new StyleSpan(i13);
                                    i = 33;
                                    spannableStringBuilder.setSpan(styleSpan, intValue, intValue2, 33);
                                } else {
                                    i15 = 1;
                                }
                            }
                            i13 = (i17 == i15 ? i15 : 0) | (c9.i == i15 ? 2 : 0);
                            StyleSpan styleSpan2 = new StyleSpan(i13);
                            i = 33;
                            spannableStringBuilder.setSpan(styleSpan2, intValue, intValue2, 33);
                        } else {
                            i = 33;
                        }
                        if (c9.f26461f == i15) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), intValue, intValue2, i);
                        }
                        if (c9.f26462g == i15) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), intValue, intValue2, i);
                        }
                        if (c9.f26458c) {
                            if (!c9.f26458c) {
                                throw new IllegalStateException("Font color has not been defined.");
                            }
                            AbstractC3217fl.n(spannableStringBuilder, new ForegroundColorSpan(c9.f26457b), intValue, intValue2);
                        }
                        if (c9.f26460e) {
                            if (!c9.f26460e) {
                                throw new IllegalStateException("Background color has not been defined.");
                            }
                            AbstractC3217fl.n(spannableStringBuilder, new BackgroundColorSpan(c9.f26459d), intValue, intValue2);
                        }
                        if (c9.f26456a != null) {
                            AbstractC3217fl.n(spannableStringBuilder, new TypefaceSpan(c9.f26456a), intValue, intValue2);
                        }
                        I3 i32 = c9.f26472r;
                        if (i32 != null) {
                            int i18 = i32.f25519a;
                            if (i18 == i14) {
                                int i19 = m32.f26302j;
                                i18 = (i19 == 2 || i19 == 1) ? 3 : 1;
                                i12 = 1;
                            } else {
                                i12 = i32.f25520b;
                            }
                            i4 = i14;
                            int i20 = i32.f25521c;
                            if (i20 == -2) {
                                i20 = 1;
                            }
                            AbstractC3217fl.n(spannableStringBuilder, new C2710Ok(i18, i12, i20), intValue, intValue2);
                        } else {
                            i4 = i14;
                        }
                        int i21 = c9.f26467m;
                        if (i21 == 2) {
                            J3 j33 = this.f25724j;
                            while (true) {
                                if (j33 == null) {
                                    j33 = null;
                                    break;
                                }
                                N3 c10 = AbstractC2655Lg.c(j33.f25721f, j33.f25722g, map2);
                                if (c10 != null && c10.f26467m == 1) {
                                    break;
                                } else {
                                    j33 = j33.f25724j;
                                }
                            }
                            if (j33 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(j33);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        j32 = null;
                                        break;
                                    }
                                    J3 j34 = (J3) arrayDeque.pop();
                                    N3 c11 = AbstractC2655Lg.c(j34.f25721f, j34.f25722g, map2);
                                    if (c11 != null && c11.f26467m == 3) {
                                        j32 = j34;
                                        break;
                                    }
                                    int e6 = j34.e();
                                    while (true) {
                                        e6--;
                                        if (e6 >= 0) {
                                            arrayDeque.push(j34.d(e6));
                                        }
                                    }
                                }
                                if (j32 != null) {
                                    if (j32.e() != 1 || j32.d(0).f25717b == null) {
                                        AbstractC3217fl.y("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                    } else {
                                        String str5 = j32.d(0).f25717b;
                                        String str6 = AbstractC3548lu.f32613a;
                                        N3 c12 = AbstractC2655Lg.c(j32.f25721f, j32.f25722g, map2);
                                        if (c12 != null) {
                                            i9 = c12.f26468n;
                                            i10 = i4;
                                        } else {
                                            i9 = i4;
                                            i10 = i9;
                                        }
                                        if (i9 == i10 && (c4 = AbstractC2655Lg.c(j33.f25721f, j33.f25722g, map2)) != null) {
                                            i9 = c4.f26468n;
                                        }
                                        spannableStringBuilder.setSpan(new C3969tk(str5, i9), intValue, intValue2, 33);
                                    }
                                    if (c9.f26471q == 1) {
                                        AbstractC3217fl.n(spannableStringBuilder, new C3430jk(), intValue, intValue2);
                                    }
                                    i11 = c9.f26464j;
                                    if (i11 != 1) {
                                        it = it2;
                                        f6 = 100.0f;
                                        AbstractC3217fl.n(spannableStringBuilder, new AbsoluteSizeSpan((int) c9.f26465k, true), intValue, intValue2);
                                    } else if (i11 == 2) {
                                        it = it2;
                                        f6 = 100.0f;
                                        AbstractC3217fl.n(spannableStringBuilder, new RelativeSizeSpan(c9.f26465k), intValue, intValue2);
                                    } else if (i11 != 3) {
                                        it = it2;
                                        f6 = 100.0f;
                                    } else {
                                        float f9 = c9.f26465k / 100.0f;
                                        RelativeSizeSpan[] relativeSizeSpanArr = (RelativeSizeSpan[]) spannableStringBuilder.getSpans(intValue, intValue2, RelativeSizeSpan.class);
                                        int length = relativeSizeSpanArr.length;
                                        f6 = 100.0f;
                                        int i22 = 0;
                                        while (i22 < length) {
                                            RelativeSizeSpan relativeSizeSpan = relativeSizeSpanArr[i22];
                                            Iterator it3 = it2;
                                            if (spannableStringBuilder.getSpanStart(relativeSizeSpan) <= intValue && spannableStringBuilder.getSpanEnd(relativeSizeSpan) >= intValue2) {
                                                f9 = relativeSizeSpan.getSizeChange() * f9;
                                            }
                                            if (spannableStringBuilder.getSpanStart(relativeSizeSpan) == intValue && spannableStringBuilder.getSpanEnd(relativeSizeSpan) == intValue2) {
                                                if (spannableStringBuilder.getSpanFlags(relativeSizeSpan) == 33) {
                                                    spannableStringBuilder.removeSpan(relativeSizeSpan);
                                                }
                                            }
                                            i22++;
                                            it2 = it3;
                                        }
                                        it = it2;
                                        spannableStringBuilder.setSpan(new RelativeSizeSpan(f9), intValue, intValue2, 33);
                                    }
                                    if ("p".equals(this.f25716a)) {
                                        float f10 = c9.f26473s;
                                        if (f10 != Float.MAX_VALUE) {
                                            c3914sj.f34274o = (f10 * (-90.0f)) / f6;
                                        }
                                        Layout.Alignment alignment = c9.f26469o;
                                        if (alignment != null) {
                                            c3914sj.f34263c = alignment;
                                        }
                                        Layout.Alignment alignment2 = c9.f26470p;
                                        if (alignment2 != null) {
                                            c3914sj.f34264d = alignment2;
                                        }
                                    }
                                    map2 = map;
                                    it2 = it;
                                    i14 = -1;
                                    i15 = 1;
                                }
                            }
                        } else if (i21 == 3 || i21 == 4) {
                            spannableStringBuilder.setSpan(new H3(), intValue, intValue2, 33);
                        }
                        if (c9.f26471q == 1) {
                        }
                        i11 = c9.f26464j;
                        if (i11 != 1) {
                        }
                        if ("p".equals(this.f25716a)) {
                        }
                        map2 = map;
                        it2 = it;
                        i14 = -1;
                        i15 = 1;
                    }
                }
                map2 = map;
            }
            for (int i23 = 0; i23 < e(); i23++) {
                d(i23).j(j9, map, hashMap, str3, treeMap);
            }
        }
    }
}
