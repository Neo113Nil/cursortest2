package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* loaded from: classes.dex */
final class xx0 implements jm2 {

    /* renamed from: a, reason: collision with root package name */
    private final b01 f14369a;

    /* renamed from: b, reason: collision with root package name */
    private Context f14370b;

    /* renamed from: c, reason: collision with root package name */
    private String f14371c;

    /* synthetic */ xx0(b01 b01Var, wx0 wx0Var) {
        this.f14369a = b01Var;
    }

    @Override // com.google.android.gms.internal.ads.jm2
    public final /* synthetic */ jm2 a(Context context) {
        Objects.requireNonNull(context);
        this.f14370b = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.jm2
    public final /* synthetic */ jm2 b(String str) {
        Objects.requireNonNull(str);
        this.f14371c = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.jm2
    public final km2 c() {
        sv3.c(this.f14370b, Context.class);
        sv3.c(this.f14371c, String.class);
        return new zx0(this.f14369a, this.f14370b, this.f14371c, null);
    }
}
