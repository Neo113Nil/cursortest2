package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class jz {

    /* renamed from: g, reason: collision with root package name */
    private Date f7294g;

    /* renamed from: h, reason: collision with root package name */
    private String f7295h;

    /* renamed from: k, reason: collision with root package name */
    private Location f7298k;

    /* renamed from: l, reason: collision with root package name */
    private String f7299l;

    /* renamed from: m, reason: collision with root package name */
    private String f7300m;

    /* renamed from: o, reason: collision with root package name */
    private boolean f7302o;

    /* renamed from: p, reason: collision with root package name */
    private h3.a f7303p;

    /* renamed from: q, reason: collision with root package name */
    private String f7304q;

    /* renamed from: a, reason: collision with root package name */
    private final HashSet<String> f7288a = new HashSet<>();

    /* renamed from: b, reason: collision with root package name */
    private final Bundle f7289b = new Bundle();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<Class<Object>, Object> f7290c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final HashSet<String> f7291d = new HashSet<>();

    /* renamed from: e, reason: collision with root package name */
    private final Bundle f7292e = new Bundle();

    /* renamed from: f, reason: collision with root package name */
    private final HashSet<String> f7293f = new HashSet<>();

    /* renamed from: i, reason: collision with root package name */
    private final List<String> f7296i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    private int f7297j = -1;

    /* renamed from: n, reason: collision with root package name */
    private int f7301n = -1;

    /* renamed from: r, reason: collision with root package name */
    private int f7305r = 60000;

    public final void C(String str, String str2) {
        this.f7292e.putString(str, str2);
    }

    public final void D(String str) {
        this.f7288a.add(str);
    }

    public final void E(Class<Object> cls, Bundle bundle) {
        this.f7289b.putBundle(cls.getName(), bundle);
    }

    public final void F(String str) {
        this.f7291d.add(str);
    }

    public final void G(String str) {
        this.f7291d.remove("B3EEABB8EE11C2BE770B684D95219ECB");
    }

    @Deprecated
    public final void a(Date date) {
        this.f7294g = date;
    }

    public final void b(String str) {
        this.f7295h = str;
    }

    @Deprecated
    public final void c(int i7) {
        this.f7297j = i7;
    }

    public final void d(int i7) {
        this.f7305r = i7;
    }

    @Deprecated
    public final void e(boolean z6) {
        this.f7302o = z6;
    }

    public final void f(Location location) {
        this.f7298k = location;
    }

    public final void g(List<String> list) {
        this.f7296i.clear();
        for (String str : list) {
            if (TextUtils.isEmpty(str)) {
                io0.g("neighboring content URL should not be null or empty");
            } else {
                this.f7296i.add(str);
            }
        }
    }

    public final void h(String str) {
        this.f7299l = str;
    }

    public final void i(String str) {
        this.f7300m = str;
    }

    @Deprecated
    public final void j(boolean z6) {
        this.f7301n = z6 ? 1 : 0;
    }
}
