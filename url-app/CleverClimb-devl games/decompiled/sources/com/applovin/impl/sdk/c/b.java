package com.applovin.impl.sdk.c;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
class b {
    static final b A;
    private static final Set<String> C = new HashSet(31);

    /* renamed from: a, reason: collision with root package name */
    static final b f3020a;

    /* renamed from: b, reason: collision with root package name */
    static final b f3021b;

    /* renamed from: c, reason: collision with root package name */
    static final b f3022c;

    /* renamed from: d, reason: collision with root package name */
    static final b f3023d;
    static final b e;
    static final b f;
    static final b g;
    static final b h;
    static final b i;
    static final b j;
    static final b k;
    static final b l;
    static final b m;
    static final b n;
    static final b o;
    static final b p;
    static final b q;
    static final b r;
    static final b s;
    static final b t;
    static final b u;
    static final b v;
    static final b w;
    static final b x;
    static final b y;
    static final b z;
    private final String B;

    static {
        a("sasw");
        a("sisw");
        a("surw");
        a("surp");
        a("swhp");
        f3020a = a("sas");
        f3021b = a("srt");
        f3022c = a("sft");
        f3023d = a("sfs");
        e = a("sadb");
        f = a("sacb");
        g = a("stdl");
        h = a("stdi");
        i = a("snas");
        j = a("snat");
        k = a("stah");
        l = a("stas");
        m = a("stac");
        n = a("stbe");
        o = a("stbc");
        p = a("saan");
        q = a("suvs");
        r = a("sugs");
        s = a("svpv");
        t = a("stpd");
        u = a("sspe");
        v = a("shsc");
        w = a("shfc");
        x = a("svmi");
        y = a("stvm");
        z = a("schc");
        A = a("smwm");
    }

    private b(String str) {
        this.B = str;
    }

    private static b a(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("No key name specified");
        }
        if (!C.contains(str)) {
            C.add(str);
            return new b(str);
        }
        throw new IllegalArgumentException("Key has already been used: " + str);
    }

    public String a() {
        return this.B;
    }
}
