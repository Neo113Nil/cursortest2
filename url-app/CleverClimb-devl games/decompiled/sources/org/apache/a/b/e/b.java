package org.apache.a.b.e;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.Stack;
import org.apache.a.m;

/* compiled from: URIUtils.java */
/* loaded from: classes2.dex */
public class b {
    public static URI a(String str, String str2, int i, String str3, String str4, String str5) throws URISyntaxException {
        StringBuilder sb = new StringBuilder();
        if (str2 != null) {
            if (str != null) {
                sb.append(str);
                sb.append("://");
            }
            sb.append(str2);
            if (i > 0) {
                sb.append(':');
                sb.append(i);
            }
        }
        if (str3 == null || !str3.startsWith("/")) {
            sb.append('/');
        }
        if (str3 != null) {
            sb.append(str3);
        }
        if (str4 != null) {
            sb.append('?');
            sb.append(str4);
        }
        if (str5 != null) {
            sb.append('#');
            sb.append(str5);
        }
        return new URI(sb.toString());
    }

    public static URI a(URI uri, m mVar, boolean z) throws URISyntaxException {
        if (uri == null) {
            throw new IllegalArgumentException("URI may nor be null");
        }
        if (mVar != null) {
            return a(mVar.c(), mVar.a(), mVar.b(), a(uri.getRawPath()), uri.getRawQuery(), z ? null : uri.getRawFragment());
        }
        return a(null, null, -1, a(uri.getRawPath()), uri.getRawQuery(), z ? null : uri.getRawFragment());
    }

    private static String a(String str) {
        if (str == null) {
            return null;
        }
        int i = 0;
        while (i < str.length() && str.charAt(i) == '/') {
            i++;
        }
        return i > 1 ? str.substring(i - 1) : str;
    }

    public static URI a(URI uri, m mVar) throws URISyntaxException {
        return a(uri, mVar, false);
    }

    public static URI a(URI uri, URI uri2) {
        if (uri == null) {
            throw new IllegalArgumentException("Base URI may nor be null");
        }
        if (uri2 == null) {
            throw new IllegalArgumentException("Reference URI may nor be null");
        }
        String uri3 = uri2.toString();
        if (uri3.startsWith("?")) {
            return b(uri, uri2);
        }
        boolean z = uri3.length() == 0;
        if (z) {
            uri2 = URI.create("#");
        }
        URI resolve = uri.resolve(uri2);
        if (z) {
            String uri4 = resolve.toString();
            resolve = URI.create(uri4.substring(0, uri4.indexOf(35)));
        }
        return b(resolve);
    }

    private static URI b(URI uri, URI uri2) {
        String uri3 = uri.toString();
        if (uri3.indexOf(63) > -1) {
            uri3 = uri3.substring(0, uri3.indexOf(63));
        }
        return URI.create(uri3 + uri2.toString());
    }

    private static URI b(URI uri) {
        String path = uri.getPath();
        if (path == null || path.indexOf("/.") == -1) {
            return uri;
        }
        String[] split = path.split("/");
        Stack stack = new Stack();
        for (int i = 0; i < split.length; i++) {
            if (split[i].length() != 0 && !".".equals(split[i])) {
                if ("..".equals(split[i])) {
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }
                } else {
                    stack.push(split[i]);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = stack.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            sb.append('/');
            sb.append(str);
        }
        try {
            return new URI(uri.getScheme(), uri.getAuthority(), sb.toString(), uri.getQuery(), uri.getFragment());
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static m a(URI uri) {
        int indexOf;
        if (uri == null || !uri.isAbsolute()) {
            return null;
        }
        int port = uri.getPort();
        String host = uri.getHost();
        if (host == null && (host = uri.getAuthority()) != null) {
            int indexOf2 = host.indexOf(64);
            if (indexOf2 >= 0) {
                int i = indexOf2 + 1;
                host = host.length() > i ? host.substring(i) : null;
            }
            if (host != null && (indexOf = host.indexOf(58)) >= 0) {
                int i2 = indexOf + 1;
                if (i2 < host.length()) {
                    port = Integer.parseInt(host.substring(i2));
                }
                host = host.substring(0, indexOf);
            }
        }
        String scheme = uri.getScheme();
        if (host != null) {
            return new m(host, port, scheme);
        }
        return null;
    }
}
