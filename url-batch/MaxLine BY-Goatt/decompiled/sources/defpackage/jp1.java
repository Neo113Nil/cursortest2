package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class jp1 extends o81 implements Function0 {
    public final /* synthetic */ int m;
    public final /* synthetic */ lp1 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jp1(lp1 lp1Var, int i) {
        super(0);
        this.m = i;
        this.n = lp1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List list;
        int i = this.m;
        lp1 lp1Var = this.n;
        switch (i) {
            case 0:
                Pair pair = (Pair) lp1Var.h.getValue();
                return (pair == null || (list = (List) pair.m) == null) ? new ArrayList() : list;
            case 1:
                String str = lp1Var.a;
                if (Uri.parse(str).getFragment() == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                String fragment = Uri.parse(str).getFragment();
                StringBuilder sb = new StringBuilder();
                fragment.getClass();
                lp1.a(fragment, arrayList, sb);
                return new Pair(arrayList, sb.toString());
            case 2:
                String str2 = (String) lp1Var.j.getValue();
                if (str2 != null) {
                    return Pattern.compile(str2, 2);
                }
                return null;
            case 3:
                Pair pair2 = (Pair) lp1Var.h.getValue();
                if (pair2 != null) {
                    return (String) pair2.n;
                }
                return null;
            case 4:
                return Boolean.valueOf(Uri.parse(lp1Var.a).getQuery() != null);
            case 5:
                return null;
            case 6:
                String str3 = lp1Var.c;
                if (str3 != null) {
                    return Pattern.compile(str3, 2);
                }
                return null;
            default:
                String str4 = lp1Var.a;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (((Boolean) lp1Var.e.getValue()).booleanValue()) {
                    Uri parse = Uri.parse(str4);
                    for (String str5 : parse.getQueryParameterNames()) {
                        StringBuilder sb2 = new StringBuilder();
                        List<String> queryParameters = parse.getQueryParameters(str5);
                        if (queryParameters.size() > 1) {
                            b71.s("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                            return null;
                        }
                        String str6 = (String) zv.v(queryParameters);
                        if (str6 == null) {
                            lp1Var.g = true;
                            str6 = str5;
                        }
                        Matcher matcher = lp1.n.matcher(str6);
                        ip1 ip1Var = new ip1();
                        int i2 = 0;
                        while (matcher.find()) {
                            String group = matcher.group(1);
                            group.getClass();
                            ip1Var.b.add(group);
                            str6.getClass();
                            sb2.append(Pattern.quote(str6.substring(i2, matcher.start())));
                            sb2.append("(.+?)?");
                            i2 = matcher.end();
                        }
                        if (i2 < str6.length()) {
                            sb2.append(Pattern.quote(str6.substring(i2)));
                        }
                        ip1Var.a = tp2.m(sb2.toString(), ".*", "\\E.*\\Q");
                        str5.getClass();
                        linkedHashMap.put(str5, ip1Var);
                    }
                }
                return linkedHashMap;
        }
    }
}
