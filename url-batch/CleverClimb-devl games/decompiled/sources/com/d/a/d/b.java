package com.d.a.d;

import android.net.Uri;
import android.support.v4.util.ArrayMap;
import com.cmplay.base.util.webview.util.NetworkUtil;
import com.mopub.common.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Request.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final String f4451a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4452b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, String> f4453c = new ArrayMap();

    /* renamed from: d, reason: collision with root package name */
    private int f4454d = NetworkUtil.NATIVE_ERROR;

    public b(String str, String str2, String str3) {
        if (str == null || str.isEmpty()) {
            throw new NullPointerException("Url cannot be null or empty");
        }
        if (str2 == null || str2.isEmpty()) {
            throw new NullPointerException("directory path cannot be null or empty");
        }
        if (str3 == null || str3.isEmpty()) {
            throw new NullPointerException("File Name cannot be null or empty");
        }
        String scheme = Uri.parse(str).getScheme();
        if (scheme == null || (!scheme.equals(Constants.HTTP) && !scheme.equals(Constants.HTTPS))) {
            throw new IllegalArgumentException("Can only download HTTP/HTTPS URIs: " + str);
        }
        this.f4451a = str;
        this.f4452b = a(a(str2, str3));
    }

    public String a() {
        return this.f4451a;
    }

    public String b() {
        return this.f4452b;
    }

    public List<a> c() {
        ArrayList arrayList = new ArrayList(this.f4453c.size());
        for (String str : this.f4453c.keySet()) {
            arrayList.add(new a(str, this.f4453c.get(str)));
        }
        return arrayList;
    }

    public int d() {
        return this.f4454d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<a> it = c().iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            sb.append(",");
        }
        if (this.f4453c.size() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return "{url:" + this.f4451a + " ,filePath:" + this.f4452b + ",headers:{" + sb.toString() + "},priority:" + this.f4454d + "}";
    }

    private static String a(String str, String str2) {
        if (Uri.parse(str2).getPathSegments().size() != 1) {
            return str2;
        }
        return str + "/" + str2;
    }

    private static String a(String str) {
        return str.replace("//", "/");
    }
}
