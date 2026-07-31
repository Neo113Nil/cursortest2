package ru.rustore.sdk.core.config;

import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public enum SdkType {
    KOTLIN("kotlin"),
    UNITY(PluginErrorDetails.Platform.UNITY),
    FLUTTER(PluginErrorDetails.Platform.FLUTTER),
    UNREAL_ENGINE("unreal-engine"),
    GODOT("godot"),
    REACT_NATIVE("react-native"),
    CONSTRUCT("construct"),
    DEFOLD("defold");


    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final String KEY = "type";

    @NotNull
    private final String value;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final SdkType fromValue(String str) {
            SdkType sdkType = SdkType.KOTLIN;
            if (Intrinsics.areEqual(str, sdkType.getValue())) {
                return sdkType;
            }
            SdkType sdkType2 = SdkType.UNITY;
            if (Intrinsics.areEqual(str, sdkType2.getValue())) {
                return sdkType2;
            }
            SdkType sdkType3 = SdkType.FLUTTER;
            if (Intrinsics.areEqual(str, sdkType3.getValue())) {
                return sdkType3;
            }
            SdkType sdkType4 = SdkType.UNREAL_ENGINE;
            if (Intrinsics.areEqual(str, sdkType4.getValue())) {
                return sdkType4;
            }
            SdkType sdkType5 = SdkType.GODOT;
            if (Intrinsics.areEqual(str, sdkType5.getValue())) {
                return sdkType5;
            }
            SdkType sdkType6 = SdkType.REACT_NATIVE;
            if (Intrinsics.areEqual(str, sdkType6.getValue())) {
                return sdkType6;
            }
            SdkType sdkType7 = SdkType.CONSTRUCT;
            if (Intrinsics.areEqual(str, sdkType7.getValue())) {
                return sdkType7;
            }
            SdkType sdkType8 = SdkType.DEFOLD;
            if (Intrinsics.areEqual(str, sdkType8.getValue())) {
                return sdkType8;
            }
            return null;
        }

        @Nullable
        public final SdkType fromMap(@NotNull Map<String, ? extends Object> map) {
            Intrinsics.checkNotNullParameter(map, "map");
            Object obj = map.get("type");
            return fromValue(obj instanceof String ? (String) obj : null);
        }

        private Companion() {
        }
    }

    SdkType(String str) {
        this.value = str;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
