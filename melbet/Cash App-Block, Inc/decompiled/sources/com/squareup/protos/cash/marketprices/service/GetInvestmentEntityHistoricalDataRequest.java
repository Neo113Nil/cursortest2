package com.squareup.protos.cash.marketprices.service;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.portfolios.GetPortfoliosHistoricalDataRequest;
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
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class GetInvestmentEntityHistoricalDataRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetInvestmentEntityHistoricalDataRequest> CREATOR;
    public final List comparison_investment_entity_token;
    public final HistoricalRange historical_range;
    public final String investment_entity_token;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GetInvestmentEntityHistoricalDataRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.marketprices.service.GetInvestmentEntityHistoricalDataRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new GetInvestmentEntityHistoricalDataRequest((HistoricalRange) obj2, (String) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        try {
                            obj2 = HistoricalRange.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (nextTag != 30) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        m.add(ProtoAdapter.STRING.decode(protoReader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                GetInvestmentEntityHistoricalDataRequest getInvestmentEntityHistoricalDataRequest = (GetInvestmentEntityHistoricalDataRequest) obj;
                reverseProtoWriter.getClass();
                getInvestmentEntityHistoricalDataRequest.getClass();
                reverseProtoWriter.writeBytes(getInvestmentEntityHistoricalDataRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 30, getInvestmentEntityHistoricalDataRequest.comparison_investment_entity_token);
                HistoricalRange.ADAPTER.encodeWithTag(reverseProtoWriter, 2, getInvestmentEntityHistoricalDataRequest.historical_range);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, getInvestmentEntityHistoricalDataRequest.investment_entity_token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                GetInvestmentEntityHistoricalDataRequest getInvestmentEntityHistoricalDataRequest = (GetInvestmentEntityHistoricalDataRequest) obj;
                getInvestmentEntityHistoricalDataRequest.getClass();
                int size$okio = getInvestmentEntityHistoricalDataRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.asRepeated().encodedSizeWithTag(30, getInvestmentEntityHistoricalDataRequest.comparison_investment_entity_token) + HistoricalRange.ADAPTER.encodedSizeWithTag(2, getInvestmentEntityHistoricalDataRequest.historical_range) + protoAdapter2.encodedSizeWithTag(1, getInvestmentEntityHistoricalDataRequest.investment_entity_token) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                GetInvestmentEntityHistoricalDataRequest getInvestmentEntityHistoricalDataRequest = (GetInvestmentEntityHistoricalDataRequest) obj;
                getInvestmentEntityHistoricalDataRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = getInvestmentEntityHistoricalDataRequest.investment_entity_token;
                HistoricalRange historicalRange = getInvestmentEntityHistoricalDataRequest.historical_range;
                List list = getInvestmentEntityHistoricalDataRequest.comparison_investment_entity_token;
                list.getClass();
                byteString.getClass();
                return new GetInvestmentEntityHistoricalDataRequest(historicalRange, str, list, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                GetInvestmentEntityHistoricalDataRequest getInvestmentEntityHistoricalDataRequest = (GetInvestmentEntityHistoricalDataRequest) obj;
                getInvestmentEntityHistoricalDataRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, getInvestmentEntityHistoricalDataRequest.investment_entity_token);
                HistoricalRange.ADAPTER.encodeWithTag(protoWriter, 2, getInvestmentEntityHistoricalDataRequest.historical_range);
                protoAdapter2.asRepeated().encodeWithTag(protoWriter, 30, getInvestmentEntityHistoricalDataRequest.comparison_investment_entity_token);
                protoWriter.writeBytes(getInvestmentEntityHistoricalDataRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetInvestmentEntityHistoricalDataRequest(HistoricalRange historicalRange, String str, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.investment_entity_token = str;
        this.historical_range = historicalRange;
        this.comparison_investment_entity_token = TransactorKt.immutableCopyOf("comparison_investment_entity_token", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetInvestmentEntityHistoricalDataRequest)) {
            return false;
        }
        GetInvestmentEntityHistoricalDataRequest getInvestmentEntityHistoricalDataRequest = (GetInvestmentEntityHistoricalDataRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getInvestmentEntityHistoricalDataRequest.unknownFields()) && Intrinsics.areEqual(this.investment_entity_token, getInvestmentEntityHistoricalDataRequest.investment_entity_token) && this.historical_range == getInvestmentEntityHistoricalDataRequest.historical_range && Intrinsics.areEqual(this.comparison_investment_entity_token, getInvestmentEntityHistoricalDataRequest.comparison_investment_entity_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.investment_entity_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        HistoricalRange historicalRange = this.historical_range;
        int hashCode3 = this.comparison_investment_entity_token.hashCode() + ((hashCode2 + (historicalRange != null ? historicalRange.hashCode() : 0)) * 37);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GetPortfoliosHistoricalDataRequest.Builder builder = new GetPortfoliosHistoricalDataRequest.Builder(1);
        builder.customer_token = this.investment_entity_token;
        builder.historical_range = this.historical_range;
        builder.comparison_investment_entity_token = this.comparison_investment_entity_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.investment_entity_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "investment_entity_token=", arrayList);
        }
        HistoricalRange historicalRange = this.historical_range;
        if (historicalRange != null) {
            arrayList.add("historical_range=" + historicalRange);
        }
        List list = this.comparison_investment_entity_token;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("comparison_investment_entity_token=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetInvestmentEntityHistoricalDataRequest{", "}", 0, null, null, 56);
    }
}
