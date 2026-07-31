package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class or1 implements Callable<rr1> {

    /* renamed from: a, reason: collision with root package name */
    private final y2.a f9785a;

    /* renamed from: b, reason: collision with root package name */
    private final ru0 f9786b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f9787c;

    /* renamed from: d, reason: collision with root package name */
    private final wv1 f9788d;

    /* renamed from: e, reason: collision with root package name */
    private final xw2 f9789e;

    /* renamed from: f, reason: collision with root package name */
    private final o42 f9790f;

    /* renamed from: g, reason: collision with root package name */
    private final Executor f9791g;

    /* renamed from: h, reason: collision with root package name */
    private final gb f9792h;

    /* renamed from: i, reason: collision with root package name */
    private final po0 f9793i;

    /* renamed from: j, reason: collision with root package name */
    private final cy2 f9794j;

    public or1(Context context, Executor executor, gb gbVar, po0 po0Var, y2.a aVar, ru0 ru0Var, o42 o42Var, cy2 cy2Var, wv1 wv1Var, xw2 xw2Var) {
        this.f9787c = context;
        this.f9791g = executor;
        this.f9792h = gbVar;
        this.f9793i = po0Var;
        this.f9785a = aVar;
        this.f9786b = ru0Var;
        this.f9790f = o42Var;
        this.f9794j = cy2Var;
        this.f9788d = wv1Var;
        this.f9789e = xw2Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ rr1 call() {
        rr1 rr1Var = new rr1(this);
        rr1Var.h();
        return rr1Var;
    }
}
