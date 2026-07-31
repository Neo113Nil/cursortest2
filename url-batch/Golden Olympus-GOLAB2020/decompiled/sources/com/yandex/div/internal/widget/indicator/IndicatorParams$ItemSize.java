package com.yandex.div.internal.widget.indicator;

import W1.m;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public abstract class IndicatorParams$ItemSize {

    @Metadata
    public static final class Circle extends IndicatorParams$ItemSize {
        private float radius;

        public Circle(float f4) {
            super(null);
            this.radius = f4;
        }

        @NotNull
        public final Circle copy(float f4) {
            return new Circle(f4);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Circle) && Float.compare(this.radius, ((Circle) obj).radius) == 0;
        }

        public final float getRadius() {
            return this.radius;
        }

        public int hashCode() {
            return Float.hashCode(this.radius);
        }

        @NotNull
        public String toString() {
            return "Circle(radius=" + this.radius + ')';
        }
    }

    @Metadata
    public static final class RoundedRect extends IndicatorParams$ItemSize {
        private float cornerRadius;
        private float itemHeight;
        private float itemWidth;

        public RoundedRect(float f4, float f5, float f6) {
            super(null);
            this.itemWidth = f4;
            this.itemHeight = f5;
            this.cornerRadius = f6;
        }

        public static /* synthetic */ RoundedRect copy$default(RoundedRect roundedRect, float f4, float f5, float f6, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                f4 = roundedRect.itemWidth;
            }
            if ((i4 & 2) != 0) {
                f5 = roundedRect.itemHeight;
            }
            if ((i4 & 4) != 0) {
                f6 = roundedRect.cornerRadius;
            }
            return roundedRect.copy(f4, f5, f6);
        }

        @NotNull
        public final RoundedRect copy(float f4, float f5, float f6) {
            return new RoundedRect(f4, f5, f6);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RoundedRect)) {
                return false;
            }
            RoundedRect roundedRect = (RoundedRect) obj;
            return Float.compare(this.itemWidth, roundedRect.itemWidth) == 0 && Float.compare(this.itemHeight, roundedRect.itemHeight) == 0 && Float.compare(this.cornerRadius, roundedRect.cornerRadius) == 0;
        }

        public final float getCornerRadius() {
            return this.cornerRadius;
        }

        public final float getItemHeight() {
            return this.itemHeight;
        }

        public final float getItemWidth() {
            return this.itemWidth;
        }

        public int hashCode() {
            return (((Float.hashCode(this.itemWidth) * 31) + Float.hashCode(this.itemHeight)) * 31) + Float.hashCode(this.cornerRadius);
        }

        @NotNull
        public String toString() {
            return "RoundedRect(itemWidth=" + this.itemWidth + ", itemHeight=" + this.itemHeight + ", cornerRadius=" + this.cornerRadius + ')';
        }
    }

    public /* synthetic */ IndicatorParams$ItemSize(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final float getHeight() {
        if (this instanceof RoundedRect) {
            return ((RoundedRect) this).getItemHeight();
        }
        if (this instanceof Circle) {
            return ((Circle) this).getRadius() * 2;
        }
        throw new m();
    }

    public final float getWidth() {
        if (this instanceof RoundedRect) {
            return ((RoundedRect) this).getItemWidth();
        }
        if (this instanceof Circle) {
            return ((Circle) this).getRadius() * 2;
        }
        throw new m();
    }

    private IndicatorParams$ItemSize() {
    }
}
