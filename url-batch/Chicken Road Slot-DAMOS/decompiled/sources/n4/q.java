package n4;

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
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.k0;
import kotlin.jvm.functions.Function0;
import kotlin.text.MatchGroup;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: m, reason: collision with root package name */
    public static final Regex f7092m = new Regex("^[a-zA-Z]+[+\\w\\-.]*:");

    /* renamed from: n, reason: collision with root package name */
    public static final Regex f7093n = new Regex("\\{(.+?)\\}");

    /* renamed from: o, reason: collision with root package name */
    public static final Regex f7094o = new Regex("http[s]?://");

    /* renamed from: p, reason: collision with root package name */
    public static final Regex f7095p = new Regex(".*");

    /* renamed from: q, reason: collision with root package name */
    public static final Regex f7096q = new Regex("([^/]*?|)");

    /* renamed from: r, reason: collision with root package name */
    public static final Regex f7097r = new Regex("^[^?#]+\\?([^#]*).*");

    /* renamed from: a, reason: collision with root package name */
    public final String f7098a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f7099b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7100c;

    /* renamed from: d, reason: collision with root package name */
    public final hd.q f7101d;

    /* renamed from: e, reason: collision with root package name */
    public final hd.q f7102e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f7103f;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f7104h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f7105i;
    public final Object j;

    /* renamed from: k, reason: collision with root package name */
    public final hd.q f7106k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f7107l;

    public q(String str) {
        this.f7098a = str;
        ArrayList arrayList = new ArrayList();
        this.f7099b = arrayList;
        final int i3 = 0;
        this.f7101d = hd.h.b(new Function0(this) { // from class: n4.n

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ q f7087e;

            {
                this.f7087e = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [hd.g, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v24, types: [hd.g, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v31, types: [hd.g, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list;
                switch (i3) {
                    case 0:
                        String str2 = this.f7087e.f7100c;
                        if (str2 != null) {
                            return new Regex(str2, kotlin.text.g.IGNORE_CASE);
                        }
                        return null;
                    case 1:
                        return Boolean.valueOf(q.f7097r.c(this.f7087e.f7098a));
                    case 2:
                        q qVar = this.f7087e;
                        String str3 = qVar.f7098a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (!((Boolean) qVar.f7102e.getValue()).booleanValue()) {
                            return linkedHashMap;
                        }
                        Uri parse = Uri.parse(str3);
                        parse.getClass();
                        for (String str4 : parse.getQueryParameterNames()) {
                            StringBuilder sb2 = new StringBuilder();
                            List<String> queryParameters = parse.getQueryParameters(str4);
                            if (queryParameters.size() > 1) {
                                a1.f("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                return null;
                            }
                            String str5 = (String) CollectionsKt.firstOrNull(queryParameters);
                            if (str5 == null) {
                                qVar.g = true;
                                str5 = str4;
                            }
                            p pVar = new p();
                            int i10 = 0;
                            for (a1.n a9 = Regex.a(q.f7093n, str5); a9 != null; a9 = a9.y()) {
                                MatchGroup c10 = ((kotlin.collections.i) a9.f42r).c(1);
                                c10.getClass();
                                String str6 = c10.f5604a;
                                str6.getClass();
                                pVar.f7091b.add(str6);
                                if (a9.t().f5599d > i10) {
                                    String substring = str5.substring(i10, a9.t().f5599d);
                                    Regex.f5606e.getClass();
                                    String quote = Pattern.quote(substring);
                                    quote.getClass();
                                    sb2.append(quote);
                                }
                                sb2.append("([\\s\\S]+?)?");
                                i10 = a9.t().f5600e + 1;
                            }
                            if (i10 < str5.length()) {
                                kotlin.text.f fVar = Regex.f5606e;
                                String substring2 = str5.substring(i10);
                                fVar.getClass();
                                String quote2 = Pattern.quote(substring2);
                                quote2.getClass();
                                sb2.append(quote2);
                            }
                            sb2.append("$");
                            pVar.f7090a = q.h(sb2.toString());
                            linkedHashMap.put(str4, pVar);
                        }
                        return linkedHashMap;
                    case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                        String str7 = this.f7087e.f7098a;
                        Uri parse2 = Uri.parse(str7);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str7);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb3 = new StringBuilder();
                        fragment.getClass();
                        q.a(fragment, arrayList2, sb3);
                        return new Pair(arrayList2, sb3.toString());
                    case a4.j.LONG_FIELD_NUMBER /* 4 */:
                        Pair pair = (Pair) this.f7087e.f7104h.getValue();
                        return (pair == null || (list = (List) pair.f5552d) == null) ? new ArrayList() : list;
                    case a4.j.STRING_FIELD_NUMBER /* 5 */:
                        Pair pair2 = (Pair) this.f7087e.f7104h.getValue();
                        if (pair2 != null) {
                            return (String) pair2.f5553e;
                        }
                        return null;
                    case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                        String str8 = (String) this.f7087e.j.getValue();
                        if (str8 != null) {
                            return new Regex(str8, kotlin.text.g.IGNORE_CASE);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i10 = 1;
        this.f7102e = hd.h.b(new Function0(this) { // from class: n4.n

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ q f7087e;

            {
                this.f7087e = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [hd.g, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v24, types: [hd.g, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v31, types: [hd.g, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list;
                switch (i10) {
                    case 0:
                        String str2 = this.f7087e.f7100c;
                        if (str2 != null) {
                            return new Regex(str2, kotlin.text.g.IGNORE_CASE);
                        }
                        return null;
                    case 1:
                        return Boolean.valueOf(q.f7097r.c(this.f7087e.f7098a));
                    case 2:
                        q qVar = this.f7087e;
                        String str3 = qVar.f7098a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (!((Boolean) qVar.f7102e.getValue()).booleanValue()) {
                            return linkedHashMap;
                        }
                        Uri parse = Uri.parse(str3);
                        parse.getClass();
                        for (String str4 : parse.getQueryParameterNames()) {
                            StringBuilder sb2 = new StringBuilder();
                            List<String> queryParameters = parse.getQueryParameters(str4);
                            if (queryParameters.size() > 1) {
                                a1.f("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                return null;
                            }
                            String str5 = (String) CollectionsKt.firstOrNull(queryParameters);
                            if (str5 == null) {
                                qVar.g = true;
                                str5 = str4;
                            }
                            p pVar = new p();
                            int i102 = 0;
                            for (a1.n a9 = Regex.a(q.f7093n, str5); a9 != null; a9 = a9.y()) {
                                MatchGroup c10 = ((kotlin.collections.i) a9.f42r).c(1);
                                c10.getClass();
                                String str6 = c10.f5604a;
                                str6.getClass();
                                pVar.f7091b.add(str6);
                                if (a9.t().f5599d > i102) {
                                    String substring = str5.substring(i102, a9.t().f5599d);
                                    Regex.f5606e.getClass();
                                    String quote = Pattern.quote(substring);
                                    quote.getClass();
                                    sb2.append(quote);
                                }
                                sb2.append("([\\s\\S]+?)?");
                                i102 = a9.t().f5600e + 1;
                            }
                            if (i102 < str5.length()) {
                                kotlin.text.f fVar = Regex.f5606e;
                                String substring2 = str5.substring(i102);
                                fVar.getClass();
                                String quote2 = Pattern.quote(substring2);
                                quote2.getClass();
                                sb2.append(quote2);
                            }
                            sb2.append("$");
                            pVar.f7090a = q.h(sb2.toString());
                            linkedHashMap.put(str4, pVar);
                        }
                        return linkedHashMap;
                    case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                        String str7 = this.f7087e.f7098a;
                        Uri parse2 = Uri.parse(str7);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str7);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb3 = new StringBuilder();
                        fragment.getClass();
                        q.a(fragment, arrayList2, sb3);
                        return new Pair(arrayList2, sb3.toString());
                    case a4.j.LONG_FIELD_NUMBER /* 4 */:
                        Pair pair = (Pair) this.f7087e.f7104h.getValue();
                        return (pair == null || (list = (List) pair.f5552d) == null) ? new ArrayList() : list;
                    case a4.j.STRING_FIELD_NUMBER /* 5 */:
                        Pair pair2 = (Pair) this.f7087e.f7104h.getValue();
                        if (pair2 != null) {
                            return (String) pair2.f5553e;
                        }
                        return null;
                    case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                        String str8 = (String) this.f7087e.j.getValue();
                        if (str8 != null) {
                            return new Regex(str8, kotlin.text.g.IGNORE_CASE);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        hd.i iVar = hd.i.f4508e;
        final int i11 = 2;
        this.f7103f = hd.h.a(iVar, new Function0(this) { // from class: n4.n

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ q f7087e;

            {
                this.f7087e = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [hd.g, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v24, types: [hd.g, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v31, types: [hd.g, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list;
                switch (i11) {
                    case 0:
                        String str2 = this.f7087e.f7100c;
                        if (str2 != null) {
                            return new Regex(str2, kotlin.text.g.IGNORE_CASE);
                        }
                        return null;
                    case 1:
                        return Boolean.valueOf(q.f7097r.c(this.f7087e.f7098a));
                    case 2:
                        q qVar = this.f7087e;
                        String str3 = qVar.f7098a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (!((Boolean) qVar.f7102e.getValue()).booleanValue()) {
                            return linkedHashMap;
                        }
                        Uri parse = Uri.parse(str3);
                        parse.getClass();
                        for (String str4 : parse.getQueryParameterNames()) {
                            StringBuilder sb2 = new StringBuilder();
                            List<String> queryParameters = parse.getQueryParameters(str4);
                            if (queryParameters.size() > 1) {
                                a1.f("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                return null;
                            }
                            String str5 = (String) CollectionsKt.firstOrNull(queryParameters);
                            if (str5 == null) {
                                qVar.g = true;
                                str5 = str4;
                            }
                            p pVar = new p();
                            int i102 = 0;
                            for (a1.n a9 = Regex.a(q.f7093n, str5); a9 != null; a9 = a9.y()) {
                                MatchGroup c10 = ((kotlin.collections.i) a9.f42r).c(1);
                                c10.getClass();
                                String str6 = c10.f5604a;
                                str6.getClass();
                                pVar.f7091b.add(str6);
                                if (a9.t().f5599d > i102) {
                                    String substring = str5.substring(i102, a9.t().f5599d);
                                    Regex.f5606e.getClass();
                                    String quote = Pattern.quote(substring);
                                    quote.getClass();
                                    sb2.append(quote);
                                }
                                sb2.append("([\\s\\S]+?)?");
                                i102 = a9.t().f5600e + 1;
                            }
                            if (i102 < str5.length()) {
                                kotlin.text.f fVar = Regex.f5606e;
                                String substring2 = str5.substring(i102);
                                fVar.getClass();
                                String quote2 = Pattern.quote(substring2);
                                quote2.getClass();
                                sb2.append(quote2);
                            }
                            sb2.append("$");
                            pVar.f7090a = q.h(sb2.toString());
                            linkedHashMap.put(str4, pVar);
                        }
                        return linkedHashMap;
                    case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                        String str7 = this.f7087e.f7098a;
                        Uri parse2 = Uri.parse(str7);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str7);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb3 = new StringBuilder();
                        fragment.getClass();
                        q.a(fragment, arrayList2, sb3);
                        return new Pair(arrayList2, sb3.toString());
                    case a4.j.LONG_FIELD_NUMBER /* 4 */:
                        Pair pair = (Pair) this.f7087e.f7104h.getValue();
                        return (pair == null || (list = (List) pair.f5552d) == null) ? new ArrayList() : list;
                    case a4.j.STRING_FIELD_NUMBER /* 5 */:
                        Pair pair2 = (Pair) this.f7087e.f7104h.getValue();
                        if (pair2 != null) {
                            return (String) pair2.f5553e;
                        }
                        return null;
                    case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                        String str8 = (String) this.f7087e.j.getValue();
                        if (str8 != null) {
                            return new Regex(str8, kotlin.text.g.IGNORE_CASE);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i12 = 3;
        this.f7104h = hd.h.a(iVar, new Function0(this) { // from class: n4.n

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ q f7087e;

            {
                this.f7087e = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [hd.g, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v24, types: [hd.g, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v31, types: [hd.g, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list;
                switch (i12) {
                    case 0:
                        String str2 = this.f7087e.f7100c;
                        if (str2 != null) {
                            return new Regex(str2, kotlin.text.g.IGNORE_CASE);
                        }
                        return null;
                    case 1:
                        return Boolean.valueOf(q.f7097r.c(this.f7087e.f7098a));
                    case 2:
                        q qVar = this.f7087e;
                        String str3 = qVar.f7098a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (!((Boolean) qVar.f7102e.getValue()).booleanValue()) {
                            return linkedHashMap;
                        }
                        Uri parse = Uri.parse(str3);
                        parse.getClass();
                        for (String str4 : parse.getQueryParameterNames()) {
                            StringBuilder sb2 = new StringBuilder();
                            List<String> queryParameters = parse.getQueryParameters(str4);
                            if (queryParameters.size() > 1) {
                                a1.f("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                return null;
                            }
                            String str5 = (String) CollectionsKt.firstOrNull(queryParameters);
                            if (str5 == null) {
                                qVar.g = true;
                                str5 = str4;
                            }
                            p pVar = new p();
                            int i102 = 0;
                            for (a1.n a9 = Regex.a(q.f7093n, str5); a9 != null; a9 = a9.y()) {
                                MatchGroup c10 = ((kotlin.collections.i) a9.f42r).c(1);
                                c10.getClass();
                                String str6 = c10.f5604a;
                                str6.getClass();
                                pVar.f7091b.add(str6);
                                if (a9.t().f5599d > i102) {
                                    String substring = str5.substring(i102, a9.t().f5599d);
                                    Regex.f5606e.getClass();
                                    String quote = Pattern.quote(substring);
                                    quote.getClass();
                                    sb2.append(quote);
                                }
                                sb2.append("([\\s\\S]+?)?");
                                i102 = a9.t().f5600e + 1;
                            }
                            if (i102 < str5.length()) {
                                kotlin.text.f fVar = Regex.f5606e;
                                String substring2 = str5.substring(i102);
                                fVar.getClass();
                                String quote2 = Pattern.quote(substring2);
                                quote2.getClass();
                                sb2.append(quote2);
                            }
                            sb2.append("$");
                            pVar.f7090a = q.h(sb2.toString());
                            linkedHashMap.put(str4, pVar);
                        }
                        return linkedHashMap;
                    case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                        String str7 = this.f7087e.f7098a;
                        Uri parse2 = Uri.parse(str7);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str7);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb3 = new StringBuilder();
                        fragment.getClass();
                        q.a(fragment, arrayList2, sb3);
                        return new Pair(arrayList2, sb3.toString());
                    case a4.j.LONG_FIELD_NUMBER /* 4 */:
                        Pair pair = (Pair) this.f7087e.f7104h.getValue();
                        return (pair == null || (list = (List) pair.f5552d) == null) ? new ArrayList() : list;
                    case a4.j.STRING_FIELD_NUMBER /* 5 */:
                        Pair pair2 = (Pair) this.f7087e.f7104h.getValue();
                        if (pair2 != null) {
                            return (String) pair2.f5553e;
                        }
                        return null;
                    case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                        String str8 = (String) this.f7087e.j.getValue();
                        if (str8 != null) {
                            return new Regex(str8, kotlin.text.g.IGNORE_CASE);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i13 = 4;
        this.f7105i = hd.h.a(iVar, new Function0(this) { // from class: n4.n

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ q f7087e;

            {
                this.f7087e = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [hd.g, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v24, types: [hd.g, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v31, types: [hd.g, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list;
                switch (i13) {
                    case 0:
                        String str2 = this.f7087e.f7100c;
                        if (str2 != null) {
                            return new Regex(str2, kotlin.text.g.IGNORE_CASE);
                        }
                        return null;
                    case 1:
                        return Boolean.valueOf(q.f7097r.c(this.f7087e.f7098a));
                    case 2:
                        q qVar = this.f7087e;
                        String str3 = qVar.f7098a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (!((Boolean) qVar.f7102e.getValue()).booleanValue()) {
                            return linkedHashMap;
                        }
                        Uri parse = Uri.parse(str3);
                        parse.getClass();
                        for (String str4 : parse.getQueryParameterNames()) {
                            StringBuilder sb2 = new StringBuilder();
                            List<String> queryParameters = parse.getQueryParameters(str4);
                            if (queryParameters.size() > 1) {
                                a1.f("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                return null;
                            }
                            String str5 = (String) CollectionsKt.firstOrNull(queryParameters);
                            if (str5 == null) {
                                qVar.g = true;
                                str5 = str4;
                            }
                            p pVar = new p();
                            int i102 = 0;
                            for (a1.n a9 = Regex.a(q.f7093n, str5); a9 != null; a9 = a9.y()) {
                                MatchGroup c10 = ((kotlin.collections.i) a9.f42r).c(1);
                                c10.getClass();
                                String str6 = c10.f5604a;
                                str6.getClass();
                                pVar.f7091b.add(str6);
                                if (a9.t().f5599d > i102) {
                                    String substring = str5.substring(i102, a9.t().f5599d);
                                    Regex.f5606e.getClass();
                                    String quote = Pattern.quote(substring);
                                    quote.getClass();
                                    sb2.append(quote);
                                }
                                sb2.append("([\\s\\S]+?)?");
                                i102 = a9.t().f5600e + 1;
                            }
                            if (i102 < str5.length()) {
                                kotlin.text.f fVar = Regex.f5606e;
                                String substring2 = str5.substring(i102);
                                fVar.getClass();
                                String quote2 = Pattern.quote(substring2);
                                quote2.getClass();
                                sb2.append(quote2);
                            }
                            sb2.append("$");
                            pVar.f7090a = q.h(sb2.toString());
                            linkedHashMap.put(str4, pVar);
                        }
                        return linkedHashMap;
                    case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                        String str7 = this.f7087e.f7098a;
                        Uri parse2 = Uri.parse(str7);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str7);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb3 = new StringBuilder();
                        fragment.getClass();
                        q.a(fragment, arrayList2, sb3);
                        return new Pair(arrayList2, sb3.toString());
                    case a4.j.LONG_FIELD_NUMBER /* 4 */:
                        Pair pair = (Pair) this.f7087e.f7104h.getValue();
                        return (pair == null || (list = (List) pair.f5552d) == null) ? new ArrayList() : list;
                    case a4.j.STRING_FIELD_NUMBER /* 5 */:
                        Pair pair2 = (Pair) this.f7087e.f7104h.getValue();
                        if (pair2 != null) {
                            return (String) pair2.f5553e;
                        }
                        return null;
                    case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                        String str8 = (String) this.f7087e.j.getValue();
                        if (str8 != null) {
                            return new Regex(str8, kotlin.text.g.IGNORE_CASE);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i14 = 5;
        this.j = hd.h.a(iVar, new Function0(this) { // from class: n4.n

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ q f7087e;

            {
                this.f7087e = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [hd.g, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v24, types: [hd.g, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v31, types: [hd.g, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list;
                switch (i14) {
                    case 0:
                        String str2 = this.f7087e.f7100c;
                        if (str2 != null) {
                            return new Regex(str2, kotlin.text.g.IGNORE_CASE);
                        }
                        return null;
                    case 1:
                        return Boolean.valueOf(q.f7097r.c(this.f7087e.f7098a));
                    case 2:
                        q qVar = this.f7087e;
                        String str3 = qVar.f7098a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (!((Boolean) qVar.f7102e.getValue()).booleanValue()) {
                            return linkedHashMap;
                        }
                        Uri parse = Uri.parse(str3);
                        parse.getClass();
                        for (String str4 : parse.getQueryParameterNames()) {
                            StringBuilder sb2 = new StringBuilder();
                            List<String> queryParameters = parse.getQueryParameters(str4);
                            if (queryParameters.size() > 1) {
                                a1.f("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                return null;
                            }
                            String str5 = (String) CollectionsKt.firstOrNull(queryParameters);
                            if (str5 == null) {
                                qVar.g = true;
                                str5 = str4;
                            }
                            p pVar = new p();
                            int i102 = 0;
                            for (a1.n a9 = Regex.a(q.f7093n, str5); a9 != null; a9 = a9.y()) {
                                MatchGroup c10 = ((kotlin.collections.i) a9.f42r).c(1);
                                c10.getClass();
                                String str6 = c10.f5604a;
                                str6.getClass();
                                pVar.f7091b.add(str6);
                                if (a9.t().f5599d > i102) {
                                    String substring = str5.substring(i102, a9.t().f5599d);
                                    Regex.f5606e.getClass();
                                    String quote = Pattern.quote(substring);
                                    quote.getClass();
                                    sb2.append(quote);
                                }
                                sb2.append("([\\s\\S]+?)?");
                                i102 = a9.t().f5600e + 1;
                            }
                            if (i102 < str5.length()) {
                                kotlin.text.f fVar = Regex.f5606e;
                                String substring2 = str5.substring(i102);
                                fVar.getClass();
                                String quote2 = Pattern.quote(substring2);
                                quote2.getClass();
                                sb2.append(quote2);
                            }
                            sb2.append("$");
                            pVar.f7090a = q.h(sb2.toString());
                            linkedHashMap.put(str4, pVar);
                        }
                        return linkedHashMap;
                    case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                        String str7 = this.f7087e.f7098a;
                        Uri parse2 = Uri.parse(str7);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str7);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb3 = new StringBuilder();
                        fragment.getClass();
                        q.a(fragment, arrayList2, sb3);
                        return new Pair(arrayList2, sb3.toString());
                    case a4.j.LONG_FIELD_NUMBER /* 4 */:
                        Pair pair = (Pair) this.f7087e.f7104h.getValue();
                        return (pair == null || (list = (List) pair.f5552d) == null) ? new ArrayList() : list;
                    case a4.j.STRING_FIELD_NUMBER /* 5 */:
                        Pair pair2 = (Pair) this.f7087e.f7104h.getValue();
                        if (pair2 != null) {
                            return (String) pair2.f5553e;
                        }
                        return null;
                    case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                        String str8 = (String) this.f7087e.j.getValue();
                        if (str8 != null) {
                            return new Regex(str8, kotlin.text.g.IGNORE_CASE);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i15 = 6;
        this.f7106k = hd.h.b(new Function0(this) { // from class: n4.n

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ q f7087e;

            {
                this.f7087e = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [hd.g, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v24, types: [hd.g, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v31, types: [hd.g, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list;
                switch (i15) {
                    case 0:
                        String str2 = this.f7087e.f7100c;
                        if (str2 != null) {
                            return new Regex(str2, kotlin.text.g.IGNORE_CASE);
                        }
                        return null;
                    case 1:
                        return Boolean.valueOf(q.f7097r.c(this.f7087e.f7098a));
                    case 2:
                        q qVar = this.f7087e;
                        String str3 = qVar.f7098a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (!((Boolean) qVar.f7102e.getValue()).booleanValue()) {
                            return linkedHashMap;
                        }
                        Uri parse = Uri.parse(str3);
                        parse.getClass();
                        for (String str4 : parse.getQueryParameterNames()) {
                            StringBuilder sb2 = new StringBuilder();
                            List<String> queryParameters = parse.getQueryParameters(str4);
                            if (queryParameters.size() > 1) {
                                a1.f("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                return null;
                            }
                            String str5 = (String) CollectionsKt.firstOrNull(queryParameters);
                            if (str5 == null) {
                                qVar.g = true;
                                str5 = str4;
                            }
                            p pVar = new p();
                            int i102 = 0;
                            for (a1.n a9 = Regex.a(q.f7093n, str5); a9 != null; a9 = a9.y()) {
                                MatchGroup c10 = ((kotlin.collections.i) a9.f42r).c(1);
                                c10.getClass();
                                String str6 = c10.f5604a;
                                str6.getClass();
                                pVar.f7091b.add(str6);
                                if (a9.t().f5599d > i102) {
                                    String substring = str5.substring(i102, a9.t().f5599d);
                                    Regex.f5606e.getClass();
                                    String quote = Pattern.quote(substring);
                                    quote.getClass();
                                    sb2.append(quote);
                                }
                                sb2.append("([\\s\\S]+?)?");
                                i102 = a9.t().f5600e + 1;
                            }
                            if (i102 < str5.length()) {
                                kotlin.text.f fVar = Regex.f5606e;
                                String substring2 = str5.substring(i102);
                                fVar.getClass();
                                String quote2 = Pattern.quote(substring2);
                                quote2.getClass();
                                sb2.append(quote2);
                            }
                            sb2.append("$");
                            pVar.f7090a = q.h(sb2.toString());
                            linkedHashMap.put(str4, pVar);
                        }
                        return linkedHashMap;
                    case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                        String str7 = this.f7087e.f7098a;
                        Uri parse2 = Uri.parse(str7);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str7);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb3 = new StringBuilder();
                        fragment.getClass();
                        q.a(fragment, arrayList2, sb3);
                        return new Pair(arrayList2, sb3.toString());
                    case a4.j.LONG_FIELD_NUMBER /* 4 */:
                        Pair pair = (Pair) this.f7087e.f7104h.getValue();
                        return (pair == null || (list = (List) pair.f5552d) == null) ? new ArrayList() : list;
                    case a4.j.STRING_FIELD_NUMBER /* 5 */:
                        Pair pair2 = (Pair) this.f7087e.f7104h.getValue();
                        if (pair2 != null) {
                            return (String) pair2.f5553e;
                        }
                        return null;
                    case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                        String str8 = (String) this.f7087e.j.getValue();
                        if (str8 != null) {
                            return new Regex(str8, kotlin.text.g.IGNORE_CASE);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i16 = 7;
        hd.h.b(new Function0(this) { // from class: n4.n

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ q f7087e;

            {
                this.f7087e = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [hd.g, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v24, types: [hd.g, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v31, types: [hd.g, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list;
                switch (i16) {
                    case 0:
                        String str2 = this.f7087e.f7100c;
                        if (str2 != null) {
                            return new Regex(str2, kotlin.text.g.IGNORE_CASE);
                        }
                        return null;
                    case 1:
                        return Boolean.valueOf(q.f7097r.c(this.f7087e.f7098a));
                    case 2:
                        q qVar = this.f7087e;
                        String str3 = qVar.f7098a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (!((Boolean) qVar.f7102e.getValue()).booleanValue()) {
                            return linkedHashMap;
                        }
                        Uri parse = Uri.parse(str3);
                        parse.getClass();
                        for (String str4 : parse.getQueryParameterNames()) {
                            StringBuilder sb2 = new StringBuilder();
                            List<String> queryParameters = parse.getQueryParameters(str4);
                            if (queryParameters.size() > 1) {
                                a1.f("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                return null;
                            }
                            String str5 = (String) CollectionsKt.firstOrNull(queryParameters);
                            if (str5 == null) {
                                qVar.g = true;
                                str5 = str4;
                            }
                            p pVar = new p();
                            int i102 = 0;
                            for (a1.n a9 = Regex.a(q.f7093n, str5); a9 != null; a9 = a9.y()) {
                                MatchGroup c10 = ((kotlin.collections.i) a9.f42r).c(1);
                                c10.getClass();
                                String str6 = c10.f5604a;
                                str6.getClass();
                                pVar.f7091b.add(str6);
                                if (a9.t().f5599d > i102) {
                                    String substring = str5.substring(i102, a9.t().f5599d);
                                    Regex.f5606e.getClass();
                                    String quote = Pattern.quote(substring);
                                    quote.getClass();
                                    sb2.append(quote);
                                }
                                sb2.append("([\\s\\S]+?)?");
                                i102 = a9.t().f5600e + 1;
                            }
                            if (i102 < str5.length()) {
                                kotlin.text.f fVar = Regex.f5606e;
                                String substring2 = str5.substring(i102);
                                fVar.getClass();
                                String quote2 = Pattern.quote(substring2);
                                quote2.getClass();
                                sb2.append(quote2);
                            }
                            sb2.append("$");
                            pVar.f7090a = q.h(sb2.toString());
                            linkedHashMap.put(str4, pVar);
                        }
                        return linkedHashMap;
                    case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                        String str7 = this.f7087e.f7098a;
                        Uri parse2 = Uri.parse(str7);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str7);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb3 = new StringBuilder();
                        fragment.getClass();
                        q.a(fragment, arrayList2, sb3);
                        return new Pair(arrayList2, sb3.toString());
                    case a4.j.LONG_FIELD_NUMBER /* 4 */:
                        Pair pair = (Pair) this.f7087e.f7104h.getValue();
                        return (pair == null || (list = (List) pair.f5552d) == null) ? new ArrayList() : list;
                    case a4.j.STRING_FIELD_NUMBER /* 5 */:
                        Pair pair2 = (Pair) this.f7087e.f7104h.getValue();
                        if (pair2 != null) {
                            return (String) pair2.f5553e;
                        }
                        return null;
                    case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                        String str8 = (String) this.f7087e.j.getValue();
                        if (str8 != null) {
                            return new Regex(str8, kotlin.text.g.IGNORE_CASE);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        StringBuilder sb2 = new StringBuilder("^");
        if (!f7092m.f5607d.matcher(str).find()) {
            String pattern = f7094o.f5607d.pattern();
            pattern.getClass();
            sb2.append(pattern);
        }
        a1.n a9 = Regex.a(new Regex("(\\?|#|$)"), str);
        if (a9 != null) {
            boolean z10 = false;
            a(str.substring(0, a9.t().f5599d), arrayList, sb2);
            if (!f7095p.f5607d.matcher(sb2).find() && !f7096q.f5607d.matcher(sb2).find()) {
                z10 = true;
            }
            this.f7107l = z10;
            sb2.append("($|(\\?(.)*)|(#(.)*))");
        }
        this.f7100c = h(sb2.toString());
    }

    public static void a(String str, ArrayList arrayList, StringBuilder sb2) {
        int i3 = 0;
        for (a1.n a9 = Regex.a(f7093n, str); a9 != null; a9 = a9.y()) {
            MatchGroup c10 = ((kotlin.collections.i) a9.f42r).c(1);
            c10.getClass();
            arrayList.add(c10.f5604a);
            if (a9.t().f5599d > i3) {
                kotlin.text.f fVar = Regex.f5606e;
                String substring = str.substring(i3, a9.t().f5599d);
                fVar.getClass();
                String quote = Pattern.quote(substring);
                quote.getClass();
                sb2.append(quote);
            }
            String pattern = f7096q.f5607d.pattern();
            pattern.getClass();
            sb2.append(pattern);
            i3 = a9.t().f5600e + 1;
        }
        if (i3 < str.length()) {
            kotlin.text.f fVar2 = Regex.f5606e;
            String substring2 = str.substring(i3);
            fVar2.getClass();
            String quote2 = Pattern.quote(substring2);
            quote2.getClass();
            sb2.append(quote2);
        }
    }

    public static void g(Bundle bundle, String str, String str2, g gVar) {
        if (gVar == null) {
            str.getClass();
            bundle.putString(str, str2);
        } else {
            f0 f0Var = gVar.f7058a;
            str.getClass();
            f0Var.e(bundle, str, f0Var.d(str2));
        }
    }

    public static String h(String str) {
        return (StringsKt.n(str, "\\Q") && StringsKt.n(str, "\\E")) ? kotlin.text.o.g(str, ".*", "\\E.*\\Q") : StringsKt.n(str, "\\.\\*") ? kotlin.text.o.g(str, "\\.\\*", ".*") : str;
    }

    public final int b(Uri uri) {
        if (uri == null) {
            return 0;
        }
        List<String> pathSegments = uri.getPathSegments();
        Uri parse = Uri.parse(this.f7098a);
        parse.getClass();
        List<String> pathSegments2 = parse.getPathSegments();
        pathSegments.getClass();
        pathSegments2.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : pathSegments) {
            if (pathSegments2.contains(obj)) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet.size();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [hd.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [hd.g, java.lang.Object] */
    public final ArrayList c() {
        Collection values = ((Map) this.f7103f.getValue()).values();
        ArrayList arrayList = new ArrayList();
        Iterator it = values.iterator();
        while (it.hasNext()) {
            kotlin.collections.d0.l(arrayList, ((p) it.next()).f7091b);
        }
        return CollectionsKt.G(CollectionsKt.G(this.f7099b, arrayList), (List) this.f7105i.getValue());
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [hd.g, java.lang.Object] */
    public final Bundle d(Uri uri, LinkedHashMap linkedHashMap) {
        a1.n b10;
        a1.n b11;
        String str;
        String str2;
        uri.getClass();
        linkedHashMap.getClass();
        Regex regex = (Regex) this.f7101d.getValue();
        if (regex != null && (b10 = regex.b(uri.toString())) != null) {
            k0.f5575d.getClass();
            int i3 = 0;
            Bundle h10 = z4.w.h((Pair[]) Arrays.copyOf(new Pair[0], 0));
            if (e(b10, h10, linkedHashMap) && (!((Boolean) this.f7102e.getValue()).booleanValue() || f(uri, h10, linkedHashMap))) {
                String fragment = uri.getFragment();
                Regex regex2 = (Regex) this.f7106k.getValue();
                if (regex2 != null && (b11 = regex2.b(String.valueOf(fragment))) != null) {
                    List list = (List) this.f7105i.getValue();
                    ArrayList arrayList = new ArrayList(kotlin.collections.z.j(list, 10));
                    for (Object obj : list) {
                        int i10 = i3 + 1;
                        if (i3 < 0) {
                            kotlin.collections.y.i();
                            throw null;
                        }
                        String str3 = (String) obj;
                        MatchGroup c10 = ((kotlin.collections.i) b11.f42r).c(i10);
                        if (c10 == null || (str2 = c10.f5604a) == null) {
                            str = null;
                        } else {
                            str = Uri.decode(str2);
                            str.getClass();
                        }
                        if (str == null) {
                            str = "";
                        }
                        try {
                            g(h10, str3, str, (g) linkedHashMap.get(str3));
                            arrayList.add(Unit.f5554a);
                            i3 = i10;
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                }
                if (k7.e.z(linkedHashMap, new o(h10, 0)).isEmpty()) {
                    return h10;
                }
            }
        }
        return null;
    }

    public final boolean e(a1.n nVar, Bundle bundle, Map map) {
        String str;
        ArrayList arrayList = this.f7099b;
        ArrayList arrayList2 = new ArrayList(kotlin.collections.z.j(arrayList, 10));
        int size = arrayList.size();
        int i3 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            int i11 = i3 + 1;
            String str2 = null;
            if (i3 < 0) {
                kotlin.collections.y.i();
                throw null;
            }
            String str3 = (String) obj;
            MatchGroup c10 = ((kotlin.collections.i) nVar.f42r).c(i11);
            if (c10 != null && (str = c10.f5604a) != null) {
                str2 = Uri.decode(str);
                str2.getClass();
            }
            if (str2 == null) {
                str2 = "";
            }
            try {
                g(bundle, str3, str2, (g) map.get(str3));
                arrayList2.add(Unit.f5554a);
                i3 = i11;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof q)) {
            return false;
        }
        return this.f7098a.equals(((q) obj).f7098a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r23v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v0, types: [hd.g, java.lang.Object] */
    public final boolean f(Uri uri, Bundle bundle, Map map) {
        Object obj;
        boolean z10;
        String query;
        q qVar = this;
        for (Map.Entry entry : ((Map) qVar.f7103f.getValue()).entrySet()) {
            String str = (String) entry.getKey();
            p pVar = (p) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(str);
            if (qVar.g && (query = uri.getQuery()) != null && !query.equals(uri.toString())) {
                queryParameters = kotlin.collections.x.c(query);
            }
            k0.f5575d.getClass();
            boolean z11 = false;
            Bundle h10 = z4.w.h((Pair[]) Arrays.copyOf(new Pair[0], 0));
            ArrayList arrayList = pVar.f7091b;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj2 = arrayList.get(i3);
                i3++;
                String str2 = (String) obj2;
                g gVar = (g) map.get(str2);
                f0 f0Var = gVar != null ? gVar.f7058a : null;
                if ((f0Var instanceof e) && !gVar.f7060c) {
                    e eVar = (e) f0Var;
                    eVar.e(h10, str2, eVar.h());
                }
            }
            for (String str3 : queryParameters) {
                String str4 = pVar.f7090a;
                a1.n b10 = str4 != null ? new Regex(str4).b(str3) : null;
                if (b10 == null) {
                    return z11;
                }
                ArrayList arrayList2 = pVar.f7091b;
                ArrayList arrayList3 = new ArrayList(kotlin.collections.z.j(arrayList2, 10));
                int size2 = arrayList2.size();
                boolean z12 = z11;
                int i10 = z12 ? 1 : 0;
                ?? r14 = z12;
                while (i10 < size2) {
                    Object obj3 = arrayList2.get(i10);
                    i10++;
                    int i11 = r14 + 1;
                    if (r14 < 0) {
                        kotlin.collections.y.i();
                        throw null;
                    }
                    String str5 = (String) obj3;
                    MatchGroup c10 = ((kotlin.collections.i) b10.f42r).c(i11);
                    String str6 = c10 != null ? c10.f5604a : null;
                    if (str6 == null) {
                        str6 = "";
                    }
                    g gVar2 = (g) map.get(str5);
                    try {
                        if (a.a.k(str5, h10)) {
                            if (h10.containsKey(str5)) {
                                if (gVar2 != null) {
                                    f0 f0Var2 = gVar2.f7058a;
                                    Object a9 = f0Var2.a(str5, h10);
                                    if (!h10.containsKey(str5)) {
                                        throw new IllegalArgumentException("There is no previous value in this savedState.");
                                    }
                                    f0Var2.e(h10, str5, f0Var2.c(a9, str6));
                                }
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            obj = Boolean.valueOf(z10);
                        } else {
                            g(h10, str5, str6, gVar2);
                            obj = Unit.f5554a;
                        }
                    } catch (IllegalArgumentException unused) {
                        obj = Unit.f5554a;
                    }
                    arrayList3.add(obj);
                    z11 = false;
                    r14 = i11;
                }
            }
            bundle.putAll(h10);
            qVar = this;
        }
        return true;
    }

    public final int hashCode() {
        return this.f7098a.hashCode() * 961;
    }
}
