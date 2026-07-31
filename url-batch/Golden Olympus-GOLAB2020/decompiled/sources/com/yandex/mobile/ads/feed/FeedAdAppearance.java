package com.yandex.mobile.ads.feed;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class FeedAdAppearance {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final Integer f22470a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final Double f22471b;

    @Metadata
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final int f22472a;

        /* renamed from: b, reason: collision with root package name */
        @Nullable
        private Double f22473b;

        public Builder(int i4) {
            this.f22472a = i4;
        }

        @NotNull
        public final FeedAdAppearance build() {
            return new FeedAdAppearance(Integer.valueOf(this.f22472a), this.f22473b);
        }

        @NotNull
        public final Builder setCardCornerRadius(@Nullable Double d4) {
            this.f22473b = d4;
            return this;
        }
    }

    public FeedAdAppearance(@Nullable Integer num, @Nullable Double d4) {
        this.f22470a = num;
        this.f22471b = d4;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(FeedAdAppearance.class, obj.getClass())) {
            return false;
        }
        FeedAdAppearance feedAdAppearance = (FeedAdAppearance) obj;
        if (Intrinsics.areEqual(this.f22470a, feedAdAppearance.f22470a)) {
            return Intrinsics.areEqual(this.f22471b, feedAdAppearance.f22471b);
        }
        return false;
    }

    @Nullable
    public final Double getCardCornerRadius() {
        return this.f22471b;
    }

    @Nullable
    public final Integer getCardWidth() {
        return this.f22470a;
    }

    public int hashCode() {
        Integer num = this.f22470a;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Double d4 = this.f22471b;
        return hashCode + (d4 != null ? d4.hashCode() : 0);
    }
}
