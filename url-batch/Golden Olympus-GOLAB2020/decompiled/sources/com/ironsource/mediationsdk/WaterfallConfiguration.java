package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.o9;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public final class WaterfallConfiguration {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final Double f17268a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final Double f17269b;

    @Metadata
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final WaterfallConfigurationBuilder builder() {
            return new WaterfallConfigurationBuilder();
        }

        @NotNull
        public final WaterfallConfiguration empty() {
            return builder().build();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata
    public static final class WaterfallConfigurationBuilder {

        /* renamed from: a, reason: collision with root package name */
        @Nullable
        private Double f17270a;

        /* renamed from: b, reason: collision with root package name */
        @Nullable
        private Double f17271b;

        @NotNull
        public final WaterfallConfiguration build() {
            return new WaterfallConfiguration(this, null);
        }

        @Nullable
        public final Double getCeiling$mediationsdk_release() {
            return this.f17271b;
        }

        @Nullable
        public final Double getFloor$mediationsdk_release() {
            return this.f17270a;
        }

        @NotNull
        public final WaterfallConfigurationBuilder setCeiling(double d4) {
            this.f17271b = Double.valueOf(d4);
            return this;
        }

        public final void setCeiling$mediationsdk_release(@Nullable Double d4) {
            this.f17271b = d4;
        }

        @NotNull
        public final WaterfallConfigurationBuilder setFloor(double d4) {
            this.f17270a = Double.valueOf(d4);
            return this;
        }

        public final void setFloor$mediationsdk_release(@Nullable Double d4) {
            this.f17270a = d4;
        }
    }

    private WaterfallConfiguration(WaterfallConfigurationBuilder waterfallConfigurationBuilder) {
        this.f17268a = waterfallConfigurationBuilder.getFloor$mediationsdk_release();
        this.f17269b = waterfallConfigurationBuilder.getCeiling$mediationsdk_release();
    }

    @NotNull
    public static final WaterfallConfigurationBuilder builder() {
        return Companion.builder();
    }

    @NotNull
    public static final WaterfallConfiguration empty() {
        return Companion.empty();
    }

    @Nullable
    public final Double getCeiling() {
        return this.f17269b;
    }

    @Nullable
    public final Double getFloor() {
        return this.f17268a;
    }

    @NotNull
    public final String toJsonString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ceiling", this.f17269b);
            jSONObject.put("floor", this.f17268a);
        } catch (JSONException e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.getMessage());
        }
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "json.toString()");
        return jSONObject2;
    }

    @NotNull
    public String toString() {
        return "WaterfallConfiguration" + toJsonString();
    }

    public /* synthetic */ WaterfallConfiguration(WaterfallConfigurationBuilder waterfallConfigurationBuilder, DefaultConstructorMarker defaultConstructorMarker) {
        this(waterfallConfigurationBuilder);
    }
}
