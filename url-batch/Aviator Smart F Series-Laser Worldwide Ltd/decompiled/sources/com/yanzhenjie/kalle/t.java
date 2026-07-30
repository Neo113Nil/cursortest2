package com.yanzhenjie.kalle;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.yanzhenjie.kalle.m;
import java.net.URI;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes4.dex */
public class t {
    private final String mFragment;
    private final String mHost;
    private final String mPath;
    private final int mPort;
    private final String mQuery;
    private final String mScheme;

    public static class b {
        private String mFragment;
        private String mHost;
        private List<String> mPath;
        private int mPort;
        private m.b mQuery;
        private String mScheme;

        public b addPath(int i8) {
            return addPath(Integer.toString(i8));
        }

        public b addQuery(String str, int i8) {
            return addQuery(str, Integer.toString(i8));
        }

        public t build() {
            return new t(this);
        }

        public b clearPath() {
            this.mPath.clear();
            return this;
        }

        public b clearQuery() {
            this.mQuery.clear();
            return this;
        }

        public b removeQuery(String str) {
            this.mQuery.remove(str);
            return this;
        }

        public b setFragment(String str) {
            this.mFragment = str;
            return this;
        }

        public b setHost(String str) {
            this.mHost = str;
            return this;
        }

        public b setPath(String str) {
            this.mPath = t.convertPath(str);
            return this;
        }

        public b setPort(int i8) {
            this.mPort = i8;
            return this;
        }

        public b setQuery(String str) {
            this.mQuery = t.convertQuery(str).builder();
            return this;
        }

        public b setScheme(String str) {
            this.mScheme = str;
            return this;
        }

        private b(String str) {
            URI create = URI.create(str);
            this.mScheme = create.getScheme();
            this.mHost = create.getHost();
            this.mPort = t.convertPort(create.getPort());
            this.mPath = t.convertPath(create.getPath());
            this.mQuery = t.convertQuery(create.getQuery()).builder();
            this.mFragment = create.getFragment();
        }

        public b addPath(long j8) {
            return addPath(Long.toString(j8));
        }

        public b addQuery(String str, long j8) {
            return addQuery(str, Long.toString(j8));
        }

        public b setQuery(m mVar) {
            this.mQuery = mVar.builder();
            return this;
        }

        public b addPath(boolean z7) {
            return addPath(Boolean.toString(z7));
        }

        public b addQuery(String str, boolean z7) {
            return addQuery(str, Boolean.toString(z7));
        }

        public b addPath(char c8) {
            return addPath(String.valueOf(c8));
        }

        public b addQuery(String str, char c8) {
            return addQuery(str, String.valueOf(c8));
        }

        public b addPath(double d8) {
            return addPath(Double.toString(d8));
        }

        public b addQuery(String str, double d8) {
            return addQuery(str, Double.toString(d8));
        }

        public b addPath(float f8) {
            return addPath(Float.toString(f8));
        }

        public b addQuery(String str, float f8) {
            return addQuery(str, Float.toString(f8));
        }

        public b addPath(String str) {
            this.mPath.add(str);
            return this;
        }

        public b addQuery(String str, short s7) {
            return addQuery(str, Integer.toString(s7));
        }

        public b addQuery(String str, String str2) {
            this.mQuery.add(str, (CharSequence) str2);
            return this;
        }

        public b addQuery(String str, List<String> list) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                addQuery(str, it.next());
            }
            return this;
        }

        public b addQuery(m mVar) {
            for (Map.Entry<String, List<Object>> entry : mVar.entrySet()) {
                String key = entry.getKey();
                for (Object obj : entry.getValue()) {
                    if (obj instanceof CharSequence) {
                        addQuery(key, obj.toString());
                    }
                }
            }
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<String> convertPath(String str) {
        LinkedList linkedList = new LinkedList();
        if (!TextUtils.isEmpty(str)) {
            while (str.startsWith("/")) {
                str = str.substring(1);
            }
            while (str.endsWith("/")) {
                str = str.substring(0, str.length() - 1);
            }
            Collections.addAll(linkedList, str.split("/"));
        }
        return linkedList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int convertPort(int i8) {
        if (i8 > 0) {
            return i8;
        }
        return 80;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static m convertQuery(String str) {
        String str2;
        m.b newBuilder = m.newBuilder();
        if (!TextUtils.isEmpty(str)) {
            if (str.startsWith("?")) {
                str = str.substring(1);
            }
            for (String str3 : str.split("&")) {
                int indexOf = str3.indexOf("=");
                str2 = "";
                if (indexOf > 0) {
                    String substring = str3.substring(0, indexOf);
                    str2 = indexOf < str3.length() - 1 ? str3.substring(indexOf + 1) : "";
                    str3 = substring;
                }
                newBuilder.add(str3, (CharSequence) str2);
            }
        }
        return newBuilder.build();
    }

    public static b newBuilder(String str) {
        return new b(str);
    }

    private static String wrapFragment(String str, boolean z7) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Object[] objArr = new Object[1];
        if (z7) {
            str = Uri.encode(str);
        }
        objArr[0] = str;
        return String.format("#%s", objArr);
    }

    private static String wrapPath(List<String> list, boolean z7) {
        if (list.isEmpty()) {
            return "/";
        }
        StringBuilder sb = new StringBuilder();
        for (String str : list) {
            sb.append("/");
            if (z7) {
                str = Uri.encode(str);
            }
            sb.append(str);
        }
        return sb.toString();
    }

    private static String wrapPort(int i8) {
        return (i8 <= 0 || i8 == 80) ? "" : String.format(Locale.getDefault(), ":%d", Integer.valueOf(i8));
    }

    private static String wrapQuery(m mVar, boolean z7) {
        String mVar2 = mVar.toString(z7);
        return TextUtils.isEmpty(mVar2) ? "" : String.format("?%s", mVar2);
    }

    public b builder() {
        return newBuilder(toString());
    }

    public List<String> copyPath() {
        return convertPath(this.mPath);
    }

    @Deprecated
    public m copyQuery() {
        return getParams();
    }

    public String getFragment() {
        return this.mFragment;
    }

    public String getHost() {
        return this.mHost;
    }

    public m getParams() {
        return convertQuery(this.mQuery);
    }

    public String getPath() {
        return this.mPath;
    }

    public int getPort() {
        return this.mPort;
    }

    public String getQuery() {
        return this.mQuery;
    }

    public String getScheme() {
        return this.mScheme;
    }

    public t location(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (URLUtil.isNetworkUrl(str)) {
            return newBuilder(str).build();
        }
        URI create = URI.create(str);
        if (str.startsWith("/")) {
            return builder().setPath(create.getPath()).setQuery(create.getQuery()).setFragment(create.getFragment()).build();
        }
        if (!str.contains("../")) {
            List<String> convertPath = convertPath(getPath());
            convertPath.addAll(convertPath(create.getPath()));
            return builder().setPath(TextUtils.join("/", convertPath)).setQuery(create.getQuery()).setFragment(create.getFragment()).build();
        }
        List<String> convertPath2 = convertPath(getPath());
        List<String> convertPath3 = convertPath(create.getPath());
        List<String> subList = convertPath3.subList(convertPath3.lastIndexOf("..") + 1, convertPath3.size());
        if (convertPath2.isEmpty()) {
            return builder().setPath(TextUtils.join("/", subList)).setQuery(create.getQuery()).setFragment(create.getFragment()).build();
        }
        List<String> subList2 = convertPath2.subList(0, (convertPath2.size() - r3) - 2);
        subList2.addAll(subList);
        return builder().setPath(TextUtils.join("/", subList2)).setQuery(create.getQuery()).setFragment(create.getFragment()).build();
    }

    public String toString() {
        return toString(false);
    }

    private t(b bVar) {
        this.mScheme = bVar.mScheme;
        this.mHost = bVar.mHost;
        this.mPort = bVar.mPort;
        this.mPath = wrapPath(bVar.mPath, false);
        this.mQuery = bVar.mQuery.build().toString(false);
        this.mFragment = bVar.mFragment;
    }

    public String toString(boolean z7) {
        return this.mScheme + "://" + this.mHost + wrapPort(this.mPort) + wrapPath(convertPath(this.mPath), z7) + wrapQuery(convertQuery(this.mQuery), z7) + wrapFragment(this.mFragment, z7);
    }
}
