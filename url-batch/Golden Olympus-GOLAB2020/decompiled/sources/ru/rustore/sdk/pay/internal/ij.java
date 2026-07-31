package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.pay.BuildConfig;

/* loaded from: classes3.dex */
public final class ij {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f44347a;

    public ij(String type) {
        Intrinsics.checkNotNullParameter(BuildConfig.SDK_NAME, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(BuildConfig.SDK_VERSION, "version");
        this.f44347a = type;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ij) {
            return Intrinsics.areEqual(BuildConfig.SDK_NAME, BuildConfig.SDK_NAME) && Intrinsics.areEqual(this.f44347a, ((ij) obj).f44347a) && Intrinsics.areEqual(BuildConfig.SDK_VERSION, BuildConfig.SDK_VERSION);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f44347a.hashCode() - 1333455021) * 31) + 1448577317;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("SdkInfo(name=SdkName(value=ru.rustore.sdk:pay), type=");
        sb.append((Object) ("SdkType(value=" + this.f44347a + ')'));
        sb.append(", version=SdkVersion(value=10.2.0))");
        return sb.toString();
    }
}
