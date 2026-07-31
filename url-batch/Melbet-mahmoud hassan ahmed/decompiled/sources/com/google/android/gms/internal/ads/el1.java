package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class el1 implements kv3<Set<String>> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<cn1> f4656a;

    public el1(yv3<cn1> yv3Var) {
        this.f4656a = yv3Var;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        Set singleton = ((bl1) this.f4656a).b().e() != null ? Collections.singleton("banner") : Collections.emptySet();
        sv3.b(singleton);
        return singleton;
    }
}
