package com.withpersona.sdk2.inquiry.network.dto;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u000e\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep_GovernmentId_DigitalIdConfigJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$DigitalIdConfig;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "nullableStringAdapter", "", "nullableListOfDigitalIdRequestAdapter", "", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$DigitalIdRequest;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class NextStep_GovernmentId_DigitalIdConfigJsonAdapter extends JsonAdapter {
    private final JsonAdapter nullableListOfDigitalIdRequestAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final JsonReader.Options options;

    public NextStep_GovernmentId_DigitalIdConfigJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("merchantId", "nonce", "fieldKeyMobileDriversLicense", "mobileRequests");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "merchantId");
        this.nullableListOfDigitalIdRequestAdapter = moshi.adapter(Types.newParameterizedType(List.class, NextStep.GovernmentId.DigitalIdRequest.class), emptySet, "mobileRequests");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public NextStep.GovernmentId.DigitalIdConfig fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        List list = null;
        while (reader.hasNext()) {
            int selectName = reader.selectName(this.options);
            if (selectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (selectName == 0) {
                str = (String) this.nullableStringAdapter.fromJson(reader);
            } else if (selectName == 1) {
                str2 = (String) this.nullableStringAdapter.fromJson(reader);
            } else if (selectName == 2) {
                str3 = (String) this.nullableStringAdapter.fromJson(reader);
            } else if (selectName == 3) {
                list = (List) this.nullableListOfDigitalIdRequestAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        return new NextStep.GovernmentId.DigitalIdConfig(str, str2, str3, list);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, NextStep.GovernmentId.DigitalIdConfig value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("merchantId");
        this.nullableStringAdapter.toJson(writer, value_.getMerchantId());
        writer.name("nonce");
        this.nullableStringAdapter.toJson(writer, value_.getNonce());
        writer.name("fieldKeyMobileDriversLicense");
        this.nullableStringAdapter.toJson(writer, value_.getFieldKeyMobileDriversLicense());
        writer.name("mobileRequests");
        this.nullableListOfDigitalIdRequestAdapter.toJson(writer, value_.getMobileRequests());
        writer.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(59, "GeneratedJsonAdapter(NextStep.GovernmentId.DigitalIdConfig)");
    }
}
