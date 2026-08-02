package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class GetHistoricalExchangeDataRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetHistoricalExchangeDataRequest> CREATOR;
    public final String base_currency_code;
    public final HistoricalRange historical_range;
    public final String quote_currency_code;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GetHistoricalExchangeDataRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.app.GetHistoricalExchangeDataRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new GetHistoricalExchangeDataRequest((HistoricalRange) obj, (String) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        try {
                            obj = HistoricalRange.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 3) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj3 = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                GetHistoricalExchangeDataRequest getHistoricalExchangeDataRequest = (GetHistoricalExchangeDataRequest) obj;
                reverseProtoWriter.getClass();
                getHistoricalExchangeDataRequest.getClass();
                reverseProtoWriter.writeBytes(getHistoricalExchangeDataRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 3, getHistoricalExchangeDataRequest.quote_currency_code);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, getHistoricalExchangeDataRequest.base_currency_code);
                HistoricalRange.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getHistoricalExchangeDataRequest.historical_range);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                GetHistoricalExchangeDataRequest getHistoricalExchangeDataRequest = (GetHistoricalExchangeDataRequest) obj;
                getHistoricalExchangeDataRequest.getClass();
                int encodedSizeWithTag = HistoricalRange.ADAPTER.encodedSizeWithTag(1, getHistoricalExchangeDataRequest.historical_range) + getHistoricalExchangeDataRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.encodedSizeWithTag(3, getHistoricalExchangeDataRequest.quote_currency_code) + protoAdapter2.encodedSizeWithTag(2, getHistoricalExchangeDataRequest.base_currency_code) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                GetHistoricalExchangeDataRequest getHistoricalExchangeDataRequest = (GetHistoricalExchangeDataRequest) obj;
                getHistoricalExchangeDataRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                HistoricalRange historicalRange = getHistoricalExchangeDataRequest.historical_range;
                String str = getHistoricalExchangeDataRequest.base_currency_code;
                String str2 = getHistoricalExchangeDataRequest.quote_currency_code;
                byteString.getClass();
                return new GetHistoricalExchangeDataRequest(historicalRange, str, str2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                GetHistoricalExchangeDataRequest getHistoricalExchangeDataRequest = (GetHistoricalExchangeDataRequest) obj;
                getHistoricalExchangeDataRequest.getClass();
                HistoricalRange.ADAPTER.encodeWithTag(protoWriter, 1, getHistoricalExchangeDataRequest.historical_range);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 2, getHistoricalExchangeDataRequest.base_currency_code);
                protoAdapter2.encodeWithTag(protoWriter, 3, getHistoricalExchangeDataRequest.quote_currency_code);
                protoWriter.writeBytes(getHistoricalExchangeDataRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetHistoricalExchangeDataRequest(HistoricalRange historicalRange, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.historical_range = historicalRange;
        this.base_currency_code = str;
        this.quote_currency_code = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetHistoricalExchangeDataRequest)) {
            return false;
        }
        GetHistoricalExchangeDataRequest getHistoricalExchangeDataRequest = (GetHistoricalExchangeDataRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getHistoricalExchangeDataRequest.unknownFields()) && this.historical_range == getHistoricalExchangeDataRequest.historical_range && Intrinsics.areEqual(this.base_currency_code, getHistoricalExchangeDataRequest.base_currency_code) && Intrinsics.areEqual(this.quote_currency_code, getHistoricalExchangeDataRequest.quote_currency_code);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        HistoricalRange historicalRange = this.historical_range;
        int hashCode2 = (hashCode + (historicalRange != null ? historicalRange.hashCode() : 0)) * 37;
        String str = this.base_currency_code;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.quote_currency_code;
        int hashCode4 = hashCode3 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiAlias.Builder builder = new UiAlias.Builder(22);
        builder.f1364type = this.historical_range;
        builder.canonical_text = this.base_currency_code;
        builder.formatted = this.quote_currency_code;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        HistoricalRange historicalRange = this.historical_range;
        if (historicalRange != null) {
            arrayList.add("historical_range=" + historicalRange);
        }
        String str = this.base_currency_code;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "base_currency_code=", arrayList);
        }
        String str2 = this.quote_currency_code;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "quote_currency_code=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetHistoricalExchangeDataRequest{", "}", 0, null, null, 56);
    }

    public /* synthetic */ GetHistoricalExchangeDataRequest(HistoricalRange historicalRange, String str) {
        this(historicalRange, "BTC", str, ByteString.EMPTY);
    }
}
