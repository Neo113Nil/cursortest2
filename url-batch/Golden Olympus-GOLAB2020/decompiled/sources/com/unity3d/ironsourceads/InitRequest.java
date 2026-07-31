package com.unity3d.ironsourceads;

import com.unity3d.ironsourceads.IronSourceAds;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class InitRequest {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f21886a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<IronSourceAds.AdFormat> f21887b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final LogLevel f21888c;

    @Metadata
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f21889a;

        /* renamed from: b, reason: collision with root package name */
        @Nullable
        private List<? extends IronSourceAds.AdFormat> f21890b;

        /* renamed from: c, reason: collision with root package name */
        @Nullable
        private LogLevel f21891c;

        public Builder(@NotNull String appKey) {
            Intrinsics.checkNotNullParameter(appKey, "appKey");
            this.f21889a = appKey;
        }

        @NotNull
        public final InitRequest build() {
            String str = this.f21889a;
            List<? extends IronSourceAds.AdFormat> list = this.f21890b;
            if (list == null) {
                list = CollectionsKt.emptyList();
            }
            LogLevel logLevel = this.f21891c;
            if (logLevel == null) {
                logLevel = LogLevel.NONE;
            }
            return new InitRequest(str, list, logLevel, null);
        }

        @NotNull
        public final String getAppKey() {
            return this.f21889a;
        }

        @NotNull
        public final Builder withLegacyAdFormats(@NotNull List<? extends IronSourceAds.AdFormat> legacyAdFormats) {
            Intrinsics.checkNotNullParameter(legacyAdFormats, "legacyAdFormats");
            this.f21890b = legacyAdFormats;
            return this;
        }

        @NotNull
        public final Builder withLogLevel(@NotNull LogLevel logLevel) {
            Intrinsics.checkNotNullParameter(logLevel, "logLevel");
            this.f21891c = logLevel;
            return this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private InitRequest(String str, List<? extends IronSourceAds.AdFormat> list, LogLevel logLevel) {
        this.f21886a = str;
        this.f21887b = list;
        this.f21888c = logLevel;
    }

    @NotNull
    public final String getAppKey() {
        return this.f21886a;
    }

    @NotNull
    public final List<IronSourceAds.AdFormat> getLegacyAdFormats() {
        return this.f21887b;
    }

    @NotNull
    public final LogLevel getLogLevel() {
        return this.f21888c;
    }

    public /* synthetic */ InitRequest(String str, List list, LogLevel logLevel, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, logLevel);
    }
}
