package com.yandex.mobile.ads.instream;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public final class InstreamAdRequestConfiguration {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f35843a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f35844b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final Map<String, String> f35845c;

    @Metadata
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f35846a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private String f35847b;

        /* renamed from: c, reason: collision with root package name */
        @Nullable
        private Map<String, String> f35848c;

        public Builder(@NotNull String pageId) {
            Intrinsics.checkNotNullParameter(pageId, "pageId");
            this.f35846a = pageId;
            this.f35847b = "0";
        }

        @NotNull
        public final InstreamAdRequestConfiguration build() {
            return new InstreamAdRequestConfiguration(this.f35847b, this.f35846a, this.f35848c, null);
        }

        @NotNull
        public final Builder setCategoryId(@Nullable String str) {
            if (str == null) {
                str = "0";
            }
            if (str.length() == 0) {
                throw new IllegalArgumentException("Passed categoryId is empty");
            }
            this.f35847b = str;
            return this;
        }

        @NotNull
        public final Builder setParameters(@Nullable Map<String, String> map) {
            if (map == null) {
                map = MapsKt.emptyMap();
            }
            this.f35848c = map;
            return this;
        }
    }

    public /* synthetic */ InstreamAdRequestConfiguration(String str, String str2, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, map);
    }

    @NotNull
    public final String getCategoryId() {
        return this.f35843a;
    }

    @NotNull
    public final String getPageId() {
        return this.f35844b;
    }

    @Nullable
    public final Map<String, String> getParameters() {
        return this.f35845c;
    }

    private InstreamAdRequestConfiguration(String str, String str2, Map<String, String> map) {
        this.f35843a = str;
        this.f35844b = str2;
        this.f35845c = map;
    }
}
