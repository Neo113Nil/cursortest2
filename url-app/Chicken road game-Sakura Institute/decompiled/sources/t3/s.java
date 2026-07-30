package t3;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f8835m = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* renamed from: n, reason: collision with root package name */
    public static final Pattern f8836n = Pattern.compile("\\{(.+?)\\}");

    /* renamed from: a, reason: collision with root package name */
    public final String f8837a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f8838b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8839c;

    /* renamed from: d, reason: collision with root package name */
    public final d6.o f8840d;

    /* renamed from: e, reason: collision with root package name */
    public final d6.o f8841e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f8842f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8843g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f8844h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f8845i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f8846j;

    /* renamed from: k, reason: collision with root package name */
    public final d6.o f8847k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f8848l;

    public s(String str) {
        this.f8837a = str;
        ArrayList arrayList = new ArrayList();
        this.f8838b = arrayList;
        this.f8840d = d6.a.d(new q(this, 6));
        this.f8841e = d6.a.d(new q(this, 4));
        q qVar = new q(this, 7);
        d6.h hVar = d6.h.f2616g;
        this.f8842f = d6.a.c(hVar, qVar);
        this.f8844h = d6.a.c(hVar, new q(this, 1));
        this.f8845i = d6.a.c(hVar, new q(this, 0));
        this.f8846j = d6.a.c(hVar, new q(this, 3));
        this.f8847k = d6.a.d(new q(this, 2));
        d6.a.d(new q(this, 5));
        StringBuilder sb = new StringBuilder("^");
        if (!f8835m.matcher(str).find()) {
            sb.append("http[s]?://");
        }
        Matcher matcher = Pattern.compile("(\\?|\\#|$)").matcher(str);
        matcher.find();
        boolean z8 = false;
        String substring = str.substring(0, matcher.start());
        r6.k.e(substring, "substring(...)");
        a(substring, arrayList, sb);
        if (!z6.h.y(sb, ".*") && !z6.h.y(sb, "([^/]+?)")) {
            z8 = true;
        }
        this.f8848l = z8;
        sb.append("($|(\\?(.)*)|(\\#(.)*))");
        String sb2 = sb.toString();
        r6.k.e(sb2, "uriRegex.toString()");
        this.f8839c = z6.o.t(sb2, ".*", "\\E.*\\Q");
    }

    public static void a(String str, ArrayList arrayList, StringBuilder sb) {
        Matcher matcher = f8836n.matcher(str);
        int i7 = 0;
        while (matcher.find()) {
            String group = matcher.group(1);
            r6.k.d(group, "null cannot be cast to non-null type kotlin.String");
            arrayList.add(group);
            if (matcher.start() > i7) {
                String substring = str.substring(i7, matcher.start());
                r6.k.e(substring, "substring(...)");
                sb.append(Pattern.quote(substring));
            }
            sb.append("([^/]*?|)");
            i7 = matcher.end();
        }
        if (i7 < str.length()) {
            String substring2 = str.substring(i7);
            r6.k.e(substring2, "substring(...)");
            sb.append(Pattern.quote(substring2));
        }
    }

    public final int b(Uri uri) {
        if (uri == null) {
            return 0;
        }
        List<String> pathSegments = uri.getPathSegments();
        List<String> pathSegments2 = Uri.parse(this.f8837a).getPathSegments();
        r6.k.e(pathSegments, "requestedPathSegments");
        r6.k.e(pathSegments2, "uriPathSegments");
        LinkedHashSet linkedHashSet = new LinkedHashSet(pathSegments);
        linkedHashSet.retainAll(pathSegments2);
        return linkedHashSet.size();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [d6.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [d6.g, java.lang.Object] */
    public final ArrayList c() {
        Collection values = ((Map) this.f8842f.getValue()).values();
        ArrayList arrayList = new ArrayList();
        Iterator it = values.iterator();
        while (it.hasNext()) {
            e6.r.c0(((p) it.next()).f8830b, arrayList);
        }
        return e6.l.r0(e6.l.r0(this.f8838b, arrayList), (List) this.f8845i.getValue());
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [d6.g, java.lang.Object] */
    public final Bundle d(Uri uri, LinkedHashMap linkedHashMap) {
        r6.k.f(uri, "deepLink");
        r6.k.f(linkedHashMap, "arguments");
        Pattern pattern = (Pattern) this.f8840d.getValue();
        Matcher matcher = pattern != null ? pattern.matcher(uri.toString()) : null;
        if (matcher != null && matcher.matches()) {
            Bundle bundle = new Bundle();
            if (e(matcher, bundle, linkedHashMap) && (!((Boolean) this.f8841e.getValue()).booleanValue() || f(uri, bundle, linkedHashMap))) {
                String fragment = uri.getFragment();
                Pattern pattern2 = (Pattern) this.f8847k.getValue();
                Matcher matcher2 = pattern2 != null ? pattern2.matcher(String.valueOf(fragment)) : null;
                if (matcher2 != null && matcher2.matches()) {
                    List list = (List) this.f8845i.getValue();
                    ArrayList arrayList = new ArrayList(e6.n.a0(list, 10));
                    int i7 = 0;
                    for (Object obj : list) {
                        int i8 = i7 + 1;
                        if (i7 < 0) {
                            e6.m.Z();
                            throw null;
                        }
                        String str = (String) obj;
                        String decode = Uri.decode(matcher2.group(i8));
                        if (linkedHashMap.get(str) != null) {
                            throw new ClassCastException();
                        }
                        try {
                            r6.k.e(decode, "value");
                            bundle.putString(str, decode);
                            arrayList.add(d6.z.f2639a);
                            i7 = i8;
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                }
                if (j1.c.i0(linkedHashMap, new r(bundle, 0)).isEmpty()) {
                    return bundle;
                }
            }
        }
        return null;
    }

    public final boolean e(Matcher matcher, Bundle bundle, Map map) {
        ArrayList arrayList = this.f8838b;
        ArrayList arrayList2 = new ArrayList(e6.n.a0(arrayList, 10));
        int size = arrayList.size();
        int i7 = 0;
        int i8 = 0;
        while (i8 < size) {
            Object obj = arrayList.get(i8);
            i8++;
            int i9 = i7 + 1;
            if (i7 < 0) {
                e6.m.Z();
                throw null;
            }
            String str = (String) obj;
            String decode = Uri.decode(matcher.group(i9));
            if (map.get(str) != null) {
                throw new ClassCastException();
            }
            try {
                r6.k.e(decode, "value");
                bundle.putString(str, decode);
                arrayList2.add(d6.z.f2639a);
                i7 = i9;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof s)) {
            return false;
        }
        return this.f8837a.equals(((s) obj).f8837a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [d6.g, java.lang.Object] */
    public final boolean f(Uri uri, Bundle bundle, Map map) {
        Object obj;
        String query;
        for (Map.Entry entry : ((Map) this.f8842f.getValue()).entrySet()) {
            String str = (String) entry.getKey();
            p pVar = (p) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(str);
            if (this.f8843g && (query = uri.getQuery()) != null && !query.equals(uri.toString())) {
                queryParameters = t6.a.F(query);
            }
            r6.k.e(queryParameters, "inputParams");
            d6.z zVar = d6.z.f2639a;
            int i7 = 0;
            Bundle e9 = u3.t.e(new d6.j[0]);
            ArrayList arrayList = pVar.f8830b;
            int size = arrayList.size();
            int i8 = 0;
            while (i8 < size) {
                Object obj2 = arrayList.get(i8);
                i8++;
                if (map.get((String) obj2) != null) {
                    throw new ClassCastException();
                }
            }
            for (String str2 : queryParameters) {
                String str3 = pVar.f8829a;
                Matcher matcher = str3 != null ? Pattern.compile(str3, 32).matcher(str2) : null;
                if (matcher == null || !matcher.matches()) {
                    return i7;
                }
                ArrayList arrayList2 = pVar.f8830b;
                ArrayList arrayList3 = new ArrayList(e6.n.a0(arrayList2, 10));
                int size2 = arrayList2.size();
                int i9 = i7;
                int i10 = i9;
                while (i9 < size2) {
                    Object obj3 = arrayList2.get(i9);
                    i9++;
                    int i11 = i7;
                    int i12 = i10 + 1;
                    if (i10 < 0) {
                        e6.m.Z();
                        throw null;
                    }
                    String str4 = (String) obj3;
                    String group = matcher.group(i12);
                    if (group == null) {
                        group = "";
                    }
                    String str5 = group;
                    if (map.get(str4) != null) {
                        throw new ClassCastException();
                    }
                    if (e9.containsKey(str4)) {
                        obj = Boolean.valueOf(!e9.containsKey(str4));
                        arrayList3.add(obj);
                        i10 = i12;
                        i7 = i11;
                    } else {
                        e9.putString(str4, str5);
                        obj = zVar;
                        arrayList3.add(obj);
                        i10 = i12;
                        i7 = i11;
                    }
                }
            }
            bundle.putAll(e9);
        }
        return true;
    }

    public final int hashCode() {
        return this.f8837a.hashCode() * 961;
    }
}
