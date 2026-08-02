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

@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010)\u001a\u00020*H\u0016J\u0010\u0010+\u001a\u00020\u00022\u0006\u0010,\u001a\u00020-H\u0016J\u001a\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles_SelfieStepStyleJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "nullableHeaderButtonColorStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$HeaderButtonColorStyle;", "nullableStepBackgroundColorStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepBackgroundColorStyle;", "nullableStepBackgroundImageStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepBackgroundImageStyle;", "nullableSelfieStepTitleComponentStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepTitleComponentStyle;", "nullableSelfieStepTextBasedComponentStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepTextBasedComponentStyle;", "nullableStepPrimaryButtonComponentStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepPrimaryButtonComponentStyle;", "nullableStepSecondaryButtonComponentStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepSecondaryButtonComponentStyle;", "nullableStepTextBasedComponentStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyle;", "nullableSelfieStepStrokeColorAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStrokeColor;", "nullableSelfieStepBorderColorAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepBorderColor;", "nullableSelfieStepBorderWidthAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepBorderWidth;", "nullableSelfieStepFillColorAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepFillColor;", "nullableSelfieStepImageLocalStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepImageLocalStyle;", "nullableStepPaddingStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepPaddingStyle;", "nullableStepBorderRadiusStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepBorderRadiusStyle;", "nullableCombinedStepAlignmentAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$CombinedStepAlignment;", "toString", "", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class StepStyles_SelfieStepStyleJsonAdapter extends JsonAdapter {
    private final JsonAdapter nullableCombinedStepAlignmentAdapter;
    private final JsonAdapter nullableHeaderButtonColorStyleAdapter;
    private final JsonAdapter nullableSelfieStepBorderColorAdapter;
    private final JsonAdapter nullableSelfieStepBorderWidthAdapter;
    private final JsonAdapter nullableSelfieStepFillColorAdapter;
    private final JsonAdapter nullableSelfieStepImageLocalStyleAdapter;
    private final JsonAdapter nullableSelfieStepStrokeColorAdapter;
    private final JsonAdapter nullableSelfieStepTextBasedComponentStyleAdapter;
    private final JsonAdapter nullableSelfieStepTitleComponentStyleAdapter;
    private final JsonAdapter nullableStepBackgroundColorStyleAdapter;
    private final JsonAdapter nullableStepBackgroundImageStyleAdapter;
    private final JsonAdapter nullableStepBorderRadiusStyleAdapter;
    private final JsonAdapter nullableStepPaddingStyleAdapter;
    private final JsonAdapter nullableStepPrimaryButtonComponentStyleAdapter;
    private final JsonAdapter nullableStepSecondaryButtonComponentStyleAdapter;
    private final JsonAdapter nullableStepTextBasedComponentStyleAdapter;
    private final JsonReader.Options options;

    public StepStyles_SelfieStepStyleJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("textColor", "backgroundColor", "backgroundImage", "titleStyle", "textStyle", "buttonPrimaryStyle", "buttonSecondaryStyle", "disclaimerStyle", "strokeColor", "borderColor", "borderWidth", "fillColor", "imageLocalStyle", "padding", "borderRadius", "alignment");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableHeaderButtonColorStyleAdapter = moshi.adapter(AttributeStyles.HeaderButtonColorStyle.class, emptySet, "headerButtonColor");
        this.nullableStepBackgroundColorStyleAdapter = moshi.adapter(StepStyles.StepBackgroundColorStyle.class, emptySet, "backgroundColor");
        this.nullableStepBackgroundImageStyleAdapter = moshi.adapter(StepStyles.StepBackgroundImageStyle.class, emptySet, "backgroundImage");
        this.nullableSelfieStepTitleComponentStyleAdapter = moshi.adapter(StepStyles.SelfieStepTitleComponentStyle.class, emptySet, "titleStyle");
        this.nullableSelfieStepTextBasedComponentStyleAdapter = moshi.adapter(StepStyles.SelfieStepTextBasedComponentStyle.class, emptySet, "textStyle");
        this.nullableStepPrimaryButtonComponentStyleAdapter = moshi.adapter(StepStyles.StepPrimaryButtonComponentStyle.class, emptySet, "buttonPrimaryStyle");
        this.nullableStepSecondaryButtonComponentStyleAdapter = moshi.adapter(StepStyles.StepSecondaryButtonComponentStyle.class, emptySet, "buttonSecondaryStyle");
        this.nullableStepTextBasedComponentStyleAdapter = moshi.adapter(StepStyles.StepTextBasedComponentStyle.class, emptySet, "disclaimerStyle");
        this.nullableSelfieStepStrokeColorAdapter = moshi.adapter(StepStyles.SelfieStepStrokeColor.class, emptySet, "strokeColor");
        this.nullableSelfieStepBorderColorAdapter = moshi.adapter(StepStyles.SelfieStepBorderColor.class, emptySet, "borderColor");
        this.nullableSelfieStepBorderWidthAdapter = moshi.adapter(StepStyles.SelfieStepBorderWidth.class, emptySet, "borderWidth");
        this.nullableSelfieStepFillColorAdapter = moshi.adapter(StepStyles.SelfieStepFillColor.class, emptySet, "fillColor");
        this.nullableSelfieStepImageLocalStyleAdapter = moshi.adapter(StepStyles.SelfieStepImageLocalStyle.class, emptySet, "imageLocalStyle");
        this.nullableStepPaddingStyleAdapter = moshi.adapter(StepStyles.StepPaddingStyle.class, emptySet, "padding");
        this.nullableStepBorderRadiusStyleAdapter = moshi.adapter(StepStyles.StepBorderRadiusStyle.class, emptySet, "borderRadius");
        this.nullableCombinedStepAlignmentAdapter = moshi.adapter(StepStyles.CombinedStepAlignment.class, emptySet, "alignment");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public StepStyles.SelfieStepStyle fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        AttributeStyles.HeaderButtonColorStyle headerButtonColorStyle = null;
        StepStyles.StepBackgroundColorStyle stepBackgroundColorStyle = null;
        StepStyles.StepBackgroundImageStyle stepBackgroundImageStyle = null;
        StepStyles.SelfieStepTitleComponentStyle selfieStepTitleComponentStyle = null;
        StepStyles.SelfieStepTextBasedComponentStyle selfieStepTextBasedComponentStyle = null;
        StepStyles.StepPrimaryButtonComponentStyle stepPrimaryButtonComponentStyle = null;
        StepStyles.StepSecondaryButtonComponentStyle stepSecondaryButtonComponentStyle = null;
        StepStyles.StepTextBasedComponentStyle stepTextBasedComponentStyle = null;
        StepStyles.SelfieStepStrokeColor selfieStepStrokeColor = null;
        StepStyles.SelfieStepBorderColor selfieStepBorderColor = null;
        StepStyles.SelfieStepBorderWidth selfieStepBorderWidth = null;
        StepStyles.SelfieStepFillColor selfieStepFillColor = null;
        StepStyles.SelfieStepImageLocalStyle selfieStepImageLocalStyle = null;
        StepStyles.StepPaddingStyle stepPaddingStyle = null;
        StepStyles.StepBorderRadiusStyle stepBorderRadiusStyle = null;
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
                    selfieStepTitleComponentStyle = (StepStyles.SelfieStepTitleComponentStyle) this.nullableSelfieStepTitleComponentStyleAdapter.fromJson(reader);
                    break;
                case 4:
                    selfieStepTextBasedComponentStyle = (StepStyles.SelfieStepTextBasedComponentStyle) this.nullableSelfieStepTextBasedComponentStyleAdapter.fromJson(reader);
                    break;
                case 5:
                    stepPrimaryButtonComponentStyle = (StepStyles.StepPrimaryButtonComponentStyle) this.nullableStepPrimaryButtonComponentStyleAdapter.fromJson(reader);
                    break;
                case 6:
                    stepSecondaryButtonComponentStyle = (StepStyles.StepSecondaryButtonComponentStyle) this.nullableStepSecondaryButtonComponentStyleAdapter.fromJson(reader);
                    break;
                case 7:
                    stepTextBasedComponentStyle = (StepStyles.StepTextBasedComponentStyle) this.nullableStepTextBasedComponentStyleAdapter.fromJson(reader);
                    break;
                case 8:
                    selfieStepStrokeColor = (StepStyles.SelfieStepStrokeColor) this.nullableSelfieStepStrokeColorAdapter.fromJson(reader);
                    break;
                case 9:
                    selfieStepBorderColor = (StepStyles.SelfieStepBorderColor) this.nullableSelfieStepBorderColorAdapter.fromJson(reader);
                    break;
                case 10:
                    selfieStepBorderWidth = (StepStyles.SelfieStepBorderWidth) this.nullableSelfieStepBorderWidthAdapter.fromJson(reader);
                    break;
                case 11:
                    selfieStepFillColor = (StepStyles.SelfieStepFillColor) this.nullableSelfieStepFillColorAdapter.fromJson(reader);
                    break;
                case 12:
                    selfieStepImageLocalStyle = (StepStyles.SelfieStepImageLocalStyle) this.nullableSelfieStepImageLocalStyleAdapter.fromJson(reader);
                    break;
                case 13:
                    stepPaddingStyle = (StepStyles.StepPaddingStyle) this.nullableStepPaddingStyleAdapter.fromJson(reader);
                    break;
                case 14:
                    stepBorderRadiusStyle = (StepStyles.StepBorderRadiusStyle) this.nullableStepBorderRadiusStyleAdapter.fromJson(reader);
                    break;
                case 15:
                    combinedStepAlignment = (StepStyles.CombinedStepAlignment) this.nullableCombinedStepAlignmentAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        return new StepStyles.SelfieStepStyle(headerButtonColorStyle, stepBackgroundColorStyle, stepBackgroundImageStyle, selfieStepTitleComponentStyle, selfieStepTextBasedComponentStyle, stepPrimaryButtonComponentStyle, stepSecondaryButtonComponentStyle, stepTextBasedComponentStyle, selfieStepStrokeColor, selfieStepBorderColor, selfieStepBorderWidth, selfieStepFillColor, selfieStepImageLocalStyle, stepPaddingStyle, stepBorderRadiusStyle, combinedStepAlignment);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, StepStyles.SelfieStepStyle value_) {
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
        this.nullableSelfieStepTitleComponentStyleAdapter.toJson(writer, value_.getTitleStyle());
        writer.name("textStyle");
        this.nullableSelfieStepTextBasedComponentStyleAdapter.toJson(writer, value_.getTextStyle());
        writer.name("buttonPrimaryStyle");
        this.nullableStepPrimaryButtonComponentStyleAdapter.toJson(writer, value_.getButtonPrimaryStyle());
        writer.name("buttonSecondaryStyle");
        this.nullableStepSecondaryButtonComponentStyleAdapter.toJson(writer, value_.getButtonSecondaryStyle());
        writer.name("disclaimerStyle");
        this.nullableStepTextBasedComponentStyleAdapter.toJson(writer, value_.getDisclaimerStyle());
        writer.name("strokeColor");
        this.nullableSelfieStepStrokeColorAdapter.toJson(writer, value_.getStrokeColor());
        writer.name("borderColor");
        this.nullableSelfieStepBorderColorAdapter.toJson(writer, value_.getBorderColor());
        writer.name("borderWidth");
        this.nullableSelfieStepBorderWidthAdapter.toJson(writer, value_.getBorderWidth());
        writer.name("fillColor");
        this.nullableSelfieStepFillColorAdapter.toJson(writer, value_.getFillColor());
        writer.name("imageLocalStyle");
        this.nullableSelfieStepImageLocalStyleAdapter.toJson(writer, value_.getImageLocalStyle());
        writer.name("padding");
        this.nullableStepPaddingStyleAdapter.toJson(writer, value_.getPadding());
        writer.name("borderRadius");
        this.nullableStepBorderRadiusStyleAdapter.toJson(writer, value_.getBorderRadius());
        writer.name("alignment");
        this.nullableCombinedStepAlignmentAdapter.toJson(writer, value_.getAlignment());
        writer.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(48, "GeneratedJsonAdapter(StepStyles.SelfieStepStyle)");
    }
}
