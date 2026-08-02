package com.squareup.protos.cash.portfolios;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Header;
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
public final class GetPortfoliosPerformanceRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetPortfoliosPerformanceRequest> CREATOR;
    public final String customer_token;
    public final String investment_entity_token;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GetPortfoliosPerformanceRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.portfolios.GetPortfoliosPerformanceRequest$Companion$ADAPTER$1
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
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new GetPortfoliosPerformanceRequest((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                GetPortfoliosPerformanceRequest getPortfoliosPerformanceRequest = (GetPortfoliosPerformanceRequest) obj;
                reverseProtoWriter.getClass();
                getPortfoliosPerformanceRequest.getClass();
                reverseProtoWriter.writeBytes(getPortfoliosPerformanceRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, getPortfoliosPerformanceRequest.customer_token);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, getPortfoliosPerformanceRequest.investment_entity_token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                GetPortfoliosPerformanceRequest getPortfoliosPerformanceRequest = (GetPortfoliosPerformanceRequest) obj;
                getPortfoliosPerformanceRequest.getClass();
                int size$okio = getPortfoliosPerformanceRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.encodedSizeWithTag(2, getPortfoliosPerformanceRequest.customer_token) + protoAdapter2.encodedSizeWithTag(1, getPortfoliosPerformanceRequest.investment_entity_token) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                GetPortfoliosPerformanceRequest getPortfoliosPerformanceRequest = (GetPortfoliosPerformanceRequest) obj;
                getPortfoliosPerformanceRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = getPortfoliosPerformanceRequest.investment_entity_token;
                String str2 = getPortfoliosPerformanceRequest.customer_token;
                byteString.getClass();
                return new GetPortfoliosPerformanceRequest(str, str2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                GetPortfoliosPerformanceRequest getPortfoliosPerformanceRequest = (GetPortfoliosPerformanceRequest) obj;
                getPortfoliosPerformanceRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, getPortfoliosPerformanceRequest.investment_entity_token);
                protoAdapter2.encodeWithTag(protoWriter, 2, getPortfoliosPerformanceRequest.customer_token);
                protoWriter.writeBytes(getPortfoliosPerformanceRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetPortfoliosPerformanceRequest(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.investment_entity_token = str;
        this.customer_token = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetPortfoliosPerformanceRequest)) {
            return false;
        }
        GetPortfoliosPerformanceRequest getPortfoliosPerformanceRequest = (GetPortfoliosPerformanceRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getPortfoliosPerformanceRequest.unknownFields()) && Intrinsics.areEqual(this.investment_entity_token, getPortfoliosPerformanceRequest.investment_entity_token) && Intrinsics.areEqual(this.customer_token, getPortfoliosPerformanceRequest.customer_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.investment_entity_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.customer_token;
        int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Header.Builder builder = new Header.Builder(7);
        builder.name = this.investment_entity_token;
        builder.value = this.customer_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.investment_entity_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "investment_entity_token=", arrayList);
        }
        String str2 = this.customer_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "customer_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetPortfoliosPerformanceRequest{", "}", 0, null, null, 56);
    }

    public /* synthetic */ GetPortfoliosPerformanceRequest(String str, String str2, int i) {
        this((i & 1) != 0 ? null : str, str2, ByteString.EMPTY);
    }
}
