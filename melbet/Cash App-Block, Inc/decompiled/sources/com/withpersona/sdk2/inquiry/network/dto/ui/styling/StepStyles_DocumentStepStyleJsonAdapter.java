package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010'\u001a\u00020(H\u0016J\u0010\u0010)\u001a\u00020\u00022\u0006\u0010*\u001a\u00020+H\u0016J\u001a\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles_DocumentStepStyleJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "nullableHeaderButtonColorStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$HeaderButtonColorStyle;", "nullableStepBackgroundColorStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepBackgroundColorStyle;", "nullableStepBackgroundImageStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepBackgroundImageStyle;", "nullableDocumentStepTitleComponentStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepTitleComponentStyle;", "nullableDocumentStepTextBasedComponentStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepTextBasedComponentStyle;", "nullableStepTextBasedComponentStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyle;", "nullableStepPrimaryButtonComponentStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepPrimaryButtonComponentStyle;", "nullableStepSecondaryButtonComponentStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepSecondaryButtonComponentStyle;", "nullableDocumentStepStrokeColorAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStrokeColor;", "nullableDocumentStepFillColorAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepFillColor;", "nullableDocumentStepBorderColorAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepBorderColor;", "nullableDocumentStepBorderRadiusAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepBorderRadius;", "nullableDocumentStepBorderWidthAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepBorderWidth;", "nullableStepPaddingStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepPaddingStyle;", "nullableCombinedStepAlignmentAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$CombinedStepAlignment;", "toString", "", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class StepStyles_DocumentStepStyleJsonAdapter extends JsonAdapter {
    private final JsonAdapter nullableCombinedStepAlignmentAdapter;
    private final JsonAdapter nullableDocumentStepBorderColorAdapter;
    private final JsonAdapter nullableDocumentStepBorderRadiusAdapter;
    private final JsonAdapter nullableDocumentStepBorderWidthAdapter;
    private final JsonAdapter nullableDocumentStepFillColorAdapter;
    private final JsonAdapter nullableDocumentStepStrokeColorAdapter;
    private final JsonAdapter nullableDocumentStepTextBasedComponentStyleAdapter;
    private final JsonAdapter nullableDocumentStepTitleComponentStyleAdapter;
    private final JsonAdapter nullableHeaderButtonColorStyleAdapter;
    private final JsonAdapter nullableStepBackgroundColorStyleAdapter;
    private final JsonAdapter nullableStepBackgroundImageStyleAdapter;
    private final JsonAdapter nullableStepPaddingStyleAdapter;
    private final JsonAdapter nullableStepPrimaryButtonComponentStyleAdapter;
    private final JsonAdapter nullableStepSecondaryButtonComponentStyleAdapter;
    private final JsonAdapter nullableStepTextBasedComponentStyleAdapter;
    private final JsonReader.Options options;

    public StepStyles_DocumentStepStyleJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("textColor", "backgroundColor", "backgroundImage", "titleStyle", "textStyle", "disclaimerStyle", "buttonPrimaryStyle", "buttonSecondaryStyle", "strokeColor", "fillColor", "borderColor", "borderRadius", "borderWidth", "padding", "alignment");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableHeaderButtonColorStyleAdapter = moshi.adapter(AttributeStyles.HeaderButtonColorStyle.class, emptySet, "headerButtonColor");
        this.nullableStepBackgroundColorStyleAdapter = moshi.adapter(StepStyles.StepBackgroundColorStyle.class, emptySet, "backgroundColor");
        this.nullableStepBackgroundImageStyleAdapter = moshi.adapter(StepStyles.StepBackgroundImageStyle.class, emptySet, "backgroundImage");
        this.nullableDocumentStepTitleComponentStyleAdapter = moshi.adapter(StepStyles.DocumentStepTitleComponentStyle.class, emptySet, "titleStyle");
        this.nullableDocumentStepTextBasedComponentStyleAdapter = moshi.adapter(StepStyles.DocumentStepTextBasedComponentStyle.class, emptySet, "textStyle");
        this.nullableStepTextBasedComponentStyleAdapter = moshi.adapter(StepStyles.StepTextBasedComponentStyle.class, emptySet, "disclaimerStyle");
        this.nullableStepPrimaryButtonComponentStyleAdapter = moshi.adapter(StepStyles.StepPrimaryButtonComponentStyle.class, emptySet, "buttonPrimaryStyle");
        this.nullableStepSecondaryButtonComponentStyleAdapter = moshi.adapter(StepStyles.StepSecondaryButtonComponentStyle.class, emptySet, "buttonSecondaryStyle");
        this.nullableDocumentStepStrokeColorAdapter = moshi.adapter(StepStyles.DocumentStepStrokeColor.class, emptySet, "strokeColor");
        this.nullableDocumentStepFillColorAdapter = moshi.adapter(StepStyles.DocumentStepFillColor.class, emptySet, "fillColor");
        this.nullableDocumentStepBorderColorAdapter = moshi.adapter(StepStyles.DocumentStepBorderColor.class, emptySet, "borderColor");
        this.nullableDocumentStepBorderRadiusAdapter = moshi.adapter(StepStyles.DocumentStepBorderRadius.class, emptySet, "borderRadius");
        this.nullableDocumentStepBorderWidthAdapter = moshi.adapter(StepStyles.DocumentStepBorderWidth.class, emptySet, "borderWidth");
        this.nullableStepPaddingStyleAdapter = moshi.adapter(StepStyles.StepPaddingStyle.class, emptySet, "padding");
        this.nullableCombinedStepAlignmentAdapter = moshi.adapter(StepStyles.CombinedStepAlignment.class, emptySet, "alignment");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public StepStyles.DocumentStepStyle fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        AttributeStyles.HeaderButtonColorStyle headerButtonColorStyle = null;
        StepStyles.StepBackgroundColorStyle stepBackgroundColorStyle = null;
        StepStyles.StepBackgroundImageStyle stepBackgroundImageStyle = null;
        StepStyles.DocumentStepTitleComponentStyle documentStepTitleComponentStyle = null;
        StepStyles.DocumentStepTextBasedComponentStyle documentStepTextBasedComponentStyle = null;
        StepStyles.StepTextBasedComponentStyle stepTextBasedComponentStyle = null;
        StepStyles.StepPrimaryButtonComponentStyle stepPrimaryButtonComponentStyle = null;
        StepStyles.StepSecondaryButtonComponentStyle stepSecondaryButtonComponentStyle = null;
        StepStyles.DocumentStepStrokeColor documentStepStrokeColor = null;
        StepStyles.DocumentStepFillColor documentStepFillColor = null;
        StepStyles.DocumentStepBorderColor documentStepBorderColor = null;
        StepStyles.DocumentStepBorderRadius documentStepBorderRadius = null;
        StepStyles.DocumentStepBorderWidth documentStepBorderWidth = null;
        StepStyles.StepPaddingStyle stepPaddingStyle = null;
        StepStyles.CombinedStepAlignment combinedStepAlignment = null;
        while (reader.hasNext()) {
            switch (reader.selectName(this.options)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    break;
                case 0:
                    headerButtonColorStyle = (AttributeStyles.HeaderButtonColorStyle) this.nullableHeaderButtonColorStyleAdapter.fromJson(reader);
                    break;
                case 1:
                    stepBackgroundColorStyle = (StepStyles.StepBackgroundColorStyle) this.nullableStepBackgroundColorStyleAdapter.fromJson(reader);
                    break;
                case 2:
                    stepBackgroundImageStyle = (StepStyles.StepBackgroundImageStyle) this.nullableStepBackgroundImageStyleAdapter.fromJson(reader);
                    break;
                case 3:
                    documentStepTitleComponentStyle = (StepStyles.DocumentStepTitleComponentStyle) this.nullableDocumentStepTitleComponentStyleAdapter.fromJson(reader);
                    break;
                case 4:
                    documentStepTextBasedComponentStyle = (StepStyles.DocumentStepTextBasedComponentStyle) this.nullableDocumentStepTextBasedComponentStyleAdapter.fromJson(reader);
                    break;
                case 5:
                    stepTextBasedComponentStyle = (StepStyles.StepTextBasedComponentStyle) this.nullableStepTextBasedComponentStyleAdapter.fromJson(reader);
                    break;
                case 6:
                    stepPrimaryButtonComponentStyle = (StepStyles.StepPrimaryButtonComponentStyle) this.nullableStepPrimaryButtonComponentStyleAdapter.fromJson(reader);
                    break;
                case 7:
                    stepSecondaryButtonComponentStyle = (StepStyles.StepSecondaryButtonComponentStyle) this.nullableStepSecondaryButtonComponentStyleAdapter.fromJson(reader);
                    break;
                case 8:
                    documentStepStrokeColor = (StepStyles.DocumentStepStrokeColor) this.nullableDocumentStepStrokeColorAdapter.fromJson(reader);
                    break;
                case 9:
                    documentStepFillColor = (StepStyles.DocumentStepFillColor) this.nullableDocumentStepFillColorAdapter.fromJson(reader);
                    break;
                case 10:
                    documentStepBorderColor = (StepStyles.DocumentStepBorderColor) this.nullableDocumentStepBorderColorAdapter.fromJson(reader);
                    break;
                case 11:
                    documentStepBorderRadius = (StepStyles.DocumentStepBorderRadius) this.nullableDocumentStepBorderRadiusAdapter.fromJson(reader);
                    break;
                case 12:
                    documentStepBorderWidth = (StepStyles.DocumentStepBorderWidth) this.nullableDocumentStepBorderWidthAdapter.fromJson(reader);
                    break;
                case 13:
                    stepPaddingStyle = (StepStyles.StepPaddingStyle) this.nullableStepPaddingStyleAdapter.fromJson(reader);
                    break;
                case 14:
                    combinedStepAlignment = (StepStyles.CombinedStepAlignment) this.nullableCombinedStepAlignmentAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        return new StepStyles.DocumentStepStyle(headerButtonColorStyle, stepBackgroundColorStyle, stepBackgroundImageStyle, documentStepTitleComponentStyle, documentStepTextBasedComponentStyle, stepTextBasedComponentStyle, stepPrimaryButtonComponentStyle, stepSecondaryButtonComponentStyle, documentStepStrokeColor, documentStepFillColor, documentStepBorderColor, documentStepBorderRadius, documentStepBorderWidth, stepPaddingStyle, combinedStepAlignment);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, StepStyles.DocumentStepStyle value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("textColor");
        this.nullableHeaderButtonColorStyleAdapter.toJson(writer, value_.getHeaderButtonColor());
        writer.name("backgroundColor");
        this.nullableStepBackgroundColorStyleAdapter.toJson(writer, value_.getBackgroundColor());
        writer.name("backgroundImage");
        this.nullableStepBackgroundImageStyleAdapter.toJson(writer, value_.getBackgroundImage());
        writer.name("titleStyle");
        this.nullableDocumentStepTitleComponentStyleAdapter.toJson(writer, value_.getTitleStyle());
        writer.name("textStyle");
        this.nullableDocumentStepTextBasedComponentStyleAdapter.toJson(writer, value_.getTextStyle());
        writer.name("disclaimerStyle");
        this.nullableStepTextBasedComponentStyleAdapter.toJson(writer, value_.getDisclaimerStyle());
        writer.name("buttonPrimaryStyle");
        this.nullableStepPrimaryButtonComponentStyleAdapter.toJson(writer, value_.getButtonPrimaryStyle());
        writer.name("buttonSecondaryStyle");
        this.nullableStepSecondaryButtonComponentStyleAdapter.toJson(writer, value_.getButtonSecondaryStyle());
        writer.name("strokeColor");
        this.nullableDocumentStepStrokeColorAdapter.toJson(writer, value_.getStrokeColor());
        writer.name("fillColor");
        this.nullableDocumentStepFillColorAdapter.toJson(writer, value_.getFillColor());
        writer.name("borderColor");
        this.nullableDocumentStepBorderColorAdapter.toJson(writer, value_.getBorderColor());
        writer.name("borderRadius");
        this.nullableDocumentStepBorderRadiusAdapter.toJson(writer, value_.getBorderRadius());
        writer.name("borderWidth");
        this.nullableDocumentStepBorderWidthAdapter.toJson(writer, value_.getBorderWidth());
        writer.name("padding");
        this.nullableStepPaddingStyleAdapter.toJson(writer, value_.getPadding());
        writer.name("alignment");
        this.nullableCombinedStepAlignmentAdapter.toJson(writer, value_.getAlignment());
        writer.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(50, "GeneratedJsonAdapter(StepStyles.DocumentStepStyle)");
    }
}
