package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.core.config.RuStoreInternalConfig;
import ru.rustore.sdk.pay.BuildConfig;

/* loaded from: classes3.dex */
public final class mj {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final sj f44649a;

    public mj(@NotNull nj sdkNameDataSource, @NotNull sj sdkTypeDataSource, @NotNull tj sdkVersionDataSource) {
        Intrinsics.checkNotNullParameter(sdkNameDataSource, "sdkNameDataSource");
        Intrinsics.checkNotNullParameter(sdkTypeDataSource, "sdkTypeDataSource");
        Intrinsics.checkNotNullParameter(sdkVersionDataSource, "sdkVersionDataSource");
        this.f44649a = sdkTypeDataSource;
    }

    @NotNull
    public final ij a() {
        String value = RuStoreInternalConfig.Companion.create(this.f44649a.f45021a).getSdkType().getValue();
        Intrinsics.checkNotNullParameter(BuildConfig.SDK_NAME, "value");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(BuildConfig.SDK_VERSION, "value");
        return new ij(value);
    }
}
