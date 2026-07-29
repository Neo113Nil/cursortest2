package com.chartboost.sdk.impl;

import android.app.Application;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    static List<String> f3854a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    static HashMap<String, p> f3855b = new HashMap<>();

    static boolean b() {
        return true;
    }

    public static void a() {
        f3854a.clear();
        if (b()) {
            f3854a.add("moat");
        }
    }

    public static void a(List<String> list) {
        for (String str : list) {
            if (f3854a.contains(str) && !f3855b.containsKey(str)) {
                f3855b.put(str, null);
            }
        }
    }

    public static void a(Application application, boolean z, boolean z2, boolean z3) {
        for (String str : f3855b.keySet()) {
            if (str.contains("moat")) {
                if (f3855b.get(str) != null) {
                    f3855b.get(str).b();
                }
                r rVar = new r();
                rVar.a(application, z, z2, z3);
                f3855b.put("moat", rVar);
            }
        }
    }

    public static void a(WebView webView, HashSet<String> hashSet) {
        Iterator<String> it = hashSet.iterator();
        while (it.hasNext()) {
            p pVar = f3855b.get(it.next());
            if (pVar != null) {
                pVar.a(webView);
            }
        }
    }

    public static void c() {
        for (p pVar : f3855b.values()) {
            if (pVar != null) {
                pVar.a();
            }
        }
    }

    public static void d() {
        Iterator<String> it = f3855b.keySet().iterator();
        while (it.hasNext()) {
            p pVar = f3855b.get(it.next());
            if (pVar != null) {
                pVar.b();
            }
        }
    }

    public static JSONArray e() {
        JSONArray jSONArray = new JSONArray();
        if (f3854a != null) {
            Iterator<String> it = f3854a.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
        }
        return jSONArray;
    }

    public static JSONArray f() {
        JSONArray jSONArray = new JSONArray();
        if (f3855b != null) {
            Iterator<String> it = f3855b.keySet().iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
        }
        return jSONArray;
    }

    public static String a(HashSet<String> hashSet) {
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = hashSet.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (f3855b.get(next) != null) {
                jSONArray.put(next);
            }
        }
        return jSONArray.toString();
    }
}
