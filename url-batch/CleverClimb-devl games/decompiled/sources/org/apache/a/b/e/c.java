package org.apache.a.b.e;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import org.apache.a.h.l;
import org.apache.a.w;

/* compiled from: URLEncodedUtils.java */
/* loaded from: classes2.dex */
public class c {
    public static List<w> a(URI uri, String str) {
        List<w> emptyList = Collections.emptyList();
        String rawQuery = uri.getRawQuery();
        if (rawQuery == null || rawQuery.length() <= 0) {
            return emptyList;
        }
        ArrayList arrayList = new ArrayList();
        a(arrayList, new Scanner(rawQuery), str);
        return arrayList;
    }

    public static void a(List<w> list, Scanner scanner, String str) {
        scanner.useDelimiter("&");
        while (scanner.hasNext()) {
            String[] split = scanner.next().split("=");
            if (split.length == 0 || split.length > 2) {
                throw new IllegalArgumentException("bad parameter");
            }
            String a2 = a(split[0], str);
            String str2 = null;
            if (split.length == 2) {
                str2 = a(split[1], str);
            }
            list.add(new l(a2, str2));
        }
    }

    public static String a(List<? extends w> list, String str) {
        StringBuilder sb = new StringBuilder();
        for (w wVar : list) {
            String b2 = b(wVar.a(), str);
            String b3 = wVar.b();
            String b4 = b3 != null ? b(b3, str) : "";
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(b2);
            sb.append("=");
            sb.append(b4);
        }
        return sb.toString();
    }

    private static String a(String str, String str2) {
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        try {
            return URLDecoder.decode(str, str2);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    private static String b(String str, String str2) {
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
