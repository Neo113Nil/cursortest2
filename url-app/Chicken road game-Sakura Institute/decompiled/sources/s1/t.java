package s1;

import a.AbstractC0345a;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import y2.C1336k;
import y2.EnumC1337l;
import y2.InterfaceC1335j;
import z2.C1440x;
import z2.C1441y;
import z2.C1442z;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f10550m = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* renamed from: n, reason: collision with root package name */
    public static final Pattern f10551n = Pattern.compile("\\{(.+?)\\}");

    /* renamed from: a, reason: collision with root package name */
    public final String f10552a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f10553b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10554c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1335j f10555d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC1335j f10556e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f10557f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10558g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f10559h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f10560i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f10561j;

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC1335j f10562k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f10563l;

    public t(String str) {
        this.f10552a = str;
        ArrayList arrayList = new ArrayList();
        this.f10553b = arrayList;
        this.f10555d = C1336k.a(new r(this, 6));
        this.f10556e = C1336k.a(new r(this, 4));
        EnumC1337l enumC1337l = EnumC1337l.f11671e;
        this.f10557f = C1336k.b(enumC1337l, new r(this, 7));
        this.f10559h = C1336k.b(enumC1337l, new r(this, 1));
        this.f10560i = C1336k.b(enumC1337l, new r(this, 0));
        this.f10561j = C1336k.b(enumC1337l, new r(this, 3));
        this.f10562k = C1336k.a(new r(this, 2));
        C1336k.a(new r(this, 5));
        StringBuilder sb = new StringBuilder("^");
        if (!f10550m.matcher(str).find()) {
            sb.append("http[s]?://");
        }
        Matcher matcher = Pattern.compile("(\\?|\\#|$)").matcher(str);
        matcher.find();
        boolean z4 = false;
        String substring = str.substring(0, matcher.start());
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        a(substring, arrayList, sb);
        if (!kotlin.text.y.p(sb, ".*") && !kotlin.text.y.p(sb, "([^/]+?)")) {
            z4 = true;
        }
        this.f10563l = z4;
        sb.append("($|(\\?(.)*)|(\\#(.)*))");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "uriRegex.toString()");
        this.f10554c = kotlin.text.u.l(sb2, ".*", "\\E.*\\Q");
    }

    public static void a(String str, ArrayList arrayList, StringBuilder sb) {
        Matcher matcher = f10551n.matcher(str);
        int i2 = 0;
        while (matcher.find()) {
            String group = matcher.group(1);
            Intrinsics.d(group, "null cannot be cast to non-null type kotlin.String");
            arrayList.add(group);
            if (matcher.start() > i2) {
                String substring = str.substring(i2, matcher.start());
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                sb.append(Pattern.quote(substring));
            }
            sb.append("([^/]*?|)");
            i2 = matcher.end();
        }
        if (i2 < str.length()) {
            String substring2 = str.substring(i2);
            Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
            sb.append(Pattern.quote(substring2));
        }
    }

    public final boolean b(Matcher matcher, Bundle bundle, LinkedHashMap linkedHashMap) {
        ArrayList arrayList = this.f10553b;
        ArrayList arrayList2 = new ArrayList(C1442z.h(arrayList, 10));
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i4 = i2 + 1;
            if (i2 < 0) {
                C1441y.g();
                throw null;
            }
            String str = (String) next;
            String value = Uri.decode(matcher.group(i4));
            if (linkedHashMap.get(str) != null) {
                throw new ClassCastException();
            }
            try {
                Intrinsics.checkNotNullExpressionValue(value, "value");
                bundle.putString(str, value);
                arrayList2.add(Unit.f7487a);
                i2 = i4;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, y2.j] */
    public final boolean c(Uri uri, Bundle bundle, LinkedHashMap linkedHashMap) {
        Object obj;
        String query;
        for (Map.Entry entry : ((Map) this.f10557f.getValue()).entrySet()) {
            String str = (String) entry.getKey();
            q qVar = (q) entry.getValue();
            List<String> inputParams = uri.getQueryParameters(str);
            if (this.f10558g && (query = uri.getQuery()) != null && !query.equals(uri.toString())) {
                inputParams = C1440x.a(query);
            }
            Intrinsics.checkNotNullExpressionValue(inputParams, "inputParams");
            int i2 = 0;
            Bundle i4 = AbstractC0345a.i(new Pair[0]);
            Iterator it = qVar.f10545b.iterator();
            while (it.hasNext()) {
                if (linkedHashMap.get((String) it.next()) != null) {
                    throw new ClassCastException();
                }
            }
            for (String str2 : inputParams) {
                String str3 = qVar.f10544a;
                Matcher matcher = str3 != null ? Pattern.compile(str3, 32).matcher(str2) : null;
                if (matcher == null || !matcher.matches()) {
                    return i2;
                }
                ArrayList arrayList = qVar.f10545b;
                ArrayList arrayList2 = new ArrayList(C1442z.h(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                int i5 = i2;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        C1441y.g();
                        throw null;
                    }
                    String str4 = (String) next;
                    String group = matcher.group(i6);
                    if (group == null) {
                        group = "";
                    } else {
                        Intrinsics.checkNotNullExpressionValue(group, "argMatcher.group(index + 1) ?: \"\"");
                    }
                    if (linkedHashMap.get(str4) != null) {
                        throw new ClassCastException();
                    }
                    try {
                        if (i4.containsKey(str4)) {
                            obj = Boolean.valueOf(!i4.containsKey(str4));
                        } else {
                            i4.putString(str4, group);
                            obj = Unit.f7487a;
                        }
                    } catch (IllegalArgumentException unused) {
                        obj = Unit.f7487a;
                    }
                    arrayList2.add(obj);
                    i5 = i6;
                    i2 = 0;
                }
            }
            bundle.putAll(i4);
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof t)) {
            return false;
        }
        return this.f10552a.equals(((t) obj).f10552a) && Intrinsics.a(null, null) && Intrinsics.a(null, null);
    }

    public final int hashCode() {
        return this.f10552a.hashCode() * 961;
    }
}
