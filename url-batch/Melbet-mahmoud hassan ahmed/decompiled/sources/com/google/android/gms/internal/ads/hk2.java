package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class hk2 implements ij2<ik2> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f6324a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6325b;

    /* renamed from: c, reason: collision with root package name */
    private final dc3 f6326c;

    public hk2(xi0 xi0Var, Context context, String str, dc3 dc3Var) {
        this.f6324a = context;
        this.f6325b = str;
        this.f6326c = dc3Var;
    }

    @Override // com.google.android.gms.internal.ads.ij2
    public final cc3<ik2> a() {
        return this.f6326c.E(new Callable() { // from class: com.google.android.gms.internal.ads.gk2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new ik2(new JSONObject());
            }
        });
    }
}
