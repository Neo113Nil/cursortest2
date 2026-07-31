package com.unity3d.mediation;

import com.unity3d.mediation.LevelPlay;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class LevelPlayInitRequest {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f21966a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f21967b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<LevelPlay.AdFormat> f21968c;

    @Metadata
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f21969a;

        /* renamed from: b, reason: collision with root package name */
        @Nullable
        private String f21970b;

        /* renamed from: c, reason: collision with root package name */
        @Nullable
        private List<? extends LevelPlay.AdFormat> f21971c;

        public Builder(@NotNull String appKey) {
            Intrinsics.checkNotNullParameter(appKey, "appKey");
            this.f21969a = appKey;
        }

        @NotNull
        public final LevelPlayInitRequest build() {
            String str = this.f21969a;
            String str2 = this.f21970b;
            List<? extends LevelPlay.AdFormat> list = this.f21971c;
            if (list == null) {
                list = CollectionsKt.emptyList();
            }
            return new LevelPlayInitRequest(str, str2, list, null);
        }

        @NotNull
        public final String getAppKey() {
            return this.f21969a;
        }

        @NotNull
        public final Builder withLegacyAdFormats(@NotNull List<? extends LevelPlay.AdFormat> legacyAdFormats) {
            Intrinsics.checkNotNullParameter(legacyAdFormats, "legacyAdFormats");
            this.f21971c = legacyAdFormats;
            return this;
        }

        @NotNull
        public final Builder withUserId(@NotNull String userId) {
            Intrinsics.checkNotNullParameter(userId, "userId");
            this.f21970b = userId;
            return this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private LevelPlayInitRequest(String str, String str2, List<? extends LevelPlay.AdFormat> list) {
        this.f21966a = str;
        this.f21967b = str2;
        this.f21968c = list;
    }

    @NotNull
    public final String getAppKey() {
        return this.f21966a;
    }

    @NotNull
    public final List<LevelPlay.AdFormat> getLegacyAdFormats() {
        return this.f21968c;
    }

    @Nullable
    public final String getUserId() {
        return this.f21967b;
    }

    public /* synthetic */ LevelPlayInitRequest(String str, String str2, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, list);
    }
}
