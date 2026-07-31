package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* loaded from: classes.dex */
final class kz0 implements kr2 {

    /* renamed from: a, reason: collision with root package name */
    private final b01 f7757a;

    /* renamed from: b, reason: collision with root package name */
    private Context f7758b;

    /* renamed from: c, reason: collision with root package name */
    private String f7759c;

    /* synthetic */ kz0(b01 b01Var, jz0 jz0Var) {
        this.f7757a = b01Var;
    }

    @Override // com.google.android.gms.internal.ads.kr2
    public final /* synthetic */ kr2 a(Context context) {
        Objects.requireNonNull(context);
        this.f7758b = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.kr2
    public final /* synthetic */ kr2 b(String str) {
        this.f7759c = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.kr2
    public final lr2 c() {
        sv3.c(this.f7758b, Context.class);
        return new mz0(this.f7757a, this.f7758b, this.f7759c, null);
    }
}
