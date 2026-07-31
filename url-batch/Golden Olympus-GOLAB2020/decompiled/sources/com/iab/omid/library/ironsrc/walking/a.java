package com.iab.omid.library.ironsrc.walking;

import android.view.View;
import com.iab.omid.library.ironsrc.internal.e;
import com.iab.omid.library.ironsrc.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f14608a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0143a> f14609b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f14610c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final HashSet<View> f14611d = new HashSet<>();

    /* renamed from: e, reason: collision with root package name */
    private final HashSet<String> f14612e = new HashSet<>();

    /* renamed from: f, reason: collision with root package name */
    private final HashSet<String> f14613f = new HashSet<>();

    /* renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f14614g = new HashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private final HashSet<String> f14615h = new HashSet<>();

    /* renamed from: i, reason: collision with root package name */
    private final Map<View, Boolean> f14616i = new WeakHashMap();

    /* renamed from: j, reason: collision with root package name */
    private boolean f14617j;

    /* renamed from: com.iab.omid.library.ironsrc.walking.a$a, reason: collision with other inner class name */
    public static class C0143a {

        /* renamed from: a, reason: collision with root package name */
        private final e f14618a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f14619b = new ArrayList<>();

        public C0143a(e eVar, String str) {
            this.f14618a = eVar;
            a(str);
        }

        public e a() {
            return this.f14618a;
        }

        public ArrayList<String> b() {
            return this.f14619b;
        }

        public void a(String str) {
            this.f14619b.add(str);
        }
    }

    public View a(String str) {
        return this.f14610c.get(str);
    }

    public C0143a b(View view) {
        C0143a c0143a = this.f14609b.get(view);
        if (c0143a != null) {
            this.f14609b.remove(view);
        }
        return c0143a;
    }

    public String c(View view) {
        if (this.f14608a.size() == 0) {
            return null;
        }
        String str = this.f14608a.get(view);
        if (str != null) {
            this.f14608a.remove(view);
        }
        return str;
    }

    public c d(View view) {
        return this.f14611d.contains(view) ? c.PARENT_VIEW : this.f14617j ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void e() {
        com.iab.omid.library.ironsrc.internal.c c4 = com.iab.omid.library.ironsrc.internal.c.c();
        if (c4 != null) {
            for (com.iab.omid.library.ironsrc.adsession.a aVar : c4.a()) {
                View c5 = aVar.c();
                if (aVar.f()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (c5 != null) {
                        boolean e4 = h.e(c5);
                        if (e4) {
                            this.f14615h.add(adSessionId);
                        }
                        String a4 = a(c5, e4);
                        if (a4 == null) {
                            this.f14612e.add(adSessionId);
                            this.f14608a.put(c5, adSessionId);
                            a(aVar);
                        } else if (a4 != "noWindowFocus") {
                            this.f14613f.add(adSessionId);
                            this.f14610c.put(adSessionId, c5);
                            this.f14614g.put(adSessionId, a4);
                        }
                    } else {
                        this.f14613f.add(adSessionId);
                        this.f14614g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    private Boolean a(View view) {
        if (view.hasWindowFocus()) {
            this.f14616i.remove(view);
            return Boolean.FALSE;
        }
        if (this.f14616i.containsKey(view)) {
            return this.f14616i.get(view);
        }
        Map<View, Boolean> map = this.f14616i;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public String b(String str) {
        return this.f14614g.get(str);
    }

    public HashSet<String> c() {
        return this.f14612e;
    }

    public void d() {
        this.f14617j = true;
    }

    public boolean e(View view) {
        if (!this.f14616i.containsKey(view)) {
            return true;
        }
        this.f14616i.put(view, Boolean.TRUE);
        return false;
    }

    private String a(View view, boolean z4) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (a(view).booleanValue() && !z4) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String a4 = h.a(view);
            if (a4 != null) {
                return a4;
            }
            hashSet.add(view);
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f14611d.addAll(hashSet);
        return null;
    }

    public HashSet<String> b() {
        return this.f14613f;
    }

    public boolean c(String str) {
        return this.f14615h.contains(str);
    }

    public void a() {
        this.f14608a.clear();
        this.f14609b.clear();
        this.f14610c.clear();
        this.f14611d.clear();
        this.f14612e.clear();
        this.f14613f.clear();
        this.f14614g.clear();
        this.f14617j = false;
        this.f14615h.clear();
    }

    private void a(com.iab.omid.library.ironsrc.adsession.a aVar) {
        Iterator<e> it = aVar.d().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.ironsrc.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0143a c0143a = this.f14609b.get(view);
        if (c0143a != null) {
            c0143a.a(aVar.getAdSessionId());
        } else {
            this.f14609b.put(view, new C0143a(eVar, aVar.getAdSessionId()));
        }
    }
}
