package com.monetization.ads.mediation.nativeads;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class MediatedNativeAdMedia {

    /* renamed from: a, reason: collision with root package name */
    private final float f20821a;

    @Metadata
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final float f20822a;

        public Builder(float f4) {
            this.f20822a = f4;
        }

        @NotNull
        public final MediatedNativeAdMedia build() {
            return new MediatedNativeAdMedia(this.f20822a, null);
        }

        public final float getAspectRatio() {
            return this.f20822a;
        }
    }

    public /* synthetic */ MediatedNativeAdMedia(float f4, DefaultConstructorMarker defaultConstructorMarker) {
        this(f4);
    }

    public final float getAspectRatio() {
        return this.f20821a;
    }

    private MediatedNativeAdMedia(float f4) {
        this.f20821a = f4;
    }
}
