package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class sy0 implements xw1 {

    /* renamed from: a, reason: collision with root package name */
    private final b01 f11998a;

    /* renamed from: b, reason: collision with root package name */
    private final yy0 f11999b;

    /* renamed from: c, reason: collision with root package name */
    private Long f12000c;

    /* renamed from: d, reason: collision with root package name */
    private String f12001d;

    /* synthetic */ sy0(b01 b01Var, yy0 yy0Var, qy0 qy0Var) {
        this.f11998a = b01Var;
        this.f11999b = yy0Var;
    }

    @Override // com.google.android.gms.internal.ads.xw1
    public final /* bridge */ /* synthetic */ xw1 a(long j7) {
        this.f12000c = Long.valueOf(j7);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.xw1
    public final /* synthetic */ xw1 b(String str) {
        Objects.requireNonNull(str);
        this.f12001d = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.xw1
    public final ax1 c() {
        sv3.c(this.f12000c, Long.class);
        sv3.c(this.f12001d, String.class);
        return new uy0(this.f11998a, this.f11999b, this.f12000c, this.f12001d, null);
    }
}
