package q1;

import a.AbstractC0157a;
import android.net.Uri;
import android.os.Bundle;
import f.AbstractC0382a;
import h2.AbstractC0447i;
import h2.AbstractC0454p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f6940m = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* renamed from: n, reason: collision with root package name */
    public static final Pattern f6941n = Pattern.compile("\\{(.+?)\\}");

    /* renamed from: a, reason: collision with root package name */
    public final String f6942a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f6943b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6944c;

    /* renamed from: d, reason: collision with root package name */
    public final L1.o f6945d;

    /* renamed from: e, reason: collision with root package name */
    public final L1.o f6946e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f6947f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6948g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f6949h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f6950i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f6951j;

    /* renamed from: k, reason: collision with root package name */
    public final L1.o f6952k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f6953l;

    public t(String str) {
        this.f6942a = str;
        ArrayList arrayList = new ArrayList();
        this.f6943b = arrayList;
        this.f6945d = I2.d.F(new r(this, 6));
        this.f6946e = I2.d.F(new r(this, 4));
        L1.h hVar = L1.h.f2706e;
        this.f6947f = I2.d.E(hVar, new r(this, 7));
        this.f6949h = I2.d.E(hVar, new r(this, 1));
        this.f6950i = I2.d.E(hVar, new r(this, 0));
        this.f6951j = I2.d.E(hVar, new r(this, 3));
        this.f6952k = I2.d.F(new r(this, 2));
        I2.d.F(new r(this, 5));
        StringBuilder sb = new StringBuilder("^");
        if (!f6940m.matcher(str).find()) {
            sb.append("http[s]?://");
        }
        Matcher matcher = Pattern.compile("(\\?|\\#|$)").matcher(str);
        matcher.find();
        boolean z3 = false;
        String substring = str.substring(0, matcher.start());
        Z1.i.e(substring, "substring(...)");
        a(substring, arrayList, sb);
        if (!AbstractC0447i.l0(sb, ".*") && !AbstractC0447i.l0(sb, "([^/]+?)")) {
            z3 = true;
        }
        this.f6953l = z3;
        sb.append("($|(\\?(.)*)|(\\#(.)*))");
        String sb2 = sb.toString();
        Z1.i.e(sb2, "uriRegex.toString()");
        this.f6944c = AbstractC0454p.g0(sb2, ".*", "\\E.*\\Q");
    }

    public static void a(String str, ArrayList arrayList, StringBuilder sb) {
        Matcher matcher = f6941n.matcher(str);
        int i3 = 0;
        while (matcher.find()) {
            String group = matcher.group(1);
            Z1.i.d(group, "null cannot be cast to non-null type kotlin.String");
            arrayList.add(group);
            if (matcher.start() > i3) {
                String substring = str.substring(i3, matcher.start());
                Z1.i.e(substring, "substring(...)");
                sb.append(Pattern.quote(substring));
            }
            sb.append("([^/]*?|)");
            i3 = matcher.end();
        }
        if (i3 < str.length()) {
            String substring2 = str.substring(i3);
            Z1.i.e(substring2, "substring(...)");
            sb.append(Pattern.quote(substring2));
        }
    }

    public final int b(Uri uri) {
        String str;
        if (uri == null || (str = this.f6942a) == null) {
            return 0;
        }
        List<String> pathSegments = uri.getPathSegments();
        List<String> pathSegments2 = Uri.parse(str).getPathSegments();
        Z1.i.e(pathSegments, "requestedPathSegments");
        Z1.i.e(pathSegments2, "uriPathSegments");
        LinkedHashSet linkedHashSet = new LinkedHashSet(pathSegments);
        linkedHashSet.retainAll(pathSegments2);
        return linkedHashSet.size();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [L1.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [L1.g, java.lang.Object] */
    public final ArrayList c() {
        ArrayList arrayList = this.f6943b;
        Collection values = ((Map) this.f6947f.getValue()).values();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = values.iterator();
        while (it.hasNext()) {
            M1.r.i0(((q) it.next()).f6935b, arrayList2);
        }
        return M1.l.w0(M1.l.w0(arrayList, arrayList2), (List) this.f6950i.getValue());
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [L1.g, java.lang.Object] */
    public final Bundle d(Uri uri, LinkedHashMap linkedHashMap) {
        Z1.i.f(uri, "deepLink");
        Z1.i.f(linkedHashMap, "arguments");
        Pattern pattern = (Pattern) this.f6945d.getValue();
        Matcher matcher = pattern != null ? pattern.matcher(uri.toString()) : null;
        if (matcher == null || !matcher.matches()) {
            return null;
        }
        Bundle bundle = new Bundle();
        if (!e(matcher, bundle, linkedHashMap)) {
            return null;
        }
        if (((Boolean) this.f6946e.getValue()).booleanValue() && !f(uri, bundle, linkedHashMap)) {
            return null;
        }
        String fragment = uri.getFragment();
        Pattern pattern2 = (Pattern) this.f6952k.getValue();
        Matcher matcher2 = pattern2 != null ? pattern2.matcher(String.valueOf(fragment)) : null;
        if (matcher2 != null && matcher2.matches()) {
            List list = (List) this.f6950i.getValue();
            ArrayList arrayList = new ArrayList(M1.n.g0(list, 10));
            int i3 = 0;
            for (Object obj : list) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    M1.m.f0();
                    throw null;
                }
                String str = (String) obj;
                String decode = Uri.decode(matcher2.group(i4));
                if (linkedHashMap.get(str) != null) {
                    throw new ClassCastException();
                }
                try {
                    Z1.i.e(decode, "value");
                    bundle.putString(str, decode);
                    arrayList.add(L1.z.f2729a);
                    i3 = i4;
                } catch (IllegalArgumentException unused) {
                }
            }
        }
        if (AbstractC0382a.t(linkedHashMap, new s(bundle, 0)).isEmpty()) {
            return bundle;
        }
        return null;
    }

    public final boolean e(Matcher matcher, Bundle bundle, LinkedHashMap linkedHashMap) {
        ArrayList arrayList = this.f6943b;
        ArrayList arrayList2 = new ArrayList(M1.n.g0(arrayList, 10));
        Iterator it = arrayList.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i4 = i3 + 1;
            if (i3 < 0) {
                M1.m.f0();
                throw null;
            }
            String str = (String) next;
            String decode = Uri.decode(matcher.group(i4));
            if (linkedHashMap.get(str) != null) {
                throw new ClassCastException();
            }
            try {
                Z1.i.e(decode, "value");
                bundle.putString(str, decode);
                arrayList2.add(L1.z.f2729a);
                i3 = i4;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof t)) {
            return false;
        }
        return this.f6942a.equals(((t) obj).f6942a) && Z1.i.a(null, null) && Z1.i.a(null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [L1.g, java.lang.Object] */
    public final boolean f(Uri uri, Bundle bundle, LinkedHashMap linkedHashMap) {
        Object obj;
        String query;
        for (Map.Entry entry : ((Map) this.f6947f.getValue()).entrySet()) {
            String str = (String) entry.getKey();
            q qVar = (q) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(str);
            if (this.f6948g && (query = uri.getQuery()) != null && !query.equals(uri.toString())) {
                queryParameters = AbstractC0157a.M(query);
            }
            Z1.i.e(queryParameters, "inputParams");
            L1.z zVar = L1.z.f2729a;
            int i3 = 0;
            Bundle l3 = AbstractC0157a.l(new L1.j[0]);
            Iterator it = qVar.f6935b.iterator();
            while (it.hasNext()) {
                if (linkedHashMap.get((String) it.next()) != null) {
                    throw new ClassCastException();
                }
            }
            for (String str2 : queryParameters) {
                String str3 = qVar.f6934a;
                Matcher matcher = str3 != null ? Pattern.compile(str3, 32).matcher(str2) : null;
                if (matcher == null || !matcher.matches()) {
                    return i3;
                }
                ArrayList arrayList = qVar.f6935b;
                ArrayList arrayList2 = new ArrayList(M1.n.g0(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                int i4 = i3;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        M1.m.f0();
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
                    if (l3.containsKey(str4)) {
                        obj = Boolean.valueOf(!l3.containsKey(str4));
                        arrayList2.add(obj);
                        i4 = i5;
                        i3 = 0;
                    } else {
                        l3.putString(str4, group);
                        obj = zVar;
                        arrayList2.add(obj);
                        i4 = i5;
                        i3 = 0;
                    }
                }
            }
            bundle.putAll(l3);
        }
        return true;
    }

    public final int hashCode() {
        return this.f6942a.hashCode() * 961;
    }
}
