package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class xz2 {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f14436a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<View, wz2> f14437b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f14438c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final HashSet<View> f14439d = new HashSet<>();

    /* renamed from: e, reason: collision with root package name */
    private final HashSet<String> f14440e = new HashSet<>();

    /* renamed from: f, reason: collision with root package name */
    private final HashSet<String> f14441f = new HashSet<>();

    /* renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f14442g = new HashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private boolean f14443h;

    public final View a(String str) {
        return this.f14438c.get(str);
    }

    public final wz2 b(View view) {
        wz2 wz2Var = this.f14437b.get(view);
        if (wz2Var != null) {
            this.f14437b.remove(view);
        }
        return wz2Var;
    }

    public final String c(String str) {
        return this.f14442g.get(str);
    }

    public final String d(View view) {
        if (this.f14436a.size() == 0) {
            return null;
        }
        String str = this.f14436a.get(view);
        if (str != null) {
            this.f14436a.remove(view);
        }
        return str;
    }

    public final HashSet<String> e() {
        return this.f14441f;
    }

    public final HashSet<String> f() {
        return this.f14440e;
    }

    public final void g() {
        this.f14436a.clear();
        this.f14437b.clear();
        this.f14438c.clear();
        this.f14439d.clear();
        this.f14440e.clear();
        this.f14441f.clear();
        this.f14442g.clear();
        this.f14443h = false;
    }

    public final void h() {
        this.f14443h = true;
    }

    public final void i() {
        az2 a7 = az2.a();
        if (a7 != null) {
            for (py2 py2Var : a7.b()) {
                View f7 = py2Var.f();
                if (py2Var.j()) {
                    String h7 = py2Var.h();
                    if (f7 != null) {
                        String str = null;
                        if (f7.hasWindowFocus()) {
                            HashSet hashSet = new HashSet();
                            View view = f7;
                            while (true) {
                                if (view == null) {
                                    this.f14439d.addAll(hashSet);
                                    break;
                                }
                                String b7 = vz2.b(view);
                                if (b7 != null) {
                                    str = b7;
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
                        if (str == null) {
                            this.f14440e.add(h7);
                            this.f14436a.put(f7, h7);
                            for (dz2 dz2Var : py2Var.i()) {
                                View view2 = dz2Var.b().get();
                                if (view2 != null) {
                                    wz2 wz2Var = this.f14437b.get(view2);
                                    if (wz2Var != null) {
                                        wz2Var.c(py2Var.h());
                                    } else {
                                        this.f14437b.put(view2, new wz2(dz2Var, py2Var.h()));
                                    }
                                }
                            }
                        } else {
                            this.f14441f.add(h7);
                            this.f14438c.put(h7, f7);
                            this.f14442g.put(h7, str);
                        }
                    } else {
                        this.f14441f.add(h7);
                        this.f14442g.put(h7, "noAdView");
                    }
                }
            }
        }
    }

    public final int j(View view) {
        if (this.f14439d.contains(view)) {
            return 1;
        }
        return this.f14443h ? 2 : 3;
    }
}
