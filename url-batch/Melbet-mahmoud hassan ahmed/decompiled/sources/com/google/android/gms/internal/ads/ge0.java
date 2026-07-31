package com.google.android.gms.internal.ads;

import android.location.Location;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import u2.e;

/* loaded from: classes.dex */
public final class ge0 implements c3.s {

    /* renamed from: a, reason: collision with root package name */
    private final Date f5574a;

    /* renamed from: b, reason: collision with root package name */
    private final int f5575b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<String> f5576c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f5577d;

    /* renamed from: e, reason: collision with root package name */
    private final Location f5578e;

    /* renamed from: f, reason: collision with root package name */
    private final int f5579f;

    /* renamed from: g, reason: collision with root package name */
    private final b40 f5580g;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f5582i;

    /* renamed from: k, reason: collision with root package name */
    private final String f5584k;

    /* renamed from: h, reason: collision with root package name */
    private final List<String> f5581h = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    private final Map<String, Boolean> f5583j = new HashMap();

    public ge0(Date date, int i7, Set<String> set, Location location, boolean z6, int i8, b40 b40Var, List<String> list, boolean z7, int i9, String str) {
        Map<String, Boolean> map;
        String str2;
        Boolean bool;
        this.f5574a = date;
        this.f5575b = i7;
        this.f5576c = set;
        this.f5578e = location;
        this.f5577d = z6;
        this.f5579f = i8;
        this.f5580g = b40Var;
        this.f5582i = z7;
        this.f5584k = str;
        if (list != null) {
            for (String str3 : list) {
                if (str3.startsWith("custom:")) {
                    String[] split = str3.split(":", 3);
                    if (split.length == 3) {
                        if ("true".equals(split[2])) {
                            map = this.f5583j;
                            str2 = split[1];
                            bool = Boolean.TRUE;
                        } else if ("false".equals(split[2])) {
                            map = this.f5583j;
                            str2 = split[1];
                            bool = Boolean.FALSE;
                        }
                        map.put(str2, bool);
                    }
                } else {
                    this.f5581h.add(str3);
                }
            }
        }
    }

    @Override // c3.s
    public final boolean a() {
        return this.f5581h.contains("3");
    }

    @Override // c3.e
    @Deprecated
    public final boolean b() {
        return this.f5582i;
    }

    @Override // c3.e
    @Deprecated
    public final Date c() {
        return this.f5574a;
    }

    @Override // c3.e
    public final boolean d() {
        return this.f5577d;
    }

    @Override // c3.e
    public final Set<String> e() {
        return this.f5576c;
    }

    @Override // c3.s
    public final f3.d f() {
        return b40.c(this.f5580g);
    }

    @Override // c3.s
    public final u2.e g() {
        b40 b40Var = this.f5580g;
        e.a aVar = new e.a();
        if (b40Var != null) {
            int i7 = b40Var.f3202f;
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 == 4) {
                        aVar.e(b40Var.f3208l);
                        aVar.d(b40Var.f3209m);
                    }
                    aVar.g(b40Var.f3203g);
                    aVar.c(b40Var.f3204h);
                    aVar.f(b40Var.f3205i);
                }
                s00 s00Var = b40Var.f3207k;
                if (s00Var != null) {
                    aVar.h(new r2.x(s00Var));
                }
            }
            aVar.b(b40Var.f3206j);
            aVar.g(b40Var.f3203g);
            aVar.c(b40Var.f3204h);
            aVar.f(b40Var.f3205i);
        }
        return aVar.a();
    }

    @Override // c3.e
    public final int h() {
        return this.f5579f;
    }

    @Override // c3.s
    public final boolean i() {
        return this.f5581h.contains("6");
    }

    @Override // c3.e
    public final Location j() {
        return this.f5578e;
    }

    @Override // c3.e
    @Deprecated
    public final int k() {
        return this.f5575b;
    }

    @Override // c3.s
    public final Map<String, Boolean> zza() {
        return this.f5583j;
    }
}
