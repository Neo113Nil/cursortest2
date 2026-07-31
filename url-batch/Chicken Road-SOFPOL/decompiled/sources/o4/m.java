package o4;

import a0.g1;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: m, reason: collision with root package name */
    public static final y6.c f5647m = new y6.c("^[a-zA-Z]+[+\\w\\-.]*:");

    /* renamed from: n, reason: collision with root package name */
    public static final y6.c f5648n = new y6.c("\\{(.+?)\\}");

    /* renamed from: o, reason: collision with root package name */
    public static final y6.c f5649o = new y6.c("http[s]?://");

    /* renamed from: p, reason: collision with root package name */
    public static final y6.c f5650p = new y6.c(".*");

    /* renamed from: q, reason: collision with root package name */
    public static final y6.c f5651q = new y6.c("([^/]*?|)");

    /* renamed from: r, reason: collision with root package name */
    public static final y6.c f5652r = new y6.c("^[^?#]+\\?([^#]*).*");

    /* renamed from: a, reason: collision with root package name */
    public final String f5653a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f5654b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5655c;

    /* renamed from: d, reason: collision with root package name */
    public final c6.k f5656d;

    /* renamed from: e, reason: collision with root package name */
    public final c6.k f5657e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f5658f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5659g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f5660h;
    public final Object i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f5661j;

    /* renamed from: k, reason: collision with root package name */
    public final c6.k f5662k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f5663l;

    public m(String str) {
        this.f5653a = str;
        ArrayList arrayList = new ArrayList();
        this.f5654b = arrayList;
        final int i = 0;
        this.f5656d = a.a.r(new p6.a(this) { // from class: o4.j

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ m f5642e;

            {
                this.f5642e = this;
            }

            /* JADX WARN: Type inference failed for: r1v20, types: [c6.d, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v27, types: [c6.d, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v34, types: [c6.d, java.lang.Object] */
            @Override // p6.a
            public final Object b() {
                List list;
                switch (i) {
                    case 0:
                        String str2 = this.f5642e.f5655c;
                        if (str2 != null) {
                            return new y6.c(str2, 0);
                        }
                        return null;
                    case 1:
                        String str3 = this.f5642e.f5653a;
                        y6.c cVar = m.f5652r;
                        cVar.getClass();
                        return Boolean.valueOf(cVar.f8993d.matcher(str3).matches());
                    case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                        m mVar = this.f5642e;
                        String str4 = mVar.f5653a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) mVar.f5657e.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str4);
                            q6.i.d(parse, "parse(...)");
                            for (String str5 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str5);
                                int i8 = 1;
                                if (queryParameters.size() > 1) {
                                    throw new IllegalArgumentException(("Query parameter " + str5 + " must only be present once in " + str4 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str6 = (String) d6.m.S(queryParameters);
                                if (str6 == null) {
                                    mVar.f5659g = true;
                                    str6 = str5;
                                }
                                g1 a8 = y6.c.a(m.f5648n, str6);
                                l lVar = new l();
                                int i9 = 0;
                                while (a8 != null) {
                                    y6.b b8 = ((r0.i) a8.f86d).b(i8);
                                    q6.i.b(b8);
                                    int i10 = i8;
                                    lVar.f5646b.add(b8.f8991a);
                                    if (a8.t().f7492d > i9) {
                                        String substring = str6.substring(i9, a8.t().f7492d);
                                        q6.i.d(substring, "substring(...)");
                                        String quote = Pattern.quote(substring);
                                        q6.i.d(quote, "quote(...)");
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i9 = a8.t().f7493e + 1;
                                    a8 = a8.D();
                                    i8 = i10;
                                }
                                if (i9 < str6.length()) {
                                    String substring2 = str6.substring(i9);
                                    q6.i.d(substring2, "substring(...)");
                                    String quote2 = Pattern.quote(substring2);
                                    q6.i.d(quote2, "quote(...)");
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                String sb2 = sb.toString();
                                q6.i.d(sb2, "toString(...)");
                                lVar.f5645a = m.g(sb2);
                                linkedHashMap.put(str5, lVar);
                            }
                        }
                        return linkedHashMap;
                    case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                        String str7 = this.f5642e.f5653a;
                        Uri parse2 = Uri.parse(str7);
                        q6.i.d(parse2, "parse(...)");
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str7);
                        q6.i.d(parse3, "parse(...)");
                        String fragment = parse3.getFragment();
                        StringBuilder sb3 = new StringBuilder();
                        q6.i.b(fragment);
                        m.a(fragment, arrayList2, sb3);
                        return new c6.f(arrayList2, sb3.toString());
                    case a4.i.LONG_FIELD_NUMBER /* 4 */:
                        c6.f fVar = (c6.f) this.f5642e.f5660h.getValue();
                        return (fVar == null || (list = (List) fVar.f1747d) == null) ? new ArrayList() : list;
                    case 5:
                        c6.f fVar2 = (c6.f) this.f5642e.f5660h.getValue();
                        if (fVar2 != null) {
                            return (String) fVar2.f1748e;
                        }
                        return null;
                    case 6:
                        String str8 = (String) this.f5642e.f5661j.getValue();
                        if (str8 != null) {
                            return new y6.c(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i8 = 1;
        this.f5657e = a.a.r(new p6.a(this) { // from class: o4.j

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ m f5642e;

            {
                this.f5642e = this;
            }

            /* JADX WARN: Type inference failed for: r1v20, types: [c6.d, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v27, types: [c6.d, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v34, types: [c6.d, java.lang.Object] */
            @Override // p6.a
            public final Object b() {
                List list;
                switch (i8) {
                    case 0:
                        String str2 = this.f5642e.f5655c;
                        if (str2 != null) {
                            return new y6.c(str2, 0);
                        }
                        return null;
                    case 1:
                        String str3 = this.f5642e.f5653a;
                        y6.c cVar = m.f5652r;
                        cVar.getClass();
                        return Boolean.valueOf(cVar.f8993d.matcher(str3).matches());
                    case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                        m mVar = this.f5642e;
                        String str4 = mVar.f5653a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) mVar.f5657e.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str4);
                            q6.i.d(parse, "parse(...)");
                            for (String str5 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str5);
                                int i82 = 1;
                                if (queryParameters.size() > 1) {
                                    throw new IllegalArgumentException(("Query parameter " + str5 + " must only be present once in " + str4 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str6 = (String) d6.m.S(queryParameters);
                                if (str6 == null) {
                                    mVar.f5659g = true;
                                    str6 = str5;
                                }
                                g1 a8 = y6.c.a(m.f5648n, str6);
                                l lVar = new l();
                                int i9 = 0;
                                while (a8 != null) {
                                    y6.b b8 = ((r0.i) a8.f86d).b(i82);
                                    q6.i.b(b8);
                                    int i10 = i82;
                                    lVar.f5646b.add(b8.f8991a);
                                    if (a8.t().f7492d > i9) {
                                        String substring = str6.substring(i9, a8.t().f7492d);
                                        q6.i.d(substring, "substring(...)");
                                        String quote = Pattern.quote(substring);
                                        q6.i.d(quote, "quote(...)");
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i9 = a8.t().f7493e + 1;
                                    a8 = a8.D();
                                    i82 = i10;
                                }
                                if (i9 < str6.length()) {
                                    String substring2 = str6.substring(i9);
                                    q6.i.d(substring2, "substring(...)");
                                    String quote2 = Pattern.quote(substring2);
                                    q6.i.d(quote2, "quote(...)");
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                String sb2 = sb.toString();
                                q6.i.d(sb2, "toString(...)");
                                lVar.f5645a = m.g(sb2);
                                linkedHashMap.put(str5, lVar);
                            }
                        }
                        return linkedHashMap;
                    case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                        String str7 = this.f5642e.f5653a;
                        Uri parse2 = Uri.parse(str7);
                        q6.i.d(parse2, "parse(...)");
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str7);
                        q6.i.d(parse3, "parse(...)");
                        String fragment = parse3.getFragment();
                        StringBuilder sb3 = new StringBuilder();
                        q6.i.b(fragment);
                        m.a(fragment, arrayList2, sb3);
                        return new c6.f(arrayList2, sb3.toString());
                    case a4.i.LONG_FIELD_NUMBER /* 4 */:
                        c6.f fVar = (c6.f) this.f5642e.f5660h.getValue();
                        return (fVar == null || (list = (List) fVar.f1747d) == null) ? new ArrayList() : list;
                    case 5:
                        c6.f fVar2 = (c6.f) this.f5642e.f5660h.getValue();
                        if (fVar2 != null) {
                            return (String) fVar2.f1748e;
                        }
                        return null;
                    case 6:
                        String str8 = (String) this.f5642e.f5661j.getValue();
                        if (str8 != null) {
                            return new y6.c(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i9 = 2;
        p6.a aVar = new p6.a(this) { // from class: o4.j

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ m f5642e;

            {
                this.f5642e = this;
            }

            /* JADX WARN: Type inference failed for: r1v20, types: [c6.d, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v27, types: [c6.d, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v34, types: [c6.d, java.lang.Object] */
            @Override // p6.a
            public final Object b() {
                List list;
                switch (i9) {
                    case 0:
                        String str2 = this.f5642e.f5655c;
                        if (str2 != null) {
                            return new y6.c(str2, 0);
                        }
                        return null;
                    case 1:
                        String str3 = this.f5642e.f5653a;
                        y6.c cVar = m.f5652r;
                        cVar.getClass();
                        return Boolean.valueOf(cVar.f8993d.matcher(str3).matches());
                    case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                        m mVar = this.f5642e;
                        String str4 = mVar.f5653a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) mVar.f5657e.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str4);
                            q6.i.d(parse, "parse(...)");
                            for (String str5 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str5);
                                int i82 = 1;
                                if (queryParameters.size() > 1) {
                                    throw new IllegalArgumentException(("Query parameter " + str5 + " must only be present once in " + str4 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str6 = (String) d6.m.S(queryParameters);
                                if (str6 == null) {
                                    mVar.f5659g = true;
                                    str6 = str5;
                                }
                                g1 a8 = y6.c.a(m.f5648n, str6);
                                l lVar = new l();
                                int i92 = 0;
                                while (a8 != null) {
                                    y6.b b8 = ((r0.i) a8.f86d).b(i82);
                                    q6.i.b(b8);
                                    int i10 = i82;
                                    lVar.f5646b.add(b8.f8991a);
                                    if (a8.t().f7492d > i92) {
                                        String substring = str6.substring(i92, a8.t().f7492d);
                                        q6.i.d(substring, "substring(...)");
                                        String quote = Pattern.quote(substring);
                                        q6.i.d(quote, "quote(...)");
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i92 = a8.t().f7493e + 1;
                                    a8 = a8.D();
                                    i82 = i10;
                                }
                                if (i92 < str6.length()) {
                                    String substring2 = str6.substring(i92);
                                    q6.i.d(substring2, "substring(...)");
                                    String quote2 = Pattern.quote(substring2);
                                    q6.i.d(quote2, "quote(...)");
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                String sb2 = sb.toString();
                                q6.i.d(sb2, "toString(...)");
                                lVar.f5645a = m.g(sb2);
                                linkedHashMap.put(str5, lVar);
                            }
                        }
                        return linkedHashMap;
                    case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                        String str7 = this.f5642e.f5653a;
                        Uri parse2 = Uri.parse(str7);
                        q6.i.d(parse2, "parse(...)");
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str7);
                        q6.i.d(parse3, "parse(...)");
                        String fragment = parse3.getFragment();
                        StringBuilder sb3 = new StringBuilder();
                        q6.i.b(fragment);
                        m.a(fragment, arrayList2, sb3);
                        return new c6.f(arrayList2, sb3.toString());
                    case a4.i.LONG_FIELD_NUMBER /* 4 */:
                        c6.f fVar = (c6.f) this.f5642e.f5660h.getValue();
                        return (fVar == null || (list = (List) fVar.f1747d) == null) ? new ArrayList() : list;
                    case 5:
                        c6.f fVar2 = (c6.f) this.f5642e.f5660h.getValue();
                        if (fVar2 != null) {
                            return (String) fVar2.f1748e;
                        }
                        return null;
                    case 6:
                        String str8 = (String) this.f5642e.f5661j.getValue();
                        if (str8 != null) {
                            return new y6.c(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        };
        c6.e eVar = c6.e.f1745d;
        this.f5658f = a.a.q(eVar, aVar);
        final int i10 = 3;
        this.f5660h = a.a.q(eVar, new p6.a(this) { // from class: o4.j

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ m f5642e;

            {
                this.f5642e = this;
            }

            /* JADX WARN: Type inference failed for: r1v20, types: [c6.d, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v27, types: [c6.d, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v34, types: [c6.d, java.lang.Object] */
            @Override // p6.a
            public final Object b() {
                List list;
                switch (i10) {
                    case 0:
                        String str2 = this.f5642e.f5655c;
                        if (str2 != null) {
                            return new y6.c(str2, 0);
                        }
                        return null;
                    case 1:
                        String str3 = this.f5642e.f5653a;
                        y6.c cVar = m.f5652r;
                        cVar.getClass();
                        return Boolean.valueOf(cVar.f8993d.matcher(str3).matches());
                    case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                        m mVar = this.f5642e;
                        String str4 = mVar.f5653a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) mVar.f5657e.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str4);
                            q6.i.d(parse, "parse(...)");
                            for (String str5 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str5);
                                int i82 = 1;
                                if (queryParameters.size() > 1) {
                                    throw new IllegalArgumentException(("Query parameter " + str5 + " must only be present once in " + str4 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str6 = (String) d6.m.S(queryParameters);
                                if (str6 == null) {
                                    mVar.f5659g = true;
                                    str6 = str5;
                                }
                                g1 a8 = y6.c.a(m.f5648n, str6);
                                l lVar = new l();
                                int i92 = 0;
                                while (a8 != null) {
                                    y6.b b8 = ((r0.i) a8.f86d).b(i82);
                                    q6.i.b(b8);
                                    int i102 = i82;
                                    lVar.f5646b.add(b8.f8991a);
                                    if (a8.t().f7492d > i92) {
                                        String substring = str6.substring(i92, a8.t().f7492d);
                                        q6.i.d(substring, "substring(...)");
                                        String quote = Pattern.quote(substring);
                                        q6.i.d(quote, "quote(...)");
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i92 = a8.t().f7493e + 1;
                                    a8 = a8.D();
                                    i82 = i102;
                                }
                                if (i92 < str6.length()) {
                                    String substring2 = str6.substring(i92);
                                    q6.i.d(substring2, "substring(...)");
                                    String quote2 = Pattern.quote(substring2);
                                    q6.i.d(quote2, "quote(...)");
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                String sb2 = sb.toString();
                                q6.i.d(sb2, "toString(...)");
                                lVar.f5645a = m.g(sb2);
                                linkedHashMap.put(str5, lVar);
                            }
                        }
                        return linkedHashMap;
                    case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                        String str7 = this.f5642e.f5653a;
                        Uri parse2 = Uri.parse(str7);
                        q6.i.d(parse2, "parse(...)");
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str7);
                        q6.i.d(parse3, "parse(...)");
                        String fragment = parse3.getFragment();
                        StringBuilder sb3 = new StringBuilder();
                        q6.i.b(fragment);
                        m.a(fragment, arrayList2, sb3);
                        return new c6.f(arrayList2, sb3.toString());
                    case a4.i.LONG_FIELD_NUMBER /* 4 */:
                        c6.f fVar = (c6.f) this.f5642e.f5660h.getValue();
                        return (fVar == null || (list = (List) fVar.f1747d) == null) ? new ArrayList() : list;
                    case 5:
                        c6.f fVar2 = (c6.f) this.f5642e.f5660h.getValue();
                        if (fVar2 != null) {
                            return (String) fVar2.f1748e;
                        }
                        return null;
                    case 6:
                        String str8 = (String) this.f5642e.f5661j.getValue();
                        if (str8 != null) {
                            return new y6.c(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i11 = 4;
        this.i = a.a.q(eVar, new p6.a(this) { // from class: o4.j

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ m f5642e;

            {
                this.f5642e = this;
            }

            /* JADX WARN: Type inference failed for: r1v20, types: [c6.d, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v27, types: [c6.d, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v34, types: [c6.d, java.lang.Object] */
            @Override // p6.a
            public final Object b() {
                List list;
                switch (i11) {
                    case 0:
                        String str2 = this.f5642e.f5655c;
                        if (str2 != null) {
                            return new y6.c(str2, 0);
                        }
                        return null;
                    case 1:
                        String str3 = this.f5642e.f5653a;
                        y6.c cVar = m.f5652r;
                        cVar.getClass();
                        return Boolean.valueOf(cVar.f8993d.matcher(str3).matches());
                    case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                        m mVar = this.f5642e;
                        String str4 = mVar.f5653a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) mVar.f5657e.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str4);
                            q6.i.d(parse, "parse(...)");
                            for (String str5 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str5);
                                int i82 = 1;
                                if (queryParameters.size() > 1) {
                                    throw new IllegalArgumentException(("Query parameter " + str5 + " must only be present once in " + str4 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str6 = (String) d6.m.S(queryParameters);
                                if (str6 == null) {
                                    mVar.f5659g = true;
                                    str6 = str5;
                                }
                                g1 a8 = y6.c.a(m.f5648n, str6);
                                l lVar = new l();
                                int i92 = 0;
                                while (a8 != null) {
                                    y6.b b8 = ((r0.i) a8.f86d).b(i82);
                                    q6.i.b(b8);
                                    int i102 = i82;
                                    lVar.f5646b.add(b8.f8991a);
                                    if (a8.t().f7492d > i92) {
                                        String substring = str6.substring(i92, a8.t().f7492d);
                                        q6.i.d(substring, "substring(...)");
                                        String quote = Pattern.quote(substring);
                                        q6.i.d(quote, "quote(...)");
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i92 = a8.t().f7493e + 1;
                                    a8 = a8.D();
                                    i82 = i102;
                                }
                                if (i92 < str6.length()) {
                                    String substring2 = str6.substring(i92);
                                    q6.i.d(substring2, "substring(...)");
                                    String quote2 = Pattern.quote(substring2);
                                    q6.i.d(quote2, "quote(...)");
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                String sb2 = sb.toString();
                                q6.i.d(sb2, "toString(...)");
                                lVar.f5645a = m.g(sb2);
                                linkedHashMap.put(str5, lVar);
                            }
                        }
                        return linkedHashMap;
                    case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                        String str7 = this.f5642e.f5653a;
                        Uri parse2 = Uri.parse(str7);
                        q6.i.d(parse2, "parse(...)");
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str7);
                        q6.i.d(parse3, "parse(...)");
                        String fragment = parse3.getFragment();
                        StringBuilder sb3 = new StringBuilder();
                        q6.i.b(fragment);
                        m.a(fragment, arrayList2, sb3);
                        return new c6.f(arrayList2, sb3.toString());
                    case a4.i.LONG_FIELD_NUMBER /* 4 */:
                        c6.f fVar = (c6.f) this.f5642e.f5660h.getValue();
                        return (fVar == null || (list = (List) fVar.f1747d) == null) ? new ArrayList() : list;
                    case 5:
                        c6.f fVar2 = (c6.f) this.f5642e.f5660h.getValue();
                        if (fVar2 != null) {
                            return (String) fVar2.f1748e;
                        }
                        return null;
                    case 6:
                        String str8 = (String) this.f5642e.f5661j.getValue();
                        if (str8 != null) {
                            return new y6.c(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i12 = 5;
        this.f5661j = a.a.q(eVar, new p6.a(this) { // from class: o4.j

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ m f5642e;

            {
                this.f5642e = this;
            }

            /* JADX WARN: Type inference failed for: r1v20, types: [c6.d, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v27, types: [c6.d, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v34, types: [c6.d, java.lang.Object] */
            @Override // p6.a
            public final Object b() {
                List list;
                switch (i12) {
                    case 0:
                        String str2 = this.f5642e.f5655c;
                        if (str2 != null) {
                            return new y6.c(str2, 0);
                        }
                        return null;
                    case 1:
                        String str3 = this.f5642e.f5653a;
                        y6.c cVar = m.f5652r;
                        cVar.getClass();
                        return Boolean.valueOf(cVar.f8993d.matcher(str3).matches());
                    case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                        m mVar = this.f5642e;
                        String str4 = mVar.f5653a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) mVar.f5657e.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str4);
                            q6.i.d(parse, "parse(...)");
                            for (String str5 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str5);
                                int i82 = 1;
                                if (queryParameters.size() > 1) {
                                    throw new IllegalArgumentException(("Query parameter " + str5 + " must only be present once in " + str4 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str6 = (String) d6.m.S(queryParameters);
                                if (str6 == null) {
                                    mVar.f5659g = true;
                                    str6 = str5;
                                }
                                g1 a8 = y6.c.a(m.f5648n, str6);
                                l lVar = new l();
                                int i92 = 0;
                                while (a8 != null) {
                                    y6.b b8 = ((r0.i) a8.f86d).b(i82);
                                    q6.i.b(b8);
                                    int i102 = i82;
                                    lVar.f5646b.add(b8.f8991a);
                                    if (a8.t().f7492d > i92) {
                                        String substring = str6.substring(i92, a8.t().f7492d);
                                        q6.i.d(substring, "substring(...)");
                                        String quote = Pattern.quote(substring);
                                        q6.i.d(quote, "quote(...)");
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i92 = a8.t().f7493e + 1;
                                    a8 = a8.D();
                                    i82 = i102;
                                }
                                if (i92 < str6.length()) {
                                    String substring2 = str6.substring(i92);
                                    q6.i.d(substring2, "substring(...)");
                                    String quote2 = Pattern.quote(substring2);
                                    q6.i.d(quote2, "quote(...)");
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                String sb2 = sb.toString();
                                q6.i.d(sb2, "toString(...)");
                                lVar.f5645a = m.g(sb2);
                                linkedHashMap.put(str5, lVar);
                            }
                        }
                        return linkedHashMap;
                    case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                        String str7 = this.f5642e.f5653a;
                        Uri parse2 = Uri.parse(str7);
                        q6.i.d(parse2, "parse(...)");
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str7);
                        q6.i.d(parse3, "parse(...)");
                        String fragment = parse3.getFragment();
                        StringBuilder sb3 = new StringBuilder();
                        q6.i.b(fragment);
                        m.a(fragment, arrayList2, sb3);
                        return new c6.f(arrayList2, sb3.toString());
                    case a4.i.LONG_FIELD_NUMBER /* 4 */:
                        c6.f fVar = (c6.f) this.f5642e.f5660h.getValue();
                        return (fVar == null || (list = (List) fVar.f1747d) == null) ? new ArrayList() : list;
                    case 5:
                        c6.f fVar2 = (c6.f) this.f5642e.f5660h.getValue();
                        if (fVar2 != null) {
                            return (String) fVar2.f1748e;
                        }
                        return null;
                    case 6:
                        String str8 = (String) this.f5642e.f5661j.getValue();
                        if (str8 != null) {
                            return new y6.c(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i13 = 6;
        this.f5662k = a.a.r(new p6.a(this) { // from class: o4.j

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ m f5642e;

            {
                this.f5642e = this;
            }

            /* JADX WARN: Type inference failed for: r1v20, types: [c6.d, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v27, types: [c6.d, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v34, types: [c6.d, java.lang.Object] */
            @Override // p6.a
            public final Object b() {
                List list;
                switch (i13) {
                    case 0:
                        String str2 = this.f5642e.f5655c;
                        if (str2 != null) {
                            return new y6.c(str2, 0);
                        }
                        return null;
                    case 1:
                        String str3 = this.f5642e.f5653a;
                        y6.c cVar = m.f5652r;
                        cVar.getClass();
                        return Boolean.valueOf(cVar.f8993d.matcher(str3).matches());
                    case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                        m mVar = this.f5642e;
                        String str4 = mVar.f5653a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) mVar.f5657e.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str4);
                            q6.i.d(parse, "parse(...)");
                            for (String str5 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str5);
                                int i82 = 1;
                                if (queryParameters.size() > 1) {
                                    throw new IllegalArgumentException(("Query parameter " + str5 + " must only be present once in " + str4 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str6 = (String) d6.m.S(queryParameters);
                                if (str6 == null) {
                                    mVar.f5659g = true;
                                    str6 = str5;
                                }
                                g1 a8 = y6.c.a(m.f5648n, str6);
                                l lVar = new l();
                                int i92 = 0;
                                while (a8 != null) {
                                    y6.b b8 = ((r0.i) a8.f86d).b(i82);
                                    q6.i.b(b8);
                                    int i102 = i82;
                                    lVar.f5646b.add(b8.f8991a);
                                    if (a8.t().f7492d > i92) {
                                        String substring = str6.substring(i92, a8.t().f7492d);
                                        q6.i.d(substring, "substring(...)");
                                        String quote = Pattern.quote(substring);
                                        q6.i.d(quote, "quote(...)");
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i92 = a8.t().f7493e + 1;
                                    a8 = a8.D();
                                    i82 = i102;
                                }
                                if (i92 < str6.length()) {
                                    String substring2 = str6.substring(i92);
                                    q6.i.d(substring2, "substring(...)");
                                    String quote2 = Pattern.quote(substring2);
                                    q6.i.d(quote2, "quote(...)");
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                String sb2 = sb.toString();
                                q6.i.d(sb2, "toString(...)");
                                lVar.f5645a = m.g(sb2);
                                linkedHashMap.put(str5, lVar);
                            }
                        }
                        return linkedHashMap;
                    case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                        String str7 = this.f5642e.f5653a;
                        Uri parse2 = Uri.parse(str7);
                        q6.i.d(parse2, "parse(...)");
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str7);
                        q6.i.d(parse3, "parse(...)");
                        String fragment = parse3.getFragment();
                        StringBuilder sb3 = new StringBuilder();
                        q6.i.b(fragment);
                        m.a(fragment, arrayList2, sb3);
                        return new c6.f(arrayList2, sb3.toString());
                    case a4.i.LONG_FIELD_NUMBER /* 4 */:
                        c6.f fVar = (c6.f) this.f5642e.f5660h.getValue();
                        return (fVar == null || (list = (List) fVar.f1747d) == null) ? new ArrayList() : list;
                    case 5:
                        c6.f fVar2 = (c6.f) this.f5642e.f5660h.getValue();
                        if (fVar2 != null) {
                            return (String) fVar2.f1748e;
                        }
                        return null;
                    case 6:
                        String str8 = (String) this.f5642e.f5661j.getValue();
                        if (str8 != null) {
                            return new y6.c(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i14 = 7;
        a.a.r(new p6.a(this) { // from class: o4.j

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ m f5642e;

            {
                this.f5642e = this;
            }

            /* JADX WARN: Type inference failed for: r1v20, types: [c6.d, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v27, types: [c6.d, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v34, types: [c6.d, java.lang.Object] */
            @Override // p6.a
            public final Object b() {
                List list;
                switch (i14) {
                    case 0:
                        String str2 = this.f5642e.f5655c;
                        if (str2 != null) {
                            return new y6.c(str2, 0);
                        }
                        return null;
                    case 1:
                        String str3 = this.f5642e.f5653a;
                        y6.c cVar = m.f5652r;
                        cVar.getClass();
                        return Boolean.valueOf(cVar.f8993d.matcher(str3).matches());
                    case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                        m mVar = this.f5642e;
                        String str4 = mVar.f5653a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) mVar.f5657e.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str4);
                            q6.i.d(parse, "parse(...)");
                            for (String str5 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str5);
                                int i82 = 1;
                                if (queryParameters.size() > 1) {
                                    throw new IllegalArgumentException(("Query parameter " + str5 + " must only be present once in " + str4 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str6 = (String) d6.m.S(queryParameters);
                                if (str6 == null) {
                                    mVar.f5659g = true;
                                    str6 = str5;
                                }
                                g1 a8 = y6.c.a(m.f5648n, str6);
                                l lVar = new l();
                                int i92 = 0;
                                while (a8 != null) {
                                    y6.b b8 = ((r0.i) a8.f86d).b(i82);
                                    q6.i.b(b8);
                                    int i102 = i82;
                                    lVar.f5646b.add(b8.f8991a);
                                    if (a8.t().f7492d > i92) {
                                        String substring = str6.substring(i92, a8.t().f7492d);
                                        q6.i.d(substring, "substring(...)");
                                        String quote = Pattern.quote(substring);
                                        q6.i.d(quote, "quote(...)");
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i92 = a8.t().f7493e + 1;
                                    a8 = a8.D();
                                    i82 = i102;
                                }
                                if (i92 < str6.length()) {
                                    String substring2 = str6.substring(i92);
                                    q6.i.d(substring2, "substring(...)");
                                    String quote2 = Pattern.quote(substring2);
                                    q6.i.d(quote2, "quote(...)");
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                String sb2 = sb.toString();
                                q6.i.d(sb2, "toString(...)");
                                lVar.f5645a = m.g(sb2);
                                linkedHashMap.put(str5, lVar);
                            }
                        }
                        return linkedHashMap;
                    case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                        String str7 = this.f5642e.f5653a;
                        Uri parse2 = Uri.parse(str7);
                        q6.i.d(parse2, "parse(...)");
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str7);
                        q6.i.d(parse3, "parse(...)");
                        String fragment = parse3.getFragment();
                        StringBuilder sb3 = new StringBuilder();
                        q6.i.b(fragment);
                        m.a(fragment, arrayList2, sb3);
                        return new c6.f(arrayList2, sb3.toString());
                    case a4.i.LONG_FIELD_NUMBER /* 4 */:
                        c6.f fVar = (c6.f) this.f5642e.f5660h.getValue();
                        return (fVar == null || (list = (List) fVar.f1747d) == null) ? new ArrayList() : list;
                    case 5:
                        c6.f fVar2 = (c6.f) this.f5642e.f5660h.getValue();
                        if (fVar2 != null) {
                            return (String) fVar2.f1748e;
                        }
                        return null;
                    case 6:
                        String str8 = (String) this.f5642e.f5661j.getValue();
                        if (str8 != null) {
                            return new y6.c(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        StringBuilder sb = new StringBuilder("^");
        if (!f5647m.f8993d.matcher(str).find()) {
            String pattern = f5649o.f8993d.pattern();
            q6.i.d(pattern, "pattern(...)");
            sb.append(pattern);
        }
        g1 a8 = y6.c.a(new y6.c("(\\?|#|$)"), str);
        if (a8 != null) {
            boolean z3 = false;
            String substring = str.substring(0, a8.t().f7492d);
            q6.i.d(substring, "substring(...)");
            a(substring, arrayList, sb);
            if (!f5650p.f8993d.matcher(sb).find() && !f5651q.f8993d.matcher(sb).find()) {
                z3 = true;
            }
            this.f5663l = z3;
            sb.append("($|(\\?(.)*)|(#(.)*))");
        }
        String sb2 = sb.toString();
        q6.i.d(sb2, "toString(...)");
        this.f5655c = g(sb2);
    }

    public static void a(String str, ArrayList arrayList, StringBuilder sb) {
        int i = 0;
        for (g1 a8 = y6.c.a(f5648n, str); a8 != null; a8 = a8.D()) {
            y6.b b8 = ((r0.i) a8.f86d).b(1);
            q6.i.b(b8);
            arrayList.add(b8.f8991a);
            if (a8.t().f7492d > i) {
                String substring = str.substring(i, a8.t().f7492d);
                q6.i.d(substring, "substring(...)");
                String quote = Pattern.quote(substring);
                q6.i.d(quote, "quote(...)");
                sb.append(quote);
            }
            String pattern = f5651q.f8993d.pattern();
            q6.i.d(pattern, "pattern(...)");
            sb.append(pattern);
            i = a8.t().f7493e + 1;
        }
        if (i < str.length()) {
            String substring2 = str.substring(i);
            q6.i.d(substring2, "substring(...)");
            String quote2 = Pattern.quote(substring2);
            q6.i.d(quote2, "quote(...)");
            sb.append(quote2);
        }
    }

    public static String g(String str) {
        return (y6.j.a0(str, "\\Q") && y6.j.a0(str, "\\E")) ? y6.j.f0(str, ".*", "\\E.*\\Q") : y6.j.a0(str, "\\.\\*") ? y6.j.f0(str, "\\.\\*", ".*") : str;
    }

    public final int b(Uri uri) {
        String str;
        if (uri == null || (str = this.f5653a) == null) {
            return 0;
        }
        List<String> pathSegments = uri.getPathSegments();
        q6.i.e(str, "uriString");
        Uri parse = Uri.parse(str);
        q6.i.d(parse, "parse(...)");
        List<String> pathSegments2 = parse.getPathSegments();
        q6.i.e(pathSegments, "<this>");
        q6.i.e(pathSegments2, "other");
        LinkedHashSet linkedHashSet = new LinkedHashSet(pathSegments);
        linkedHashSet.retainAll(pathSegments2);
        return linkedHashSet.size();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [c6.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [c6.d, java.lang.Object] */
    public final ArrayList c() {
        Collection values = ((Map) this.f5658f.getValue()).values();
        ArrayList arrayList = new ArrayList();
        Iterator it = values.iterator();
        while (it.hasNext()) {
            d6.r.O(arrayList, ((l) it.next()).f5646b);
        }
        return d6.m.b0(d6.m.b0(this.f5654b, arrayList), (List) this.i.getValue());
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [c6.d, java.lang.Object] */
    public final Bundle d(Uri uri, LinkedHashMap linkedHashMap) {
        g1 b8;
        g1 b9;
        String str;
        q6.i.e(uri, "deepLink");
        q6.i.e(linkedHashMap, "arguments");
        y6.c cVar = (y6.c) this.f5656d.getValue();
        if (cVar != null && (b8 = cVar.b(uri.toString())) != null) {
            int i = 0;
            Bundle j7 = h0.a.j((c6.f[]) Arrays.copyOf(new c6.f[0], 0));
            if (e(b8, j7, linkedHashMap) && (!((Boolean) this.f5657e.getValue()).booleanValue() || f(uri, j7, linkedHashMap))) {
                String fragment = uri.getFragment();
                y6.c cVar2 = (y6.c) this.f5662k.getValue();
                if (cVar2 != null && (b9 = cVar2.b(String.valueOf(fragment))) != null) {
                    List list = (List) this.i.getValue();
                    ArrayList arrayList = new ArrayList(d6.n.M(list, 10));
                    for (Object obj : list) {
                        int i8 = i + 1;
                        if (i < 0) {
                            s6.a.J();
                            throw null;
                        }
                        String str2 = (String) obj;
                        y6.b b10 = ((r0.i) b9.f86d).b(i8);
                        if (b10 != null) {
                            str = Uri.decode(b10.f8991a);
                            q6.i.d(str, "decode(...)");
                        } else {
                            str = null;
                        }
                        if (str == null) {
                            str = "";
                        }
                        if (linkedHashMap.get(str2) != null) {
                            throw new ClassCastException();
                        }
                        try {
                            r2.o.g0(j7, str2, str);
                            arrayList.add(c6.m.f1757a);
                            i = i8;
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                }
                if (h0.a.N(linkedHashMap, new k(j7, 0)).isEmpty()) {
                    return j7;
                }
            }
        }
        return null;
    }

    public final boolean e(g1 g1Var, Bundle bundle, Map map) {
        ArrayList arrayList = this.f5654b;
        ArrayList arrayList2 = new ArrayList(d6.n.M(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        int i8 = 0;
        while (i8 < size) {
            Object obj = arrayList.get(i8);
            i8++;
            int i9 = i + 1;
            String str = null;
            if (i < 0) {
                s6.a.J();
                throw null;
            }
            String str2 = (String) obj;
            y6.b b8 = ((r0.i) g1Var.f86d).b(i9);
            if (b8 != null) {
                str = Uri.decode(b8.f8991a);
                q6.i.d(str, "decode(...)");
            }
            if (str == null) {
                str = "";
            }
            if (map.get(str2) != null) {
                throw new ClassCastException();
            }
            try {
                r2.o.g0(bundle, str2, str);
                arrayList2.add(c6.m.f1757a);
                i = i9;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof m)) {
            return false;
        }
        return this.f5653a.equals(((m) obj).f5653a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Iterable, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r2v0, types: [c6.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(Uri uri, Bundle bundle, Map map) {
        g1 g1Var;
        Object obj;
        String query;
        m mVar = this;
        for (Map.Entry entry : ((Map) mVar.f5658f.getValue()).entrySet()) {
            String str = (String) entry.getKey();
            l lVar = (l) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(str);
            if (mVar.f5659g && (query = uri.getQuery()) != null && !query.equals(uri.toString())) {
                queryParameters = s6.a.x(query);
            }
            c6.m mVar2 = c6.m.f1757a;
            boolean z3 = false;
            Bundle j7 = h0.a.j((c6.f[]) Arrays.copyOf(new c6.f[0], 0));
            ArrayList arrayList = lVar.f5646b;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                if (map.get((String) obj2) != null) {
                    throw new ClassCastException();
                }
            }
            for (String str2 : queryParameters) {
                String str3 = lVar.f5645a;
                if (str3 != null) {
                    Pattern compile = Pattern.compile(str3);
                    q6.i.d(compile, "compile(...)");
                    q6.i.e(str2, "input");
                    Matcher matcher = compile.matcher(str2);
                    q6.i.d(matcher, "matcher(...)");
                    if (matcher.matches()) {
                        g1Var = new g1(matcher, str2);
                        if (g1Var != null) {
                            return z3;
                        }
                        ?? r10 = lVar.f5646b;
                        ArrayList arrayList2 = new ArrayList(d6.n.M(r10, 10));
                        int size2 = r10.size();
                        boolean z7 = z3;
                        ?? r15 = z7;
                        ?? r42 = z7;
                        while (r42 < size2) {
                            Object obj3 = r10.get(r42);
                            int i8 = r42 + 1;
                            int i9 = r15 + 1;
                            if (r15 < 0) {
                                s6.a.J();
                                throw null;
                            }
                            String str4 = (String) obj3;
                            y6.b b8 = ((r0.i) g1Var.f86d).b(i9);
                            String str5 = b8 != null ? b8.f8991a : null;
                            if (str5 == null) {
                                str5 = "";
                            }
                            if (map.get(str4) != null) {
                                throw new ClassCastException();
                            }
                            try {
                                q6.i.e(str4, "key");
                            } catch (IllegalArgumentException unused) {
                            }
                            if (j7.containsKey(str4)) {
                                obj = Boolean.valueOf(!j7.containsKey(str4));
                                arrayList2.add(obj);
                                r15 = i9;
                                z3 = false;
                                r42 = i8;
                            } else {
                                r2.o.g0(j7, str4, str5);
                                obj = mVar2;
                                arrayList2.add(obj);
                                r15 = i9;
                                z3 = false;
                                r42 = i8;
                            }
                        }
                    }
                }
                g1Var = null;
                if (g1Var != null) {
                }
            }
            bundle.putAll(j7);
            mVar = this;
        }
        return true;
    }

    public final int hashCode() {
        return this.f5653a.hashCode() * 961;
    }
}
