package t3;

import android.net.Uri;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class q extends r6.l implements q6.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f8831g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ s f8832h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(s sVar, int i7) {
        super(0);
        this.f8831g = i7;
        this.f8832h = sVar;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [d6.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [d6.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [d6.g, java.lang.Object] */
    @Override // q6.a
    public final Object a() {
        List list;
        switch (this.f8831g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                d6.j jVar = (d6.j) this.f8832h.f8844h.getValue();
                return (jVar == null || (list = (List) jVar.f2618f) == null) ? new ArrayList() : list;
            case 1:
                String str = this.f8832h.f8837a;
                if (Uri.parse(str).getFragment() == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                String fragment = Uri.parse(str).getFragment();
                StringBuilder sb = new StringBuilder();
                r6.k.c(fragment);
                s.a(fragment, arrayList, sb);
                String sb2 = sb.toString();
                r6.k.e(sb2, "fragRegex.toString()");
                return new d6.j(arrayList, sb2);
            case 2:
                String str2 = (String) this.f8832h.f8846j.getValue();
                if (str2 != null) {
                    return Pattern.compile(str2, 2);
                }
                return null;
            case 3:
                d6.j jVar2 = (d6.j) this.f8832h.f8844h.getValue();
                if (jVar2 != null) {
                    return (String) jVar2.f2619g;
                }
                return null;
            case 4:
                String str3 = this.f8832h.f8837a;
                return Boolean.valueOf((str3 == null || Uri.parse(str3).getQuery() == null) ? false : true);
            case 5:
                return null;
            case 6:
                String str4 = this.f8832h.f8839c;
                if (str4 != null) {
                    return Pattern.compile(str4, 2);
                }
                return null;
            default:
                s sVar = this.f8832h;
                String str5 = sVar.f8837a;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (((Boolean) sVar.f8841e.getValue()).booleanValue()) {
                    Uri parse = Uri.parse(str5);
                    for (String str6 : parse.getQueryParameterNames()) {
                        StringBuilder sb3 = new StringBuilder();
                        List<String> queryParameters = parse.getQueryParameters(str6);
                        if (queryParameters.size() > 1) {
                            throw new IllegalArgumentException(("Query parameter " + str6 + " must only be present once in " + str5 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                        }
                        String str7 = (String) e6.l.i0(queryParameters);
                        if (str7 == null) {
                            sVar.f8843g = true;
                            str7 = str6;
                        }
                        Matcher matcher = s.f8836n.matcher(str7);
                        p pVar = new p();
                        int i7 = 0;
                        while (matcher.find()) {
                            String group = matcher.group(1);
                            r6.k.d(group, "null cannot be cast to non-null type kotlin.String");
                            pVar.f8830b.add(group);
                            r6.k.e(str7, "queryParam");
                            String substring = str7.substring(i7, matcher.start());
                            r6.k.e(substring, "substring(...)");
                            sb3.append(Pattern.quote(substring));
                            sb3.append("(.+?)?");
                            i7 = matcher.end();
                        }
                        if (i7 < str7.length()) {
                            String substring2 = str7.substring(i7);
                            r6.k.e(substring2, "substring(...)");
                            sb3.append(Pattern.quote(substring2));
                        }
                        String sb4 = sb3.toString();
                        r6.k.e(sb4, "argRegex.toString()");
                        pVar.f8829a = z6.o.t(sb4, ".*", "\\E.*\\Q");
                        r6.k.e(str6, "paramName");
                        linkedHashMap.put(str6, pVar);
                    }
                }
                return linkedHashMap;
        }
    }
}
