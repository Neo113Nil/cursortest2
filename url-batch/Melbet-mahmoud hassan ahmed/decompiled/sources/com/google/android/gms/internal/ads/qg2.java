package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import java.util.Set;

/* loaded from: classes.dex */
public final class qg2 implements kv3<og2> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<dc3> f10678a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<ViewGroup> f10679b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<Context> f10680c;

    /* renamed from: d, reason: collision with root package name */
    private final yv3<Set<String>> f10681d;

    public qg2(yv3<dc3> yv3Var, yv3<ViewGroup> yv3Var2, yv3<Context> yv3Var3, yv3<Set<String>> yv3Var4) {
        this.f10678a = yv3Var;
        this.f10679b = yv3Var2;
        this.f10680c = yv3Var3;
        this.f10681d = yv3Var4;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        dc3 dc3Var = wo0.f13894a;
        sv3.b(dc3Var);
        return new og2(dc3Var, ((r41) this.f10679b).b(), this.f10680c.a(), ((wv3) this.f10681d).a());
    }
}
