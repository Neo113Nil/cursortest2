package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class e31 implements kv3<Set<hi1<qb1>>> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<b31> f4482a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<Executor> f4483b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<JSONObject> f4484c;

    public e31(yv3<b31> yv3Var, yv3<Executor> yv3Var2, yv3<JSONObject> yv3Var3) {
        this.f4482a = yv3Var;
        this.f4483b = yv3Var2;
        this.f4484c = yv3Var3;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        b31 a7 = this.f4482a.a();
        dc3 dc3Var = wo0.f13894a;
        sv3.b(dc3Var);
        Set emptySet = this.f4484c.a() == null ? Collections.emptySet() : Collections.singleton(new hi1(a7, dc3Var));
        sv3.b(emptySet);
        return emptySet;
    }
}
