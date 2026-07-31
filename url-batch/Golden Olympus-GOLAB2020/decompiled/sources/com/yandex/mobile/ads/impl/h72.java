package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import com.yandex.mobile.ads.impl.uu;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* loaded from: classes3.dex */
final class h72 {

    /* renamed from: a, reason: collision with root package name */
    public final String f26652a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26653b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f26654c;

    /* renamed from: d, reason: collision with root package name */
    public final long f26655d;

    /* renamed from: e, reason: collision with root package name */
    public final long f26656e;

    /* renamed from: f, reason: collision with root package name */
    public final k72 f26657f;

    /* renamed from: g, reason: collision with root package name */
    private final String[] f26658g;

    /* renamed from: h, reason: collision with root package name */
    public final String f26659h;

    /* renamed from: i, reason: collision with root package name */
    public final String f26660i;

    /* renamed from: j, reason: collision with root package name */
    public final h72 f26661j;

    /* renamed from: k, reason: collision with root package name */
    private final HashMap<String, Integer> f26662k;

    /* renamed from: l, reason: collision with root package name */
    private final HashMap<String, Integer> f26663l;

    /* renamed from: m, reason: collision with root package name */
    private ArrayList f26664m;

    private h72(String str, String str2, long j4, long j5, k72 k72Var, String[] strArr, String str3, String str4, h72 h72Var) {
        this.f26652a = str;
        this.f26653b = str2;
        this.f26660i = str4;
        this.f26657f = k72Var;
        this.f26658g = strArr;
        this.f26654c = str2 != null;
        this.f26655d = j4;
        this.f26656e = j5;
        this.f26659h = (String) C2253tf.a(str3);
        this.f26661j = h72Var;
        this.f26662k = new HashMap<>();
        this.f26663l = new HashMap<>();
    }

    public final void a(h72 h72Var) {
        if (this.f26664m == null) {
            this.f26664m = new ArrayList();
        }
        this.f26664m.add(h72Var);
    }

    public final long[] b() {
        TreeSet<Long> treeSet = new TreeSet<>();
        int i4 = 0;
        a(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i4] = it.next().longValue();
            i4++;
        }
        return jArr;
    }

    public final String[] c() {
        return this.f26658g;
    }

    public final h72 a(int i4) {
        ArrayList arrayList = this.f26664m;
        if (arrayList != null) {
            return (h72) arrayList.get(i4);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int a() {
        ArrayList arrayList = this.f26664m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    private void a(TreeSet<Long> treeSet, boolean z4) {
        boolean equals = "p".equals(this.f26652a);
        boolean equals2 = "div".equals(this.f26652a);
        if (z4 || equals || (equals2 && this.f26660i != null)) {
            long j4 = this.f26655d;
            if (j4 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j4));
            }
            long j5 = this.f26656e;
            if (j5 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j5));
            }
        }
        if (this.f26664m == null) {
            return;
        }
        for (int i4 = 0; i4 < this.f26664m.size(); i4++) {
            ((h72) this.f26664m.get(i4)).a(treeSet, z4 || equals);
        }
    }

    private static SpannableStringBuilder a(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            uu.a aVar = new uu.a();
            aVar.a(new SpannableStringBuilder());
            treeMap.put(str, aVar);
        }
        CharSequence d4 = ((uu.a) treeMap.get(str)).d();
        d4.getClass();
        return (SpannableStringBuilder) d4;
    }

    public final boolean a(long j4) {
        long j5 = this.f26655d;
        if (j5 == -9223372036854775807L && this.f26656e == -9223372036854775807L) {
            return true;
        }
        if (j5 <= j4 && this.f26656e == -9223372036854775807L) {
            return true;
        }
        if (j5 != -9223372036854775807L || j4 >= this.f26656e) {
            return j5 <= j4 && j4 < this.f26656e;
        }
        return true;
    }

    private void a(long j4, String str, ArrayList arrayList) {
        if (!"".equals(this.f26659h)) {
            str = this.f26659h;
        }
        if (a(j4) && "div".equals(this.f26652a) && this.f26660i != null) {
            arrayList.add(new Pair(str, this.f26660i));
            return;
        }
        for (int i4 = 0; i4 < a(); i4++) {
            a(i4).a(j4, str, arrayList);
        }
    }

    private void a(long j4, Map map, Map map2, String str, TreeMap treeMap) {
        if (a(j4)) {
            String str2 = "".equals(this.f26659h) ? str : this.f26659h;
            Iterator<Map.Entry<String, Integer>> it = this.f26663l.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, Integer> next = it.next();
                String key = next.getKey();
                int intValue = this.f26662k.containsKey(key) ? this.f26662k.get(key).intValue() : 0;
                int intValue2 = next.getValue().intValue();
                if (intValue != intValue2) {
                    uu.a aVar = (uu.a) treeMap.get(key);
                    aVar.getClass();
                    i72 i72Var = (i72) map2.get(str2);
                    i72Var.getClass();
                    int i4 = i72Var.f27137j;
                    k72 a4 = j72.a(this.f26657f, this.f26658g, map);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) aVar.d();
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        aVar.a(spannableStringBuilder);
                    }
                    SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
                    if (a4 != null) {
                        j72.a(spannableStringBuilder2, intValue, intValue2, a4, this.f26661j, map, i4);
                        if ("p".equals(this.f26652a)) {
                            if (a4.j() != Float.MAX_VALUE) {
                                aVar.c((a4.j() * (-90.0f)) / 100.0f);
                            }
                            if (a4.l() != null) {
                                aVar.b(a4.l());
                            }
                            if (a4.g() != null) {
                                aVar.a(a4.g());
                            }
                        }
                    }
                }
            }
            for (int i5 = 0; i5 < a(); i5++) {
                a(i5).a(j4, map, map2, str2, treeMap);
            }
        }
    }

    private void a(long j4, boolean z4, String str, TreeMap treeMap) {
        boolean z5;
        TreeMap treeMap2;
        long j5;
        this.f26662k.clear();
        this.f26663l.clear();
        if ("metadata".equals(this.f26652a)) {
            return;
        }
        if (!"".equals(this.f26659h)) {
            str = this.f26659h;
        }
        String str2 = str;
        if (this.f26654c && z4) {
            SpannableStringBuilder a4 = a(str2, treeMap);
            String str3 = this.f26653b;
            str3.getClass();
            a4.append((CharSequence) str3);
            return;
        }
        if ("br".equals(this.f26652a) && z4) {
            a(str2, treeMap).append('\n');
            return;
        }
        if (a(j4)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                HashMap<String, Integer> hashMap = this.f26662k;
                String str4 = (String) entry.getKey();
                CharSequence d4 = ((uu.a) entry.getValue()).d();
                d4.getClass();
                hashMap.put(str4, Integer.valueOf(d4.length()));
            }
            boolean equals = "p".equals(this.f26652a);
            int i4 = 0;
            while (i4 < a()) {
                h72 a5 = a(i4);
                if (z4 || equals) {
                    z5 = true;
                    treeMap2 = treeMap;
                    j5 = j4;
                } else {
                    z5 = false;
                    j5 = j4;
                    treeMap2 = treeMap;
                }
                a5.a(j5, z5, str2, treeMap2);
                j4 = j5;
                i4++;
                treeMap = treeMap2;
            }
            TreeMap treeMap3 = treeMap;
            if (equals) {
                SpannableStringBuilder a6 = a(str2, treeMap3);
                int length = a6.length() - 1;
                while (length >= 0 && a6.charAt(length) == ' ') {
                    length--;
                }
                if (length >= 0 && a6.charAt(length) != '\n') {
                    a6.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap3.entrySet()) {
                HashMap<String, Integer> hashMap2 = this.f26663l;
                String str5 = (String) entry2.getKey();
                CharSequence d5 = ((uu.a) entry2.getValue()).d();
                d5.getClass();
                hashMap2.put(str5, Integer.valueOf(d5.length()));
            }
        }
    }

    public static h72 a(String str) {
        return new h72(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static h72 a(String str, long j4, long j5, k72 k72Var, String[] strArr, String str2, String str3, h72 h72Var) {
        return new h72(str, null, j4, j5, k72Var, strArr, str2, str3, h72Var);
    }

    public final ArrayList a(long j4, Map map, Map map2, Map map3) {
        ArrayList arrayList = new ArrayList();
        a(j4, this.f26659h, arrayList);
        TreeMap treeMap = new TreeMap();
        a(j4, false, this.f26659h, treeMap);
        a(j4, map, map2, this.f26659h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            Pair pair = (Pair) obj;
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                i72 i72Var = (i72) map2.get(pair.first);
                i72Var.getClass();
                arrayList2.add(new uu.a().a(decodeByteArray).b(i72Var.f27129b).b(0).a(0, i72Var.f27130c).a(i72Var.f27132e).d(i72Var.f27133f).a(i72Var.f27134g).c(i72Var.f27137j).a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            i72 i72Var2 = (i72) map2.get(entry.getKey());
            i72Var2.getClass();
            uu.a aVar = (uu.a) entry.getValue();
            CharSequence d4 = aVar.d();
            d4.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) d4;
            for (o00 o00Var : (o00[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), o00.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(o00Var), spannableStringBuilder.getSpanEnd(o00Var), (CharSequence) "");
            }
            for (int i5 = 0; i5 < spannableStringBuilder.length(); i5++) {
                if (spannableStringBuilder.charAt(i5) == ' ') {
                    int i6 = i5 + 1;
                    int i7 = i6;
                    while (i7 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i7) == ' ') {
                        i7++;
                    }
                    int i8 = i7 - i6;
                    if (i8 > 0) {
                        spannableStringBuilder.delete(i5, i8 + i5);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i9 = 0; i9 < spannableStringBuilder.length() - 1; i9++) {
                if (spannableStringBuilder.charAt(i9) == '\n') {
                    int i10 = i9 + 1;
                    if (spannableStringBuilder.charAt(i10) == ' ') {
                        spannableStringBuilder.delete(i10, i9 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i11 = 0; i11 < spannableStringBuilder.length() - 1; i11++) {
                if (spannableStringBuilder.charAt(i11) == ' ') {
                    int i12 = i11 + 1;
                    if (spannableStringBuilder.charAt(i12) == '\n') {
                        spannableStringBuilder.delete(i11, i12);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            aVar.a(i72Var2.f27131d, i72Var2.f27130c);
            aVar.a(i72Var2.f27132e);
            aVar.b(i72Var2.f27129b);
            aVar.d(i72Var2.f27133f);
            aVar.b(i72Var2.f27135h, i72Var2.f27136i);
            aVar.c(i72Var2.f27137j);
            arrayList2.add(aVar.a());
        }
        return arrayList2;
    }
}
