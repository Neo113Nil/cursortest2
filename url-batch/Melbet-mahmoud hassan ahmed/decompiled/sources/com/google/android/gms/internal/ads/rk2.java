package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class rk2 implements ij2<sk2> {

    /* renamed from: a, reason: collision with root package name */
    final dc3 f11189a;

    /* renamed from: b, reason: collision with root package name */
    final Context f11190b;

    /* renamed from: c, reason: collision with root package name */
    final pq f11191c;

    public rk2(pq pqVar, dc3 dc3Var, Context context, byte[] bArr) {
        this.f11191c = pqVar;
        this.f11189a = dc3Var;
        this.f11190b = context;
    }

    @Override // com.google.android.gms.internal.ads.ij2
    public final cc3<sk2> a() {
        return this.f11189a.E(new Callable() { // from class: com.google.android.gms.internal.ads.qk2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new sk2(new JSONObject());
            }
        });
    }
}
