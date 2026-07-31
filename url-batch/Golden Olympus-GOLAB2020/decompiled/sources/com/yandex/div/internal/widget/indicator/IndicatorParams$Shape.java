package com.yandex.div.internal.widget.indicator;

import com.yandex.div.internal.widget.indicator.IndicatorParams$ItemSize;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public abstract class IndicatorParams$Shape {

    @Metadata
    public static final class Circle extends IndicatorParams$Shape {
        private final int color;

        @NotNull
        private final IndicatorParams$ItemSize.Circle itemSize;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Circle(int i4, @NotNull IndicatorParams$ItemSize.Circle itemSize) {
            super(null);
            Intrinsics.checkNotNullParameter(itemSize, "itemSize");
            this.color = i4;
            this.itemSize = itemSize;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Circle)) {
                return false;
            }
            Circle circle = (Circle) obj;
            return this.color == circle.color && Intrinsics.areEqual(this.itemSize, circle.itemSize);
        }

        @Override // com.yandex.div.internal.widget.indicator.IndicatorParams$Shape
        public int getColor() {
            return this.color;
        }

        public int hashCode() {
            return (Integer.hashCode(this.color) * 31) + this.itemSize.hashCode();
        }

        @NotNull
        public String toString() {
            return "Circle(color=" + this.color + ", itemSize=" + this.itemSize + ')';
        }

        @Override // com.yandex.div.internal.widget.indicator.IndicatorParams$Shape
        @NotNull
        public IndicatorParams$ItemSize.Circle getItemSize() {
            return this.itemSize;
        }
    }

    @Metadata
    public static final class RoundedRect extends IndicatorParams$Shape {
        private final int color;

        @NotNull
        private final IndicatorParams$ItemSize.RoundedRect itemSize;
        private final int strokeColor;
        private final float strokeWidth;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RoundedRect(int i4, @NotNull IndicatorParams$ItemSize.RoundedRect itemSize, float f4, int i5) {
            super(null);
            Intrinsics.checkNotNullParameter(itemSize, "itemSize");
            this.color = i4;
            this.itemSize = itemSize;
            this.strokeWidth = f4;
            this.strokeColor = i5;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RoundedRect)) {
                return false;
            }
            RoundedRect roundedRect = (RoundedRect) obj;
            return this.color == roundedRect.color && Intrinsics.areEqual(this.itemSize, roundedRect.itemSize) && Float.compare(this.strokeWidth, roundedRect.strokeWidth) == 0 && this.strokeColor == roundedRect.strokeColor;
        }

        @Override // com.yandex.div.internal.widget.indicator.IndicatorParams$Shape
        public int getColor() {
            return this.color;
        }

        public final int getStrokeColor() {
            return this.strokeColor;
        }

        public final float getStrokeWidth() {
            return this.strokeWidth;
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.color) * 31) + this.itemSize.hashCode()) * 31) + Float.hashCode(this.strokeWidth)) * 31) + Integer.hashCode(this.strokeColor);
        }

        @NotNull
        public String toString() {
            return "RoundedRect(color=" + this.color + ", itemSize=" + this.itemSize + ", strokeWidth=" + this.strokeWidth + ", strokeColor=" + this.strokeColor + ')';
        }

        @Override // com.yandex.div.internal.widget.indicator.IndicatorParams$Shape
        @NotNull
        public IndicatorParams$ItemSize.RoundedRect getItemSize() {
            return this.itemSize;
        }
    }

    public /* synthetic */ IndicatorParams$Shape(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final int getBorderColor() {
        if (this instanceof RoundedRect) {
            return ((RoundedRect) this).getStrokeColor();
        }
        return 0;
    }

    public final float getBorderWidth() {
        if (this instanceof RoundedRect) {
            return ((RoundedRect) this).getStrokeWidth();
        }
        return 0.0f;
    }

    public abstract int getColor();

    @NotNull
    public abstract IndicatorParams$ItemSize getItemSize();

    private IndicatorParams$Shape() {
    }
}
