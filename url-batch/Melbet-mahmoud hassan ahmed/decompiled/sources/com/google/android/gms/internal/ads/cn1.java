package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class cn1 {

    /* renamed from: h, reason: collision with root package name */
    public static final cn1 f3879h = new cn1(new an1());

    /* renamed from: a, reason: collision with root package name */
    private final l50 f3880a;

    /* renamed from: b, reason: collision with root package name */
    private final i50 f3881b;

    /* renamed from: c, reason: collision with root package name */
    private final y50 f3882c;

    /* renamed from: d, reason: collision with root package name */
    private final v50 f3883d;

    /* renamed from: e, reason: collision with root package name */
    private final ba0 f3884e;

    /* renamed from: f, reason: collision with root package name */
    private final h.e<String, r50> f3885f;

    /* renamed from: g, reason: collision with root package name */
    private final h.e<String, o50> f3886g;

    private cn1(an1 an1Var) {
        this.f3880a = an1Var.f2872a;
        this.f3881b = an1Var.f2873b;
        this.f3882c = an1Var.f2874c;
        this.f3885f = new h.e<>(an1Var.f2877f);
        this.f3886g = new h.e<>(an1Var.f2878g);
        this.f3883d = an1Var.f2875d;
        this.f3884e = an1Var.f2876e;
    }

    public final i50 a() {
        return this.f3881b;
    }

    public final l50 b() {
        return this.f3880a;
    }

    public final o50 c(String str) {
        return this.f3886g.get(str);
    }

    public final r50 d(String str) {
        return this.f3885f.get(str);
    }

    public final v50 e() {
        return this.f3883d;
    }

    public final y50 f() {
        return this.f3882c;
    }

    public final ba0 g() {
        return this.f3884e;
    }

    public final ArrayList<String> h() {
        ArrayList<String> arrayList = new ArrayList<>(this.f3885f.size());
        for (int i7 = 0; i7 < this.f3885f.size(); i7++) {
            arrayList.add(this.f3885f.i(i7));
        }
        return arrayList;
    }

    public final ArrayList<String> i() {
        ArrayList<String> arrayList = new ArrayList<>();
        if (this.f3882c != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.f3880a != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.f3881b != null) {
            arrayList.add(Integer.toString(2));
        }
        if (this.f3885f.size() > 0) {
            arrayList.add(Integer.toString(3));
        }
        if (this.f3884e != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }
}
