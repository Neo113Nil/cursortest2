package defpackage;

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

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ta1 {
    public final nx0 OPXfSBeufaJ8;
    public final String PxuCJdSBwIXG;
    public boolean RAsUl2FVSrh6;
    public final String TSizfFm2Yiuu;
    public final qc2 Y1f8riQaR6yg;
    public final nx0 a92UlCVFR9N8;
    public final qc2 dgRBjINgWbAK;
    public final qc2 e9gEMXR7LXtO;
    public final ArrayList lS5Rgt96tfkO;
    public final nx0 rtx2ld2ELZv4;
    public final nx0 wdg6QnbFHrFF;
    public final boolean x50lh2ztY7Y5;
    private static final ra1 Companion = new ra1();
    public static final eu1 cpQdD2nAriOS = new eu1("^[a-zA-Z]+[+\\w\\-.]*:");
    public static final eu1 r3s1LDPKFs1S = new eu1("\\{(.+?)\\}");
    public static final eu1 QrzZRwfaDlRX = new eu1("http[s]?://");
    public static final eu1 gPXPFXrUH4XX = new eu1(".*");
    public static final eu1 BRwzKIf41E4i = new eu1("([^/]*?|)");
    public static final eu1 XL4ISE6Oc65B = new eu1("^[^?#]+\\?([^#]*).*");

    public ta1(String str) {
        this.PxuCJdSBwIXG = str;
        ArrayList arrayList = new ArrayList();
        this.lS5Rgt96tfkO = arrayList;
        boolean z = false;
        z = false;
        final int i = z ? 1 : 0;
        this.Y1f8riQaR6yg = new qc2(new ae0(this) { // from class: pa1
            public final /* synthetic */ ta1 OPXfSBeufaJ8;

            {
                this.OPXfSBeufaJ8 = this;
            }

            @Override // defpackage.ae0
            public final Object PxuCJdSBwIXG() {
                List list;
                int i2 = i;
                ta1 ta1Var = this.OPXfSBeufaJ8;
                switch (i2) {
                    case 0:
                        String str2 = ta1Var.TSizfFm2Yiuu;
                        if (str2 != null) {
                            return new eu1(str2, 0);
                        }
                        return null;
                    case 1:
                        return Boolean.valueOf(ta1.XL4ISE6Oc65B.TSizfFm2Yiuu(ta1Var.PxuCJdSBwIXG));
                    case 2:
                        String str3 = ta1Var.PxuCJdSBwIXG;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) ta1Var.e9gEMXR7LXtO.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str3);
                            parse.getClass();
                            for (String str4 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str4);
                                if (queryParameters.size() > 1) {
                                    u9.cpQdD2nAriOS("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                                String str5 = (String) zk.FT2GK7JK5Ma2(queryParameters);
                                if (str5 == null) {
                                    ta1Var.RAsUl2FVSrh6 = true;
                                    str5 = str4;
                                }
                                eu1 eu1Var = ta1.r3s1LDPKFs1S;
                                eu1Var.getClass();
                                str5.getClass();
                                Matcher matcher = eu1Var.rtx2ld2ELZv4.matcher(str5);
                                matcher.getClass();
                                sa1 sa1Var = new sa1();
                                int i3 = 0;
                                for (e0 TSizfFm2Yiuu = kj0.TSizfFm2Yiuu(matcher, 0, str5); TSizfFm2Yiuu != null; TSizfFm2Yiuu = TSizfFm2Yiuu.EcgxDIVH5in8()) {
                                    x41 lS5Rgt96tfkO = ((z41) TSizfFm2Yiuu.dgRBjINgWbAK).lS5Rgt96tfkO(1);
                                    lS5Rgt96tfkO.getClass();
                                    sa1Var.lS5Rgt96tfkO.add(lS5Rgt96tfkO.PxuCJdSBwIXG);
                                    if (TSizfFm2Yiuu.rtx2ld2ELZv4().rtx2ld2ELZv4 > i3) {
                                        String substring = str5.substring(i3, TSizfFm2Yiuu.rtx2ld2ELZv4().rtx2ld2ELZv4);
                                        eu1.Companion.getClass();
                                        String quote = Pattern.quote(substring);
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i3 = TSizfFm2Yiuu.rtx2ld2ELZv4().OPXfSBeufaJ8 + 1;
                                }
                                if (i3 < str5.length()) {
                                    du1 du1Var = eu1.Companion;
                                    String substring2 = str5.substring(i3);
                                    du1Var.getClass();
                                    String quote2 = Pattern.quote(substring2);
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                sa1Var.PxuCJdSBwIXG = ta1.rtx2ld2ELZv4(sb.toString());
                                linkedHashMap.put(str4, sa1Var);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = ta1Var.PxuCJdSBwIXG;
                        Uri parse2 = Uri.parse(str6);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str6);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        ta1.PxuCJdSBwIXG(fragment, arrayList2, sb2);
                        return new vi1(arrayList2, sb2.toString());
                    case 4:
                        vi1 vi1Var = (vi1) ta1Var.rtx2ld2ELZv4.getValue();
                        return (vi1Var == null || (list = (List) vi1Var.rtx2ld2ELZv4) == null) ? new ArrayList() : list;
                    case 5:
                        vi1 vi1Var2 = (vi1) ta1Var.rtx2ld2ELZv4.getValue();
                        if (vi1Var2 != null) {
                            return (String) vi1Var2.OPXfSBeufaJ8;
                        }
                        return null;
                    case 6:
                        String str7 = (String) ta1Var.wdg6QnbFHrFF.getValue();
                        if (str7 != null) {
                            return new eu1(str7, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i2 = 1;
        this.e9gEMXR7LXtO = new qc2(new ae0(this) { // from class: pa1
            public final /* synthetic */ ta1 OPXfSBeufaJ8;

            {
                this.OPXfSBeufaJ8 = this;
            }

            @Override // defpackage.ae0
            public final Object PxuCJdSBwIXG() {
                List list;
                int i22 = i2;
                ta1 ta1Var = this.OPXfSBeufaJ8;
                switch (i22) {
                    case 0:
                        String str2 = ta1Var.TSizfFm2Yiuu;
                        if (str2 != null) {
                            return new eu1(str2, 0);
                        }
                        return null;
                    case 1:
                        return Boolean.valueOf(ta1.XL4ISE6Oc65B.TSizfFm2Yiuu(ta1Var.PxuCJdSBwIXG));
                    case 2:
                        String str3 = ta1Var.PxuCJdSBwIXG;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) ta1Var.e9gEMXR7LXtO.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str3);
                            parse.getClass();
                            for (String str4 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str4);
                                if (queryParameters.size() > 1) {
                                    u9.cpQdD2nAriOS("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                                String str5 = (String) zk.FT2GK7JK5Ma2(queryParameters);
                                if (str5 == null) {
                                    ta1Var.RAsUl2FVSrh6 = true;
                                    str5 = str4;
                                }
                                eu1 eu1Var = ta1.r3s1LDPKFs1S;
                                eu1Var.getClass();
                                str5.getClass();
                                Matcher matcher = eu1Var.rtx2ld2ELZv4.matcher(str5);
                                matcher.getClass();
                                sa1 sa1Var = new sa1();
                                int i3 = 0;
                                for (e0 TSizfFm2Yiuu = kj0.TSizfFm2Yiuu(matcher, 0, str5); TSizfFm2Yiuu != null; TSizfFm2Yiuu = TSizfFm2Yiuu.EcgxDIVH5in8()) {
                                    x41 lS5Rgt96tfkO = ((z41) TSizfFm2Yiuu.dgRBjINgWbAK).lS5Rgt96tfkO(1);
                                    lS5Rgt96tfkO.getClass();
                                    sa1Var.lS5Rgt96tfkO.add(lS5Rgt96tfkO.PxuCJdSBwIXG);
                                    if (TSizfFm2Yiuu.rtx2ld2ELZv4().rtx2ld2ELZv4 > i3) {
                                        String substring = str5.substring(i3, TSizfFm2Yiuu.rtx2ld2ELZv4().rtx2ld2ELZv4);
                                        eu1.Companion.getClass();
                                        String quote = Pattern.quote(substring);
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i3 = TSizfFm2Yiuu.rtx2ld2ELZv4().OPXfSBeufaJ8 + 1;
                                }
                                if (i3 < str5.length()) {
                                    du1 du1Var = eu1.Companion;
                                    String substring2 = str5.substring(i3);
                                    du1Var.getClass();
                                    String quote2 = Pattern.quote(substring2);
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                sa1Var.PxuCJdSBwIXG = ta1.rtx2ld2ELZv4(sb.toString());
                                linkedHashMap.put(str4, sa1Var);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = ta1Var.PxuCJdSBwIXG;
                        Uri parse2 = Uri.parse(str6);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str6);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        ta1.PxuCJdSBwIXG(fragment, arrayList2, sb2);
                        return new vi1(arrayList2, sb2.toString());
                    case 4:
                        vi1 vi1Var = (vi1) ta1Var.rtx2ld2ELZv4.getValue();
                        return (vi1Var == null || (list = (List) vi1Var.rtx2ld2ELZv4) == null) ? new ArrayList() : list;
                    case 5:
                        vi1 vi1Var2 = (vi1) ta1Var.rtx2ld2ELZv4.getValue();
                        if (vi1Var2 != null) {
                            return (String) vi1Var2.OPXfSBeufaJ8;
                        }
                        return null;
                    case 6:
                        String str7 = (String) ta1Var.wdg6QnbFHrFF.getValue();
                        if (str7 != null) {
                            return new eu1(str7, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i3 = 2;
        ae0 ae0Var = new ae0(this) { // from class: pa1
            public final /* synthetic */ ta1 OPXfSBeufaJ8;

            {
                this.OPXfSBeufaJ8 = this;
            }

            @Override // defpackage.ae0
            public final Object PxuCJdSBwIXG() {
                List list;
                int i22 = i3;
                ta1 ta1Var = this.OPXfSBeufaJ8;
                switch (i22) {
                    case 0:
                        String str2 = ta1Var.TSizfFm2Yiuu;
                        if (str2 != null) {
                            return new eu1(str2, 0);
                        }
                        return null;
                    case 1:
                        return Boolean.valueOf(ta1.XL4ISE6Oc65B.TSizfFm2Yiuu(ta1Var.PxuCJdSBwIXG));
                    case 2:
                        String str3 = ta1Var.PxuCJdSBwIXG;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) ta1Var.e9gEMXR7LXtO.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str3);
                            parse.getClass();
                            for (String str4 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str4);
                                if (queryParameters.size() > 1) {
                                    u9.cpQdD2nAriOS("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                                String str5 = (String) zk.FT2GK7JK5Ma2(queryParameters);
                                if (str5 == null) {
                                    ta1Var.RAsUl2FVSrh6 = true;
                                    str5 = str4;
                                }
                                eu1 eu1Var = ta1.r3s1LDPKFs1S;
                                eu1Var.getClass();
                                str5.getClass();
                                Matcher matcher = eu1Var.rtx2ld2ELZv4.matcher(str5);
                                matcher.getClass();
                                sa1 sa1Var = new sa1();
                                int i32 = 0;
                                for (e0 TSizfFm2Yiuu = kj0.TSizfFm2Yiuu(matcher, 0, str5); TSizfFm2Yiuu != null; TSizfFm2Yiuu = TSizfFm2Yiuu.EcgxDIVH5in8()) {
                                    x41 lS5Rgt96tfkO = ((z41) TSizfFm2Yiuu.dgRBjINgWbAK).lS5Rgt96tfkO(1);
                                    lS5Rgt96tfkO.getClass();
                                    sa1Var.lS5Rgt96tfkO.add(lS5Rgt96tfkO.PxuCJdSBwIXG);
                                    if (TSizfFm2Yiuu.rtx2ld2ELZv4().rtx2ld2ELZv4 > i32) {
                                        String substring = str5.substring(i32, TSizfFm2Yiuu.rtx2ld2ELZv4().rtx2ld2ELZv4);
                                        eu1.Companion.getClass();
                                        String quote = Pattern.quote(substring);
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i32 = TSizfFm2Yiuu.rtx2ld2ELZv4().OPXfSBeufaJ8 + 1;
                                }
                                if (i32 < str5.length()) {
                                    du1 du1Var = eu1.Companion;
                                    String substring2 = str5.substring(i32);
                                    du1Var.getClass();
                                    String quote2 = Pattern.quote(substring2);
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                sa1Var.PxuCJdSBwIXG = ta1.rtx2ld2ELZv4(sb.toString());
                                linkedHashMap.put(str4, sa1Var);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = ta1Var.PxuCJdSBwIXG;
                        Uri parse2 = Uri.parse(str6);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str6);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        ta1.PxuCJdSBwIXG(fragment, arrayList2, sb2);
                        return new vi1(arrayList2, sb2.toString());
                    case 4:
                        vi1 vi1Var = (vi1) ta1Var.rtx2ld2ELZv4.getValue();
                        return (vi1Var == null || (list = (List) vi1Var.rtx2ld2ELZv4) == null) ? new ArrayList() : list;
                    case 5:
                        vi1 vi1Var2 = (vi1) ta1Var.rtx2ld2ELZv4.getValue();
                        if (vi1Var2 != null) {
                            return (String) vi1Var2.OPXfSBeufaJ8;
                        }
                        return null;
                    case 6:
                        String str7 = (String) ta1Var.wdg6QnbFHrFF.getValue();
                        if (str7 != null) {
                            return new eu1(str7, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        };
        pz0 pz0Var = pz0.OPXfSBeufaJ8;
        this.a92UlCVFR9N8 = vi0.ryVscX7ZL4Ux(pz0Var, ae0Var);
        final int i4 = 3;
        this.rtx2ld2ELZv4 = vi0.ryVscX7ZL4Ux(pz0Var, new ae0(this) { // from class: pa1
            public final /* synthetic */ ta1 OPXfSBeufaJ8;

            {
                this.OPXfSBeufaJ8 = this;
            }

            @Override // defpackage.ae0
            public final Object PxuCJdSBwIXG() {
                List list;
                int i22 = i4;
                ta1 ta1Var = this.OPXfSBeufaJ8;
                switch (i22) {
                    case 0:
                        String str2 = ta1Var.TSizfFm2Yiuu;
                        if (str2 != null) {
                            return new eu1(str2, 0);
                        }
                        return null;
                    case 1:
                        return Boolean.valueOf(ta1.XL4ISE6Oc65B.TSizfFm2Yiuu(ta1Var.PxuCJdSBwIXG));
                    case 2:
                        String str3 = ta1Var.PxuCJdSBwIXG;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) ta1Var.e9gEMXR7LXtO.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str3);
                            parse.getClass();
                            for (String str4 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str4);
                                if (queryParameters.size() > 1) {
                                    u9.cpQdD2nAriOS("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                                String str5 = (String) zk.FT2GK7JK5Ma2(queryParameters);
                                if (str5 == null) {
                                    ta1Var.RAsUl2FVSrh6 = true;
                                    str5 = str4;
                                }
                                eu1 eu1Var = ta1.r3s1LDPKFs1S;
                                eu1Var.getClass();
                                str5.getClass();
                                Matcher matcher = eu1Var.rtx2ld2ELZv4.matcher(str5);
                                matcher.getClass();
                                sa1 sa1Var = new sa1();
                                int i32 = 0;
                                for (e0 TSizfFm2Yiuu = kj0.TSizfFm2Yiuu(matcher, 0, str5); TSizfFm2Yiuu != null; TSizfFm2Yiuu = TSizfFm2Yiuu.EcgxDIVH5in8()) {
                                    x41 lS5Rgt96tfkO = ((z41) TSizfFm2Yiuu.dgRBjINgWbAK).lS5Rgt96tfkO(1);
                                    lS5Rgt96tfkO.getClass();
                                    sa1Var.lS5Rgt96tfkO.add(lS5Rgt96tfkO.PxuCJdSBwIXG);
                                    if (TSizfFm2Yiuu.rtx2ld2ELZv4().rtx2ld2ELZv4 > i32) {
                                        String substring = str5.substring(i32, TSizfFm2Yiuu.rtx2ld2ELZv4().rtx2ld2ELZv4);
                                        eu1.Companion.getClass();
                                        String quote = Pattern.quote(substring);
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i32 = TSizfFm2Yiuu.rtx2ld2ELZv4().OPXfSBeufaJ8 + 1;
                                }
                                if (i32 < str5.length()) {
                                    du1 du1Var = eu1.Companion;
                                    String substring2 = str5.substring(i32);
                                    du1Var.getClass();
                                    String quote2 = Pattern.quote(substring2);
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                sa1Var.PxuCJdSBwIXG = ta1.rtx2ld2ELZv4(sb.toString());
                                linkedHashMap.put(str4, sa1Var);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = ta1Var.PxuCJdSBwIXG;
                        Uri parse2 = Uri.parse(str6);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str6);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        ta1.PxuCJdSBwIXG(fragment, arrayList2, sb2);
                        return new vi1(arrayList2, sb2.toString());
                    case 4:
                        vi1 vi1Var = (vi1) ta1Var.rtx2ld2ELZv4.getValue();
                        return (vi1Var == null || (list = (List) vi1Var.rtx2ld2ELZv4) == null) ? new ArrayList() : list;
                    case 5:
                        vi1 vi1Var2 = (vi1) ta1Var.rtx2ld2ELZv4.getValue();
                        if (vi1Var2 != null) {
                            return (String) vi1Var2.OPXfSBeufaJ8;
                        }
                        return null;
                    case 6:
                        String str7 = (String) ta1Var.wdg6QnbFHrFF.getValue();
                        if (str7 != null) {
                            return new eu1(str7, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i5 = 4;
        this.OPXfSBeufaJ8 = vi0.ryVscX7ZL4Ux(pz0Var, new ae0(this) { // from class: pa1
            public final /* synthetic */ ta1 OPXfSBeufaJ8;

            {
                this.OPXfSBeufaJ8 = this;
            }

            @Override // defpackage.ae0
            public final Object PxuCJdSBwIXG() {
                List list;
                int i22 = i5;
                ta1 ta1Var = this.OPXfSBeufaJ8;
                switch (i22) {
                    case 0:
                        String str2 = ta1Var.TSizfFm2Yiuu;
                        if (str2 != null) {
                            return new eu1(str2, 0);
                        }
                        return null;
                    case 1:
                        return Boolean.valueOf(ta1.XL4ISE6Oc65B.TSizfFm2Yiuu(ta1Var.PxuCJdSBwIXG));
                    case 2:
                        String str3 = ta1Var.PxuCJdSBwIXG;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) ta1Var.e9gEMXR7LXtO.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str3);
                            parse.getClass();
                            for (String str4 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str4);
                                if (queryParameters.size() > 1) {
                                    u9.cpQdD2nAriOS("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                                String str5 = (String) zk.FT2GK7JK5Ma2(queryParameters);
                                if (str5 == null) {
                                    ta1Var.RAsUl2FVSrh6 = true;
                                    str5 = str4;
                                }
                                eu1 eu1Var = ta1.r3s1LDPKFs1S;
                                eu1Var.getClass();
                                str5.getClass();
                                Matcher matcher = eu1Var.rtx2ld2ELZv4.matcher(str5);
                                matcher.getClass();
                                sa1 sa1Var = new sa1();
                                int i32 = 0;
                                for (e0 TSizfFm2Yiuu = kj0.TSizfFm2Yiuu(matcher, 0, str5); TSizfFm2Yiuu != null; TSizfFm2Yiuu = TSizfFm2Yiuu.EcgxDIVH5in8()) {
                                    x41 lS5Rgt96tfkO = ((z41) TSizfFm2Yiuu.dgRBjINgWbAK).lS5Rgt96tfkO(1);
                                    lS5Rgt96tfkO.getClass();
                                    sa1Var.lS5Rgt96tfkO.add(lS5Rgt96tfkO.PxuCJdSBwIXG);
                                    if (TSizfFm2Yiuu.rtx2ld2ELZv4().rtx2ld2ELZv4 > i32) {
                                        String substring = str5.substring(i32, TSizfFm2Yiuu.rtx2ld2ELZv4().rtx2ld2ELZv4);
                                        eu1.Companion.getClass();
                                        String quote = Pattern.quote(substring);
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i32 = TSizfFm2Yiuu.rtx2ld2ELZv4().OPXfSBeufaJ8 + 1;
                                }
                                if (i32 < str5.length()) {
                                    du1 du1Var = eu1.Companion;
                                    String substring2 = str5.substring(i32);
                                    du1Var.getClass();
                                    String quote2 = Pattern.quote(substring2);
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                sa1Var.PxuCJdSBwIXG = ta1.rtx2ld2ELZv4(sb.toString());
                                linkedHashMap.put(str4, sa1Var);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = ta1Var.PxuCJdSBwIXG;
                        Uri parse2 = Uri.parse(str6);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str6);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        ta1.PxuCJdSBwIXG(fragment, arrayList2, sb2);
                        return new vi1(arrayList2, sb2.toString());
                    case 4:
                        vi1 vi1Var = (vi1) ta1Var.rtx2ld2ELZv4.getValue();
                        return (vi1Var == null || (list = (List) vi1Var.rtx2ld2ELZv4) == null) ? new ArrayList() : list;
                    case 5:
                        vi1 vi1Var2 = (vi1) ta1Var.rtx2ld2ELZv4.getValue();
                        if (vi1Var2 != null) {
                            return (String) vi1Var2.OPXfSBeufaJ8;
                        }
                        return null;
                    case 6:
                        String str7 = (String) ta1Var.wdg6QnbFHrFF.getValue();
                        if (str7 != null) {
                            return new eu1(str7, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i6 = 5;
        this.wdg6QnbFHrFF = vi0.ryVscX7ZL4Ux(pz0Var, new ae0(this) { // from class: pa1
            public final /* synthetic */ ta1 OPXfSBeufaJ8;

            {
                this.OPXfSBeufaJ8 = this;
            }

            @Override // defpackage.ae0
            public final Object PxuCJdSBwIXG() {
                List list;
                int i22 = i6;
                ta1 ta1Var = this.OPXfSBeufaJ8;
                switch (i22) {
                    case 0:
                        String str2 = ta1Var.TSizfFm2Yiuu;
                        if (str2 != null) {
                            return new eu1(str2, 0);
                        }
                        return null;
                    case 1:
                        return Boolean.valueOf(ta1.XL4ISE6Oc65B.TSizfFm2Yiuu(ta1Var.PxuCJdSBwIXG));
                    case 2:
                        String str3 = ta1Var.PxuCJdSBwIXG;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) ta1Var.e9gEMXR7LXtO.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str3);
                            parse.getClass();
                            for (String str4 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str4);
                                if (queryParameters.size() > 1) {
                                    u9.cpQdD2nAriOS("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                                String str5 = (String) zk.FT2GK7JK5Ma2(queryParameters);
                                if (str5 == null) {
                                    ta1Var.RAsUl2FVSrh6 = true;
                                    str5 = str4;
                                }
                                eu1 eu1Var = ta1.r3s1LDPKFs1S;
                                eu1Var.getClass();
                                str5.getClass();
                                Matcher matcher = eu1Var.rtx2ld2ELZv4.matcher(str5);
                                matcher.getClass();
                                sa1 sa1Var = new sa1();
                                int i32 = 0;
                                for (e0 TSizfFm2Yiuu = kj0.TSizfFm2Yiuu(matcher, 0, str5); TSizfFm2Yiuu != null; TSizfFm2Yiuu = TSizfFm2Yiuu.EcgxDIVH5in8()) {
                                    x41 lS5Rgt96tfkO = ((z41) TSizfFm2Yiuu.dgRBjINgWbAK).lS5Rgt96tfkO(1);
                                    lS5Rgt96tfkO.getClass();
                                    sa1Var.lS5Rgt96tfkO.add(lS5Rgt96tfkO.PxuCJdSBwIXG);
                                    if (TSizfFm2Yiuu.rtx2ld2ELZv4().rtx2ld2ELZv4 > i32) {
                                        String substring = str5.substring(i32, TSizfFm2Yiuu.rtx2ld2ELZv4().rtx2ld2ELZv4);
                                        eu1.Companion.getClass();
                                        String quote = Pattern.quote(substring);
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i32 = TSizfFm2Yiuu.rtx2ld2ELZv4().OPXfSBeufaJ8 + 1;
                                }
                                if (i32 < str5.length()) {
                                    du1 du1Var = eu1.Companion;
                                    String substring2 = str5.substring(i32);
                                    du1Var.getClass();
                                    String quote2 = Pattern.quote(substring2);
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                sa1Var.PxuCJdSBwIXG = ta1.rtx2ld2ELZv4(sb.toString());
                                linkedHashMap.put(str4, sa1Var);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = ta1Var.PxuCJdSBwIXG;
                        Uri parse2 = Uri.parse(str6);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str6);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        ta1.PxuCJdSBwIXG(fragment, arrayList2, sb2);
                        return new vi1(arrayList2, sb2.toString());
                    case 4:
                        vi1 vi1Var = (vi1) ta1Var.rtx2ld2ELZv4.getValue();
                        return (vi1Var == null || (list = (List) vi1Var.rtx2ld2ELZv4) == null) ? new ArrayList() : list;
                    case 5:
                        vi1 vi1Var2 = (vi1) ta1Var.rtx2ld2ELZv4.getValue();
                        if (vi1Var2 != null) {
                            return (String) vi1Var2.OPXfSBeufaJ8;
                        }
                        return null;
                    case 6:
                        String str7 = (String) ta1Var.wdg6QnbFHrFF.getValue();
                        if (str7 != null) {
                            return new eu1(str7, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i7 = 6;
        this.dgRBjINgWbAK = new qc2(new ae0(this) { // from class: pa1
            public final /* synthetic */ ta1 OPXfSBeufaJ8;

            {
                this.OPXfSBeufaJ8 = this;
            }

            @Override // defpackage.ae0
            public final Object PxuCJdSBwIXG() {
                List list;
                int i22 = i7;
                ta1 ta1Var = this.OPXfSBeufaJ8;
                switch (i22) {
                    case 0:
                        String str2 = ta1Var.TSizfFm2Yiuu;
                        if (str2 != null) {
                            return new eu1(str2, 0);
                        }
                        return null;
                    case 1:
                        return Boolean.valueOf(ta1.XL4ISE6Oc65B.TSizfFm2Yiuu(ta1Var.PxuCJdSBwIXG));
                    case 2:
                        String str3 = ta1Var.PxuCJdSBwIXG;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) ta1Var.e9gEMXR7LXtO.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str3);
                            parse.getClass();
                            for (String str4 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str4);
                                if (queryParameters.size() > 1) {
                                    u9.cpQdD2nAriOS("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                                String str5 = (String) zk.FT2GK7JK5Ma2(queryParameters);
                                if (str5 == null) {
                                    ta1Var.RAsUl2FVSrh6 = true;
                                    str5 = str4;
                                }
                                eu1 eu1Var = ta1.r3s1LDPKFs1S;
                                eu1Var.getClass();
                                str5.getClass();
                                Matcher matcher = eu1Var.rtx2ld2ELZv4.matcher(str5);
                                matcher.getClass();
                                sa1 sa1Var = new sa1();
                                int i32 = 0;
                                for (e0 TSizfFm2Yiuu = kj0.TSizfFm2Yiuu(matcher, 0, str5); TSizfFm2Yiuu != null; TSizfFm2Yiuu = TSizfFm2Yiuu.EcgxDIVH5in8()) {
                                    x41 lS5Rgt96tfkO = ((z41) TSizfFm2Yiuu.dgRBjINgWbAK).lS5Rgt96tfkO(1);
                                    lS5Rgt96tfkO.getClass();
                                    sa1Var.lS5Rgt96tfkO.add(lS5Rgt96tfkO.PxuCJdSBwIXG);
                                    if (TSizfFm2Yiuu.rtx2ld2ELZv4().rtx2ld2ELZv4 > i32) {
                                        String substring = str5.substring(i32, TSizfFm2Yiuu.rtx2ld2ELZv4().rtx2ld2ELZv4);
                                        eu1.Companion.getClass();
                                        String quote = Pattern.quote(substring);
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i32 = TSizfFm2Yiuu.rtx2ld2ELZv4().OPXfSBeufaJ8 + 1;
                                }
                                if (i32 < str5.length()) {
                                    du1 du1Var = eu1.Companion;
                                    String substring2 = str5.substring(i32);
                                    du1Var.getClass();
                                    String quote2 = Pattern.quote(substring2);
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                sa1Var.PxuCJdSBwIXG = ta1.rtx2ld2ELZv4(sb.toString());
                                linkedHashMap.put(str4, sa1Var);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = ta1Var.PxuCJdSBwIXG;
                        Uri parse2 = Uri.parse(str6);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str6);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        ta1.PxuCJdSBwIXG(fragment, arrayList2, sb2);
                        return new vi1(arrayList2, sb2.toString());
                    case 4:
                        vi1 vi1Var = (vi1) ta1Var.rtx2ld2ELZv4.getValue();
                        return (vi1Var == null || (list = (List) vi1Var.rtx2ld2ELZv4) == null) ? new ArrayList() : list;
                    case 5:
                        vi1 vi1Var2 = (vi1) ta1Var.rtx2ld2ELZv4.getValue();
                        if (vi1Var2 != null) {
                            return (String) vi1Var2.OPXfSBeufaJ8;
                        }
                        return null;
                    case 6:
                        String str7 = (String) ta1Var.wdg6QnbFHrFF.getValue();
                        if (str7 != null) {
                            return new eu1(str7, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i8 = 7;
        new qc2(new ae0(this) { // from class: pa1
            public final /* synthetic */ ta1 OPXfSBeufaJ8;

            {
                this.OPXfSBeufaJ8 = this;
            }

            @Override // defpackage.ae0
            public final Object PxuCJdSBwIXG() {
                List list;
                int i22 = i8;
                ta1 ta1Var = this.OPXfSBeufaJ8;
                switch (i22) {
                    case 0:
                        String str2 = ta1Var.TSizfFm2Yiuu;
                        if (str2 != null) {
                            return new eu1(str2, 0);
                        }
                        return null;
                    case 1:
                        return Boolean.valueOf(ta1.XL4ISE6Oc65B.TSizfFm2Yiuu(ta1Var.PxuCJdSBwIXG));
                    case 2:
                        String str3 = ta1Var.PxuCJdSBwIXG;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) ta1Var.e9gEMXR7LXtO.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str3);
                            parse.getClass();
                            for (String str4 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str4);
                                if (queryParameters.size() > 1) {
                                    u9.cpQdD2nAriOS("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                                String str5 = (String) zk.FT2GK7JK5Ma2(queryParameters);
                                if (str5 == null) {
                                    ta1Var.RAsUl2FVSrh6 = true;
                                    str5 = str4;
                                }
                                eu1 eu1Var = ta1.r3s1LDPKFs1S;
                                eu1Var.getClass();
                                str5.getClass();
                                Matcher matcher = eu1Var.rtx2ld2ELZv4.matcher(str5);
                                matcher.getClass();
                                sa1 sa1Var = new sa1();
                                int i32 = 0;
                                for (e0 TSizfFm2Yiuu = kj0.TSizfFm2Yiuu(matcher, 0, str5); TSizfFm2Yiuu != null; TSizfFm2Yiuu = TSizfFm2Yiuu.EcgxDIVH5in8()) {
                                    x41 lS5Rgt96tfkO = ((z41) TSizfFm2Yiuu.dgRBjINgWbAK).lS5Rgt96tfkO(1);
                                    lS5Rgt96tfkO.getClass();
                                    sa1Var.lS5Rgt96tfkO.add(lS5Rgt96tfkO.PxuCJdSBwIXG);
                                    if (TSizfFm2Yiuu.rtx2ld2ELZv4().rtx2ld2ELZv4 > i32) {
                                        String substring = str5.substring(i32, TSizfFm2Yiuu.rtx2ld2ELZv4().rtx2ld2ELZv4);
                                        eu1.Companion.getClass();
                                        String quote = Pattern.quote(substring);
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i32 = TSizfFm2Yiuu.rtx2ld2ELZv4().OPXfSBeufaJ8 + 1;
                                }
                                if (i32 < str5.length()) {
                                    du1 du1Var = eu1.Companion;
                                    String substring2 = str5.substring(i32);
                                    du1Var.getClass();
                                    String quote2 = Pattern.quote(substring2);
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                sa1Var.PxuCJdSBwIXG = ta1.rtx2ld2ELZv4(sb.toString());
                                linkedHashMap.put(str4, sa1Var);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = ta1Var.PxuCJdSBwIXG;
                        Uri parse2 = Uri.parse(str6);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str6);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        ta1.PxuCJdSBwIXG(fragment, arrayList2, sb2);
                        return new vi1(arrayList2, sb2.toString());
                    case 4:
                        vi1 vi1Var = (vi1) ta1Var.rtx2ld2ELZv4.getValue();
                        return (vi1Var == null || (list = (List) vi1Var.rtx2ld2ELZv4) == null) ? new ArrayList() : list;
                    case 5:
                        vi1 vi1Var2 = (vi1) ta1Var.rtx2ld2ELZv4.getValue();
                        if (vi1Var2 != null) {
                            return (String) vi1Var2.OPXfSBeufaJ8;
                        }
                        return null;
                    case 6:
                        String str7 = (String) ta1Var.wdg6QnbFHrFF.getValue();
                        if (str7 != null) {
                            return new eu1(str7, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        StringBuilder sb = new StringBuilder("^");
        if (!cpQdD2nAriOS.rtx2ld2ELZv4.matcher(str).find()) {
            String pattern = QrzZRwfaDlRX.rtx2ld2ELZv4.pattern();
            pattern.getClass();
            sb.append(pattern);
        }
        Pattern compile = Pattern.compile("(\\?|#|$)");
        compile.getClass();
        Matcher matcher = compile.matcher(str);
        matcher.getClass();
        e0 TSizfFm2Yiuu = kj0.TSizfFm2Yiuu(matcher, 0, str);
        if (TSizfFm2Yiuu != null) {
            PxuCJdSBwIXG(str.substring(0, TSizfFm2Yiuu.rtx2ld2ELZv4().rtx2ld2ELZv4), arrayList, sb);
            if (!gPXPFXrUH4XX.rtx2ld2ELZv4.matcher(sb).find() && !BRwzKIf41E4i.rtx2ld2ELZv4.matcher(sb).find()) {
                z = true;
            }
            this.x50lh2ztY7Y5 = z;
            sb.append("($|(\\?(.)*)|(#(.)*))");
        }
        this.TSizfFm2Yiuu = rtx2ld2ELZv4(sb.toString());
    }

    public static void PxuCJdSBwIXG(String str, ArrayList arrayList, StringBuilder sb) {
        eu1 eu1Var = r3s1LDPKFs1S;
        eu1Var.getClass();
        Matcher matcher = eu1Var.rtx2ld2ELZv4.matcher(str);
        matcher.getClass();
        int i = 0;
        for (e0 TSizfFm2Yiuu = kj0.TSizfFm2Yiuu(matcher, 0, str); TSizfFm2Yiuu != null; TSizfFm2Yiuu = TSizfFm2Yiuu.EcgxDIVH5in8()) {
            x41 lS5Rgt96tfkO = ((z41) TSizfFm2Yiuu.dgRBjINgWbAK).lS5Rgt96tfkO(1);
            lS5Rgt96tfkO.getClass();
            arrayList.add(lS5Rgt96tfkO.PxuCJdSBwIXG);
            if (TSizfFm2Yiuu.rtx2ld2ELZv4().rtx2ld2ELZv4 > i) {
                du1 du1Var = eu1.Companion;
                String substring = str.substring(i, TSizfFm2Yiuu.rtx2ld2ELZv4().rtx2ld2ELZv4);
                du1Var.getClass();
                String quote = Pattern.quote(substring);
                quote.getClass();
                sb.append(quote);
            }
            String pattern = BRwzKIf41E4i.rtx2ld2ELZv4.pattern();
            pattern.getClass();
            sb.append(pattern);
            i = TSizfFm2Yiuu.rtx2ld2ELZv4().OPXfSBeufaJ8 + 1;
        }
        if (i < str.length()) {
            du1 du1Var2 = eu1.Companion;
            String substring2 = str.substring(i);
            du1Var2.getClass();
            String quote2 = Pattern.quote(substring2);
            quote2.getClass();
            sb.append(quote2);
        }
    }

    public static void RAsUl2FVSrh6(Bundle bundle, String str, String str2, v91 v91Var) {
        if (v91Var == null) {
            str.getClass();
            bundle.putString(str, str2);
        } else {
            dc1 dc1Var = v91Var.PxuCJdSBwIXG;
            str.getClass();
            dc1Var.e9gEMXR7LXtO(bundle, str, dc1Var.Y1f8riQaR6yg(str2));
        }
    }

    public static String rtx2ld2ELZv4(String str) {
        return (ia2.jJwa0q7P5wHq(str, "\\Q", false) && ia2.jJwa0q7P5wHq(str, "\\E", false)) ? pa2.bEKsvqmvPh2y(str, ".*", "\\E.*\\Q") : ia2.jJwa0q7P5wHq(str, "\\.\\*", false) ? pa2.bEKsvqmvPh2y(str, "\\.\\*", ".*") : str;
    }

    public final ArrayList TSizfFm2Yiuu() {
        Collection values = ((Map) this.a92UlCVFR9N8.getValue()).values();
        ArrayList arrayList = new ArrayList();
        Iterator it = values.iterator();
        while (it.hasNext()) {
            el.MBpAROcyNHKN(((sa1) it.next()).lS5Rgt96tfkO, arrayList);
        }
        return zk.wcHq2YQJmeHg(zk.wcHq2YQJmeHg(this.lS5Rgt96tfkO, arrayList), (List) this.OPXfSBeufaJ8.getValue());
    }

    public final Bundle Y1f8riQaR6yg(Uri uri, LinkedHashMap linkedHashMap) {
        e0 lS5Rgt96tfkO;
        e0 lS5Rgt96tfkO2;
        String str;
        uri.getClass();
        linkedHashMap.getClass();
        eu1 eu1Var = (eu1) this.Y1f8riQaR6yg.getValue();
        if (eu1Var != null && (lS5Rgt96tfkO = eu1Var.lS5Rgt96tfkO(uri.toString())) != null) {
            Bundle ZbWwgt3aGe7A = mm2.ZbWwgt3aGe7A((vi1[]) Arrays.copyOf(new vi1[0], 0));
            if (e9gEMXR7LXtO(lS5Rgt96tfkO, ZbWwgt3aGe7A, linkedHashMap) && (!((Boolean) this.e9gEMXR7LXtO.getValue()).booleanValue() || a92UlCVFR9N8(uri, ZbWwgt3aGe7A, linkedHashMap))) {
                String fragment = uri.getFragment();
                eu1 eu1Var2 = (eu1) this.dgRBjINgWbAK.getValue();
                if (eu1Var2 != null && (lS5Rgt96tfkO2 = eu1Var2.lS5Rgt96tfkO(String.valueOf(fragment))) != null) {
                    List list = (List) this.OPXfSBeufaJ8.getValue();
                    ArrayList arrayList = new ArrayList(al.KZw9XyiywG4x(list, 10));
                    int i = 0;
                    for (Object obj : list) {
                        int i2 = i + 1;
                        if (i < 0) {
                            fx1.mFd1aGiJX24N();
                            throw null;
                        }
                        String str2 = (String) obj;
                        x41 lS5Rgt96tfkO3 = ((z41) lS5Rgt96tfkO2.dgRBjINgWbAK).lS5Rgt96tfkO(i2);
                        if (lS5Rgt96tfkO3 != null) {
                            str = Uri.decode(lS5Rgt96tfkO3.PxuCJdSBwIXG);
                            str.getClass();
                        } else {
                            str = null;
                        }
                        if (str == null) {
                            str = "";
                        }
                        try {
                            RAsUl2FVSrh6(ZbWwgt3aGe7A, str2, str, (v91) linkedHashMap.get(str2));
                            arrayList.add(no2.PxuCJdSBwIXG);
                            i = i2;
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                }
                if (sj0.ozEBbv0hFTAB(linkedHashMap, new qa1(0, ZbWwgt3aGe7A)).isEmpty()) {
                    return ZbWwgt3aGe7A;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a92UlCVFR9N8(Uri uri, Bundle bundle, Map map) {
        e0 e0Var;
        Object obj;
        boolean z;
        String query;
        ta1 ta1Var = this;
        Map map2 = map;
        for (Map.Entry entry : ((Map) ta1Var.a92UlCVFR9N8.getValue()).entrySet()) {
            String str = (String) entry.getKey();
            sa1 sa1Var = (sa1) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(str);
            if (ta1Var.RAsUl2FVSrh6 && (query = uri.getQuery()) != null && !query.equals(uri.toString())) {
                queryParameters = fx1.jJwa0q7P5wHq(query);
            }
            no2 no2Var = no2.PxuCJdSBwIXG;
            boolean z2 = false;
            Bundle ZbWwgt3aGe7A = mm2.ZbWwgt3aGe7A((vi1[]) Arrays.copyOf(new vi1[0], 0));
            ArrayList arrayList = sa1Var.lS5Rgt96tfkO;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                String str2 = (String) obj2;
                v91 v91Var = (v91) map2.get(str2);
                dc1 dc1Var = v91Var != null ? v91Var.PxuCJdSBwIXG : null;
                if ((dc1Var instanceof yk) && !v91Var.TSizfFm2Yiuu) {
                    yk ykVar = (yk) dc1Var;
                    ykVar.e9gEMXR7LXtO(ZbWwgt3aGe7A, str2, ykVar.RAsUl2FVSrh6());
                }
            }
            Map map3 = map2;
            for (String str3 : queryParameters) {
                String str4 = sa1Var.PxuCJdSBwIXG;
                if (str4 != null) {
                    Pattern compile = Pattern.compile(str4);
                    compile.getClass();
                    str3.getClass();
                    Matcher matcher = compile.matcher(str3);
                    matcher.getClass();
                    if (matcher.matches()) {
                        e0Var = new e0(matcher, str3);
                        if (e0Var != null) {
                            return z2;
                        }
                        ArrayList arrayList2 = sa1Var.lS5Rgt96tfkO;
                        ArrayList arrayList3 = new ArrayList(al.KZw9XyiywG4x(arrayList2, 10));
                        int size2 = arrayList2.size();
                        boolean z3 = z2;
                        int i2 = z3 ? 1 : 0;
                        Map map4 = map3;
                        ?? r14 = z3;
                        while (i2 < size2) {
                            Object obj3 = arrayList2.get(i2);
                            i2++;
                            int i3 = r14 + 1;
                            if (r14 < 0) {
                                fx1.mFd1aGiJX24N();
                                throw null;
                            }
                            String str5 = (String) obj3;
                            x41 lS5Rgt96tfkO = ((z41) e0Var.dgRBjINgWbAK).lS5Rgt96tfkO(i3);
                            String str6 = lS5Rgt96tfkO != null ? lS5Rgt96tfkO.PxuCJdSBwIXG : null;
                            if (str6 == null) {
                                str6 = "";
                            }
                            v91 v91Var2 = (v91) map4.get(str5);
                            try {
                                str5.getClass();
                            } catch (IllegalArgumentException unused) {
                            }
                            if (ZbWwgt3aGe7A.containsKey(str5)) {
                                if (ZbWwgt3aGe7A.containsKey(str5)) {
                                    if (v91Var2 != null) {
                                        dc1 dc1Var2 = v91Var2.PxuCJdSBwIXG;
                                        Object PxuCJdSBwIXG = dc1Var2.PxuCJdSBwIXG(str5, ZbWwgt3aGe7A);
                                        if (!ZbWwgt3aGe7A.containsKey(str5)) {
                                            throw new IllegalArgumentException("There is no previous value in this savedState.");
                                        }
                                        dc1Var2.e9gEMXR7LXtO(ZbWwgt3aGe7A, str5, dc1Var2.TSizfFm2Yiuu(PxuCJdSBwIXG, str6));
                                    }
                                    z = false;
                                } else {
                                    z = true;
                                }
                                obj = Boolean.valueOf(z);
                                arrayList3.add(obj);
                                map4 = map;
                                r14 = i3;
                                z2 = false;
                            } else {
                                RAsUl2FVSrh6(ZbWwgt3aGe7A, str5, str6, v91Var2);
                                obj = no2Var;
                                arrayList3.add(obj);
                                map4 = map;
                                r14 = i3;
                                z2 = false;
                            }
                        }
                        map3 = map;
                    }
                }
                e0Var = null;
                if (e0Var != null) {
                }
            }
            bundle.putAll(ZbWwgt3aGe7A);
            ta1Var = this;
            map2 = map;
        }
        return true;
    }

    public final boolean e9gEMXR7LXtO(e0 e0Var, Bundle bundle, Map map) {
        ArrayList arrayList = this.lS5Rgt96tfkO;
        ArrayList arrayList2 = new ArrayList(al.KZw9XyiywG4x(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            int i3 = i + 1;
            String str = null;
            if (i < 0) {
                fx1.mFd1aGiJX24N();
                throw null;
            }
            String str2 = (String) obj;
            x41 lS5Rgt96tfkO = ((z41) e0Var.dgRBjINgWbAK).lS5Rgt96tfkO(i3);
            if (lS5Rgt96tfkO != null) {
                str = Uri.decode(lS5Rgt96tfkO.PxuCJdSBwIXG);
                str.getClass();
            }
            if (str == null) {
                str = "";
            }
            try {
                RAsUl2FVSrh6(bundle, str2, str, (v91) map.get(str2));
                arrayList2.add(no2.PxuCJdSBwIXG);
                i = i3;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ta1)) {
            return false;
        }
        return this.PxuCJdSBwIXG.equals(((ta1) obj).PxuCJdSBwIXG);
    }

    public final int hashCode() {
        return this.PxuCJdSBwIXG.hashCode() * 961;
    }

    public final int lS5Rgt96tfkO(Uri uri) {
        if (uri == null) {
            return 0;
        }
        List<String> pathSegments = uri.getPathSegments();
        Uri parse = Uri.parse(this.PxuCJdSBwIXG);
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
}
