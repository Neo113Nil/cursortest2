package s1;

import android.net.Uri;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import z2.C1403G;

/* loaded from: classes.dex */
public final class r extends M2.p implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10546d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t f10547e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(t tVar, int i2) {
        super(0);
        this.f10546d = i2;
        this.f10547e = tVar;
    }

    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, y2.j] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, y2.j] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, y2.j] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List list;
        switch (this.f10546d) {
            case 0:
                Pair pair = (Pair) this.f10547e.f10559h.getValue();
                return (pair == null || (list = (List) pair.f7485d) == null) ? new ArrayList() : list;
            case 1:
                String str = this.f10547e.f10552a;
                if (Uri.parse(str).getFragment() == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                String fragment = Uri.parse(str).getFragment();
                StringBuilder sb = new StringBuilder();
                Intrinsics.c(fragment);
                t.a(fragment, arrayList, sb);
                String sb2 = sb.toString();
                Intrinsics.checkNotNullExpressionValue(sb2, "fragRegex.toString()");
                return new Pair(arrayList, sb2);
            case 2:
                String str2 = (String) this.f10547e.f10561j.getValue();
                if (str2 != null) {
                    return Pattern.compile(str2, 2);
                }
                return null;
            case 3:
                Pair pair2 = (Pair) this.f10547e.f10559h.getValue();
                if (pair2 != null) {
                    return (String) pair2.f7486e;
                }
                return null;
            case 4:
                String str3 = this.f10547e.f10552a;
                return Boolean.valueOf((str3 == null || Uri.parse(str3).getQuery() == null) ? false : true);
            case 5:
                this.f10547e.getClass();
                return null;
            case 6:
                String str4 = this.f10547e.f10554c;
                if (str4 != null) {
                    return Pattern.compile(str4, 2);
                }
                return null;
            default:
                t tVar = this.f10547e;
                tVar.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (((Boolean) tVar.f10556e.getValue()).booleanValue()) {
                    String str5 = tVar.f10552a;
                    Uri parse = Uri.parse(str5);
                    for (String paramName : parse.getQueryParameterNames()) {
                        StringBuilder sb3 = new StringBuilder();
                        List<String> queryParams = parse.getQueryParameters(paramName);
                        int i2 = 1;
                        if (queryParams.size() > 1) {
                            throw new IllegalArgumentException(("Query parameter " + paramName + " must only be present once in " + str5 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                        }
                        Intrinsics.checkNotNullExpressionValue(queryParams, "queryParams");
                        String queryParam = (String) C1403G.r(queryParams);
                        if (queryParam == null) {
                            tVar.f10558g = true;
                            queryParam = paramName;
                        }
                        Matcher matcher = t.f10551n.matcher(queryParam);
                        q qVar = new q();
                        int i4 = 0;
                        while (matcher.find()) {
                            String name = matcher.group(i2);
                            Intrinsics.d(name, "null cannot be cast to non-null type kotlin.String");
                            Intrinsics.checkNotNullParameter(name, "name");
                            qVar.f10545b.add(name);
                            Intrinsics.checkNotNullExpressionValue(queryParam, "queryParam");
                            String substring = queryParam.substring(i4, matcher.start());
                            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                            sb3.append(Pattern.quote(substring));
                            sb3.append("(.+?)?");
                            i4 = matcher.end();
                            i2 = 1;
                        }
                        if (i4 < queryParam.length()) {
                            Intrinsics.checkNotNullExpressionValue(queryParam, "queryParam");
                            String substring2 = queryParam.substring(i4);
                            Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                            sb3.append(Pattern.quote(substring2));
                        }
                        String sb4 = sb3.toString();
                        Intrinsics.checkNotNullExpressionValue(sb4, "argRegex.toString()");
                        qVar.f10544a = kotlin.text.u.l(sb4, ".*", "\\E.*\\Q");
                        Intrinsics.checkNotNullExpressionValue(paramName, "paramName");
                        linkedHashMap.put(paramName, qVar);
                    }
                }
                return linkedHashMap;
        }
    }
}
