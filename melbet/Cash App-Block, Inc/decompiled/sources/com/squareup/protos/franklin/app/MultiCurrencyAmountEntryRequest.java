package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.MultiCurrencyAmountEntryBlocker;
import com.squareup.protos.franklin.common.RequestContext;
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
public final class MultiCurrencyAmountEntryRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<MultiCurrencyAmountEntryRequest> CREATOR;
    public final String action_id;
    public final String cost_tier_identifier;
    public final List displayed_fees;
    public final MultiCurrencyAmountEntryBlocker.FocusedCurrencyField focused_field;
    public final String instrument_token;
    public final String note_value;
    public final Money receiver_amount;
    public final RequestContext request_context;
    public final Money sender_amount;

    /* loaded from: classes8.dex */
    public final class Builder extends Message.Builder {
        public String action_id;
        public String cost_tier_identifier;
        public List displayed_fees = EmptyList.INSTANCE;
        public MultiCurrencyAmountEntryBlocker.FocusedCurrencyField focused_field;
        public String instrument_token;
        public String note_value;
        public Money receiver_amount;
        public RequestContext request_context;
        public Money sender_amount;

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            return new MultiCurrencyAmountEntryRequest(this.request_context, this.sender_amount, this.receiver_amount, this.focused_field, this.cost_tier_identifier, this.displayed_fees, this.action_id, this.note_value, this.instrument_token, buildUnknownFields());
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(MultiCurrencyAmountEntryRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.app.MultiCurrencyAmountEntryRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                Object obj;
                Object obj2;
                ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
                long beginMessage = protoReader.beginMessage();
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                Object obj6 = null;
                Object obj7 = null;
                Object obj8 = null;
                Object obj9 = null;
                Object obj10 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new MultiCurrencyAmountEntryRequest((RequestContext) obj3, (Money) obj4, (Money) obj5, (MultiCurrencyAmountEntryBlocker.FocusedCurrencyField) obj6, (String) obj7, m, (String) obj8, (String) obj9, (String) obj10, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj3 = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj3);
                            break;
                        case 2:
                            obj4 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj4);
                            break;
                        case 3:
                            obj5 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj5);
                            break;
                        case 4:
                            try {
                                obj6 = MultiCurrencyAmountEntryBlocker.FocusedCurrencyField.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                obj = obj6;
                                obj2 = obj7;
                                protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 5:
                            obj7 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            m.add(MultiCurrencyAmountEntryBlocker.CostTier.Fee.ADAPTER.decode(protoReader));
                            obj = obj6;
                            obj2 = obj7;
                            obj7 = obj2;
                            obj6 = obj;
                            break;
                        case 7:
                            obj8 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            obj9 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 9:
                            obj10 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.readUnknownField(nextTag);
                            obj = obj6;
                            obj2 = obj7;
                            obj7 = obj2;
                            obj6 = obj;
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                MultiCurrencyAmountEntryRequest multiCurrencyAmountEntryRequest = (MultiCurrencyAmountEntryRequest) obj;
                reverseProtoWriter.getClass();
                multiCurrencyAmountEntryRequest.getClass();
                reverseProtoWriter.writeBytes(multiCurrencyAmountEntryRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 9, multiCurrencyAmountEntryRequest.instrument_token);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 8, multiCurrencyAmountEntryRequest.note_value);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 7, multiCurrencyAmountEntryRequest.action_id);
                MultiCurrencyAmountEntryBlocker.CostTier.Fee.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 6, multiCurrencyAmountEntryRequest.displayed_fees);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 5, multiCurrencyAmountEntryRequest.cost_tier_identifier);
                MultiCurrencyAmountEntryBlocker.FocusedCurrencyField.ADAPTER.encodeWithTag(reverseProtoWriter, 4, multiCurrencyAmountEntryRequest.focused_field);
                ProtoAdapter protoAdapter3 = Money.ADAPTER;
                protoAdapter3.encodeWithTag(reverseProtoWriter, 3, multiCurrencyAmountEntryRequest.receiver_amount);
                protoAdapter3.encodeWithTag(reverseProtoWriter, 2, multiCurrencyAmountEntryRequest.sender_amount);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, multiCurrencyAmountEntryRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                MultiCurrencyAmountEntryRequest multiCurrencyAmountEntryRequest = (MultiCurrencyAmountEntryRequest) obj;
                multiCurrencyAmountEntryRequest.getClass();
                int encodedSizeWithTag = RequestContext.ADAPTER.encodedSizeWithTag(1, multiCurrencyAmountEntryRequest.request_context) + multiCurrencyAmountEntryRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = Money.ADAPTER;
                int encodedSizeWithTag2 = MultiCurrencyAmountEntryBlocker.FocusedCurrencyField.ADAPTER.encodedSizeWithTag(4, multiCurrencyAmountEntryRequest.focused_field) + protoAdapter2.encodedSizeWithTag(3, multiCurrencyAmountEntryRequest.receiver_amount) + protoAdapter2.encodedSizeWithTag(2, multiCurrencyAmountEntryRequest.sender_amount) + encodedSizeWithTag;
                ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
                return protoAdapter3.encodedSizeWithTag(9, multiCurrencyAmountEntryRequest.instrument_token) + protoAdapter3.encodedSizeWithTag(8, multiCurrencyAmountEntryRequest.note_value) + protoAdapter3.encodedSizeWithTag(7, multiCurrencyAmountEntryRequest.action_id) + MultiCurrencyAmountEntryBlocker.CostTier.Fee.ADAPTER.asRepeated().encodedSizeWithTag(6, multiCurrencyAmountEntryRequest.displayed_fees) + protoAdapter3.encodedSizeWithTag(5, multiCurrencyAmountEntryRequest.cost_tier_identifier) + encodedSizeWithTag2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                MultiCurrencyAmountEntryRequest multiCurrencyAmountEntryRequest = (MultiCurrencyAmountEntryRequest) obj;
                multiCurrencyAmountEntryRequest.getClass();
                RequestContext requestContext = multiCurrencyAmountEntryRequest.request_context;
                RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
                Money money = multiCurrencyAmountEntryRequest.sender_amount;
                Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
                Money money3 = multiCurrencyAmountEntryRequest.receiver_amount;
                Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(multiCurrencyAmountEntryRequest.displayed_fees, MultiCurrencyAmountEntryBlocker.CostTier.Fee.ADAPTER);
                ByteString byteString = ByteString.EMPTY;
                MultiCurrencyAmountEntryBlocker.FocusedCurrencyField focusedCurrencyField = multiCurrencyAmountEntryRequest.focused_field;
                String str = multiCurrencyAmountEntryRequest.cost_tier_identifier;
                String str2 = multiCurrencyAmountEntryRequest.action_id;
                String str3 = multiCurrencyAmountEntryRequest.note_value;
                String str4 = multiCurrencyAmountEntryRequest.instrument_token;
                byteString.getClass();
                return new MultiCurrencyAmountEntryRequest(requestContext2, money2, money4, focusedCurrencyField, str, m1169redactElements, str2, str3, str4, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                MultiCurrencyAmountEntryRequest multiCurrencyAmountEntryRequest = (MultiCurrencyAmountEntryRequest) obj;
                multiCurrencyAmountEntryRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, multiCurrencyAmountEntryRequest.request_context);
                ProtoAdapter protoAdapter2 = Money.ADAPTER;
                protoAdapter2.encodeWithTag(protoWriter, 2, multiCurrencyAmountEntryRequest.sender_amount);
                protoAdapter2.encodeWithTag(protoWriter, 3, multiCurrencyAmountEntryRequest.receiver_amount);
                MultiCurrencyAmountEntryBlocker.FocusedCurrencyField.ADAPTER.encodeWithTag(protoWriter, 4, multiCurrencyAmountEntryRequest.focused_field);
                ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
                protoAdapter3.encodeWithTag(protoWriter, 5, multiCurrencyAmountEntryRequest.cost_tier_identifier);
                MultiCurrencyAmountEntryBlocker.CostTier.Fee.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, multiCurrencyAmountEntryRequest.displayed_fees);
                protoAdapter3.encodeWithTag(protoWriter, 7, multiCurrencyAmountEntryRequest.action_id);
                protoAdapter3.encodeWithTag(protoWriter, 8, multiCurrencyAmountEntryRequest.note_value);
                protoAdapter3.encodeWithTag(protoWriter, 9, multiCurrencyAmountEntryRequest.instrument_token);
                protoWriter.writeBytes(multiCurrencyAmountEntryRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiCurrencyAmountEntryRequest(RequestContext requestContext, Money money, Money money2, MultiCurrencyAmountEntryBlocker.FocusedCurrencyField focusedCurrencyField, String str, List list, String str2, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.request_context = requestContext;
        this.sender_amount = money;
        this.receiver_amount = money2;
        this.focused_field = focusedCurrencyField;
        this.cost_tier_identifier = str;
        this.action_id = str2;
        this.note_value = str3;
        this.instrument_token = str4;
        this.displayed_fees = TransactorKt.immutableCopyOf("displayed_fees", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MultiCurrencyAmountEntryRequest)) {
            return false;
        }
        MultiCurrencyAmountEntryRequest multiCurrencyAmountEntryRequest = (MultiCurrencyAmountEntryRequest) obj;
        return Intrinsics.areEqual(unknownFields(), multiCurrencyAmountEntryRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, multiCurrencyAmountEntryRequest.request_context) && Intrinsics.areEqual(this.sender_amount, multiCurrencyAmountEntryRequest.sender_amount) && Intrinsics.areEqual(this.receiver_amount, multiCurrencyAmountEntryRequest.receiver_amount) && this.focused_field == multiCurrencyAmountEntryRequest.focused_field && Intrinsics.areEqual(this.cost_tier_identifier, multiCurrencyAmountEntryRequest.cost_tier_identifier) && Intrinsics.areEqual(this.displayed_fees, multiCurrencyAmountEntryRequest.displayed_fees) && Intrinsics.areEqual(this.action_id, multiCurrencyAmountEntryRequest.action_id) && Intrinsics.areEqual(this.note_value, multiCurrencyAmountEntryRequest.note_value) && Intrinsics.areEqual(this.instrument_token, multiCurrencyAmountEntryRequest.instrument_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        Money money = this.sender_amount;
        int hashCode3 = (hashCode2 + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.receiver_amount;
        int hashCode4 = (hashCode3 + (money2 != null ? money2.hashCode() : 0)) * 37;
        MultiCurrencyAmountEntryBlocker.FocusedCurrencyField focusedCurrencyField = this.focused_field;
        int hashCode5 = (hashCode4 + (focusedCurrencyField != null ? focusedCurrencyField.hashCode() : 0)) * 37;
        String str = this.cost_tier_identifier;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode5 + (str != null ? str.hashCode() : 0)) * 37, 37, this.displayed_fees);
        String str2 = this.action_id;
        int hashCode6 = (m + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.note_value;
        int hashCode7 = (hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.instrument_token;
        int hashCode8 = hashCode7 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.request_context = this.request_context;
        builder.sender_amount = this.sender_amount;
        builder.receiver_amount = this.receiver_amount;
        builder.focused_field = this.focused_field;
        builder.cost_tier_identifier = this.cost_tier_identifier;
        builder.displayed_fees = this.displayed_fees;
        builder.action_id = this.action_id;
        builder.note_value = this.note_value;
        builder.instrument_token = this.instrument_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        Money money = this.sender_amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("sender_amount=", money, arrayList);
        }
        Money money2 = this.receiver_amount;
        if (money2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("receiver_amount=", money2, arrayList);
        }
        MultiCurrencyAmountEntryBlocker.FocusedCurrencyField focusedCurrencyField = this.focused_field;
        if (focusedCurrencyField != null) {
            arrayList.add("focused_field=" + focusedCurrencyField);
        }
        String str = this.cost_tier_identifier;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "cost_tier_identifier=", arrayList);
        }
        List list = this.displayed_fees;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("displayed_fees=", arrayList, list);
        }
        String str2 = this.action_id;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "action_id=", arrayList);
        }
        String str3 = this.note_value;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "note_value=", arrayList);
        }
        String str4 = this.instrument_token;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "instrument_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "MultiCurrencyAmountEntryRequest{", "}", 0, null, null, 56);
    }
}
