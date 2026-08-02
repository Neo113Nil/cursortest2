package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles_ESignatureSecondaryButtonStylesJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ESignatureSecondaryButtonStyles;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "nullableESignatureSecondaryButtonStylesContainerAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ESignatureSecondaryButtonStylesContainer;", "toString", "", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AttributeStyles_ESignatureSecondaryButtonStylesJsonAdapter extends JsonAdapter {
    private final JsonAdapter nullableESignatureSecondaryButtonStylesContainerAdapter;
    private final JsonReader.Options options;

    public AttributeStyles_ESignatureSecondaryButtonStylesJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("clearSignatureButton");
        this.nullableESignatureSecondaryButtonStylesContainerAdapter = moshi.adapter(AttributeStyles.ESignatureSecondaryButtonStylesContainer.class, EmptySet.INSTANCE, "clearSignatureButton");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public AttributeStyles.ESignatureSecondaryButtonStyles fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        AttributeStyles.ESignatureSecondaryButtonStylesContainer eSignatureSecondaryButtonStylesContainer = null;
        while (reader.hasNext()) {
            int selectName = reader.selectName(this.options);
            if (selectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (selectName == 0) {
                eSignatureSecondaryButtonStylesContainer = (AttributeStyles.ESignatureSecondaryButtonStylesContainer) this.nullableESignatureSecondaryButtonStylesContainerAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        return new AttributeStyles.ESignatureSecondaryButtonStyles(eSignatureSecondaryButtonStylesContainer);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, AttributeStyles.ESignatureSecondaryButtonStyles value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("clearSignatureButton");
        this.nullableESignatureSecondaryButtonStylesContainerAdapter.toJson(writer, value_.getClearSignatureButton());
        writer.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(69, "GeneratedJsonAdapter(AttributeStyles.ESignatureSecondaryButtonStyles)");
    }
}
