package io.appmetrica.analytics.coreapi.internal.identifiers;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public final class AppSetId {

    /* renamed from: a, reason: collision with root package name */
    private final String f36945a;

    /* renamed from: b, reason: collision with root package name */
    private final AppSetIdScope f36946b;

    public AppSetId(@Nullable String str, @NotNull AppSetIdScope appSetIdScope) {
        this.f36945a = str;
        this.f36946b = appSetIdScope;
    }

    public static /* synthetic */ AppSetId copy$default(AppSetId appSetId, String str, AppSetIdScope appSetIdScope, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = appSetId.f36945a;
        }
        if ((i4 & 2) != 0) {
            appSetIdScope = appSetId.f36946b;
        }
        return appSetId.copy(str, appSetIdScope);
    }

    @Nullable
    public final String component1() {
        return this.f36945a;
    }

    @NotNull
    public final AppSetIdScope component2() {
        return this.f36946b;
    }

    @NotNull
    public final AppSetId copy(@Nullable String str, @NotNull AppSetIdScope appSetIdScope) {
        return new AppSetId(str, appSetIdScope);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppSetId)) {
            return false;
        }
        AppSetId appSetId = (AppSetId) obj;
        return Intrinsics.areEqual(this.f36945a, appSetId.f36945a) && this.f36946b == appSetId.f36946b;
    }

    @Nullable
    public final String getId() {
        return this.f36945a;
    }

    @NotNull
    public final AppSetIdScope getScope() {
        return this.f36946b;
    }

    public int hashCode() {
        String str = this.f36945a;
        return this.f36946b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return "AppSetId(id=" + this.f36945a + ", scope=" + this.f36946b + ')';
    }
}
