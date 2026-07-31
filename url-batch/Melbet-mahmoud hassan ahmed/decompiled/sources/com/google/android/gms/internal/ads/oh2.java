package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;

/* loaded from: classes.dex */
public final class oh2 implements kv3<mh2> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<dc3> f9674a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<Context> f9675b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<Set<String>> f9676c;

    public oh2(yv3<dc3> yv3Var, yv3<Context> yv3Var2, yv3<Set<String>> yv3Var3) {
        this.f9674a = yv3Var;
        this.f9675b = yv3Var2;
        this.f9676c = yv3Var3;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        dc3 dc3Var = wo0.f13894a;
        sv3.b(dc3Var);
        return new mh2(dc3Var, ((nt2) this.f9675b).b(), this.f9676c.a());
    }
}
