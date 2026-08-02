package com.withpersona.sdk2.camera;

import android.graphics.Bitmap;
import com.knotapi.knot.utilities.Constants;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public interface ParsedIdSideOrNone {

    /* loaded from: classes5.dex */
    public final class None implements ParsedIdSideOrNone {
        public final ImageLightCondition imageLightCondition;

        public None(ImageLightCondition imageLightCondition) {
            this.imageLightCondition = imageLightCondition;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof None) && Intrinsics.areEqual(this.imageLightCondition, ((None) obj).imageLightCondition);
        }

        @Override // com.withpersona.sdk2.camera.ParsedIdSideOrNone
        public final ImageLightCondition getImageLightCondition() {
            return this.imageLightCondition;
        }

        public final int hashCode() {
            ImageLightCondition imageLightCondition = this.imageLightCondition;
            if (imageLightCondition == null) {
                return 0;
            }
            return imageLightCondition.hashCode();
        }

        public final String toString() {
            return "None(imageLightCondition=" + this.imageLightCondition + ")";
        }
    }

    /* loaded from: classes5.dex */
    public final class ParsedIdSide implements ParsedIdSideOrNone {
        public final Bitmap bitmap;
        public final BarcodeInfo extractedBarcode;
        public final ExtractedTexts extractedTexts;
        public final ImageLightCondition imageLightCondition;
        public final ImageIdMetadata metadata;
        public final Side side;

        public ParsedIdSide(Side side, Bitmap bitmap, ImageIdMetadata imageIdMetadata, BarcodeInfo barcodeInfo, ExtractedTexts extractedTexts, ImageLightCondition imageLightCondition) {
            side.getClass();
            this.side = side;
            this.bitmap = bitmap;
            this.metadata = imageIdMetadata;
            this.extractedBarcode = barcodeInfo;
            this.extractedTexts = extractedTexts;
            this.imageLightCondition = imageLightCondition;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ParsedIdSide)) {
                return false;
            }
            ParsedIdSide parsedIdSide = (ParsedIdSide) obj;
            return this.side == parsedIdSide.side && this.bitmap.equals(parsedIdSide.bitmap) && Intrinsics.areEqual(this.metadata, parsedIdSide.metadata) && Intrinsics.areEqual(this.extractedBarcode, parsedIdSide.extractedBarcode) && Intrinsics.areEqual(this.extractedTexts, parsedIdSide.extractedTexts) && Intrinsics.areEqual(this.imageLightCondition, parsedIdSide.imageLightCondition);
        }

        @Override // com.withpersona.sdk2.camera.ParsedIdSideOrNone
        public final ImageLightCondition getImageLightCondition() {
            return this.imageLightCondition;
        }

        public final int hashCode() {
            int hashCode = (this.bitmap.hashCode() + (this.side.hashCode() * 31)) * 31;
            ImageIdMetadata imageIdMetadata = this.metadata;
            int hashCode2 = (hashCode + (imageIdMetadata == null ? 0 : imageIdMetadata.textOnImage.hashCode())) * 31;
            BarcodeInfo barcodeInfo = this.extractedBarcode;
            int hashCode3 = (hashCode2 + (barcodeInfo == null ? 0 : barcodeInfo.hashCode())) * 31;
            ExtractedTexts extractedTexts = this.extractedTexts;
            int hashCode4 = (hashCode3 + (extractedTexts == null ? 0 : extractedTexts.hashCode())) * 31;
            ImageLightCondition imageLightCondition = this.imageLightCondition;
            return hashCode4 + (imageLightCondition != null ? imageLightCondition.hashCode() : 0);
        }

        public final String toString() {
            return "ParsedIdSide(side=" + this.side + ", bitmap=" + this.bitmap + ", metadata=" + this.metadata + ", extractedBarcode=" + this.extractedBarcode + ", extractedTexts=" + this.extractedTexts + ", imageLightCondition=" + this.imageLightCondition + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes5.dex */
    public final class Side {
        public static final /* synthetic */ Side[] $VALUES;
        public static final Side Back;
        public static final Side Front;

        static {
            Side side = new Side("Front", 0);
            Front = side;
            Side side2 = new Side(Constants.META_BACK_BUTTON, 1);
            Back = side2;
            $VALUES = new Side[]{side, side2};
        }

        public static Side valueOf(String str) {
            return (Side) Enum.valueOf(Side.class, str);
        }

        public static Side[] values() {
            return (Side[]) $VALUES.clone();
        }
    }

    ImageLightCondition getImageLightCondition();
}
