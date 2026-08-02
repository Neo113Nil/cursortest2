package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.CreatePersonaSheet;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet_CreatePersonaSheetStyleJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet$CreatePersonaSheetStyle;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "nullableFooterColorStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$FooterColorStyle;", "nullableFooterPaddingStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$FooterPaddingStyle;", "nullableFooterBorderWidthStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$FooterBorderWidthStyle;", "toString", "", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CreatePersonaSheet_CreatePersonaSheetStyleJsonAdapter extends JsonAdapter {
    private final JsonAdapter nullableFooterBorderWidthStyleAdapter;
    private final JsonAdapter nullableFooterColorStyleAdapter;
    private final JsonAdapter nullableFooterPaddingStyleAdapter;
    private final JsonReader.Options options;

    public CreatePersonaSheet_CreatePersonaSheetStyleJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("backgroundColor", "padding", "borderWidth");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableFooterColorStyleAdapter = moshi.adapter(AttributeStyles.FooterColorStyle.class, emptySet, "backgroundColor");
        this.nullableFooterPaddingStyleAdapter = moshi.adapter(AttributeStyles.FooterPaddingStyle.class, emptySet, "padding");
        this.nullableFooterBorderWidthStyleAdapter = moshi.adapter(AttributeStyles.FooterBorderWidthStyle.class, emptySet, "borderWidth");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public CreatePersonaSheet.CreatePersonaSheetStyle fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        AttributeStyles.FooterColorStyle footerColorStyle = null;
        AttributeStyles.FooterPaddingStyle footerPaddingStyle = null;
        AttributeStyles.FooterBorderWidthStyle footerBorderWidthStyle = null;
        while (reader.hasNext()) {
            int selectName = reader.selectName(this.options);
            if (selectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (selectName == 0) {
                footerColorStyle = (AttributeStyles.FooterColorStyle) this.nullableFooterColorStyleAdapter.fromJson(reader);
            } else if (selectName == 1) {
                footerPaddingStyle = (AttributeStyles.FooterPaddingStyle) this.nullableFooterPaddingStyleAdapter.fromJson(reader);
            } else if (selectName == 2) {
                footerBorderWidthStyle = (AttributeStyles.FooterBorderWidthStyle) this.nullableFooterBorderWidthStyleAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        return new CreatePersonaSheet.CreatePersonaSheetStyle(footerColorStyle, footerPaddingStyle, footerBorderWidthStyle);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, CreatePersonaSheet.CreatePersonaSheetStyle value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("backgroundColor");
        this.nullableFooterColorStyleAdapter.toJson(writer, value_.getBackgroundColor());
        writer.name("padding");
        this.nullableFooterPaddingStyleAdapter.toJson(writer, value_.getPadding());
        writer.name("borderWidth");
        this.nullableFooterBorderWidthStyleAdapter.toJson(writer, value_.getBorderWidth());
        writer.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(64, "GeneratedJsonAdapter(CreatePersonaSheet.CreatePersonaSheetStyle)");
    }
}
