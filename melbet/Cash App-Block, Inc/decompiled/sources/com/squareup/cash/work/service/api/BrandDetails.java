package com.squareup.cash.work.service.api;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class BrandDetails {
    public final ThemedImage artworkImage;
    public final ThemedColor backgroundColor;
    public final ThemedColor foregroundColor;
    public final ThemedColor outlineColor;

    public BrandDetails(ThemedColor themedColor, ThemedColor themedColor2, ThemedImage themedImage, ThemedColor themedColor3) {
        this.foregroundColor = themedColor;
        this.backgroundColor = themedColor2;
        this.artworkImage = themedImage;
        this.outlineColor = themedColor3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrandDetails)) {
            return false;
        }
        BrandDetails brandDetails = (BrandDetails) obj;
        return Intrinsics.areEqual(this.foregroundColor, brandDetails.foregroundColor) && Intrinsics.areEqual(this.backgroundColor, brandDetails.backgroundColor) && Intrinsics.areEqual(this.artworkImage, brandDetails.artworkImage) && Intrinsics.areEqual(this.outlineColor, brandDetails.outlineColor);
    }

    public final int hashCode() {
        ThemedColor themedColor = this.foregroundColor;
        int hashCode = (themedColor == null ? 0 : themedColor.hashCode()) * 31;
        ThemedColor themedColor2 = this.backgroundColor;
        int hashCode2 = (hashCode + (themedColor2 == null ? 0 : themedColor2.hashCode())) * 31;
        ThemedImage themedImage = this.artworkImage;
        int hashCode3 = (hashCode2 + (themedImage == null ? 0 : themedImage.hashCode())) * 31;
        ThemedColor themedColor3 = this.outlineColor;
        return hashCode3 + (themedColor3 != null ? themedColor3.hashCode() : 0);
    }

    public final String toString() {
        return "BrandDetails(foregroundColor=" + this.foregroundColor + ", backgroundColor=" + this.backgroundColor + ", artworkImage=" + this.artworkImage + ", outlineColor=" + this.outlineColor + ")";
    }
}
