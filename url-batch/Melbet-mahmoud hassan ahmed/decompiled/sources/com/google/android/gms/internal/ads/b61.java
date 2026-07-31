package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class b61 implements kv3<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<ks2> f3263a;

    public b61(yv3<ks2> yv3Var) {
        this.f3263a = yv3Var;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Boolean a() {
        boolean z6 = true;
        if (((ma1) this.f3263a).b().a() == null) {
            if (!((Boolean) sw.c().b(m10.X3)).booleanValue()) {
                z6 = false;
            }
        }
        return Boolean.valueOf(z6);
    }
}
