package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class xz1 implements kv3<String> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<Context> f14435a;

    public xz1(yv3<Context> yv3Var) {
        this.f14435a = yv3Var;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final String a() {
        String packageName = ((nt2) this.f14435a).b().getPackageName();
        sv3.b(packageName);
        return packageName;
    }
}
