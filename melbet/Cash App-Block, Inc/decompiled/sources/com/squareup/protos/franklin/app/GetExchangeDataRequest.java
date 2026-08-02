package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.franklin.common.ExchangeData;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class GetExchangeDataRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetExchangeDataRequest> CREATOR;
    public final CurrencyCode quote_currency_code;
    public final List symbols;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GetExchangeDataRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.app.GetExchangeDataRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new GetExchangeDataRequest((CurrencyCode) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        m.add(ProtoAdapter.STRING.decode(protoReader));
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        try {
                            obj = CurrencyCode.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                GetExchangeDataRequest getExchangeDataRequest = (GetExchangeDataRequest) obj;
                reverseProtoWriter.getClass();
                getExchangeDataRequest.getClass();
                reverseProtoWriter.writeBytes(getExchangeDataRequest.unknownFields());
                CurrencyCode.ADAPTER.encodeWithTag(reverseProtoWriter, 2, getExchangeDataRequest.quote_currency_code);
                ProtoAdapter.STRING.asRepeated().encodeWithTag(reverseProtoWriter, 1, getExchangeDataRequest.symbols);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                GetExchangeDataRequest getExchangeDataRequest = (GetExchangeDataRequest) obj;
                getExchangeDataRequest.getClass();
                return CurrencyCode.ADAPTER.encodedSizeWithTag(2, getExchangeDataRequest.quote_currency_code) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, getExchangeDataRequest.symbols) + getExchangeDataRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                GetExchangeDataRequest getExchangeDataRequest = (GetExchangeDataRequest) obj;
                getExchangeDataRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                List list = getExchangeDataRequest.symbols;
                CurrencyCode currencyCode = getExchangeDataRequest.quote_currency_code;
                list.getClass();
                byteString.getClass();
                return new GetExchangeDataRequest(currencyCode, list, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                GetExchangeDataRequest getExchangeDataRequest = (GetExchangeDataRequest) obj;
                getExchangeDataRequest.getClass();
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, getExchangeDataRequest.symbols);
                CurrencyCode.ADAPTER.encodeWithTag(protoWriter, 2, getExchangeDataRequest.quote_currency_code);
                protoWriter.writeBytes(getExchangeDataRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetExchangeDataRequest(CurrencyCode currencyCode, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.quote_currency_code = currencyCode;
        this.symbols = TransactorKt.immutableCopyOf("symbols", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetExchangeDataRequest)) {
            return false;
        }
        GetExchangeDataRequest getExchangeDataRequest = (GetExchangeDataRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getExchangeDataRequest.unknownFields()) && Intrinsics.areEqual(this.symbols, getExchangeDataRequest.symbols) && this.quote_currency_code == getExchangeDataRequest.quote_currency_code;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.symbols);
        CurrencyCode currencyCode = this.quote_currency_code;
        int hashCode = m + (currencyCode != null ? currencyCode.hashCode() : 0);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ExchangeData.Builder builder = new ExchangeData.Builder(1);
        builder.rates = this.symbols;
        builder.base_currency_code = this.quote_currency_code;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.symbols;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("symbols=", arrayList, list);
        }
        CurrencyCode currencyCode = this.quote_currency_code;
        if (currencyCode != null) {
            Matcher$$ExternalSyntheticOutline0.m("quote_currency_code=", currencyCode, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetExchangeDataRequest{", "}", 0, null, null, 56);
    }
}
