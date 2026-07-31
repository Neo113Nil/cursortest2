package com.yandex.mobile.ads.impl;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.lk, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2074lk {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final gs f28625a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final vy1 f28626b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Map<String, String> f28627c;

    public C2074lk(@Nullable gs gsVar, @Nullable vy1 vy1Var, @NotNull Map<String, String> parameters) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.f28625a = gsVar;
        this.f28626b = vy1Var;
        this.f28627c = parameters;
    }

    @Nullable
    public final gs a() {
        return this.f28625a;
    }

    @NotNull
    public final Map<String, String> b() {
        return this.f28627c;
    }

    @Nullable
    public final vy1 c() {
        return this.f28626b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2074lk)) {
            return false;
        }
        C2074lk c2074lk = (C2074lk) obj;
        return this.f28625a == c2074lk.f28625a && Intrinsics.areEqual(this.f28626b, c2074lk.f28626b) && Intrinsics.areEqual(this.f28627c, c2074lk.f28627c);
    }

    public final int hashCode() {
        gs gsVar = this.f28625a;
        int hashCode = (gsVar == null ? 0 : gsVar.hashCode()) * 31;
        vy1 vy1Var = this.f28626b;
        return this.f28627c.hashCode() + ((hashCode + (vy1Var != null ? vy1Var.hashCode() : 0)) * 31);
    }

    @NotNull
    public final String toString() {
        return "BidderTokenRequestData(adType=" + this.f28625a + ", sizeInfo=" + this.f28626b + ", parameters=" + this.f28627c + ")";
    }
}
