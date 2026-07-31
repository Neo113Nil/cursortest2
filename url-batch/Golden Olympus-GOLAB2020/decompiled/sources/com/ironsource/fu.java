package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class fu {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f16308a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f16309b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f16310c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private final Boolean f16311d;

    public fu(@Nullable String str, boolean z4, @Nullable Boolean bool, @Nullable String str2) {
        this.f16308a = str2;
        this.f16309b = str;
        this.f16310c = z4;
        this.f16311d = bool;
    }

    @Nullable
    public final String a() {
        return this.f16308a;
    }

    public final boolean b() {
        return Intrinsics.areEqual(this.f16311d, Boolean.TRUE);
    }

    public /* synthetic */ fu(String str, boolean z4, Boolean bool, String str2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z4, (i4 & 4) != 0 ? Boolean.FALSE : bool, (i4 & 8) != 0 ? null : str2);
    }

    public final boolean a(@NotNull NetworkSettings networkSettings, @NotNull IronSource.AD_UNIT adUnit) {
        Intrinsics.checkNotNullParameter(networkSettings, "networkSettings");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        String str = this.f16309b;
        if (str == null || str.length() == 0) {
            return true;
        }
        mu muVar = mu.f18248a;
        return Intrinsics.areEqual(muVar.a(networkSettings), this.f16309b) && muVar.a(networkSettings, adUnit) == this.f16310c;
    }
}
