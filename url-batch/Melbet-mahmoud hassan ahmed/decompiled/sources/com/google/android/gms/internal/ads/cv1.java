package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class cv1 implements kv3<Set<hi1<ow2>>> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<String> f3959a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<Context> f3960b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<Executor> f3961c;

    /* renamed from: d, reason: collision with root package name */
    private final yv3<Map<gw2, ev1>> f3962d;

    public cv1(yv3<String> yv3Var, yv3<Context> yv3Var2, yv3<Executor> yv3Var3, yv3<Map<gw2, ev1>> yv3Var4) {
        this.f3959a = yv3Var;
        this.f3960b = yv3Var2;
        this.f3961c = yv3Var3;
        this.f3962d = yv3Var4;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        Set emptySet;
        final String b7 = ((nl2) this.f3959a).b();
        Context b8 = ((gw0) this.f3960b).b();
        dc3 dc3Var = wo0.f13894a;
        sv3.b(dc3Var);
        Map a7 = ((ov3) this.f3962d).a();
        if (((Boolean) sw.c().b(m10.f8322v3)).booleanValue()) {
            ar arVar = new ar(new fr(b8));
            arVar.b(new zq() { // from class: com.google.android.gms.internal.ads.dv1
                @Override // com.google.android.gms.internal.ads.zq
                public final void a(ps psVar) {
                    psVar.y(b7);
                }
            });
            emptySet = Collections.singleton(new hi1(new fv1(arVar, a7), dc3Var));
        } else {
            emptySet = Collections.emptySet();
        }
        sv3.b(emptySet);
        return emptySet;
    }
}
