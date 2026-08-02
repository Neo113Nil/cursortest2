package com.squareup.protos.franklin.investing;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.google.android.gms.internal.mlkit_vision_face.zzea;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.moneta.api.v1_0.CashInRequest;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.investing.resources.CustomOrder;
import com.squareup.protos.franklin.investing.resources.OrderSide;
import com.squareup.protos.franklin.investing.resources.OrderType;
import com.squareup.protos.repeatedly.common.RecurringSchedule;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class InitiateInvestmentOrderRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InitiateInvestmentOrderRequest> CREATOR;
    public final CustomOrder custom_order;
    public final String idempotence_token;
    public final String instrument_token;
    public final String investment_entity_token;
    public final String investment_incentive_token;
    public final OrderType order_type;
    public final RecurringSchedule recurring_schedule;
    public final RequestContext request_context;
    public final zzea request_value;
    public final OrderSide side;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(InitiateInvestmentOrderRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.investing.InitiateInvestmentOrderRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                Object obj;
                Object obj2;
                Object obj3;
                Object obj4;
                zzea initiateInvestmentOrderRequest$RequestValue$Units;
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                Object obj5 = null;
                Object obj6 = null;
                Object obj7 = null;
                Object obj8 = null;
                Object obj9 = null;
                Object obj10 = null;
                Object obj11 = null;
                Object obj12 = null;
                Object obj13 = null;
                zzea zzeaVar = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new InitiateInvestmentOrderRequest((RequestContext) obj5, (String) obj6, (String) obj7, (String) obj8, zzeaVar, (OrderType) obj9, (OrderSide) obj10, (RecurringSchedule) obj11, (CustomOrder) obj12, (String) obj13, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj5 = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj5);
                            break;
                        case 2:
                            obj6 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            obj7 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            obj8 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            obj4 = obj6;
                            initiateInvestmentOrderRequest$RequestValue$Units = new InitiateInvestmentOrderRequest$RequestValue$Units((String) ProtoAdapter.STRING.decode(protoReader));
                            obj6 = obj4;
                            zzeaVar = initiateInvestmentOrderRequest$RequestValue$Units;
                            break;
                        case 6:
                            obj4 = obj6;
                            initiateInvestmentOrderRequest$RequestValue$Units = new InitiateInvestmentOrderRequest$RequestValue$Amount((Money) Money.ADAPTER.decode(protoReader));
                            obj6 = obj4;
                            zzeaVar = initiateInvestmentOrderRequest$RequestValue$Units;
                            break;
                        case 7:
                            obj = obj6;
                            obj2 = obj7;
                            try {
                                obj6 = obj;
                                obj9 = OrderType.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                obj3 = obj8;
                                protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                            obj7 = obj2;
                            break;
                        case 8:
                            try {
                                obj10 = OrderSide.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                obj = obj6;
                                obj2 = obj7;
                                protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                break;
                            }
                        case 9:
                            obj11 = TransactorKt.decodeMessageOrMerge(RecurringSchedule.ADAPTER, protoReader, obj11);
                            break;
                        case 10:
                            obj12 = TransactorKt.decodeMessageOrMerge(CustomOrder.ADAPTER, protoReader, obj12);
                            break;
                        case 11:
                            obj13 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.readUnknownField(nextTag);
                            obj = obj6;
                            obj2 = obj7;
                            obj3 = obj8;
                            obj6 = obj;
                            obj8 = obj3;
                            obj7 = obj2;
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                InitiateInvestmentOrderRequest initiateInvestmentOrderRequest = (InitiateInvestmentOrderRequest) obj;
                reverseProtoWriter.getClass();
                initiateInvestmentOrderRequest.getClass();
                reverseProtoWriter.writeBytes(initiateInvestmentOrderRequest.unknownFields());
                zzea zzeaVar = initiateInvestmentOrderRequest.request_value;
                if (zzeaVar instanceof InitiateInvestmentOrderRequest$RequestValue$Units) {
                    ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 5, ((InitiateInvestmentOrderRequest$RequestValue$Units) zzeaVar).value);
                } else if (zzeaVar instanceof InitiateInvestmentOrderRequest$RequestValue$Amount) {
                    Money.ADAPTER.encodeWithTag(reverseProtoWriter, 6, ((InitiateInvestmentOrderRequest$RequestValue$Amount) zzeaVar).value);
                } else if (zzeaVar != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 11, initiateInvestmentOrderRequest.investment_incentive_token);
                CustomOrder.ADAPTER.encodeWithTag(reverseProtoWriter, 10, initiateInvestmentOrderRequest.custom_order);
                RecurringSchedule.ADAPTER.encodeWithTag(reverseProtoWriter, 9, initiateInvestmentOrderRequest.recurring_schedule);
                OrderSide.ADAPTER.encodeWithTag(reverseProtoWriter, 8, initiateInvestmentOrderRequest.side);
                OrderType.ADAPTER.encodeWithTag(reverseProtoWriter, 7, initiateInvestmentOrderRequest.order_type);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 4, initiateInvestmentOrderRequest.idempotence_token);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 3, initiateInvestmentOrderRequest.instrument_token);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, initiateInvestmentOrderRequest.investment_entity_token);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, initiateInvestmentOrderRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                int encodedSizeWithTag;
                InitiateInvestmentOrderRequest initiateInvestmentOrderRequest = (InitiateInvestmentOrderRequest) obj;
                initiateInvestmentOrderRequest.getClass();
                int encodedSizeWithTag2 = RequestContext.ADAPTER.encodedSizeWithTag(1, initiateInvestmentOrderRequest.request_context) + initiateInvestmentOrderRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                int encodedSizeWithTag3 = protoAdapter2.encodedSizeWithTag(4, initiateInvestmentOrderRequest.idempotence_token) + protoAdapter2.encodedSizeWithTag(3, initiateInvestmentOrderRequest.instrument_token) + protoAdapter2.encodedSizeWithTag(2, initiateInvestmentOrderRequest.investment_entity_token) + encodedSizeWithTag2;
                zzea zzeaVar = initiateInvestmentOrderRequest.request_value;
                if (zzeaVar instanceof InitiateInvestmentOrderRequest$RequestValue$Units) {
                    encodedSizeWithTag = protoAdapter2.encodedSizeWithTag(5, ((InitiateInvestmentOrderRequest$RequestValue$Units) zzeaVar).value);
                } else {
                    if (!(zzeaVar instanceof InitiateInvestmentOrderRequest$RequestValue$Amount)) {
                        if (zzeaVar != null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return 0;
                        }
                        return protoAdapter2.encodedSizeWithTag(11, initiateInvestmentOrderRequest.investment_incentive_token) + CustomOrder.ADAPTER.encodedSizeWithTag(10, initiateInvestmentOrderRequest.custom_order) + RecurringSchedule.ADAPTER.encodedSizeWithTag(9, initiateInvestmentOrderRequest.recurring_schedule) + OrderSide.ADAPTER.encodedSizeWithTag(8, initiateInvestmentOrderRequest.side) + OrderType.ADAPTER.encodedSizeWithTag(7, initiateInvestmentOrderRequest.order_type) + encodedSizeWithTag3;
                    }
                    encodedSizeWithTag = Money.ADAPTER.encodedSizeWithTag(6, ((InitiateInvestmentOrderRequest$RequestValue$Amount) zzeaVar).value);
                }
                encodedSizeWithTag3 += encodedSizeWithTag;
                return protoAdapter2.encodedSizeWithTag(11, initiateInvestmentOrderRequest.investment_incentive_token) + CustomOrder.ADAPTER.encodedSizeWithTag(10, initiateInvestmentOrderRequest.custom_order) + RecurringSchedule.ADAPTER.encodedSizeWithTag(9, initiateInvestmentOrderRequest.recurring_schedule) + OrderSide.ADAPTER.encodedSizeWithTag(8, initiateInvestmentOrderRequest.side) + OrderType.ADAPTER.encodedSizeWithTag(7, initiateInvestmentOrderRequest.order_type) + encodedSizeWithTag3;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                InitiateInvestmentOrderRequest initiateInvestmentOrderRequest = (InitiateInvestmentOrderRequest) obj;
                initiateInvestmentOrderRequest.getClass();
                RequestContext requestContext = initiateInvestmentOrderRequest.request_context;
                RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
                RecurringSchedule recurringSchedule = initiateInvestmentOrderRequest.recurring_schedule;
                RecurringSchedule recurringSchedule2 = recurringSchedule != null ? (RecurringSchedule) RecurringSchedule.ADAPTER.redact(recurringSchedule) : null;
                CustomOrder customOrder = initiateInvestmentOrderRequest.custom_order;
                return InitiateInvestmentOrderRequest.copy$default(initiateInvestmentOrderRequest, requestContext2, recurringSchedule2, customOrder != null ? (CustomOrder) CustomOrder.ADAPTER.redact(customOrder) : null, ByteString.EMPTY, 638);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                InitiateInvestmentOrderRequest initiateInvestmentOrderRequest = (InitiateInvestmentOrderRequest) obj;
                initiateInvestmentOrderRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, initiateInvestmentOrderRequest.request_context);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 2, initiateInvestmentOrderRequest.investment_entity_token);
                protoAdapter2.encodeWithTag(protoWriter, 3, initiateInvestmentOrderRequest.instrument_token);
                protoAdapter2.encodeWithTag(protoWriter, 4, initiateInvestmentOrderRequest.idempotence_token);
                OrderType.ADAPTER.encodeWithTag(protoWriter, 7, initiateInvestmentOrderRequest.order_type);
                OrderSide.ADAPTER.encodeWithTag(protoWriter, 8, initiateInvestmentOrderRequest.side);
                RecurringSchedule.ADAPTER.encodeWithTag(protoWriter, 9, initiateInvestmentOrderRequest.recurring_schedule);
                CustomOrder.ADAPTER.encodeWithTag(protoWriter, 10, initiateInvestmentOrderRequest.custom_order);
                protoAdapter2.encodeWithTag(protoWriter, 11, initiateInvestmentOrderRequest.investment_incentive_token);
                zzea zzeaVar = initiateInvestmentOrderRequest.request_value;
                if (zzeaVar instanceof InitiateInvestmentOrderRequest$RequestValue$Units) {
                    protoAdapter2.encodeWithTag(protoWriter, 5, ((InitiateInvestmentOrderRequest$RequestValue$Units) zzeaVar).value);
                } else if (zzeaVar instanceof InitiateInvestmentOrderRequest$RequestValue$Amount) {
                    Money.ADAPTER.encodeWithTag(protoWriter, 6, ((InitiateInvestmentOrderRequest$RequestValue$Amount) zzeaVar).value);
                } else if (zzeaVar != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                protoWriter.writeBytes(initiateInvestmentOrderRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    public /* synthetic */ InitiateInvestmentOrderRequest(RequestContext requestContext, String str, String str2, String str3, zzea zzeaVar, OrderType orderType, OrderSide orderSide, RecurringSchedule recurringSchedule, CustomOrder customOrder, int i) {
        this(requestContext, str, str2, str3, zzeaVar, orderType, orderSide, recurringSchedule, (i & 256) != 0 ? null : customOrder, null, ByteString.EMPTY);
    }

    public static InitiateInvestmentOrderRequest copy$default(InitiateInvestmentOrderRequest initiateInvestmentOrderRequest, RequestContext requestContext, RecurringSchedule recurringSchedule, CustomOrder customOrder, ByteString byteString, int i) {
        String str = initiateInvestmentOrderRequest.investment_entity_token;
        String str2 = initiateInvestmentOrderRequest.instrument_token;
        String str3 = initiateInvestmentOrderRequest.idempotence_token;
        zzea zzeaVar = initiateInvestmentOrderRequest.request_value;
        OrderType orderType = initiateInvestmentOrderRequest.order_type;
        OrderSide orderSide = initiateInvestmentOrderRequest.side;
        if ((i & 128) != 0) {
            recurringSchedule = initiateInvestmentOrderRequest.recurring_schedule;
        }
        RecurringSchedule recurringSchedule2 = recurringSchedule;
        if ((i & 256) != 0) {
            customOrder = initiateInvestmentOrderRequest.custom_order;
        }
        CustomOrder customOrder2 = customOrder;
        String str4 = initiateInvestmentOrderRequest.investment_incentive_token;
        ByteString unknownFields = (i & 1024) != 0 ? initiateInvestmentOrderRequest.unknownFields() : byteString;
        initiateInvestmentOrderRequest.getClass();
        unknownFields.getClass();
        return new InitiateInvestmentOrderRequest(requestContext, str, str2, str3, zzeaVar, orderType, orderSide, recurringSchedule2, customOrder2, str4, unknownFields);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InitiateInvestmentOrderRequest)) {
            return false;
        }
        InitiateInvestmentOrderRequest initiateInvestmentOrderRequest = (InitiateInvestmentOrderRequest) obj;
        return Intrinsics.areEqual(unknownFields(), initiateInvestmentOrderRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, initiateInvestmentOrderRequest.request_context) && Intrinsics.areEqual(this.investment_entity_token, initiateInvestmentOrderRequest.investment_entity_token) && Intrinsics.areEqual(this.instrument_token, initiateInvestmentOrderRequest.instrument_token) && Intrinsics.areEqual(this.idempotence_token, initiateInvestmentOrderRequest.idempotence_token) && Intrinsics.areEqual(this.request_value, initiateInvestmentOrderRequest.request_value) && this.order_type == initiateInvestmentOrderRequest.order_type && this.side == initiateInvestmentOrderRequest.side && Intrinsics.areEqual(this.recurring_schedule, initiateInvestmentOrderRequest.recurring_schedule) && Intrinsics.areEqual(this.custom_order, initiateInvestmentOrderRequest.custom_order) && Intrinsics.areEqual(this.investment_incentive_token, initiateInvestmentOrderRequest.investment_incentive_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        String str = this.investment_entity_token;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.instrument_token;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.idempotence_token;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        zzea zzeaVar = this.request_value;
        int hashCode6 = (hashCode5 + (zzeaVar != null ? zzeaVar.hashCode() : 0)) * 37;
        OrderType orderType = this.order_type;
        int hashCode7 = (hashCode6 + (orderType != null ? orderType.hashCode() : 0)) * 37;
        OrderSide orderSide = this.side;
        int hashCode8 = (hashCode7 + (orderSide != null ? orderSide.hashCode() : 0)) * 37;
        RecurringSchedule recurringSchedule = this.recurring_schedule;
        int hashCode9 = (hashCode8 + (recurringSchedule != null ? recurringSchedule.hashCode() : 0)) * 37;
        CustomOrder customOrder = this.custom_order;
        int hashCode10 = (hashCode9 + (customOrder != null ? customOrder.hashCode() : 0)) * 37;
        String str4 = this.investment_incentive_token;
        int hashCode11 = hashCode10 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = hashCode11;
        return hashCode11;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        CashInRequest.Builder builder = new CashInRequest.Builder(21);
        builder.request_context = this.request_context;
        builder.external_id = this.investment_entity_token;
        builder.passcode_token = this.instrument_token;
        builder.external_client_transfer_token = this.idempotence_token;
        builder.source = this.request_value;
        builder.target = this.order_type;
        builder.amount = this.side;
        builder.call_context = this.recurring_schedule;
        builder.forwarded_call_context = this.custom_order;
        builder.client_verified_digital_wallet = this.investment_incentive_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        String str = this.investment_entity_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "investment_entity_token=", arrayList);
        }
        String str2 = this.instrument_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "instrument_token=", arrayList);
        }
        String str3 = this.idempotence_token;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "idempotence_token=", arrayList);
        }
        zzea zzeaVar = this.request_value;
        if (zzeaVar != null) {
            arrayList.add("request_value=" + zzeaVar);
        }
        OrderType orderType = this.order_type;
        if (orderType != null) {
            arrayList.add("order_type=" + orderType);
        }
        OrderSide orderSide = this.side;
        if (orderSide != null) {
            arrayList.add("side=" + orderSide);
        }
        RecurringSchedule recurringSchedule = this.recurring_schedule;
        if (recurringSchedule != null) {
            arrayList.add("recurring_schedule=" + recurringSchedule);
        }
        CustomOrder customOrder = this.custom_order;
        if (customOrder != null) {
            arrayList.add("custom_order=" + customOrder);
        }
        String str4 = this.investment_incentive_token;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "investment_incentive_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InitiateInvestmentOrderRequest{", "}", 0, null, null, 56);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitiateInvestmentOrderRequest(RequestContext requestContext, String str, String str2, String str3, zzea zzeaVar, OrderType orderType, OrderSide orderSide, RecurringSchedule recurringSchedule, CustomOrder customOrder, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.investment_entity_token = str;
        this.instrument_token = str2;
        this.idempotence_token = str3;
        this.request_value = zzeaVar;
        this.order_type = orderType;
        this.side = orderSide;
        this.recurring_schedule = recurringSchedule;
        this.custom_order = customOrder;
        this.investment_incentive_token = str4;
    }
}
