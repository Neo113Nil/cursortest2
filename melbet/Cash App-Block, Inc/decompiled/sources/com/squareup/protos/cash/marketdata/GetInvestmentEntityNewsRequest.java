package com.squareup.protos.cash.marketdata;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.money.content.MoneyTab;
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
public final class GetInvestmentEntityNewsRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetInvestmentEntityNewsRequest> CREATOR;
    public final List investment_entity_tokens;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GetInvestmentEntityNewsRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.marketdata.GetInvestmentEntityNewsRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new GetInvestmentEntityNewsRequest(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        m.add(ProtoAdapter.STRING.decode(protoReader));
                    } else {
                        protoReader.readUnknownField(nextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                GetInvestmentEntityNewsRequest getInvestmentEntityNewsRequest = (GetInvestmentEntityNewsRequest) obj;
                reverseProtoWriter.getClass();
                getInvestmentEntityNewsRequest.getClass();
                reverseProtoWriter.writeBytes(getInvestmentEntityNewsRequest.unknownFields());
                ProtoAdapter.STRING.asRepeated().encodeWithTag(reverseProtoWriter, 1, getInvestmentEntityNewsRequest.investment_entity_tokens);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                GetInvestmentEntityNewsRequest getInvestmentEntityNewsRequest = (GetInvestmentEntityNewsRequest) obj;
                getInvestmentEntityNewsRequest.getClass();
                return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, getInvestmentEntityNewsRequest.investment_entity_tokens) + getInvestmentEntityNewsRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                GetInvestmentEntityNewsRequest getInvestmentEntityNewsRequest = (GetInvestmentEntityNewsRequest) obj;
                getInvestmentEntityNewsRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                List list = getInvestmentEntityNewsRequest.investment_entity_tokens;
                list.getClass();
                byteString.getClass();
                return new GetInvestmentEntityNewsRequest(list, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                GetInvestmentEntityNewsRequest getInvestmentEntityNewsRequest = (GetInvestmentEntityNewsRequest) obj;
                getInvestmentEntityNewsRequest.getClass();
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, getInvestmentEntityNewsRequest.investment_entity_tokens);
                protoWriter.writeBytes(getInvestmentEntityNewsRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetInvestmentEntityNewsRequest(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.investment_entity_tokens = TransactorKt.immutableCopyOf("investment_entity_tokens", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetInvestmentEntityNewsRequest)) {
            return false;
        }
        GetInvestmentEntityNewsRequest getInvestmentEntityNewsRequest = (GetInvestmentEntityNewsRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getInvestmentEntityNewsRequest.unknownFields()) && Intrinsics.areEqual(this.investment_entity_tokens, getInvestmentEntityNewsRequest.investment_entity_tokens);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.investment_entity_tokens.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        MoneyTab.Builder builder = new MoneyTab.Builder(15);
        builder.applets = this.investment_entity_tokens;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.investment_entity_tokens;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("investment_entity_tokens=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetInvestmentEntityNewsRequest{", "}", 0, null, null, 56);
    }
}
