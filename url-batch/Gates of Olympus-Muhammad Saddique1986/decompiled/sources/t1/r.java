package t1;

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
import n.z0;
import n2.AbstractC0730j;
import n2.AbstractC0737q;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f8909m = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* renamed from: n, reason: collision with root package name */
    public static final Pattern f8910n = Pattern.compile("\\{(.+?)\\}");

    /* renamed from: a, reason: collision with root package name */
    public final String f8911a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f8912b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8913c;

    /* renamed from: d, reason: collision with root package name */
    public final R1.n f8914d;

    /* renamed from: e, reason: collision with root package name */
    public final R1.n f8915e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f8916f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8917g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f8918h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f8919i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f8920j;

    /* renamed from: k, reason: collision with root package name */
    public final R1.n f8921k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f8922l;

    public r(String str) {
        this.f8911a = str;
        ArrayList arrayList = new ArrayList();
        this.f8912b = arrayList;
        this.f8914d = R1.a.d(new p(this, 6));
        this.f8915e = R1.a.d(new p(this, 4));
        R1.g gVar = R1.g.f4148e;
        this.f8916f = R1.a.c(gVar, new p(this, 7));
        this.f8918h = R1.a.c(gVar, new p(this, 1));
        this.f8919i = R1.a.c(gVar, new p(this, 0));
        this.f8920j = R1.a.c(gVar, new p(this, 3));
        this.f8921k = R1.a.d(new p(this, 2));
        R1.a.d(new p(this, 5));
        StringBuilder sb = new StringBuilder("^");
        if (!f8909m.matcher(str).find()) {
            sb.append("http[s]?://");
        }
        Matcher matcher = Pattern.compile("(\\?|\\#|$)").matcher(str);
        matcher.find();
        boolean z3 = false;
        String substring = str.substring(0, matcher.start());
        f2.j.e(substring, "substring(...)");
        a(substring, arrayList, sb);
        if (!AbstractC0730j.C(sb, ".*") && !AbstractC0730j.C(sb, "([^/]+?)")) {
            z3 = true;
        }
        this.f8922l = z3;
        sb.append("($|(\\?(.)*)|(\\#(.)*))");
        String sb2 = sb.toString();
        f2.j.e(sb2, "uriRegex.toString()");
        this.f8913c = AbstractC0737q.x(sb2, ".*", "\\E.*\\Q");
    }

    public static void a(String str, ArrayList arrayList, StringBuilder sb) {
        Matcher matcher = f8910n.matcher(str);
        int i3 = 0;
        while (matcher.find()) {
            String group = matcher.group(1);
            f2.j.d(group, "null cannot be cast to non-null type kotlin.String");
            arrayList.add(group);
            if (matcher.start() > i3) {
                String substring = str.substring(i3, matcher.start());
                f2.j.e(substring, "substring(...)");
                sb.append(Pattern.quote(substring));
            }
            sb.append("([^/]*?|)");
            i3 = matcher.end();
        }
        if (i3 < str.length()) {
            String substring2 = str.substring(i3);
            f2.j.e(substring2, "substring(...)");
            sb.append(Pattern.quote(substring2));
        }
    }

    public final int b(Uri uri) {
        String str;
        if (uri == null || (str = this.f8911a) == null) {
            return 0;
        }
        List<String> pathSegments = uri.getPathSegments();
        List<String> pathSegments2 = Uri.parse(str).getPathSegments();
        f2.j.e(pathSegments, "requestedPathSegments");
        f2.j.e(pathSegments2, "uriPathSegments");
        LinkedHashSet linkedHashSet = new LinkedHashSet(pathSegments);
        linkedHashSet.retainAll(pathSegments2);
        return linkedHashSet.size();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [R1.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [R1.f, java.lang.Object] */
    public final ArrayList c() {
        ArrayList arrayList = this.f8912b;
        Collection values = ((Map) this.f8916f.getValue()).values();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = values.iterator();
        while (it.hasNext()) {
            S1.r.G0(((o) it.next()).f8904b, arrayList2);
        }
        return S1.l.U0(S1.l.U0(arrayList, arrayList2), (List) this.f8919i.getValue());
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [R1.f, java.lang.Object] */
    public final Bundle d(Uri uri, LinkedHashMap linkedHashMap) {
        f2.j.f(uri, "deepLink");
        f2.j.f(linkedHashMap, "arguments");
        Pattern pattern = (Pattern) this.f8914d.getValue();
        Matcher matcher = pattern != null ? pattern.matcher(uri.toString()) : null;
        if (matcher == null || !matcher.matches()) {
            return null;
        }
        Bundle bundle = new Bundle();
        if (!e(matcher, bundle, linkedHashMap)) {
            return null;
        }
        if (((Boolean) this.f8915e.getValue()).booleanValue() && !f(uri, bundle, linkedHashMap)) {
            return null;
        }
        String fragment = uri.getFragment();
        Pattern pattern2 = (Pattern) this.f8921k.getValue();
        Matcher matcher2 = pattern2 != null ? pattern2.matcher(String.valueOf(fragment)) : null;
        if (matcher2 != null && matcher2.matches()) {
            List list = (List) this.f8919i.getValue();
            ArrayList arrayList = new ArrayList(S1.n.E0(list, 10));
            int i3 = 0;
            for (Object obj : list) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    S1.m.D0();
                    throw null;
                }
                String str = (String) obj;
                String decode = Uri.decode(matcher2.group(i4));
                if (linkedHashMap.get(str) != null) {
                    throw new ClassCastException();
                }
                try {
                    f2.j.e(decode, "value");
                    bundle.putString(str, decode);
                    arrayList.add(R1.y.f4171a);
                    i3 = i4;
                } catch (IllegalArgumentException unused) {
                }
            }
        }
        if (z0.k(linkedHashMap, new q(bundle, 0)).isEmpty()) {
            return bundle;
        }
        return null;
    }

    public final boolean e(Matcher matcher, Bundle bundle, LinkedHashMap linkedHashMap) {
        ArrayList arrayList = this.f8912b;
        ArrayList arrayList2 = new ArrayList(S1.n.E0(arrayList, 10));
        Iterator it = arrayList.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i4 = i3 + 1;
            if (i3 < 0) {
                S1.m.D0();
                throw null;
            }
            String str = (String) next;
            String decode = Uri.decode(matcher.group(i4));
            if (linkedHashMap.get(str) != null) {
                throw new ClassCastException();
            }
            try {
                f2.j.e(decode, "value");
                bundle.putString(str, decode);
                arrayList2.add(R1.y.f4171a);
                i3 = i4;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof r)) {
            return false;
        }
        return this.f8911a.equals(((r) obj).f8911a) && f2.j.a(null, null) && f2.j.a(null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [R1.f, java.lang.Object] */
    public final boolean f(Uri uri, Bundle bundle, LinkedHashMap linkedHashMap) {
        Object obj;
        String query;
        for (Map.Entry entry : ((Map) this.f8916f.getValue()).entrySet()) {
            String str = (String) entry.getKey();
            o oVar = (o) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(str);
            if (this.f8917g && (query = uri.getQuery()) != null && !query.equals(uri.toString())) {
                queryParameters = O2.l.l0(query);
            }
            f2.j.e(queryParameters, "inputParams");
            R1.y yVar = R1.y.f4171a;
            int i3 = 0;
            Bundle j3 = l0.c.j(new R1.i[0]);
            Iterator it = oVar.f8904b.iterator();
            while (it.hasNext()) {
                if (linkedHashMap.get((String) it.next()) != null) {
                    throw new ClassCastException();
                }
            }
            for (String str2 : queryParameters) {
                String str3 = oVar.f8903a;
                Matcher matcher = str3 != null ? Pattern.compile(str3, 32).matcher(str2) : null;
                if (matcher == null || !matcher.matches()) {
                    return i3;
                }
                ArrayList arrayList = oVar.f8904b;
                ArrayList arrayList2 = new ArrayList(S1.n.E0(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                int i4 = i3;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        S1.m.D0();
                        throw null;
                    }
                    String str4 = (String) next;
                    String group = matcher.group(i5);
                    if (group == null) {
                        group = "";
                    }
                    if (linkedHashMap.get(str4) != null) {
                        throw new ClassCastException();
                    }
                    if (j3.containsKey(str4)) {
                        obj = Boolean.valueOf(!j3.containsKey(str4));
                        arrayList2.add(obj);
                        i4 = i5;
                        i3 = 0;
                    } else {
                        j3.putString(str4, group);
                        obj = yVar;
                        arrayList2.add(obj);
                        i4 = i5;
                        i3 = 0;
                    }
                }
            }
            bundle.putAll(j3);
        }
        return true;
    }

    public final int hashCode() {
        return this.f8911a.hashCode() * 961;
    }
}
