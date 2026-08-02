package com.withpersona.sdk2.inquiry.internal.network;

import com.google.android.gms.maps.zzai;
import com.squareup.moshi.FromJson;
import com.squareup.moshi.JsonClass;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.ToJson;
import com.withpersona.sdk2.inquiry.network.dto.InquiryFieldMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest;", "", "Data", "com/google/android/gms/maps/zzai", "inquiry-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CreateInquiryRequest {
    public final Data data;

    public final class Data {
        public static final Adapter Adapter = new Adapter();
        public final zzai attributes;

        @Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"com/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Data$Adapter", "", "Lcom/squareup/moshi/JsonWriter;", "jsonWriter", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Data;", "data", "", "toJson", "(Lcom/squareup/moshi/JsonWriter;Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Data;)V", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Data;", "inquiry-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public final class Adapter {
            @FromJson
            public final Data fromJson(JsonReader reader) {
                reader.getClass();
                reader.beginObject();
                String str = "";
                String str2 = str;
                while (reader.hasNext()) {
                    String nextName = reader.nextName();
                    if (Intrinsics.areEqual(nextName, "templateId")) {
                        str = reader.nextString();
                        str.getClass();
                    } else if (Intrinsics.areEqual(nextName, "environment")) {
                        str2 = reader.nextString();
                        str2.getClass();
                    } else {
                        reader.skipValue();
                    }
                }
                reader.endObject();
                return new Data(new zzai(str, (String) null, str2, "", (String) null, (String) null, (LinkedHashMap) null, (String) null, IptcConstants.IMAGE_RESOURCE_BLOCK_BACKGROUND_COLOR));
            }

            @ToJson
            public final void toJson(JsonWriter jsonWriter, Data data) {
                jsonWriter.getClass();
                data.getClass();
                jsonWriter.beginObject();
                jsonWriter.name("attributes");
                jsonWriter.beginObject();
                zzai zzaiVar = data.attributes;
                String str = (String) zzaiVar.zze;
                String str2 = (String) zzaiVar.zzd;
                Map map = (Map) zzaiVar.zzc;
                String str3 = (String) zzaiVar.zaa;
                if (str3 != null) {
                    jsonWriter.name("inquiryTemplateId").value(str3);
                }
                String str4 = (String) zzaiVar.zab;
                if (str4 != null) {
                    jsonWriter.name("inquiryTemplateVersionId").value(str4);
                }
                jsonWriter.name("environment").value((String) zzaiVar.zac);
                String str5 = (String) zzaiVar.zad;
                if (str5 != null) {
                    jsonWriter.name("environment_id").value(str5);
                }
                String str6 = (String) zzaiVar.zza;
                if (str6 != null) {
                    jsonWriter.name("accountId").value(str6);
                }
                String str7 = (String) zzaiVar.zzb;
                if (str7 != null) {
                    jsonWriter.name("referenceId").value(str7);
                }
                if (map != null) {
                    jsonWriter.name("fields");
                    InquiryFieldMap.INSTANCE.toJson(jsonWriter, new InquiryFieldMap(map));
                }
                if (str2 != null) {
                    jsonWriter.name("themeSetId").value(str2);
                }
                if (str != null) {
                    jsonWriter.name("redirectUri").value(str);
                }
                jsonWriter.endObject();
                jsonWriter.endObject();
            }
        }

        public Data(zzai zzaiVar) {
            this.attributes = zzaiVar;
        }
    }

    public CreateInquiryRequest(Data data) {
        this.data = data;
    }
}
