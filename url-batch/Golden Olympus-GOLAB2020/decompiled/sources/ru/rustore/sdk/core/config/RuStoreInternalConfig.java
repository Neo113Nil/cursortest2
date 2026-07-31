package ru.rustore.sdk.core.config;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public final class RuStoreInternalConfig {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final SdkType sdkType;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ RuStoreInternalConfig create$default(Companion companion, Map map, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                map = null;
            }
            return companion.create(map);
        }

        @NotNull
        public final RuStoreInternalConfig create(@Nullable Map<String, ? extends Object> map) {
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (map == null) {
                return new RuStoreInternalConfig(SdkType.KOTLIN, defaultConstructorMarker);
            }
            SdkType fromMap = SdkType.Companion.fromMap(map);
            if (fromMap == null) {
                fromMap = SdkType.KOTLIN;
            }
            return new RuStoreInternalConfig(fromMap, defaultConstructorMarker);
        }

        private Companion() {
        }
    }

    public /* synthetic */ RuStoreInternalConfig(SdkType sdkType, DefaultConstructorMarker defaultConstructorMarker) {
        this(sdkType);
    }

    @NotNull
    public final SdkType getSdkType() {
        return this.sdkType;
    }

    private RuStoreInternalConfig(SdkType sdkType) {
        this.sdkType = sdkType;
    }
}
