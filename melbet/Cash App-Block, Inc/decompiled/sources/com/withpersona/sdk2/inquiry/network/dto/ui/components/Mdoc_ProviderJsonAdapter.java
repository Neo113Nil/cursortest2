package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Mdoc;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0011\u001a\u00020\nH\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u001a\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\r\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc_ProviderJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$Provider;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "nullableStringAdapter", "", "nullableIntAdapter", "", "nullableMapOfStringIntAdapter", "", "nullableClientMetadataAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$ClientMetadata;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class Mdoc_ProviderJsonAdapter extends JsonAdapter {
    private final JsonAdapter nullableClientMetadataAdapter;
    private final JsonAdapter nullableIntAdapter;
    private final JsonAdapter nullableMapOfStringIntAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final JsonReader.Options options;

    public Mdoc_ProviderJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("providerType", "idType", "merchantId", "nonce", "minAge", "elementToStoreLength", "clientMetadata");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "providerType");
        this.nullableIntAdapter = moshi.adapter(Integer.class, emptySet, "minAge");
        this.nullableMapOfStringIntAdapter = moshi.adapter(Types.newParameterizedType(Map.class, String.class, Integer.class), emptySet, "elementToStoreLength");
        this.nullableClientMetadataAdapter = moshi.adapter(Mdoc.ClientMetadata.class, emptySet, "clientMetadata");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public Mdoc.Provider fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Integer num = null;
        Map map = null;
        Mdoc.ClientMetadata clientMetadata = null;
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
                    str3 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 3:
                    str4 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 4:
                    num = (Integer) this.nullableIntAdapter.fromJson(reader);
                    break;
                case 5:
                    map = (Map) this.nullableMapOfStringIntAdapter.fromJson(reader);
                    break;
                case 6:
                    clientMetadata = (Mdoc.ClientMetadata) this.nullableClientMetadataAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        return new Mdoc.Provider(str, str2, str3, str4, num, map, clientMetadata);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, Mdoc.Provider value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("providerType");
        this.nullableStringAdapter.toJson(writer, value_.getProviderType());
        writer.name("idType");
        this.nullableStringAdapter.toJson(writer, value_.getIdType());
        writer.name("merchantId");
        this.nullableStringAdapter.toJson(writer, value_.getMerchantId());
        writer.name("nonce");
        this.nullableStringAdapter.toJson(writer, value_.getNonce());
        writer.name("minAge");
        this.nullableIntAdapter.toJson(writer, value_.getMinAge());
        writer.name("elementToStoreLength");
        this.nullableMapOfStringIntAdapter.toJson(writer, value_.getElementToStoreLength());
        writer.name("clientMetadata");
        this.nullableClientMetadataAdapter.toJson(writer, value_.getClientMetadata());
        writer.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(35, "GeneratedJsonAdapter(Mdoc.Provider)");
    }
}
