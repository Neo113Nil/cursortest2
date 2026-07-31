package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class vh2 implements ij2<wh2> {

    /* renamed from: a, reason: collision with root package name */
    private final dc3 f13381a;

    /* renamed from: b, reason: collision with root package name */
    private final Bundle f13382b;

    public vh2(dc3 dc3Var, Bundle bundle) {
        this.f13381a = dc3Var;
        this.f13382b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.ij2
    public final cc3<wh2> a() {
        return this.f13381a.E(new Callable() { // from class: com.google.android.gms.internal.ads.uh2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return vh2.this.b();
            }
        });
    }

    final /* synthetic */ wh2 b() {
        return new wh2(this.f13382b);
    }
}
