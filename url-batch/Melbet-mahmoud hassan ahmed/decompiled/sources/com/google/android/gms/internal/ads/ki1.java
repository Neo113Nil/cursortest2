package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;

/* loaded from: classes.dex */
public final class ki1 implements kv3<ji1> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<Context> f7520a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<Set<hi1<zn>>> f7521b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<rr2> f7522c;

    public ki1(yv3<Context> yv3Var, yv3<Set<hi1<zn>>> yv3Var2, yv3<rr2> yv3Var3) {
        this.f7520a = yv3Var;
        this.f7521b = yv3Var2;
        this.f7522c = yv3Var3;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        return new ji1(this.f7520a.a(), ((wv3) this.f7521b).a(), ((m71) this.f7522c).b());
    }
}
