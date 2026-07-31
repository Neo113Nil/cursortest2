package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public final class vv3<T> {

    /* renamed from: a, reason: collision with root package name */
    private final List<yv3<T>> f13516a;

    /* renamed from: b, reason: collision with root package name */
    private final List<yv3<Collection<T>>> f13517b;

    /* synthetic */ vv3(int i7, int i8, uv3 uv3Var) {
        this.f13516a = hv3.c(i7);
        this.f13517b = hv3.c(i8);
    }

    public final vv3<T> a(yv3<? extends Collection<? extends T>> yv3Var) {
        this.f13517b.add(yv3Var);
        return this;
    }

    public final vv3<T> b(yv3<? extends T> yv3Var) {
        this.f13516a.add(yv3Var);
        return this;
    }

    public final wv3<T> c() {
        return new wv3<>(this.f13516a, this.f13517b, null);
    }
}
