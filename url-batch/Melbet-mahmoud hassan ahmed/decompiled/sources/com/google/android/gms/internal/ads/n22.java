package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class n22 implements kv3<m22> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<Context> f8887a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<Executor> f8888b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<ij0> f8889c;

    /* renamed from: d, reason: collision with root package name */
    private final yv3<i11> f8890d;

    /* renamed from: e, reason: collision with root package name */
    private final yv3<hj0> f8891e;

    /* renamed from: f, reason: collision with root package name */
    private final yv3<ArrayDeque<j22>> f8892f;

    /* renamed from: g, reason: collision with root package name */
    private final yv3<r22> f8893g;

    public n22(yv3<Context> yv3Var, yv3<Executor> yv3Var2, yv3<ij0> yv3Var3, yv3<i11> yv3Var4, yv3<hj0> yv3Var5, yv3<ArrayDeque<j22>> yv3Var6, yv3<r22> yv3Var7) {
        this.f8887a = yv3Var;
        this.f8888b = yv3Var2;
        this.f8889c = yv3Var3;
        this.f8890d = yv3Var4;
        this.f8891e = yv3Var5;
        this.f8892f = yv3Var6;
        this.f8893g = yv3Var7;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* synthetic */ Object a() {
        return new m22(((gw0) this.f8887a).b(), this.f8888b.a(), new ij0(), ((nw0) this.f8890d).a(), ((zw0) this.f8891e).a(), this.f8892f.a(), new r22(), null);
    }
}
