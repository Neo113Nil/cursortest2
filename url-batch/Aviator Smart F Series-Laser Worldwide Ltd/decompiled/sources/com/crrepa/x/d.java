package com.crrepa.x;

import android.text.TextUtils;
import cn.hutool.core.util.l;
import com.baidu.mapapi.http.wrapper.HttpManager;
import com.crrepa.ble.util.BleLog;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private Thread f13993a;

    class a implements Runnable {

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f13994h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Map f13995i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Map f13996j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ com.crrepa.y.a f13997k;

        a(String str, Map map, Map map2, com.crrepa.y.a aVar) {
            this.f13994h = str;
            this.f13995i = map;
            this.f13996j = map2;
            this.f13997k = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.crrepa.x.c a8 = new com.crrepa.x.b().a(d.this.a(this.f13994h, (Map<String, String>) this.f13995i), this.f13996j);
            if (a8.f13990c == 200) {
                this.f13997k.onSeccess(a8);
            } else {
                this.f13997k.onError(a8);
            }
        }
    }

    class b implements Runnable {

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f13999h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Map f14000i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f14001j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Map f14002k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ com.crrepa.y.a f14003l;

        b(String str, Map map, String str2, Map map2, com.crrepa.y.a aVar) {
            this.f13999h = str;
            this.f14000i = map;
            this.f14001j = str2;
            this.f14002k = map2;
            this.f14003l = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.crrepa.x.c a8 = new com.crrepa.x.b().a(this.f13999h, d.this.a((Map<String, String>) this.f14000i, this.f14001j), d.this.b(this.f14000i, this.f14001j), this.f14002k);
            if (a8.f13990c == 200) {
                this.f14003l.onSeccess(a8);
            } else {
                this.f14003l.onError(a8);
            }
        }
    }

    class c implements Runnable {

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f14005h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ File f14006i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ List f14007j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Map f14008k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ String f14009l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ String f14010m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ Map f14011n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Map f14012o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ com.crrepa.y.a f14013p;

        c(String str, File file, List list, Map map, String str2, String str3, Map map2, Map map3, com.crrepa.y.a aVar) {
            this.f14005h = str;
            this.f14006i = file;
            this.f14007j = list;
            this.f14008k = map;
            this.f14009l = str2;
            this.f14010m = str3;
            this.f14011n = map2;
            this.f14012o = map3;
            this.f14013p = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.crrepa.x.c a8 = new com.crrepa.x.b().a(this.f14005h, this.f14006i, this.f14007j, this.f14008k, this.f14009l, this.f14010m, this.f14011n, this.f14012o, this.f14013p);
            if (a8.f13990c == 200) {
                this.f14013p.onSeccess(a8);
            } else {
                this.f14013p.onError(a8);
            }
        }
    }

    d(String str, File file, List<File> list, Map<String, File> map, String str2, String str3, Map<String, String> map2, Map<String, String> map3, com.crrepa.y.a aVar) {
        a(str, file, list, map, str2, str3, map2, map3, aVar);
    }

    d(String str, String str2, Map<String, String> map, com.crrepa.y.a aVar) {
        a(str, null, str2, map, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b(Map<String, String> map, String str) {
        if (map == null && !TextUtils.isEmpty(str)) {
            return "application/json;charset=utf-8";
        }
        return null;
    }

    d(String str, String str2, Map<String, String> map, Map<String, String> map2, com.crrepa.y.a aVar) {
        str.hashCode();
        if (str.equals(HttpManager.HTTP_GET)) {
            a(str2, map, map2, aVar);
        } else if (str.equals(HttpManager.HTTP_POST)) {
            a(str2, map, null, map2, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str, Map<String, String> map) {
        if (map != null) {
            String str2 = str + "?";
            for (String str3 : map.keySet()) {
                str2 = str2 + str3 + "=" + map.get(str3) + "&";
            }
            str = str2.substring(0, str2.length() - 1);
        }
        BleLog.d("url: " + str);
        return str;
    }

    private String a(Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        try {
            boolean z7 = true;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (z7) {
                    z7 = false;
                } else {
                    sb.append("&");
                }
                sb.append(URLEncoder.encode(entry.getKey(), l.UTF_8));
                sb.append("=");
                sb.append(URLEncoder.encode(entry.getValue(), l.UTF_8));
            }
            return sb.toString();
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(Map<String, String> map, String str) {
        if (map != null) {
            return a(map);
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    void a() {
        Thread thread = this.f13993a;
        if (thread != null) {
            thread.start();
        }
    }

    private void a(String str, File file, List<File> list, Map<String, File> map, String str2, String str3, Map<String, String> map2, Map<String, String> map3, com.crrepa.y.a aVar) {
        this.f13993a = new Thread(new c(str, file, list, map, str2, str3, map2, map3, aVar));
    }

    private void a(String str, Map<String, String> map, String str2, Map<String, String> map2, com.crrepa.y.a aVar) {
        this.f13993a = new Thread(new b(str, map, str2, map2, aVar));
    }

    private void a(String str, Map<String, String> map, Map<String, String> map2, com.crrepa.y.a aVar) {
        this.f13993a = new Thread(new a(str, map, map2, aVar));
    }
}
