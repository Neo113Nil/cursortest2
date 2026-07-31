package io.appmetrica.analytics.internal;

import com.ironsource.b9;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public enum CounterConfigurationReporterType {
    MAIN(b9.h.f15466Z),
    MANUAL("manual"),
    SELF_SDK("self_sdk"),
    COMMUTATION("commutation"),
    SELF_DIAGNOSTIC_MAIN("self_diagnostic_main"),
    SELF_DIAGNOSTIC_MANUAL("self_diagnostic_manual"),
    CRASH("crash");


    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f40417a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CounterConfigurationReporterType fromStringValue(@Nullable String str) {
            CounterConfigurationReporterType counterConfigurationReporterType;
            CounterConfigurationReporterType[] values = CounterConfigurationReporterType.values();
            int length = values.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    counterConfigurationReporterType = null;
                    break;
                }
                counterConfigurationReporterType = values[i4];
                if (Intrinsics.areEqual(counterConfigurationReporterType.getStringValue(), str)) {
                    break;
                }
                i4++;
            }
            return counterConfigurationReporterType == null ? CounterConfigurationReporterType.MAIN : counterConfigurationReporterType;
        }

        private Companion() {
        }
    }

    CounterConfigurationReporterType(String str) {
        this.f40417a = str;
    }

    @NotNull
    public static final CounterConfigurationReporterType fromStringValue(@Nullable String str) {
        return Companion.fromStringValue(str);
    }

    @NotNull
    public final String getStringValue() {
        return this.f40417a;
    }
}
