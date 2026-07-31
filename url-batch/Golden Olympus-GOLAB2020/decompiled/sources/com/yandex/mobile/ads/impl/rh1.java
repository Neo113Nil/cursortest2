package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.dw0;
import java.util.List;

/* loaded from: classes3.dex */
final class rh1 {

    /* renamed from: s, reason: collision with root package name */
    private static final dw0.b f31191s = new dw0.b(new Object());

    /* renamed from: a, reason: collision with root package name */
    public final x42 f31192a;

    /* renamed from: b, reason: collision with root package name */
    public final dw0.b f31193b;

    /* renamed from: c, reason: collision with root package name */
    public final long f31194c;

    /* renamed from: d, reason: collision with root package name */
    public final long f31195d;

    /* renamed from: e, reason: collision with root package name */
    public final int f31196e;

    /* renamed from: f, reason: collision with root package name */
    public final c60 f31197f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f31198g;

    /* renamed from: h, reason: collision with root package name */
    public final o52 f31199h;

    /* renamed from: i, reason: collision with root package name */
    public final v52 f31200i;

    /* renamed from: j, reason: collision with root package name */
    public final List<wz0> f31201j;

    /* renamed from: k, reason: collision with root package name */
    public final dw0.b f31202k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f31203l;

    /* renamed from: m, reason: collision with root package name */
    public final int f31204m;

    /* renamed from: n, reason: collision with root package name */
    public final th1 f31205n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f31206o;

    /* renamed from: p, reason: collision with root package name */
    public volatile long f31207p;

    /* renamed from: q, reason: collision with root package name */
    public volatile long f31208q;

    /* renamed from: r, reason: collision with root package name */
    public volatile long f31209r;

    public rh1(x42 x42Var, dw0.b bVar, long j4, long j5, int i4, c60 c60Var, boolean z4, o52 o52Var, v52 v52Var, List<wz0> list, dw0.b bVar2, boolean z5, int i5, th1 th1Var, long j6, long j7, long j8, boolean z6) {
        this.f31192a = x42Var;
        this.f31193b = bVar;
        this.f31194c = j4;
        this.f31195d = j5;
        this.f31196e = i4;
        this.f31197f = c60Var;
        this.f31198g = z4;
        this.f31199h = o52Var;
        this.f31200i = v52Var;
        this.f31201j = list;
        this.f31202k = bVar2;
        this.f31203l = z5;
        this.f31204m = i5;
        this.f31205n = th1Var;
        this.f31207p = j6;
        this.f31208q = j7;
        this.f31209r = j8;
        this.f31206o = z6;
    }

    public static rh1 a(v52 v52Var) {
        x42 x42Var = x42.f34401b;
        dw0.b bVar = f31191s;
        return new rh1(x42Var, bVar, -9223372036854775807L, 0L, 1, null, false, o52.f29910e, v52Var, sj0.h(), bVar, false, 0, th1.f32439e, 0L, 0L, 0L, false);
    }

    public static dw0.b a() {
        return f31191s;
    }

    public final rh1 a(dw0.b bVar, long j4, long j5, long j6, long j7, o52 o52Var, v52 v52Var, List<wz0> list) {
        return new rh1(this.f31192a, bVar, j5, j6, this.f31196e, this.f31197f, this.f31198g, o52Var, v52Var, list, this.f31202k, this.f31203l, this.f31204m, this.f31205n, this.f31207p, j7, j4, this.f31206o);
    }

    public final rh1 a(x42 x42Var) {
        return new rh1(x42Var, this.f31193b, this.f31194c, this.f31195d, this.f31196e, this.f31197f, this.f31198g, this.f31199h, this.f31200i, this.f31201j, this.f31202k, this.f31203l, this.f31204m, this.f31205n, this.f31207p, this.f31208q, this.f31209r, this.f31206o);
    }

    public final rh1 a(int i4) {
        return new rh1(this.f31192a, this.f31193b, this.f31194c, this.f31195d, i4, this.f31197f, this.f31198g, this.f31199h, this.f31200i, this.f31201j, this.f31202k, this.f31203l, this.f31204m, this.f31205n, this.f31207p, this.f31208q, this.f31209r, this.f31206o);
    }

    public final rh1 a(c60 c60Var) {
        return new rh1(this.f31192a, this.f31193b, this.f31194c, this.f31195d, this.f31196e, c60Var, this.f31198g, this.f31199h, this.f31200i, this.f31201j, this.f31202k, this.f31203l, this.f31204m, this.f31205n, this.f31207p, this.f31208q, this.f31209r, this.f31206o);
    }

    public final rh1 a(dw0.b bVar) {
        return new rh1(this.f31192a, this.f31193b, this.f31194c, this.f31195d, this.f31196e, this.f31197f, this.f31198g, this.f31199h, this.f31200i, this.f31201j, bVar, this.f31203l, this.f31204m, this.f31205n, this.f31207p, this.f31208q, this.f31209r, this.f31206o);
    }
}
