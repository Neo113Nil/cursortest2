package com.withpersona.sdk2.camera.analyzers;

import com.withpersona.sdk2.camera.BarcodeInfo;
import com.withpersona.sdk2.camera.ExtractedTexts;
import com.withpersona.sdk2.camera.ImageIdMetadata;
import com.withpersona.sdk2.camera.ImageLightCondition;
import com.withpersona.sdk2.camera.ParsedIdSideOrNone;

/* loaded from: classes5.dex */
public abstract class AnalysisData {

    public final class BarcodeAnalysisData extends AnalysisData {
        public final BarcodeInfo extractedBarcode;

        public BarcodeAnalysisData(BarcodeInfo barcodeInfo) {
            this.extractedBarcode = barcodeInfo;
        }
    }

    public final class Empty extends AnalysisData {
        public static final Empty INSTANCE = new Empty();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Empty);
        }

        public final int hashCode() {
            return 801215118;
        }

        public final String toString() {
            return "Empty";
        }
    }

    public final class FrontOrBackData extends AnalysisData {
        public final AnalysisData frontOrBackData;
        public final ParsedIdSideOrNone.Side side;

        public FrontOrBackData(ParsedIdSideOrNone.Side side, AnalysisData analysisData) {
            side.getClass();
            analysisData.getClass();
            this.side = side;
            this.frontOrBackData = analysisData;
        }
    }

    public final class IdFrontAnalysisData extends AnalysisData {
        public final ImageIdMetadata metadata;

        public IdFrontAnalysisData(ImageIdMetadata imageIdMetadata) {
            this.metadata = imageIdMetadata;
        }
    }

    public final class LightConditionData extends AnalysisData {
        public final ImageLightCondition imageLightCondition;

        public LightConditionData(ImageLightCondition imageLightCondition) {
            this.imageLightCondition = imageLightCondition;
        }
    }

    public final class TextExtractionData extends AnalysisData {
        public final ExtractedTexts extractedTexts;

        public TextExtractionData(ExtractedTexts extractedTexts) {
            this.extractedTexts = extractedTexts;
        }
    }
}
