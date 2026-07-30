package com.yanzhenjie.kalle.cookie;

import android.text.TextUtils;
import com.baidu.ar.util.SystemInfoUtil;
import java.net.HttpCookie;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class a {
    private com.yanzhenjie.kalle.cookie.b cookieJar;

    private static class b implements Comparator {
        private b() {
        }

        @Override // java.util.Comparator
        public int compare(HttpCookie httpCookie, HttpCookie httpCookie2) {
            if (httpCookie == httpCookie2) {
                return 0;
            }
            if (httpCookie == null) {
                return -1;
            }
            if (httpCookie2 == null) {
                return 1;
            }
            if (!httpCookie.getName().equals(httpCookie2.getName())) {
                return 0;
            }
            String normalizePath = a.normalizePath(httpCookie.getPath());
            String normalizePath2 = a.normalizePath(httpCookie2.getPath());
            if (normalizePath.startsWith(normalizePath2)) {
                return -1;
            }
            return normalizePath2.startsWith(normalizePath) ? 1 : 0;
        }
    }

    public a(com.yanzhenjie.kalle.cookie.b bVar) {
        this.cookieJar = bVar;
    }

    private static boolean containsPort(String str, int i8) {
        if (!str.contains(SystemInfoUtil.COMMA)) {
            return str.equalsIgnoreCase(Integer.toString(i8));
        }
        String[] split = str.split(SystemInfoUtil.COMMA);
        String num = Integer.toString(i8);
        for (String str2 : split) {
            if (str2.equals(num)) {
                return true;
            }
        }
        return false;
    }

    private static int getPort(URI uri) {
        int port = uri.getPort();
        return port == -1 ? "https".equals(uri.getScheme()) ? 443 : 80 : port;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String normalizePath(String str) {
        if (str == null) {
            str = "";
        }
        if (str.endsWith("/")) {
            return str;
        }
        return str + "/";
    }

    private static boolean pathMatches(URI uri, HttpCookie httpCookie) {
        return normalizePath(uri.getPath()).startsWith(normalizePath(httpCookie.getPath()));
    }

    private String sortByPath(List<HttpCookie> list) {
        Collections.sort(list, new b());
        StringBuilder sb = new StringBuilder();
        int i8 = 1;
        for (HttpCookie httpCookie : list) {
            if (httpCookie.getVersion() < i8) {
                i8 = httpCookie.getVersion();
            }
        }
        if (i8 == 1) {
            sb.append("$Version=\"1\"; ");
        }
        for (int i9 = 0; i9 < list.size(); i9++) {
            if (i9 != 0) {
                sb.append("; ");
            }
            sb.append(list.get(i9).toString());
        }
        return sb.toString();
    }

    public void add(URI uri, List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            for (HttpCookie httpCookie : HttpCookie.parse(it.next())) {
                if (httpCookie.getPath() == null) {
                    httpCookie.setPath(normalizePath(uri.getPath()));
                } else if (!pathMatches(uri, httpCookie)) {
                }
                if (httpCookie.getDomain() == null) {
                    httpCookie.setDomain(uri.getHost());
                }
                String portlist = httpCookie.getPortlist();
                int port = getPort(uri);
                if (TextUtils.isEmpty(portlist) || containsPort(portlist, port)) {
                    this.cookieJar.add(uri, httpCookie);
                }
            }
        }
    }

    public List<String> get(URI uri) {
        boolean equalsIgnoreCase = "https".equalsIgnoreCase(uri.getScheme());
        ArrayList arrayList = new ArrayList();
        for (HttpCookie httpCookie : this.cookieJar.get(uri)) {
            if (pathMatches(uri, httpCookie) && (equalsIgnoreCase || !httpCookie.getSecure())) {
                String portlist = httpCookie.getPortlist();
                int port = getPort(uri);
                if (TextUtils.isEmpty(portlist) || containsPort(portlist, port)) {
                    arrayList.add(httpCookie);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(sortByPath(arrayList));
        return arrayList2;
    }
}
