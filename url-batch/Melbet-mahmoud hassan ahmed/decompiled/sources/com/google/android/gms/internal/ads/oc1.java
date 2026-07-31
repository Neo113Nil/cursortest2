package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class oc1 implements kv3<nc1> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<Set<hi1<pc1>>> f9606a;

    public oc1(yv3<Set<hi1<pc1>>> yv3Var) {
        this.f9606a = yv3Var;
    }

    public static nc1 c(Set<hi1<pc1>> set) {
        return new nc1(set);
    }

    @Override // com.google.android.gms.internal.ads.yv3
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final nc1 a() {
        return new nc1(((wv3) this.f9606a).a());
    }
}
