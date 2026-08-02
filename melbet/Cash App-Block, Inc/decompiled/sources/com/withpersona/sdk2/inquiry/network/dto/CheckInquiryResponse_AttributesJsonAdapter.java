package com.withpersona.sdk2.inquiry.network.dto;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0012\u001a\u00020\nH\u0016J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u001a\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\r\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse_AttributesJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$Attributes;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "nullableStringAdapter", "", "nextStepAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;", "nullableMapOfStringInquiryFieldAdapter", "", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;", "waitForTransitionConfigAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$WaitForTransitionConfig;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CheckInquiryResponse_AttributesJsonAdapter extends JsonAdapter {
    private final JsonAdapter nextStepAdapter;
    private final JsonAdapter nullableMapOfStringInquiryFieldAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter waitForTransitionConfigAdapter;

    public CheckInquiryResponse_AttributesJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("selectedCountryCode", "status", "nextStep", "fields", "waitForTransition", "environment", "redirectUri");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "selectedCountryCode");
        this.nextStepAdapter = moshi.adapter(NextStep.class, emptySet, "nextStep");
        this.nullableMapOfStringInquiryFieldAdapter = moshi.adapter(Types.newParameterizedType(Map.class, String.class, InquiryField.class), emptySet, "fields");
        this.waitForTransitionConfigAdapter = moshi.adapter(CheckInquiryResponse.WaitForTransitionConfig.class, emptySet, "waitForTransitionConfig");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public CheckInquiryResponse.Attributes fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        String str = null;
        String str2 = null;
        NextStep nextStep = null;
        Map map = null;
        CheckInquiryResponse.WaitForTransitionConfig waitForTransitionConfig = null;
        String str3 = null;
        String str4 = null;
        while (reader.hasNext()) {
            switch (reader.selectName(this.options)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    break;
                case 0:
                    str = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 1:
                    str2 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 2:
                    nextStep = (NextStep) this.nextStepAdapter.fromJson(reader);
                    if (nextStep == null) {
                        throw Util.unexpectedNull("nextStep", "nextStep", reader);
                    }
                    break;
                case 3:
                    map = (Map) this.nullableMapOfStringInquiryFieldAdapter.fromJson(reader);
                    break;
                case 4:
                    waitForTransitionConfig = (CheckInquiryResponse.WaitForTransitionConfig) this.waitForTransitionConfigAdapter.fromJson(reader);
                    if (waitForTransitionConfig == null) {
                        throw Util.unexpectedNull("waitForTransitionConfig", "waitForTransition", reader);
                    }
                    break;
                case 5:
                    str3 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 6:
                    str4 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (nextStep == null) {
            throw Util.missingProperty("nextStep", "nextStep", reader);
        }
        if (waitForTransitionConfig != null) {
            return new CheckInquiryResponse.Attributes(str, str2, nextStep, map, waitForTransitionConfig, str3, str4);
        }
        throw Util.missingProperty("waitForTransitionConfig", "waitForTransition", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, CheckInquiryResponse.Attributes value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("selectedCountryCode");
        this.nullableStringAdapter.toJson(writer, value_.getSelectedCountryCode());
        writer.name("status");
        this.nullableStringAdapter.toJson(writer, value_.getStatus());
        writer.name("nextStep");
        this.nextStepAdapter.toJson(writer, value_.getNextStep());
        writer.name("fields");
        this.nullableMapOfStringInquiryFieldAdapter.toJson(writer, value_.getFields());
        writer.name("waitForTransition");
        this.waitForTransitionConfigAdapter.toJson(writer, value_.getWaitForTransitionConfig());
        writer.name("environment");
        this.nullableStringAdapter.toJson(writer, value_.getEnvironment());
        writer.name("redirectUri");
        this.nullableStringAdapter.toJson(writer, value_.getRedirectUri());
        writer.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(53, "GeneratedJsonAdapter(CheckInquiryResponse.Attributes)");
    }
}
