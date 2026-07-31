package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class kz {

    /* renamed from: a, reason: collision with root package name */
    private final Date f7738a;

    /* renamed from: b, reason: collision with root package name */
    private final String f7739b;

    /* renamed from: c, reason: collision with root package name */
    private final List<String> f7740c;

    /* renamed from: d, reason: collision with root package name */
    private final int f7741d;

    /* renamed from: e, reason: collision with root package name */
    private final Set<String> f7742e;

    /* renamed from: f, reason: collision with root package name */
    private final Location f7743f;

    /* renamed from: g, reason: collision with root package name */
    private final Bundle f7744g;

    /* renamed from: h, reason: collision with root package name */
    private final Map<Class<Object>, Object> f7745h;

    /* renamed from: i, reason: collision with root package name */
    private final String f7746i;

    /* renamed from: j, reason: collision with root package name */
    private final String f7747j;

    /* renamed from: k, reason: collision with root package name */
    private final k3.a f7748k;

    /* renamed from: l, reason: collision with root package name */
    private final int f7749l;

    /* renamed from: m, reason: collision with root package name */
    private final Set<String> f7750m;

    /* renamed from: n, reason: collision with root package name */
    private final Bundle f7751n;

    /* renamed from: o, reason: collision with root package name */
    private final Set<String> f7752o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f7753p;

    /* renamed from: q, reason: collision with root package name */
    private final h3.a f7754q;

    /* renamed from: r, reason: collision with root package name */
    private final String f7755r;

    /* renamed from: s, reason: collision with root package name */
    private final int f7756s;

    public kz(jz jzVar, k3.a aVar) {
        Date date;
        String str;
        List<String> list;
        int i7;
        HashSet hashSet;
        Location location;
        Bundle bundle;
        HashMap hashMap;
        String str2;
        String str3;
        int i8;
        HashSet hashSet2;
        Bundle bundle2;
        HashSet hashSet3;
        boolean z6;
        String str4;
        int i9;
        h3.a unused;
        date = jzVar.f7294g;
        this.f7738a = date;
        str = jzVar.f7295h;
        this.f7739b = str;
        list = jzVar.f7296i;
        this.f7740c = list;
        i7 = jzVar.f7297j;
        this.f7741d = i7;
        hashSet = jzVar.f7288a;
        this.f7742e = Collections.unmodifiableSet(hashSet);
        location = jzVar.f7298k;
        this.f7743f = location;
        bundle = jzVar.f7289b;
        this.f7744g = bundle;
        hashMap = jzVar.f7290c;
        this.f7745h = Collections.unmodifiableMap(hashMap);
        str2 = jzVar.f7299l;
        this.f7746i = str2;
        str3 = jzVar.f7300m;
        this.f7747j = str3;
        i8 = jzVar.f7301n;
        this.f7749l = i8;
        hashSet2 = jzVar.f7291d;
        this.f7750m = Collections.unmodifiableSet(hashSet2);
        bundle2 = jzVar.f7292e;
        this.f7751n = bundle2;
        hashSet3 = jzVar.f7293f;
        this.f7752o = Collections.unmodifiableSet(hashSet3);
        z6 = jzVar.f7302o;
        this.f7753p = z6;
        unused = jzVar.f7303p;
        str4 = jzVar.f7304q;
        this.f7755r = str4;
        i9 = jzVar.f7305r;
        this.f7756s = i9;
    }

    @Deprecated
    public final int a() {
        return this.f7741d;
    }

    public final int b() {
        return this.f7756s;
    }

    public final int c() {
        return this.f7749l;
    }

    public final Location d() {
        return this.f7743f;
    }

    public final Bundle e() {
        return this.f7751n;
    }

    public final Bundle f(Class<Object> cls) {
        return this.f7744g.getBundle(cls.getName());
    }

    public final Bundle g() {
        return this.f7744g;
    }

    public final h3.a h() {
        return this.f7754q;
    }

    public final k3.a i() {
        return this.f7748k;
    }

    public final String j() {
        return this.f7755r;
    }

    public final String k() {
        return this.f7739b;
    }

    public final String l() {
        return this.f7746i;
    }

    public final String m() {
        return this.f7747j;
    }

    @Deprecated
    public final Date n() {
        return this.f7738a;
    }

    public final List<String> o() {
        return new ArrayList(this.f7740c);
    }

    public final Map<Class<Object>, Object> p() {
        return this.f7745h;
    }

    public final Set<String> q() {
        return this.f7752o;
    }

    public final Set<String> r() {
        return this.f7742e;
    }

    @Deprecated
    public final boolean s() {
        return this.f7753p;
    }

    public final boolean t(Context context) {
        r2.u b7 = uz.e().b();
        qw.b();
        String t6 = bo0.t(context);
        return this.f7750m.contains(t6) || b7.d().contains(t6);
    }
}
