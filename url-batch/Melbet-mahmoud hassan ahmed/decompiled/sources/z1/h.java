package z1;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import r0.s1;
import v0.m;

/* loaded from: classes.dex */
public class h extends i {

    /* renamed from: n, reason: collision with root package name */
    public static final h f23579n = new h("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());

    /* renamed from: d, reason: collision with root package name */
    public final List<Uri> f23580d;

    /* renamed from: e, reason: collision with root package name */
    public final List<b> f23581e;

    /* renamed from: f, reason: collision with root package name */
    public final List<a> f23582f;

    /* renamed from: g, reason: collision with root package name */
    public final List<a> f23583g;

    /* renamed from: h, reason: collision with root package name */
    public final List<a> f23584h;

    /* renamed from: i, reason: collision with root package name */
    public final List<a> f23585i;

    /* renamed from: j, reason: collision with root package name */
    public final s1 f23586j;

    /* renamed from: k, reason: collision with root package name */
    public final List<s1> f23587k;

    /* renamed from: l, reason: collision with root package name */
    public final Map<String, String> f23588l;

    /* renamed from: m, reason: collision with root package name */
    public final List<m> f23589m;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f23590a;

        /* renamed from: b, reason: collision with root package name */
        public final s1 f23591b;

        /* renamed from: c, reason: collision with root package name */
        public final String f23592c;

        /* renamed from: d, reason: collision with root package name */
        public final String f23593d;

        public a(Uri uri, s1 s1Var, String str, String str2) {
            this.f23590a = uri;
            this.f23591b = s1Var;
            this.f23592c = str;
            this.f23593d = str2;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f23594a;

        /* renamed from: b, reason: collision with root package name */
        public final s1 f23595b;

        /* renamed from: c, reason: collision with root package name */
        public final String f23596c;

        /* renamed from: d, reason: collision with root package name */
        public final String f23597d;

        /* renamed from: e, reason: collision with root package name */
        public final String f23598e;

        /* renamed from: f, reason: collision with root package name */
        public final String f23599f;

        public b(Uri uri, s1 s1Var, String str, String str2, String str3, String str4) {
            this.f23594a = uri;
            this.f23595b = s1Var;
            this.f23596c = str;
            this.f23597d = str2;
            this.f23598e = str3;
            this.f23599f = str4;
        }

        public static b b(Uri uri) {
            return new b(uri, new s1.b().S("0").K("application/x-mpegURL").E(), null, null, null, null);
        }

        public b a(s1 s1Var) {
            return new b(this.f23594a, s1Var, this.f23596c, this.f23597d, this.f23598e, this.f23599f);
        }
    }

    public h(String str, List<String> list, List<b> list2, List<a> list3, List<a> list4, List<a> list5, List<a> list6, s1 s1Var, List<s1> list7, boolean z6, Map<String, String> map, List<m> list8) {
        super(str, list, z6);
        this.f23580d = Collections.unmodifiableList(f(list2, list3, list4, list5, list6));
        this.f23581e = Collections.unmodifiableList(list2);
        this.f23582f = Collections.unmodifiableList(list3);
        this.f23583g = Collections.unmodifiableList(list4);
        this.f23584h = Collections.unmodifiableList(list5);
        this.f23585i = Collections.unmodifiableList(list6);
        this.f23586j = s1Var;
        this.f23587k = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.f23588l = Collections.unmodifiableMap(map);
        this.f23589m = Collections.unmodifiableList(list8);
    }

    private static void b(List<a> list, List<Uri> list2) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            Uri uri = list.get(i7).f23590a;
            if (uri != null && !list2.contains(uri)) {
                list2.add(uri);
            }
        }
    }

    private static <T> List<T> d(List<T> list, int i7, List<s1.c> list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i8 = 0; i8 < list.size(); i8++) {
            T t6 = list.get(i8);
            int i9 = 0;
            while (true) {
                if (i9 < list2.size()) {
                    s1.c cVar = list2.get(i9);
                    if (cVar.f21609g == i7 && cVar.f21610h == i8) {
                        arrayList.add(t6);
                        break;
                    }
                    i9++;
                }
            }
        }
        return arrayList;
    }

    public static h e(String str) {
        return new h("", Collections.emptyList(), Collections.singletonList(b.b(Uri.parse(str))), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, false, Collections.emptyMap(), Collections.emptyList());
    }

    private static List<Uri> f(List<b> list, List<a> list2, List<a> list3, List<a> list4, List<a> list5) {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < list.size(); i7++) {
            Uri uri = list.get(i7).f23594a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(list2, arrayList);
        b(list3, arrayList);
        b(list4, arrayList);
        b(list5, arrayList);
        return arrayList;
    }

    @Override // s1.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public h a(List<s1.c> list) {
        return new h(this.f23600a, this.f23601b, d(this.f23581e, 0, list), Collections.emptyList(), d(this.f23583g, 1, list), d(this.f23584h, 2, list), Collections.emptyList(), this.f23586j, this.f23587k, this.f23602c, this.f23588l, this.f23589m);
    }
}
