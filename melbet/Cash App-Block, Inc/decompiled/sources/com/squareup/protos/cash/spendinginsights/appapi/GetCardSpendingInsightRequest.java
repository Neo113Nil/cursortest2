package com.squareup.protos.cash.spendinginsights.appapi;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.spendinginsights.CardSpendingInsightType;
import com.squareup.protos.cash.ui.SplitButtons;
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
public final class GetCardSpendingInsightRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetCardSpendingInsightRequest> CREATOR;
    public final String context;

    /* renamed from: type, reason: collision with root package name */
    public final CardSpendingInsightType f1338type;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GetCardSpendingInsightRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.spendinginsights.appapi.GetCardSpendingInsightRequest$Companion$ADAPTER$1
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
                        return new GetCardSpendingInsightRequest((CardSpendingInsightType) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        try {
                            obj = CardSpendingInsightType.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                GetCardSpendingInsightRequest getCardSpendingInsightRequest = (GetCardSpendingInsightRequest) obj;
                reverseProtoWriter.getClass();
                getCardSpendingInsightRequest.getClass();
                reverseProtoWriter.writeBytes(getCardSpendingInsightRequest.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, getCardSpendingInsightRequest.context);
                CardSpendingInsightType.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getCardSpendingInsightRequest.f1338type);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                GetCardSpendingInsightRequest getCardSpendingInsightRequest = (GetCardSpendingInsightRequest) obj;
                getCardSpendingInsightRequest.getClass();
                return ProtoAdapter.STRING.encodedSizeWithTag(2, getCardSpendingInsightRequest.context) + CardSpendingInsightType.ADAPTER.encodedSizeWithTag(1, getCardSpendingInsightRequest.f1338type) + getCardSpendingInsightRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                GetCardSpendingInsightRequest getCardSpendingInsightRequest = (GetCardSpendingInsightRequest) obj;
                getCardSpendingInsightRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                CardSpendingInsightType cardSpendingInsightType = getCardSpendingInsightRequest.f1338type;
                String str = getCardSpendingInsightRequest.context;
                byteString.getClass();
                return new GetCardSpendingInsightRequest(cardSpendingInsightType, str, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                GetCardSpendingInsightRequest getCardSpendingInsightRequest = (GetCardSpendingInsightRequest) obj;
                getCardSpendingInsightRequest.getClass();
                CardSpendingInsightType.ADAPTER.encodeWithTag(protoWriter, 1, getCardSpendingInsightRequest.f1338type);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getCardSpendingInsightRequest.context);
                protoWriter.writeBytes(getCardSpendingInsightRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCardSpendingInsightRequest(CardSpendingInsightType cardSpendingInsightType, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.f1338type = cardSpendingInsightType;
        this.context = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetCardSpendingInsightRequest)) {
            return false;
        }
        GetCardSpendingInsightRequest getCardSpendingInsightRequest = (GetCardSpendingInsightRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getCardSpendingInsightRequest.unknownFields()) && this.f1338type == getCardSpendingInsightRequest.f1338type && Intrinsics.areEqual(this.context, getCardSpendingInsightRequest.context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        CardSpendingInsightType cardSpendingInsightType = this.f1338type;
        int hashCode2 = (hashCode + (cardSpendingInsightType != null ? cardSpendingInsightType.hashCode() : 0)) * 37;
        String str = this.context;
        int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SplitButtons.Builder builder = new SplitButtons.Builder(7);
        builder.primary_button = this.f1338type;
        builder.secondary_button = this.context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        CardSpendingInsightType cardSpendingInsightType = this.f1338type;
        if (cardSpendingInsightType != null) {
            arrayList.add("type=" + cardSpendingInsightType);
        }
        String str = this.context;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "context=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetCardSpendingInsightRequest{", "}", 0, null, null, 56);
    }
}
