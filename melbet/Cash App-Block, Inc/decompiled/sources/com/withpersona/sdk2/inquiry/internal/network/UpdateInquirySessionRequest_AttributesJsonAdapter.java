package com.withpersona.sdk2.inquiry.internal.network;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.withpersona.sdk2.inquiry.internal.network.UpdateInquirySessionRequest;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest_AttributesJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest$Attributes;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "inquiry-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class UpdateInquirySessionRequest_AttributesJsonAdapter extends JsonAdapter {
    public volatile Constructor constructorRef;
    public final JsonAdapter nullableDoubleAdapter;
    public final JsonAdapter nullableListOfAppdomeThreatEventAdapter;
    public final JsonAdapter nullableStringAdapter;
    public final JsonReader.Options options;

    public UpdateInquirySessionRequest_AttributesJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("gpsLongitude", "gpsLatitude", "gpsPrecision", "appdomeThreatEvents", "silentNetworkAuthenticationCode", "silentNetworkAuthenticationErrorName", "silentNetworkAuthenticationErrorMessage");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableDoubleAdapter = moshi.adapter(Double.class, emptySet, "gpsLongitude");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "gpsPrecision");
        this.nullableListOfAppdomeThreatEventAdapter = moshi.adapter(Types.newParameterizedType(List.class, UpdateInquirySessionRequest.AppdomeThreatEvent.class), emptySet, "appdomeThreatEvents");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.getClass();
        jsonReader.beginObject();
        int i = -1;
        Double d = null;
        Double d2 = null;
        String str = null;
        List list = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    d = (Double) this.nullableDoubleAdapter.fromJson(jsonReader);
                    i &= -2;
                    break;
                case 1:
                    d2 = (Double) this.nullableDoubleAdapter.fromJson(jsonReader);
                    i &= -3;
                    break;
                case 2:
                    str = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -5;
                    break;
                case 3:
                    list = (List) this.nullableListOfAppdomeThreatEventAdapter.fromJson(jsonReader);
                    i &= -9;
                    break;
                case 4:
                    str2 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -17;
                    break;
                case 5:
                    str3 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -33;
                    break;
                case 6:
                    str4 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -65;
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -128) {
            String str5 = str4;
            String str6 = str3;
            String str7 = str2;
            List list2 = list;
            return new UpdateInquirySessionRequest.Attributes(d, d2, str, list2, str7, str6, str5);
        }
        String str8 = str4;
        String str9 = str3;
        String str10 = str2;
        List list3 = list;
        String str11 = str;
        Double d3 = d2;
        Double d4 = d;
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            constructor = UpdateInquirySessionRequest.Attributes.class.getDeclaredConstructor(Double.class, Double.class, String.class, List.class, String.class, String.class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        Object newInstance = constructor.newInstance(d4, d3, str11, list3, str10, str9, str8, Integer.valueOf(i), null);
        newInstance.getClass();
        return (UpdateInquirySessionRequest.Attributes) newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        UpdateInquirySessionRequest.Attributes attributes = (UpdateInquirySessionRequest.Attributes) obj;
        jsonWriter.getClass();
        if (attributes == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("gpsLongitude");
        Double d = attributes.gpsLongitude;
        JsonAdapter jsonAdapter = this.nullableDoubleAdapter;
        jsonAdapter.toJson(jsonWriter, d);
        jsonWriter.name("gpsLatitude");
        jsonAdapter.toJson(jsonWriter, attributes.gpsLatitude);
        jsonWriter.name("gpsPrecision");
        String str = attributes.gpsPrecision;
        JsonAdapter jsonAdapter2 = this.nullableStringAdapter;
        jsonAdapter2.toJson(jsonWriter, str);
        jsonWriter.name("appdomeThreatEvents");
        this.nullableListOfAppdomeThreatEventAdapter.toJson(jsonWriter, attributes.appdomeThreatEvents);
        jsonWriter.name("silentNetworkAuthenticationCode");
        jsonAdapter2.toJson(jsonWriter, attributes.silentNetworkAuthenticationCode);
        jsonWriter.name("silentNetworkAuthenticationErrorName");
        jsonAdapter2.toJson(jsonWriter, attributes.silentNetworkAuthenticationErrorName);
        jsonWriter.name("silentNetworkAuthenticationErrorMessage");
        jsonAdapter2.toJson(jsonWriter, attributes.silentNetworkAuthenticationErrorMessage);
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(60, "GeneratedJsonAdapter(UpdateInquirySessionRequest.Attributes)");
    }
}
