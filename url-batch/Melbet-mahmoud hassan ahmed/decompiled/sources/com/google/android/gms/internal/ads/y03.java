package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class y03 extends v03 {

    /* renamed from: a, reason: collision with root package name */
    private String f14477a;

    /* renamed from: b, reason: collision with root package name */
    private Boolean f14478b;

    /* renamed from: c, reason: collision with root package name */
    private Boolean f14479c;

    y03() {
    }

    @Override // com.google.android.gms.internal.ads.v03
    public final v03 a(String str) {
        Objects.requireNonNull(str, "Null clientVersion");
        this.f14477a = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.v03
    public final v03 b(boolean z6) {
        this.f14479c = Boolean.TRUE;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.v03
    public final v03 c(boolean z6) {
        this.f14478b = Boolean.valueOf(z6);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.v03
    public final w03 d() {
        Boolean bool;
        String str = this.f14477a;
        if (str != null && (bool = this.f14478b) != null && this.f14479c != null) {
            return new a13(str, bool.booleanValue(), this.f14479c.booleanValue(), null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f14477a == null) {
            sb.append(" clientVersion");
        }
        if (this.f14478b == null) {
            sb.append(" shouldGetAdvertisingId");
        }
        if (this.f14479c == null) {
            sb.append(" isGooglePlayServicesAvailable");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
