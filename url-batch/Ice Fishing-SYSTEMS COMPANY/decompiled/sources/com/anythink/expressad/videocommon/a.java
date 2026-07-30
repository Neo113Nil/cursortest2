package com.anythink.expressad.videocommon;

import android.text.TextUtils;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.foundation.d.d;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f22355a = "TemplateWebviewCache";

    /* renamed from: b, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0141a> f22356b = new ConcurrentHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0141a> f22357c = new ConcurrentHashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0141a> f22358d = new ConcurrentHashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0141a> f22359e = new ConcurrentHashMap<>();

    /* renamed from: f, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0141a> f22360f = new ConcurrentHashMap<>();

    /* renamed from: g, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0141a> f22361g = new ConcurrentHashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0141a> f22362h = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, C0141a> i = new ConcurrentHashMap<>();

    /* renamed from: j, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0141a> f22363j = new ConcurrentHashMap<>();

    /* renamed from: k, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0141a> f22364k = new ConcurrentHashMap<>();

    /* renamed from: com.anythink.expressad.videocommon.a$a, reason: collision with other inner class name */
    public static class C0141a {

        /* renamed from: a, reason: collision with root package name */
        private WindVaneWebView f22369a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f22370b;

        public final WindVaneWebView a() {
            return this.f22369a;
        }

        public final String b() {
            WindVaneWebView windVaneWebView = this.f22369a;
            return windVaneWebView != null ? (String) windVaneWebView.getTag() : "";
        }

        public final boolean c() {
            return this.f22370b;
        }

        public final void a(WindVaneWebView windVaneWebView) {
            this.f22369a = windVaneWebView;
        }

        public final void a(String str) {
            WindVaneWebView windVaneWebView = this.f22369a;
            if (windVaneWebView != null) {
                windVaneWebView.setTag(str);
            }
        }

        public final void a(boolean z8) {
            this.f22370b = z8;
        }
    }

    public static C0141a a(String str) {
        if (f22362h.containsKey(str)) {
            return f22362h.get(str);
        }
        if (i.containsKey(str)) {
            return i.get(str);
        }
        if (f22363j.containsKey(str)) {
            return f22363j.get(str);
        }
        if (f22364k.containsKey(str)) {
            return f22364k.get(str);
        }
        return null;
    }

    public static void b(String str) {
        if (f22362h.containsKey(str)) {
            f22362h.remove(str);
        }
        if (f22363j.containsKey(str)) {
            f22363j.remove(str);
        }
        if (i.containsKey(str)) {
            i.remove(str);
        }
        if (f22364k.containsKey(str)) {
            f22364k.remove(str);
        }
    }

    public static void c(String str) {
        if (TextUtils.isEmpty(str)) {
            f22362h.clear();
        } else {
            for (String str2 : f22362h.keySet()) {
                if (!TextUtils.isEmpty(str2) && str2.startsWith(str)) {
                    f22362h.remove(str2);
                }
            }
        }
        i.clear();
    }

    public static void d(String str) {
        for (Map.Entry<String, C0141a> entry : f22362h.entrySet()) {
            if (entry.getKey().contains(str)) {
                f22362h.remove(entry.getKey());
            }
        }
    }

    public static void e(String str) {
        for (Map.Entry<String, C0141a> entry : i.entrySet()) {
            if (entry.getKey().contains(str)) {
                i.remove(entry.getKey());
            }
        }
    }

    private static void f(String str) {
        for (Map.Entry<String, C0141a> entry : f22363j.entrySet()) {
            if (entry.getKey().startsWith(str)) {
                f22363j.remove(entry.getKey());
            }
        }
    }

    private static void g(String str) {
        for (Map.Entry<String, C0141a> entry : f22364k.entrySet()) {
            if (entry.getKey().startsWith(str)) {
                f22364k.remove(entry.getKey());
            }
        }
    }

    private static void c() {
        f22362h.clear();
    }

    public static void a(String str, C0141a c0141a, boolean z8, boolean z9) {
        if (z8) {
            if (z9) {
                i.put(str, c0141a);
                return;
            } else {
                f22362h.put(str, c0141a);
                return;
            }
        }
        if (z9) {
            f22364k.put(str, c0141a);
        } else {
            f22363j.put(str, c0141a);
        }
    }

    public static void b() {
        f22363j.clear();
        f22364k.clear();
    }

    public static void b(int i4, d dVar) {
        if (dVar == null) {
            return;
        }
        try {
            String ac = dVar.ac();
            if (i4 == 94) {
                if (dVar.B()) {
                    ConcurrentHashMap<String, C0141a> concurrentHashMap = f22357c;
                    if (concurrentHashMap != null) {
                        concurrentHashMap.remove(ac);
                        return;
                    }
                    return;
                }
                ConcurrentHashMap<String, C0141a> concurrentHashMap2 = f22360f;
                if (concurrentHashMap2 != null) {
                    concurrentHashMap2.remove(ac);
                    return;
                }
                return;
            }
            if (i4 != 287) {
                ConcurrentHashMap<String, C0141a> concurrentHashMap3 = f22356b;
                if (concurrentHashMap3 != null) {
                    concurrentHashMap3.remove(ac);
                    return;
                }
                return;
            }
            if (dVar.B()) {
                ConcurrentHashMap<String, C0141a> concurrentHashMap4 = f22358d;
                if (concurrentHashMap4 != null) {
                    concurrentHashMap4.remove(ac);
                    return;
                }
                return;
            }
            ConcurrentHashMap<String, C0141a> concurrentHashMap5 = f22361g;
            if (concurrentHashMap5 != null) {
                concurrentHashMap5.remove(ac);
            }
        } catch (Exception e6) {
            if (com.anythink.expressad.a.f17776a) {
                e6.printStackTrace();
            }
        }
    }

    public static void a() {
        f22362h.clear();
        i.clear();
    }

    private static void a(String str, boolean z8, boolean z9) {
        if (z8) {
            if (z9) {
                for (Map.Entry<String, C0141a> entry : i.entrySet()) {
                    if (entry.getKey().startsWith(str)) {
                        i.remove(entry.getKey());
                    }
                }
                return;
            }
            for (Map.Entry<String, C0141a> entry2 : f22362h.entrySet()) {
                if (entry2.getKey().startsWith(str)) {
                    f22362h.remove(entry2.getKey());
                }
            }
            return;
        }
        if (z9) {
            for (Map.Entry<String, C0141a> entry3 : f22364k.entrySet()) {
                if (entry3.getKey().startsWith(str)) {
                    f22364k.remove(entry3.getKey());
                }
            }
            return;
        }
        for (Map.Entry<String, C0141a> entry4 : f22363j.entrySet()) {
            if (entry4.getKey().startsWith(str)) {
                f22363j.remove(entry4.getKey());
            }
        }
    }

    public static void b(int i4) {
        try {
            if (i4 == 94) {
                ConcurrentHashMap<String, C0141a> concurrentHashMap = f22360f;
                if (concurrentHashMap != null) {
                    concurrentHashMap.clear();
                    return;
                }
                return;
            }
            if (i4 != 287) {
                ConcurrentHashMap<String, C0141a> concurrentHashMap2 = f22356b;
                if (concurrentHashMap2 != null) {
                    concurrentHashMap2.clear();
                    return;
                }
                return;
            }
            ConcurrentHashMap<String, C0141a> concurrentHashMap3 = f22361g;
            if (concurrentHashMap3 != null) {
                concurrentHashMap3.clear();
            }
        } catch (Exception e6) {
            if (com.anythink.expressad.a.f17776a) {
                e6.printStackTrace();
            }
        }
    }

    public static C0141a a(int i4, d dVar) {
        if (dVar == null) {
            return null;
        }
        try {
            String ac = dVar.ac();
            if (i4 != 94) {
                if (i4 != 287) {
                    ConcurrentHashMap<String, C0141a> concurrentHashMap = f22356b;
                    if (concurrentHashMap != null && concurrentHashMap.size() > 0) {
                        return f22356b.get(ac);
                    }
                } else if (dVar.B()) {
                    ConcurrentHashMap<String, C0141a> concurrentHashMap2 = f22358d;
                    if (concurrentHashMap2 != null && concurrentHashMap2.size() > 0) {
                        return f22358d.get(ac);
                    }
                } else {
                    ConcurrentHashMap<String, C0141a> concurrentHashMap3 = f22361g;
                    if (concurrentHashMap3 != null && concurrentHashMap3.size() > 0) {
                        return f22361g.get(ac);
                    }
                }
            } else if (dVar.B()) {
                ConcurrentHashMap<String, C0141a> concurrentHashMap4 = f22357c;
                if (concurrentHashMap4 != null && concurrentHashMap4.size() > 0) {
                    return f22357c.get(ac);
                }
            } else {
                ConcurrentHashMap<String, C0141a> concurrentHashMap5 = f22360f;
                if (concurrentHashMap5 != null && concurrentHashMap5.size() > 0) {
                    return f22360f.get(ac);
                }
            }
        } catch (Exception e6) {
            if (com.anythink.expressad.a.f17776a) {
                e6.printStackTrace();
            }
        }
        return null;
    }

    public static void b(int i4, String str, C0141a c0141a) {
        try {
            if (i4 == 94) {
                if (f22360f == null) {
                    f22360f = new ConcurrentHashMap<>();
                }
                f22360f.put(str, c0141a);
            } else if (i4 != 287) {
                if (f22356b == null) {
                    f22356b = new ConcurrentHashMap<>();
                }
                f22356b.put(str, c0141a);
            } else {
                if (f22361g == null) {
                    f22361g = new ConcurrentHashMap<>();
                }
                f22361g.put(str, c0141a);
            }
        } catch (Exception e6) {
            if (com.anythink.expressad.a.f17776a) {
                e6.printStackTrace();
            }
        }
    }

    private static ConcurrentHashMap<String, C0141a> a(int i4, boolean z8) {
        if (i4 == 94) {
            return z8 ? f22357c : f22360f;
        }
        if (i4 != 287) {
            return f22356b;
        }
        return z8 ? f22358d : f22361g;
    }

    public static void a(int i4) {
        ConcurrentHashMap<String, C0141a> concurrentHashMap;
        try {
            if (i4 != 94) {
                if (i4 == 287 && (concurrentHashMap = f22358d) != null) {
                    concurrentHashMap.clear();
                    return;
                }
                return;
            }
            ConcurrentHashMap<String, C0141a> concurrentHashMap2 = f22357c;
            if (concurrentHashMap2 != null) {
                concurrentHashMap2.clear();
            }
        } catch (Exception e6) {
            if (com.anythink.expressad.a.f17776a) {
                e6.printStackTrace();
            }
        }
    }

    public static void a(int i4, String str, C0141a c0141a) {
        try {
            if (i4 == 94) {
                if (f22357c == null) {
                    f22357c = new ConcurrentHashMap<>();
                }
                f22357c.put(str, c0141a);
            } else {
                if (i4 != 287) {
                    return;
                }
                if (f22358d == null) {
                    f22358d = new ConcurrentHashMap<>();
                }
                f22358d.put(str, c0141a);
            }
        } catch (Exception e6) {
            if (com.anythink.expressad.a.f17776a) {
                e6.printStackTrace();
            }
        }
    }
}
