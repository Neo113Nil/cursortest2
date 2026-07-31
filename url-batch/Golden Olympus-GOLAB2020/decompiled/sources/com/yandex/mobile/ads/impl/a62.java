package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class a62 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f23169a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f23170b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final ca2 f23171c;

    public a62(@NotNull String event, @NotNull String trackingUrl, @Nullable ca2 ca2Var) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(trackingUrl, "trackingUrl");
        this.f23169a = event;
        this.f23170b = trackingUrl;
        this.f23171c = ca2Var;
    }

    @NotNull
    public final String a() {
        return this.f23169a;
    }

    @Nullable
    public final ca2 b() {
        return this.f23171c;
    }

    @NotNull
    public final String c() {
        return this.f23170b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a62)) {
            return false;
        }
        a62 a62Var = (a62) obj;
        return Intrinsics.areEqual(this.f23169a, a62Var.f23169a) && Intrinsics.areEqual(this.f23170b, a62Var.f23170b) && Intrinsics.areEqual(this.f23171c, a62Var.f23171c);
    }

    public final int hashCode() {
        int a4 = C1842c3.a(this.f23170b, this.f23169a.hashCode() * 31, 31);
        ca2 ca2Var = this.f23171c;
        return a4 + (ca2Var == null ? 0 : ca2Var.hashCode());
    }

    @NotNull
    public final String toString() {
        return "TrackingEvent(event=" + this.f23169a + ", trackingUrl=" + this.f23170b + ", offset=" + this.f23171c + ")";
    }
}
