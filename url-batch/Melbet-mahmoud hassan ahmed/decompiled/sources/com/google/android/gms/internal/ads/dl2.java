package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class dl2 implements ij2<el2> {

    /* renamed from: a, reason: collision with root package name */
    final dc3 f4242a;

    /* renamed from: b, reason: collision with root package name */
    final List<String> f4243b;

    /* renamed from: c, reason: collision with root package name */
    final w00 f4244c;

    /* JADX WARN: Multi-variable type inference failed */
    public dl2(w00 w00Var, w00 w00Var2, dc3 dc3Var, List<String> list) {
        this.f4244c = w00Var;
        this.f4242a = w00Var2;
        this.f4243b = dc3Var;
    }

    @Override // com.google.android.gms.internal.ads.ij2
    public final cc3<el2> a() {
        return this.f4242a.E(new Callable() { // from class: com.google.android.gms.internal.ads.cl2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new el2(dl2.this.f4243b);
            }
        });
    }
}
