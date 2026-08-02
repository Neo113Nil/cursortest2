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

@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010-\u001a\u00020.H\u0016J\u0010\u0010/\u001a\u00020\u00022\u0006\u00100\u001a\u000201H\u0016J\u001a\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles_GovernmentIdStepStyleJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "nullableHeaderButtonColorStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$HeaderButtonColorStyle;", "nullableStepBackgroundColorStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepBackgroundColorStyle;", "nullableStepBackgroundImageStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepBackgroundImageStyle;", "nullableGovernmentIdStepTitleComponentStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepTitleComponentStyle;", "nullableGovernmentIdStepTextBasedComponentStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepTextBasedComponentStyle;", "nullableGovernmentIdStepPrimaryButtonComponentStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepPrimaryButtonComponentStyle;", "nullableGovernmentIdStepSecondaryButtonComponentStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepSecondaryButtonComponentStyle;", "nullableStepTextBasedComponentStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyle;", "nullableGovernmentIdStepRowHeightAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepRowHeight;", "nullableGovernmentIdStepStrokeColorAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStrokeColor;", "nullableGovernmentIdStepFillColorAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepFillColor;", "nullableGovernmentIdStepBorderColorAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepBorderColor;", "nullableGovernmentIdStepBorderRadiusAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepBorderRadius;", "nullableGovernmentIdStepBorderWidthAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepBorderWidth;", "nullableStepPaddingStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepPaddingStyle;", "nullableGovernmentIdStepInputSelectStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepInputSelectStyle;", "nullableGovernmentIdStepImageLocalStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepImageLocalStyle;", "nullableCombinedStepAlignmentAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$CombinedStepAlignment;", "toString", "", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class StepStyles_GovernmentIdStepStyleJsonAdapter extends JsonAdapter {
    private final JsonAdapter nullableCombinedStepAlignmentAdapter;
    private final JsonAdapter nullableGovernmentIdStepBorderColorAdapter;
    private final JsonAdapter nullableGovernmentIdStepBorderRadiusAdapter;
    private final JsonAdapter nullableGovernmentIdStepBorderWidthAdapter;
    private final JsonAdapter nullableGovernmentIdStepFillColorAdapter;
    private final JsonAdapter nullableGovernmentIdStepImageLocalStyleAdapter;
    private final JsonAdapter nullableGovernmentIdStepInputSelectStyleAdapter;
    private final JsonAdapter nullableGovernmentIdStepPrimaryButtonComponentStyleAdapter;
    private final JsonAdapter nullableGovernmentIdStepRowHeightAdapter;
    private final JsonAdapter nullableGovernmentIdStepSecondaryButtonComponentStyleAdapter;
    private final JsonAdapter nullableGovernmentIdStepStrokeColorAdapter;
    private final JsonAdapter nullableGovernmentIdStepTextBasedComponentStyleAdapter;
    private final JsonAdapter nullableGovernmentIdStepTitleComponentStyleAdapter;
    private final JsonAdapter nullableHeaderButtonColorStyleAdapter;
    private final JsonAdapter nullableStepBackgroundColorStyleAdapter;
    private final JsonAdapter nullableStepBackgroundImageStyleAdapter;
    private final JsonAdapter nullableStepPaddingStyleAdapter;
    private final JsonAdapter nullableStepTextBasedComponentStyleAdapter;
    private final JsonReader.Options options;

    public StepStyles_GovernmentIdStepStyleJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("textColor", "backgroundColor", "backgroundImage", "titleStyle", "textStyle", "buttonPrimaryStyle", "buttonSecondaryStyle", "disclaimerStyle", "height", "strokeColor", "fillColor", "borderColor", "borderRadius", "borderWidth", "padding", "inputSelectStyle", "imageLocalStyle", "alignment");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableHeaderButtonColorStyleAdapter = moshi.adapter(AttributeStyles.HeaderButtonColorStyle.class, emptySet, "headerButtonColor");
        this.nullableStepBackgroundColorStyleAdapter = moshi.adapter(StepStyles.StepBackgroundColorStyle.class, emptySet, "backgroundColor");
        this.nullableStepBackgroundImageStyleAdapter = moshi.adapter(StepStyles.StepBackgroundImageStyle.class, emptySet, "backgroundImage");
        this.nullableGovernmentIdStepTitleComponentStyleAdapter = moshi.adapter(StepStyles.GovernmentIdStepTitleComponentStyle.class, emptySet, "titleStyle");
        this.nullableGovernmentIdStepTextBasedComponentStyleAdapter = moshi.adapter(StepStyles.GovernmentIdStepTextBasedComponentStyle.class, emptySet, "textStyle");
        this.nullableGovernmentIdStepPrimaryButtonComponentStyleAdapter = moshi.adapter(StepStyles.GovernmentIdStepPrimaryButtonComponentStyle.class, emptySet, "buttonPrimaryStyle");
        this.nullableGovernmentIdStepSecondaryButtonComponentStyleAdapter = moshi.adapter(StepStyles.GovernmentIdStepSecondaryButtonComponentStyle.class, emptySet, "buttonSecondaryStyle");
        this.nullableStepTextBasedComponentStyleAdapter = moshi.adapter(StepStyles.StepTextBasedComponentStyle.class, emptySet, "disclaimerStyle");
        this.nullableGovernmentIdStepRowHeightAdapter = moshi.adapter(StepStyles.GovernmentIdStepRowHeight.class, emptySet, "height");
        this.nullableGovernmentIdStepStrokeColorAdapter = moshi.adapter(StepStyles.GovernmentIdStepStrokeColor.class, emptySet, "strokeColor");
        this.nullableGovernmentIdStepFillColorAdapter = moshi.adapter(StepStyles.GovernmentIdStepFillColor.class, emptySet, "fillColor");
        this.nullableGovernmentIdStepBorderColorAdapter = moshi.adapter(StepStyles.GovernmentIdStepBorderColor.class, emptySet, "borderColor");
        this.nullableGovernmentIdStepBorderRadiusAdapter = moshi.adapter(StepStyles.GovernmentIdStepBorderRadius.class, emptySet, "borderRadius");
        this.nullableGovernmentIdStepBorderWidthAdapter = moshi.adapter(StepStyles.GovernmentIdStepBorderWidth.class, emptySet, "borderWidth");
        this.nullableStepPaddingStyleAdapter = moshi.adapter(StepStyles.StepPaddingStyle.class, emptySet, "padding");
        this.nullableGovernmentIdStepInputSelectStyleAdapter = moshi.adapter(StepStyles.GovernmentIdStepInputSelectStyle.class, emptySet, "inputSelectStyle");
        this.nullableGovernmentIdStepImageLocalStyleAdapter = moshi.adapter(StepStyles.GovernmentIdStepImageLocalStyle.class, emptySet, "imageLocalStyle");
        this.nullableCombinedStepAlignmentAdapter = moshi.adapter(StepStyles.CombinedStepAlignment.class, emptySet, "alignment");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public StepStyles.GovernmentIdStepStyle fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        AttributeStyles.HeaderButtonColorStyle headerButtonColorStyle = null;
        StepStyles.StepBackgroundColorStyle stepBackgroundColorStyle = null;
        StepStyles.StepBackgroundImageStyle stepBackgroundImageStyle = null;
        StepStyles.GovernmentIdStepTitleComponentStyle governmentIdStepTitleComponentStyle = null;
        StepStyles.GovernmentIdStepTextBasedComponentStyle governmentIdStepTextBasedComponentStyle = null;
        StepStyles.GovernmentIdStepPrimaryButtonComponentStyle governmentIdStepPrimaryButtonComponentStyle = null;
        StepStyles.GovernmentIdStepSecondaryButtonComponentStyle governmentIdStepSecondaryButtonComponentStyle = null;
        StepStyles.StepTextBasedComponentStyle stepTextBasedComponentStyle = null;
        StepStyles.GovernmentIdStepRowHeight governmentIdStepRowHeight = null;
        StepStyles.GovernmentIdStepStrokeColor governmentIdStepStrokeColor = null;
        StepStyles.GovernmentIdStepFillColor governmentIdStepFillColor = null;
        StepStyles.GovernmentIdStepBorderColor governmentIdStepBorderColor = null;
        StepStyles.GovernmentIdStepBorderRadius governmentIdStepBorderRadius = null;
        StepStyles.GovernmentIdStepBorderWidth governmentIdStepBorderWidth = null;
        StepStyles.StepPaddingStyle stepPaddingStyle = null;
        StepStyles.GovernmentIdStepInputSelectStyle governmentIdStepInputSelectStyle = null;
        StepStyles.GovernmentIdStepImageLocalStyle governmentIdStepImageLocalStyle = null;
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
                    governmentIdStepTitleComponentStyle = (StepStyles.GovernmentIdStepTitleComponentStyle) this.nullableGovernmentIdStepTitleComponentStyleAdapter.fromJson(reader);
                    break;
                case 4:
                    governmentIdStepTextBasedComponentStyle = (StepStyles.GovernmentIdStepTextBasedComponentStyle) this.nullableGovernmentIdStepTextBasedComponentStyleAdapter.fromJson(reader);
                    break;
                case 5:
                    governmentIdStepPrimaryButtonComponentStyle = (StepStyles.GovernmentIdStepPrimaryButtonComponentStyle) this.nullableGovernmentIdStepPrimaryButtonComponentStyleAdapter.fromJson(reader);
                    break;
                case 6:
                    governmentIdStepSecondaryButtonComponentStyle = (StepStyles.GovernmentIdStepSecondaryButtonComponentStyle) this.nullableGovernmentIdStepSecondaryButtonComponentStyleAdapter.fromJson(reader);
                    break;
                case 7:
                    stepTextBasedComponentStyle = (StepStyles.StepTextBasedComponentStyle) this.nullableStepTextBasedComponentStyleAdapter.fromJson(reader);
                    break;
                case 8:
                    governmentIdStepRowHeight = (StepStyles.GovernmentIdStepRowHeight) this.nullableGovernmentIdStepRowHeightAdapter.fromJson(reader);
                    break;
                case 9:
                    governmentIdStepStrokeColor = (StepStyles.GovernmentIdStepStrokeColor) this.nullableGovernmentIdStepStrokeColorAdapter.fromJson(reader);
                    break;
                case 10:
                    governmentIdStepFillColor = (StepStyles.GovernmentIdStepFillColor) this.nullableGovernmentIdStepFillColorAdapter.fromJson(reader);
                    break;
                case 11:
                    governmentIdStepBorderColor = (StepStyles.GovernmentIdStepBorderColor) this.nullableGovernmentIdStepBorderColorAdapter.fromJson(reader);
                    break;
                case 12:
                    governmentIdStepBorderRadius = (StepStyles.GovernmentIdStepBorderRadius) this.nullableGovernmentIdStepBorderRadiusAdapter.fromJson(reader);
                    break;
                case 13:
                    governmentIdStepBorderWidth = (StepStyles.GovernmentIdStepBorderWidth) this.nullableGovernmentIdStepBorderWidthAdapter.fromJson(reader);
                    break;
                case 14:
                    stepPaddingStyle = (StepStyles.StepPaddingStyle) this.nullableStepPaddingStyleAdapter.fromJson(reader);
                    break;
                case 15:
                    governmentIdStepInputSelectStyle = (StepStyles.GovernmentIdStepInputSelectStyle) this.nullableGovernmentIdStepInputSelectStyleAdapter.fromJson(reader);
                    break;
                case 16:
                    governmentIdStepImageLocalStyle = (StepStyles.GovernmentIdStepImageLocalStyle) this.nullableGovernmentIdStepImageLocalStyleAdapter.fromJson(reader);
                    break;
                case 17:
                    combinedStepAlignment = (StepStyles.CombinedStepAlignment) this.nullableCombinedStepAlignmentAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        return new StepStyles.GovernmentIdStepStyle(headerButtonColorStyle, stepBackgroundColorStyle, stepBackgroundImageStyle, governmentIdStepTitleComponentStyle, governmentIdStepTextBasedComponentStyle, governmentIdStepPrimaryButtonComponentStyle, governmentIdStepSecondaryButtonComponentStyle, stepTextBasedComponentStyle, governmentIdStepRowHeight, governmentIdStepStrokeColor, governmentIdStepFillColor, governmentIdStepBorderColor, governmentIdStepBorderRadius, governmentIdStepBorderWidth, stepPaddingStyle, governmentIdStepInputSelectStyle, governmentIdStepImageLocalStyle, combinedStepAlignment);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, StepStyles.GovernmentIdStepStyle value_) {
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
        this.nullableGovernmentIdStepTitleComponentStyleAdapter.toJson(writer, value_.getTitleStyle());
        writer.name("textStyle");
        this.nullableGovernmentIdStepTextBasedComponentStyleAdapter.toJson(writer, value_.getTextStyle());
        writer.name("buttonPrimaryStyle");
        this.nullableGovernmentIdStepPrimaryButtonComponentStyleAdapter.toJson(writer, value_.getButtonPrimaryStyle());
        writer.name("buttonSecondaryStyle");
        this.nullableGovernmentIdStepSecondaryButtonComponentStyleAdapter.toJson(writer, value_.getButtonSecondaryStyle());
        writer.name("disclaimerStyle");
        this.nullableStepTextBasedComponentStyleAdapter.toJson(writer, value_.getDisclaimerStyle());
        writer.name("height");
        this.nullableGovernmentIdStepRowHeightAdapter.toJson(writer, value_.getHeight());
        writer.name("strokeColor");
        this.nullableGovernmentIdStepStrokeColorAdapter.toJson(writer, value_.getStrokeColor());
        writer.name("fillColor");
        this.nullableGovernmentIdStepFillColorAdapter.toJson(writer, value_.getFillColor());
        writer.name("borderColor");
        this.nullableGovernmentIdStepBorderColorAdapter.toJson(writer, value_.getBorderColor());
        writer.name("borderRadius");
        this.nullableGovernmentIdStepBorderRadiusAdapter.toJson(writer, value_.getBorderRadius());
        writer.name("borderWidth");
        this.nullableGovernmentIdStepBorderWidthAdapter.toJson(writer, value_.getBorderWidth());
        writer.name("padding");
        this.nullableStepPaddingStyleAdapter.toJson(writer, value_.getPadding());
        writer.name("inputSelectStyle");
        this.nullableGovernmentIdStepInputSelectStyleAdapter.toJson(writer, value_.getInputSelectStyle());
        writer.name("imageLocalStyle");
        this.nullableGovernmentIdStepImageLocalStyleAdapter.toJson(writer, value_.getImageLocalStyle());
        writer.name("alignment");
        this.nullableCombinedStepAlignmentAdapter.toJson(writer, value_.getAlignment());
        writer.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(54, "GeneratedJsonAdapter(StepStyles.GovernmentIdStepStyle)");
    }
}
