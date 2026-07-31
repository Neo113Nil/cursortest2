package t1;

import android.net.Uri;
import e2.InterfaceC0422a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n2.AbstractC0737q;

/* loaded from: classes.dex */
public final class p extends f2.k implements InterfaceC0422a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8905e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r f8906f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(r rVar, int i3) {
        super(0);
        this.f8905e = i3;
        this.f8906f = rVar;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [R1.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [R1.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [R1.f, java.lang.Object] */
    @Override // e2.InterfaceC0422a
    public final Object b() {
        List list;
        switch (this.f8905e) {
            case 0:
                R1.i iVar = (R1.i) this.f8906f.f8918h.getValue();
                return (iVar == null || (list = (List) iVar.f4150d) == null) ? new ArrayList() : list;
            case 1:
                String str = this.f8906f.f8911a;
                if (Uri.parse(str).getFragment() == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                String fragment = Uri.parse(str).getFragment();
                StringBuilder sb = new StringBuilder();
                f2.j.c(fragment);
                r.a(fragment, arrayList, sb);
                String sb2 = sb.toString();
                f2.j.e(sb2, "fragRegex.toString()");
                return new R1.i(arrayList, sb2);
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                String str2 = (String) this.f8906f.f8920j.getValue();
                if (str2 != null) {
                    return Pattern.compile(str2, 2);
                }
                return null;
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                R1.i iVar2 = (R1.i) this.f8906f.f8918h.getValue();
                if (iVar2 != null) {
                    return (String) iVar2.f4151e;
                }
                return null;
            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                String str3 = this.f8906f.f8911a;
                return Boolean.valueOf((str3 == null || Uri.parse(str3).getQuery() == null) ? false : true);
            case 5:
                this.f8906f.getClass();
                return null;
            case 6:
                String str4 = this.f8906f.f8913c;
                if (str4 != null) {
                    return Pattern.compile(str4, 2);
                }
                return null;
            default:
                r rVar = this.f8906f;
                rVar.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (((Boolean) rVar.f8915e.getValue()).booleanValue()) {
                    String str5 = rVar.f8911a;
                    Uri parse = Uri.parse(str5);
                    for (String str6 : parse.getQueryParameterNames()) {
                        StringBuilder sb3 = new StringBuilder();
                        List<String> queryParameters = parse.getQueryParameters(str6);
                        if (queryParameters.size() > 1) {
                            throw new IllegalArgumentException(("Query parameter " + str6 + " must only be present once in " + str5 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                        }
                        String str7 = (String) S1.l.L0(queryParameters);
                        if (str7 == null) {
                            rVar.f8917g = true;
                            str7 = str6;
                        }
                        Matcher matcher = r.f8910n.matcher(str7);
                        o oVar = new o();
                        int i3 = 0;
                        while (matcher.find()) {
                            String group = matcher.group(1);
                            f2.j.d(group, "null cannot be cast to non-null type kotlin.String");
                            oVar.f8904b.add(group);
                            f2.j.e(str7, "queryParam");
                            String substring = str7.substring(i3, matcher.start());
                            f2.j.e(substring, "substring(...)");
                            sb3.append(Pattern.quote(substring));
                            sb3.append("(.+?)?");
                            i3 = matcher.end();
                        }
                        if (i3 < str7.length()) {
                            String substring2 = str7.substring(i3);
                            f2.j.e(substring2, "substring(...)");
                            sb3.append(Pattern.quote(substring2));
                        }
                        String sb4 = sb3.toString();
                        f2.j.e(sb4, "argRegex.toString()");
                        oVar.f8903a = AbstractC0737q.x(sb4, ".*", "\\E.*\\Q");
                        f2.j.e(str6, "paramName");
                        linkedHashMap.put(str6, oVar);
                    }
                }
                return linkedHashMap;
        }
    }
}
