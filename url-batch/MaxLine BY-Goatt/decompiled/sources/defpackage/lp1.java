package defpackage;

import android.net.Uri;
import android.os.Bundle;
import com.google.firebase.encoders.json.BuildConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class lp1 {
    public static final Pattern m = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");
    public static final Pattern n = Pattern.compile("\\{(.+?)\\}");
    public final String a;
    public final ArrayList b;
    public final String c;
    public final y91 d;
    public final y91 e;
    public final y91 f;
    public boolean g;
    public final y91 h;
    public final y91 i;
    public final y91 j;
    public final y91 k;
    public final boolean l;

    public lp1(String str) {
        this.a = str;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        this.d = ya1.b(new jp1(this, 6));
        this.e = ya1.b(new jp1(this, 4));
        kc1 kc1Var = kc1.m;
        this.f = ya1.a(kc1Var, new jp1(this, 7));
        this.h = ya1.a(kc1Var, new jp1(this, 1 == true ? 1 : 0));
        this.i = ya1.a(kc1Var, new jp1(this, 0));
        this.j = ya1.a(kc1Var, new jp1(this, 3));
        this.k = ya1.b(new jp1(this, 2));
        ya1.b(new jp1(this, 5));
        StringBuilder sb = new StringBuilder("^");
        if (!m.matcher(str).find()) {
            sb.append("http[s]?://");
        }
        Matcher matcher = Pattern.compile("(\\?|\\#|$)").matcher(str);
        matcher.find();
        a(str.substring(0, matcher.start()), arrayList, sb);
        this.l = (up2.q(sb, ".*") || up2.q(sb, "([^/]+?)")) ? false : true;
        sb.append("($|(\\?(.)*)|(\\#(.)*))");
        this.c = tp2.m(sb.toString(), ".*", "\\E.*\\Q");
    }

    public static void a(String str, ArrayList arrayList, StringBuilder sb) {
        Matcher matcher = n.matcher(str);
        int i = 0;
        while (matcher.find()) {
            String group = matcher.group(1);
            group.getClass();
            arrayList.add(group);
            if (matcher.start() > i) {
                sb.append(Pattern.quote(str.substring(i, matcher.start())));
            }
            sb.append("([^/]*?|)");
            i = matcher.end();
        }
        if (i < str.length()) {
            sb.append(Pattern.quote(str.substring(i)));
        }
    }

    public static void g(Bundle bundle, String str, String str2, yo1 yo1Var) {
        if (yo1Var == null) {
            bundle.putString(str, str2);
            return;
        }
        iq1 iq1Var = yo1Var.a;
        str.getClass();
        str2.getClass();
        iq1Var.e(bundle, str, iq1Var.d(str2));
    }

    public final int b(Uri uri) {
        if (uri == null) {
            return 0;
        }
        List<String> pathSegments = uri.getPathSegments();
        List<String> pathSegments2 = Uri.parse(this.a).getPathSegments();
        pathSegments.getClass();
        pathSegments2.getClass();
        Set P = zv.P(pathSegments);
        P.retainAll(pathSegments2);
        return P.size();
    }

    public final ArrayList c() {
        Collection values = ((Map) this.f.getValue()).values();
        ArrayList arrayList = new ArrayList();
        Iterator it = values.iterator();
        while (it.hasNext()) {
            vv.o(((ip1) it.next()).b, arrayList);
        }
        return zv.E(zv.E(this.b, arrayList), (List) this.i.getValue());
    }

    public final Bundle d(Uri uri, LinkedHashMap linkedHashMap) {
        uri.getClass();
        linkedHashMap.getClass();
        Pattern pattern = (Pattern) this.d.getValue();
        Matcher matcher = pattern != null ? pattern.matcher(uri.toString()) : null;
        if (matcher != null && matcher.matches()) {
            Bundle bundle = new Bundle();
            if (e(matcher, bundle, linkedHashMap) && (!((Boolean) this.e.getValue()).booleanValue() || f(uri, bundle, linkedHashMap))) {
                String fragment = uri.getFragment();
                Pattern pattern2 = (Pattern) this.k.getValue();
                Matcher matcher2 = pattern2 != null ? pattern2.matcher(String.valueOf(fragment)) : null;
                if (matcher2 != null && matcher2.matches()) {
                    List list = (List) this.i.getValue();
                    ArrayList arrayList = new ArrayList(rv.l(list, 10));
                    int i = 0;
                    for (Object obj : list) {
                        int i2 = i + 1;
                        if (i < 0) {
                            qv.k();
                            throw null;
                        }
                        String str = (String) obj;
                        String decode = Uri.decode(matcher2.group(i2));
                        yo1 yo1Var = (yo1) linkedHashMap.get(str);
                        try {
                            decode.getClass();
                            g(bundle, str, decode, yo1Var);
                            arrayList.add(Unit.a);
                            i = i2;
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                }
                if (bd3.F(linkedHashMap, new kp1(0, bundle)).isEmpty()) {
                    return bundle;
                }
            }
        }
        return null;
    }

    public final boolean e(Matcher matcher, Bundle bundle, Map map) {
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = new ArrayList(rv.l(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            int i3 = i + 1;
            if (i < 0) {
                qv.k();
                throw null;
            }
            String str = (String) obj;
            String decode = Uri.decode(matcher.group(i3));
            yo1 yo1Var = (yo1) map.get(str);
            try {
                decode.getClass();
                g(bundle, str, decode, yo1Var);
                arrayList2.add(Unit.a);
                i = i3;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof lp1)) {
            return false;
        }
        return this.a.equals(((lp1) obj).a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean f(Uri uri, Bundle bundle, Map map) {
        Object obj;
        boolean z;
        Object obj2;
        String query;
        lp1 lp1Var = this;
        for (Map.Entry entry : ((Map) lp1Var.f.getValue()).entrySet()) {
            String str = (String) entry.getKey();
            ip1 ip1Var = (ip1) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(str);
            if (lp1Var.g && (query = uri.getQuery()) != null && !query.equals(uri.toString())) {
                queryParameters = pv.c(query);
            }
            queryParameters.getClass();
            int i = 0;
            Bundle o = iv1.o(new Pair[0]);
            ArrayList arrayList = ip1Var.b;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj3 = arrayList.get(i2);
                i2++;
                String str2 = (String) obj3;
                yo1 yo1Var = (yo1) map.get(str2);
                iq1 iq1Var = yo1Var != null ? yo1Var.a : null;
                if ((iq1Var instanceof fq1) && !yo1Var.b) {
                    switch (((fq1) iq1Var).e) {
                        case 0:
                            obj2 = new boolean[0];
                            break;
                        case 1:
                            obj2 = new float[0];
                            break;
                        case 2:
                            obj2 = new int[0];
                            break;
                        case 3:
                            obj2 = new long[0];
                            break;
                        default:
                            obj2 = new String[0];
                            break;
                    }
                    iq1Var.e(o, str2, obj2);
                }
            }
            for (String str3 : queryParameters) {
                String str4 = ip1Var.a;
                Matcher matcher = str4 != null ? Pattern.compile(str4, 32).matcher(str3) : null;
                if (matcher == null || !matcher.matches()) {
                    return i;
                }
                ArrayList arrayList2 = ip1Var.b;
                ArrayList arrayList3 = new ArrayList(rv.l(arrayList2, 10));
                int size2 = arrayList2.size();
                int i3 = i;
                int i4 = i3;
                while (i4 < size2) {
                    Object obj4 = arrayList2.get(i4);
                    i4++;
                    int i5 = i3 + 1;
                    if (i3 < 0) {
                        qv.k();
                        throw null;
                    }
                    String str5 = (String) obj4;
                    String group = matcher.group(i5);
                    if (group == null) {
                        group = BuildConfig.FLAVOR;
                    }
                    int i6 = i;
                    String str6 = group;
                    yo1 yo1Var2 = (yo1) map.get(str5);
                    try {
                        if (o.containsKey(str5)) {
                            if (o.containsKey(str5)) {
                                if (yo1Var2 != null) {
                                    iq1 iq1Var2 = yo1Var2.a;
                                    Object a = iq1Var2.a(o, str5);
                                    if (!o.containsKey(str5)) {
                                        throw new IllegalArgumentException("There is no previous value in this bundle.");
                                    }
                                    iq1Var2.e(o, str5, iq1Var2.c(a, str6));
                                }
                                z = i6;
                            } else {
                                z = 1;
                            }
                            obj = Boolean.valueOf(z);
                        } else {
                            g(o, str5, str6, yo1Var2);
                            obj = Unit.a;
                        }
                    } catch (IllegalArgumentException unused) {
                        obj = Unit.a;
                    }
                    arrayList3.add(obj);
                    i3 = i5;
                    i = i6;
                }
            }
            bundle.putAll(o);
            lp1Var = this;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() * 961;
    }
}
