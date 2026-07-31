package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class kw0 implements kv3<Set<hi1<vh1>>> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<y22> f7671a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<Executor> f7672b;

    public kw0(yv3<y22> yv3Var, yv3<Executor> yv3Var2) {
        this.f7671a = yv3Var;
        this.f7672b = yv3Var2;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        Set emptySet;
        y22 a7 = this.f7671a.a();
        dc3 dc3Var = wo0.f13894a;
        sv3.b(dc3Var);
        if (((Boolean) sw.c().b(m10.f8334x1)).booleanValue()) {
            if (((Boolean) sw.c().b(m10.f8287q6)).booleanValue()) {
                emptySet = Collections.singleton(new hi1(a7, dc3Var));
                sv3.b(emptySet);
                return emptySet;
            }
        }
        emptySet = Collections.emptySet();
        sv3.b(emptySet);
        return emptySet;
    }
}
