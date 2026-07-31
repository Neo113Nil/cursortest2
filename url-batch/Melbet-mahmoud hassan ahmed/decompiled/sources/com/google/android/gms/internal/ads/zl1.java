package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class zl1 implements kv3<ji1> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<Context> f15183a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<rr2> f15184b;

    public zl1(yv3<Context> yv3Var, yv3<rr2> yv3Var2) {
        this.f15183a = yv3Var;
        this.f15184b = yv3Var2;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        return new ji1(this.f15183a.a(), new HashSet(), ((m71) this.f15184b).b());
    }
}
