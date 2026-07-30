package com.google.android.exoplayer2.util;

import com.google.errorprone.annotations.CanIgnoreReturnValue;

@Deprecated
/* loaded from: classes3.dex */
public class FrameInfo {
    public final int height;
    public final long offsetToAddUs;
    public final float pixelWidthHeightRatio;
    public final int width;

    public static final class Builder {
        private int height;
        private long offsetToAddUs;
        private float pixelWidthHeightRatio;
        private int width;

        public Builder(int i8, int i9) {
            this.width = i8;
            this.height = i9;
            this.pixelWidthHeightRatio = 1.0f;
        }

        public FrameInfo build() {
            return new FrameInfo(this.width, this.height, this.pixelWidthHeightRatio, this.offsetToAddUs);
        }

        @CanIgnoreReturnValue
        public Builder setHeight(int i8) {
            this.height = i8;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setOffsetToAddUs(long j8) {
            this.offsetToAddUs = j8;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setPixelWidthHeightRatio(float f8) {
            this.pixelWidthHeightRatio = f8;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setWidth(int i8) {
            this.width = i8;
            return this;
        }

        public Builder(FrameInfo frameInfo) {
            this.width = frameInfo.width;
            this.height = frameInfo.height;
            this.pixelWidthHeightRatio = frameInfo.pixelWidthHeightRatio;
            this.offsetToAddUs = frameInfo.offsetToAddUs;
        }
    }

    private FrameInfo(int i8, int i9, float f8, long j8) {
        Assertions.checkArgument(i8 > 0, "width must be positive, but is: " + i8);
        Assertions.checkArgument(i9 > 0, "height must be positive, but is: " + i9);
        this.width = i8;
        this.height = i9;
        this.pixelWidthHeightRatio = f8;
        this.offsetToAddUs = j8;
    }
}
