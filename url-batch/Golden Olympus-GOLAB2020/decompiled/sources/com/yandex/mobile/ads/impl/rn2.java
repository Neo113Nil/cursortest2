package com.yandex.mobile.ads.impl;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class rn2 {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f31308a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<View, a> f31309b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f31310c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final HashSet<View> f31311d = new HashSet<>();

    /* renamed from: e, reason: collision with root package name */
    private final HashSet<String> f31312e = new HashSet<>();

    /* renamed from: f, reason: collision with root package name */
    private final HashSet<String> f31313f = new HashSet<>();

    /* renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f31314g = new HashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private final WeakHashMap f31315h = new WeakHashMap();

    /* renamed from: i, reason: collision with root package name */
    private boolean f31316i;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final do2 f31317a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f31318b = new ArrayList<>();

        public a(do2 do2Var, String str) {
            this.f31317a = do2Var;
            a(str);
        }

        public final do2 a() {
            return this.f31317a;
        }

        public final ArrayList<String> b() {
            return this.f31318b;
        }

        public final void a(String str) {
            this.f31318b.add(str);
        }
    }

    public final String a(View view) {
        if (this.f31308a.size() == 0) {
            return null;
        }
        String str = this.f31308a.get(view);
        if (str != null) {
            this.f31308a.remove(view);
        }
        return str;
    }

    public final View b(String str) {
        return this.f31310c.get(str);
    }

    public final int c(View view) {
        if (this.f31311d.contains(view)) {
            return 1;
        }
        return this.f31316i ? 2 : 3;
    }

    public final void d() {
        this.f31308a.clear();
        this.f31309b.clear();
        this.f31310c.clear();
        this.f31311d.clear();
        this.f31312e.clear();
        this.f31313f.clear();
        this.f31314g.clear();
        this.f31316i = false;
    }

    public final void e() {
        this.f31316i = true;
    }

    public final String a(String str) {
        return this.f31314g.get(str);
    }

    public final a b(View view) {
        a aVar = this.f31309b.get(view);
        if (aVar != null) {
            this.f31309b.remove(view);
        }
        return aVar;
    }

    public final void c() {
        Boolean bool;
        String str;
        mn2 a4 = mn2.a();
        if (a4 != null) {
            for (ln2 ln2Var : a4.c()) {
                View f4 = ln2Var.f();
                if (ln2Var.g()) {
                    String i4 = ln2Var.i();
                    if (f4 != null) {
                        if (f4.isAttachedToWindow()) {
                            if (f4.hasWindowFocus()) {
                                this.f31315h.remove(f4);
                                bool = Boolean.FALSE;
                            } else if (this.f31315h.containsKey(f4)) {
                                bool = (Boolean) this.f31315h.get(f4);
                            } else {
                                WeakHashMap weakHashMap = this.f31315h;
                                Boolean bool2 = Boolean.FALSE;
                                weakHashMap.put(f4, bool2);
                                bool = bool2;
                            }
                            if (!bool.booleanValue()) {
                                HashSet hashSet = new HashSet();
                                View view = f4;
                                while (true) {
                                    if (view == null) {
                                        this.f31311d.addAll(hashSet);
                                        str = null;
                                        break;
                                    }
                                    String c4 = qo2.c(view);
                                    if (c4 != null) {
                                        str = c4;
                                        break;
                                    } else {
                                        hashSet.add(view);
                                        Object parent = view.getParent();
                                        view = parent instanceof View ? (View) parent : null;
                                    }
                                }
                            } else {
                                str = "noWindowFocus";
                            }
                        } else {
                            str = "notAttached";
                        }
                        if (str == null) {
                            this.f31312e.add(i4);
                            this.f31308a.put(f4, i4);
                            ArrayList c5 = ln2Var.c();
                            int size = c5.size();
                            int i5 = 0;
                            while (i5 < size) {
                                Object obj = c5.get(i5);
                                i5++;
                                do2 do2Var = (do2) obj;
                                View view2 = do2Var.a().get();
                                if (view2 != null) {
                                    a aVar = this.f31309b.get(view2);
                                    if (aVar != null) {
                                        aVar.a(ln2Var.i());
                                    } else {
                                        this.f31309b.put(view2, new a(do2Var, ln2Var.i()));
                                    }
                                }
                            }
                        } else if (str != "noWindowFocus") {
                            this.f31313f.add(i4);
                            this.f31310c.put(i4, f4);
                            this.f31314g.put(i4, str);
                        }
                    } else {
                        this.f31313f.add(i4);
                        this.f31314g.put(i4, "noAdView");
                    }
                }
            }
        }
    }

    public final boolean d(View view) {
        if (!this.f31315h.containsKey(view)) {
            return true;
        }
        this.f31315h.put(view, Boolean.TRUE);
        return false;
    }

    public final HashSet<String> a() {
        return this.f31312e;
    }

    public final HashSet<String> b() {
        return this.f31313f;
    }
}
