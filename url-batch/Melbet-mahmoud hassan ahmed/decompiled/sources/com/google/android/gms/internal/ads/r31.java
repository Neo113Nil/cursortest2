package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class r31 implements kv3<Set<hi1<lc1>>> {

    /* renamed from: a, reason: collision with root package name */
    private final p31 f11004a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<n61> f11005b;

    public r31(p31 p31Var, yv3<n61> yv3Var) {
        this.f11004a = p31Var;
        this.f11005b = yv3Var;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        Set singleton = Collections.singleton(new hi1(this.f11005b.a(), wo0.f13899f));
        sv3.b(singleton);
        return singleton;
    }
}
