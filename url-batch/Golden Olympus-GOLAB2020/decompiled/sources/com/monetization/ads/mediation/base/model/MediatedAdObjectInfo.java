package com.monetization.ads.mediation.base.model;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class MediatedAdObjectInfo {

    @Nullable
    private final String adContent;

    @Nullable
    private final String adId;

    @Nullable
    private final String adUnitId;

    @Nullable
    private final Map<String, Object> extraData;

    @Metadata
    public static final class Builder {

        @Nullable
        private String adContent;

        @Nullable
        private String adId;

        @Nullable
        private String adUnitId;

        @Nullable
        private Map<String, ? extends Object> extraData;

        @NotNull
        public final MediatedAdObjectInfo build() {
            return new MediatedAdObjectInfo(this.adContent, this.adUnitId, this.adId, this.extraData, null);
        }

        @NotNull
        public final Builder setAdContent(@Nullable String str) {
            this.adContent = str;
            return this;
        }

        @NotNull
        public final Builder setAdId(@Nullable String str) {
            this.adId = str;
            return this;
        }

        @NotNull
        public final Builder setAdUnitId(@Nullable String str) {
            this.adUnitId = str;
            return this;
        }

        @NotNull
        public final Builder setExtraData(@Nullable Map<String, ? extends Object> map) {
            this.extraData = map;
            return this;
        }
    }

    public /* synthetic */ MediatedAdObjectInfo(String str, String str2, String str3, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, map);
    }

    @Nullable
    public final String getAdContent() {
        return this.adContent;
    }

    @Nullable
    public final String getAdId() {
        return this.adId;
    }

    @Nullable
    public final String getAdUnitId() {
        return this.adUnitId;
    }

    @Nullable
    public final Map<String, Object> getExtraData() {
        return this.extraData;
    }

    private MediatedAdObjectInfo(String str, String str2, String str3, Map<String, ? extends Object> map) {
        this.adContent = str;
        this.adUnitId = str2;
        this.adId = str3;
        this.extraData = map;
    }
}
