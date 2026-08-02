package com.squareup.protos.cash.portfolios;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.marketprices.service.GetInvestmentEntityHistoricalDataRequest;
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
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class GetPortfoliosHistoricalDataRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetPortfoliosHistoricalDataRequest> CREATOR;
    public final List comparison_investment_entity_token;
    public final String customer_token;
    public final HistoricalRange historical_range;

    /* loaded from: classes7.dex */
    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public List comparison_investment_entity_token;
        public String customer_token;
        public HistoricalRange historical_range;

        public Builder(int i) {
            this.$r8$classId = i;
            switch (i) {
                case 1:
                    this.comparison_investment_entity_token = EmptyList.INSTANCE;
                    break;
                default:
                    this.comparison_investment_entity_token = EmptyList.INSTANCE;
                    break;
            }
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new GetPortfoliosHistoricalDataRequest(this.historical_range, this.customer_token, this.comparison_investment_entity_token, buildUnknownFields());
                default:
                    return new GetInvestmentEntityHistoricalDataRequest(this.historical_range, this.customer_token, this.comparison_investment_entity_token, buildUnknownFields());
            }
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GetPortfoliosHistoricalDataRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.portfolios.GetPortfoliosHistoricalDataRequest$Companion$ADAPTER$1
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
                        return new GetPortfoliosHistoricalDataRequest((HistoricalRange) obj, (String) obj2, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        try {
                            obj = HistoricalRange.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 20) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        m.add(ProtoAdapter.STRING.decode(protoReader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                GetPortfoliosHistoricalDataRequest getPortfoliosHistoricalDataRequest = (GetPortfoliosHistoricalDataRequest) obj;
                reverseProtoWriter.getClass();
                getPortfoliosHistoricalDataRequest.getClass();
                reverseProtoWriter.writeBytes(getPortfoliosHistoricalDataRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 20, getPortfoliosHistoricalDataRequest.comparison_investment_entity_token);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, getPortfoliosHistoricalDataRequest.customer_token);
                HistoricalRange.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getPortfoliosHistoricalDataRequest.historical_range);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                GetPortfoliosHistoricalDataRequest getPortfoliosHistoricalDataRequest = (GetPortfoliosHistoricalDataRequest) obj;
                getPortfoliosHistoricalDataRequest.getClass();
                int encodedSizeWithTag = HistoricalRange.ADAPTER.encodedSizeWithTag(1, getPortfoliosHistoricalDataRequest.historical_range) + getPortfoliosHistoricalDataRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.asRepeated().encodedSizeWithTag(20, getPortfoliosHistoricalDataRequest.comparison_investment_entity_token) + protoAdapter2.encodedSizeWithTag(2, getPortfoliosHistoricalDataRequest.customer_token) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                GetPortfoliosHistoricalDataRequest getPortfoliosHistoricalDataRequest = (GetPortfoliosHistoricalDataRequest) obj;
                getPortfoliosHistoricalDataRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                HistoricalRange historicalRange = getPortfoliosHistoricalDataRequest.historical_range;
                String str = getPortfoliosHistoricalDataRequest.customer_token;
                List list = getPortfoliosHistoricalDataRequest.comparison_investment_entity_token;
                list.getClass();
                byteString.getClass();
                return new GetPortfoliosHistoricalDataRequest(historicalRange, str, list, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                GetPortfoliosHistoricalDataRequest getPortfoliosHistoricalDataRequest = (GetPortfoliosHistoricalDataRequest) obj;
                getPortfoliosHistoricalDataRequest.getClass();
                HistoricalRange.ADAPTER.encodeWithTag(protoWriter, 1, getPortfoliosHistoricalDataRequest.historical_range);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 2, getPortfoliosHistoricalDataRequest.customer_token);
                protoAdapter2.asRepeated().encodeWithTag(protoWriter, 20, getPortfoliosHistoricalDataRequest.comparison_investment_entity_token);
                protoWriter.writeBytes(getPortfoliosHistoricalDataRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetPortfoliosHistoricalDataRequest(HistoricalRange historicalRange, String str, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.historical_range = historicalRange;
        this.customer_token = str;
        this.comparison_investment_entity_token = TransactorKt.immutableCopyOf("comparison_investment_entity_token", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetPortfoliosHistoricalDataRequest)) {
            return false;
        }
        GetPortfoliosHistoricalDataRequest getPortfoliosHistoricalDataRequest = (GetPortfoliosHistoricalDataRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getPortfoliosHistoricalDataRequest.unknownFields()) && this.historical_range == getPortfoliosHistoricalDataRequest.historical_range && Intrinsics.areEqual(this.customer_token, getPortfoliosHistoricalDataRequest.customer_token) && Intrinsics.areEqual(this.comparison_investment_entity_token, getPortfoliosHistoricalDataRequest.comparison_investment_entity_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        HistoricalRange historicalRange = this.historical_range;
        int hashCode2 = (hashCode + (historicalRange != null ? historicalRange.hashCode() : 0)) * 37;
        String str = this.customer_token;
        int hashCode3 = this.comparison_investment_entity_token.hashCode() + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 37);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.historical_range = this.historical_range;
        builder.customer_token = this.customer_token;
        builder.comparison_investment_entity_token = this.comparison_investment_entity_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        HistoricalRange historicalRange = this.historical_range;
        if (historicalRange != null) {
            arrayList.add("historical_range=" + historicalRange);
        }
        String str = this.customer_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "customer_token=", arrayList);
        }
        List list = this.comparison_investment_entity_token;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("comparison_investment_entity_token=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetPortfoliosHistoricalDataRequest{", "}", 0, null, null, 56);
    }

    public GetPortfoliosHistoricalDataRequest(HistoricalRange historicalRange, String str, int i) {
        this(historicalRange, (i & 2) != 0 ? null : str, EmptyList.INSTANCE, ByteString.EMPTY);
    }
}
