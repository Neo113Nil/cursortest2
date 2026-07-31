package j2;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import c2.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* loaded from: classes.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f18109a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18110b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f18111c;

    /* renamed from: d, reason: collision with root package name */
    public final long f18112d;

    /* renamed from: e, reason: collision with root package name */
    public final long f18113e;

    /* renamed from: f, reason: collision with root package name */
    public final g f18114f;

    /* renamed from: g, reason: collision with root package name */
    private final String[] f18115g;

    /* renamed from: h, reason: collision with root package name */
    public final String f18116h;

    /* renamed from: i, reason: collision with root package name */
    public final String f18117i;

    /* renamed from: j, reason: collision with root package name */
    public final d f18118j;

    /* renamed from: k, reason: collision with root package name */
    private final HashMap<String, Integer> f18119k;

    /* renamed from: l, reason: collision with root package name */
    private final HashMap<String, Integer> f18120l;

    /* renamed from: m, reason: collision with root package name */
    private List<d> f18121m;

    private d(String str, String str2, long j7, long j8, g gVar, String[] strArr, String str3, String str4, d dVar) {
        this.f18109a = str;
        this.f18110b = str2;
        this.f18117i = str4;
        this.f18114f = gVar;
        this.f18115g = strArr;
        this.f18111c = str2 != null;
        this.f18112d = j7;
        this.f18113e = j8;
        this.f18116h = (String) o2.a.e(str3);
        this.f18118j = dVar;
        this.f18119k = new HashMap<>();
        this.f18120l = new HashMap<>();
    }

    private void b(Map<String, g> map, b.C0043b c0043b, int i7, int i8, int i9) {
        g f7 = f.f(this.f18114f, this.f18115g, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) c0043b.e();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            c0043b.o(spannableStringBuilder);
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (f7 != null) {
            f.a(spannableStringBuilder2, i7, i8, f7, this.f18118j, map, i9);
            if ("p".equals(this.f18109a)) {
                if (f7.k() != Float.MAX_VALUE) {
                    c0043b.m((f7.k() * (-90.0f)) / 100.0f);
                }
                if (f7.m() != null) {
                    c0043b.p(f7.m());
                }
                if (f7.h() != null) {
                    c0043b.j(f7.h());
                }
            }
        }
    }

    public static d c(String str, long j7, long j8, g gVar, String[] strArr, String str2, String str3, d dVar) {
        return new d(str, null, j7, j8, gVar, strArr, str2, str3, dVar);
    }

    public static d d(String str) {
        return new d(null, f.b(str), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    private static void e(SpannableStringBuilder spannableStringBuilder) {
        for (a aVar : (a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), a.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar), spannableStringBuilder.getSpanEnd(aVar), "");
        }
        for (int i7 = 0; i7 < spannableStringBuilder.length(); i7++) {
            if (spannableStringBuilder.charAt(i7) == ' ') {
                int i8 = i7 + 1;
                int i9 = i8;
                while (i9 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i9) == ' ') {
                    i9++;
                }
                int i10 = i9 - i8;
                if (i10 > 0) {
                    spannableStringBuilder.delete(i7, i10 + i7);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
        }
        for (int i11 = 0; i11 < spannableStringBuilder.length() - 1; i11++) {
            if (spannableStringBuilder.charAt(i11) == '\n') {
                int i12 = i11 + 1;
                if (spannableStringBuilder.charAt(i12) == ' ') {
                    spannableStringBuilder.delete(i12, i11 + 2);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
        for (int i13 = 0; i13 < spannableStringBuilder.length() - 1; i13++) {
            if (spannableStringBuilder.charAt(i13) == ' ') {
                int i14 = i13 + 1;
                if (spannableStringBuilder.charAt(i14) == '\n') {
                    spannableStringBuilder.delete(i13, i14);
                }
            }
        }
        if (spannableStringBuilder.length() <= 0 || spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
            return;
        }
        spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
    }

    private void i(TreeSet<Long> treeSet, boolean z6) {
        boolean equals = "p".equals(this.f18109a);
        boolean equals2 = "div".equals(this.f18109a);
        if (z6 || equals || (equals2 && this.f18117i != null)) {
            long j7 = this.f18112d;
            if (j7 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j7));
            }
            long j8 = this.f18113e;
            if (j8 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j8));
            }
        }
        if (this.f18121m == null) {
            return;
        }
        for (int i7 = 0; i7 < this.f18121m.size(); i7++) {
            this.f18121m.get(i7).i(treeSet, z6 || equals);
        }
    }

    private static SpannableStringBuilder k(String str, Map<String, b.C0043b> map) {
        if (!map.containsKey(str)) {
            b.C0043b c0043b = new b.C0043b();
            c0043b.o(new SpannableStringBuilder());
            map.put(str, c0043b);
        }
        return (SpannableStringBuilder) o2.a.e(map.get(str).e());
    }

    private void n(long j7, String str, List<Pair<String, String>> list) {
        if (!"".equals(this.f18116h)) {
            str = this.f18116h;
        }
        if (m(j7) && "div".equals(this.f18109a) && this.f18117i != null) {
            list.add(new Pair<>(str, this.f18117i));
            return;
        }
        for (int i7 = 0; i7 < g(); i7++) {
            f(i7).n(j7, str, list);
        }
    }

    private void o(long j7, Map<String, g> map, Map<String, e> map2, String str, Map<String, b.C0043b> map3) {
        int i7;
        if (m(j7)) {
            String str2 = "".equals(this.f18116h) ? str : this.f18116h;
            Iterator<Map.Entry<String, Integer>> it = this.f18120l.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, Integer> next = it.next();
                String key = next.getKey();
                int intValue = this.f18119k.containsKey(key) ? this.f18119k.get(key).intValue() : 0;
                int intValue2 = next.getValue().intValue();
                if (intValue != intValue2) {
                    b(map, (b.C0043b) o2.a.e(map3.get(key)), intValue, intValue2, ((e) o2.a.e(map2.get(str2))).f18131j);
                }
            }
            for (i7 = 0; i7 < g(); i7++) {
                f(i7).o(j7, map, map2, str2, map3);
            }
        }
    }

    private void p(long j7, boolean z6, String str, Map<String, b.C0043b> map) {
        this.f18119k.clear();
        this.f18120l.clear();
        if ("metadata".equals(this.f18109a)) {
            return;
        }
        if (!"".equals(this.f18116h)) {
            str = this.f18116h;
        }
        if (this.f18111c && z6) {
            k(str, map).append((CharSequence) o2.a.e(this.f18110b));
            return;
        }
        if ("br".equals(this.f18109a) && z6) {
            k(str, map).append('\n');
            return;
        }
        if (m(j7)) {
            for (Map.Entry<String, b.C0043b> entry : map.entrySet()) {
                this.f18119k.put(entry.getKey(), Integer.valueOf(((CharSequence) o2.a.e(entry.getValue().e())).length()));
            }
            boolean equals = "p".equals(this.f18109a);
            for (int i7 = 0; i7 < g(); i7++) {
                f(i7).p(j7, z6 || equals, str, map);
            }
            if (equals) {
                f.c(k(str, map));
            }
            for (Map.Entry<String, b.C0043b> entry2 : map.entrySet()) {
                this.f18120l.put(entry2.getKey(), Integer.valueOf(((CharSequence) o2.a.e(entry2.getValue().e())).length()));
            }
        }
    }

    public void a(d dVar) {
        if (this.f18121m == null) {
            this.f18121m = new ArrayList();
        }
        this.f18121m.add(dVar);
    }

    public d f(int i7) {
        List<d> list = this.f18121m;
        if (list != null) {
            return list.get(i7);
        }
        throw new IndexOutOfBoundsException();
    }

    public int g() {
        List<d> list = this.f18121m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<c2.b> h(long j7, Map<String, g> map, Map<String, e> map2, Map<String, String> map3) {
        List<Pair<String, String>> arrayList = new ArrayList<>();
        n(j7, this.f18116h, arrayList);
        TreeMap treeMap = new TreeMap();
        p(j7, false, this.f18116h, treeMap);
        o(j7, map, map2, this.f18116h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair<String, String> pair : arrayList) {
            String str = map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                e eVar = (e) o2.a.e(map2.get(pair.first));
                arrayList2.add(new b.C0043b().f(decodeByteArray).k(eVar.f18123b).l(0).h(eVar.f18124c, 0).i(eVar.f18126e).n(eVar.f18127f).g(eVar.f18128g).r(eVar.f18131j).a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            e eVar2 = (e) o2.a.e(map2.get(entry.getKey()));
            b.C0043b c0043b = (b.C0043b) entry.getValue();
            e((SpannableStringBuilder) o2.a.e(c0043b.e()));
            c0043b.h(eVar2.f18124c, eVar2.f18125d);
            c0043b.i(eVar2.f18126e);
            c0043b.k(eVar2.f18123b);
            c0043b.n(eVar2.f18127f);
            c0043b.q(eVar2.f18130i, eVar2.f18129h);
            c0043b.r(eVar2.f18131j);
            arrayList2.add(c0043b.a());
        }
        return arrayList2;
    }

    public long[] j() {
        TreeSet<Long> treeSet = new TreeSet<>();
        int i7 = 0;
        i(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i7] = it.next().longValue();
            i7++;
        }
        return jArr;
    }

    public String[] l() {
        return this.f18115g;
    }

    public boolean m(long j7) {
        long j8 = this.f18112d;
        return (j8 == -9223372036854775807L && this.f18113e == -9223372036854775807L) || (j8 <= j7 && this.f18113e == -9223372036854775807L) || ((j8 == -9223372036854775807L && j7 < this.f18113e) || (j8 <= j7 && j7 < this.f18113e));
    }
}
