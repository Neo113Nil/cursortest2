package io.appmetrica.analytics.coreapi.internal.identifiers;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public final class PlatformIdentifiers {

    /* renamed from: a, reason: collision with root package name */
    private final SimpleAdvertisingIdGetter f36951a;

    /* renamed from: b, reason: collision with root package name */
    private final AppSetIdProvider f36952b;

    public PlatformIdentifiers(@NotNull SimpleAdvertisingIdGetter simpleAdvertisingIdGetter, @NotNull AppSetIdProvider appSetIdProvider) {
        this.f36951a = simpleAdvertisingIdGetter;
        this.f36952b = appSetIdProvider;
    }

    public static /* synthetic */ PlatformIdentifiers copy$default(PlatformIdentifiers platformIdentifiers, SimpleAdvertisingIdGetter simpleAdvertisingIdGetter, AppSetIdProvider appSetIdProvider, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            simpleAdvertisingIdGetter = platformIdentifiers.f36951a;
        }
        if ((i4 & 2) != 0) {
            appSetIdProvider = platformIdentifiers.f36952b;
        }
        return platformIdentifiers.copy(simpleAdvertisingIdGetter, appSetIdProvider);
    }

    @NotNull
    public final SimpleAdvertisingIdGetter component1() {
        return this.f36951a;
    }

    @NotNull
    public final AppSetIdProvider component2() {
        return this.f36952b;
    }

    @NotNull
    public final PlatformIdentifiers copy(@NotNull SimpleAdvertisingIdGetter simpleAdvertisingIdGetter, @NotNull AppSetIdProvider appSetIdProvider) {
        return new PlatformIdentifiers(simpleAdvertisingIdGetter, appSetIdProvider);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlatformIdentifiers)) {
            return false;
        }
        PlatformIdentifiers platformIdentifiers = (PlatformIdentifiers) obj;
        return Intrinsics.areEqual(this.f36951a, platformIdentifiers.f36951a) && Intrinsics.areEqual(this.f36952b, platformIdentifiers.f36952b);
    }

    @NotNull
    public final SimpleAdvertisingIdGetter getAdvIdentifiersProvider() {
        return this.f36951a;
    }

    @NotNull
    public final AppSetIdProvider getAppSetIdProvider() {
        return this.f36952b;
    }

    public int hashCode() {
        return this.f36952b.hashCode() + (this.f36951a.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "PlatformIdentifiers(advIdentifiersProvider=" + this.f36951a + ", appSetIdProvider=" + this.f36952b + ')';
    }
}
