package ru.rustore.sdk.pay.internal;

import android.net.http.X509TrustManagerExtensions;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class co {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final X509TrustManager f43941a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final X509TrustManagerExtensions f43942b;

    public co(@NotNull X509TrustManager trustManager, @NotNull X509TrustManagerExtensions trustExtensions) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        Intrinsics.checkNotNullParameter(trustExtensions, "trustExtensions");
        this.f43941a = trustManager;
        this.f43942b = trustExtensions;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof co)) {
            return false;
        }
        co coVar = (co) obj;
        return Intrinsics.areEqual(this.f43941a, coVar.f43941a) && Intrinsics.areEqual(this.f43942b, coVar.f43942b);
    }

    public final int hashCode() {
        return this.f43942b.hashCode() + (this.f43941a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "X509TrustPair(trustManager=" + this.f43941a + ", trustExtensions=" + this.f43942b + ')';
    }
}
