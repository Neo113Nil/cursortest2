package ru.rustore.sdk.pay.internal;

import java.net.URL;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class u7 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final URL f45083a;

    /* renamed from: b, reason: collision with root package name */
    public final int f45084b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f45085c;

    public u7(@NotNull URL requestUrl, int i4, @NotNull String responseBody) {
        Intrinsics.checkNotNullParameter(requestUrl, "requestUrl");
        Intrinsics.checkNotNullParameter(responseBody, "responseBody");
        this.f45083a = requestUrl;
        this.f45084b = i4;
        this.f45085c = responseBody;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u7)) {
            return false;
        }
        u7 u7Var = (u7) obj;
        return Intrinsics.areEqual(this.f45083a, u7Var.f45083a) && this.f45084b == u7Var.f45084b && Intrinsics.areEqual(this.f45085c, u7Var.f45085c);
    }

    public final int hashCode() {
        return this.f45085c.hashCode() + ((Integer.hashCode(this.f45084b) + (this.f45083a.hashCode() * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkRequestResult(requestUrl=");
        sb.append(this.f45083a);
        sb.append(", responseCode=");
        sb.append(this.f45084b);
        sb.append(", responseBody=");
        return i1.a(sb, this.f45085c, ')');
    }
}
