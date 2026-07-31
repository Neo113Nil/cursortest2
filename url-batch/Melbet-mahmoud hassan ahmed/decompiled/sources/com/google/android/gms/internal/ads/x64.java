package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
public final class x64 implements e64 {

    /* renamed from: a, reason: collision with root package name */
    private final gd1 f14062a;

    /* renamed from: b, reason: collision with root package name */
    private int f14063b;

    /* renamed from: c, reason: collision with root package name */
    private final w64 f14064c;

    /* renamed from: d, reason: collision with root package name */
    private final m94 f14065d;

    /* renamed from: e, reason: collision with root package name */
    private final s24 f14066e;

    public x64(gd1 gd1Var, vc4 vc4Var) {
        w64 w64Var = new w64(vc4Var);
        this.f14062a = gd1Var;
        this.f14064c = w64Var;
        this.f14066e = new s24();
        this.f14065d = new m94(-1);
        this.f14063b = 1048576;
    }

    public final x64 a(int i7) {
        this.f14063b = i7;
        return this;
    }

    public final z64 b(zo zoVar) {
        Objects.requireNonNull(zoVar.f15203b);
        return new z64(zoVar, this.f14062a, this.f14064c, b34.f3192a, this.f14065d, this.f14063b, null, null);
    }
}
