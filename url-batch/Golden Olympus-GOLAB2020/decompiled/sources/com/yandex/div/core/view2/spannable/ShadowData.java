package com.yandex.div.core.view2.spannable;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class ShadowData {
    private final int color;
    private final float offsetX;
    private final float offsetY;
    private final float radius;

    public ShadowData(float f4, float f5, float f6, int i4) {
        this.offsetX = f4;
        this.offsetY = f5;
        this.radius = f6;
        this.color = i4;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShadowData)) {
            return false;
        }
        ShadowData shadowData = (ShadowData) obj;
        return Float.compare(this.offsetX, shadowData.offsetX) == 0 && Float.compare(this.offsetY, shadowData.offsetY) == 0 && Float.compare(this.radius, shadowData.radius) == 0 && this.color == shadowData.color;
    }

    public final int getColor() {
        return this.color;
    }

    public final float getOffsetX() {
        return this.offsetX;
    }

    public final float getOffsetY() {
        return this.offsetY;
    }

    public final float getRadius() {
        return this.radius;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.offsetX) * 31) + Float.hashCode(this.offsetY)) * 31) + Float.hashCode(this.radius)) * 31) + Integer.hashCode(this.color);
    }

    @NotNull
    public String toString() {
        return "ShadowData(offsetX=" + this.offsetX + ", offsetY=" + this.offsetY + ", radius=" + this.radius + ", color=" + this.color + ')';
    }
}
