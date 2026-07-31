package com.iab.omid.library.startio.walking;

import android.view.View;
import com.iab.omid.library.startio.internal.e;
import com.iab.omid.library.startio.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f59a = new HashMap();
    private final HashMap b = new HashMap();
    private final HashMap c = new HashMap();
    private final HashSet d = new HashSet();
    private final HashSet e = new HashSet();
    private final HashSet f = new HashSet();
    private final HashMap g = new HashMap();
    private final HashSet h = new HashSet();
    private final Map i = new WeakHashMap();
    private boolean j;

    /* renamed from: com.iab.omid.library.startio.walking.a$a, reason: collision with other inner class name */
    public class C0017a {

        /* renamed from: a, reason: collision with root package name */
        private final e f60a;
        private final ArrayList b = new ArrayList();

        public C0017a(e eVar, String str) {
            this.f60a = eVar;
            a(str);
        }

        public e a() {
            return this.f60a;
        }

        public void a(String str) {
            this.b.add(str);
        }

        public ArrayList b() {
            return this.b;
        }
    }

    private Boolean a(View view) {
        if (view.hasWindowFocus()) {
            this.i.remove(view);
            return Boolean.FALSE;
        }
        if (this.i.containsKey(view)) {
            return (Boolean) this.i.get(view);
        }
        Map map = this.i;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    private String a(View view, boolean z) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (a(view).booleanValue() && !z) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String a2 = h.a(view);
            if (a2 != null) {
                return a2;
            }
            hashSet.add(view);
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.d.addAll(hashSet);
        return null;
    }

    private void a(com.iab.omid.library.startio.adsession.a aVar) {
        Iterator it = aVar.f().iterator();
        while (it.hasNext()) {
            a((e) it.next(), aVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a(e eVar, com.iab.omid.library.startio.adsession.a aVar) {
        View view = (View) eVar.c().get();
        if (view == null) {
            return;
        }
        C0017a c0017a = (C0017a) this.b.get(view);
        if (c0017a != null) {
            c0017a.a(aVar.c());
        } else {
            this.b.put(view, new C0017a(eVar, aVar.c()));
        }
    }

    public View a(String str) {
        return (View) this.c.get(str);
    }

    public void a() {
        this.f59a.clear();
        this.b.clear();
        this.c.clear();
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.g.clear();
        this.j = false;
        this.h.clear();
    }

    public C0017a b(View view) {
        C0017a c0017a = (C0017a) this.b.get(view);
        if (c0017a != null) {
            this.b.remove(view);
        }
        return c0017a;
    }

    public String b(String str) {
        return (String) this.g.get(str);
    }

    public HashSet b() {
        return this.f;
    }

    public String c(View view) {
        if (this.f59a.size() == 0) {
            return null;
        }
        String str = (String) this.f59a.get(view);
        if (str != null) {
            this.f59a.remove(view);
        }
        return str;
    }

    public HashSet c() {
        return this.e;
    }

    public boolean c(String str) {
        return this.h.contains(str);
    }

    public c d(View view) {
        return this.d.contains(view) ? c.PARENT_VIEW : this.j ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void d() {
        this.j = true;
    }

    public void e() {
        com.iab.omid.library.startio.internal.c c = com.iab.omid.library.startio.internal.c.c();
        if (c != null) {
            for (com.iab.omid.library.startio.adsession.a aVar : c.a()) {
                View e = aVar.e();
                if (aVar.h()) {
                    String c2 = aVar.c();
                    if (e != null) {
                        boolean e2 = h.e(e);
                        if (e2) {
                            this.h.add(c2);
                        }
                        String a2 = a(e, e2);
                        if (a2 == null) {
                            this.e.add(c2);
                            this.f59a.put(e, c2);
                            a(aVar);
                        } else if (a2 != "noWindowFocus") {
                            this.f.add(c2);
                            this.c.put(c2, e);
                            this.g.put(c2, a2);
                        }
                    } else {
                        this.f.add(c2);
                        this.g.put(c2, "noAdView");
                    }
                }
            }
        }
    }

    public boolean e(View view) {
        if (!this.i.containsKey(view)) {
            return true;
        }
        this.i.put(view, Boolean.TRUE);
        return false;
    }
}
