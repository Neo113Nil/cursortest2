package com.valentinilk.shimmer;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes8.dex */
public final class ShimmerArea {
    public long pivotPoint;
    public final float reducedRotation;
    public Rect requestedShimmerBounds;
    public Rect shimmerBounds;
    public long shimmerSize;
    public float translationDistance;
    public Rect viewBounds;
    public final float widthOfShimmer;

    public ShimmerArea(float f, float f2) {
        this.widthOfShimmer = f;
        if (f2 < RecyclerView.DECELERATION_RATE) {
            a$$ExternalSyntheticBUOutline0.m$3("The shimmer's rotation must be a positive number");
            throw null;
        }
        this.reducedRotation = (((-Math.abs((f2 % 180.0f) - 90.0f)) + 90.0f) / 180.0f) * 3.1415927f;
        this.shimmerSize = 0L;
        this.pivotPoint = 9205357640488583168L;
        Rect rect = Rect.Zero;
        this.shimmerBounds = rect;
        this.viewBounds = rect;
    }

    public final void computeShimmerBounds() {
        if (this.viewBounds.isEmpty()) {
            return;
        }
        Rect rect = this.requestedShimmerBounds;
        if (rect == null) {
            rect = this.viewBounds;
        }
        this.shimmerBounds = rect;
        this.pivotPoint = Offset.m626plusMKHz9U(this.viewBounds.m636getTopLeftF1C5BW0() ^ (-9223372034707292160L), this.shimmerBounds.m633getCenterF1C5BW0());
        long m634getSizeNHjbRc = this.shimmerBounds.m634getSizeNHjbRc();
        if (Size.m639equalsimpl0(this.shimmerSize, m634getSizeNHjbRc)) {
            return;
        }
        this.shimmerSize = m634getSizeNHjbRc;
        float intBitsToFloat = Float.intBitsToFloat((int) (m634getSizeNHjbRc >> 32)) / 2.0f;
        this.translationDistance = (((float) Math.cos(((float) Math.acos(intBitsToFloat / r2)) - this.reducedRotation)) * ((float) Math.sqrt(((float) Math.pow(intBitsToFloat, 2.0d)) + ((float) Math.pow(Float.intBitsToFloat((int) (this.shimmerSize & BodyPartID.bodyIdMax)) / 2.0f, 2.0d)))) * 2.0f) + this.widthOfShimmer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ShimmerArea.class == obj.getClass()) {
            ShimmerArea shimmerArea = (ShimmerArea) obj;
            if (this.widthOfShimmer == shimmerArea.widthOfShimmer && this.reducedRotation == shimmerArea.reducedRotation) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.reducedRotation) + (Float.hashCode(this.widthOfShimmer) * 31);
    }
}
