package q1;

import android.net.Uri;
import h1.C0438i;
import h2.AbstractC0454p;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class r extends Z1.j implements Y1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6936e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t f6937f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(t tVar, int i3) {
        super(0);
        this.f6936e = i3;
        this.f6937f = tVar;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [L1.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [L1.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [L1.g, java.lang.Object] */
    @Override // Y1.a
    public final Object b() {
        List list;
        switch (this.f6936e) {
            case 0:
                L1.j jVar = (L1.j) this.f6937f.f6949h.getValue();
                return (jVar == null || (list = (List) jVar.f2708d) == null) ? new ArrayList() : list;
            case 1:
                String str = this.f6937f.f6942a;
                if (Uri.parse(str).getFragment() == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                String fragment = Uri.parse(str).getFragment();
                StringBuilder sb = new StringBuilder();
                Z1.i.c(fragment);
                t.a(fragment, arrayList, sb);
                String sb2 = sb.toString();
                Z1.i.e(sb2, "fragRegex.toString()");
                return new L1.j(arrayList, sb2);
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                String str2 = (String) this.f6937f.f6951j.getValue();
                if (str2 != null) {
                    return Pattern.compile(str2, 2);
                }
                return null;
            case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                L1.j jVar2 = (L1.j) this.f6937f.f6949h.getValue();
                if (jVar2 != null) {
                    return (String) jVar2.f2709e;
                }
                return null;
            case C0438i.LONG_FIELD_NUMBER /* 4 */:
                String str3 = this.f6937f.f6942a;
                return Boolean.valueOf((str3 == null || Uri.parse(str3).getQuery() == null) ? false : true);
            case 5:
                this.f6937f.getClass();
                return null;
            case 6:
                String str4 = this.f6937f.f6944c;
                if (str4 != null) {
                    return Pattern.compile(str4, 2);
                }
                return null;
            default:
                t tVar = this.f6937f;
                tVar.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (((Boolean) tVar.f6946e.getValue()).booleanValue()) {
                    String str5 = tVar.f6942a;
                    Uri parse = Uri.parse(str5);
                    for (String str6 : parse.getQueryParameterNames()) {
                        StringBuilder sb3 = new StringBuilder();
                        List<String> queryParameters = parse.getQueryParameters(str6);
                        if (queryParameters.size() > 1) {
                            throw new IllegalArgumentException(("Query parameter " + str6 + " must only be present once in " + str5 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                        }
                        String str7 = (String) M1.l.n0(queryParameters);
                        if (str7 == null) {
                            tVar.f6948g = true;
                            str7 = str6;
                        }
                        Matcher matcher = t.f6941n.matcher(str7);
                        q qVar = new q();
                        int i3 = 0;
                        while (matcher.find()) {
                            String group = matcher.group(1);
                            Z1.i.d(group, "null cannot be cast to non-null type kotlin.String");
                            qVar.f6935b.add(group);
                            Z1.i.e(str7, "queryParam");
                            String substring = str7.substring(i3, matcher.start());
                            Z1.i.e(substring, "substring(...)");
                            sb3.append(Pattern.quote(substring));
                            sb3.append("(.+?)?");
                            i3 = matcher.end();
                        }
                        if (i3 < str7.length()) {
                            String substring2 = str7.substring(i3);
                            Z1.i.e(substring2, "substring(...)");
                            sb3.append(Pattern.quote(substring2));
                        }
                        String sb4 = sb3.toString();
                        Z1.i.e(sb4, "argRegex.toString()");
                        qVar.f6934a = AbstractC0454p.g0(sb4, ".*", "\\E.*\\Q");
                        Z1.i.e(str6, "paramName");
                        linkedHashMap.put(str6, qVar);
                    }
                }
                return linkedHashMap;
        }
    }
}
