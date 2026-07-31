package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class wk1 implements y61<d71> {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, a52<d71>> f13843a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, a52<mm1>> f13844b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, r72<mm1>> f13845c;

    /* renamed from: d, reason: collision with root package name */
    private final yv3<y61<t41>> f13846d;

    /* renamed from: e, reason: collision with root package name */
    private final cn1 f13847e;

    wk1(Map<String, a52<d71>> map, Map<String, a52<mm1>> map2, Map<String, r72<mm1>> map3, yv3<y61<t41>> yv3Var, cn1 cn1Var) {
        this.f13843a = map;
        this.f13844b = map2;
        this.f13845c = map3;
        this.f13846d = yv3Var;
        this.f13847e = cn1Var;
    }

    @Override // com.google.android.gms.internal.ads.y61
    public final a52<d71> a(int i7, String str) {
        a52<t41> a7;
        a52<d71> a52Var = this.f13843a.get(str);
        if (a52Var != null) {
            return a52Var;
        }
        if (i7 == 1) {
            if (this.f13847e.e() == null || (a7 = this.f13846d.a().a(i7, str)) == null) {
                return null;
            }
            return d71.a(a7);
        }
        if (i7 != 4) {
            return null;
        }
        r72<mm1> r72Var = this.f13845c.get(str);
        if (r72Var != null) {
            return new b52(r72Var, new e43() { // from class: com.google.android.gms.internal.ads.c71
                @Override // com.google.android.gms.internal.ads.e43
                public final Object apply(Object obj) {
                    return new d71((List<? extends cc3<? extends v61>>) obj);
                }
            });
        }
        a52<mm1> a52Var2 = this.f13844b.get(str);
        if (a52Var2 == null) {
            return null;
        }
        return d71.a(a52Var2);
    }
}
