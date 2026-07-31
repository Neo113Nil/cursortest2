package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class jt2 implements ya1 {

    /* renamed from: f, reason: collision with root package name */
    private final HashSet<nn0> f7247f = new HashSet<>();

    /* renamed from: g, reason: collision with root package name */
    private final Context f7248g;

    /* renamed from: h, reason: collision with root package name */
    private final xn0 f7249h;

    public jt2(Context context, xn0 xn0Var) {
        this.f7248g = context;
        this.f7249h = xn0Var;
    }

    public final Bundle a() {
        return this.f7249h.k(this.f7248g, this);
    }

    public final synchronized void b(HashSet<nn0> hashSet) {
        this.f7247f.clear();
        this.f7247f.addAll(hashSet);
    }

    @Override // com.google.android.gms.internal.ads.ya1
    public final synchronized void d(cv cvVar) {
        if (cvVar.f3954f != 3) {
            this.f7249h.i(this.f7247f);
        }
    }
}
