package com.squareup.protos.cash.marketprices.service;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.ui.UiAppMesssages;
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
public final class GetCurrentPricesRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetCurrentPricesRequest> CREATOR;
    public final Boolean include_price_at_market_open;
    public final List investment_entity_tokens;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GetCurrentPricesRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.marketprices.service.GetCurrentPricesRequest$Companion$ADAPTER$1
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
                        return new GetCurrentPricesRequest((Boolean) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        m.add(ProtoAdapter.STRING.decode(protoReader));
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                GetCurrentPricesRequest getCurrentPricesRequest = (GetCurrentPricesRequest) obj;
                reverseProtoWriter.getClass();
                getCurrentPricesRequest.getClass();
                reverseProtoWriter.writeBytes(getCurrentPricesRequest.unknownFields());
                ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, getCurrentPricesRequest.include_price_at_market_open);
                ProtoAdapter.STRING.asRepeated().encodeWithTag(reverseProtoWriter, 1, getCurrentPricesRequest.investment_entity_tokens);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                GetCurrentPricesRequest getCurrentPricesRequest = (GetCurrentPricesRequest) obj;
                getCurrentPricesRequest.getClass();
                return ProtoAdapter.BOOL.encodedSizeWithTag(2, getCurrentPricesRequest.include_price_at_market_open) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, getCurrentPricesRequest.investment_entity_tokens) + getCurrentPricesRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                GetCurrentPricesRequest getCurrentPricesRequest = (GetCurrentPricesRequest) obj;
                getCurrentPricesRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                List list = getCurrentPricesRequest.investment_entity_tokens;
                Boolean bool = getCurrentPricesRequest.include_price_at_market_open;
                list.getClass();
                byteString.getClass();
                return new GetCurrentPricesRequest(bool, list, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                GetCurrentPricesRequest getCurrentPricesRequest = (GetCurrentPricesRequest) obj;
                getCurrentPricesRequest.getClass();
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, getCurrentPricesRequest.investment_entity_tokens);
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, getCurrentPricesRequest.include_price_at_market_open);
                protoWriter.writeBytes(getCurrentPricesRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCurrentPricesRequest(Boolean bool, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.include_price_at_market_open = bool;
        this.investment_entity_tokens = TransactorKt.immutableCopyOf("investment_entity_tokens", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetCurrentPricesRequest)) {
            return false;
        }
        GetCurrentPricesRequest getCurrentPricesRequest = (GetCurrentPricesRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getCurrentPricesRequest.unknownFields()) && Intrinsics.areEqual(this.investment_entity_tokens, getCurrentPricesRequest.investment_entity_tokens) && Intrinsics.areEqual(this.include_price_at_market_open, getCurrentPricesRequest.include_price_at_market_open);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.investment_entity_tokens);
        Boolean bool = this.include_price_at_market_open;
        int hashCode = m + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiAppMesssages.Builder builder = new UiAppMesssages.Builder(3);
        builder.app_message_tokens = this.investment_entity_tokens;
        builder.app_message_notifications_enabled = this.include_price_at_market_open;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.investment_entity_tokens;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("investment_entity_tokens=", arrayList, list);
        }
        Boolean bool = this.include_price_at_market_open;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("include_price_at_market_open=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetCurrentPricesRequest{", "}", 0, null, null, 56);
    }
}
